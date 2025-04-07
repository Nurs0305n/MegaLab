package kg.mega.library.services.impl;

import kg.mega.library.enums.RentStatus;
import kg.mega.library.mappers.RentMapper;
import kg.mega.library.models.Book;
import kg.mega.library.models.Reader;
import kg.mega.library.models.Rent;
import kg.mega.library.models.dto.RentCreateDto;
import kg.mega.library.models.dto.RentDto;
import kg.mega.library.repositories.RentRepo;
import kg.mega.library.services.BookService;
import kg.mega.library.services.ReaderService;
import kg.mega.library.services.RentService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RentServiceImpl implements RentService {

    private final ReaderService readerService;
    private final BookService bookService;
    private final RentRepo rentRepo;

    public RentServiceImpl(ReaderService readerService, BookService bookService, RentRepo rentRepo) {
        this.readerService = readerService;
        this.bookService = bookService;
        this.rentRepo = rentRepo;
    }


    @Override
    public RentDto createRent(RentCreateDto rentCreateDto) {
        Reader reader = readerService.findById(rentCreateDto.readerId());
        Book book = bookService.findById(rentCreateDto.bookId());

        Rent rent = new Rent();
        rent.setBook(book);
        rent.setReader(reader);
        rent.setStartDate(LocalDate.now());
        rent.setEndDate(LocalDate.now().plusDays(rentCreateDto.daysCount()));
        rent.setTotalPrice(rentCreateDto.daysCount() * book.getPricePerDay());
        rent.setStatus(RentStatus.OPEN);

        rent = rentRepo.save(rent);

        return RentMapper.INSTANCE.rentToRentDto(rent);
    }
}
