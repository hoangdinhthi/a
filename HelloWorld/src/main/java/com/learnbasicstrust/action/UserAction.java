/**
 * Copyright(C) 2018 MTA
 * UserAction.java Mar 31, 2020  HoangDinhThi
 */
package com.learnbasicstrust.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.digester.xmlrules.FromXmlRuleSet;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.MappingDispatchAction;

import com.learnbasicstrust.dao.UserDao;
import com.learnbasicstrust.model.User;

/**
 * @author HoangDinhThi
 * 
 */
public class UserAction extends MappingDispatchAction {
	// @Override
	// public ActionForward execute(ActionMapping mapping, ActionForm form,
	// HttpServletRequest request,
	// HttpServletResponse response) throws Exception {
	// User user = (User) form;
	// user.setName("Hello Strust 1");
	// user.setAge(10);
	// return mapping.findForward("success");
	// }

	public ActionForward addUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//User user = (User) form;
//		user.setName("Hello Strust 1");
//		user.setAge(10);
		return mapping.findForward("addUser");
	}

	public ActionForward editUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
//		User user = (User) form;
//		user.setName("Hello Strust 1");
//		user.setAge(10);
		return mapping.findForward("editUser");
	}

	public ActionForward deleteUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
//		User user = (User) form;
//		user.setName("Hello Strust 1");
//		user.setAge(10);
		return mapping.findForward("deleteUser");
	}

	public ActionForward viewUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int id = Integer.valueOf(request.getParameter("id"));
		UserDao userDao = new UserDao();
		User user = userDao.getUserById(id);
		request.setAttribute("u", user);
		return mapping.findForward("viewUser");
	}
	
	public ActionForward listUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
//		User user = (User) form;
//		user.setName("Hello Strust 1");
//		user.setAge(10);
		return mapping.findForward("listUser");
	}
}
