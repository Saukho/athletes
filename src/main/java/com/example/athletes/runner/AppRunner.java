package com.example.athletes.runner;

import com.example.athletes.services.CoachService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

//    private final CoachService coachService;
//    public AppRunner(CoachService coachService) {
//        this.coachService = coachService;
//    }

    public AppRunner(){

    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
     //   coachService.updateById(2);
    }

}