package cn.mldn.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import cn.mldn.action.abs.AbstractAction;
import cn.mldn.vo.Dept;
import cn.mldn.vo.Emp;
@Controller //只有配置了此注解的才能受到Spring的管理
@RequestMapping("/pages/*") //映射路径
public class ShowAction extends AbstractAction{
	private Logger log=LoggerFactory.getLogger(ShowAction.class);
//	@RequestMapping("showPre")//配置方法映射
	@RequestMapping(path="showPre",method=RequestMethod.POST)//配置只允许post模式访问
	//设置参数是否必须传递和未传递时的设置的默认值
	public ModelAndView showPre(@RequestParam(name="str",required=false,defaultValue="zzzz") String str,String[] tags) {
		this.log.info(str);
		ModelAndView mav=new ModelAndView("/pages/show.jsp");
		mav.addObject("showDetail", "welcome"+str);
		mav.addObject("showTags",Arrays.toString(tags));
		return mav;
	}
	
	@RequestMapping("echo") //可以不返回ModelAndView,直接返回跳转路径(服务端跳转)
	public String echo() {
		return "/pages/show.jsp";
	}
	
	@RequestMapping("showVo")
	public ModelAndView showVo(Emp vo,Dept dept) {//因为该vo类中包含了Date类型的属性,需要进行@InitBinder注解绑定注册操作,来实现日期格式的转换
		ModelAndView mav=new ModelAndView("/pages/showVo.jsp");
		vo.setDept(dept);
		mav.addObject("Emp", vo);
		return mav;
	}
	
	@RequestMapping("add")
	@ResponseBody//此注解表示将返回数据转为jackson
	public Object add(Emp emp) {
		return emp;
	}
	@RequestMapping("list")
	@ResponseBody
	public Object list() {
		List<Emp> all=new ArrayList<>();
		for(int x=0;x<10;x++) {
			Emp vo=new Emp();
			vo.setEname("simth-"+x);
			vo.setAge(18+x);
			vo.setBirthday(new Date((new Date()).getTime()+86400000*x));
			vo.setSal(1800.2+10*x);
			all.add(vo);
		}
		System.out.println(all);
		return all;
	}
}
