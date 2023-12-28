package com.springMVC.registration.model;


import javax.validation.constraints.NotEmpty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "register")
public class Register {
	
	@Id
	@NotEmpty(message = "field is empty")
	Integer stdId;
	
	private String stdName;
	@NotEmpty(message = "field is empty")
	private String stdGender;
	@NotEmpty(message = "field is empty")
	private String stdEmail;
	private String stdPhno;
}
