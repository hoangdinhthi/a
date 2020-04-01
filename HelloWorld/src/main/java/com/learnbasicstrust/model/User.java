/**
 * Copyright(C) 2018 MTA
 * User.java Mar 31, 2020  HoangDinhThi
 */
package com.learnbasicstrust.model;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * @author HoangDinhThi
 *	
 */
public class User extends ActionForm {
//	private String name;
//	private int age;
//	private String sex;
//	private String about;
//	private String favourites;
//	private String job;
//	/**
//	 * @return the name
//	 */
//	public String getName() {
//		return name;
//	}
//	/**
//	 * @param name the name to set
//	 */
//	public void setName(String name) {
//		this.name = name;
//	}
//	/**
//	 * @return the age
//	 */
//	public int getAge() {
//		return age;
//	}
//	/**
//	 * @param age the age to set
//	 */
//	public void setAge(int age) {
//		this.age = age;
//	}
//	/**
//	 * @return the sex
//	 */
//	public String getSex() {
//		return sex;
//	}
//	/**
//	 * @param sex the sex to set
//	 */
//	public void setSex(String sex) {
//		this.sex = sex;
//	}
//	/**
//	 * @return the about
//	 */
//	public String getAbout() {
//		return about;
//	}
//	/**
//	 * @param about the about to set
//	 */
//	public void setAbout(String about) {
//		this.about = about;
//	}
//	/**
//	 * @return the favourites
//	 */
//	public String getFavourites() {
//		return favourites;
//	}
//	/**
//	 * @param favourites the favourites to set
//	 */
//	public void setFavourites(String favourites) {
//		this.favourites = favourites;
//	}
//	/**
//	 * @return the job
//	 */
//	public String getJob() {
//		return job;
//	}
//	/**
//	 * @param job the job to set
//	 */
//	public void setJob(String job) {
//		this.job = job;
//	}
//	
//	@Override
//	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//		ActionErrors actionErrors = new ActionErrors();
//		if (getName() == null || getName().length() == 0) {
//			actionErrors.add("user.name.required", new ActionMessage("error.user.name.required"));
//		}
//		if (getAge() < 0) {
//			actionErrors.add("user.age.invalid", new ActionMessage("error.user.age.invalid"));
//		}
//		return actionErrors;
//	}
	
	private int userId;
	private int groupId;
	private String loginName;
	private String password;
	private String fullName;
	private String fullNameKana;
	private String email;
	private String tel;
	private Date birthday;
	private String salt;
	private int role;

	public User() {
		this.userId = -1;
		this.groupId = -1;
		this.loginName = "";
		this.password = "";
		this.fullName = "";
		this.fullNameKana = "";
		this.email = "";
		this.tel = "";
		this.birthday = new Date();
		this.salt = "";
		this.role = 1;
	}

	/**
	 * @param userId
	 * @param groupId
	 * @param loginName
	 * @param password
	 * @param fullName
	 * @param fullNameKana
	 * @param email
	 * @param tel
	 * @param birthday
	 * @param salt
	 * @param role
	 */
	public User(int userId, int groupId, String loginName, String password, String fullName, String fullNameKana,
			String email, String tel, Date birthday, String salt, int role) {
		super();
		this.userId = userId;
		this.groupId = groupId;
		this.loginName = loginName;
		this.password = password;
		this.fullName = fullName;
		this.fullNameKana = fullNameKana;
		this.email = email;
		this.tel = tel;
		this.birthday = birthday;
		this.salt = salt;
		this.role = role;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the groupId
	 */
	public int getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId
	 *            the groupId to set
	 */
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @param loginName
	 *            the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the fullNameKana
	 */
	public String getFullNameKana() {
		return fullNameKana;
	}

	/**
	 * @param fullNameKana
	 *            the fullNameKana to set
	 */
	public void setFullNameKana(String fullNameKana) {
		this.fullNameKana = fullNameKana;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel
	 *            the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * @param salt
	 *            the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/**
	 * @return the role
	 */
	public int getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(int role) {
		this.role = role;
	}
	
}
