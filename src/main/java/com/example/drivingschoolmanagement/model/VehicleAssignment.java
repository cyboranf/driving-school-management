package com.example.drivingschoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.util.List;


@Entity
@Data
@Table(name = "vehicle_assignments")
public class VehicleAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer assignmentId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "vehicle_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Vehicle vehicle;

    private Boolean status;

    @OneToMany(mappedBy = "vehicleAssignment")
    private List<Lesson> lessons;
}

