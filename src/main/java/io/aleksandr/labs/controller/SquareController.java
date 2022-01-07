package io.aleksandr.labs.controller;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import io.aleksandr.labs.service.ShapeService;

public class SquareController {
    private final ShapeService service;

    @Inject
    public SquareController(@Named("squareService") final ShapeService service) {
        this.service = service;
    }

    public void draw() {
        System.out.println("this is a " + service.getType());
    }
}