package com.huchuan.mapper;

import com.huchuan.model.MovieModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
		public void updateMovie(@Param("movieModel")MovieModel movieModel, @Param("id")int id);

		/**
		 * 根据id查找一个电影信息
		 * @param id 需要查找的电影的id
		 * @return 找到的电影实体类对象
		 */
		public MovieModel findMovieById(int id);

		/**
		 * @return 所有电影的信息
		 */
		public List<MovieModel> findMovies();

		/**
		 * @param title 电影名
		 * @return 找到的电影集合
		 */
		public List<MovieModel> findMoviesByTitle(String title);

		/**
		 * @param type 电影类型
		 * @return 找到的电影集合
		 */
		public List<MovieModel> findMoviesByType(String type);

}
