/** 
 * <pre>项目名称:ssm-05 
 * 文件名称:PageUtil.java 
 * 包名:com.jk.chenjh.util 
 * 创建日期:2018年7月9日上午10:15:28 
 * Copyright (c) 2018, chenjh123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.utils;

import java.io.Serializable;

/**
 * <pre>项目名称：ssm-05    
 * 类名称：PageUtil    
 * 类描述：    
 * 创建人：陈教授 chenjh123@gmail.com    
 * 创建时间：2018年7月9日 上午10:15:28    
 * 修改人：陈教授 chenjh123@gmail.com     
 * 修改时间：2018年7月9日 上午10:15:28    
 * 修改备注：       
 * @version </pre>    
 */
public class PageUtil implements Serializable {

	private static final long serialVersionUID = 5865445468417035538L;

	//当前页
	private int page = 1;

	//每页条数
	private int limit = 3;

	//每页条数
	private int rows = 3;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
}
