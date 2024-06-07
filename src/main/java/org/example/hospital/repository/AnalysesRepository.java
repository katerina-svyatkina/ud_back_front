package org.example.hospital.repository;


import org.example.hospital.entity.Analyses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnalysesRepository extends JpaRepository<Analyses, Integer> {
}
