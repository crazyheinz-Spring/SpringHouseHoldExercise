package be.intecbrussel.spring.springiscoming.tools;

public class Broom implements CleaningTool{

    private int timesUsed;

    public Broom() {
        System.out.println("Broom constructor called");

    }

    public void doCleanJob() {
        System.out.printf(" scrub scrub for the " + ++timesUsed + "st time");
    }
}
