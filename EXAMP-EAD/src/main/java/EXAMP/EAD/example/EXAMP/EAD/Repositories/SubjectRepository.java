package EXAMP.EAD.example.EXAMP.EAD.Repositories;

import EXAMP.EAD.example.EXAMP.EAD.Entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}

