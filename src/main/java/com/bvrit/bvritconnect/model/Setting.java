package com.bvrit.bvritconnect.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "settings", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "userId"
        }),
})

public class Setting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String recieveNotificationFrom;
	
	@NotBlank
	private String recieveFeedFrom;
	
	@NotBlank
	private Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRecieveNotificationFrom() {
		return recieveNotificationFrom;
	}

	public void setRecieveNotificationFrom(String recieveNotificationFrom) {
		this.recieveNotificationFrom = recieveNotificationFrom;
	}

	public String getRecieveFeedFrom() {
		return recieveFeedFrom;
	}

	public void setRecieveFeedFrom(String recieveFeedFrom) {
		this.recieveFeedFrom = recieveFeedFrom;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Setting(@NotBlank String recieveNotificationFrom, @NotBlank String recieveFeedFrom, @NotBlank Long userId) {
		super();
		this.recieveNotificationFrom = recieveNotificationFrom;
		this.recieveFeedFrom = recieveFeedFrom;
		this.userId = userId;
	}

	public Setting() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
