package io.java.spring.cours;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import io.java.spring.modules.Module;

@Entity
public class Cours {
	
	@Id
	private Integer id;
	private String name;
	private String description;
	@ManyToOne
	private Module module;
	
	public Cours() {
	}
	
	public Cours(Integer id, String name, String description, Integer moduleId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.module = new Module(moduleId,"","");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}
	
	
	
	

}
