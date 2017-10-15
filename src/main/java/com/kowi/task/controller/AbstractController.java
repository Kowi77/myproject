package com.kowi.task.controller;

import com.kowi.task.service.bookService.CockBookServiceImpl;
import com.kowi.task.service.bookService.EsotericBookServiceImpl;
import com.kowi.task.service.bookService.ProgramBookServiceImpl;
import com.kowi.task.service.diskService.DiskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan("com.kowi.task.*")
public class AbstractController {

    @Autowired
    public CockBookServiceImpl cockBookService;
    @Autowired
    public ProgramBookServiceImpl programBookService;
    @Autowired
    public EsotericBookServiceImpl esotericBookService;
    @Autowired
    public DiskServiceImpl diskService;

}
