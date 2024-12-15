package com.example.hospitalplus.repository;

import com.example.hospitalplus.entity.Donor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepository extends CrudRepository<Donor, Integer> {
}
