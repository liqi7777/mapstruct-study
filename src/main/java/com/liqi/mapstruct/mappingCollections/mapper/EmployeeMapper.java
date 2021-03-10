package com.liqi.mapstruct.mappingCollections.mapper;

import com.liqi.mapstruct.mappingCollections.dto.EmployeeDTO;
import com.liqi.mapstruct.mappingCollections.model.Employee;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Mapper
public interface EmployeeMapper {

    EmployeeDTO map(Employee employee);

    List<EmployeeDTO> map(List<Employee> employees);

    Set<EmployeeDTO> map(Set<Employee> employees);

    Map<String, EmployeeDTO> map(Map<String, Employee> idEmployeeMap);
}
