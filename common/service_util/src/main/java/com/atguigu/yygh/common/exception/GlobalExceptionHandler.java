package com.atguigu.yygh.common.exception;

import com.atguigu.yygh.common.result.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 全局异常处理类
     */
    @ExceptionHandler(Exception.class)
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.fail();
    }

    /**
     * 自定义异常处理方法
     *
     * @param e
     * @return
     */
    @ExceptionHandler(YyghException.class)
    public Result error(YyghException e) {
        return Result.build(e.getCode(), e.getMessage());
    }
}
