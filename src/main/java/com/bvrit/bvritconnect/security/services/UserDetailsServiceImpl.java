package com.bvrit.bvritconnect.security.services;

import com.bvrit.bvritconnect.model.*;
import com.bvrit.bvritconnect.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ProfileRepository PR;

	@Autowired
	PostRepository PostR;
	
	@Autowired
	NotificationRepository NotificationR;
	
	@Autowired
	SettingRepository SettingR;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username).orElseThrow(
				() -> new UsernameNotFoundException("User Not Found with -> username or email : " + username));
		return UserPrinciple.build(user);
	}

	public User findByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username).orElseThrow(
				() -> new UsernameNotFoundException("User Not Found with -> username or email : " + username));
		return user;
	}
	
	
	//Finding profiles

	public Profile profileFindByUsername(String username) throws UsernameNotFoundException {
		Profile profile = PR.findByUsername(username).orElseThrow(
				() -> new UsernameNotFoundException("Profile Not Found with -> username or email : " + username));
		return profile;
	}

	
	
	//Finding Posts

	public Post postFindById(Long id) throws UsernameNotFoundException {
		Post p = PostR.findById(id).orElseThrow(
				() -> new UsernameNotFoundException("Profile Not Found with -> username or email : " + id));
		return p;
	}
	
	public List<Post> postFindByPostedById(Long postedById) {
		List<Post> p = PostR.findByPostedById(postedById);
		return p;
	}

	public List<Post> postFind() {
		List<Post> p = PostR.findAll();
		return p;
	}
	
	//Finding Settings
	
	public Setting settingFind(Long userId) {
		Setting p = SettingR.findByUserId(userId);
		return p;
	}
	
	//Finding Notifications
	
	public List<Notification> notificationFind() {
		List<Notification> p = NotificationR.findAll();
		return p;
	}
	
	//Saving information to table

	public String profileSave(Profile profile) {
		PR.save(profile);
		return "Profile Created";
	}

	public String postSave(Post post) {
		PostR.save(post);
		return "Post Created";
	}
	
	public String notificationSave(Notification notification) {
		NotificationR.save(notification);
		return "Notification Created";
	}
	
	public String settingSave(Setting setting) {
		SettingR.save(setting);
		return "Setting Created";
	}

}