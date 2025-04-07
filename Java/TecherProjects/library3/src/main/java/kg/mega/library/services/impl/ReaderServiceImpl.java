package kg.mega.library.services.impl;

import kg.mega.library.mappers.ReaderMapper;
import kg.mega.library.models.Reader;
import kg.mega.library.models.dto.ReaderCreateDto;
import kg.mega.library.models.dto.ReaderDto;
import kg.mega.library.models.dto.ReaderUpdateDto;
import kg.mega.library.models.dto.TicketDto;
import kg.mega.library.repositories.ReaderRepo;
import kg.mega.library.services.ReaderService;
import kg.mega.library.services.TicketService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReaderServiceImpl implements ReaderService {

    private final ReaderRepo readerRepo;
    private final TicketService ticketService;

    public ReaderServiceImpl(ReaderRepo readerRepo, TicketService ticketService) {
        this.readerRepo = readerRepo;
        this.ticketService = ticketService;
    }

    @Override
    public ReaderDto create(ReaderCreateDto readerCreateDto) {

        Reader reader = ReaderMapper.INSTANCE.readerCreateDtoToReader(readerCreateDto);
        reader = readerRepo.save(reader);

        TicketDto ticketDto = ticketService.createTicketForReader(reader);


        return ReaderMapper.INSTANCE.readerAndTicketDtoToReaderDto(reader, ticketDto);
    }

    @Override
    public ReaderDto update(ReaderUpdateDto readerUpdateDto) {
        Reader reader = readerRepo.findById(readerUpdateDto.readerId()).orElseThrow();
        reader = ReaderMapper.INSTANCE.readerUpdateDtoToReader(readerUpdateDto);
        reader = readerRepo.save(reader);

        TicketDto ticketDto = ticketService.findTicketDtoByReader(reader);

        return ReaderMapper.INSTANCE.readerAndTicketDtoToReaderDto(reader, ticketDto);
    }

    @Override
    public List<ReaderDto> findAllReaderDtos() {
        //List<ReaderDto> readerDtos = readerRepo.findReaderDtos(LocalDate.now());
        return readerRepo.findReaderDtosNative(LocalDate.now());
    }

    @Override
    public List<ReaderDto> findAllReaderDtos(int page, int rowsCount) {
        Pageable pageable = PageRequest.of(page, rowsCount, Sort.by("id").descending());
        return readerRepo.findReaderDtosNative(LocalDate.now(), pageable);
    }

    @Override
    public Reader findById(Long readerId) {
        return readerRepo.findById(readerId).orElseThrow();
    }
}
