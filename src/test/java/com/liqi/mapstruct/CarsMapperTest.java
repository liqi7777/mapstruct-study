package com.liqi.mapstruct;

import com.liqi.mapstruct.mapperInterface.CarsLombokMapper;
import com.liqi.mapstruct.mapperInterface.CarsMapper;
import com.liqi.mapstruct.pojo.*;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;


import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Sky
 * create  2021-03-09 15:14
 * email sky.li@ixiaoshuidi.com
 */
public class CarsMapperTest {

    private CarsMapper sut = Mappers.getMapper(CarsMapper.class);

    private CarsLombokMapper instance = Mappers.getMapper(CarsLombokMapper.class);

    @Test
    void testGivenSubTypeElectric_mapsModifiedFieldsToSuperTypeDto_whenBeforeAndAfterMappingMethodscarCalled() {
        Car car = new ElectricCar();
        car.setId(12);
        car.setName("Tesla_Model_C");

        CarDTO carDto = sut.toCarDto(car);

        assertEquals("TESLA_MODEL_C", carDto.getName());
        assertEquals(FuelType.ELECTRIC, carDto.getFuelType());
    }

    @Test
    void testGivenSubTypeBioDiesel_mapsModifiedFieldsToSuperTypeDto_whenBeforeAndAfterMappingMethodscarCalled() {
        Car car = new BioDieselCar();
        car.setId(11);
        car.setName("Tesla_Model_X");

        CarDTO carDto = sut.toCarDto(car);

        assertEquals("TESLA_MODEL_X", carDto.getName());
        assertEquals(FuelType.BIO_DIESEL, carDto.getFuelType());
    }


    @Test
    void testLombokCarTest(){
        com.liqi.mapstruct.pojo.lombok.Car entity = new com.liqi.mapstruct.pojo.lombok.Car();
        entity.setId(1);
        entity.setName("Toyota");

        com.liqi.mapstruct.pojo.lombok.CarDTO carDTO = instance.carToCarDTO(entity);

        assertEquals(carDTO.getId(), entity.getId());
        assertEquals(carDTO.getName(), entity.getName());
    }


}
