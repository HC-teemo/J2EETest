package com.huchuan.test;


import com.huchuan.model.MovieModel;
import com.huchuan.service.IPersist;
import com.huchuan.service.ISelect;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * 使用spring的测试框架
 */
@RunWith(SpringJUnit4ClassRunner.class)
/**
 * 配置文件
 * */
@ContextConfiguration("classpath:applicationContext.xml")

public class MovieMapperTest {

		Logger logger = Logger.getLogger(this.getClass());

		@Resource
		private IPersist<MovieModel> persistService;

		@Resource
		private ISelect<MovieModel> selectService;

		@Test
		public void testAddMovie(){
				MovieModel movieModel=new MovieModel("Test","test","2018",
						"中国","中文",123,"hu","chuan",9.9);
				persistService.addMovie(movieModel);
		}

		@Test
		public void testDelMovie(){
				try {
						persistService.delMovie(3);
				}catch (Exception e){
						e.printStackTrace();
				}

		}

		@Test
		public void testUpdateMovie(){
				MovieModel movieModel=new MovieModel("Test","test","2018",
						"中国","中文",123,"hu","chuan",9.9);
				persistService.updateMovie(movieModel,1);
		}
//
//		@Test
//		private void testSelectMovieById(){
//
//		}
//
//		@Test
//		private void testSelectMovies(){
//
//		}
//
//		@Test
//		private void testSelectMoviesByTitle(){
//
//		}
//
//		@Test
//		private void testSelectMoviesBytype(){
//
//		}
}
