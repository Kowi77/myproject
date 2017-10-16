package com.kowi.task.repository.diskRepository;

import com.kowi.task.model.disk.Disk;

import static com.kowi.task.model.disk.DiskType.CD;
import static com.kowi.task.model.disk.DiskType.DVD;
import static com.kowi.task.utils.ProductData.DISKS;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DiscRepositoryImpl implements DiskRepository {


    public List<Disk> getAll() {
       return DISKS;
    }

    @Override
    public Disk get(int id) {
        return DISKS.stream().filter(b -> b.getId() == id).findFirst().get();
    }

    @Override
    public List<Disk> getAllCd() {
        return DISKS.stream().filter(b -> b.getType() == CD).collect(Collectors.toList());
    }

    @Override
    public List<Disk> getAllDvd() {
        return DISKS.stream().filter(b -> b.getType() == DVD).collect(Collectors.toList());
    }
}
