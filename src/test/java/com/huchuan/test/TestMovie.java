package com.huchuan.test;

import com.huchuan.mapper.MovieMapper;
import com.huchuan.model.MovieModel;
import com.huchuan.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Before;
import org.junit.Test;

public class TestMovie {
		Logger logger;
		@Before
		public void getLogger(){
				try{
						DOMConfigurator.configure("src/log4j.xml");
						logger = Logger.getLogger(TestMovie.class);
				} catch (Exception e){
						e.printStackTrace();
				}
		}

		@Test
		public void addMovie(){
				SqlSessionFactory sqlSessionFactory = SessionFactory
						.getSessionFactory();
				SqlSession session = sqlSessionFactory.openSession();
				MovieMapper mapper = session.getMapper(MovieMapper.class);
				MovieModel movieModel = new MovieModel("title","type", "2018", "中国", "中文", 100,
						"张三", "李四", 9.9);
				mapper.addMovie(movieModel);
				session.commit();
				session.close();
				logger.info("测试电影添加成功!");
		}
}
