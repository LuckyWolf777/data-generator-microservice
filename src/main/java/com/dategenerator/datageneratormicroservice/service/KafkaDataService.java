package com.dategenerator.datageneratormicroservice.service;

import com.dategenerator.datageneratormicroservice.model.Data;
import org.springframework.stereotype.Service;


public interface KafkaDataService {

    void send(Data data);

}
