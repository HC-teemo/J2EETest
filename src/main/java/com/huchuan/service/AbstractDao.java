package com.huchuan.service;

import com.huchuan.mapper.MovieMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDao {
		protected final Logger logger=Logger.getLogger(this.getClass());

		@Autowired
		protected MovieMapper movieMapper;

		//检查白名单权限
		Boolean checkWhitePermission(int id){
				//TODO 白名单
				return false;
		}

		//检查黑名单权限
		Boolean checkBlackPermission(int id){
				//TODO 黑名单
				return false;
		}

}
