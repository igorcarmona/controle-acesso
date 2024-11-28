package org.example.Repositories;


import org.example.Model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Integer> {

    @Query(value = "Select isAdmin from funcionarios where matricula = :matricula", nativeQuery = true)
    int isAdmin(@Param("matricula") String matricula);

    @Query(value = "Select id,nome,sobrenome,data_nascimento, cpf, matricula, senha,cargo, isAdmin from funcionarios where matricula = :matricula1 and senha = :senha1", nativeQuery = true)
    FuncionarioModel login(@Param("matricula1") String matricula, @Param("senha1") String senha);


}
