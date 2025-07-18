package com.seryozha.model.entity;

import jakarta.persistence.Entity;
import java.util.UUID;

@Entity
public class Calorie {
    UUID id;
    String name;
    Double value;
}
