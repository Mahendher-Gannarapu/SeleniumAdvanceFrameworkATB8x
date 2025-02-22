//data properties will be fetch by properties reader
package com.mahendhergannarapu.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    //readKey function automatically read data from the data.properties
    public static String readKey(String key)  {
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/data.properties");

            Properties p = new Properties();
            p.load(fileInputStream);
            return p.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
