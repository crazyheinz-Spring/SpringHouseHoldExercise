package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.CleaningService;
import be.intecbrussel.spring.springiscoming.services.DomesticService;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import be.intecbrussel.spring.springiscoming.tools.DisposableDuster;
import be.intecbrussel.spring.springiscoming.tools.DisposableDusterProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {
    public static void main(String[] args) {


      try (ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(HouseContextConfig.class)) {


          System.out.println("container initialised");
          DomesticService service = applicationContext.getBean("domesticService",DomesticService.class);
          service.runHouseHold();



          /*
          CleaningService cleaningService = applicationContext.getBean("bart",CleaningService.class);
          cleaningService.clean();
          cleaningService.clean();
          cleaningService.clean();
          */

          /*


          CleaningService cleaningService = new CleaningService();
          cleaningService.setCleaningTool(new DisposableDusterProxy());
          cleaningService.clean();

           */



          /**
          cleaningService.clean();
          cleaningService.clean();
          cleaningService.clean();
          CleaningTool broom = applicationContext.getBean("bezem",CleaningTool.class);
          broom.doCleanJob();
          CleaningTool sponge = applicationContext.getBean("spons",CleaningTool.class);
          sponge.doCleanJob();
          CleaningTool vacuum = applicationContext.getBean("vacuum",CleaningTool.class);
          vacuum.doCleanJob();
           */

      }


        /**
        CleaningTool cleaningTool = applicationContext.getBean("broom",CleaningTool.class);
        cleaningTool.doCleanJob();

         */






    }
}
