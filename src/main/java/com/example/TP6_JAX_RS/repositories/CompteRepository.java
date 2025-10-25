package com.example.TP6_JAX_RS.repositories;

import com.example.TP6_JAX_RS.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
