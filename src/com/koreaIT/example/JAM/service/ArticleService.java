package com.koreaIT.example.JAM.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.koreaIT.example.JAM.Article;
import com.koreaIT.example.JAM.dao.ArticleDao;

public class ArticleService {
	
	private ArticleDao articleDao;
	
	public ArticleService(Connection conn) {
		this.articleDao = new ArticleDao(conn);
	}

	public int doWrite(String title, String body) {
		return articleDao.doWrite(title, body);
	}

	public List<Article> showList() {
		
		List<Article> articles = new ArrayList<>();
		
		List<Map<String, Object>> articleListMap =  articleDao.showList();
		
		for (Map<String, Object> articleMap : articleListMap) {
			articles.add(new Article(articleMap));
		}
		
		return articles;
	}

	public Article showDetail(int id) {
		
		Map<String, Object> articleMap = articleDao.showDetail(id);
		
		if (articleMap.isEmpty()) {
			return null;
		}
		
		return new Article(articleMap);
	}

	public int articleCount(int id) {
		return articleDao.articleCount(id);
	}

	public void doModify(String newTitle, String newBody, int id) {
		articleDao.doModify(newTitle, newBody, id);
	}

	public int doDelete(int id) {
		return articleDao.doDelete(id);
	}


}