package com.example.hospitalplus.service;

import com.example.hospitalplus.entity.Laboratory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LabService {
    List<Laboratory> getAllLabs();
    Laboratory saveLab(Laboratory laboratory);
    Laboratory getLabById(Integer id);
    Laboratory updateLab(Laboratory laboratory);
    void deleteLabById(Integer id);
}
