package com.company.kassa.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "KASSA_TRAVEL")
@Entity(name = "kassa_Travel")
public class Travel extends StandardEntity {
    private static final long serialVersionUID = 4559111393477978521L;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TRAVEL_PASSENGER_ID")
    private Passanger travelPassenger;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "tiketTravels")
    private List<Ticket> travelTickets;

    public List<Ticket> getTravelTickets() {
        return travelTickets;
    }

    public void setTravelTickets(List<Ticket> travelTickets) {
        this.travelTickets = travelTickets;
    }

    public Passanger getTravelPassenger() {
        return travelPassenger;
    }

    public void setTravelPassenger(Passanger travelPassenger) {
        this.travelPassenger = travelPassenger;
    }

}