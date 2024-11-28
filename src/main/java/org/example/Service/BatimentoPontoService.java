package org.example.Service;

import org.example.Model.PontoModel;
import org.example.Repositories.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BatimentoPontoService {

    @Autowired
    private PontoRepository pontoRepository;

    public void baterPonto(PontoModel baterPontoService) {
        if (pontoRepository.getByMatricula("1").get(0).getHorario_entrada() != null)
            baterPonto(); pontoRepository.getByMatricula("1").get(0).setHorario_saida()

    }

}
