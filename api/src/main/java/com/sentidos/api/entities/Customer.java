package com.sentidos.api.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="customers")
public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn(name = "user_id")
    @OneToOne(fetch = FetchType.LAZY)
	private User user;
	
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Post> posts;
	
	private String name;
	
	private String lastName;
	
	@ManyToOne()
    @JoinColumn(name = "streetName_id")
	private StreetName streetName;
	
	@ManyToOne()
    @JoinColumn(name = "streetNumber_id")
	private StreetNumber streetNumber;
	
	@ManyToOne()
    @JoinColumn(name = "departmen_id")
	private Departmen departmen;
	
	@ManyToOne()
    @JoinColumn(name = "floor_id")
	private Floor floor;	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public StreetName getStreetName() {
		return streetName;
	}

	public void setStreetName(StreetName streetName) {
		this.streetName = streetName;
	}

	public StreetNumber getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(StreetNumber streetNumber) {
		this.streetNumber = streetNumber;
	}

	public Departmen getDepartmen() {
		return departmen;
	}

	public void setDepartmen(Departmen departmen) {
		this.departmen = departmen;
	}

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}		
}
