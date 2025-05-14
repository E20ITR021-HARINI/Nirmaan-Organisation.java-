package NirmaanOrganization.example.nirmaanproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NirmaanOrganization.example.nirmaanproject.entities.registeredcandidateentity;
@Repository
public interface registeredCandidateRepository  extends JpaRepository<registeredcandidateentity,Long>{
	

}
		


