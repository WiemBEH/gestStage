package com.application.VUE;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Conn_Etu extends JPanel {

	/**
	 * Create the panel.
	 */
	public Conn_Etu() {
		
		JButton btnConsulterOffre = new JButton("Consulter Offre");
		
		JButton btnAnnuler = new JButton("Annuler");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(btnConsulterOffre)
					.addContainerGap(169, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(50, Short.MAX_VALUE)
					.addComponent(btnAnnuler)
					.addGap(46))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnConsulterOffre)
					.addGap(18)
					.addComponent(btnAnnuler)
					.addContainerGap(91, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
