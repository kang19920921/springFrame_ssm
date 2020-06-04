package JUnitTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.kang.dao.FindAllDao;
import com.kang.service.FindStudentService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class testMybatis {
	
	
//	@Before
	public void before() {
//		ClassPathXmlApplicationContext	ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
	}
	
	@Autowired
	private FindStudentService findStudentService;
	@Autowired
	private FindAllDao  findAllDao;
	
	@Test
	public void test() {
		System.out.println("test mybatis ======= ");
		System.out.println(findStudentService.findALL()+"");
		System.out.println(findAllDao.findALLByMap());
	}
	
	
	


}
