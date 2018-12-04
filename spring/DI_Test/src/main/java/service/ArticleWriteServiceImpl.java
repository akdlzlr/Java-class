package service;

import dao.ArticleDao;
import model.Article;

public class ArticleWriteServiceImpl implements ArticleWriteService{

	private ArticleDao dao;
	private String name;
	
	public ArticleWriteServiceImpl(String name,ArticleDao dao) {
		this.dao = dao;
		this.name=name;
	}
	
	@Override
	public void write(Article article) {
		System.out.println("서비스 : 게시글 등록");
		dao.insert(article);
	}
}
