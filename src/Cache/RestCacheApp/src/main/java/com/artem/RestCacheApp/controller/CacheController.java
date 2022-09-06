package com.artem.RestCacheApp.controller;

import com.artem.RestCacheApp.service.impl.CacheServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class CacheController {
    private static final Logger LOGGER = LoggerFactory.getLogger("logger.info");
    private final CacheServiceImpl service;

    public CacheController(CacheServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/create")
    public void createCache(@RequestParam("name") String cache) {
        LOGGER.info("Endpoint /create  Cache name: " + cache);
        service.createCache(cache);
    }

    @GetMapping("/get")
    public void get(@RequestParam String cache, @RequestParam String key) {
        LOGGER.info("Endpoint /get  Cache name: " + cache + " " + key);
        service.get(cache, key);
    }

    @PostMapping("/put")
    public void put(@RequestParam String cache, @RequestParam String key, @RequestParam String str) {
        LOGGER.info("Endpoint /put  Cache name: " + cache + " " + key + " " + str);
        service.put(cache, key, str);
    }

    @DeleteMapping("/clear")
    public void clear() {
        LOGGER.info("Endpoint /clearAll");
        service.clear();
    }

    @DeleteMapping("/clear/{cache}")
    public void clear(@PathVariable("cache") String cache) {
        LOGGER.info("Endpoint /clear  Cache name: " + cache);
        service.clear(cache);
    }

    @GetMapping("/exist")
    public void isExist(@RequestParam("name") String cache) {
        LOGGER.info("Endpoint /exist  Cache name: " + cache);
        service.isCacheExist(cache);
    }
}
