package com.company.kassa.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Table(name = "KASSA_ROUTE")
@Entity(name = "kassa_Route")
public class Route extends StandardEntity {
    private static final long serialVersionUID = 4769809701658866423L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false, unique = true)
    private UUID number;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToMany
    @JoinTable(name = "KASSA_ROUTE_STATION_LINK",
            joinColumns = @JoinColumn(name = "ROUTE_ID"),
            inverseJoinColumns = @JoinColumn(name = "STATION_ID"))
    private List<Station> route_stations;

    @NotNull
    @Column(name = "TRANSPORT", nullable = false)
    private String transport;

    public void setRoute_stations(List<Station> route_stations) {
        this.route_stations = route_stations;
    }

    public List<Station> getRoute_stations() {
        return route_stations;
    }

    public KindOfTransport getTransport() {
        return transport == null ? null : KindOfTransport.fromId(transport);
    }

    public void setTransport(KindOfTransport transport) {
        this.transport = transport == null ? null : transport.getId();
    }

    public UUID getNumber() {
        return number;
    }

    public void setNumber(UUID number) {
        this.number = number;
    }
}