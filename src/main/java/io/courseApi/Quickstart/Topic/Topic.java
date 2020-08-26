package io.courseApi.Quickstart.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

		@Id
		private int id;
		private String name;
		private String Descriptin;
		
		
		public Topic() {
			
		}
		
		public Topic(int id, String name, String descriptin) {
			super();
			this.id = id;
			this.name = name;
			Descriptin = descriptin;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescriptin() {
			return Descriptin;
		}
		public void setDescriptin(String descriptin) {
			Descriptin = descriptin;
		}

}
