package com.bvrit.bvritconnect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "posts")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private Long postedById;

	@NotBlank
	private String postedByUsername;

	@NotBlank
	private String relatedToBranch;

	@NotBlank
	private String title;

	@NotBlank
	private String description;

	private String mediaUrl;

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPostedById() {
		return postedById;
	}

	public void setPostedById(Long postedById) {
		this.postedById = postedById;
	}

	public String getPostedByUsername() {
		return postedByUsername;
	}

	public void setPostedByUsername(String postedByUsername) {
		this.postedByUsername = postedByUsername;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMediaUrl() {
		return mediaUrl;
	}

	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

	public String getRelatedToBranch() {
		return relatedToBranch;
	}

	public void setRelatedToBranch(String relatedToBranch) {
		this.relatedToBranch = relatedToBranch;
	}

	public Post(@NotBlank Long postedById, @NotBlank String postedByUsername, @NotBlank String relatedToBranch,
			@NotBlank String title, String description, String mediaUrl) {
		super();
		this.postedById = postedById;
		this.postedByUsername = postedByUsername;
		this.relatedToBranch = relatedToBranch;
		this.title = title;
		this.description = description;
		this.mediaUrl = mediaUrl;
	}

	

}
