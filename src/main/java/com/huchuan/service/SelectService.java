package com.huchuan.service;

import com.huchuan.model.MovieModel;

import java.util.List;

public class SelectService extends AbstractDao implements ISelect<MovieModel>{

		public SelectService() {
				super();
		}

		public MovieModel findMovieById(int id) {
				MovieModel movieModel=movieMapper.findMovieById(id);
				logger.info("已找到id为"+id+"的电影");
				return movieModel;
		}

		public List<MovieModel> findMovies() {
				List<MovieModel> movieModels=movieMapper.findMovies();
				logger.info("已找到所有电影");
				return movieModels;
		}

		public List<MovieModel> findMoviesByTitle(String title) {
				List<MovieModel> movieModels=movieMapper.findMoviesByTitle(title);
				logger.info("已找到电影名包含"+title+"的电影");
				return movieModels;
		}

		public List<MovieModel> findMoviesByType(String type) {
				List<MovieModel> movieModels=movieMapper.findMoviesByType(type);
				logger.info("已找到电影类型为"+type+"的电影");
				return movieModels;
		}
}
