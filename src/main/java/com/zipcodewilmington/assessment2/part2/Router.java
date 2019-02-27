package com.zipcodewilmington.assessment2.part2;
import apple.laf.JRSUIUtils;

import java.util.*;

public class Router {
    private Integer size;
    Map<String, String> router= new HashMap<>();

    public void add(String path, String controller) {

        router.put(path, controller);
    }


    public Integer size() {

        return router.keySet().size();
    }

    public String getController(String path) {
        return router.get(path);
    }

    public void update(String path, String studentController)
    {
        router.put(path, studentController);
    }


    public void remove(String path) {
        router.put(path, null);
    }
    public String toString(){
        String str = "";

        for(String path : router.keySet()){
            str = str + path +  "-> " + router.get(path) + "\n";
        }
        return str;
    }

}
