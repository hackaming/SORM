package com.bjsxt.bean;
/**
 * ����һ���ֶε���Ϣ
 * @author XYan
 * 
 */
public class ColumnInfo {
	/**
	 * �ֶ�����
	 */
	private String name;
	/**
	 * ��������
	 */
	private String dataType;
	/**
	 * key���� 0-��ͨ��1����
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