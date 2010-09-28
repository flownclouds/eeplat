package com.exedosoft.plat.agent;

import java.util.concurrent.TimeUnit;

/**
 * 
 * Á§?ñCïYÁÁ§CÚÁ§û@B
 * 
 * Á§?í?Il?HH ¥eo?íC?????B ?¥?ê??±?íCe?l?êºB
 * 
 * 
 * @author Administrator
 * 
 */
public interface MessageQueue {
	

	/**
	 * «Á§YÁ?ñC@ÊvLÂpó?C«ê¼ÒB
	 * 
	 * @param aMessage
	 *            Á§
	 */
	public abstract void putMessage(Message aMessage);

	/**
	 * ?õóÚ?ñIæê¢Á§C@Ê?ñs¶ÝC½Á§C?ê¼Ò
	 * 
	 * @return ?ñIæê¢Á§
	 */
	public abstract Message takeMessage();

	/**
	 * @ÊÂ\I?C«Á§ü?ñB
	 * 
	 * @param aMessage
	 *            Á§
	 * @return ¬÷Ôñ trueC´¼îv?Ôñ false
	 */
	public abstract boolean offerMessage(Message aMessage);

	/**
	 * «wèIÁ§ü?ñC@ÊvLÂpó?C«ÒwèIÒ??i@ÊLKvjB
	 * @param timeout
	 * @param unit
	 * @return
	 */	
	public abstract Message offerMessage(long timeout, TimeUnit unit);
	/**
	 * ¸?ñÚê¢Á§B
	 * 
	 * @param aMessage
	 *            ÒÚIÁ§
	 */
	public abstract void removeMessage(Message aMessage);

	/**
	 * »f?ñ¥Û?óB
	 * 
	 * @return ?óÔñtrue,Û?Ôñfalse.
	 */
	public abstract boolean isEmpty();

}
