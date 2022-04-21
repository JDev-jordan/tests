# TEST JAVA

### Probleme
1 - Écrire une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.

Exemples d'entrées et sorties :

partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]

partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]

partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]
 
2 - Écrire des tests unitaires avec Junit4 pour vérifier votre implémentation

### Proposition de solution

>Nous optons ici pour une classe **Partition** qui aura cette unique methode *partition*.

>Signature de la fonction : **public List<List<Integer>> partition(List<Integer> list, int taille)**

##### Algorithme
1- Fonction partition
>
	- Controle des paramettres : nous verifions ici que tous les parametre ne sont pas nulls et que la liste contient des éléments
	- Nous initialisons des variables locales :
		- listeATraiter : qui va recopier les éléments de la liste passée en parametre (ceci pour ne pas modifier la liste passée en parametre lors de nos operations)
		- listeIntermediaire : qui correspond à une partition
		- listeFinale : qui correspond ici à l'ensemble des partitions (la liste à retourner)
	- Nous ferons ensuite une boucle qui tournera tant que la listeATraiter n'est pas vide et qui fera :
		- ajout de l'élément a l'indice 0 de la listeATraiter dans la partition listeIntermediaire
		- suppression cet élément dans la listeATraiter
		- si la listeIntermediaire a une taille supperieure ou égale à la taille en parametre alors :
			- on ajoute la listeIntermediaire dans la listeFinale.
			- on reinitialise la listeIntermediaire.
	- Nous retournons la listeFinale.
 
2- Tests

> Nous avons implementé 3 fonctions de tests relatives à la fonction *partition*

	- testPpartitionShouldReturnEmptyListWhenTailleNull : qui teste si la fonction retourne bien une liste vide lorsque la taille passée en parametre est null ( taille == 0)
	- testPpartitionShouldReturnEmptyListWhenListEmpty : qui teste si la fonction retourne bien une liste vide lorsque la liste passée en parametre est nulle ou vide ( list == null || list.isEmpty())
	- testPartitionShouldReturnList : qui teste si la fonction retourne bien une liste contenant des listes qui elles contiennent des elements ( teste pour toutes ces sous listes, si leur taille est inferieure ou egale à la taille en souhaitée)
	
3- Optimisation

> Nous allons rendre ici le code plus court en utilisant une methode prevue pour la subdivision des listes ( subList() )

l'algorithme devient:

	- Controle des paramettres : nous verifions ici que tous les parametre ne sont pas nulls et que la liste contient des éléments
	- Nous initialisons des variables locales :
		- listeFinale : qui correspond ici à l'ensemble des partitions (la liste à retourner)
	- Nous faisons une boucle qui va de 0 à la * taille de la liste moins la taille en parametre * et qui s'incremente de + la taille en parametre.
		- si (indice + la taille) est superieur à la taille de la list alors on ajoute le reste des elements de la liste a la listFinale
		- si non on ajoute les elements de l'indice à l'indice + la taille en parametre dans la listFinale
	- Nous retournons la listFinale