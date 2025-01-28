package models;

import java.util.List;

public class Request {
    private Integer id;
    private String text;
    private String clientName;
    private String phoneNumber;
    private String email;
    private List<ChannelRequests> channelRequests;

    public List<ChannelRequests> getChannelRequests() {
        return channelRequests;
    }

    public void setChannelRequests(List<ChannelRequests> channelRequests) {
        this.channelRequests = channelRequests;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
