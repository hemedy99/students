package zanat.co.tz.students.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import zanat.co.tz.students.models.Classes;
import zanat.co.tz.students.repository.ClassRepository;

@RestController
public class ClassesController {
    
    @Autowired
    private ClassRepository classRepo;

    @PostMapping("class/save")
    public ResponseEntity<Classes> SaveClass(@RequestBody Classes c){
        Classes classes = classRepo.save(c);
        return ResponseEntity.ok(classes);
    }

    @GetMapping("classes/")
    public ResponseEntity<List<Classes>>GetAllClasses(){
        return ResponseEntity.ok(classRepo.findAll());
    }
}
