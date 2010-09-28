package com.exedosoft.plat.queue;

import java.util.concurrent.TimeUnit;

import com.exedosoft.plat.bo.BOInstance;



public interface IBOInstanceQueue {

	/**
	 * «Á§YÁ?ñC@ÊvLÂpó?C«ê¼ÒB
	 * 
	 * @param aMessage
	 *            Á§
	 */
	public abstract void putMessage(BOInstance aMessage);

	/**
	 * ?õóÚ?ñIæê¢Á§C@Ê?ñs¶ÝC½Á§C?ê¼Ò
	 * 
	 * @return ?ñIæê¢Á§
	 */
	public abstract BOInstance takeMessage();

	/**
	 * @ÊÂ\I?C«Á§ü?ñB
	 * 
	 * @param aMessage
	 *            Á§
	 * @return ¬÷Ôñ trueC´¼îv?Ôñ false
	 */
	public abstract boolean offerMessage(BOInstance aMessage);

	/**
	 * «wèIÁ§ü?ñC@ÊvLÂpó?C«ÒwèIÒ??i@ÊLKvjB
	 * 
	 * @param timeout
	 * @param unit
	 * @return
	 */
	public abstract BOInstance offerMessage(long timeout, TimeUnit unit);

	/**
	 * ¸?ñÚê¢Á§B
	 * 
	 * @param aMessage
	 *            ÒÚIÁ§
	 */
	public abstract void removeMessage(BOInstance aMessage);

	/**
	 * »f?ñ¥Û?óB
	 * 
	 * @return ?óÔñtrue,Û?Ôñfalse.
	 */
	public abstract boolean isEmpty();

}
