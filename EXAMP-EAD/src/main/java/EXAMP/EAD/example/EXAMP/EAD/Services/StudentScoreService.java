package EXAMP.EAD.example.EXAMP.EAD.Services;

import EXAMP.EAD.example.EXAMP.EAD.Entities.StudentScore;
import EXAMP.EAD.example.EXAMP.EAD.Repositories.StudentScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentScoreService {
    @Autowired
    private StudentScoreRepository studentScoreRepository;

    public List<StudentScore> getAllStudentScores() {
        return studentScoreRepository.findAll();
    }

    public StudentScore saveStudentScore(StudentScore studentScore) {
        return studentScoreRepository.save(studentScore);
    }

    public StudentScore getStudentScoreById(Integer studentScoreId) {
        return studentScoreRepository.findById(studentScoreId).orElse(null);
    }
}
