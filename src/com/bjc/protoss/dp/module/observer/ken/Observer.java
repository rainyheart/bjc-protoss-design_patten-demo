package com.bjc.protoss.dp.module.observer.ken;

import com.bjc.protoss.dp.module.observer.ken.impl.News;

public interface Observer {
	public void cascade(News news);
}
