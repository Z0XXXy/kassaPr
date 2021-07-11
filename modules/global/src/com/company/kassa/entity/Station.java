package com.company.kassa.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;

@Table(name = "KASSA_STATIONS")
@Entity(name = "kassa_Stations")
public class Station extends StandardEntity {
    private static final long serialVersionUID = -8474355413146495397L;

    @NotNull
    @Column(name = "STATION_NAME", nullable = false, unique = true)
    @NotBlank(message = "stationName cant be blank")
    @NotEmpty(message = "stationName cant be empty")
    private String stationName;

    @NotNull
    @Column(name = "DURATION", nullable = false)
    @Positive(message = "duration from station must be positive number")
    private Integer duration;

    @JoinTable(name = "KASSA_ROUTE_STATION_LINK",
            joinColumns = @JoinColumn(name = "STATION_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROUTE_ID"))
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToMany
    private List<Route> routesOfStation;

    public List<Route> getRoutesOfStation() {
        return routesOfStation;
    }

    public void setRoutesOfStation(List<Route> routesOfStation) {
        this.routesOfStation = routesOfStation;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}