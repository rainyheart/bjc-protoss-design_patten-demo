package com.bjc.protoss.dp.module.adapter.ken.main;

import com.bjc.protoss.dp.module.adapter.ken.Message;
import com.bjc.protoss.dp.module.adapter.ken.Message.Type;
import com.bjc.protoss.dp.module.adapter.ken.MessageAdapter;
import com.bjc.protoss.dp.module.adapter.ken.MessageSender;

public class Main {
	public static void main(String[] args) {
		MessageAdapter adapter = new MessageAdapter();

		Message sms = new Message(Type.SMS);
		sendMessage(adapter, sms);

		Message mms = new Message(Type.MMS);
		sendMessage(adapter, mms);

		Message email = new Message(Type.EMAIL);
		sendMessage(adapter, email);
	}

	private static void sendMessage(MessageAdapter adapter, Message message) {
		MessageSender sender = adapter.adapt(message);
		sender.send(message);
	}
}
