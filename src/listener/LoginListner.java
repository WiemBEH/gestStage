package listener;
import com.application.ENTITE.Entreprise;
import com.application.ENTITE.Etudiant;
import com.application.ENTITE.Admin;
	

	public interface LoginListner {
		public void loginPerformed(Entreprise personnelnfo);
		public void loginPerformed(Etudiant personnelnfo);
		public void loginPerformed (Admin personnelnfo);
     }

