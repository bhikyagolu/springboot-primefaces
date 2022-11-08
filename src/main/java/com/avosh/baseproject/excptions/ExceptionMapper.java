package com.avosh.baseproject.excptions;

import java.util.HashMap;
import java.util.Map;

public class ExceptionMapper {
    private static final Map<String, Integer> errorCodeMapping = new HashMap<String, Integer>();
    static {
        errorCodeMapping.put(BadRequestException.class.getName(), 1);

    }

    public static int getErrorCode(Exception ex){
        if(errorCodeMapping.containsKey(ex.getClass().getName())){
            return errorCodeMapping.get(ex.getClass().getName());
        }
        return 999;
    }
}
