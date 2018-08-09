package com.bjsxt.bean;
import java.util.*;
/**
 * 存储表结构信息
 * @author XYan
 *
 */
public class TableInfo {
	/**
	 * 表名
	 */
	private String name;
	/**
	 * 字段 信息
	 */
	private Map<String,ColumnInfo> columns;
	/**
	 * 目前只能处理表中有且只有一个主键的情况
	 */
	private ColumnInfo onlyPriKey;
	public TableInfo() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, ColumnInfo> getColumns() {
		return columns;
	}
	public void setColumns(Map<String, ColumnInfo> columns) {
		this.columns = columns;
	}
	public ColumnInfo getOnlyPriKey() {
		return onlyPriKey;
	}
	public void setOnlyPriKey(ColumnInfo onlyPriKey) {
		this.onlyPriKey = onlyPriKey;
	}
}
