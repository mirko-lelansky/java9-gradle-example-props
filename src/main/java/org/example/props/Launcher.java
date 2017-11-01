package org.example.props;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class Launcher {

    public static void main(String[] args) {
        final String propertiesFile = "config.properties";
        final String applicationKey = "application.id";

        final InputStream classResource = Launcher.class.getResourceAsStream("../../../" + propertiesFile);


        if(classResource != null) {
            printProperty(classResource, applicationKey);
        } else {
            throw new IllegalStateException("One resource should be found.");
        }
    }

    private static void printProperty(final InputStream propertyStream, final String key) {
        final Properties props = new Properties();
        try {
            props.load(propertyStream);
            final String value = props.getProperty(key);
            System.out.println(value);
        } catch (IOException e) {
            System.err.println(e.getLocalizedMessage());
        }

    }
}
