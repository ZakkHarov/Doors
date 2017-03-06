package com.ekom.doors.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Lob;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s  %s|cd,designation")
@Table(name = "DOORS_DOOR")
@Entity(name = "doors$Door")
public class Door extends StandardEntity {
    private static final long serialVersionUID = 3340328860597835503L;

    @Column(name = "KIND", nullable = false)
    protected Integer kind;

    @Column(name = "CD", nullable = false)
    protected String cd;

    @Column(name = "DESIGNATION")
    protected String designation;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    public DoorKind getKind() {
        return kind == null ? null : DoorKind.fromId(kind);
    }

    public void setKind(DoorKind kind) {
        this.kind = kind == null ? null : kind.getId();
    }


    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getCd() {
        return cd;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}