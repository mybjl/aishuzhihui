package com.lph.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Author lph
 **/
public class HandlerException {
    public static String handlerExceptionResult(BlockException e) {
        return "deal-handlerExceptionResult";
    }
}
