package com.artem.RestCacheApp.service.impl;

import com.artem.RestCacheApp.service.CacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CacheServiceImpl implements CacheService {

    private static final Logger LOGGER_INFO = LoggerFactory.getLogger("logger.info");
    private static final Logger LOGGER_ERR = LoggerFactory.getLogger("logger.error");

    private static Map<String, Map<String, String>> mapCache;

    private static Map<String, String> tempCache = new HashMap<>();

    public CacheServiceImpl() {
        mapCache = new HashMap<>();
    }

    @Override
    public void createCache(String cache) {
        mapCache.put(cache, new HashMap<>());
    }

    @Override
    public boolean put(String cache, String key, String str) {
        if (cache == null || key == null || str == null) {
            LOGGER_ERR.error("One of arguments in method 'put' is null");
            throw new IllegalArgumentException("One of arguments in method 'put' is null");
        }
        tempCache = mapCache.get(cache);
        if (tempCache != null) {
            tempCache.put(key, str);
            return true;
        } else {
            LOGGER_ERR.error(String.format("Cache with name '%s' not found", cache));
            throw new NullPointerException(String.format("Cache with name '%s' not found%n", cache));
        }
    }

    @Override
    public String get(String cache, String key) {
        tempCache = mapCache.get(cache);
        LOGGER_INFO.info(String.format("Get value from inner Cache with name : '%s'", key));
        if (cache != null){
            return tempCache.get(key);
        }else {
            return null;
        }
    }

    @Override
    public void clear() {
        mapCache.values().forEach(Map::clear);
        LOGGER_INFO.info("Remove all");
    }

    @Override
    public void clear(String cache) {
        tempCache = mapCache.get(cache);
        if (cache != null) tempCache.clear();
        LOGGER_INFO.info(String.format("Remove Cache with name : %s", cache));
    }

    @Override
    public void isCacheExist(String cache) {
        if (mapCache.containsKey(cache)) {
            System.out.println("Cache exist");
        } else {
            System.out.println("Cache is not exist");
        }
    }
}
