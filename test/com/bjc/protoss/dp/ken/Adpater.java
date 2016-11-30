package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.adapter.ken.Message;
import com.bjc.protoss.dp.module.adapter.ken.Message.Type;
import com.bjc.protoss.dp.module.adapter.ken.MessageAdapter;
import com.bjc.protoss.dp.module.adapter.ken.MessageSender;

public class Adpater {

	@Test
	public void execute() {
		MessageAdapter adapter = new MessageAdapter();

		Message sms = new Message(Type.SMS);
		sendMessage(adapter, sms);

		Message mms = new Message(Type.MMS);
		sendMessage(adapter, mms);

		Message email = new Message(Type.EMAIL);
		sendMessage(adapter, email);
	}

	private void sendMessage(MessageAdapter adapter, Message message) {
		MessageSender sender = adapter.adapt(message);
		sender.send(message);
	}
}
