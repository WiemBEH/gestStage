package listener;
import com.application.ENTITE.Stage;
import com.application.ENTITE.Etudiant;
import com.application.ENTITE.Entreprise;
import com.application.ENTITE.Domaine;

public interface CRUDListner {

		public void SearchPerformed(int x);

		public void addPerformed(Stage x);
		public void addPerformed(Etudiant x);
		public void addPerformed(Entreprise x);
		public void addPerformed(Domaine x);

		public void modifyPerformed(int x, String[] tabContenu);

		public void removePerformed(int x);
		
}
