package com.proshanto.bidiectionaljson.create.json.from.bidirectional.relation.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="dashboard_engine")
public class DashboardEngine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dashboard_engine_id_seq")
	@SequenceGenerator(name = "dashboard_engine_id_seq", sequenceName = "dashboard_engine_id_seq", allocationSize = 1)
	@Expose
	private Long id;
	@Expose
	private String name;
	@Expose
	private String type;
	@Expose
	private String xs;
	@Expose
	private String md;
	@Expose
	private String appearance;
	@OneToMany(mappedBy="id")
	@Expose
    private Set<MainConfiguration> config ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getXs() {
		return xs;
	}
	public void setXs(String xs) {
		this.xs = xs;
	}
	public String getMd() {
		return md;
	}
	public void setMd(String md) {
		this.md = md;
	}
	public String getAppearance() {
		return appearance;
	}
	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}
	public Set<MainConfiguration> getMainConfigurations() {
		return config;
	}
	public void setMainConfigurations(Set<MainConfiguration> mainConfigurations) {
		this.config = mainConfigurations;
	}
	

}
