package com.ekom.doors.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Opening implements EnumClass<String> {

    right("1"),
    left("2");

    private String id;

    Opening(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Opening fromId(String id) {
        for (Opening at : Opening.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}