package com.kowi.task.controller;

import com.kowi.task.model.books.CockBook;
import com.kowi.task.model.books.EsotericBook;
import com.kowi.task.model.books.ProgramBook;
import com.kowi.task.model.disk.Disk;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Main Controller
 */

@RestController
@ComponentScan("com.kowi.task.*")
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class MainRestController extends AbstractController {


    @GetMapping("cockbook/{id}")
    CockBook getCockBook (@PathVariable("id") int id){
        return cockBookService.get(id);
    }

    @GetMapping("cockbook")
    List<CockBook> getCockBooks () {return cockBookService.getAll();}

    @GetMapping("programbook/{id}")
    ProgramBook getProgramBook (@PathVariable("id") int id){
        return programBookService.get(id);
    }

    @GetMapping("programbook")
    List<ProgramBook> getProgramBook () {return programBookService.getAll();}

    @GetMapping("esotericbook/{id}")
    EsotericBook getEsotericBook (@PathVariable("id") int id){
        return esotericBookService.get(id);
    }

    @GetMapping("esotericbook")
    List<EsotericBook> getesotericBook () {return esotericBookService.getAll();}

    @GetMapping({"cddisk/{id}", "dvddisk/{id}"})
    Disk getDisk (@PathVariable("id") int id){
        return diskService.get(id);
    }

    @GetMapping("cddisk")
    List<Disk> getAllCdDisk () {return diskService.getAllCd();}

    @GetMapping("dvddisk")
    List<Disk> getAllDvdDisk () {return diskService.getAllDvd();}
}
