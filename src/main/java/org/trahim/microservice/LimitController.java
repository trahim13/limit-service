package org.trahim.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private DataFromYml dataFromYml;


    @GetMapping("/limit")
    public DataResult retriveResult() {
        return new DataResult(dataFromYml.getMax(), dataFromYml.getMin());
//        return new DataResult();
    }

}
