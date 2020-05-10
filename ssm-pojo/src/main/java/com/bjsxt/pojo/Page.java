package com.bjsxt.pojo;

import java.io.Serializable;
import java.util.List;
//这里封装easyui返回的数据
public class Page<T> implements Serializable{
    //返回的是这种形式{}
	private List<T> rows;
	//返回的总条数
	private Long total;
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public Page(List<T> rows, Long total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	public Page() {
		super();
	}
	@Override
	public String toString() {
		return "Page [rows=" + rows + ", total=" + total + "]";
	}
	
}
