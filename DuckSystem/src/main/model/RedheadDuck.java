package main.model;

public class RedheadDuck extends Duck{
	public RedheadDuck() {
	      quackBehavior = new Quack();
	      flyBehavior = new FlyWithRocket();
	   }

 public void display() {
	   System.out.println("我是一只RedheadDuck");
 }
}
