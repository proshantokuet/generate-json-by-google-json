package com.proshanto.bidiectionaljson.create.json.from.bidirectional.relation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="default_options")
public class DefaultOptions {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default_options_id_seq")
	@SequenceGenerator(name = "default_options_id_seq", sequenceName = "default_options_id_seq", allocationSize = 1)
	@Expose
	private Long id;
	@Expose
	private String label;
	@Expose
	private String type;
	@Expose
	private String child;
	@Expose
	private String value;
	@ManyToOne
	private MainConfiguration mainConfiguration;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Long getId() {
		return id;
	}
	public MainConfiguration getMainConfiguration() {
		return mainConfiguration;
	}
	public void setMainConfiguration(MainConfiguration mainConfiguration) {
		this.mainConfiguration = mainConfiguration;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
