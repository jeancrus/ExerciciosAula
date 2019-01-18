package application;

import java.util.HashSet;
import java.util.Set;

import entities.Client;

public class program {

	public static void main(String[] args) {
		Set<Client> set = new HashSet<>();
		
		set.add(new Client("TV", 900.0));
		set.add(new Client("Notebook", 1200.0));
		set.add(new Client("Tablet", 400.0));
		
		Client clie = new Client("Notebook", 1200.0);
		
		System.out.println(set.contains(clie));
		
	}
}
