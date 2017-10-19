package cn.mldn.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller //只有配置了此注解的才能受到Spring的管理
@RequestMapping("/pages/*") //映射路径
public class ShowAction {
	private Logger log=LoggerFactory.getLogger(ShowAction.class);
	@RequestMapping("showPre")//配置方法映射
	public ModelAndView showPre(String str) {
		this.log.info(str);
		ModelAndView mav=new ModelAndView("/pages/show.jsp");
		mav.addObject("showDetail", "welcome"+str);
		return mav;
	}
}
