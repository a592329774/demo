package com.sunshine.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor // 全参构造函数
@NoArgsConstructor // 无参构造函数
@Data // get set 方法
@Accessors(chain=true) // 链式调用
public class Department implements Serializable{
	private Long   id ; // 主键
	private String departmentName ; // 部门名
	private String databaseSource ; // 来自哪个数据库
}
