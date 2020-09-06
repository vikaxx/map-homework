package ua.alevel.task3;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    Map<String, String> map = new HashMap<>();

    public void replaceKeyValue() {
        Map<String, String> newMap = new HashMap<>();

        for (Map.Entry<String, String> current : map.entrySet()) {
            String newValue = current.getKey();
            String newKey = current.getValue();
            newMap.put(newKey,newValue);
        }
        this.map.clear();
        this.map = newMap;
    }

    public void print() {
        for (Map.Entry<String, String> current : map.entrySet()) {
            System.out.println("key =  " + current.getKey() + ", value = " + current.getValue());
        }
    }


    public static void main(String[] args) {
        MyMap myMap = new MyMap();
        myMap.map.put("1 - Ukraine", "Kyiv");
        myMap.map.put("2 - Poland", "Warsaw");
        myMap.map.put("3 - Norway", "Oslo");
        myMap.map.put("4 - Sweden", "Stockholm");
        myMap.map.put("5 - USA", "Washington");

        myMap.print();
        myMap.replaceKeyValue();

        System.out.println();
        myMap.print();
    }

}
