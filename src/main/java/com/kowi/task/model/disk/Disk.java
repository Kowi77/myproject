package com.kowi.task.model.disk;

import com.kowi.task.model.Product;

public class Disk extends Product {

    private DiskType type;

    private DiskContent content;

    public Disk(String name, double price, String barcode, DiskType type, DiskContent content) {
        super(name, price, barcode);
        this.type = type;
        this.content = content;
    }

    public Disk(Integer id, String name, double price, String barcode, DiskType type, DiskContent content) {
        super(id, name, price, barcode);
        this.type = type;
        this.content = content;
    }

    public DiskType getType() {
        return type;
    }

    public void setType(DiskType type) {
        this.type = type;
    }

    public DiskContent getContent() {
        return content;
    }

    public void setContent(DiskContent content) {
        this.content = content;
    }
}
