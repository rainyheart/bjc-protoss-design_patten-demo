package com.bjc.protoss.dp.module.command.ken.impl;

import com.bjc.protoss.dp.module.command.ken.Command;
import com.bjc.protoss.dp.module.command.ken.Target;

public class IPhone implements Target {
	private App app;

	public void lock() {

		System.out.println("Your iPhone has been locked and sleeping now");
	}

	public void unlock() {
		System.out.println("Your iPhone has been activate and unlocked now");
	}

	public void openApp(App targetApp) {
		if (targetApp.equals(this.app)) {
			System.out.println(targetApp + " has been opened in your iPhone");
		} else {
			System.out.println("Unknow App: " + targetApp + " or it's not installed in this iphone");
		}
	}

	public void install(App targetApp) {
		this.app = targetApp;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void receive(Command<? extends Target> command) {
		if (command instanceof LockCellphone) {
			lock();
		} else if (command instanceof UnlockCellphone) {
			unlock();
		} else if (command instanceof OpenAppOnCellphone) {
			OpenAppOnCellphone cmd = (OpenAppOnCellphone) command;
			openApp(cmd.getApp());
		}
	}
}
