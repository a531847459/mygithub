package cn.mldn.myspring.di.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Message implements Serializable {
	public Message() {
		System.out.println("[Message类构造方法]"+this);
	}
	public void initMessage() {
		System.out.println("[Message类初始化]");
	}
	public void destoryMessage() {
		System.out.println("[Message类销毁]");
	}
}
