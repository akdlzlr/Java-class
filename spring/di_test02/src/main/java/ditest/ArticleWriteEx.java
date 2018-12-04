package ditest;
import org.springframework.context.support.GenericXmlApplicationContext;

import ditest.model.Article;
import ditest.service.ArticleWriteService;

public class ArticleWriteEx {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(
						"classpath:application-context.xml");
		
		System.out.println("설정 완료");
		
		ArticleWriteService service = ctx.getBean("writeArticleService",ArticleWriteService.class);
		
		Article article = new Article();
				
		service.write(article);
		
		ctx.close();
	}
}
