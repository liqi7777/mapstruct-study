package com.liqi.mapstruct.mapperInterface;

import com.liqi.mapstruct.pojo.defaultExpression.Person;
import com.liqi.mapstruct.pojo.defaultExpression.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Sky
 * create  2021-03-10 10:32
 * email sky.li@ixiaoshuidi.com
 */
@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "id", source = "person.id",
            defaultExpression = "java(java.util.UUID.randomUUID().toString())")
    PersonDTO personToPersonDTO(Person person);
}
