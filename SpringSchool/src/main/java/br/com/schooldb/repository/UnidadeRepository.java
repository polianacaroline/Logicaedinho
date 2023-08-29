package br.com.schooldb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.schooldb.domain.Unidade;

@Repository
public interface UnidadeRepository  extends JpaRepository <Unidade, Integer>{

}
