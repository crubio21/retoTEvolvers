package util;

import models.Credentials;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class ReadCredentialsWeb {
    private ReadCredentialsWeb() {
    }

    public static String with(String value) {
        Properties property = new Properties();
        InputStream inputstream = null;
        try {
            inputstream = new FileInputStream("src/test/resources/properties/credentials.properties");
            property.load(inputstream);
        } catch (Exception e) {
            Logger.getLogger(Credentials.class.getName()).info(e.getMessage());
        }
        return property.getProperty(value);
    }
}
