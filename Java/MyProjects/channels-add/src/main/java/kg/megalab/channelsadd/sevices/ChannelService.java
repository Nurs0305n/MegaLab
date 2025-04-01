package kg.megalab.channelsadd.sevices;

import kg.megalab.channelsadd.models.Channel;

import java.util.List;

public interface ChannelService {

    Channel create(Channel channel);
    Channel findById(Long id);
    Channel deleteById(Long id);
    List<Channel> findAll();
    Channel update(Channel channel);

}
