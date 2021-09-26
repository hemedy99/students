package zanat.co.tz.students.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import zanat.co.tz.students.models.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students,Long> {
    
   // @Query(value="SELECT * from students WHERE registration_number :registrationNumber")
    Optional<Students> findByRegistrationNumber(String registrationNumber);
}
