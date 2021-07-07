package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();
    static{
        //load the file into FileInputStream
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            //load properties object with the file(config.properties)
            properties.load(file);
            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in Config.properties");
            // e.printStackTrace();
        }
    }
    //use the above created logic to create a reusable static method
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);

    }
}
