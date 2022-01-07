package io.aleksandr.labs;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.aleksandr.labs.configuration.AppConfig;
import io.aleksandr.labs.service.ShapeService;
import io.aleksandr.labs.service.impl.SquareService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareServiceTest {
    private ShapeService service;

    @Before
    public void init() {
        final Injector injector = Guice.createInjector(new AppConfig()); // initialize the injector

        service = injector.getInstance(SquareService.class);
    }

    @Test
    public void test() {
        final String type = service.getType();
        assertEquals("square", type);
    }
}
