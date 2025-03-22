package com.oleksandr.Structural.Facade.SomeMusicLibrary;

import java.io.File;

public class AudioMixer {

    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
