package kg.megalab.channelsadd.controllers;

import kg.megalab.channelsadd.models.Channel;
import kg.megalab.channelsadd.sevices.ChannelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/channel")
public class ChannelController {

    private final ChannelService channelService;

    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }

    @GetMapping("/{id}")
    public Channel findById (@PathVariable Long id){
        return channelService.findById(id);
    }

    @PostMapping("/create")
    public Channel create(@RequestBody Channel channel){
        return channelService.create(channel);
    }

    @PutMapping("/update")
    public Channel update(@RequestBody Channel channel){
        return channelService.update(channel);
    }

    @GetMapping("/all")
    public List<Channel> findAll(){
        return channelService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        channelService.deleteById(id);
    }
}
