package com.longnguyen.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AbstractDTO<T> {

	private Long id;
	private Date createdData;
	private Date modifiedData;
	private String createdBy;
	private String modifiedBy;
	private List<T> listResult = new ArrayList<>();
	
	public Date getCreatedData() {
		return createdData;
	}
	public void setCreatedData(Date createdData) {
		this.createdData = createdData;
	}
	public Date getModifiedData() {
		return modifiedData;
	}
	public void setModifiedData(Date modifiedData) {
		this.modifiedData = modifiedData;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<T> getListResult() {
		return listResult;
	}
	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}
	
}
