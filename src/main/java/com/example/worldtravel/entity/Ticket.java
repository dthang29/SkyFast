package com.example.worldtravel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @Column(name = "ticket_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "passenger_id", nullable = false)
    private Passenger passenger;

    @Size(max = 10)
    @NotNull
    @Column(name = "seat_number", nullable = false, length = 10)
    private String seatNumber;

    @Size(max = 50)
    @NotNull
    @Column(name = "ticket_type", nullable = false, length = 50)
    private String ticketType;

    @NotNull
    @Column(name = "price", nullable = false)
    private Float price;

    @Size(max = 100)
    @NotNull
    @Column(name = "ticket_status", nullable = false, length = 100)
    private String ticketStatus;

}