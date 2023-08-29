package br.com.schooldb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.schooldb.domain.Area;

@Repository
public interface AreaRepository  extends JpaRepository <Area, Integer> {


	
	
}