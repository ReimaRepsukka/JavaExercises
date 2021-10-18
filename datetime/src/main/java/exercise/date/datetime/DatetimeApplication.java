package exercise.date.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DatetimeApplication {


	LocalDateTime previousTime;


	public static void main(String[] args) {
		SpringApplication.run(DatetimeApplication.class, args);
	}

	@GetMapping("{format}")
	public String getDate(@PathVariable String format){

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);

		return LocalDateTime.now().format(dtf);
	}

	@GetMapping("dur")
	public String getDuration(){
		LocalDateTime now = LocalDateTime.now();

		if(previousTime == null){
			previousTime = now;
			return "This is the firs call!";
		}

		
		Duration dur = Duration.between(previousTime, now);
		previousTime = now;

		return "Last call was " + ((float)dur.toMillis()/1000) + " seconds ago";
	}

}
