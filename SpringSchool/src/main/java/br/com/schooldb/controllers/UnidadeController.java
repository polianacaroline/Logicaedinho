package br.com.schooldb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.schooldb.domain.Unidade;
import br.com.schooldb.repository.UnidadeRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/unidade")
public class UnidadeController {
	@Autowired
	private UnidadeRepository unidadeRepo;

	@GetMapping("/listar")
	public List<Unidade> listar() {
		return unidadeRepo.findAll();
	}

	@GetMapping("/buscar/{id}")
	public Optional<Unidade> buscar(@PathVariable Integer id) {
		return unidadeRepo.findById(id);
	}

@PostMapping("/cadastrar")
public Unidade cadastrar(@RequestBody Unidade unidade) {
return unidadeRepo.save(unidade);
}
}