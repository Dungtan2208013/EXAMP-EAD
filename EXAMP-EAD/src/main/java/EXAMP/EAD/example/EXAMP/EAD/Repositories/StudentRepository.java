package EXAMP.EAD.example.EXAMP.EAD.Repositories;

import EXAMP.EAD.example.EXAMP.EAD.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}

