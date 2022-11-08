package com.qac.collection.List.linkedlist;

import java.util.LinkedList;

public class FoodLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("Rice");
		list.add("Dosa");
		list.add("Idli");
		list.add("Pizza");
		
		System.out.println(list);
		
		list.add(3,"Palak Paneer");
		list.add(1,"Samosa");
		System.out.println(list);
		
		list.add(5,"Jalebi");
		list.add(0,"Gulab Jamun");
		System.out.println(list);
		
		list.remove(6);
		list.remove("Samosa");
		System.out.println(list);
		System.out.println(list.get(5));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		
	}

}
