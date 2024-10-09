package com.dategenerator.datageneratormicroservice.service;

import com.dategenerator.datageneratormicroservice.model.test.DataTestOption;
import org.springframework.stereotype.Service;


public interface TestDataService {

    void sendMessages(DataTestOption dataTestOption);

}
