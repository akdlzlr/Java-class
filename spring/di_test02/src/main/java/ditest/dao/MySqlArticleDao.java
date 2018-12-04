package ditest.dao;

import org.springframework.stereotype.Component;

import ditest.model.Article;

@Component("mySqlDao")
public class MySqlArticleDao implements ArticleDao {

	@Override
	public void insert(Article article) {
		System.out.println("MySql 게시글 등록");
	}

}
