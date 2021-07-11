package com.company.kassa.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum KindOfTransport implements EnumClass<String> {

    TRAIN("train"),
    PLANE("plane"),
    BUS("bus");

    private String id;

    KindOfTransport(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static KindOfTransport fromId(String id) {
        for (KindOfTransport at : KindOfTransport.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}