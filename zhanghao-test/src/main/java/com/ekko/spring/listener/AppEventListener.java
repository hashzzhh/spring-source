package com.ekko.spring.listener;


import com.ekko.spring.circle.A;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器；为什么一个注解就能监听来事件。。。。。
 * DataSource。TransationManager（切面） === DBService
 * @EnableTransationManager
 *
 *
 */
@Component
public class AppEventListener {

	public AppEventListener(){
		System.out.println("AppEventListener...");
	}

	@EventListener(MessageEvent.class)
	public void listenMessage(MessageEvent event){
		System.out.println("Message事件到达..."+event+"；已发送邮件....");
	}


	@EventListener(ChangeEvent.class)
	public void listenChange(ChangeEvent event){
		System.out.println("Change事件到达..."+event+"；已同步状态....");
	}

	@EventListener(PayloadApplicationEvent.class)
	public void listenPayload(PayloadApplicationEvent<A> event){
		System.out.println("Payload事件到达..."+event.getPayload()+"；已进行处理....");
	}

}
