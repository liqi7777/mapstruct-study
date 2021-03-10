package com.liqi.mapstruct.mappingCollections.mapper;

import com.liqi.mapstruct.mappingCollections.dto.CompanyDTO;
import com.liqi.mapstruct.mappingCollections.model.Company;
import org.mapstruct.Mapper;

@Mapper(uses = EmployeeMapper.class)
public interface CompanyMapper {

    CompanyDTO map(Company company);
}
