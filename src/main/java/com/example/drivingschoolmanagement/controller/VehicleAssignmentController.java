package com.example.drivingschoolmanagement.controller;

import com.example.drivingschoolmanagement.model.VehicleAssignment;
import com.example.drivingschoolmanagement.service.VehicleAssignmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/assignments")
public class VehicleAssignmentController {
    private final VehicleAssignmentService vehicleAssignmentService;


    public VehicleAssignmentController(VehicleAssignmentService vehicleAssignmentService) {
        this.vehicleAssignmentService = vehicleAssignmentService;
    }

    @GetMapping("/active")
    public List<VehicleAssignment> getActiveAssignments() {
        return vehicleAssignmentService.getActiveAssignments();
    }

    @GetMapping("/inactive")
    public List<VehicleAssignment> getInactiveAssignments() {
        return vehicleAssignmentService.getInactiveAssignments();
    }
}

