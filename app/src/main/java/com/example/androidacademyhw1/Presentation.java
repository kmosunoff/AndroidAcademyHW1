package com.example.androidacademyhw1;

public class Presentation {

    private Speaker speaker;
    private String name;
    private String description;

    public Presentation(Speaker speaker, String name, String description) {
        this.speaker = speaker;
        this.name = name;
        this.description = description;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
