package com.example.worldtravel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @Column(name = "passenger_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 10)
    @Column(name = "title", length = 10)
    private String title;

    @Size(max = 100)
    @NotNull
    @Column(name = "fullname", nullable = false, length = 100)
    private String fullname;

    @Size(max = 255)
    @NotNull
    @Column(name = "nationality", nullable = false)
    private String nationality;

    @Size(max = 30)
    @NotNull
    @Column(name = "id_number", nullable = false, length = 30)
    private String idNumber;

    @Size(max = 50)
    @Column(name = "phone_number", length = 50)
    private String phoneNumber;

    @Size(max = 255)
    @Column(name = "email")
    private String email;

}