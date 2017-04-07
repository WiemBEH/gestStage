package com.application.DAO;
import com.application.ENTITE.User;

import com.application.ENTITE.Entreprise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOEntreprise extends AbstractDAO<Entreprise> {
	private String query;
	private PreparedStatement prepstat;
	private Object[] tableau;
	private Statement statement;
	private ResultSet rset = null;

	public DAOEntreprise(Connection connection) {
		super(connection);
	}
	
	public void find(int entreprise) {
		try {
			int eeid = 0;
			query = "SELECT *  FROM entreprise";
			statement = connection.createStatement();
			rset = statement.executeQuery(query);
			while (rset.next()) {
				eeid = rset.getInt("eeid");
				if (entreprise == eeid) {
					tableau = new Object[] { rset.getInt("eeid"), rset.getString("nomEntreprise"),
							rset.getString("adresseEntreprise"), rset.getInt("codePostaleEntreprise"),
							rset.getString("villeEntreprise"), rset.getString("mailEntreprise"),rset.getInt("telEntreprise"), rset.getString("SecteurEntreprise")};
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
	public void create(Entreprise entreprise) {
		try {
			entreprise.addEntreprise(entreprise);
			query = "INSERT INTO entreprise  VALUES(?,?,?,?,?,?,?,?)";
			prepstat = connection.prepareStatement(query);
			prepstat.setInt(1, entreprise.getEeid());
			prepstat.setString(2, entreprise.getNom());
			prepstat.setString(3, entreprise.getAdresse());
			prepstat.setInt(4, entreprise.getCodePostale());
			prepstat.setString(5, entreprise.getVille());
			prepstat.setString(6, entreprise.getMail());
			prepstat.setInt(7, entreprise.getTel());
			prepstat.setString(8, entreprise.getSecteur());
			prepstat.executeUpdate();
			/**JOptionPane.showMessageDialog(null, "Successfull Add", "Message davertissement",
					JOptionPane.INFORMATION_MESSAGE);
					 */
		} catch (SQLException ex) {
			ex.printStackTrace();
			/** JOptionPane.showMessageDialog(null, "ERROR ADD INTO DB", "Message davertissement",
					JOptionPane.ERROR_MESSAGE); */

		}
		/*
		 * finally { try { if (connection != null) connection.close(); } catch
		 * (SQLException e) { e.printStackTrace(); } }
		 */
	}

	@Override
	public void remove(int entreprise) {
		try {

			query = "DELETE FROM entreprise WHERE eeid=?";
			prepstat = connection.prepareStatement(query);
			prepstat.setInt(1, entreprise);
			prepstat.executeUpdate();
			/**JOptionPane.showMessageDialog(null, "Successfull DELETE", "Message davertissement",
					JOptionPane.INFORMATION_MESSAGE); */

		} catch (SQLException ex) {
			ex.printStackTrace();
			/**JOptionPane.showMessageDialog(null, "ERROR", "Message davertissement", JOptionPane.ERROR_MESSAGE); */
		}
	}

	@Override
	public boolean find(User pers) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modify(int entreprise, String[] tabContenu1) {
		try {
			query = "UPDATE entreprise SET nomEntreprise=? ,adresseEntreprise=?,codePostaleEntreprise=?,villeEntreprise=? , mailEntreprise=? , telEntreprise=?, secteurEntreprise=? WHERE eeid=?";
			prepstat = connection.prepareStatement(query);
			prepstat.setString(1, tabContenu1[1]);
			prepstat.setString(2, tabContenu1[2]);
			prepstat.setString(3, tabContenu1[3]);
			prepstat.setString(4, tabContenu1[4]);
			prepstat.setString(5, tabContenu1[5]);
			prepstat.setString(6,tabContenu1[6] );
			prepstat.setString(7,tabContenu1[7] );
			prepstat.setInt(8, entreprise);
			prepstat.executeUpdate();
			/**JOptionPane.showMessageDialog(null, "Successfull Alter", "Message davertissement",
					JOptionPane.INFORMATION_MESSAGE); */
		} catch (SQLException ex) {
			ex.printStackTrace();
			/**JOptionPane.showMessageDialog(null, "ERROR", "Message davertissement", JOptionPane.ERROR_MESSAGE); */

		}
	}

	
	
	
}
