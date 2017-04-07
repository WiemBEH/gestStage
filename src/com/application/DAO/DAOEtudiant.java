package com.application.DAO;
import com.application.ENTITE.User;
import com.application.ENTITE.Etudiant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOEtudiant extends  AbstractDAO<Etudiant>{

private String query;
private PreparedStatement prepstat;
private Object[] tableau;
private Statement statement;
private ResultSet rset = null;

public DAOEtudiant(Connection connection) {
	super(connection);
}

public void find(int etudiant) {
	try {
		int eid = 0;
		query = "SELECT *  FROM etudiant";
		statement = connection.createStatement();
		rset = statement.executeQuery(query);
		while (rset.next()) {
			eid = rset.getInt("eid");
			if (etudiant == eid) {
				tableau = new Object[] { rset.getInt("eid"), rset.getString("nomEtudiant"),
						rset.getString("prenomEtudiant"), rset.getString("emailEtudiant"),
						rset.getString("domaine")};
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
public void create(Etudiant etudiant) {
	try {
		etudiant.addEtudiant(etudiant);
		query = "INSERT INTO stagiaire  VALUES(?,?,?,?,?,?,?,?)";
		prepstat = connection.prepareStatement(query);
		prepstat.setInt(1, etudiant.getEid());
		prepstat.setString(2, etudiant.getNom());
		prepstat.setString(3, etudiant.getPrenom());
		prepstat.setString(4, etudiant.getEmail());
		prepstat.setString(5, etudiant.getDomaine());
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
public void remove(int etudiant) {
	try {

		query = "DELETE FROM etudiant WHERE eid=?";
		prepstat = connection.prepareStatement(query);
		prepstat.setInt(1, etudiant);
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
public void modify(int etudiant, String[] tabContenu2) {
	try {
		query = "UPDATE entreprise SET nomEtudiant=? ,prenomEtudiant=?,emailEtudiant=?,domaine=? WHERE eid=?";
		prepstat = connection.prepareStatement(query);
		prepstat.setString(1, tabContenu2[1]);
		prepstat.setString(2, tabContenu2[2]);
		prepstat.setString(3, tabContenu2[3]);
		prepstat.setString(4, tabContenu2[4]);
		prepstat.setString(5, tabContenu2[5]);
		prepstat.setInt(6, etudiant);
		prepstat.executeUpdate();
		/**JOptionPane.showMessageDialog(null, "Successfull Alter", "Message davertissement",
				JOptionPane.INFORMATION_MESSAGE); */
	} catch (SQLException ex) {
		ex.printStackTrace();
		/**JOptionPane.showMessageDialog(null, "ERROR", "Message davertissement", JOptionPane.ERROR_MESSAGE); */
}
}
}



