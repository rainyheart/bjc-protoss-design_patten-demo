package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.adapter.ken.Message;
import com.bjc.protoss.dp.module.adapter.ken.Message.Type;
import com.bjc.protoss.dp.module.adapter.ken.MessageAdapter;
import com.bjc.protoss.dp.module.adapter.ken.MessageSender;

/**
 *
 * Definition:<br/>
 * Adapter pattern works as a bridge between two incompatible interfaces. This
 * type of design pattern comes under structural pattern as this pattern
 * combines the capability of two independent interfaces. This pattern involves
 * a single class which is responsible to join functionalities of independent or
 * incompatible interfaces. A real life example could be a case of card reader
 * which acts as an adapter between memory card and a laptop. You plugin the
 * memory card into card reader and card reader into the laptop so that memory
 * card can be read via laptop.
 *
 */
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
