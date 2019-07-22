package com.hurko.service;

import com.hurko.model.SectionEntity;
import com.hurko.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionServiceImpl implements SectionService {

    @Autowired
    private SectionRepository sectionRepository;

    @Override
    public SectionEntity findById(Long id) {
        return sectionRepository.findById(id).orElseThrow(NullPointerException::new);
    }
}
