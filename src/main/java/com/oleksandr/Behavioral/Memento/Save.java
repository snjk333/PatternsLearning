package com.oleksandr.Behavioral.Memento;

import java.util.Date;

public class Save {
    private final String version;
    private final Date date;

    public Save(String version) {
        this.version = version;
        date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
