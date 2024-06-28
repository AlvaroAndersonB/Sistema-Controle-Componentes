package com.sistemaemprestimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sistemaemprestimo.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {

}
