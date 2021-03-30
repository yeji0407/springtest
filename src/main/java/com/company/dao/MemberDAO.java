package com.company.dao;
 
import java.util.List;
 
import com.company.dto.MemberVO;
 
public interface MemberDAO {
    
    public List<MemberVO> selectMember() throws Exception;
    public int insertMember(MemberVO vo) throws Exception;
}

