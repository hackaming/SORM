package com.bjsxt.bean;
/**
 * 表中一个字段的信息
 * @author XYan
 * 
 */
public class ColumnInfo {
	/**
	 * 字段名称
	 */
	private String name;
	/**
	 * 数据类型
	 */
	private String dataType;
	/**
	 * key类型 0-普通，1主键
	 */
	 private int keyType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public int getKeyType() {
		return keyType;
	}
	public void setKeyType(int keyType) {
		this.keyType = keyType;
	}
	public ColumnInfo() {
		super();
	}

}
