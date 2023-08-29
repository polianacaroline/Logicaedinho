package br.com.schooldb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.schooldb.domain.Curso;

@Repository
public interface CursoRepository  extends JpaRepository <Curso, Integer>{

}
