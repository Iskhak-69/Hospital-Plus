package com.example.hospitalplus.repository;

import com.example.hospitalplus.entity.Laboratory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratoryRepository extends CrudRepository<Laboratory, Integer> {
}
