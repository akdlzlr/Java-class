package ditest;

import ditest.model.Article;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ditest.service.ArticleWriteService;

public class AutoWiredMain1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext(
						"application-context.xml");
		
		ArticleWriteService service = 
				ctx.getBean("articleWriteService",
								ArticleWriteService.class);
		
		Article article = new Article();
		
		service.write(article);
		
		ctx.close();
	}
}
