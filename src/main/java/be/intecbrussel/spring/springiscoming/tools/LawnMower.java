package be.intecbrussel.spring.springiscoming.tools;

public class LawnMower implements GardeningTool {
    @Override
    public void doGardenJob() {
        System.out.println("mowing the lawn");
    }
}
