package com.application.VUE;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Offre_Admin extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Offre_Admin() {
		
		table = new JTable();
		
		JButton btnSupprimer = new JButton("Supprimer");
		
		JButton btnModifier = new JButton("Modifier");
		
		JButton btnNewButton = new JButton("Ajouter");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSupprimer)
						.addComponent(btnModifier)
						.addComponent(btnNewButton))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(39)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(60, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(27)
					.addComponent(btnSupprimer)
					.addGap(26)
					.addComponent(btnModifier)
					.addGap(112))
		);
		setLayout(groupLayout);

	}
}
