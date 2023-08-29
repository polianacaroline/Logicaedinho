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

import br.com.schooldb.domain.Curso;
import br.com.schooldb.repository.CursoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/curso")
public class CursoController {
	@Autowired
	private CursoRepository cursoRepo;

	@GetMapping("/listar")
	public List<Curso> listar() {
		return cursoRepo.findAll();
	}

	@GetMapping("/buscar/{id}")
	public Optional<Curso> buscar(@PathVariable Integer id) {
		return cursoRepo.findById(id);
	}

@PostMapping("/cadastrar")
public Curso cadastrar(@RequestBody Curso curso) {
return cursoRepo.save(curso);
}
}