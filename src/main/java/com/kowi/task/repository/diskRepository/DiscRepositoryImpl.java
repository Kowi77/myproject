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

    @Override
    public Disk get(int id) {
        return DISKS.stream().filter(b -> b.getId() == id).findFirst().get();
    }
}
