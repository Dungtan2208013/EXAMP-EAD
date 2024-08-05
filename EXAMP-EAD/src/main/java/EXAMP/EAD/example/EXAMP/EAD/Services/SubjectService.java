package EXAMP.EAD.example.EXAMP.EAD.Services;

import EXAMP.EAD.example.EXAMP.EAD.Entities.Subject;
import EXAMP.EAD.example.EXAMP.EAD.Repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public Subject getSubjectById(Integer subjectId) {
        return subjectRepository.findById(subjectId).orElse(null);
    }
}
