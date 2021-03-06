package com.kowi.task.service.diskService;

import com.kowi.task.model.disk.Disk;

import java.util.List;

public interface DiskService {

    List<Disk> getAll();

    Disk get(int id);

    List<Disk> getAllCd();

    List<Disk> getAllDvd();

}
