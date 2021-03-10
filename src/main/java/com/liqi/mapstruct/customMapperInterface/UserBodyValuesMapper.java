package com.liqi.mapstruct.customMapperInterface;

import com.liqi.mapstruct.annotation.PoundToKilogramMapper;
import com.liqi.mapstruct.pojo.custom.UserBodyImperialValuesDTO;
import com.liqi.mapstruct.pojo.custom.UserBodyValues;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

/**
 * @author Sky
 * create  2021-03-10 13:42
 * email sky.li@ixiaoshuidi.com
 */
@Mapper
public interface UserBodyValuesMapper {

    UserBodyValuesMapper INSTANCE = Mappers.getMapper(UserBodyValuesMapper.class);


    @Mapping(source = "inch", target = "centimeter", qualifiedByName = "inchToCentimeter")
    @Mapping(source = "pound", target = "kilogram", qualifiedBy = PoundToKilogramMapper.class)
    public UserBodyValues userBodyValuesMapper(UserBodyImperialValuesDTO dto);


    @Named("inchToCentimeter")
    public static double inchToCentimeter(int inch) {
        return inch * 2.54;
    }

    @PoundToKilogramMapper
    public static double poundToKilogram(int pound) {
        return pound * 0.4535;
    }

}
