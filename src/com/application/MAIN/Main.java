package com.application.MAIN;

import javax.swing.SwingUtilities;


import com.application.CONTROLEUR.Controleur1;
import com.application.CONTROLEUR.Controleur10;
import com.application.CONTROLEUR.Controleur11;
import com.application.CONTROLEUR.Controleur2;
import com.application.CONTROLEUR.Controleur3;
import com.application.CONTROLEUR.Controleur4;
import com.application.CONTROLEUR.Controleur5;
import com.application.CONTROLEUR.Controleur6;
import com.application.CONTROLEUR.Controleur7;
import com.application.CONTROLEUR.Controleur8;
import com.application.CONTROLEUR.Controleur9;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Controleur1();
				new Controleur2();
				new Controleur3();
				new Controleur4();
				new Controleur5();
				new Controleur6();
				new Controleur7();
				new Controleur8();
				new Controleur9();
				new Controleur10();
				new Controleur11();
			}
		});
	}


	}


