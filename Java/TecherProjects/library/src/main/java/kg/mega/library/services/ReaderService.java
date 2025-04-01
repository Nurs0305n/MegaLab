package kg.mega.library.services;

import kg.mega.library.models.dto.ReaderCreateDto;
import kg.mega.library.models.dto.ReaderDto;
import kg.mega.library.models.dto.ReaderUpdateDto;

import java.util.List;

public interface ReaderService {
    ReaderDto create(ReaderCreateDto readerCreateDto);

    ReaderDto update(ReaderUpdateDto readerUpdateDto);


    List<ReaderDto> findAllReaderDtos();

    List<ReaderDto> findAllReaderDtos(int page, int rowsCount);
}
