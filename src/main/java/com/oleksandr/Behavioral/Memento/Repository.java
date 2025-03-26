package com.oleksandr.Behavioral.Memento;

public class Repository {

    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
