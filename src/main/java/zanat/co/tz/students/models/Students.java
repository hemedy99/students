package zanat.co.tz.students.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="students")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Students {
    @Id
    @Column(name="student_id")
    private Long id;

    @Column(name="student_name",nullable = false)
    private String studentName;

    @Column(name="registration_number")
    private String registrationNumber;

    @Column(name="registration_date")
    private LocalDate registrationDate;
    
}
