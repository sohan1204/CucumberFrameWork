package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readFile {
    public static Properties loadPropertiesFile(String filePath) {
        Properties properties = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream(filePath);
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return properties;
    }
}
