package cn.mldn.action.abs;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public abstract class AbstractAction {
	@InitBinder//此注解会在Spring绑定表单之前先注册此类注解方法
	public void initbind(WebDataBinder binder) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//格式化日期
		//在WEB数据绑定中注册一个自定义的规则绑定器,该操作主要对java.util.Date类进行处理,允许为空
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sdf, true));
	}
}
