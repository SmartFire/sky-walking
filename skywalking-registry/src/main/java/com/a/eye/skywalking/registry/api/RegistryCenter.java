package com.a.eye.skywalking.registry.api;

/**
 * 主要用于注册中心的维护
 */
public interface RegistryCenter {

    /**
     * 主要用于storage启动注册使用，将自身IP和端口注册到注册中心
     * 格式为:
     * /storage_list/192.168.0.1:3400 NULL
     *
     * @param path
     */
    void register(String path);

    /**
     * 主要用于routing节点在启动完成之后，读取和监听stroage节点列表
     * 格式
     *
     * @param path
     * @param listener
     */
    void subscribe(String path, NotifyListener listener);

}
