package com.olaoluKay.hng.controller;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/api")
	  public MyInfo getInfo(@RequestParam(name="slackName") String slackName,
			                     @RequestParam(name="track")  String track) {
			
	   SimpleDateFormat dayFormat = new SimpleDateFormat("EEE");
	   dayFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
	   String current_day = dayFormat.format(new Date());
	   
	  // SimpleDateFormat timeFormat = new SimpleDateFormat("HH:MM:SS");
	   //timeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
	   //String utc_time = timeFormat.format(new Date());
	   Instant currentUTCInstant = Instant.now();
       ZonedDateTime utcDateTime = ZonedDateTime.ofInstant(currentUTCInstant, ZoneId.of("UTC"));
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
       String utc_time = utcDateTime.format(formatter);

	   
	   String githubFileUrl = "https://github.com/your-username/your-repo/blob/main/path/to/your-file.ext";
     String githubSourceUrl = "https://github.com/your-username/your-repo";
     
     MyInfo myInfo = new MyInfo();
     
     myInfo.setSlack_Name("Olaoluwa Kayode");
     myInfo.setCurrent_Day(current_day);
     myInfo.setUtc_Time(utc_time);
     myInfo.setTrack(track);
     myInfo.setGithub_File_Url(githubFileUrl);
     myInfo.setGithub_Source_Url(githubSourceUrl);
     myInfo.setStatus_Code(200);
     

	 return myInfo;
  
	}
}
