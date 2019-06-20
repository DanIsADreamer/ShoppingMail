package com.danisadreamer.ShoppingCarDemo.been;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther 芮狼Dan
 * @date 2019-06-20 09:28
 */
public class ResponseUtil {

    /**
     *成功的返回值
     * @param data
     * @return
     */
    public static Object ok(Object data) {
        Map<String,Object> map = new HashMap<>();
        map.put("status",200);
        map.put("msg","ok");
        map.put("data",data);
        return map;
    }

    /**
     * 失败的返回值
     * @param msg
     * @return
     */
    public static Object error(Object msg) {
        Map<String,Object> map = new HashMap<>();
        map.put("status",500);
        map.put("msg",msg);
        return map;
    }
}
