package com.longnguyen.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password")
	private String passWord;
	
	@Column(name = "fullname", columnDefinition = "TEXT") // nếu hoa thì tự động chuyển thành thường và thêm _
	private String fullName;
	
	@Column
	private Integer status;
	
	//Tạo bảng trung gian là giữa user và role 
	@ManyToMany(fetch = FetchType.LAZY) // loading theo kiểu LAZY
	@JoinTable(name = "user_role",
	        joinColumns = @JoinColumn(name = "userid"), // đứng ở entity nào thì @JoinColumn của Entity đó 
	        inverseJoinColumns = @JoinColumn(name = "roleid")
	    )
	private List<RoleEntity> roles = new ArrayList<>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}
	
}
