package com.thierno_ibrahima.guinean_ethnicity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thierno_ibrahima.guinean_ethnicity.model.Ethnicity;

@Repository
public interface EthnicityRepository extends JpaRepository<Ethnicity, Integer>  {

}
