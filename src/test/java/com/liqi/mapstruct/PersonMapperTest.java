package com.liqi.mapstruct;

import com.liqi.mapstruct.mapperInterface.CarsLombokMapper;
import com.liqi.mapstruct.mapperInterface.CarsMapper;
import com.liqi.mapstruct.mapperInterface.PersonMapper;
import com.liqi.mapstruct.pojo.*;
import com.liqi.mapstruct.pojo.defaultExpression.Person;
import com.liqi.mapstruct.pojo.defaultExpression.PersonDTO;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Sky
 * create  2021-03-09 15:14
 * email sky.li@ixiaoshuidi.com
 */
public class PersonMapperTest {

    @Test
    public void givenPersonEntitytoPersonWithExpression_whenMaps_thenCorrect(){
    Person entity  = new Person();
    entity.setName("Micheal");
    PersonDTO personDto = PersonMapper.INSTANCE.personToPersonDTO(entity);
    assertNull(entity.getId());
    assertNotNull(personDto.getId());
    assertEquals(personDto.getName(), entity.getName());
}



}
