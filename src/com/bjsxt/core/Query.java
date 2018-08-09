package com.bjsxt.core;
import java.util.*;
/**
 * 
 * @author XYan
 * ǧǧ������ʹ�ã�����Ҫ����ע�͡�
 * �����ѯ�������ṩ����Ľӿڡ�
 */
@SuppressWarnings(value = { "all" })
public interface Query {
	/**
	 * 
	 * @param sql ִ��DML�����
	 * @param params ����
	 * @return ������Ӱ�������
	 */
	public int executeDML(String[] sql,Object[] params);
	/*
	 * obj��Ҫ����DB�Ķ���
	 */
	public void insert(Object obj);
	/**
	 * 
	 * @param clz ���Ӧ�ڱ��еļ�¼
	 * @param id ��������������ɾ��
	 */
	public void delete(Class clz, int id);
	/**
	 * 
	 * @param obj ��ĳ������ ɾ��
	 */
	public void delete(Object obj);
	/**
	 * 
	 * @param obj ��Ҫ���µ��ֶ�
	 * @param fields ��Ҫ���µ��ֶ����֣����顣
	 * @return �޸��˼���
	 */
	public int update(Object obj,String[] fields);
	/**
	 * ���ض��м�¼
	 * @param sql ��ѯ���
	 * @param clz ��װ���ݵ�JAVA BEAN
	 * @param params sql�Ĳ��� 
	 * @return ��������ѯ���Ľ��
	 */
	public List query(String sql,Class clz,Object[] params);
	public Object queryUniqeRow(String sql,Class clz,Object[] params);
	public Object queryValue(String sql,Object [] params);
	public Number queryNumber(String sql,Object[] params);
}
