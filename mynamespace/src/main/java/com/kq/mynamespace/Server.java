package com.kq.mynamespace;

/**
 * Server
 * @author kq
 * @date 2019-01-11
 */
public class Server {

    private String id;
    private String ip;
    private String name;
    private int port;
    private String protocol;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Server{" +
                "id='" + id + '\'' +
                ", ip='" + ip + '\'' +
                ", name='" + name + '\'' +
                ", port=" + port +
                ", protocol='" + protocol + '\'' +
                '}';
    }
}
