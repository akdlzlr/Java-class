import java.util.Map;

import org.junit.Test;

import edu.iot.common.model.Member;
import edu.iot.common.service.MemberService;

public class MemberServiceTest extends BaseServiceTest<MemberService>{

	@Test
	public void testGetPage() throws Exception{
		Map<String, Object> map = service.getPage(1);
		
		assert map.containsKey("pagination") :
			"Pagination 객체가 없습니다.";
		
		assert map.containsKey("list") : "List 객체가 없습니다.";
	}
	
	@Test
	public void testFindById() throws Exception{
		Member member = service.findById("polo123467890");
		
		assert member != null :
			"유저가 없습니다.";
		
	}
}
