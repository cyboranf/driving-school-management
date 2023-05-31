package com.example.drivingschoolmanagement.repository;

import com.example.drivingschoolmanagement.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
