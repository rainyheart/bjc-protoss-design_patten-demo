package com.bjc.protoss.dp.module.command.ken;

import com.bjc.protoss.dp.module.command.ken.impl.LockCellphone;
import com.bjc.protoss.dp.module.command.ken.impl.OpenAppOnCellphone;
import com.bjc.protoss.dp.module.command.ken.impl.UnlockCellphone;

public class Controller<T extends Target> {
	private Command<T> lock;
	private Command<T> unlock;
	private Command<T> openApp;

	public Controller(LockCellphone<T> lock, UnlockCellphone<T> unlock, OpenAppOnCellphone<T> openApp) {
		this.lock = lock;
		this.unlock = unlock;
		this.openApp = openApp;
	}

	public void bind(T target) {
		lock.bind(target);
		unlock.bind(target);
		openApp.bind(target);
	}

	public void lock() {
		lock.send();
	}

	public void unlock() {
		unlock.send();
	}

	public void openApp() {
		openApp.send();
	}
}
