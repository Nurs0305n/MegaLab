package models;

import models.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Car car;
    private Client client;
    private Address issueAddress;
    private Address returnAddress;
    private Date issueDate;
    private Date returnDate;

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Address getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(Address returnAddress) {
        this.returnAddress = returnAddress;
    }

    public Address getIssueAddress() {
        return issueAddress;
    }

    public void setIssueAddress(Address issueAddress) {
        this.issueAddress = issueAddress;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private OrderStatus status;
}
