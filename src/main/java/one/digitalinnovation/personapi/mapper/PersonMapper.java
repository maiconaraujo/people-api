package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);



    @Mappings({
            @Mapping(source = "birthDate", target = "birthDate",  dateFormat = "dd-MM-yyyy"),
            @Mapping(source = "phones", target = "phones")
    })
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);

}
