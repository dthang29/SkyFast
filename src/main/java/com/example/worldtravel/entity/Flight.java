package com.example.worldtravel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @Column(name = "flight_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "airline_id", nullable = false)
    private Airline airline;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "route_id", nullable = false)
    private Route route;

    @NotNull
    @Column(name = "flight_number", nullable = false)
    private Integer flightNumber;

    @NotNull
    @Column(name = "depature_time", nullable = false)
    private Instant depatureTime;

    @NotNull
    @Column(name = "arrival_time", nullable = false)
    private Instant arrivalTime;

    @NotNull
    @Column(name = "duration", nullable = false)
    private Float duration;

    @Size(max = 50)
    @NotNull
    @Column(name = "flight_status", nullable = false, length = 50)
    private String flightStatus;

}