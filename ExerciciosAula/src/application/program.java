package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Client;

public class program {

	public static void main(String[] args) {
		Set<Client> set = new TreeSet<>();
		
		set.add(new Client("TV", 900.0));
		set.add(new Client("Notebook", 1200.0));
		set.add(new Client("Tablet", 400.0));
		
		for (Client c: set) {
			System.out.println(c);
		}
	}
}
