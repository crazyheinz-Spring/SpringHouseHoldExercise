package be.intecbrussel.spring.springiscoming.services;
import be.intecbrussel.spring.springiscoming.tools.Broom;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;

public class CleaningService {
    private CleaningTool cleaningTool;

    public CleaningService() {
    }

    public CleaningService(CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;

    }

    public void setCleaningTool(CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
    }

    public void clean() {
        System.out.println("Cleaning the house");
        cleaningTool.doCleanJob();
    }
}
