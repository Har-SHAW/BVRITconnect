package com.bvrit.bvritconnect.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "profile", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "username"
        }),
})
public class Profile{
	

    @NotBlank
    @Size(min=3, max = 50)
    private String name;

    @Id
    @NotBlank
    @Size(min=3, max = 50)
    private String username;

    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    private String skills;
    private String hobbies;
    private String achievements;
    private String projects;
    private String  goodat;
    private String languages;
    private String summary;
    
    public Profile() {}
    
    public Profile(@NotBlank @Size(min = 3, max = 50) String name,
			@NotBlank @Size(min = 3, max = 50) String username, @NotBlank @Size(max = 50) @Email String email,
			String skills, String hobbies, String achievements, String projects, String goodat, String languages,
			String summary) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.skills = skills;
		this.hobbies = hobbies;
		this.achievements = achievements;
		this.projects = projects;
		this.goodat = goodat;
		this.languages = languages;
		this.summary = summary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getAchievements() {
		return achievements;
	}
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	public String getProjects() {
		return projects;
	}
	public void setProjects(String projects) {
		this.projects = projects;
	}
	public String getGoodat() {
		return goodat;
	}
	public void setGoodat(String goodat) {
		this.goodat = goodat;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
	
    
    
    
    
}
