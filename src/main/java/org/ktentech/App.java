package org.ktentech;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        SampleSingleton sampleSingleton = SampleSingleton.getInstance();
        System.out.println(sampleSingleton.getInstanceTimeMS());
    }
}
