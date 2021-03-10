package com.liqi.mapstruct.annotation;

import org.mapstruct.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Sky
 * create  2021-03-10 16:46
 * email sky.li@ixiaoshuidi.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface PoundToKilogramMapper {
}
