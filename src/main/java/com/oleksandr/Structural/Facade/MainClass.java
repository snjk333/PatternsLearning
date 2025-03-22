package com.oleksandr.Structural.Facade;

import com.oleksandr.Structural.Facade.SomeMusicLibrary.VideoConversionFacade;

import java.io.File;

public class MainClass {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
