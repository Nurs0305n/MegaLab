package kg.megalab.natv.controllers;

import kg.megalab.natv.models.Channel;
import kg.megalab.natv.services.impl.ChannelServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/channel")
public class ChannelController {

    private final ChannelServiceImpl channelService;
    public ChannelController(ChannelServiceImpl channelService){
        this.channelService = channelService;
    }

    @PostMapping("/create")
    public Channel create(Channel channel){
        return channelService.create(channel);
    }

    @PutMapping("/update")
    public Channel update(Channel channel){
        return channelService.update(channel);
    }

    @GetMapping("/{id}")
    public Channel findById(@PathVariable Long id){
        return channelService.findById(id);
    }

    @GetMapping("/all")
    public List<Channel> findAll(){
        return channelService.findAll();
    }

    @DeleteMapping("/delete")
    public void deleteById(Long id){
        channelService.deleteById(id);
    }
}
