package com.application.ENTITE;

import java.util.ArrayList;

public class Etudiant extends User {
	private Etudiant etudiant;
	private int eid;
	private String nom;
	private  String prenom;
	private String email;
	private String domaine;
	private ArrayList<Etudiant> listeetudiant = new ArrayList<Etudiant>();
	private int index;
	
	

	public Etudiant(int id, String login, String mdp, Type typeUser) {
		super(id, login, mdp, typeUser);
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public ArrayList<Etudiant> getListeetudiant() {
		return listeetudiant;
	}

	public void setListeetudiant(ArrayList<Etudiant> listeetudiant) {
		this.listeetudiant = listeetudiant;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void deleteEtudiant(int eid) {
		if (listeetudiant.contains(eid))
			listeetudiant.remove(eid);
	}

	public boolean searchEtudiant(String[] searchIntred) {
		for (String obj : searchIntred) {
			if (!listeetudiant.contains(obj)) {
				return false;
			} else {
				index = listeetudiant.indexOf(obj);
				setEtudiant(listeetudiant.get(index));
				break;
			}
		}
		return true;

	}

	public void addEtudiant(Etudiant etudiant) {
		listeetudiant.add(etudiant);
	}

	
	
	
	    

}
