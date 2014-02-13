package com.truth99.designpattern.TemplateMethod.solution.example1;

public abstract class HappyPeople {

	//庆祝新年
	public final void celeberateSpringFestival(){
		subscribeTicket();
		travel();
		celeberate();
	}
	
	//买票
	private void subscribeTicket(){
		System.out.println("Buying ticket...");
	}
	
	//乘坐交过工具回家
	protected abstract void travel();
	
	//回家庆祝
	private void celeberate(){
		System.out.println("Happy Chinese New Year !");
	}
}
