package com.utils;

import com.constants.FrameworkConstants;
import com.enums.ConfigProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final  class PropertyUtils {
    private PropertyUtils(){}
    private static Map<String,String>CONFIGMAP=new HashMap<>();

    static {
        try {
            FileInputStream fis = new FileInputStream(FrameworkConstants.getPropertyFilePath());
            Properties pro = new Properties();
            pro.load(fis);

            for (Map.Entry<Object, Object> entry : pro.entrySet()) {
                CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        public static String getValue(ConfigProperties key){
        if(Objects.isNull(key) ||Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))){
            throw new RuntimeException("Property name "+key+" is not found");
        }
        return CONFIGMAP.get(key.name().toLowerCase());
    }


}
