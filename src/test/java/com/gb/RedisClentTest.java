package com.gb;

import net.sf.json.JSONObject;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public class RedisClentTest {

    public static void showData(){

        Jedis jedis=new Jedis("192.168.3.195",6379);

        Set<String> keys=jedis.keys("*");

        for (String key:
             keys) {

            System.out.println("key:"+key);

            System.out.println("content:"+jedis.hgetAll(key));

        }

    }

    public static void main(String[] args) {

//        showData();

//        int i=2230000020;

        JSONObject jsonObject=new JSONObject();

        jsonObject.accumulate("aa","22300000203");

        System.out.println(jsonObject.getInt("aa"));

    }


}
