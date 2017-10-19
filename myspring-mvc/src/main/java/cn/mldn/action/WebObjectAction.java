package cn.mldn.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;

import cn.mldn.action.abs.AbstractAction;
@Controller
@RequestMapping("/pages/*")
public class WebObjectAction extends AbstractAction {
	@RequestMapping("showObject")
	@ResponseBody
	public Object showObject(HttpServletRequest request,HttpServletResponse response) {//获取内置对象的一种实现方式
		List<String> all=new ArrayList<>();
		all.add(request.getContextPath());
		all.add(request.getServletContext().getRealPath("/"));
		all.add(response.getCharacterEncoding());
		return all;
	}
	@RequestMapping("showObject1")
	@ResponseBody
	public Object showObject1() {//获取内置对象的另一种实现方式
			HttpServletRequest request=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
			HttpServletResponse response=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
			List<String> all=new ArrayList<>();
			all.add(request.getContextPath());
			all.add(request.getServletContext().getRealPath("/"));
			all.add(response.getCharacterEncoding());
			return all;
	}
}
