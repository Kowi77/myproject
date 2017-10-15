package com.kowi.task.utils;

import com.kowi.task.model.books.CockBook;
import com.kowi.task.model.books.EsotericBook;
import com.kowi.task.model.books.ProgramBook;
import com.kowi.task.model.disk.Disk;
import static com.kowi.task.model.disk.DiskContent.*;
import static com.kowi.task.model.disk.DiskType.*;

import java.util.Arrays;
import java.util.List;

/**
 * Hardcode test data
 */

public class ProductData {

    public static final CockBook COCK_BOOK_1 =new CockBook(1,"Книга о вкусной и здоровой пище", 23.15, "0923879203", 99, "Капуста");
    public static final CockBook COCK_BOOK_2 =new CockBook(2,"Жарим мясо", 16.22, "0983452342345", 154, "Мясо");
    public static final List<CockBook> COCK_BOOKS = Arrays.asList(COCK_BOOK_1, COCK_BOOK_2);

    public static final EsotericBook ESOTERIC_BOOK_1 =new EsotericBook(3,"Пойми необъяснимое", 3.65, "1245623456", 907, 45);
    public static final EsotericBook ESOTERIC_BOOK_2 =new EsotericBook(4,"Ничего не поймете в этой книге", 88, "392456093486", 4, 3);
    public static final List<EsotericBook> ESOTERIC_BOOKS = Arrays.asList(ESOTERIC_BOOK_1, ESOTERIC_BOOK_2);

    public static final ProgramBook PROGRAM_BOOK_1 =new ProgramBook(5,"JAVA", 113.05, "3465493876", 556, "Java");
    public static final ProgramBook PROGRAM_BOOK_2 =new ProgramBook(6,"Коротко о C++", 88.56, "9324798372", 1556, "C++");
    public static final List<ProgramBook> PROGRAM_BOOKS = Arrays.asList(PROGRAM_BOOK_1, PROGRAM_BOOK_2);

    public static final Disk DISK_1 =new Disk(7,"JAVA", 634.54, "92374612367", CD, SOFTWARE);
    public static final Disk DISK_2 =new Disk(8,"Great hits", 234.3, "131723923459", CD, MUSIC);
    public static final Disk DISK_3 =new Disk(9,"Best films", 543.65, "398756093", DVD, VIDEO);
    public static final List<Disk> DISKS = Arrays.asList(DISK_1, DISK_2, DISK_3);

    public static final String[] CATEGORIES = new String[]{"Книги по кулинарии", "Книги по программированию", "Книги по эзотерике", "Диски"};

}
