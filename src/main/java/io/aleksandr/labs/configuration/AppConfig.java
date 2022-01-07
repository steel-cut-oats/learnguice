package io.aleksandr.labs.configuration;

import com.google.inject.AbstractModule;
import io.aleksandr.labs.service.ShapeService;
import io.aleksandr.labs.service.impl.SquareService;

public class AppConfig extends AbstractModule {

    @Override
    protected void configure() {
        bind(ShapeService.class).to(SquareService.class);
    }
}
