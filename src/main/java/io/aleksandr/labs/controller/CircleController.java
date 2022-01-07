package io.aleksandr.labs.controller;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import io.aleksandr.labs.service.ShapeService;

public class CircleController {
    private final ShapeService service;

    @Inject
    public CircleController(@Named("circleService") final ShapeService service) {
        this.service = service;
    }

    public void draw() {
        System.out.println("this is a " + service.getType());
    }
}