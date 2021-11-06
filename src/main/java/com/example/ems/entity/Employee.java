package com.example.ems.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {	
	@Id
	@GeneratedValue
	private Integer eid;
	@Column
	private String ename;
	@Column
	private Integer age;
	@Column
	private String ecity;
	@Column
	private String email;

}
