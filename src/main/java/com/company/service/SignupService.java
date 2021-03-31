package com.company.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
*/
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.service.vo.MemberVO;
import com.company.service.mapper.SignupMapper;
 
@Service
@Transactional
public class SignupService{
 
    @Autowired
    SignupMapper signupMapper;
    

    public List<MemberVO> selectMember() throws Exception {
 
        return signupMapper.selectMember();
    }
    

    public int insertMember(MemberVO vo) throws Exception {
		
		/* BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); */
		 return signupMapper.insertMember(vo);
    }
 
}

