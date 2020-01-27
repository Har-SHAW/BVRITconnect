package com.bvrit.bvritconnect.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "notifications")

public class Notification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String title;
	
	@NotBlank
	private String content;
	
	@NotBlank
	private String relatedToBranch;
	
	@NotBlank
	private String postedById;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRelatedToBranch() {
		return relatedToBranch;
	}

	public void setRelatedToBranch(String relatedToBranch) {
		this.relatedToBranch = relatedToBranch;
	}

	public String getPostedById() {
		return postedById;
	}

	public void setPostedById(String postedById) {
		this.postedById = postedById;
	}

	public Notification(@NotBlank String title, @NotBlank String content, @NotBlank String relatedToBranch,
			@NotBlank String postedById) {
		super();
		this.title = title;
		this.content = content;
		this.relatedToBranch = relatedToBranch;
		this.postedById = postedById;
	}

	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
