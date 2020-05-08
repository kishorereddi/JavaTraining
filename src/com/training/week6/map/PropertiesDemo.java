package com.training.week6.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();//Creates empty properties object
        //Properties properties2 = new Properties(properties);//Creates equivalent properties object

        String propFileName = "Training.properties";
        FileInputStream fis = new FileInputStream(propFileName);
        properties.load(fis);

        properties.setProperty("key5", "keystore3");

        FileOutputStream fos = new FileOutputStream("NewPropFile.prop");
        properties.store(fos, "Saved on 03/20 7:29pm");

        System.out.println("Properties file updates successfully");

    }
}
