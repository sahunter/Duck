package Test;

import main.model.Duck;
import main.model.MallardDuck;
import main.model.RedheadDuck;
import main.model.RubberDuck;
import main.model.Squeak;

public class DuckSimulator {
	public static void main(String[] args) {
		System.out.println("---------������ֻѼ�ӵ����ҽ���----------");
	      Duck mallard = new MallardDuck();
	      mallard.display();
	      mallard.swim();
	      mallard.performFly();
	      mallard.performQuack();
	      System.out.println("�����ѧ����һ���½з�");
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
