package com.thierno_ibrahima.guinean_ethnicity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thierno_ibrahima.guinean_ethnicity.model.Ethnicity;
import com.thierno_ibrahima.guinean_ethnicity.service.EthnicityService;


@RestController
@CrossOrigin
@RequestMapping("ethnicity/")
public class EthnicityController {

  @Autowired
  private EthnicityService ethnicityService;

  @PostMapping("add")
  public Ethnicity postMethodName(@RequestBody Ethnicity ethnicity) {
      return ethnicityService.save(ethnicity);
  }
  

}
