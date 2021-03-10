package com.liqi.mapstruct.mappingCollections.mapper;

import com.liqi.mapstruct.mappingCollections.dto.CompanyDTO;
import com.liqi.mapstruct.mappingCollections.model.Company;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        uses = EmployeeMapper.class)
public interface CompanyMapperAdderPreferred {

    CompanyDTO map(Company company);
}
