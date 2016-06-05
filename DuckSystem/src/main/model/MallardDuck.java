package main.model;

public class MallardDuck extends Duck {
	   public MallardDuck() {
		      quackBehavior = new MuteQuack();
		      flyBehavior = new FlyWithWings();
		   }
	 
	   public void display() {
		   System.out.println("我是一只MallardDuck");
	   }
	 
}
