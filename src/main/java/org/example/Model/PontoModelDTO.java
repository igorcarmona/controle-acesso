package org.example.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(schema = "ponto", name = "batimento_ponto")
public class PontoModelDTO {

    @Id
    private int id;
    private String horario_entrada;
    private String horario_saida;

}
