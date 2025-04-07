package kg.mega.library.controllers;

import kg.mega.library.mappers.AuthorMapper;
import kg.mega.library.models.Author;
import kg.mega.library.models.dto.AuthorDto;
import kg.mega.library.services.AuthorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/create")
    public AuthorDto create(@RequestBody AuthorDto authorDto){
        return authorService.create(authorDto);
    }

    @GetMapping("/getExample")
    public AuthorDto getExample(){
        return new AuthorDto(1L, "John Doe");
    }

    @GetMapping("/test")
    public AuthorDto test(){
        Author author = new Author();
        author.setId(1L);
        author.setName("John Doe");
        return AuthorMapper.INSTANCE.authorToAuthorDto(author);
    }

    @GetMapping("/get")
    public Author get(){
        AuthorDto authorDto = new AuthorDto(1L, "John Doe");
        return AuthorMapper.INSTANCE.authorDtoToAuthor(authorDto);
    }

}
