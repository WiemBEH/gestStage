package com.application.ENTITE;
import java.util.*;

public class Domaine {
private Domaine domaine;
 private int did;
 private String nom;
 private ArrayList<Domaine> listedomaine = new ArrayList<Domaine>();
 private int index;
public Domaine(int id, String nom) {
	super();
	this.did = id;
	this.nom = nom;
}

public int getDid() {
	return did;
}

public void setId(int did) {
	this.did = did;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public ArrayList<Domaine> getListedomaine() {
	return listedomaine;
}

public void setListedomaine(ArrayList<Domaine> listedomaine) {
	this.listedomaine = listedomaine;
}

public int getIndex() {
	return index;
}

public void setIndex(int index) {
	this.index = index;
}

public Domaine getDomaine() {
	return domaine;
}

public void setDomaine(Domaine domaine) {
	this.domaine = domaine;
}

public void deleteDomaine(int id) {
	if (listedomaine.contains(id))
		listedomaine.remove(id);
}

public boolean searchDomaine(String[] searchIntred) {
	for (String obj : searchIntred) {
		if (!listedomaine.contains(obj)) {
			return false;
		} else {
			index = listedomaine.indexOf(obj);
			setDomaine(listedomaine.get(index));
			break;
		}
	}
	return true;

}

public void addDomaine(Domaine domaine){
	listedomaine.add(domaine);
	
}




        
 
}
