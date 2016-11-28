package com.bjc.protoss.dp.module.adapter.ken.impl;

import com.bjc.protoss.dp.module.adapter.ken.Message;
import com.bjc.protoss.dp.module.adapter.ken.MessageSender;

public class RMIsender implements MessageSender
{

	@Override
	public void send(Message message)
	{
		System.out.println(message + " is sent via RMI interface");
	}

}
