package com.dategenerator.datageneratormicroservice.web.mapper;

import com.dategenerator.datageneratormicroservice.model.test.DataTestOption;
import com.dategenerator.datageneratormicroservice.web.dto.DataTestOptionDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionMapper extends Mappable<DataTestOption, DataTestOptionDto> {


}
