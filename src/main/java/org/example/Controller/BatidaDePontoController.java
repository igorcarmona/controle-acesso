package org.example.Controller;


import org.example.Model.PontoModel;
import org.example.Model.PontoModelDTO;
import org.example.Repositories.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class BatidaDePontoController {

    @Autowired
    private PontoRepository pontoRepository;


    @PostMapping("bater-ponto")
    private PontoModel baterPonto(@RequestBody PontoModel pontoModel) {
        pontoModel.setHorario_entrada(LocalDateTime.now());
        return pontoRepository.save(pontoModel);
    }

    @GetMapping("mostrar-ponto")
    private List<PontoModel> mostrarPonto() {
        return pontoRepository.findAll();
    }


    @GetMapping("mostrar-ponto-matricula")
    private List<PontoModel> mostrarPontoMatricula(@RequestParam String matricula) { //localhost:8080/mostrar-ponto?matricula=102847225
        return pontoRepository.getByMatricula(matricula);
    }

    @PutMapping("editar-ponto")
    private PontoModel editarPonto(@RequestBody PontoModelDTO pontoaoao) { //localhost:8080/mostrar-ponto?matricula=102847225
        PontoModel tempModel = pontoRepository.findById(pontoaoao.getId()).get();
        if(pontoaoao.getHorario_entrada() != null) tempModel.setHorario_entrada(LocalDateTime.parse(pontoaoao.getHorario_entrada()));
        if(pontoaoao.getHorario_saida() != null) tempModel.setHorario_saida(LocalDateTime.parse(pontoaoao.getHorario_saida()));
        return pontoRepository.save(tempModel);
    }

    @DeleteMapping("deletar-ponto")//localhost:8080/deletar-ponto?id=10
    private void deletarPonto(@RequestParam int id){
        pontoRepository.deleteById(id);
    }

}
