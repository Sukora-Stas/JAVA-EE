package edu.by.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Sukora Stas.
 */
@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Car {
    @Id
    private Long id;
    String model;
    Integer year;
}
