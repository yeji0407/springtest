package com.company.service.mapper;
 
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.company.service.vo.MemberVO;
 
@Mapper
public interface SignupMapper {
    

    public List<MemberVO> selectMember() throws Exception;

    public int insertMember(MemberVO vo) throws Exception;
 
}
