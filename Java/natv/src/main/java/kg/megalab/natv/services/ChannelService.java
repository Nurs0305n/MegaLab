package kg.megalab.natv.services;

import kg.megalab.natv.models.Channel;

import java.util.List;

public interface ChannelService {

    Channel create(Channel channel);
    Channel update(Channel channel);
    Channel findById(Long id);
    Channel deleteById(Long id);
    List<Channel> findAll();

}
