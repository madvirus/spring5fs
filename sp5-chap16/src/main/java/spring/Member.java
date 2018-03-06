package spring;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Member {

	private Long id;
	private String email;
	@JsonIgnore
	private String password;
	private String name;
	//@JsonFormat(shape = Shape.STRING)
	private LocalDateTime registerDateTime;
	private LocalDateTime registerDateTime2;
	private Date registerDate;

	public Member(String email, String password,
			String name, LocalDateTime regDateTime) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = regDateTime;
		this.registerDateTime2 = regDateTime;
		this.registerDate = Date.from(regDateTime.atZone(ZoneId.systemDefault()).toInstant());
	}

	void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if (!password.equals(oldPassword))
			throw new WrongIdPasswordException();
		this.password = newPassword;
	}

	public boolean matchPassword(String password) {
		return this.password.equals(password);
	}

	public LocalDateTime getRegisterDateTime2() {
		return registerDateTime2;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

}
