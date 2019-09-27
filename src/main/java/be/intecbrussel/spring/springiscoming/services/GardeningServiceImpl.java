package be.intecbrussel.spring.springiscoming.services;

import be.intecbrussel.spring.springiscoming.tools.GardeningTool;

public class GardeningServiceImpl implements GardeningService {
    private GardeningTool gardeningTool;

    public void init() {

        System.out.println("ge-init");
    }

    public void destroy() {

        System.out.println("destroyed");
    }


    public void setGardeningTool(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
    }

    @Override
    public void garden() {
        System.out.println("working in the garden");
        gardeningTool.doGardenJob();
    }
}
