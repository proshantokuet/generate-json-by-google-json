package com.proshanto.bidiectionaljson.create.json.from.bidirectional.relation.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name="main_configuration")

public class MainConfiguration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "main_configuration_id_seq")
	@SequenceGenerator(name = "main_configuration_id_seq", sequenceName = "main_configuration_id_seq", allocationSize = 1)
	private Long id;
	
	@Column(unique=true)
	@Expose
	private String name;
	@Expose
	private String type;
	@Expose
	private String titlePosition;
	@Expose
	private String title;
	@Expose
	private String idName;
	@Expose
	private String api;
	@Expose
	private String xs;
	@Expose
	private String md;
	@Expose
	private String appearance;
	@OneToMany(mappedBy="id")
	@Expose
    private List<DefaultOptions> defaultOptions ;
    private boolean required;
    @Expose
    private boolean multiple;
    @Expose
    private String changedChildOption;
    @Expose
    private String parent;
    @Expose
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pagination_for_table_id", referencedColumnName = "id")    
    
    @ManyToOne
    private DashboardEngine dashboardEngine;
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
	public String getTitlePosition() {
		return titlePosition;
	}
	public void setTitlePosition(String titlePosition) {
		this.titlePosition = titlePosition;
	}
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
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
	
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public boolean isMultiple() {
		return multiple;
	}
	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}
	public String getChangedChildOption() {
		return changedChildOption;
	}
	public void setChangedChildOption(String changedChildOption) {
		this.changedChildOption = changedChildOption;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIdName() {
		return idName;
	}
	public void setIdName(String idName) {
		this.idName = idName;
	}
	public DashboardEngine getDashboardEngine() {
		return dashboardEngine;
	}
	public void setDashboardEngine(DashboardEngine dashboardEngine) {
		this.dashboardEngine = dashboardEngine;
	}
	
	

}
