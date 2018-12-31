package com.icss.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icss.dao.Waste_typeDao;
import com.icss.entity.Waste_type;

//自动扫描到IOC容器中
@Service
public class Waste_typeSerivce {
	// 自动IOC容器注入对象。
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	public List<Waste_type> find() {
		// 此对象依赖SqlSessionFactory工厂。工厂在Spring的配置文件已经配置，依赖注入就行了。
		SqlSession sqlSession = null;
		List<Waste_type> list = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			// 应用 SqlSession操作数据。取数据
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);
			list = dao.find();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sqlSession.close();
		}
		return list;
	}
	
	public Waste_type findById(int id) {
		// 此对象依赖SqlSessionFactory工厂。工厂在Spring的配置文件已经配置，依赖注入就行了。
		SqlSession sqlSession = null;
		 Waste_type waste_type = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			// 应用 SqlSession操作数据。取数据
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);
			waste_type = dao.findById(id);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sqlSession.close();
		}
		return waste_type;
	}
	
	@Transactional
	public int add(Waste_type type) {
		// 此对象依赖SqlSessionFactory工厂。工厂在Spring的配置文件已经配置，依赖注入就行了。
		SqlSession sqlSession = null;
		int result = 0;  //数据库受影响的行数
		try {
			sqlSession = sqlSessionFactory.openSession();
			// 应用 SqlSession操作数据。取数据
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);
			result = dao.add(type);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sqlSession.close();
		}
		return result;
	}
	@Transactional
	public int delete(int id) {
		// 此对象依赖SqlSessionFactory工厂。工厂在Spring的配置文件已经配置，依赖注入就行了。
		SqlSession sqlSession = null;
		int result = 0;  //数据库受影响的行数
		try {
			sqlSession = sqlSessionFactory.openSession();
			// 应用 SqlSession操作数据。取数据
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);
			result = dao.delete(id);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sqlSession.close();
		}
		return result;
	}
	@Transactional
	public int update(Waste_type waste_type) {
		// 此对象依赖SqlSessionFactory工厂。工厂在Spring的配置文件已经配置，依赖注入就行了。
		SqlSession sqlSession = null;
		int result = 0;  //数据库受影响的行数
		try {
			sqlSession = sqlSessionFactory.openSession();
			// 应用 SqlSession操作数据。取数据
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);
			result = dao.update(waste_type);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sqlSession.close();
		}
		return result;
	}
}
