package com.sistemaemprestimo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sistemaemprestimo.model.Emprestimo;
import com.sistemaemprestimo.repository.EmprestimoRepository;

@Service
public class EmprestimoService {
	  @Autowired
	    private EmprestimoRepository emprestimoRepository;

	    public List<Emprestimo> getAllEmprestimos() {
	        return emprestimoRepository.findAll();
	    }

	    public Emprestimo getEmprestimoById(Long id) {
	        return emprestimoRepository.findById(id).orElse(null);
	    }

	    public Emprestimo saveEmprestimo(Emprestimo emprestimo) {
	        return emprestimoRepository.save(emprestimo);
	    }

	    public void deleteEmprestimo(Long id) {
	        emprestimoRepository.deleteById(id);
	    }

}
