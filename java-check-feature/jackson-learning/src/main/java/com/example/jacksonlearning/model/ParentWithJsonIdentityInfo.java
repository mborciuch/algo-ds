package com.example.jacksonlearning.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "name")
public class ParentWithJsonIdentityInfo {
    private String name;
    @Builder.Default     private Set<ChildWithJsonIdentityInfo> children = new HashSet<>();

    public void addChild(ChildWithJsonIdentityInfo child){
        this.children.add(child);
        child.setParent(this);
    }
}
