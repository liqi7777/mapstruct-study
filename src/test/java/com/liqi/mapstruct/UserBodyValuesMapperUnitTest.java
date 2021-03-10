package com.liqi.mapstruct;

import com.liqi.mapstruct.customMapperInterface.UserBodyValuesMapper;
import com.liqi.mapstruct.pojo.custom.UserBodyImperialValuesDTO;
import com.liqi.mapstruct.pojo.custom.UserBodyValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Sky
 * create  2021-03-10 16:36
 * email sky.li@ixiaoshuidi.com
 */
public class UserBodyValuesMapperUnitTest {

    @Test
    public void givenUserBodyImperialValuesDTOToUserBodyValuesObject_whenMaps_thenCorrect() {
        UserBodyImperialValuesDTO dto  = new UserBodyImperialValuesDTO();
        dto.setInch(10);
        dto.setPound(100);

        UserBodyValues obj = UserBodyValuesMapper.INSTANCE.userBodyValuesMapper(dto);

        assertNotNull(obj);
        assertEquals(25.4, obj.getCentimeter(), 0);
        assertEquals(45.35, obj.getKilogram(), 0);
    }

    @Test
    public void givenUserBodyImperialValuesDTOWithInchToUserBodyValuesObject_whenMaps_thenCorrect() {
        UserBodyImperialValuesDTO dto = new UserBodyImperialValuesDTO();
        dto.setInch(10);

        UserBodyValues obj = UserBodyValuesMapper.INSTANCE.userBodyValuesMapper(dto);

        assertNotNull(obj);
        assertEquals(25.4, obj.getCentimeter(), 0);
    }

    @Test
    public void givenUserBodyImperialValuesDTOWithPoundToUserBodyValuesObject_whenMaps_thenCorrect() {
        UserBodyImperialValuesDTO dto = new UserBodyImperialValuesDTO();
        dto.setPound(100);

        UserBodyValues obj = UserBodyValuesMapper.INSTANCE.userBodyValuesMapper(dto);

        assertNotNull(obj);
        assertEquals(45.35, obj.getKilogram(), 0);
    }
}
