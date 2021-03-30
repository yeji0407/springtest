package com.company.service;
 
import java.util.List;
 
import com.company.dto.MemberVO;
 
public interface MemberService {
    
	/**
	 * hgfgdfffffffffffffffffffffffffffffff
	 * @return
	 * @throws Exception
	 */
    public List<MemberVO> selectMember() throws Exception;
    public int insertMember(MemberVO vo) throws Exception;
}

