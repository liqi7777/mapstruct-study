package com.liqi.mapstruct.mapperInterface;

import com.liqi.mapstruct.pojo.SimpleDestination;
import com.liqi.mapstruct.pojo.SimpleSource;
import org.mapstruct.Mapper;

/**
 * @author Sky
 * create  2021-03-09 15:04
 * email sky.li@ixiaoshuidi.com
 */
@Mapper(componentModel = "spring")
public interface SimpleSourceDestinationMapper {

    SimpleDestination sourceToDestination(SimpleSource source);

    SimpleSource destinationToSource(SimpleDestination destination);
}
