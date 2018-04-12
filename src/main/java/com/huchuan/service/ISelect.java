package com.huchuan.service;

import java.util.List;

public interface ISelect<T> {
		/**
		 * @param id 所查电影的Id
		 * @return 查到的电影
		 */
		public T findMovieById(int id);

		/**
		 * @return 返回全部电影信息
		 */
		public List<T> findMovies();

		/**
		 * @param title 需要查的电影的标题
		 * @return 按照标题查找到的电影
		 */
		public List<T> findMoviesByTitle(String title);

		/**
		 * @param type 需要查找的电影类别
		 * @return 按照类别查找到的电影
		 */
		public List<T> findMoviesByType(String type);
}
