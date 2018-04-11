package com.huchuan.model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author huchuan
 *
 */
public class MovieModel implements Serializable{
		/**
		* 数据库标号
		* */
		private int id;

		/**
		* 电影名
		* */
		private String title;

		/**
		 *  类型
		 * */
		private String type;
		/**
		 * 上映时间
		 * */
		private String releaseYear;

		/**
		 * 制片国家
		 * */
		private String country;

		/**
		 * 语言
		 * */
		private String language;

		/**
		 * 片长
		 * */
		private int time;

		/**
		 * 导演
		 * */
		private String director;

		/**
		 * 主演
		 * */
		private String actor;

		/**
		 * 评分
		 * */
		private Double score;

		/**
		 * 操作时间
		 * */
		private Date opTime;


		public MovieModel() {
				super();
		}

		public MovieModel(String title,String type, String releaseYear, String country, String language, int time, String director, String actor, Double score) {
				super();
				this.title = title;
				this.type = type;
				this.releaseYear = releaseYear;
				this.country = country;
				this.language = language;
				this.time = time;
				this.director = director;
				this.actor = actor;
				this.score = score;
		}

		public int getId() {
				return id;
		}

		public void setId(int id) {
				this.id = id;
		}

		public String getTitle() {
				return title;
		}

		public void setTitle(String title) {
				this.title = title;
		}

		public String getReleaseYear() {
				return releaseYear;
		}

		public void setReleaseYear(String releaseYear) {
				this.releaseYear = releaseYear;
		}

		public String getCountry() {
				return country;
		}

		public void setCountry(String country) {
				this.country = country;
		}

		public String getLanguage() {
				return language;
		}

		public void setLanguage(String language) {
				this.language = language;
		}

		public int getTime() {
				return time;
		}

		public void setTime(int time) {
				this.time = time;
		}

		public String getDirector() {
				return director;
		}

		public void setDirector(String director) {
				this.director = director;
		}

		public String getActor() {
				return actor;
		}

		public void setActor(String actor) {
				this.actor = actor;
		}

		public Double getScore() {
				return score;
		}

		public void setScore(Double score) {
				this.score = score;
		}

		public Date getOpTime() {
				return opTime;
		}

		public void setOpTime(Date opTime) {
				this.opTime = opTime;
		}

		public String getType() {
				return type;
		}

		public void setType(String type) {
				this.type = type;
		}

		@Override
		public String toString() {
				return "MovieModel{" +
						"id=" + id +
						", title='" + title + '\'' +
						", type='" + type + '\'' +
						", releaseYear='" + releaseYear + '\'' +
						", country='" + country + '\'' +
						", language='" + language + '\'' +
						", time=" + time +
						", director='" + director + '\'' +
						", actor='" + actor + '\'' +
						", score=" + score +
						", opTime=" + opTime +
						'}';
		}


}
