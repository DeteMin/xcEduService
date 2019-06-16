package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 * @Auther: SuperJ
 * @Date: 2019/6/15 13:14
 * @Description:
 */
public class CustomException extends RuntimeException {

    // 错误代码
    ResultCode resultCode;

    public CustomException(ResultCode resultCode){ this.resultCode = resultCode; }

    public ResultCode getResultCode(){
        return resultCode;
    }

}
