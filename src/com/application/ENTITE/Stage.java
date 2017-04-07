package com.application.ENTITE;
import java.util.*; 
public class Stage {
	 private Stage stage;
	 private int sid;
	 private int  eeid;
	 private String nomEntreprise;
	 private String libelleOffre;
	 private String description;
	 private Date  dateDebut;
	 private int dureeOffre;
	 private String cheminOffre;
	 private Domaine domaine;
	 private ArrayList<Stage> listestage = new ArrayList<Stage>();
	 private int index;
		
	

	public Stage(int sid, int eeid,  String nomEntreprise, String libelleOffre, String description,
			Date dateDebut, int dureeOffre, String cheminOffre, String domaine) {
		super();
		this.sid = sid;
		this.eeid = eeid;
		this.nomEntreprise = nomEntreprise;
		this.libelleOffre = libelleOffre;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dureeOffre = dureeOffre;
		this.cheminOffre = cheminOffre;
		
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getEeid() {
		return eeid;
	}

	public void setEeid(int eeid) {
		this.eeid = eeid;
	}

	

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getLibelleOffre() {
		return libelleOffre;
	}

	public void setLibelleOffre(String libelleOffre) {
		this.libelleOffre = libelleOffre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getDureeOffre() {
		return dureeOffre;
	}

	public void setDureeOffre(int dureeOffre) {
		this.dureeOffre = dureeOffre;
	}

	public String getCheminOffre() {
		return cheminOffre;
	}

	public void setCheminOffre(String cheminOffre) {
		this.cheminOffre = cheminOffre;
	}

	

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public ArrayList<Stage> getListestage() {
		return listestage;
	}

	public void setListestage(ArrayList<Stage> listestage) {
		this.listestage = listestage;
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

	public void deleteStage(int sid) {
		if (listestage.contains(sid))
			listestage.remove(sid);
	}

	public boolean searchStage(String[] searchIntred) {
		for (String obj : searchIntred) {
			if (!listestage.contains(obj)) {
				return false;
			} else {
				index = listestage.indexOf(obj);
				setStage(listestage.get(index));
				break;
			}
		}
		return true;

	}

	public void addStage(Stage stage){
		listestage.add(stage);
		
	}

	
	
	
	        
}
