package com.example.skyfast.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "Rating", nullable = false)
    private Integer rating;

    @Size(max = 255)
    @Column(name = "Comments")
    private String comments;

    @Size(max = 255)
    @NotNull
    @Column(name = "FeedbackDate", nullable = false)
    private String feedbackDate;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UserId", nullable = false)
    private com.example.skyfast.entity.User user;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FlightId", nullable = false)
    private com.example.skyfast.entity.Flight flight;

}