package com.github.alonwang.design_pattern.adapter;

/**
 * Created by dvWang on 2017/5/11.
 */
public class Circle implements Shape{
    @Override
    public void Draw() {
        System.out.println("画出圆形");
    }
}
