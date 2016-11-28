package com.bjc.protoss.dp.module.observer.ken;

public class WhiteHouse extends AbstractSubject implements Subject
{

	@Override
	public void notifyObservers(News message)
	{
		for (Observer observer : super.observers)
		{
			observer.cascade(message);
		}

	}

}
