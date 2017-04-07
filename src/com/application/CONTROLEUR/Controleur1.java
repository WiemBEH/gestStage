package com.application.CONTROLEUR;
import com.application.DAO.DAOEntreprise;
import com.application.DAO.DAOEtudiant;
import com.application.DAO.ConnexionMysql;
import com.application.ENTITE.Entreprise;
import com.application.ENTITE.Etudiant;
import com.application.VUE.Authentification;
import com.application.VUE.choix_Etudiant_Entreprise;

import listener.CRUDListner;
import listener.LoginListner;

/*public class Controller implements LoginListner, CRUDListner {
	private Authentication auth;
	private DAOStagiaire controllerstag;
	private GestionSatgiare stagiaireG;
	private DAORH personnelDAO;

	public Controller() {
		auth = new Authentication();
		auth.setVisible(true);
		auth.setLoginListner(this);
	}

	private void AddStagiaire(Stagiaire stagiaire) {
		controllerstag = new DAOStagiaire(JDBC.getConnection());
		controllerstag.create(stagiaire);
		searchStag(stagiaire.getCin());
	}

	private void searchStag(int stagiaire) {
		controllerstag = new DAOStagiaire(JDBC.getConnection());
		controllerstag.find(stagiaire);
		stagiaireG.showOntableSearch(controllerstag.getTableau());
	}

	@Override
	public void loginPerformed(RH logpass) {
		personnelDAO = new DAORH(JDBC.getConnection());
		if (personnelDAO.find(logpass) == true) {
			auth.dispose();
			stagiaireG = new GestionSatgiare();
			stagiaireG.setVisible(true);
			stagiaireG.setRetieveListner(Controller.this);
		}
	}

	private void removeStagiaire(int stagiaire) {
		controllerstag = new DAOStagiaire(JDBC.getConnection());
		controllerstag.remove(stagiaire);

	}

	private void modifyStagiaire(int stagiaire, String[] tabContenu) {
		controllerstag = new DAOStagiaire(JDBC.getConnection());
		controllerstag.modify(stagiaire, tabContenu);
	}

	@Override
	public void SearchPerformed(int stagiaire) {
		searchStag(stagiaire);
	}

	@Override
	public void addPerformed(Stagiaire stagiaire) {
		AddStagiaire(stagiaire);
	}

	@Override
	public void removePerformed(int stagiaire) {
		removeStagiaire(stagiaire);
	}

	@Override
	public void modifyPerformed(int stagiaire, String[] tabContenu) {
		modifyStagiaire(stagiaire, tabContenu);
	}
public class Controleur1 {
**/

