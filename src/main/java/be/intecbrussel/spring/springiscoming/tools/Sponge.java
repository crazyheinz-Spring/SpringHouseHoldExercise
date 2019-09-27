package be.intecbrussel.spring.springiscoming.tools;

public class Sponge implements CleaningTool {

    public Sponge() {
        System.out.println("sponge constrtuctor called");
    }

    @Override
    public void doCleanJob() {
        System.out.println("squeek squeek");
    }
}
