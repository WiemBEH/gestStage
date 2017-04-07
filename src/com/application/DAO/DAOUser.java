package com.application.DAO;
import com.application.ENTITE.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

	public class DAOUser extends AbstractDAO<User> {
	
		private String request;
		private Statement state;
		private ResultSet resultset;

		public DAOUser(Connection connection) {
			super(connection);
			// TODO Auto-generated constructor stub
		}
		@Override
		public boolean find(User pers) {
		
			String login = null, mdp = null;
			try {
				request = "SELECT id,login,mdp FROM user";
				state = connection.createStatement();
				resultset = state.executeQuery(request);
				while (resultset.next()) {
					login = resultset.getString("login");
					mdp = resultset.getString("mdp");
				}
				if ( !pers.getLogin().equals(login) && !pers.getMdp().equals(mdp)) {
					return false;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return true;

		}

		@Override
		public void create(User obj) {
			// TODO Auto-generated method stub

		}
		
		
		public  void find(int searchIntred) {
		}

		

		public  void remove(int x){
		}
		
		
		public  void modify(int x , String[] tabContenu1){
		}
		
	

}
	
