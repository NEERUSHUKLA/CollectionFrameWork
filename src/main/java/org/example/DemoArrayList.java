package org.example;

import java.util.*;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);

        for(int x : al){
            System.out.println(x);
        }

        al.remove(1);
        System.out.println(al);

        //add element at a index
        al.add(2 , 20);
        //jo 2 index pr tha vo aage khisak jayega or 2 vha add ho jayega
        al.add(2,30);
        System.out.println(al);

        //set is only used to replace value ar particular index
        al.set(2,50);
        System.out.println(al);
//        al.set(4,44); // exception because 4 index exist nhi karta hai
        System.out.println(al);

        ArrayList<Integer> list = new ArrayList<>(200);
        System.out.println(list.size());

        //to reduce arraylist size to avoid space wastage
        list.trimToSize();

        //ways to create arraylist
        //1
        List<Integer> l1 = new ArrayList<>();
        //2
        ArrayList<Integer> l2 = new ArrayList<>();
        //3
        List<String> l3 = Arrays.asList("Apple" , "banana");
        System.out.println(l3);
//        l3.add("orange"); not possible
        //add ooperation is not possible in list created by asList() functioin this returns a fixed size arraylist only modification allowed

        //4  - convert array to list
        String[] arr = {"apple" , "banana" , "mango"};
        List<String> l4 = Arrays.asList(arr);
        System.out.println(l4);

        //5 id returns a fixed length list which is unmodifiable
        List<Character> l5 = List.of('a' , 'b' , 'c');
        System.out.println(l5);
//        l5.add(3,'d');  not possible
//        l5.set(2,'f');  also not possible


        //REMOVE ELEMENTS

        ArrayList<Integer> l6 = new ArrayList<>();
        l6.add(10);
        l6.add(20);
        l6.add(30);
        l6.remove(2) ; //remove element present at index 2
        System.out.println(l6);

        l6.remove(Integer.valueOf(10)); // this will remove first occurence of 10
        System.out.println(l6);

        //convert list to array

        ArrayList<Integer> l7 = new ArrayList<>();
        Integer[] arr1 = l7.toArray(new Integer[0]);


        l7.add(4);
        l7.add(10);
        l7.add(9);
        l7.add(42);
        l7.add(22);
        System.out.println(l7);

//        Collections.sort(l7);
        System.out.println(l7);

        l7.sort(null); //it will sort list by natural order null defines natural order ascending
        System.out.println(l7);


    }
}
