import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDaoTest<D> extends BaseTest {

	@Autowired
	D dao;
	
	@Test
	public void test() {
		// autowired 테스트~!
		assert dao!= null:
			dao.getClass().getSimpleName()+" 바인딩 실패";
	}
}
