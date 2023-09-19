package com.example.jacksonlearning;

import com.example.jacksonlearning.serialization.JacksonTestUtils;
import com.fasterxml.jackson.databind.*;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@TestConfiguration
public class TestConfig {

    @Bean("testObjectMapper")
    @Primary
    ObjectMapper customObjectMapper(){
        ObjectMapper objectMapper = new ObjectMapper().setInjectableValues(new InjectableValues() {
            @Override
            public Object findInjectableValue(Object o, DeserializationContext deserializationContext, BeanProperty beanProperty, Object o1) throws JsonMappingException {
                return null;
            }
        });
        return objectMapper;
    }

    @Bean
    JacksonTestUtils beerDtoTestUtils() {
        JacksonTestUtils jacksonTestUtils = new JacksonTestUtils();
        return jacksonTestUtils;
    }
}
