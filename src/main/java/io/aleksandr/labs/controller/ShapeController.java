package io.aleksandr.labs.controller;

import com.google.inject.Inject;
import io.aleksandr.labs.service.ShapeService;

public class ShapeController {
    private ShapeService service;

    @Inject
    public ShapeController(final ShapeService service) {
        this.service = service;
    }

    public void draw() {
        service.getType();
    }
}