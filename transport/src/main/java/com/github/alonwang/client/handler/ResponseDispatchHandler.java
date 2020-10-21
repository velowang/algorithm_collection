package com.github.alonwang.client.handler;

import com.github.alonwang.core.protocol.Response;
import com.github.alonwang.logic.hello.message.HelloResponse;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author alonwang
 * @date 2020/7/30 15:29
 * @detail
 */
@ChannelHandler.Sharable
public class ResponseDispatchHandler extends SimpleChannelInboundHandler<Response> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Response msg) throws Exception {
        //先简单输出
        System.out.println("服务器回应:" + ((HelloResponse) msg).getMessage().getMsg());
    }
}
