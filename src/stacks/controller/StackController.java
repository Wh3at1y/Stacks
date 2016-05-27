package stacks.controller;

import java.util.Stack;
import stacks.model.Dishes;

public class StackController
	{
		Stack<Dishes> dishStack;
		
		public StackController()
		{
			 dishStack = new Stack<Dishes>();
			 dishStack.push(new Dishes());
			 dishStack.peek();
			 dishStack.push(new Dishes());
			 dishStack.push(new Dishes());
			 dishStack.pop();
			 dishStack.peek();
		}
	}
