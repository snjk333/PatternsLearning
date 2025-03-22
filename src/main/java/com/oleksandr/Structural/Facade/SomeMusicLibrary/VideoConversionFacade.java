package com.oleksandr.Structural.Facade.SomeMusicLibrary;

import com.oleksandr.Structural.Facade.SomeMusicLibrary.Codecs.Codec;
import com.oleksandr.Structural.Facade.SomeMusicLibrary.Codecs.CodecFactory;
import com.oleksandr.Structural.Facade.SomeMusicLibrary.Codecs.MPEG4CompressionCodec;
import com.oleksandr.Structural.Facade.SomeMusicLibrary.Codecs.OggCompressionCodec;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
