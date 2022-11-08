package com.qac.collection.List.linkedlist.dao;

import java.util.LinkedList;

import com.qac.collection.List.linkedlist.dto.TrainDTOLinked;

public class TrainDAOLinked {
	LinkedList train = new LinkedList();
	
	public String save(TrainDTOLinked dto) {
		train.add(dto);
		return dto.getName()+"data saved";
		
	}
	public LinkedList getByName(String name) {
		LinkedList list = new LinkedList();
		for(int i = 0; i< train.size(); i++) {
			TrainDTOLinked d =(TrainDTOLinked)train.get(i);
			if(d.getName().equals(name)) {
				list.add(d);
				}
		}
		return list;
		}
	public LinkedList getByOrigin(String origin) {
		LinkedList l = new LinkedList();
		for(int i =0; i<train.size(); i++) {
			TrainDTOLinked d =(TrainDTOLinked)train.get(i);
			if(d.getOrigin().equals(origin)) {
				l.add(d);
			} 
		}
		return l;
	}
	public String removeByName(String name) {
		for(int i= 0; i< train.size(); i++) {
			if(train.equals(name)) {
				name = null;
			}
		}
		return "removed name"+" "+name;
	}
	public LinkedList getAll() {
		return train;
		
	}
}
