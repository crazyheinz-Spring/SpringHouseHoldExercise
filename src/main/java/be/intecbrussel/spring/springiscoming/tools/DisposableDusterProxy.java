package be.intecbrussel.spring.springiscoming.tools;

public class DisposableDusterProxy implements CleaningTool {

    public DisposableDusterProxy() {
        System.out.println("proxy constructor");
    }

    @Override
    public void doCleanJob() {
        DisposableDuster duster = new DisposableDuster();
        duster.doCleanJob();
    }
}
