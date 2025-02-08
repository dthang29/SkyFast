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
@Table(name = "feedback")
public class Feedback {
    @Id
    @Column(name = "feedback_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @NotNull
    @Column(name = "rating", nullable = false)
    private Float rating;

    @Size(max = 255)
    @NotNull
    @Column(name = "comments", nullable = false)
    private String comments;

    @NotNull
    @Column(name = "feedback_date", nullable = false)
    private Instant feedbackDate;

}