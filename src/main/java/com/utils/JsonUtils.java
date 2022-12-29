package com.utils;

import com.constants.FrameworkConstants;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class JsonUtils {
    private JsonUtils() {
    }

    private static Map<String,String>CONFIGMAP;

    static {
        try {

            CONFIGMAP = new ObjectMapper().readValue(new File(FrameworkConstants.getJsonFilePath()), HashMap.class);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getValue(String key) {
        if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))) {
            throw new RuntimeException("Property Name " + key + " is not found");
        }
        return  CONFIGMAP.get(key);
    }


}

