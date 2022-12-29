package com.listeners;

import com.utils.ExcelUtils;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method method){
        annotation.setDataProvider("data");
        annotation.setDataProviderClass(ExcelUtils.class);


    }
}
