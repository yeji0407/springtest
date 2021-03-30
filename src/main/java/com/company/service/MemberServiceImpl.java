package com.company.service;
 
import java.util.List;

import javax.inject.Inject;

/*import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
*/
import org.springframework.stereotype.Service;

import com.company.dao.MemberDAO;
import com.company.dto.MemberVO;
 
@Service
public class MemberServiceImpl implements MemberService {
 
    @Inject
    private MemberDAO dao;
    
    @Override
    public List<MemberVO> selectMember() throws Exception {
 
        return dao.selectMember();
    }
    
    @Override
    public int insertMember(MemberVO vo) throws Exception {
		/*
		 * BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		 */        return dao.insertMember(vo);
    }
 
}

