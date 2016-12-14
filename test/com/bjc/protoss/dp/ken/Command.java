package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.command.ken.Controller;
import com.bjc.protoss.dp.module.command.ken.impl.App;
import com.bjc.protoss.dp.module.command.ken.impl.IPhone;
import com.bjc.protoss.dp.module.command.ken.impl.LockCellphone;
import com.bjc.protoss.dp.module.command.ken.impl.OpenAppOnCellphone;
import com.bjc.protoss.dp.module.command.ken.impl.UnlockCellphone;

/**
 *
 * Definition:<br/>
 * Command pattern is a data driven design pattern and falls under behavioral
 * pattern category. A request is wrapped under an object as command and passed
 * to invoker object. Switch object looks for the appropriate object which can
 * handle this command and passes the command to the corresponding object which
 * executes it.
 *
 */
public class Command {

	@Test
	public void execute() {
		LockCellphone<IPhone> lock = new LockCellphone<IPhone>();
		UnlockCellphone<IPhone> unlock = new UnlockCellphone<IPhone>();
		App wechat = new App("Wechat");
		IPhone iphone = new IPhone();
		iphone.install(wechat);

		OpenAppOnCellphone<IPhone> openWechat = new OpenAppOnCellphone<IPhone>(wechat);

		Controller<IPhone> correctController = new Controller<IPhone>(lock, unlock, openWechat);
		correctController.bind(iphone);

		correctController.unlock();
		correctController.openApp();
		correctController.lock();

		System.out.println("---------------------------------------");

		App alipay = new App("alipay");
		OpenAppOnCellphone<IPhone> openAlipay = new OpenAppOnCellphone<IPhone>(alipay);
		Controller<IPhone> wrongController = new Controller<IPhone>(lock, unlock, openAlipay);
		wrongController.bind(iphone);

		wrongController.unlock();
		wrongController.openApp();
		wrongController.lock();
	}
}
