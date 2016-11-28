package com.bjc.protoss.dp.module.command.ken.main;

import com.bjc.protoss.dp.module.command.ken.Controller;
import com.bjc.protoss.dp.module.command.ken.impl.App;
import com.bjc.protoss.dp.module.command.ken.impl.IPhone;
import com.bjc.protoss.dp.module.command.ken.impl.LockCellphone;
import com.bjc.protoss.dp.module.command.ken.impl.OpenAppOnCellphone;
import com.bjc.protoss.dp.module.command.ken.impl.UnlockCellphone;

public class Main
{
	public static void main(String[] args)
	{
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
