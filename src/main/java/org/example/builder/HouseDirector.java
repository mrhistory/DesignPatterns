package org.example.builder;

public interface HouseDirector {
    HouseDirector changeBuilder(HouseBuilder builder);
    HouseDirector make();
}
