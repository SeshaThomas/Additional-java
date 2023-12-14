package com.srccodes.example;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;


	class Event1 implements Comparable<Event1> {
	    private String name;
	    private LocalDate date;

	    public Event1(String name,LocalDate date) {
	        this.name = name;
	        this.date = date;
	    }

	    public String getName() {
	        return name;
	    }

	    public LocalDate getDate() {
	        return date;
	    }

	    @Override
	    public int compareTo(Event1 other) {
	        // Compare events based on their dates
	        return other.getDate().compareTo(this.getDate());
	    }
	
}
 public class ArrayEvent{
	 public static void main(String[] args) {
	     
	        Event1 music1 = new Event1("Music1", LocalDate.of(2023, 01, 01));
	        Event1 music2 = new Event1("Music2",  LocalDate.of(2023, 01, 02));
	        Event1 concert1 = new Event1("Concert1", LocalDate.of(2023, 01, 03));
	        Event1 sports1 =new Event1("Sports1", LocalDate.of(2023, 01, 04));
	        ArrayList<Event1> events = new ArrayList<>();
    events.add(music1);
    events.add(music2);
    events.add(concert1);
    events.add(sports1);
    
    Collections.sort(events);
    
    for (Event1 event : events) {
        System.out.println(event.getName() + " - " + event.getDate());
    }

	 }}
	
