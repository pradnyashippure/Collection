package com.qac.collection.List.Arraylist.dao;

import java.util.ArrayList;

import com.qac.collection.List.Arraylist.dto.TrainDTO;

public class TrainDAO {
	ArrayList train = new ArrayList();
	
	public String save (TrainDTO dto) {
		 train.add(dto);
		 return dto.getName()+"data saved";
		  }
	 
	 public TrainDTO getByName(String name) {
		 for(int i =0; i< train.size(); i++) {
			 TrainDTO d = (TrainDTO)train.get(i);
			 if(d.getName().equals(name)) {
				 return d;
				 
			 }
		 }
		return null;
		 
	 }
	 public TrainDTO getByOrigin(String origin) {
		 for(int i =0; i< train.size(); i++) {
			 TrainDTO d = (TrainDTO)train.get(i);
			if(d.getOrigin().equals(origin)) {
				 return d;
		 
	 }
		 }
		return null;
	 }

	public String removeByName(String name) {
		for(int i = 0; i<train.size(); i++) {
			if(train.equals(name)) {
				name =null;
			}
		}
		return "removed name"+" "+name;
		}
	public ArrayList getAll() {
		return train;
		
	}
	}


