package com.tryst.factory;

public enum DogFactoryType {

    POODLE("POODLE") {
        @Override
        public Dog create() {
            return new Poodle();
        }
    },
    GOLDENRETRIEVER("GOLDENRETRIEVER") {
        @Override
        public Dog create() {
            return new GoldenRetriever();
        }
    };

    private DogFactoryType( String type )
    {
        this.type = type;
    }

    private String type;


    public abstract Dog create();

    public String getType()
    {
        return type;
    }

    @Override
    public String toString()
    {
        return "DOG Type "+type;
    }
}
