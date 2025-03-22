package com.oleksandr.Behavioral.ChainofResponsibility;

public class Panel extends Container{
    String modelHelpText;

    @Override
    public void showHelp() {
        if(modelHelpText != null){
            System.out.println(modelHelpText);
        }
        else{
            super.showHelp();
        }
    }
}
