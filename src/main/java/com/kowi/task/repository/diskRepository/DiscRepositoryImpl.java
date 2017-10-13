package com.kowi.task.repository.diskRepository;

import com.kowi.task.model.disk.Disk;
import static com.kowi.task.utils.ProductData.DISKS;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DiscRepositoryImpl implements DiskRepository {


    public List<Disk> getAll() {
       return DISKS;
    }
}
