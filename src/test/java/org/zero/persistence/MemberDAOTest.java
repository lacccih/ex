package org.zero.persistence;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zero.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	@Test
	public void getTimeTest() {
		System.out.println(dao.getTime());
	}
	
	@Test
	public void insertMemberTest() {
		MemberVO vo = new MemberVO();
		vo.setUserid("124");
		vo.setUserpw("0000");
		vo.setUsername("username");
		vo.setEmail("email@email.com");
		dao.insertMember(vo);
	}
	
	@Test
	public void readMemberTest() {
		try {
			System.out.println(dao.readMember("123").toString());
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	
	@Test
	public void readWithPWTest() {
		try {
			System.out.println(dao.readWithPW("123","0000").toString());
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	
}
