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
 


@Controller
public class HomeController {
    
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    @Autowired
    private SignupService service;

    
    /**
     * @param model
     * @return home.jsp
     * @throws Exception
     */
    @RequestMapping(value = "/")
    public String home(Model model) throws Exception{
 
        logger.info("entered home in HomeController");
        
        List<MemberVO> memberList = service.selectMember();
        
        model.addAttribute("memberList", memberList);
 
        return "home";
    }
    
    //회원가입 페이지로 이동
    @RequestMapping(value = "/signup")
    public String signup(Model model) throws Exception{
 
        logger.info("signup");
 
        return "signup";
    }
}

