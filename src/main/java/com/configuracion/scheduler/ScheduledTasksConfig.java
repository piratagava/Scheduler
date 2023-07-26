package com.configuracion.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasksConfig {

   private static final String TIME_ZONE = "America/Mexico_City";

   @Scheduled(cron = "* * 9 * * *", zone = TIME_ZONE)
   public void performTaskUsingCron() {
      System.out.println("La tarea se ejecutó a las 9 am");
   }
}
