package com.oleksandr.Behavioral.Memento;

import java.util.Date;

public class Project {

    private String version;
    private Date date;

    public void serVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        this.version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project:" +
                "\nVersion='" + version +
                "\n, date=" + date + '\n';
    }

}
