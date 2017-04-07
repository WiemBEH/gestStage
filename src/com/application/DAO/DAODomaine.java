package com.application.DAO;
import com.application.ENTITE.Domaine;
import com.application.ENTITE.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAODomaine extends AbstractDAO<Domaine>{
	private String query;
	private PreparedStatement prepstat;
	private Object[] tableau;
	private Statement statement;
	private ResultSet rset = null;

	public DAODomaine(Connection connection) {
		super(connection);
	}
	
	public void find(int domaine) {
		try {
			int id = 0;
			query = "SELECT *  FROM ";
			statement = connection.createStatement();
			rset = statement.executeQuery(query);
			while (rset.next()) {
			id = rset.getInt("id");
				if (domaine == id) {
					tableau = new Object[] { rset.getInt("id"),
							 rset.getString("nom")};
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
	public void create(Domaine domaine) {
		try {
			domaine.addDomaine(domaine);
			query = "INSERT INTO domaine  VALUES(?,?,?,?,?,?,?,?)";
			prepstat = connection.prepareStatement(query);
			prepstat.setInt(1, domaine.getDid());
			prepstat.setString(2, domaine.getNom());
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
	public void remove(int domaine) {
		try {

			query = "DELETE FROM domaine WHERE id=?";
			prepstat = connection.prepareStatement(query);
			prepstat.setInt(1,domaine );
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
	public void modify(int domaine, String[] tabContenu5) {
		try {
			query = "UPDATE domaine SET nom=?   WHERE id=?";
			prepstat = connection.prepareStatement(query);
			prepstat.setString(1, tabContenu5[1]);
			prepstat.setInt(8, domaine);
			prepstat.executeUpdate();
			/**JOptionPane.showMessageDialog(null, "Successfull Alter", "Message davertissement",
					JOptionPane.INFORMATION_MESSAGE); */
		} catch (SQLException ex) {
			ex.printStackTrace();
			/**JOptionPane.showMessageDialog(null, "ERROR", "Message davertissement", JOptionPane.ERROR_MESSAGE); */

		}
	}

	
	
	
	
}
