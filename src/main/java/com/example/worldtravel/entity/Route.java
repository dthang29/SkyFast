package com.example.worldtravel.entity;

import com.example.worldtravel.constant.RouteStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "route")
public class Route {
    @Id
    @Column(name = "route_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 10)
    @NotNull
    @Column(name = "departure_airport_code", nullable = false, length = 10)
    private String departureAirportCode;

    @Size(max = 10)
    @NotNull
    @Column(name = "arrival_airport_code", nullable = false, length = 10)
    private String arrivalAirportCode;

    @NotNull
    @Column(name = "distance", nullable = false)
    private Float distance;

    @NotNull
    @Enumerated(EnumType.STRING)
    @ColumnDefault("ACTIVE")
    @Column(name = "route_status", nullable = false)
    private RouteStatus routeStatus;
}