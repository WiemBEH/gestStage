package com.application.DAO;
import com.application.ENTITE.User;
import com.application.ENTITE.Stage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DAOStage extends  AbstractDAO<Stage> {
	private String query;
	private PreparedStatement prepstat;
	private Object[] tableau;
	private Statement statement;
	private ResultSet rset = null;

	public DAOStage(Connection connection) {
		super(connection);
	}

	public void find(int stage) {
		try {
			int sid = 0;
			int eeid = 0;
			query = "SELECT *  FROM stage";
			statement = connection.createStatement();
			rset = statement.executeQuery(query);
			while (rset.next()) {
				sid = rset.getInt("sid");
				eeid = rset.getInt("eeid");
				if  ((stage == sid) && (stage == eeid)) {
					tableau = new Object[] { rset.getInt("sid"),rset.getInt("eeid"), rset.getString("nomEntreprise"),
							rset.getString("libelleOffre"), rset.getString("descriptionOffre"),rset.getDate("dateDebutOffre"),rset.getInt("dureeOffre"), rset.getString("cheminOffre")
							,rset.getString("domaine")	};
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
	public void create(Stage stage) {
		try {
			stage.addStage(stage);
			query = "INSERT INTO stage  VALUES(?,?,?,?,?,?,?,?)";
			prepstat = connection.prepareStatement(query);
			prepstat.setInt(1, stage.getSid());
			prepstat.setInt(2, stage.getEeid());
			prepstat.setString(3, stage.getLibelleOffre());
			prepstat.setString(4,stage.getDescription());
			prepstat.setString(5, String.valueOf(stage.getDateDebut())); 
			prepstat.setInt(5,stage.getDureeOffre());
			prepstat.setString(6,stage.getCheminOffre());
			prepstat.setString(7,String.valueOf(stage.getDomaine()));
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
	public void remove(int stage) {
		try {

			query = "DELETE FROM stage WHERE sid=? , eeid=?";
			prepstat = connection.prepareStatement(query);
			prepstat.setInt(1, stage);
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
	public void modify(int stage, String[] tabContenu3) {
		try {
			query = "UPDATE stage SET nomEntreprise=? ,libelleEntreprise=?,descriptionOffre=?, dqteDebutOffre=?,cheminOffre=?,domaine=? WHERE sid=? ,eeid=?";
			prepstat = connection.prepareStatement(query);
			prepstat.setString(1, tabContenu3[1]);
			prepstat.setString(2, tabContenu3[2]);
			prepstat.setString(3, tabContenu3[3]);
			prepstat.setString(4, tabContenu3[4]);
			prepstat.setString(5, tabContenu3[5]);
			prepstat.setString(7, tabContenu3[7]);
			prepstat.setString(7, tabContenu3[7]);
			prepstat.setInt(8, stage);
			prepstat.setInt(9, stage);
			prepstat.executeUpdate();
			/**JOptionPane.showMessageDialog(null, "Successfull Alter", "Message davertissement",
					JOptionPane.INFORMATION_MESSAGE); */
		} catch (SQLException ex) {
			ex.printStackTrace();
			/**JOptionPane.showMessageDialog(null, "ERROR", "Message davertissement", JOptionPane.ERROR_MESSAGE); */
	}
	}

}
