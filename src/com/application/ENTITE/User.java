package com.application.ENTITE;

public class User {
	    private int id;
	    private String login;
	    private String mdp;
	    private Type typeUser;
	    
		
		public User(int id, String login, String mdp, Type typeUser) {
			super();
			this.id = id;
			this.login = login;
			this.mdp = mdp;
			this.typeUser = typeUser;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getMdp() {
			return mdp;
		}

		public void setMdp(String mdp) {
			this.mdp = mdp;
		}

		public Type getTypeUser() {
			return typeUser;
		}

		public void setTypeUser(Type typeUser) {
			this.typeUser = typeUser;
		}
	   
	    
}
