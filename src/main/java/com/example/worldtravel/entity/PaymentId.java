package com.example.worldtravel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PaymentId implements java.io.Serializable {
    private static final long serialVersionUID = 550819185727867365L;
    @NotNull
    @Column(name = "payment_id", nullable = false)
    private Integer paymentId;

    @NotNull
    @Column(name = "booking_id", nullable = false)
    private Integer bookingId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PaymentId entity = (PaymentId) o;
        return Objects.equals(this.paymentId, entity.paymentId) &&
                Objects.equals(this.bookingId, entity.bookingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId, bookingId);
    }

}