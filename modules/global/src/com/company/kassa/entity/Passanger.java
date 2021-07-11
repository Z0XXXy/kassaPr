package com.company.kassa.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "KASSA_PASSANGER")
@Entity(name = "kassa_Passanger")
@NamePattern("%s|firstName")
public class Passanger extends StandardEntity {
    private static final long serialVersionUID = 8442131644957949817L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    @NotEmpty(message = "firstName cant be empty")
    @NotBlank(message = "firstName cant be blank")
    private String firstName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    @NotEmpty(message = "lastName cant be empty")
    @NotBlank(message = "lastName cant be blank")
    private String lastName;

    @NotNull
    @Column(name = "PASSPORT_SERIAL_NUM", nullable = false)
    @NumberFormat(pattern = "##########")
    private Long passportSerialNum;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "travelPassenger")
    private List<Travel> passengerTravels;

    public List<Travel> getPassengerTravels() {
        return passengerTravels;
    }

    public void setPassengerTravels(List<Travel> passengerTravels) {
        this.passengerTravels = passengerTravels;
    }

    public Long getPassportSerialNum() {
        return passportSerialNum;
    }

    public void setPassportSerialNum(Long passportSerialNum) {
        this.passportSerialNum = passportSerialNum;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}