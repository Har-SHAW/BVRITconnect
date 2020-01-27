package com.bvrit.bvritconnect.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bvrit.bvritconnect.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository <Notification, Long>{
	Optional<Notification> findById(Long id);
	List<Notification> findAll();

}
