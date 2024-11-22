package com.neoteric.collections.customhashmap;

import java.util.LinkedList;

public class Bucket<k,v> {

    private Node<k,v> head;

    public Bucket() {
        this.head = null;
    }

    public void addOrUpdate(k key, v value){
        Node<k,v> current = head;

        while (current!= null){
            if (current.key.equals(key)){
                current.value = value;
            return;
            }
            current = current.next;
        }

        Node<k, v> newNode = new Node<>(key, value);
        newNode.next = head;
        head = newNode;
    }


    public v get(k key){
        Node<k,v> current = head;
        while (current!= null) {

            if (current.key.equals(key)){
                return current.value;
            }
          current =current.next;
        }
        return null;
    }

    public boolean remove(k key){
        Node<k,v> current = head;
        Node<k,v> prev = null;
        while (current!= null){
            if (current.key.equals(key)){
              if (prev!=null){
                  prev.next = current.next;
              } else {
                  head = current.next;
              }
              return true;
            }
            prev = current;
            current =current.next;
        }
        return false;
    }

    public LinkedList<Node<k,v>> getNodes(){
         LinkedList<Node<k,v>> nodeLinkedList = new LinkedList<>();
         Node<k,v> current = head;
         if (current!=null){
             nodeLinkedList.add(current);
             current = current.next;
         }
         return nodeLinkedList;
    }

}

