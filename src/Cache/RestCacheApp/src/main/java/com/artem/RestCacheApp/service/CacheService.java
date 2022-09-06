package com.artem.RestCacheApp.service;

public interface CacheService {
    boolean put(String cache, String key, String str);
    String get(String cache, String key);
    void clear();
    void clear(String cache);
    void isCacheExist(String cache);
    void createCache(String cache);
}
