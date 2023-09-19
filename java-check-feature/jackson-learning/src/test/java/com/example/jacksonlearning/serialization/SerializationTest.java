package com.example.jacksonlearning.serialization;

import com.example.jacksonlearning.TestConfig;
import com.example.jacksonlearning.model.BeerDtoToSerialize;
import com.example.jacksonlearning.model.Child;
import com.example.jacksonlearning.model.Parent;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.json.JsonContent;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest()
@Import(TestConfig.class)
public class SerializationTest  {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    JacksonTester<BeerDtoToSerialize> jacksonBeerTester;

    @Autowired
    JacksonTester<Parent> jacksonParentChildTester;

    @Autowired
    JacksonTester<Child> jacksonChildTester;

    @Autowired
    JacksonTestUtils jacksonTestUtils;

    @Test
    public void givenBeerDtoThenMarshallToJsonThenSuccess() throws Exception{
        BeerDtoToSerialize beerDto = jacksonTestUtils.buildTestDto();



        JsonContent<BeerDtoToSerialize> result = jacksonBeerTester.write(beerDto);

        System.out.println(result.toString());

        assertThat(result).hasJsonPathStringValue("$.id");
        assertThat(result).hasJsonPathStringValue("$.id");
        assertThat(result).extractingJsonPathStringValue("$.id").isEqualTo(beerDto.getId().toString());
        assertThat(result).extractingJsonPathStringValue("$.nameOfBeer").isEqualTo(beerDto.getBeerName());
        assertThat(result).doesNotHaveJsonPath("$.ignorable");
        assertThat(result).doesNotHaveJsonPath("$.ignorable2");
        assertThat(result).doesNotHaveJsonPath("$.guyUnder190cm");
        assertThat(result).hasJsonPath("$.notNullMap");
        assertThat(result).doesNotHaveJsonPath("$.nullMap");
        assertThat(result).hasJsonPathStringValue("$.propertyOfJsonGetter");
        assertThat(result).extractingJsonPathStringValue("$.propertyOfJsonGetter").isEqualTo(beerDto.getGetterPropery());
    }

    @Test
    public void givenNestedObjectWhenMarhallThenSuccess() throws  Exception {
        Parent parent = jacksonTestUtils.buildTestParent();



        JsonContent<Parent> result = jacksonParentChildTester.write(parent);

        System.out.println(result.toString());


    }

    @Test
    public void givenNestedChildWhenMarhallThenSuccess() throws  Exception {
        Parent parent = jacksonTestUtils.buildTestParent();

        Child child = parent.getChildren().stream().findFirst().orElseThrow(RuntimeException::new);

        JsonContent<Child> result = jacksonChildTester.write(child);

        System.out.println(result.toString());

    }

}
