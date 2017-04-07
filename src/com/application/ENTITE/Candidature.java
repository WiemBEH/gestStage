package com.application.ENTITE;
import java.util.ArrayList;


	public class Candidature {
		private Candidature candidature;
		private int  cid;
		private int eeid;
		private int eid;
		private int  sid;
	    private TypeStatut reponse;
	    private ArrayList<Candidature> listecandidature = new ArrayList<Candidature>();
		private int index;
		
		public Candidature(int cid, int eeid, int eid, int sid, TypeStatut reponse) {
			super();
			this.cid = cid;
			this.eeid = eeid;
			this.eid = eid;
			this.sid = sid;
			this.reponse = reponse;
		}

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public int getEeid() {
			return eeid;
		}

		public void setEeid(int eeid) {
			this.eeid = eeid;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public TypeStatut getReponse() {
			return reponse;
		}

		public void setReponse(TypeStatut reponse) {
			this.reponse = reponse;
		}

		public ArrayList<Candidature> getListecandidature() {
			return listecandidature;
		}

		public void setListecandidature(ArrayList<Candidature> listecandidature) {
			this.listecandidature = listecandidature;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}
		
		public Candidature getCandidature() {
			return candidature;
		}

		public void setCandidature(Candidature candidature) {
			this.candidature = candidature;
		}

		public void deleteCandidature(int cid) {
			if (listecandidature.contains(cid))
				listecandidature.remove(cid);
		}

		public boolean searchCandidature(String[] searchIntred) {
			for (String obj : searchIntred) {
				if (!listecandidature.contains(obj)) {
					return false;
				} else {
					index = listecandidature.indexOf(obj);
					setCandidature(listecandidature.get(index));
					break;
				}
			}
			return true;

		}

		public void addCandidature(Candidature candidature) {
			listecandidature.add(candidature);
		}

		
		
		
}
