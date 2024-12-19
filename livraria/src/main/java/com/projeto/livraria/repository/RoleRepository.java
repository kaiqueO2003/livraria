package com.projeto.livraria.repository;

import com.projeto.livraria.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
