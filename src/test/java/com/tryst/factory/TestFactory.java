package com.tryst.factory;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestFactory {
    static Map<String, DogFactoryType> typeMap = new HashMap<String, DogFactoryType>();

    static {
        typeMap.put("poodle", DogFactoryType.POODLE);
        typeMap.put("gioldenretriever", DogFactoryType.GOLDENRETRIEVER);
    }

    @Test
    public void createPoodle() {
        String dogType = "poodle";
            Dog dog = typeMap.get(dogType).create();
            Assert.assertTrue(dog.getName().equalsIgnoreCase("poodle"));
            System.out.println(dog.getName() +" :::"+ dog.toString());

    }

    @Test
    public void createGoldenRetriever() {
        String dogType = "gioldenretriever";
        Dog dog = typeMap.get(dogType).create();
        Assert.assertTrue(dog.getName().equalsIgnoreCase("golden retriever"));
        System.out.println(dog.getName() +" :::"+ dog.toString());

    }

    @Test(expected = RuntimeException.class)
    public void createUnknownDog() {
        String dogType = "unknown";
        Dog dog = typeMap.get(dogType).create();
    }
}
