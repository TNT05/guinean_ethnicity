package com.thierno_ibrahima.guinean_ethnicity.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Scope("prototype")
@Component
public class Ethnicity {
  @Id
  private int id;
  private String name;
  @Enumerated(EnumType.STRING)
  private Region region;
}
