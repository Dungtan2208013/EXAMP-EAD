
package EXAMP.EAD.example.EXAMP.EAD.Repositories;

import EXAMP.EAD.example.EXAMP.EAD.Entities.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentScoreRepository extends JpaRepository<StudentScore, Integer> {
}

