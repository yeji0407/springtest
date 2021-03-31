package com.company.service.web;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.company.service.vo.MemberVO;
import com.company.service.SignupService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SignupController {

	private static final Logger logger = LoggerFactory.getLogger(SignupController.class);

	@Autowired
	private SignupService service;

	/**
	 * Simply selects the home view to render by returning its name.
	 */

		/**
		 * 
		 * @param vo
		 * @param model
		 * @return
		 * @throws Exception
		 */
	@RequestMapping(value = "/sign")
	public String signup(MemberVO vo, Model model) throws Exception {

		logger.info("sign");

		int result = service.insertMember(vo);
		logger.info(Integer.toString(result));
		

		List<MemberVO> memberList = service.selectMember();

		model.addAttribute("memberList", memberList);

		return "redirect:/";
	}
	

}
