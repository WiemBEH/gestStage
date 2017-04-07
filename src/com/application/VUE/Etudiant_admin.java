package com.application.VUE;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;

public class Etudiant_admin extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Etudiant_admin() {
		
		table = new JTable();
		table.setBounds(27, 35, 234, 244);
		table.setForeground(Color.WHITE);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(279, 145, 107, 25);
		
		JButton btnNewButton = new JButton("Modifier");
		btnNewButton.setBounds(279, 102, 107, 25);
		
		JButton btnNewButton_1 = new JButton("Ajouter");
		btnNewButton_1.setBounds(279, 59, 86, 25);
		setLayout(null);
		add(btnNewButton);
		add(btnNewButton_1);
		add(table);
		add(btnSupprimer);

	}

}
