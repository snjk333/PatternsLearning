package com.oleksandr.Behavioral.ChainofResponsibility;

public class Container extends Component{
    private Component children;

    public void addChild(Component children) {
        this.children = children;
        children.container = this;
    }

}
