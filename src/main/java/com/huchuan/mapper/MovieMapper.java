package com.huchuan.mapper;

import com.huchuan.model.MovieModel;

public interface MovieMapper {

		/**
		 * 添加一个电影信息
		 * @param movieModel 电影实体类对象
		 */
		public void addMovie(MovieModel movieModel);

		/**
		 * 根据id删除电影信息
		 * @param id 需要删除的电影的id
		 */
		public void delMovieById(int id);

		/**
		 * 更新电影信息
		 * @param movieModel 电影实体类对象
		 * @param id 需要更新的电影的id
		 */
		public void updateMovie(MovieModel movieModel,int id);

		/**
		 * 根据id查找一个电影信息
		 * @param id 需要查找的电影的id
		 * @return 找到的电影实体类对象
		 */
		public MovieModel findMovieById(int id);

}
