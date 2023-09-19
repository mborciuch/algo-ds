package com.example.jacksonlearning.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Parent {
    private String name;
    @Builder.Default @JsonManagedReference
    private Set<Child> children = new HashSet<>();

    public void addChild(Child child){
        this.children.add(child);
        child.setParent(this);
    }
}
