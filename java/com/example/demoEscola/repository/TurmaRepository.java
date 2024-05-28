package com.example.demoEscola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoEscola.entities.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
}
