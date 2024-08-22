package com.ezlearning.platform.repositories;

import com.ezlearning.platform.auth.User;
import com.ezlearning.platform.model.Curso;
import com.ezlearning.platform.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    List<Matricula> findAllByCurso(Curso curso);
    List<Matricula> findAllByUsuario(User user);
    Matricula findByCursoAndUsuario(Curso curso, User user);
}
