package io.aleksandr.labs;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.aleksandr.labs.configuration.AppConfig;
import io.aleksandr.labs.controller.CircleController;
import io.aleksandr.labs.controller.SquareController;

public class App {
    private final SquareController squareController;
    private final CircleController circleController;

    public App() {
        final Injector injector = Guice.createInjector(new AppConfig()); // initialize the injector

        squareController = injector.getInstance(SquareController.class);
        circleController = injector.getInstance(CircleController.class);
    }

    public static void main(final String[] args) {
        final App app = new App();
        app.squareController.draw();
        app.circleController.draw();
    }
}
