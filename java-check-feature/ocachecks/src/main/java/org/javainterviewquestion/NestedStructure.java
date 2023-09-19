package org.javainterviewquestion;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class NestedStructure {

}

interface IMyStructure {
    // zwraca węzeł o podanym kodzie lub null
    INode findByCode(String code);
    // zwraca węzeł o podanym rendererze lub null
    INode findByRenderer(String renderer);
    // zwraca liczbę węzłów
    int count();
}

class MyStructure implements IMyStructure {
    private List<INode> nodes;

    public MyStructure(List<INode> nodes) {
        this.nodes = nodes;
    }

    @Override
    public INode findByCode(String code) {
        return this.findByCriteria(code, INode::getCode);
    }

    @Override
    public INode findByRenderer(String renderer) {
        return this.findByCriteria(renderer, INode::getRenderer);
    }

    private INode findByCriteria(String criteria, Function<INode, String> function){
        return this.nodes.stream()
                .filter(node -> Objects.equals(function.apply(node), criteria))
                .findFirst().orElse(null);
    }

    @Override
    public int count() {
        return nodes.size();
    }
}

interface INode {
    String getCode();
    String getRenderer();
}

class NodeImpl implements INode {

    private String code;
    private String renderer;

    public NodeImpl(String code, String renderer) {
        this.code = code;
        this.renderer = renderer;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getRenderer() {
        return this.renderer;
    }
}

interface ICompositeNode extends INode {

    List<INode> getNodes();
}

class CompositeNodeImpl implements ICompositeNode {

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getRenderer() {
        return null;
    }

    @Override
    public List<INode> getNodes() {
        return null;
    }
}
