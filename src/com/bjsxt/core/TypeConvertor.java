package com.bjsxt.core;

/**
 * 负责Java和数据库类型相互转化	
 * @author XYan
 *
 */
public interface TypeConvertor {
	/**
	 * 将数据类型转成java类型
	 * @param columnType
	 * @return
	 */
	public String databaseTypeToJavaType(String columnType);
	public String javaTypeToDatabaseType(String javaType);
}
