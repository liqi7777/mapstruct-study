package com.liqi.mapstruct.mapper;

import com.liqi.mapstruct.mappingCollections.dto.EmployeeFullNameDTO;
import com.liqi.mapstruct.mappingCollections.mapper.EmployeeFullNameMapper;
import com.liqi.mapstruct.mappingCollections.model.Employee;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeFullNameMapperUnitTest {

    private EmployeeFullNameMapper employeeMapper = Mappers.getMapper(EmployeeFullNameMapper.class);

    @Test
    void whenMappingToEmployeeFullNameDTOList_thenExpectCorrectMappingResult() {
        Employee employee = new Employee("John", "Doe");

        List<EmployeeFullNameDTO> result = employeeMapper.map(Collections.singletonList(employee));

        assertThat(result).hasSize(1);
        assertThat(result.get(0).getFullName()).isEqualTo("John Doe");
    }
}