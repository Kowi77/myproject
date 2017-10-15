package com.kowi.task.controller;

import com.kowi.task.model.books.CockBook;
import com.kowi.task.model.books.EsotericBook;
import com.kowi.task.model.books.ProgramBook;
import com.kowi.task.model.disk.Disk;
import com.kowi.task.service.bookService.CockBookServiceImpl;
import com.kowi.task.service.bookService.EsotericBookServiceImpl;
import com.kowi.task.service.bookService.ProgramBookServiceImpl;
import com.kowi.task.service.diskService.DiskServiceImpl;
import com.kowi.task.utils.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import static com.kowi.task.utils.ProductData.*;

@RestController
@ComponentScan("com.kowi.task.*")
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class MainRestController extends AbstractController {


    @GetMapping("/cockbook/{id}")
    CockBook getCockBook (@PathVariable("id") int id){
        return cockBookService.get(id);
    }
    @GetMapping("/programbook/{id}")
    ProgramBook getProgramBook (@PathVariable("id") int id){
        return programBookService.get(id);
    }
    @GetMapping("/esotericbook/{id}")
    EsotericBook getEsotericBook (@PathVariable("id") int id){
        return esotericBookService.get(id);
    }
    @GetMapping("/disk/{id}")
    Disk getDisk (@PathVariable("id") int id){
        return diskService.get(id);
    }





}
