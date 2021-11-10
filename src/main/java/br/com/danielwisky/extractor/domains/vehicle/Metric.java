package br.com.danielwisky.extractor.domains.vehicle;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Metric implements Serializable {

  private static final long serialVersionUID = -3199398186813832110L;

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  private String type;

  private Double torque;

  private Double power;

  private Double city;

  private Double road;
}