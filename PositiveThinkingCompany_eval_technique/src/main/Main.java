package main;

import java.util.ArrayList;
import java.util.List;

import services.Partition;

public class Main {

	public static void main(String[] args) {
		Partition p = new Partition();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(8);
		list.add(3);
		list.add(9);
		list.add(7);
		list.add(2);
		list.add(6);
		list.add(5);
		int taille = 4;
		List<List<Integer>> listFinale = p.partition(list, taille);
		System.out.print("List : ");
		System.out.println(list.toString());
		System.out.println("Taille : " + taille);
		System.out.print("Partitions : ");
		System.out.println(listFinale.toString());
	}

}
