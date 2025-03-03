package kg.megalab.natv.repositories;

import kg.megalab.natv.models.Channel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepo extends CrudRepository<Channel, Long> {
}
