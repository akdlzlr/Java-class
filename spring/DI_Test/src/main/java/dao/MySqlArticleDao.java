package dao;

import model.Article;

public class MySqlArticleDao implements ArticleDao {

	@Override
	public void insert(Article article) {
		System.out.println("MySql 게시글 등록");
	}

}
