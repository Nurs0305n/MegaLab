package kg.mega.library.services;

import kg.mega.library.models.dto.RentCreateDto;
import kg.mega.library.models.dto.RentDto;

public interface RentService {
    RentDto createRent(RentCreateDto rentCreateDto);
}
