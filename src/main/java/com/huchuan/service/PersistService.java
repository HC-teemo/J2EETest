package com.huchuan.service;

import com.huchuan.model.MovieModel;

public class PersistService extends AbstractDao implements IPersist<MovieModel>{
		public PersistService() {
				super();
				System.out.println("无参构造方法");
		}

		public void addMovie(MovieModel movieModel) {
				movieMapper.addMovie(movieModel);
				logger.info("已添加电影："+movieModel.getTitle()+"!");
		}

		public void updateMovie(MovieModel movieModel, int id) {
				movieMapper.updateMovie(movieModel,id);
				logger.info("已更新电影"+id);
		}

		public void delMovie(int id) {
				movieMapper.delMovieById(id);
				logger.info("已删除电影"+id);
		}
}
