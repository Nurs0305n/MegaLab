package kg.mega.library.mappers;

import kg.mega.library.models.Rent;
import kg.mega.library.models.dto.RentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RentMapper {

    RentMapper INSTANCE = Mappers.getMapper(RentMapper.class);

    @Mapping(source = "id", target = "rentId")
    RentDto rentToRentDto(Rent rent);
}
