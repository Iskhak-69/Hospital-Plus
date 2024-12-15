package com.example.hospitalplus.service;

import com.example.hospitalplus.entity.Laboratory;
import com.example.hospitalplus.repository.LaboratoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabServiceImpl implements LabService {

    private LaboratoryRepository laboratoryRepository;

    public LabServiceImpl(LaboratoryRepository laboratoryRepository) {
        this.laboratoryRepository = laboratoryRepository;
    }

    @Override
    public List<Laboratory> getAllLabs() {
        return (List<Laboratory>) laboratoryRepository.findAll();
    }

    @Override
    public Laboratory saveLab(Laboratory laboratory) {
        return laboratoryRepository.save(laboratory);
    }

    @Override
    public Laboratory getLabById(Integer id) {
        return laboratoryRepository.findById(id).get();
    }

    @Override
    public Laboratory updateLab(Laboratory laboratory) {
        return laboratoryRepository.save(laboratory);
    }

    @Override
    public void deleteLabById(Integer id) {
    laboratoryRepository.deleteById(id);
    }
}
