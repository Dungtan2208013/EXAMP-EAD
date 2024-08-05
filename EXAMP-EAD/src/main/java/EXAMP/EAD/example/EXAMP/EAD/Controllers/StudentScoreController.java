package EXAMP.EAD.example.EXAMP.EAD.Controllers;

import EXAMP.EAD.example.EXAMP.EAD.Entities.StudentScore;
import EXAMP.EAD.example.EXAMP.EAD.Services.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student-scores")
public class StudentScoreController {
    @Autowired
    private StudentScoreService studentScoreService;

    @GetMapping
    public List<StudentScore> getAllStudentScores() {
        return studentScoreService.getAllStudentScores();
    }

    @PostMapping
    public StudentScore createStudentScore(@RequestBody StudentScore studentScore) {
        return studentScoreService.saveStudentScore(studentScore);
    }

    @GetMapping("/{id}")
    public StudentScore getStudentScoreById(@PathVariable Integer id) {
        return studentScoreService.getStudentScoreById(id);
    }
}
