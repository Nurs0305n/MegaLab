package kg.megalab.natv.services.impl;

import kg.megalab.natv.exceptions.NoDataFound;
import kg.megalab.natv.models.Channel;
import kg.megalab.natv.repositories.ChannelRepo;
import kg.megalab.natv.services.ChannelService;
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
        return channelRepo.save(channel);
    }

    @Override
    public Channel update(Channel channel) {
        if (!channelRepo.existsById(channel.getId()))
            throw new NoDataFound("Канал не найден! ID = " + channel.getId());

        return channelRepo.save(channel);
    }

    @Override
    public Channel findById(Long id) {
        return channelRepo.findById(id).get();
    }

    @Override
    public Channel deleteById(Long id) {
        Channel channel = channelRepo.findById(id).get();
        channelRepo.delete(channel);
        return channel;
    }

    @Override
    public List<Channel> findAll() {
        return (List<Channel>) channelRepo.findAll();
    }
}
