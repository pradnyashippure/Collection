package com.qac.collection.List.linkedlist;

import java.util.LinkedList;

import com.qac.collection.List.linkedlist.dao.TrainDAOLinked;
import com.qac.collection.List.linkedlist.dto.TrainDTOLinked;

public class TestTrainLinked {
	public static void main(String[] args) {
		TrainDTOLinked t = new TrainDTOLinked();
		t.setName("Tejas Express");
		t.setOrigin("Mumbai");
		t.setDestination("Banglore");
		t.setSpeed("160kmph");
		
		TrainDTOLinked t1 = new TrainDTOLinked();
		t1.setName("Humsafar Express");
		t1.setOrigin("Kolkata");
		t1.setDestination("Chennai");
		t1.setSpeed("120kmph");
		
		TrainDTOLinked t2 = new TrainDTOLinked();
		t2.setName("Duronto Express");
		t2.setOrigin("Sealdah");
		t2.setDestination("New Delhi");
		t2.setSpeed("140kmph");
		
		TrainDAOLinked dao = new TrainDAOLinked();
		dao.save(t);
		dao.save(t1);
		dao.save(t2);
		
		 LinkedList result = dao.getByName("Tejas Express");
		 System.out.println(result);
		 
		 LinkedList r = dao.getByOrigin("Kolkata");
		 System.out.println(r);
		  
		 String r2 = dao.removeByName("Humsafar Express");
		 System.out.println(r2);
		 
		 LinkedList rs = dao.getAll();
		 System.out.println(rs);
		  
		  
	}

}
