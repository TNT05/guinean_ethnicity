package com.thierno_ibrahima.guinean_ethnicity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thierno_ibrahima.guinean_ethnicity.model.Ethnicity;
import com.thierno_ibrahima.guinean_ethnicity.repository.EthnicityRepository;

@Service
public class EthnicityService {

  @Autowired
  private EthnicityRepository ethnicityRepository;

    public Ethnicity save(Ethnicity ethnicity) {
        return ethnicityRepository.save(ethnicity);
    }
}
