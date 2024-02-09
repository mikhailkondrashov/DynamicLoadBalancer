package org.example;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import org.example.config.ApplicationConfiguration;

public class App extends Application<ApplicationConfiguration> {

    public static void main(final String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public void initialize(final Bootstrap<ApplicationConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ApplicationConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
