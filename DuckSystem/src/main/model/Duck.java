package main.model;

public abstract class Duck {
   QuackBehavior quackBehavior;
   FlyBehavior flyBehavior;
   
   public void swim() {
		// TODO Auto-generated method stub
		System.out.println("我会游泳");
	}
   public void display() {
		// TODO Auto-generated method stub
		System.out.println("我是一只鸭子");
		
	}
   public void performQuack() {
	      quackBehavior.quack();
	   }
   public void performFly() {
	      flyBehavior.fly();
	   }
   
   public void setQuackBehavior(
	         QuackBehavior behavior) {
	      this.quackBehavior = behavior;
	   }

   public void setFlyBehavior(
	         FlyBehavior behavior) {
	      this.flyBehavior = behavior;
	   }

   
   
   
   
   
   
   



   
   
   
   
   
   
}
