package org.example.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(schema = "ponto", name = "batimento_ponto")
public class PontoModel {

    @Id
    private int id;
    private String nome;
    private String sobrenome;
    private String matricula;
    private LocalDateTime horario_entrada;
    private LocalDateTime horario_saida;


}
