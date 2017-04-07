package com.application.ENTITE;
import java.util.ArrayList;

	public class Entreprise extends User {
		private Entreprise entreprise;
		private int eeid;
		private String nom;
		private String adresse;
		private int codePostale;
		private String ville;
		private String mail;
		private int tel;
		private String secteur;
		private ArrayList<Entreprise> listeentreprise = new ArrayList<Entreprise>();
		private int index;
		
		
		public Entreprise(int id, String login, String mdp, Type typeUser) {
			super(id, login, mdp, typeUser);
			// TODO Auto-generated constructor stub
		}

		public int getEeid() {
			return eeid;
		}

		public void setEeid(int eeid) {
			this.eeid = eeid;
		}

		public String getNom() {
			return nom;
		}
		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public int getCodePostale() {
			return codePostale;
		}

		public void setCodePostale(int codePostale) {
			this.codePostale = codePostale;
		}

		public String getVille() {
			return ville;
		}

		public void setVille(String ville) {
			this.ville = ville;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public int getTel() {
			return tel;
		}

		public void setTel(int tel) {
			this.tel = tel;
		}

		public String getSecteur() {
			return secteur;
		}

		public void setSecteur(String secteur) {
			this.secteur = secteur;
		}

		public Entreprise getEntreprise() {
			return entreprise;
		}

		public void setEntreprise(Entreprise entreprise) {
			this.entreprise = entreprise;
		}

		public ArrayList<Entreprise> getListeentreprise() {
			return listeentreprise;
		}

		public void setListeentreprise(ArrayList<Entreprise> listeentreprise) {
			this.listeentreprise = listeentreprise;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public void deleteEntreprise(int eeid) {
			if (listeentreprise.contains(eeid))
				listeentreprise.remove(eeid);
		}

		public boolean searchEntreprise(String[] searchIntred) {
			for (String obj : searchIntred) {
				if (!listeentreprise.contains(obj)) {
					return false;
				} else {
					index = listeentreprise.indexOf(obj);
					setEntreprise(listeentreprise.get(index));
					break;
				}
			}
			return true;

		}

		public void addEntreprise(Entreprise entreprise) {
			listeentreprise.add(entreprise);
		}

		
		
		


	
}
