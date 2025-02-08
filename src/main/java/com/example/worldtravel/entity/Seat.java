package com.example.worldtravel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seat")
public class Seat {
    @Id
    @Column(name = "seat_number", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "airplane_id", nullable = false)
    private Airplane airplane;

    @Size(max = 50)
    @NotNull
    @Column(name = "class", nullable = false, length = 50)
    private String classField;

    @Size(max = 50)
    @NotNull
    @Column(name = "seat_status", nullable = false, length = 50)
    private String seatStatus;

}