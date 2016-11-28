package com.bjc.protoss.dp.module.observer.ken;

public class News
{
	private String newsContent;
	
	public News(String newsContent)
	{
		this.newsContent = newsContent;
	}
	
	@Override
	public String toString()
	{
		return newsContent;
	}
}
