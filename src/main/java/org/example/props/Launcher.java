package org.example.props;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class Launcher {

    public static void main(String[] args) {
        try {
            final Module mod = Launcher.class.getModule();

            final InputStream modResource = mod.getResourceAsStream("config.properties");

            final Properties props = new Properties();
            props.load(modResource);
            final String applicationId = props.getProperty("application.id");

            System.out.println(applicationId);
        } catch (IOException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
