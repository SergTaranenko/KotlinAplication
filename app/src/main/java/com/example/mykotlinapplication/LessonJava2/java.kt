package com.example.mykotlinapplication.LessonJava2

import java.util.ArrayList;
import java.util.List;


public class LessonJava2 extends Object {
    void main(){
        List<Object> strs = new ArrayList<Object>();

        List<? super String> objs = strs;
        objs.add("");

        //String s = strs.get(0);
        //s.toLowerCase();
    }

    boolean isNull(LessonJava2 str){
        /*if(str!=null){
            return false;
        }else{
            return true;
        }*/
        return str!=null;
    }
}