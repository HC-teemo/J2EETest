package com.huchuan.service;

public interface IPersist<T> {

		public void addMovie(T t);

		public void updateMovie(T t,int id);

		public void delMovie(int id);
}
