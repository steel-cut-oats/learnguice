package io.aleksandr.labs.configuration;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import io.aleksandr.labs.service.ShapeService;
import io.aleksandr.labs.service.impl.CircleService;
import io.aleksandr.labs.service.impl.SquareService;

public class AppConfig extends AbstractModule {

    @Provides
    @Named("squareService")
    public ShapeService provideSquareService(final SquareService service) {
        return service;
    }

    @Provides
    @Named("circleService")
    public ShapeService provideCircleService(final CircleService service) {
        return service;
    }
}
