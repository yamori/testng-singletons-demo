package org.ktentech;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by matthew.kindzerske on 5/8/2017.
 */
public class ThirdTestNG {

    @Test
    public void testMethod() {
        String className = this.getClass().getSimpleName();

        SampleSingleton sampleSingleton = SampleSingleton.getInstance();
        System.out.println(sampleSingleton.getInstanceTimeMS() + " " + className);

        // Pause for effect
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        Assert.assertEquals(true, true);
    }
}
