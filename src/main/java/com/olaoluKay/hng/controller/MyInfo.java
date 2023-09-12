package com.olaoluKay.hng.controller;

public class MyInfo {

	private String slack_Name;
	private String current_Day;
	private String utc_Time;
	private String track;
	private String github_File_Url;
	private String github_Source_Url;
	private int status_Code;
	
	public String getSlack_Name() {
		return slack_Name;
	}
	public void setSlack_Name(String slack_Name) {
		this.slack_Name = slack_Name;
	}
	public String getCurrent_Day() {
		return current_Day;
	}
	public void setCurrent_Day(String current_Day) {
		this.current_Day = current_Day;
	}
	public String getUtc_Time() {
		return utc_Time;
	}
	public void setUtc_Time(String utc_Time) {
		this.utc_Time = utc_Time;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public String getGithub_File_Url() {
		return github_File_Url;
	}
	public void setGithub_File_Url(String github_File_Url) {
		this.github_File_Url = github_File_Url;
	}
	public String getGithub_Source_Url() {
		return github_Source_Url;
	}
	public void setGithub_Source_Url(String github_Source_Url) {
		this.github_Source_Url = github_Source_Url;
	}
	public int getStatus_Code() {
		return status_Code;
	}
	public void setStatus_Code(int status_Code) {
		this.status_Code = status_Code;
	}
	
}
