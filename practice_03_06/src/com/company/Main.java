package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, -10, 5, 1);
        System.out.println(findMaxOccuredElt(numbers));
        System.out.println(findSingleNumber(numbers));
    }

    //написать метод, возвращающий элемент из списка, встречающийся наибольшее количество раз
    // 1,5, -10,1-> 1
    public static int findMaxOccuredElt(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : numbers) {

            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num,1);
            }

        }
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }

    //написать метод, возвращающий элемент из списка не имеющий пары
    //public int findSingleNumber(List<Integer>numbers)
    // 1,2,1->2,  1,1,1->1
    public static int findSingleNumber(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : numbers) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num,1);
            }


        }
        boolean found = false;
        int single = 0;
        for (Map.Entry entrySet: map.entrySet()) {
            if (entrySet.getValue().equals(1)){
                found = true;
                single = (int) entrySet.getKey();
                break;
            } else {
                found = true;
                single = (int) entrySet.getKey();
            }

        }
        if (found) return single;

      return -1;
    }

    //3. Написать метод, который принимает список имен и их анаграмм и имя по
    // которому он выдает список всех его анаграмм, включая само имя
    //  public List<String>anagramList(String str, List<String>strings)
    //{"ivan","airam","vani","vian","maria","kolya"}, ivan -> {ivan,vani,vian}

    public static List<String> anagramList(String str, List<String>strings) {
        List<String> listOfAnargrams = new ArrayList<>();
        for (String name: strings) {
            if (name.equals(str)) {
                listOfAnargrams.add(name);
            }
            if (isAnagram(str,name) && !name.equals(str)) {
                listOfAnargrams.add(name);
            }

        }
        return listOfAnargrams;

    }

    static boolean  isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

}
