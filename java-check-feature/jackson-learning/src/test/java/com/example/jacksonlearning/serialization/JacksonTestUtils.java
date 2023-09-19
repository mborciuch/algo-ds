package com.example.jacksonlearning.serialization;

import com.example.jacksonlearning.model.*;
import org.springframework.boot.test.context.TestComponent;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.UUID;

@TestComponent
public class JacksonTestUtils {

    public BeerDtoToSerialize buildTestDto() {
        return BeerDtoToSerialize.builder()
                .id(UUID.randomUUID())
                .price(new BigDecimal("123.456"))
                .beerName("Random Beer")
                .beerStyle("Lager")
                .ignorable("ignore me 1")
                .ignorable2("ignore me 2")
                .guyUnder190cm(GuyUnder190cm.builder().hello("Hello").build())
                .nullMap(null)
                .notNullMap(new HashMap<>(50))
                .getterProperty("getterProperty")
                .build();
    }

    public Parent buildTestParent() {
        Child firstChild = Child.builder()
                .name("Child 1")
                .build();
        Child secondChild = Child.builder()
                .name("Child 2")
                .build();
        Parent parent = Parent.builder()
                .name("Parent 1")
                .build();
        parent.addChild(firstChild);
        parent.addChild(secondChild);
        return parent;
    }

    public ParentWithJsonIdentityInfo buildTestParentWithJsonIdentiyInfo() {
        ChildWithJsonIdentityInfo firstChild = ChildWithJsonIdentityInfo.builder()
                .name("Child 1")
                .build();
        ChildWithJsonIdentityInfo secondChild = ChildWithJsonIdentityInfo.builder()
                .name("Child 2")
                .build();
        ParentWithJsonIdentityInfo parent = ParentWithJsonIdentityInfo.builder()
                .name("Parent 1")
                .build();
        parent.addChild(firstChild);
        parent.addChild(secondChild);
        return parent;
    }
}
