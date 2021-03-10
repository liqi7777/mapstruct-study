package com.liqi.mapstruct;

import com.liqi.mapstruct.mapperInterface.SimpleSourceDestinationMapper;
import com.liqi.mapstruct.pojo.Employee;
import com.liqi.mapstruct.pojo.EmployeeDTO;
import com.liqi.mapstruct.pojo.SimpleDestination;
import com.liqi.mapstruct.pojo.SimpleSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Sky
 * create  2021-03-09 15:14
 * email sky.li@ixiaoshuidi.com
 */
@SpringBootTest
public class SimpleSourceDestinationMapperIntegrationTest {
    private SimpleSourceDestinationMapper mapper
            = Mappers.getMapper(SimpleSourceDestinationMapper.class);
    @Test
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        SimpleSource simpleSource = new SimpleSource();
        simpleSource.setName("SourceName");
        simpleSource.setDescription("SourceDescription");
        SimpleDestination destination = mapper.sourceToDestination(simpleSource);
        assertEquals(simpleSource.getName(), destination.getName());
        assertEquals(simpleSource.getDescription(),
                destination.getDescription());
    }
    @Test
    public void givenDestinationToSource_whenMaps_thenCorrect() {
        SimpleDestination destination = new SimpleDestination();
        destination.setName("DestinationName");
        destination.setDescription("DestinationDescription");
        SimpleSource source = mapper.destinationToSource(destination);
        assertEquals(destination.getName(), source.getName());
        assertEquals(destination.getDescription(),
                source.getDescription());
    }



}
