package com.company.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dto.MemberVO;
import com.company.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SignupController {

	private static final Logger logger = LoggerFactory.getLogger(SignupController.class);

	@Inject
	private MemberService service;

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/sign")
	public String signup(HttpServletRequest request, MemberVO vo, Model model) throws Exception {

		logger.info("sign");
		logger.info(request.getParameter("userid"));

		vo.setId(request.getParameter("userid"));
		vo.setPw(request.getParameter("userpw"));
		vo.setName(request.getParameter("username"));
		vo.setEmail(request.getParameter("useremail"));

		int result = service.insertMember(vo);
		logger.info(Integer.toString(result));
		

		List<MemberVO> memberList = service.selectMember();

		model.addAttribute("memberList", memberList);

		return "home";
	}

	/*
	 * @RequestMapping(value = "/success", method = RequestMethod.GET) public String
	 * home(Locale locale, Model model) throws Exception{
	 * 
	 * logger.info("success");
	 * 
	 * service.insertMember();
	 * 
	 * List<MemberVO> memberList = service.selectMember();
	 * 
	 * model.addAttribute("memberList", memberList);
	 * 
	 * return "success"; }
	 */
}
