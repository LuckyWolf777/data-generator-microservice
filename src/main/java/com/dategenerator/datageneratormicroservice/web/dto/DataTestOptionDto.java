package com.dategenerator.datageneratormicroservice.web.dto;

import com.dategenerator.datageneratormicroservice.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionDto {

    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;


}