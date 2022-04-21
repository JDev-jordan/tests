package main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Partition {

	public List<List<Integer>> partition(List<Integer> list, int taille) {
		if(taille == 0 || list == null || list.isEmpty())return Collections.emptyList();
		List<List<Integer>> listFinale = new ArrayList<>();
		List<Integer> listIntermediaire = new ArrayList<>();
		while(!list.isEmpty()) {
			if(listIntermediaire.size() < taille) {
				listIntermediaire.add(list.get(0));
				list.remove(0);
			}else {
				listFinale.add(listIntermediaire);
				listIntermediaire = new ArrayList<>(); 
				listIntermediaire.add(list.get(0));
				list.remove(0);
			}
		}
		return listFinale;
	}
}
