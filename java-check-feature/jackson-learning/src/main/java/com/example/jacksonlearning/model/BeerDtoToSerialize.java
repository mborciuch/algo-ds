package com.example.jacksonlearning.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties({"ignorable2"})
public class BeerDtoToSerialize {

    private UUID id;
    @JsonProperty("nameOfBeer")
    private String beerName;
    private String beerStyle;
    private Long upd;
    private BigDecimal price;
    @JsonIgnore
    private String ignorable;
    private String ignorable2;
    private GuyUnder190cm guyUnder190cm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, String> notNullMap;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, String> nullMap;

    @Getter(AccessLevel.NONE)
    private String getterProperty;


    @JsonGetter(value = "propertyOfJsonGetter")
    public String getGetterPropery() {
        return getterProperty;
    }

}
