package com.lh.demo.hash;

import java.lang.instrument.Instrumentation;

/**
 * Created by LH 2446059046@qq.com on 2017/9/11.
 */
public class MyAgen {
    public static void premain(String agentArgs,Instrumentation inst){


        inst.addTransformer(new HashCodeTransformer());

    }

}
