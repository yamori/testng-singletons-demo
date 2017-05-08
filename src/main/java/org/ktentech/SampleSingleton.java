package org.ktentech;

/**
 * Created by matthew.kindzerske on 5/8/2017.
 */
public class SampleSingleton {
    private static SampleSingleton ourInstance = new SampleSingleton();
    private String instanceTime = String.valueOf(System.currentTimeMillis());

    public static SampleSingleton getInstance() {
        return ourInstance;
    }

    private SampleSingleton() {
        // Hides the constructor
    }

    public String getInstanceTimeMS() {
        return ourInstance.instanceTime;
    }
}
