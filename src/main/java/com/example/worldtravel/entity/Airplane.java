package com.example.worldtravel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "airplane")
public class Airplane {
    @Id
    @Column(name = "airplane_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "airline_id", nullable = false)
    private Airline airline;

    @Size(max = 50)
    @NotNull
    @Column(name = "airplane_name", nullable = false, length = 50)
    private String airplaneName;

    @NotNull
    @Column(name = "seat_capacity", nullable = false)
    private Integer seatCapacity;

    @Size(max = 100)
    @NotNull
    @Column(name = "manufacturer", nullable = false, length = 100)
    private String manufacturer;

    @Size(max = 255)
    @Column(name = "diagram")
    private String diagram;

    @Column(name = "speed")
    private Float speed;

    @Column(name = "total_length")
    private Float totalLength;

    @Column(name = "wingspan")
    private Float wingspan;

    @Column(name = "height")
    private Float height;

    @Size(max = 50)
    @NotNull
    @Column(name = "airplane_status", nullable = false, length = 50)
    private String airplaneStatus;

}