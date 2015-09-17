package com.denis.lessions;

/**
 * special exception to avoid less then 2 args
 * Created by Denis on 17.09.2015.
 */
public class CalcException extends Exception{
    public CalcException() {
        super("\n" + "Error, minimum count of params is 2 \n");
    }
}
