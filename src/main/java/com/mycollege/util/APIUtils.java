package com.mycollege.util;

import com.mycollege.general.APIResponse;

public class APIUtils {

    private APIUtils(){}

    public static APIResponse createAPIResponse(int code,String message,Object data){
        return new APIResponse(code,message,data);
    }

    public static APIResponse createAPIResponse(int code,String message){
        return new APIResponse(code,message,null);
    }
}
