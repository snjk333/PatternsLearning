package com.oleksandr.Behavioral.ChainofResponsibility;

public class MainClass {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        dialog.wikiPageURL = "https://wikipedia.org/";

        Panel panel = new Panel();
        panel.modelHelpText = "Information about Wikipedia";

        dialog.addChild(panel);

        System.out.println("FIRST LEVEL HELP");
        panel.showHelp();

        System.out.println("SECOND LEVEL HELP");
        panel.modelHelpText = null;
        panel.showHelp();
    }
}
