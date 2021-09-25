package zanat.co.tz.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zanat.co.tz.students.models.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students,Long> {
    
}
