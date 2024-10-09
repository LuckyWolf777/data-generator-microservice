package com.dategenerator.datageneratormicroservice.web.mapper;

import com.dategenerator.datageneratormicroservice.model.Data;
import com.dategenerator.datageneratormicroservice.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {


}
