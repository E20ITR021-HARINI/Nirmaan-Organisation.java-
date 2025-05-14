package NirmaanOrganization.example.nirmaanproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class registeredcandidateentity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
	
	private  String name;
	private String email;
	private String courseName;
	
	public registeredcandidateentity() {
		super();
	}

	public registeredcandidateentity(long id, String name, String email, String courseName) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.courseName = courseName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
	

}
