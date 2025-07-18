package com.seryozha.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Calorie {
    @Id
    UUID id;
    String name;
    Double value;
}
