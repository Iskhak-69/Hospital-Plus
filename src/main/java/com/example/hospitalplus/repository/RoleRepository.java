package com.example.hospitalplus.repository;

import com.example.hospitalplus.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    public Role findRoleByName(String name);
}
