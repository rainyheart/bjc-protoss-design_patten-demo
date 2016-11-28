package com.bjc.protoss.dp.module.adapter.ken;

public class Message
{
	public enum Type{
		SMS, MMS, EMAIL
	}
	
	private Type type = null;
	
	public Message(Type type)
	{
		this.type = type;
	}
	
	@Override
	public String toString()
	{
		return this.type.toString() + " message";
	}

	public Type getType()
	{
		return type;
	}
}
