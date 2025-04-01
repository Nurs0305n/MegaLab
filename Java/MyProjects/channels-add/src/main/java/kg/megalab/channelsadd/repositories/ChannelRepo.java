package kg.megalab.channelsadd.repositories;

import kg.megalab.channelsadd.models.Channel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepo extends CrudRepository<Channel, Long> {
}
