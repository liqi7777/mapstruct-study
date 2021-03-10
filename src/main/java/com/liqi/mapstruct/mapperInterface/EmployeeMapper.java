package com.liqi.mapstruct.mapperInterface;

import com.liqi.mapstruct.pojo.Division;
import com.liqi.mapstruct.pojo.DivisionDTO;
import com.liqi.mapstruct.pojo.Employee;
import com.liqi.mapstruct.pojo.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @author Sky
 * create  2021-03-09 15:35
 * email sky.li@ixiaoshuidi.com
 */
@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mappings({
            @Mapping(target="employeeId", source="entity.id"),
            @Mapping(target="employeeName", source="entity.name"),
            @Mapping(target="employeeStartDt", source = "entity.startDt",
                    dateFormat = "dd-MM-yyyy HH:mm:ss")
    })
    EmployeeDTO employeeToEmployeeDTO(Employee entity);

    @Mappings({
            @Mapping(target="id", source="dto.employeeId"),
            @Mapping(target="name", source="dto.employeeName"),
            @Mapping(target="startDt", source="dto.employeeStartDt",
                    dateFormat="dd-MM-yyyy HH:mm:ss")
    })
    Employee employeeDTOtoEmployee(EmployeeDTO dto);


    DivisionDTO divisionToDivisionDTO(Division entity);


    Division divisionDTOtoDivision(DivisionDTO dto);
}

