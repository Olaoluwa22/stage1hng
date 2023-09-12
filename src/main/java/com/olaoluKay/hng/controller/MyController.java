package com.olaoluKay.hng.controller;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/api")
	  public MyInfo getInfo(@RequestParam(name="slackName") String slackName,
			                     @RequestParam(name="track")  String track) {
		  
	 Instant current_UTCInstant = Instant.now();
	 ZonedDateTime utc_DateTime = ZonedDateTime.ofInstant(current_UTCInstant, ZoneId.of("UTC"));
	 DateTimeFormatter date_formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z' EEEEE");
	 String current_day = utc_DateTime.format(date_formatter);
	   

		  
	   Instant currentUTCInstant = Instant.now();
           ZonedDateTime utcDateTime = ZonedDateTime.ofInstant(currentUTCInstant, ZoneId.of("UTC"));
           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
           String utc_time = utcDateTime.format(formatter);

	   
	   String githubFileUrl = "https://github.com/Olaoluwa22/stage1hng/blob/master/src/main/java/com/olaoluKay/hng/controller/MyController.java";
           String githubSourceUrl = "https://github.com/Olaoluwa22/stage1hng";
     
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
