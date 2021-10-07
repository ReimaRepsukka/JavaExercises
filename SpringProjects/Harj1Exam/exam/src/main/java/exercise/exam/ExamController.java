package exercise.exam;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ExamController {
    
    List<Exam> exams = new ArrayList<>();

    @PostConstruct
    public void myInit(){
        exams.add(new Exam("HTML/CSS Programming", "Joh Doe", 4));
        exams.add(new Exam("Database design", "Lisa Simpson", 5));
        exams.add(new Exam("Acting fundamentals", "Johnny Depp", 3));
        exams.add(new Exam("Drumming basic rudiments", "Dave Weckl", 5));
    }

    @GetMapping("exams")
    public List<Exam> getExams() {
        return exams;
    }
    
    @GetMapping("exam")
    public String getFirsExam(){
        Exam e = exams.get(0);
        String exam = "<b>Name: </b>" + e.getName() + "<br>";
        exam += "<b>Studen name: </b>" + e.getStudentName() + "<br>";
        exam += "<b>Grade: </b>" + e.getGrade() + "<br>";
        return exam;
    }

    @GetMapping("exam/{id}")
    public String getMethodName(@PathVariable int id) {
        
        if(id < exams.size()){
            return createExamHtml(exams.get(id));
        }
        return "<h3>Exam not found!</h3>";
    }

    
    /**
     * This is just separate helper method for creating html from the exam info.
     */
    private String createExamHtml(Exam e){
        String examString = "<b>Name: </b>" + e.getName() + "<br>";
        examString += "<b>Studen name: </b>" + e.getStudentName() + "<br>";
        examString += "<b>Grade: </b>" + e.getGrade() + "<br>";
        return examString;
    }
    
}
