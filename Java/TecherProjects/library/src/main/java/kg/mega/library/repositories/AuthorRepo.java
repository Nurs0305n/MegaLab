package kg.mega.library.repositories;

import kg.mega.library.LibraryApplication;
import kg.mega.library.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {

    @Query("select u from Author u where u.id in ?1")
    List<Author> findAuthorsByIds(List<Long> authorIds);
}
