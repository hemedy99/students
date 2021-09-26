package zanat.co.tz.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zanat.co.tz.students.models.Classes;

@Repository
public interface ClassRepository extends JpaRepository<Classes,Long> {
    
}
