package demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(new Student("Abebe", "beso", LocalDate.now(), "abe@mail.com", 29));
    }
}
