package com.dategenerator.datageneratormicroservice.web.controller;

import com.dategenerator.datageneratormicroservice.model.Data;
import com.dategenerator.datageneratormicroservice.model.test.DataTestOption;
import com.dategenerator.datageneratormicroservice.service.KafkaDataService;
import com.dategenerator.datageneratormicroservice.service.TestDataService;
import com.dategenerator.datageneratormicroservice.web.dto.DataDto;
import com.dategenerator.datageneratormicroservice.web.dto.DataTestOptionDto;
import com.dategenerator.datageneratormicroservice.web.mapper.DataMapper;
import com.dategenerator.datageneratormicroservice.web.mapper.DataTestOptionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final DataMapper dataMapper;
    private final KafkaDataService kafkaDataService;

    private final DataTestOptionMapper dataTestOptionMapper;
    private final TestDataService testDataService;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionDto dataTestOptionDto) {
        DataTestOption testOption = dataTestOptionMapper.toEntity(dataTestOptionDto);
        testDataService.sendMessages(testOption);
    }
}
