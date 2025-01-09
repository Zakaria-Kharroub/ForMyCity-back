package com.example.city.repository;

import com.example.city.domain.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation, UUID> {

}
