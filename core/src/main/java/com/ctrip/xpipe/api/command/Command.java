package com.ctrip.xpipe.api.command;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.ctrip.xpipe.command.CommandExecutionException;

/**
 * @author wenchao.meng
 *
 * Jun 30, 2016
 */
public interface Command<V> {
	
	CommandFuture<V> execute() ;
	
	CommandFuture<V>  execute(int time, TimeUnit timeUnit);
	
	String getName();
	
	/**
	 * 重置，可以重新执行
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	void reset() throws InterruptedException, ExecutionException;

}
