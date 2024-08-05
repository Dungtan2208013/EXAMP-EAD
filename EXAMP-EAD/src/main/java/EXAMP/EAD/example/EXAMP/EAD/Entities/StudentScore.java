package EXAMP.EAD.example.EXAMP.EAD.Entities;

import jakarta.persistence.*;

@Table(name = "student_score_t")
public class StudentScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentScoreId ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @Column(name = "score1", precision = 5, scale = 2)
    private Double score1;

    @Column(name = "score2", precision = 5, scale = 2)
    private Double score2;

}
