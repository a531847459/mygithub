package cn.mldn.myspring.context.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.myspring.context.dao.IDeptDAO;
import cn.mldn.myspring.context.vo.Dept;
@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO;
//	public void setDeptDAO(IDeptDAO deptDAO) {
//		this.deptDAO = deptDAO;
//	}
	@Override
	public boolean add(Dept dept) {
		System.out.println("*********业务层调用********");
		return this.deptDAO.doCreate(dept);
	}

}
