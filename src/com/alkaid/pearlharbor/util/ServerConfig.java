package com.alkaid.pearlharbor.util;

public class ServerConfig {

	public final static int MAX_TOKEN_ALLOCATE = 10000;
	public final static int MAX_PLAYER_ALLOCATE = 10000;
	
	public final static int SERVER_TICK_INTERVAL_MILLISECONDS = 10; // 每秒钟100tick
	
	// server id
	public final static int SERVER_ID = 101;
	
	//net config
	public final static int MAX_SOCKET_BUFFER_SIZE = 4096;
	public final static String NET_TCP_IP = "10.12.25.205";
	public final static int NET_TCP_PORT = 10086;
	// db config
	public final static String DB_SERVER_IP = "127.0.0.1";
	public final static int DB_SERVER_PORT = 6379;
}
