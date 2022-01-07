package io.aleksandr.labs;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.aleksandr.labs.configuration.AppConfig;
import io.aleksandr.labs.controller.ShapeController;

public class App {
    private ShapeController controller;

    public App() {
        final Injector injector = Guice.createInjector(new AppConfig()); // initialize the injector

        controller = injector.getInstance(ShapeController.class);
    }

    public static void main(final String[] args) {
        final App app = new App();
        app.controller.draw();
    }
}
