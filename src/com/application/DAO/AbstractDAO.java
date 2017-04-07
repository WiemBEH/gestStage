package com.application.DAO;
import com.application.ENTITE.User;
import java.sql.Connection;


 public abstract class AbstractDAO<T> {
		protected Connection connection = null;
		public AbstractDAO(Connection connection) {
			this.connection = connection;
		}
		

		public abstract void create(T obj);

		public abstract void find(int searchIntred);

		public abstract boolean find(User pers);
		
		public abstract void remove(int x);
		
		
		public abstract void modify(int x , String[] tabContenu);

	}


