package com.baldochi.padroes.singleton;

public class DatabaseConfig {

    private String host = "10.0.0.33";

    private Integer port = 5432;

    private String user = "admin";

    private String password = "fatec";

    private Integer poolMin = 2;

    private Integer poolMax = 5;

    private static DatabaseConfig instance;

    private DatabaseConfig() {
    }

    public synchronized static DatabaseConfig getInstance() {
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    public static void setInstance(DatabaseConfig instance) {
        DatabaseConfig.instance = instance;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPoolMin() {
        return poolMin;
    }

    public void setPoolMin(Integer poolMin) {
        this.poolMin = poolMin;
    }

    public Integer getPoolMax() {
        return poolMax;
    }

    public void setPoolMax(Integer poolMax) {
        this.poolMax = poolMax;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
