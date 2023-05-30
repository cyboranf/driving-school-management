package com.example.drivingschoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehicleId;

    private String make;

    private String model;

    private String year;

    private String licensePlate;

    private String color;

    private LocalDate registrationDate;

    private LocalDate maintenanceDate;

    @OneToMany(mappedBy = "vehicle")
    private List<VehicleAssignment> assignments;
}
