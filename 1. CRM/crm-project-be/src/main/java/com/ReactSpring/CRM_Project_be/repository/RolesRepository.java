package com.ReactSpring.CRM_Project_be.repository;

import com.ReactSpring.CRM_Project_be.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Role, Integer> {
}
