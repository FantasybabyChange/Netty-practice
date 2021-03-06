package com.fantasybaby.n3.l3.pool;

import java.nio.channels.SocketChannel;
/**
 * worker接口
 * @author
 *
 */
public interface Worker {
	
	/**
	 * 加入一个新的客户端会话
	 * @param channel
	 */
	public void registerNewChannelTask(SocketChannel channel);

}
