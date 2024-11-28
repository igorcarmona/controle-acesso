package org.example.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;

@Entity
@Data
@Table(schema = "ponto", name = "funcionarios")
public class FuncionarioModel {

    @Id
    private int id;

    private String nome;
    private String sobrenome;
    private LocalDateTime data_nascimento;
    private String cpf;
    private String matricula;
    private String senha;
    private String cargo;
}
