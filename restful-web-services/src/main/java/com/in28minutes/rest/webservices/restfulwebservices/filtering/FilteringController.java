package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public MappingJacksonValue filtering() {
        SomeBean someBean = new SomeBean("value1", "value2", "value3");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
        this.setMappingFilters(mappingJacksonValue, new HashSet<>(Arrays.asList("field1", "field2")));
        return mappingJacksonValue;
    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue filteringList() {
        List<SomeBean> list = Arrays.asList(new SomeBean("value1", "value2", "value3"), new SomeBean("value4", "value5", "value6"));
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
        this.setMappingFilters(mappingJacksonValue, new HashSet<>(Arrays.asList("field2", "field3")));
        return mappingJacksonValue;
    }

    private void setMappingFilters(MappingJacksonValue mappingJacksonValue, Set<String> fields) {
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(fields);
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mappingJacksonValue.setFilters(filters);
    }

}
