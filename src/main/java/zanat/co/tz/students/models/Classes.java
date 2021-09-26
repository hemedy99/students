package zanat.co.tz.students.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="classes")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Classes {
    @Id
    @Column(name="class_id")
    private Long id;

    @Column(name="class_name")
    private String className;
}
