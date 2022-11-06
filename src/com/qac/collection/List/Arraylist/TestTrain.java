package com.qac.collection.List.Arraylist;

import java.util.ArrayList;

import com.qac.collection.List.Arraylist.dao.TrainDAO;
import com.qac.collection.List.Arraylist.dto.TrainDTO;

public class TestTrain {
	public static void main(String[] args) {
		
		TrainDAO dao = new TrainDAO();
		TrainDTO t = new TrainDTO();
		t.setName("Rajdhani Express");
		t.setOrigin("Kolkata");
		t.setDestination("Delhi");
		t.setSpeed(140);
		
		TrainDTO t1 = new TrainDTO();
		t1.setName("Gatimaan Express");
		t1.setOrigin("Delhi");
		t1.setDestination("Jhansi");
		t1.setSpeed(160);
		
		TrainDTO t2 = new TrainDTO();
		t2.setName("Maharaja Express");
		t2.setOrigin("Agra");
		t2.setDestination("Ajanta");
		t2.setSpeed(160);
		
		dao.save(t);
		dao.save(t1);
		dao.save(t2);
		
		TrainDTO response = dao.getByName("Maharaja Express"); 
		System.out.println(response);
		
		TrainDTO response1 = dao.getByOrigin("Kolkata");
		System.out.println(response1);
		
		ArrayList response2 = dao.getAll();
		System.out.println(response2);
		
		String response3 = dao.removeByName("Maharaja Express");
		System.out.println(response3);
		
		
		
	}

}
