package services;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Partition {

	// Après optimisation et utilisation de la methode subList
	public List<List<Integer>> partition(List<Integer> list, int taille){
		if(taille == 0 || list == null || list.isEmpty())return Collections.emptyList(); // on retourne une liste vide lorsque les donnees sont vides
		List<List<Integer>> listFinale = new ArrayList<>(); // liste finale qui aura toutes les partitions
		for(int i = 0; i < list.size(); i+=taille){
			if(i+taille>list.size()) {
				listFinale.add(list.subList(i,list.size()));
				break;
			}
			listFinale.add(list.subList(i,i+taille));
		}
		return listFinale;
	}
	/*
	//Implementation de l'algorithme concu au depart
	public List<List<Integer>> partition(List<Integer> list, int taille) {
		if(taille == 0 || list == null || list.isEmpty())return Collections.emptyList(); // on retourne une liste vide lorsque les donnees sont vides
		List<Integer> listATraiter = new ArrayList<>(list); // on duplique les données pour pouvoir manipuler la liste sans modifier le paramettre
		List<List<Integer>> listFinale = new ArrayList<>(); // liste finale qui aura toutes les partitions
		
		List<Integer> listIntermediaire = new ArrayList<>(); // correspond a une partition
		while(!listATraiter.isEmpty()) {
			listIntermediaire.add(listATraiter.get(0));
			listATraiter.remove(0);
			if(listIntermediaire.size() >= taille) {
				listFinale.add(listIntermediaire);
				listIntermediaire = new ArrayList<>();
			}
		}
		if(!listIntermediaire.isEmpty())listFinale.add(listIntermediaire);
		return listFinale;
	}
	*/
}
