package com.my.redis.service;

import org.springframework.context.annotation.Bean;

import java.util.List;


public interface IRedisService {

    /**普通 Redis 取值
      @param key 键
      @return 值
    */
    Object get(String key);

    /**
     * 普通 Redis 取值
     * @param db
     @param key 键
     * @return 值
     */
    Object get(int db, String key);


    /**
     * 放入 Redis并设置时间
     * @param key   键
     * @param value 值
     * @return true成功 false失败
     */
    boolean set(String key, Object value);

    /**
     * 放入 Redis并设置时间
     * @param key   键
     * @param value 值
     * @param time  时间(秒) time要大于0 如果time小于等于0 将设置无限期
     * @return true成功 false 失败
     */
    boolean set(String key, Object value, long time);

    /**
     * 放入 Redis并设置时间
     * @param db
     * @param key   键
     * @param value 值
     * @param time  时间(秒) time要大于0 如果time小于等于0 将设置无限期
     * @return true成功 false 失败
     */
    boolean set(int db, String key, Object value, long time);

    /**
     * 删除 redis key
     * @param keys
     * @return true成功 false 失败
     */
    boolean del( String... keys);

    /**
     * 删除 redis key
     * @param db
     * @param keys
     * @return true成功 false 失败
     */
    boolean del(int db,  String... keys);

    /**
     * get all keys list from redis
     * @param keyPreifx
     * @return
     */
    List<String> getAllKeys(String keyPreifx);

    /**
     * get all keys list from redis
     * @param db
     * @param keyPreifx
     * @return
     */
    List<String> getAllKeys(int db, String keyPreifx);

    List<String> getAllKeys(int db);

    List<String> getAllKeys();



    /**
     * 判断key是否存在
     * @param key
     * @return
     */
    public boolean hasKey(String key);

    /**
     * 遞增
     * @param key
     * @param delta
     * @return
     */
    public long incr(String key, long delta);

    /**
     * 遞減
     * @param key
     * @param delta
     * @return
     */
    public long decr(String key, long delta);
}
