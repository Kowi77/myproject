package com.kowi.task;

import com.kowi.task.service.bookService.CockBookServiceImpl;
import com.kowi.task.service.bookService.EsotericBookServiceImpl;
import com.kowi.task.service.bookService.ProgramBookServiceImpl;
import com.kowi.task.service.diskService.DiskServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
@ComponentScan("com.kowi.task.*")
@Configuration
public class AppInit {

    @Autowired
    private CockBookServiceImpl cockBookService;
    @Autowired
    private ProgramBookServiceImpl programBookService;
    @Autowired
    private EsotericBookServiceImpl esotericBookService;
    @Autowired
    private DiskServiceImpl diskService;


    public AppInit() {
    }

    @RequestMapping("/")
    String home() {
        return "redirect:shop";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppInit.class, args);
    }

}