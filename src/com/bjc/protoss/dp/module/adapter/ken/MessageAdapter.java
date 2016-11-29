package com.bjc.protoss.dp.module.adapter.ken;

import com.bjc.protoss.dp.module.adapter.ken.impl.HttpClientSender;
import com.bjc.protoss.dp.module.adapter.ken.impl.MQsender;
import com.bjc.protoss.dp.module.adapter.ken.impl.RMIsender;

public class MessageAdapter {
	public MessageSender adapt(Message message) {
		MessageSender sender = null;
		switch (message.getType()) {
		case SMS:
			sender = new HttpClientSender();
			break;
		case MMS:
			sender = new MQsender();
			break;
		case EMAIL:
			sender = new RMIsender();
			break;
		default:
			sender = new HttpClientSender();
			break;
		}

		return sender;
	}
}
