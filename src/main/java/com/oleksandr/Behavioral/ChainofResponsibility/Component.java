package com.oleksandr.Behavioral.ChainofResponsibility;

public class Component implements ComponentWithContextualHelp{

    public Container container;
    public String tooltipText;

    @Override
    public void showHelp() {
        if(tooltipText != null) {
            System.out.println(tooltipText);
        }
        else{
            container.showHelp();
        }
    }
}
