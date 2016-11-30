package com.bjc.protoss.dp.module.observer.ken.impl;

import com.bjc.protoss.dp.module.observer.ken.Topic;

public class News implements Topic<String> {

	private String newsContent;

	public News(String newsContent) {
		this.newsContent = newsContent;
	}

	@Override
	public String toString() {
		return newsContent;
	}

	@Override
	public String getInformation() {
		return this.newsContent;
	}
}
