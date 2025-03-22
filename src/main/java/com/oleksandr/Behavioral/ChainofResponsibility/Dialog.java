package com.oleksandr.Behavioral.ChainofResponsibility;

public class Dialog extends Container{
    String wikiPageURL;

    @Override
    public void showHelp() {
        if(wikiPageURL != null){
            System.out.println(wikiPageURL);
        }
        else{
            super.showHelp();
        }
    }
}
