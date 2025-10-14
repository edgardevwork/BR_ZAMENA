package org.apache.http.impl.bootstrap;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.ExceptionLogger;
import org.apache.http.HttpConnectionFactory;
import org.apache.http.HttpServerConnection;
import org.apache.http.config.SocketConfig;
import org.apache.http.protocol.HttpService;

/* loaded from: classes6.dex */
public class RequestListener implements Runnable {
    public final HttpConnectionFactory<? extends HttpServerConnection> connectionFactory;
    public final ExceptionLogger exceptionLogger;
    public final ExecutorService executorService;
    public final HttpService httpService;
    public final ServerSocket serversocket;
    public final SocketConfig socketConfig;
    public final AtomicBoolean terminated = new AtomicBoolean(false);

    public RequestListener(SocketConfig socketConfig, ServerSocket serverSocket, HttpService httpService, HttpConnectionFactory<? extends HttpServerConnection> httpConnectionFactory, ExceptionLogger exceptionLogger, ExecutorService executorService) {
        this.socketConfig = socketConfig;
        this.serversocket = serverSocket;
        this.connectionFactory = httpConnectionFactory;
        this.httpService = httpService;
        this.exceptionLogger = exceptionLogger;
        this.executorService = executorService;
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        while (!isTerminated() && !Thread.interrupted()) {
            try {
                Socket socketAccept = this.serversocket.accept();
                socketAccept.setSoTimeout(this.socketConfig.getSoTimeout());
                socketAccept.setKeepAlive(this.socketConfig.isSoKeepAlive());
                socketAccept.setTcpNoDelay(this.socketConfig.isTcpNoDelay());
                if (this.socketConfig.getRcvBufSize() > 0) {
                    socketAccept.setReceiveBufferSize(this.socketConfig.getRcvBufSize());
                }
                if (this.socketConfig.getSndBufSize() > 0) {
                    socketAccept.setSendBufferSize(this.socketConfig.getSndBufSize());
                }
                if (this.socketConfig.getSoLinger() >= 0) {
                    socketAccept.setSoLinger(true, this.socketConfig.getSoLinger());
                }
                this.executorService.execute(new Worker(this.httpService, (HttpServerConnection) this.connectionFactory.createConnection(socketAccept), this.exceptionLogger));
            } catch (Exception e) {
                this.exceptionLogger.log(e);
                return;
            }
        }
    }

    public boolean isTerminated() {
        return this.terminated.get();
    }

    public void terminate() throws IOException {
        if (this.terminated.compareAndSet(false, true)) {
            this.serversocket.close();
        }
    }
}
