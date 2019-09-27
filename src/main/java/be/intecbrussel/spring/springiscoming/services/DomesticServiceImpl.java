package be.intecbrussel.spring.springiscoming.services;

public class DomesticServiceImpl implements DomesticService {
    private CleaningService cleaningService;
    private GardeningService gardeningService;

    public DomesticServiceImpl() {
    }

    public void setCleaningService(CleaningService cleaningService) {
        this.cleaningService = cleaningService;
    }

    public void setGardeningService(GardeningService gardeningService) {
        this.gardeningService = gardeningService;
    }

    @Override
    public void runHouseHold() {
        System.out.println("household started");
        cleaningService.clean();
        gardeningService.garden();
    }
}
