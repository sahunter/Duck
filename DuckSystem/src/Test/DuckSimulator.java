package Test;

import main.model.Duck;
import main.model.MallardDuck;
import main.model.RedheadDuck;
import main.model.RubberDuck;
import main.model.Squeak;

public class DuckSimulator {
	public static void main(String[] args) {
		System.out.println("---------这是三只鸭子的自我介绍----------");
	      Duck mallard = new MallardDuck();
	      mallard.display();
	      mallard.swim();
	      mallard.performFly();
	      mallard.performQuack();
	      System.out.println("最近我学会了一种新叫法");
	      mallard.setQuackBehavior(new Squeak());
	      mallard.performQuack();
	      
	      
	      Duck redhead = new RedheadDuck();
	      redhead.display();
	      redhead.swim();
	      redhead.performFly();
	      redhead.performQuack();
	      
	      
	      Duck rubber = new RubberDuck();
	      rubber.display();
	      rubber.swim();
	      rubber.performFly();
	      rubber.performQuack();
	   }

	
}
