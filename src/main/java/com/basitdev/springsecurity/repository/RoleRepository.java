package com.basitdev.springsecurity.repository;

import java.util.Optional;

import com.basitdev.springsecurity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
    Boolean existsByName(String name);
}
