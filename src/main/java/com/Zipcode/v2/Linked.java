package com.Zipcode.v2;

import java.util.LinkedList;

public class Linked {

    public static void main(String[] args) {

        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("A");
        linkedlist.add("B");
        linkedlist.add("C");

        //Linked linked = new Linked();

       LinkedList rev = Linked.reverse(linkedlist);
        System.out.println(linkedlist);
        System.out.println(rev);

        // Integer size = linkedlist.size();
        // System.out.println(linkedlist.getLast());
    }
      public static  LinkedList reverse(LinkedList<String> linkedListParam) {
          LinkedList<String> newlinkedlist = new LinkedList<>();

          for (int i = linkedListParam.size()-1; i >= 0; i--) {
              //System.out.println(i);
              newlinkedlist.add(linkedListParam.get(i));
              //System.out.println(linkedListParam.get(i));
             // System.out.println(newlinkedlist);
          }


        return newlinkedlist;
      }


}

