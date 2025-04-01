package kg.megalab.channelsadd.sevices.impl;

import kg.megalab.channelsadd.models.Channel;
import kg.megalab.channelsadd.repositories.ChannelRepo;
import kg.megalab.channelsadd.sevices.ChannelService;
import kg.megalab.channelsadd.exceptions.NoDataFound;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChannelServiceImpl implements ChannelService {

    private final ChannelRepo channelRepo;

    public ChannelServiceImpl(ChannelRepo channelRepo) {
        this.channelRepo = channelRepo;
    }

    @Override
    public Channel create(Channel channel) {
        channelRepo.save(channel);
        return channel;
    }

    @Override
    public Channel findById(Long id) {
        return channelRepo.findById(id).orElseThrow();
    }

    @Override
    public Channel deleteById(Long id) {
        Channel channel = findById(id);
        channelRepo.deleteById(id);
        return channel;
    }

    @Override
    public List<Channel> findAll() {
        return (List<Channel>) channelRepo.findAll();
    }

    @Override
    public Channel update(Channel channel) {
        if (!channelRepo.existsById(channel.getId()))
            throw new NoDataFound("Канал не найден! ID = " + channel.getId());

        channel = channelRepo.save(channel);
        return channel;
    }
}
