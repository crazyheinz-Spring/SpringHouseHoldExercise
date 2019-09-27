package be.intecbrussel.spring.springiscoming.tools;

public class Vacuum implements CleaningTool{

    public Vacuum() {
        System.out.println("Vaccum constructor called");
    }

    @Override
    public void doCleanJob() {
        System.out.println("bhhhhhhshhshshhshshsh");
    }
}
