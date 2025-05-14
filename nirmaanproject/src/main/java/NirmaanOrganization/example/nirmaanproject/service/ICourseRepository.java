package NirmaanOrganization.example.nirmaanproject.service;

import java.util.List;

import NirmaanOrganization.example.nirmaanproject.entities.courseEntity;

public interface ICourseRepository {

	// postmapping

	courseEntity addCourse(courseEntity course); // course

	// getmapping
	List<courseEntity> getCourses();

	// getmapping based on id
	courseEntity getCourse(long id);

	// updatemapping

	courseEntity updateCourse(long id, courseEntity course);

	// deleteMapping
	String deleteCourse(long id);

}
