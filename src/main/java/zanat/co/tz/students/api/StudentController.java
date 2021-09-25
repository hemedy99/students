package zanat.co.tz.students.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import zanat.co.tz.students.models.Students;
import zanat.co.tz.students.repository.StudentRepository;

@RestController
public class StudentController {
    
    @Autowired
    private StudentRepository studentRepo;

    @PostMapping("/students/save/")
    public ResponseEntity<Students> SaveStudent(@RequestBody Students s){
        Students student = studentRepo.save(s);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/students/getall/")
    public ResponseEntity<List<Students>> GetAllStudents(){
        List<Students> students = studentRepo.findAll();
        return ResponseEntity.ok(students);
    }

    @GetMapping("students/getbyid/")
    public ResponseEntity<Optional<Students>> GetStudentById(@PathVariable Long id){
        Optional<Students> s = studentRepo.findById(id);
        return ResponseEntity.ok(s);
    }

    
}
