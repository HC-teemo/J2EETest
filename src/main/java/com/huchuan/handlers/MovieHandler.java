package com.huchuan.handlers;

import java.util.Map;

import com.huchuan.model.MovieModel;
import com.huchuan.service.IPersist;
import com.huchuan.service.ISelect;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MovieHandler {
		Logger logger = Logger.getLogger(this.getClass());
		@Autowired()
		@Qualifier("selectService")
		ISelect<MovieModel> selectService;

		@Autowired()
		@Qualifier("persistService")
		IPersist<MovieModel> persistService;

		/**
		 * 查询所有电影信息
		 * @return ModelAndView
		 * @param map
		 */
		@RequestMapping("/allMovies")
		public String list(Map<String, Object> map) {
				logger.info("开始调用movies");
				map.put("movies", selectService.findMovies());
				return "list";
		}

		/**
		 * 根据标题查电影
		 * @param map
		 * @param title 标题
		 * @return
		 */
		@RequestMapping("/searchMovie")
		public String search(Map<String, Object> map, @RequestParam String title){
				logger.info("开始调用searchMovie");
				if(title.equals("")||title==null){
						// 查询所有的电影信息
						map.put("movies", selectService.findMovies());
				}else {
						//查询指定标题的电影信息
						map.put("movies", selectService.findMoviesByTitle(title));
				}
				return "list";
		}

		/**
		 * 进入新增页面
		 *
		 * @param
		 * @return ModelAndView
		 */
		@RequestMapping(value = "/movie", method = RequestMethod.GET)
		public String input(Map<String, Object> map) {
				map.put("movie", new MovieModel());
				return "input";
		}

		/**
		 * 确认新增电影信息
		 *
		 * @param movie
		 * @return
		 */
		@RequestMapping(value = "/movie", method = RequestMethod.POST)
		public String save(MovieModel movie) {
				// 确认新增
				logger.info("add new movie");
				persistService.addMovie(movie);
				return "redirect:/allMovies";
		}

		/**
		 * 进入修改页面
		 * @param id
		 *            编号
		 * @param map
		 *            隐式模型数据
		 * @return
		 */
		@RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
		public String input(@PathVariable("id") Integer id, Map<String, Object> map) {
				// 拿信息
				map.put("movie", selectService.findMovieById(id));
				return "modify";
		}

		/**
		 * 修改提交
		 *
		 * @param movie
		 *            电影信息
		 * @return
		 */
		@RequestMapping(value = "/movie", method = RequestMethod.PUT)
		public String update(MovieModel movie) {
				// 修改提交
				logger.info("change" + movie.getId());
				persistService.updateMovie(movie, movie.getId());
				return "redirect:/allMovies";
		}

		/**
		 * 删除电影信息
		 *
		 * @param id
		 *            电影成绩编号
		 * @return
		 */
		@RequestMapping(value = "/movie/{id}", method = RequestMethod.DELETE)
		public String delete(@PathVariable("id") Integer id) {
				logger.info("delete" + id);
				// 删除指定id的电影信息
				persistService.delMovie(id);
				return "redirect:/allMovies";
		}
}
