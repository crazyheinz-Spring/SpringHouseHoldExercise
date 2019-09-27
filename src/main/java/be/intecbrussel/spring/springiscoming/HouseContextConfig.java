package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.*;
import be.intecbrussel.spring.springiscoming.tools.*;
import org.springframework.context.annotation.*;

@Configuration
public class HouseContextConfig {

    @Bean(name="bezem")
    @Scope("prototype")
    public CleaningTool broom() {
        return new Broom();
    }

    @Bean(name="spons")
    @Scope("prototype")
    public CleaningTool sponge() {
        return new Sponge();
    }

    @Bean(name="vacuum")
    @Scope("prototype")
    public CleaningTool vacuum() {
        return new Vacuum();
    }

    @Bean(name="disposable")
    @Scope(value="prototype",proxyMode = ScopedProxyMode.DEFAULT)
    public CleaningTool disposableDuster() {
        return new DisposableDuster();
    }

    @Bean
    public GardeningTool lawnMower() {
        return new LawnMower();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public GardeningService lawnMowerService() {
        GardeningServiceImpl gardeningService = new GardeningServiceImpl();
        gardeningService.setGardeningTool(lawnMower());
        return gardeningService;
    }

    @Bean
    public DomesticService domesticService() {
        DomesticServiceImpl domesticService  = new DomesticServiceImpl();
        domesticService.setCleaningService(broomService());
        domesticService.setGardeningService(lawnMowerService());
        return domesticService;
    }




    @Bean(name="proxy")
    @Scope(value="prototype",proxyMode = ScopedProxyMode.DEFAULT)
    public CleaningTool disposableDusterProxy() {
        return new DisposableDusterProxy();
    }


    @Bean(name="bart")
    @Lazy
    public CleaningService broomService() {
        CleaningService cleaningService = new CleaningService();
        cleaningService.setCleaningTool(new DisposableDuster());
        return cleaningService;

    }

    @Bean(name="suzzy")
    @Lazy
    public CleaningService vacuumService() {
        CleaningService cleaningService = new CleaningService();
        cleaningService.setCleaningTool(broom());
        return cleaningService;
    }

    @Bean(name="elvis")
    @Lazy
    public CleaningService spongeService() {
        CleaningService cleaningService = new CleaningService();
        cleaningService.setCleaningTool(broom());
        return cleaningService;
    }
}
