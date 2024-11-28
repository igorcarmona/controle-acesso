package org.example.Controller;

import org.example.Model.FuncionarioModel;
import org.example.Model.LoginModel;
import org.example.Model.PontoModel;
import org.example.Model.PontoModelDTO;
import org.example.Repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;


    @GetMapping("isAdmin")
    private boolean isAdminEndpoint(@RequestParam String matricula){
        return (funcionarioRepository.isAdmin(matricula) == 1) ? true : false;
    }


    @PostMapping("login")
    private FuncionarioModel login(@RequestBody FuncionarioModel login){
        return funcionarioRepository.login(login.getMatricula(), login.getSenha());
    }

    @PostMapping("cadastrar")
    private FuncionarioModel baterPonto(@RequestBody FuncionarioModel funcionarioModel) {
        return funcionarioRepository.save(funcionarioModel);
    }

}

