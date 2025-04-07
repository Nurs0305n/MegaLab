package kg.mega.library.controllers;

import kg.mega.library.models.dto.ReaderCreateDto;
import kg.mega.library.models.dto.ReaderDto;
import kg.mega.library.models.dto.ReaderUpdateDto;
import kg.mega.library.services.ReaderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reader")
public class ReaderController {

    private final ReaderService readerService;

    public ReaderController(ReaderService readerService) {
        this.readerService = readerService;
    }


    @PostMapping("/create")
    public ReaderDto create(@RequestBody ReaderCreateDto readerCreateDto){
        return readerService.create(readerCreateDto);
    }

    @PutMapping("/update")
    public ReaderDto update(@RequestBody ReaderUpdateDto readerUpdateDto){
        return readerService.update(readerUpdateDto);
    }

    @GetMapping("/all")
    public List<ReaderDto> findAllReaderDtos(){
        return readerService.findAllReaderDtos();
    }

    @GetMapping("/list")
    public List<ReaderDto> findAllReaderDtos(@RequestParam int page, @RequestParam int rowsCount){
        return readerService.findAllReaderDtos(page, rowsCount);
    }
}
