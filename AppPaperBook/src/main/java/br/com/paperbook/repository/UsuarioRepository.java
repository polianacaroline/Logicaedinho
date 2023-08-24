package br.com.paperbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.paperbook.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	
//criar uma estrutura de busca pelo login
	
	
	Usuario findByLogin(String login);
	
	
	
	
	
	
	
}
