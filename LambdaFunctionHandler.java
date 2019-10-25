package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import redis.clients.jedis.Jedis;

public class LambdaFunctionHandler implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
    	context.getLogger().log("This is Elastic Client");
        Jedis jedis = new Jedis("myelasticrediscache.7zalm7.ng.0001.use1.cache.amazonaws.com", 6379);
        String valuefromRedis = jedis.get("test-me");
        context.getLogger().log("The value from Redis Cache is------------>"+valuefromRedis);
        return "Hello from Lambda!";
    }

}
