package com.dategenerator.datageneratormicroservice.model.test;

import com.dategenerator.datageneratormicroservice.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOption {

    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;


}
