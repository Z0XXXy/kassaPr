package com.company.kassa.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "KASSA_TICKET")
@Entity(name = "kassa_Ticket")
public class Ticket extends StandardEntity {
    private static final long serialVersionUID = 7345262039603817898L;

    @NotNull
    @Column(name = "TICKET_NUMBER", nullable = false, unique = true)
    private UUID ticketNumber;

    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DEPARTURE_ID")
    private Station departure;

    @NotNull
    @Column(name = "START_TIME", nullable = false)
    private LocalDateTime departureTime;

    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ARRIVAL_ID")
    private Station arrival;

    @NotNull
    @Column(name = "ARRIVAL_TIME", nullable = false)
    private LocalDateTime arrivalTime;

    @NotNull
    @Column(name = "TRANSPORT", nullable = false)
    private String transport;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TIKETS_PASSENGER_ID")
    private Passanger tiketPassenger;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    private Integer price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TIKET_TRAVELS_ID")
    private Travel tiketTravels;

    public Travel getTiketTravels() {
        return tiketTravels;
    }

    public void setTiketTravels(Travel tiketTravels) {
        this.tiketTravels = tiketTravels;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Passanger getTiketPassenger() {
        return tiketPassenger;
    }

    public void setTiketPassenger(Passanger tiketPassenger) {
        this.tiketPassenger = tiketPassenger;
    }

    public KindOfTransport getTransport() {
        return transport == null ? null : KindOfTransport.fromId(transport);
    }

    public void setTransport(KindOfTransport transport) {
        this.transport = transport == null ? null : transport.getId();
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Station getArrival() {
        return arrival;
    }

    public void setArrival(Station arrival) {
        this.arrival = arrival;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public Station getDeparture() {
        return departure;
    }

    public void setDeparture(Station departure) {
        this.departure = departure;
    }

    public UUID getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(UUID ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}