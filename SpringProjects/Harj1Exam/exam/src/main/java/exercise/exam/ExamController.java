package exercise.exam;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
        if(exams.size() > 0)
            return createExamHtml(exams.get(0));
            
        return "<h3>Exam not found!</h3>";
    }

    @GetMapping("exam/{id}")
    public String getMethodName(@PathVariable int id) {
        //Checking if the exam exists.
        if(id >= exams.size() || id < 0){
            return "<h3>Exam not found!</h3>";
        }
        return createExamHtml(exams.get(id));
    }

    @GetMapping("create")
    public Exam createExam(@RequestParam String name,  
        @RequestParam String sname, @RequestParam int grade){
    
        Exam exam =  new Exam(name, sname, grade);
        exams.add(exam);

        return exam;
    }
    
    @PostMapping("postexam")
    public Exam postExam(@RequestParam String name,  
        @RequestParam String sname, @RequestParam int grade){
    
        Exam exam =  new Exam(name, sname, grade);
        exams.add(exam);

        return exam;
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
