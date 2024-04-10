package com.ohgiraffers.section01.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberService {

    private final MemberDAO memberDAO;

    @Autowired  // 필기
    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    /* 전체 회원 조회 */
    public Map<Long, MemberDTO> selectMembers() {

        return memberDAO.selectMembers();
    }

    /* id 로 회원 조회 */
    public MemberDTO selectMember(Long id) {

        return memberDAO.selectMember(id);
    }

}