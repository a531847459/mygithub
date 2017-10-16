package cn.mldn.myspring.context.dao;

import org.springframework.stereotype.Repository;

import cn.mldn.myspring.context.vo.Dept;
@Repository
public class DeptDAOImpl implements IDeptDAO {

	@Override
	public boolean doCreate(Dept dept) {
		System.out.println("[数据层-deptDAOImpl]新增部门:"+dept);
		return false;
	}

}
