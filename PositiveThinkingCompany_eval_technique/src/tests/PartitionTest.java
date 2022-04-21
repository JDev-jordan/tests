package tests;

import java.util.ArrayList;
import java.util.List;


import junit.framework.TestCase;
import main.Partition;

public class PartitionTest extends TestCase{

	public void testPpartitionShouldReturnEmptyListWhenTailleNull() {//quand taille = 0
		//initialisation des objets
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
		int taille = 0;
		List<List<Integer>> listFinale = p.partition(list, taille);
		
		//nous verifions que la liste finale est pas vide
		assert(listFinale.isEmpty());
	}
	
	public void testPpartitionShouldReturnEmptyListWhenListEmpty() {//quand la liste est vide
		//initialisation des objets
		Partition p = new Partition();
		List<Integer> list = new ArrayList<>();
		int taille = 2;
		List<List<Integer>> listFinale = p.partition(list, taille);
		
		//nous verifions que la liste finale est pas vide
		assert(listFinale.isEmpty());
	}
	
	public void testPartitionShouldReturnList() {
		//initialisation des objets
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
		int taille = 2;
		List<List<Integer>> listFinale = p.partition(list, taille);
		
		//nous verifions que la liste finale n'est pas vide
		assert(!listFinale.isEmpty());
		//nous verifions que chaque liste intermediaire a une taille inferieure ou egale a la taille demandée
		for(List<Integer> l : listFinale)
			assert(l.size()<=taille);
	}

}

