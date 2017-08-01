package org.api.counter.controller;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicLong;

import org.api.counter.bo.APICount;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counterapi")
public class CounterController {
    
    private final AtomicLong counter = new AtomicLong();
    
    private static final DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    @RequestMapping(value="/counts", method=RequestMethod.GET)
    public APICount count() {
        return new APICount(counter.incrementAndGet(),
        		OffsetDateTime.now().format(dtf));
    }
}
