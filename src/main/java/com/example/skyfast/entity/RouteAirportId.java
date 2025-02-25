package com.example.skyfast.entity;

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
public class RouteAirportId implements java.io.Serializable {
    private static final long serialVersionUID = -8625445337991138150L;
    @NotNull
    @Column(name = "AirportId", nullable = false)
    private Integer airportId;

    @NotNull
    @Column(name = "RouteId", nullable = false)
    private Integer routeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RouteAirportId entity = (RouteAirportId) o;
        return Objects.equals(this.routeId, entity.routeId) &&
                Objects.equals(this.airportId, entity.airportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeId, airportId);
    }

}