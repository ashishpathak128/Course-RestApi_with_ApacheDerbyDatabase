package io.courseApi.Quickstart.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.courseApi.Quickstart.Topic.Topic;

@Entity
public class Course {

		@Id
		private int id;
		private String name;
		private String Descriptin;
		@ManyToOne
		private Topic topic;	
		
		public Topic getTopic() {
			return topic;
		}

		public void setTopic(Topic topic) {
			this.topic = topic;
		}

		public Course() {
			
		}
		
		public Course(int id, String name, String descriptin, int topicId ) {
			super();
			this.id = id;
			this.name = name;
			this.topic = new Topic(topicId, "", "");
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
