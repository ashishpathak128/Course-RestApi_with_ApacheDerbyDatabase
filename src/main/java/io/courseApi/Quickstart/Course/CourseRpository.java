package io.courseApi.Quickstart.Course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRpository extends CrudRepository<Course, Integer>{

	public List<Course> findByTopicId(int topicId);
}
