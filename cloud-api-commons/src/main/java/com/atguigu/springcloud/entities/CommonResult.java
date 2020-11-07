package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * 就是为了前后端分离方便
 * @param <T>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;
    //可能返回的数据为空 所以在定义一个构造函数
    public  CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
