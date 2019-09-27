package be.intecbrussel.spring.springiscoming.tools;

public class DisposableDuster implements CleaningTool {

    private boolean clean = true;

    public DisposableDuster() {
        System.out.println("disposable duster constructor");
    }

    @Override
    public void doCleanJob() {
        if (clean)
            System.out.println("swifferdeswif");
        else
            System.out.println("i'm a dirty dirty duster");
    }


}
