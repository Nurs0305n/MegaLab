package kg.mega.library.repositories;

import kg.mega.library.models.Book;
import kg.mega.library.models.dto.BookDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
