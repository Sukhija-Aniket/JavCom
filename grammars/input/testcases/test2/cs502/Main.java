// Program parsed successfully
// Author: Aniket Sukhija
// Generated using JTB 1.3.2
package cs502;

import static cs502.memmgr.MemMgr.*;

public class Main {

    public static void main ( String [] args ) {
    
        Object x1;
        Object x2;
        Object b;
        Object vtablePtr;
        String fnName;
        int r;
        
        x1 = alloc(20);
        store(x1,4,0);
        store(x1,8,0);
        store(x1,12,0);
        store(x1,16,0);
        
        x2 = alloc(20);
        store(x2,0,"B_m1");
        store(x2,4,"A_m2");
        store(x2,8,"A_m3");
        store(x2,12,"A_m4");
        store(x2,16,"B_set");
        
        store(x1,0,x2);
        b = x1;
        vtablePtr = load(b,0);
        fnName = (String) load(vtablePtr,16);
        r = (Integer) callFunc(fnName,b,20,30);
        vtablePtr = load(b,0);
        fnName = (String) load(vtablePtr,0);
        r = (Integer) callFunc(fnName,b,10);
        System.out.println(r);

    }

    public static int A_m1(Object mthis,int z) {

        int t1;
        int t2;

        int tx;
        int ty;

        tx = (Integer) load(mthis,4);
        ty = (Integer) load(mthis,8);
        t1 = tx+ty;
        t2 = t1+z;
        return t2;
    }

    public static int A_m2(Object mthis) {


        int tx;
        tx = (Integer) load(mthis,4);
        return tx;
    }

    public static int A_m3(Object mthis) {


        System.out.println(3);

        return 3;
    }

    public static int A_m4(Object mthis) {


        System.out.println(4);

        return 4;
    }

    public static int B_m1(Object mthis,int p) {

        int t1;
        int t2;
        int t3;
        int t4;
        int t5;
        Object x1;
        Object x2;
        Object t6;
        Object vtablePtr;
        String fnName;

        int tx;
        int tB_x;

        vtablePtr = load(mthis,0);
        fnName = (String) load(vtablePtr,4);
        t1 = (Integer) callFunc(fnName,mthis);
        tx = (Integer) load(mthis,12);
        t2 = tx*2;
        tB_x = (Integer) load(mthis,12);
        t2 = tB_x;
        t3 = t1+t2;
        t4 = t3-p;
        t5 = t1+t4;
        return t5;
    }

    public static int B_set(Object mthis,int a,int b) {


        int tx;
        int tz;

        tx = (Integer) load(mthis,12);
        tx = a;
        store(mthis,12,tx);
        tz = (Integer) load(mthis,16);
        tz = b;
        store(mthis,16,tz);
        return 5;
    }

}
