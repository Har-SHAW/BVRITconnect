package com.bvrit.bvritconnect.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bvrit.bvritconnect.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	Optional<Post> findById(Long id);
	List<Post> findAll();
	List<Post> findByPostedById(Long postedById);
}
