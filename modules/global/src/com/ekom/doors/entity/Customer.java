package com.ekom.doors.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "DOORS_CUSTOMER")
@Entity(name = "doors$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -4566683618282789538L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "CONTACT_NAME")
    protected String contactName;

    @Column(name = "ADDRESS")
    protected String address;

    @Column(name = "PHONE", length = 50)
    protected String phone;

    @Column(name = "MOBILE", length = 50)
    protected String mobile;

    @Column(name = "FAX", length = 50)
    protected String fax;

    @Column(name = "EMAIL", length = 50)
    protected String email;

    @Column(name = "SITE", length = 100)
    protected String site;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFax() {
        return fax;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSite() {
        return site;
    }


}