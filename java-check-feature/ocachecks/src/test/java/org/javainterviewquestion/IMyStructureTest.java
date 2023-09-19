package org.javainterviewquestion;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IMyStructureTest {

    @Test
    void findOneNodeByCodeThenSuccess() {

        List<INode> nodes = new ArrayList<>();
        INode node = new NodeImpl("code1", "render1");
        nodes.add(node);

        MyStructure myStructure = new MyStructure(nodes);

        INode nodeByCode = myStructure.findByCode("code1");

        assertNotNull(nodeByCode);
    }

    @Test
    void getNullNodeByCodeThenSuccess() {

        List<INode> nodes = new ArrayList<>();
        INode node = new NodeImpl("code1", "render1");
        nodes.add(node);

        MyStructure myStructure = new MyStructure(nodes);

        INode nodeByCode = myStructure.findByCode("code2");

        assertNull(nodeByCode);
    }

}
