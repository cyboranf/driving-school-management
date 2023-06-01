package com.example.drivingschoolmanagement.controller;

import com.example.drivingschoolmanagement.model.Vehicle;
import com.example.drivingschoolmanagement.service.VehicleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/maintenance")
    public List<Vehicle> getVehiclesNeedingMaintenance() {
        return vehicleService.getVehiclesNeedingMaintenance();
    }

    @GetMapping("/assigned")
    public List<Vehicle> getAssignedVehicles() {
        return vehicleService.getAssignedVehicles();
    }
}
