package com.olaoluKay.hng.controller;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/api")
	  public MyInfo getInfo(@RequestParam(name="slackName") String slackName,
			                     @RequestParam(name="track")  String track) {
			
		LocalDate currentDate = LocalDate.now();
        DayOfWeek short_form_day = currentDate.getDayOfWeek();
        String current_day = short_form_day.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
	   
	    Instant currentUTCInstant = Instant.now();
        ZonedDateTime utcDateTime = ZonedDateTime.ofInstant(currentUTCInstant, ZoneId.of("UTC"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String utc_time = utcDateTime.format(formatter);

	   
	   String githubFileUrl = "https://github.com/Olaoluwa22/stage1hng/blob/master/src/main/java/com/olaoluKay/hng/controller/MyController.java";
       String githubSourceUrl = "https://github.com/Olaoluwa22/stage1hng";
     
       MyInfo myInfo = new MyInfo();
     
       myInfo.setSlack_Name("Olaoluwa");
       myInfo.setCurrent_Day(current_day);
       myInfo.setUtc_Time(utc_time);
       myInfo.setTrack(track);
       myInfo.setGithub_File_Url(githubFileUrl);
       myInfo.setGithub_Source_Url(githubSourceUrl);
       myInfo.setStatus_Code(200); 

	   return myInfo;
	   
	}
}

     

	 return myInfo;
  
	}
}
