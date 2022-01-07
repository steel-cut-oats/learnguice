package io.aleksandr.labs.service.impl;

import io.aleksandr.labs.service.ShapeService;

public class SquareService implements ShapeService {

    @Override
    public String getType() {
        return "square";
    }
}
