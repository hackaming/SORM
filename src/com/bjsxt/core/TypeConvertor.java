package com.bjsxt.core;

/**
 * ����Java�����ݿ������໥ת��	
 * @author XYan
 *
 */
public interface TypeConvertor {
	/**
	 * ����������ת��java����
	 * @param columnType
	 * @return
	 */
	public String databaseTypeToJavaType(String columnType);
	public String javaTypeToDatabaseType(String javaType);
}
