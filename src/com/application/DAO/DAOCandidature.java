package com.application.DAO;
import com.application.ENTITE.User;
import com.application.ENTITE.Candidature;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

	public class DAOCandidature extends AbstractDAO<Candidature>{
		private String query;
		private PreparedStatement prepstat;
		private Object[] tableau;
		private Statement statement;
		private ResultSet rset = null;

		public DAOCandidature(Connection connection) {
			super(connection);
		}
		
		public void find(int candidature) {
			try {
				int cid = 0;
				query = "SELECT *  FROM ";
				statement = connection.createStatement();
				rset = statement.executeQuery(query);
				while (rset.next()) {
					cid = rset.getInt("cid");
					if (candidature == cid) {
						tableau = new Object[] { rset.getInt("cid"), rset.getInt("eeid"),
								rset.getInt("eid"), rset.getInt("sid"),
								 rset.getString("reponse")};
						break;
					}
				}
			} catch (SQLException e) {

			}
		}
		
		public Object[] getTableau() {
			return tableau;
		}

		@Override
		public void create(Candidature candidature) {
			try {
				candidature.addCandidature(candidature);
				query = "INSERT INTO candidature  VALUES(?,?,?,?,?,?,?,?)";
				prepstat = connection.prepareStatement(query);
				prepstat.setInt(1, candidature.getCid());
				prepstat.setInt(2, candidature.getEeid());
				prepstat.setInt(3, candidature.getEid());
				prepstat.setInt(4, candidature.getSid());
				prepstat.setString(5, String.valueOf(candidature.getReponse()));
	prepstat.executeUpdate();
				
			} catch (SQLException ex) {
				ex.printStackTrace();
				
			}
			/*
			 * finally { try { if (connection != null) connection.close(); } catch
			 * (SQLException e) { e.printStackTrace(); } }
			 */
		}

		@Override
		public void remove(int candidature) {
			try {

				query = "DELETE FROM candidature WHERE cid=?";
				prepstat = connection.prepareStatement(query);
				prepstat.setInt(1,candidature );
				prepstat.executeUpdate();
				

			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}

		@Override
		public boolean find(User pers) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void modify(int candidature, String[] tabContenu4) {
			try {
				query = "UPDATE candidature SET eeid=? ,eid=?,sid=?, reponse=?  WHERE cid=?";
				prepstat = connection.prepareStatement(query);
				prepstat.setString(1, tabContenu4[1]);
				prepstat.setString(2, tabContenu4[2]);
				prepstat.setString(3, tabContenu4[3]);
				prepstat.setString(4, tabContenu4[4]);
				prepstat.setInt(8, candidature);
				prepstat.executeUpdate();
				/**JOptionPane.showMessageDialog(null, "Successfull Alter", "Message davertissement",
						JOptionPane.INFORMATION_MESSAGE); */
			} catch (SQLException ex) {
				ex.printStackTrace();
				/**JOptionPane.showMessageDialog(null, "ERROR", "Message davertissement", JOptionPane.ERROR_MESSAGE); */

			}
		}

		

}
