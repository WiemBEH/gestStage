package com.application.VUE;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Conn_Entre extends JPanel {

	/**
	 * Create the panel.
	 */
	public Conn_Entre() {
		setBackground(new Color(238, 238, 238));
		setForeground(Color.WHITE);
		
		JButton btnSaisirOffre = new JButton("Saisir Offre");
		
		JButton btnConsulterOffre = new JButton("Consulter Offre");
		
		JButton btnAnnuler = new JButton("Annuler");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSaisirOffre, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnConsulterOffre))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(108)
							.addComponent(btnAnnuler)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSaisirOffre)
						.addComponent(btnConsulterOffre))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAnnuler)
					.addContainerGap(46, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
