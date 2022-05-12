package com.tugas;

import java.util.TreeMap;
import java.util.TreeSet;

public class Tugas1 {

	public static void main(String[] args) {

		TreeSet<String> fruits = new TreeSet<>();
		fruits.add("pisang");
		fruits.add("pepaya");
		fruits.add("semangka");
		fruits.add("melon");
		fruits.add("mangga");

		System.out.println("============================");
		System.out.println("Buah yang sering saya beli: ");
		System.out.println("============================");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		System.out.println("===========================");
		System.out.println("My Teamwork :");
		System.out.println("===========================");
		TreeMap<Integer, String> peoples = new TreeMap<>();

		peoples.put(1, "Adi");
		peoples.put(2, "Jul");
		peoples.put(3, "Ugi");
		peoples.put(4, "Ryan");
		peoples.put(5, "Joni");

		for (Integer key : peoples.keySet()) {
			System.out.println(key + "." + peoples.get(key));
		}

	}

}
