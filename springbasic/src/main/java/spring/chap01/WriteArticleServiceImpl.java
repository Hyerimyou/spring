package spring.chap01;

public class WriteArticleServiceImpl implements WriteArticleService {
	private ArticleDao articleDao;//구현 객체 저장
	
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	//기본 생성자 : setter방식으로 주입시 기본 생성자 사용
	public WriteArticleServiceImpl() {}

	public WriteArticleServiceImpl(ArticleDao articleDao) {
		this.articleDao = articleDao; // MySQLArticleDao객체 저장
	}
	
	@Override
	public void write(Article article) {
		  System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
		  articleDao.insert(article);
	}

}
