package com.oleksandr.Structural.Proxy.SecondExample;

public class Proxy implements ServiceInterface{

    Service realService;

    public Proxy(Service realService) {
        this.realService = realService;
    }

    public boolean checkAccess(){
        return true;
    }

    @Override
    public void operation() {
        if(checkAccess()){
            realService.operation();
        }
    }
}
