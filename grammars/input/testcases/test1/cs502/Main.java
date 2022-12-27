// Program parsed successfully
// Author: Aniket Sukhija
// Generated using JTB 1.3.2
package cs502;

import static cs502.memmgr.MemMgr.*;

public class Main {

    public static void main ( String [] args ) {
    
        Object x1;
        Object x2;
        Object a;
        Object vtablePtr;
        String fnName;
        int r;
        
        x1 = alloc(12);
        store(x1,4,0);
        store(x1,8,0);
        
        x2 = alloc(16);
        store(x2,0,"A_m1");
        store(x2,4,"A_m2");
        store(x2,8,"A_m3");
        store(x2,12,"A_m4");
        
        store(x1,0,x2);
        a = x1;
        vtablePtr = load(a,0);
        fnName = (String) load(vtablePtr,0);
        r = (Integer) callFunc(fnName,a,10);
        System.out.println(r);

        vtablePtr = load(a,0);
        fnName = (String) load(vtablePtr,8);
        r = (Integer) callFunc(fnName,a);
        System.out.println(r);

    }

    public static int A_m1(Object mthis,int x) {

        int t1;
        int t2;

        int ty;

        ty = (Integer) load(mthis,8);
        t1 = x+ty;
        t2 = t1+x;
        System.out.println(x);

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

}
