package com.liqi.mapstruct.mapperInterface;

import com.liqi.mapstruct.pojo.lombok.Car;
import com.liqi.mapstruct.pojo.lombok.CarDTO;
import org.mapstruct.Mapper;

/**
 * @author Sky
 * create  2021-03-10 10:13
 * email sky.li@ixiaoshuidi.com
 */
@Mapper
public interface CarsLombokMapper {

    CarDTO carToCarDTO(Car car);

}
