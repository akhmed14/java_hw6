package seminar6.cw2;

import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
public class cw2 {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>(Arrays.asList("qwe","asd","qwe","x"));
        ArrayList <String> list2 = new ArrayList<>(Arrays.asList("v","qwe"));
        Map<String, Integer> mapList = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            mapList.putIfAbsent(list1.get(i), 0);
            mapList.put(list1.get(i), mapList.get(list1.get(i))+1);
        }
        for (int i = 0; i < list2.size(); i++) {
            mapList.putIfAbsent(list2.get(i), 0);
            mapList.put(list2.get(i), mapList.get(list2.get(i))+1);
        }
        Set<String> setList = new HashSet<>(list1);
        setList.retainAll(new HashSet<>(list2));
        if (setList.size() > 0) {
            for (String el : setList) {
                System.out.printf("%s = %d%n", el, mapList.get(el));
            }
        }else System.out.println("Пересечений нет!");
    }
}
