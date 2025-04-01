package models;

import java.util.Date;
import java.util.List;

public class ChannelRequests {
    private Integer id;
    private Integer channelId;
    private List<Date> dates;

    public ChannelRequests(Integer channelId, List<Date> dates) {
        this.channelId = channelId;
        this.dates = dates;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }
}
