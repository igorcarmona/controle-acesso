package org.example.Repositories;

import org.example.Model.PontoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PontoRepository extends JpaRepository<PontoModel,Integer> {

    @Query(value = "SELECT * FROM batimento_ponto where matricula = :matriculas", nativeQuery = true)
    List<PontoModel> getByMatricula(@Param("matriculas") String matricula);
}
