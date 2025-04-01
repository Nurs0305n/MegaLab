package kg.mega.library.controllers;

import kg.mega.library.models.dto.AuthorDto;
import kg.mega.library.services.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
