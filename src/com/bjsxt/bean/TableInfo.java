package com.bjsxt.bean;
import java.util.*;
/**
 * �洢��ṹ��Ϣ
 * @author XYan
 *
 */
public class TableInfo {
	/**
	 * ����
	 */
	private String name;
	/**
	 * �ֶ� ��Ϣ
	 */
	private Map<String,ColumnInfo> columns;
	/**
	 * Ŀǰֻ�ܴ����������ֻ��һ�����������
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
