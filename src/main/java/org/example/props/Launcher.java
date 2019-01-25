package org.example.props;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Objects;

public final class Launcher {

    public static void main(final String[] args) {
        final String propertiesFile = "config.properties";
        final Module mod = Launcher.class.getModule();
        InputStream modResource = null;
        InputStream classResource;
        final String applicationKey = "application.id";

        try {
            modResource = mod.getResourceAsStream(propertiesFile);
        } catch (IOException e) {
            System.err.println(e.getLocalizedMessage());
        }
        classResource = Launcher.class.getResourceAsStream("../../../" + propertiesFile);

        if(Objects.nonNull(modResource) || Objects.nonNull(classResource)) {
            if(Objects.nonNull(modResource)) {
                printProperty(modResource, applicationKey);
            } else {
                printProperty(classResource, applicationKey);
            }
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
