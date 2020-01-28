package com.bvrit.bvritconnect.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.bvrit.bvritconnect.message.request.ProfileForm;
import com.bvrit.bvritconnect.message.request.UserId;
import com.bvrit.bvritconnect.message.request.Username;
import com.bvrit.bvritconnect.model.Notification;
import com.bvrit.bvritconnect.model.Post;
import com.bvrit.bvritconnect.model.Profile;
import com.bvrit.bvritconnect.model.Setting;
import com.bvrit.bvritconnect.security.services.UserDetailsServiceImpl;


@org.springframework.web.bind.annotation.RestController

public class RestController {
	
	@Autowired
	UserDetailsServiceImpl us;

	ModelAndView m = new ModelAndView("/index.html");
	
	@GetMapping("/test")
	public String test() {
		return "Test Successfull";
	}

	@GetMapping("/home")
	@ResponseBody
	public ModelAndView index() {
		return m;
	}

	@GetMapping("/login")
	@ResponseBody
	public ModelAndView login() {
		return m;
	}

	@GetMapping("/signup")
	@ResponseBody
	public ModelAndView signup() {
		return m;
	}

	@GetMapping("/user/{email}")
	public ModelAndView hello(@PathVariable("email") String email) {
		return m;
	}
	
	//@RequestMapping(value = "/get/profile", method = RequestMethod.POST, consumes = "application/json")
	
	//Profile
	
	
	@PostMapping("/getProfile")
	public String nm(@Valid @RequestBody Username user) {
		Profile p = us.profileFindByUsername(user.getUsername());
		return "{\"username\":\""+p.getUsername()+"\",\"email\":\""+p.getEmail()+"\",\"skills\":\""+p.getSkills()+"\",\"achievements\":\""+p.getAchievements()+"\",\"languages\":\""+p.getLanguages()+"\",\"summary\":\""+p.getSummary()+"\",\"goodat\":\""+p.getGoodat()+"\",\"projects\":\""+p.getProjects()+"\",\"hobbies\":\""+p.getHobbies()+"\",\"name\":\""+p.getName()+"\"}";
	}
	
	@PostMapping("/putProfile")
	public String pp(@Valid @RequestBody ProfileForm p) {
		Profile Pro = new Profile(p.getName(),p.getUsername(),p.getEmail(),p.getSkills(),p.getHobbies(),p.getAchievements(),p.getProjects(),p.getGoodat(),p.getLanguages(),p.getSummary());
		return us.profileSave(Pro);
	}
	
	
	//Post
	
	
	
	@PostMapping("/getPost")
	public List<Post> getPost(){
		return us.postFind();
	}
	
	@PostMapping("/putPost")
	public String putPost(@Valid @RequestBody Post post) {
		return us.postSave(post);
	}
	
	
	
	//Notifications
	
	
	
	@PostMapping("/getNotification")
	public List<Notification> getNotification(){
		return us.notificationFind();
	}
	
	@PostMapping("/putNotification")
	public String putNotification(@Valid @RequestBody Notification obj) {
		return us.notificationSave(obj);
	}
	
	
	//Settings
	
	
	
	@PostMapping("/putSetting")
	public String putSetting(@Valid @RequestBody Setting obj) {
		return us.settingSave(obj);
	}
	
	@PostMapping("/getSetting")
	public Setting getSetting(@Valid @RequestBody UserId obj) {
		return us.settingFind(obj.getUserId());
	}
	
}
	