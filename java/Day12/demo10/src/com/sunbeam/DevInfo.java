package com.sunbeam;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.CONSTRUCTOR})
public @interface DevInfo {
	String value(); // default "author" attribute  
	String company( ) default "Sunbeam Infotech";  
	String designation( ) default "Software Dev";  
}
