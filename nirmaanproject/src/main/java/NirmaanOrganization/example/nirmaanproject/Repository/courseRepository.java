package NirmaanOrganization.example.nirmaanproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NirmaanOrganization.example.nirmaanproject.entities.courseEntity;

@Repository
public interface courseRepository extends JpaRepository<courseEntity,Long>{

	
}
