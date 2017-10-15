package com.kowi.task.repository.diskRepository;

import com.kowi.task.model.disk.Disk;

import java.util.List;

public interface DiskRepository {

    List<Disk> getAll();

    Disk get(int id);
}
