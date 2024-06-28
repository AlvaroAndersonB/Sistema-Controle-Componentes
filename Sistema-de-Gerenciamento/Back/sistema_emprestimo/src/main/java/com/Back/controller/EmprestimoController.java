package com.sistemaemprestimo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaemprestimo.model.Emprestimo;
import com.sistemaemprestimo.service.EmprestimoService;

@RestController
@RequestMapping("/api/emprestimos")
@CrossOrigin(origins = "http://127.0.0.1:5500") 
public class EmprestimoController {

	@Autowired //injeção de dependencias automatica
	private EmprestimoService emprestimoService;

	@GetMapping
	public List<Emprestimo> getAllEmprestimos() {
		return emprestimoService.getAllEmprestimos();
	}

	@GetMapping("/{id}")
	public Emprestimo getEmprestimoById(@PathVariable Long id) {
		return emprestimoService.getEmprestimoById(id);
	}

	@PostMapping
	public Emprestimo createEmprestimo(@RequestBody Emprestimo emprestimo) {
		return emprestimoService.saveEmprestimo(emprestimo);
	}

	@DeleteMapping("/{id}")
	public void deleteEmprestimo(@PathVariable Long id) {
		emprestimoService.deleteEmprestimo(id);
	}

}
