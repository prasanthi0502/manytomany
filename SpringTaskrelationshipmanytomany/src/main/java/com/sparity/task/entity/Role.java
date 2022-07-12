package com.sparity.task.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;

	
	 @ManyToMany(fetch = FetchType.LAZY,
		      cascade = {
		              CascadeType.PERSIST,
		              CascadeType.MERGE
		          },
			 mappedBy = "roles")
	private List<Users> users;
	public Role() {

	}

	public Role(String name) {

		this.name = name;
	}

	public Role(Integer id, String name) {

		this.id = id;
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
