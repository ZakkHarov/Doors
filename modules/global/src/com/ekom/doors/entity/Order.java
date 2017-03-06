package com.ekom.doors.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.math.BigDecimal;
import javax.persistence.Lob;
import com.haulmont.chile.core.annotations.NamePattern;
import javafx.beans.DefaultProperty;
import sun.util.calendar.LocalGregorianCalendar;

@NamePattern("%s  %s  |number,date")
@Table(name = "DOORS_ORDER")
@Entity(name = "doors$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 7581425841533868193L;

    @Column(name = "NUMBER_", nullable = false, length = 20)
    protected String number;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    @Temporal(TemporalType.DATE)
    @Column(name = "MANUFACTURE_DATE", nullable = false)
    protected Date manufactureDate;

    @Column(name = "PLACEMENT_CATEGORY", nullable = false)
    protected Integer placementCategory;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DOOR_ID")
    protected Door door;

    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;

    @Column(name = "HEIGHT")
    protected Integer height;

    @Column(name = "WIDTH")
    protected Integer width;

    @Column(name = "OPENING", nullable = false)
    protected String opening;

    @Lob
    @Column(name = "NOTES")
    protected String notes;

    @Column(name = "ISOLATION_")
    protected Boolean isolation;

    @Column(name = "PEEPHOLE")
    protected Boolean peephole;

    @Column(name = "TRIM_")
    protected Boolean trim;

    @Column(name = "DISMANTLING")
    protected Boolean dismantling;

    @Column(name = "LOOP_NUMBER", nullable = false)
    protected String loopNumber;

    @Column(name = "TOP_LOCK")
    protected String topLock;

    @Column(name = "BOTTOM_LOCK")
    protected String bottomLock;

    @Column(name = "TOP_ONLAY")
    protected String topOnlay;

    @Column(name = "BOTTOM_ONLAY")
    protected String bottomOnlay;

    @Column(name = "HANDLE")
    protected String handle;

    @Column(name = "CYLINDER")
    protected String cylinder;

    @Lob
    @Column(name = "INTERNAL_DECORATION")
    protected String internalDecoration;

    @Lob
    @Column(name = "EXTERNAL_DECORATION")
    protected String externalDecoration;

    @Column(name = "STATUS", nullable = false)
    protected Integer status;

    @Column(name = "MASTER")
    protected Integer master;

    @Column(name = "PAYED")
    protected Boolean payed;

    public void setMaster(Master master) {
        this.master = master == null ? null : master.getId();
    }

    public Master getMaster() {
        return master == null ? null : Master.fromId(master);
    }

    public void setPayed(Boolean payed) {
        this.payed = payed;
    }

    public Boolean getPayed() {
        return payed;
    }


    public void setStatus(OrderStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public OrderStatus getStatus() {
        return status == null ? null : OrderStatus.fromId(status);
    }


    public void setInternalDecoration(String internalDecoration) {
        this.internalDecoration = internalDecoration;
    }

    public String getInternalDecoration() {
        return internalDecoration;
    }

    public void setExternalDecoration(String externalDecoration) {
        this.externalDecoration = externalDecoration;
    }

    public String getExternalDecoration() {
        return externalDecoration;
    }


    public void setDoor(Door door) {
        this.door = door;
    }

    public Door getDoor() {
        return door;
    }


    public void setTopLock(String topLock) {
        this.topLock = topLock;
    }

    public String getTopLock() {
        return topLock;
    }

    public void setBottomLock(String bottomLock) {
        this.bottomLock = bottomLock;
    }

    public String getBottomLock() {
        return bottomLock;
    }

    public void setTopOnlay(String topOnlay) {
        this.topOnlay = topOnlay;
    }

    public String getTopOnlay() {
        return topOnlay;
    }

    public void setBottomOnlay(String bottomOnlay) {
        this.bottomOnlay = bottomOnlay;
    }

    public String getBottomOnlay() {
        return bottomOnlay;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    public void setCylinder(String cylinder) {
        this.cylinder = cylinder;
    }

    public String getCylinder() {
        return cylinder;
    }


    public void setLoopNumber(String loopNumber) {
        this.loopNumber = loopNumber;
    }

    public String getLoopNumber() {
        return loopNumber;
    }


    public void setPlacementCategory(Integer placementCategory) {
        this.placementCategory = placementCategory;
    }

    public Integer getPlacementCategory() {
        return placementCategory;
    }


    public void setIsolation(Boolean isolation) {
        this.isolation = isolation;
    }

    public Boolean getIsolation() {
        return isolation;
    }

    public void setPeephole(Boolean peephole) {
        this.peephole = peephole;
    }

    public Boolean getPeephole() {
        return peephole;
    }

    public void setTrim(Boolean trim) {
        this.trim = trim;
    }

    public Boolean getTrim() {
        return trim;
    }

    public void setDismantling(Boolean dismantling) {
        this.dismantling = dismantling;
    }

    public Boolean getDismantling() {
        return dismantling;
    }


    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }


    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }


    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }


    public Opening getOpening() {
        return opening == null ? null : Opening.fromId(opening);
    }

    public void setOpening(Opening opening) {
        this.opening = opening == null ? null : opening.getId();
    }



    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }


}