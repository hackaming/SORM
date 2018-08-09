package com.bjsxt.core;
import java.util.*;
/**
 * 
 * @author XYan
 * 千千万万人使用，所以要加上注释。
 * 负责查询，对外提供服务的接口。
 */
@SuppressWarnings(value = { "all" })
public interface Query {
	/**
	 * 
	 * @param sql 执行DML的语句
	 * @param params 参数
	 * @return 返回受影响的行数
	 */
	public int executeDML(String[] sql,Object[] params);
	/*
	 * obj需要插入DB的对象
	 */
	public void insert(Object obj);
	/**
	 * 
	 * @param clz 类对应在表中的记录
	 * @param id 主键，根据主键删除
	 */
	public void delete(Class clz, int id);
	/**
	 * 
	 * @param obj 将某个对象 删除
	 */
	public void delete(Object obj);
	/**
	 * 
	 * @param obj 需要更新的字段
	 * @param fields 需要更新的字段名字，数组。
	 * @return 修改了几行
	 */
	public int update(Object obj,String[] fields);
	/**
	 * 返回多行记录
	 * @param sql 查询语句
	 * @param clz 封装数据的JAVA BEAN
	 * @param params sql的参数 
	 * @return 返回所查询到的结果
	 */
	public List query(String sql,Class clz,Object[] params);
	public Object queryUniqeRow(String sql,Class clz,Object[] params);
	public Object queryValue(String sql,Object [] params);
	public Number queryNumber(String sql,Object[] params);
}
