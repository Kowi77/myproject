package com.kowi.task.service.diskService;

import com.kowi.task.model.disk.Disk;
import com.kowi.task.repository.diskRepository.DiscRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiskServiceImpl implements DiskService{

    DiscRepositoryImpl repository;

    @Autowired
    public DiskServiceImpl(DiscRepositoryImpl repository) {
        this.repository = repository;
    }

    public List<Disk> getAll() {
        return repository.getAll();
    }
}
