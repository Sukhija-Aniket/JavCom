// Program parsed successfully
// Author: Aniket Sukhija
// Generated using JTB 1.3.2
package cs502;

import static cs502.memmgr.MemMgr.*;

public class Main {

    public static void main ( String [] args ) {
    
        Object x1;
        Object x2;
        Object obj;
        Object vtablePtr;
        String fnName;
        Object aaa;
        Object bbbbb;
        int a;
        int b;
        
        int tD8_avar1;
        int tD8_dvar;
        x1 = alloc(36);
        store(x1,4,0);
        store(x1,8,0);
        store(x1,12,0);
        store(x1,16,0);
        store(x1,20,0);
        store(x1,24,0);
        store(x1,28,0);
        store(x1,32,0);
        
        x2 = alloc(24);
        store(x2,0,"D8_ff");
        store(x2,4,"B8_bb");
        store(x2,8,"B8_fff");
        store(x2,12,"B8_bbb");
        store(x2,16,"C8_ccc");
        store(x2,20,"D8_f8");
        
        store(x1,0,x2);
        obj = x1;
        x1 = alloc(16);
        store(x1,4,0);
        store(x1,8,0);
        store(x1,12,0);
        
        x2 = alloc(8);
        store(x2,0,"A8_ff");
        store(x2,4,"A8_bb");
        
        store(x1,0,x2);
        aaa = x1;
        x1 = alloc(16);
        store(x1,4,0);
        store(x1,8,0);
        store(x1,12,0);
        
        x2 = alloc(8);
        store(x2,0,"A8_ff");
        store(x2,4,"A8_bb");
        
        store(x1,0,x2);
        bbbbb = x1;
        x1 = alloc(36);
        store(x1,4,0);
        store(x1,8,0);
        store(x1,12,0);
        store(x1,16,0);
        store(x1,20,0);
        store(x1,24,0);
        store(x1,28,0);
        store(x1,32,0);
        
        x2 = alloc(24);
        store(x2,0,"D8_ff");
        store(x2,4,"B8_bb");
        store(x2,8,"B8_fff");
        store(x2,12,"B8_bbb");
        store(x2,16,"C8_ccc");
        store(x2,20,"D8_f8");
        
        store(x1,0,x2);
        aaa = x1;
        aaa = bbbbb;
        tD8_avar1 = (Integer) load(obj,24);
        a = tD8_avar1;
        a = 1;
        store(obj,32,a);
        vtablePtr = load(obj,0);
        fnName = (String) load(vtablePtr,12);
        b = (Integer) callFunc(fnName,obj,aaa);
        tD8_dvar = (Integer) load(obj,32);
        b = tD8_dvar;
        System.out.println(a);

        System.out.println(b);

    }

    public static int A8_ff(Object mthis,int n,int m) {



        return 1;
    }

    public static int A8_bb(Object mthis) {


        return 0;
    }

    public static int B8_fff(Object mthis) {


        return 5;
    }

    public static int B8_bb(Object mthis) {


        return 2;
    }

    public static int B8_bbb(Object mthis,Object a) {



        return 5;
    }

    public static int C8_ccc(Object mthis) {


        return 6;
    }

    public static int D8_f8(Object mthis) {

        Object x1;
        Object x2;
        Object o1;
        Object vtablePtr;
        String fnName;
        Object o2;
        Object o3;
        Object o4;
        int i;
        boolean b;

        int tavar1;
        int tdvar;

        x1 = alloc(16);
        store(x1,4,0);
        store(x1,8,0);
        store(x1,12,0);
        
        x2 = alloc(8);
        store(x2,0,"A8_ff");
        store(x2,4,"A8_bb");
        
        store(x1,0,x2);
        o1 = x1;
        x1 = alloc(20);
        store(x1,4,0);
        store(x1,8,0);
        store(x1,12,0);
        store(x1,16,0);
        
        x2 = alloc(16);
        store(x2,0,"A8_ff");
        store(x2,4,"B8_bb");
        store(x2,8,"B8_fff");
        store(x2,12,"B8_bbb");
        
        store(x1,0,x2);
        o2 = x1;
        x1 = alloc(24);
        store(x1,4,0);
        store(x1,8,0);
        store(x1,12,0);
        store(x1,16,0);
        store(x1,20,0);
        
        x2 = alloc(20);
        store(x2,0,"A8_ff");
        store(x2,4,"B8_bb");
        store(x2,8,"B8_fff");
        store(x2,12,"B8_bbb");
        store(x2,16,"C8_ccc");
        
        store(x1,0,x2);
        o3 = x1;
        tavar1 = (Integer) load(mthis,24);
        tdvar = (Integer) load(mthis,32);
        tavar1 = tdvar+5;
        store(mthis,24,tavar1);
        b = true;
        if (b) 
        {
            b = false;
            System.out.println(5);

        }
        else
        {
            System.out.println(6);

        }
        i = 0;
        while (b) 
        i = i+1;
        return 0;
    }

    public static int D8_ff(Object mthis,int n,int m) {



        return 5;
    }

}
