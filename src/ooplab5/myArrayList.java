package ooplab5;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        //ArrayList
        ArrayList list = new ArrayList();
        String name = "jane";
        list.add(name);
        System.out.println(list);
        list.add("bow");
        list.add("feem");
        System.out.println(list);
        list.add(2,"po");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(10.10);
        System.out.println(list);
        list.remove("bow");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.indexOf("po"));



    }//main
}//class