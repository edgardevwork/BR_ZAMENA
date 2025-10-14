package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.v0 */
/* loaded from: classes7.dex */
public abstract class AbstractC9916v0 {
    /* renamed from: a */
    public static ResultReceiverC8817C6 m6870a(Handler handler, C9891u0 c9891u0) {
        return new ResultReceiverC8817C6(handler, c9891u0);
    }

    /* renamed from: a */
    public static C9213Se m6873a(Context context, ResultReceiverC8817C6 resultReceiverC8817C6) {
        return new C9213Se(context, resultReceiverC8817C6);
    }

    /* renamed from: a */
    public static C9145Ph m6872a(C9213Se c9213Se, Context context, ICommonExecutor iCommonExecutor) {
        C9616j0 c9616j0 = new C9616j0(context, iCommonExecutor, C9820r4.m6725i().m6731d());
        return new C9145Ph(c9616j0, new C9197Rm(new C9577hb()), new C9251U4(c9213Se), new C9760oj(context, c9616j0));
    }

    /* renamed from: a */
    public static C9219Sk m6874a(Context context, C9145Ph c9145Ph, C9730ne c9730ne, Handler handler) {
        return new C9219Sk(c9145Ph, new C9412al(context, c9730ne), handler);
    }

    /* renamed from: a */
    public static C8801Bf m6869a(C9145Ph c9145Ph, C9730ne c9730ne, Handler handler) {
        return new C8801Bf(c9145Ph, c9730ne, handler, c9730ne.m6551s());
    }

    /* renamed from: a */
    public static C8853Dh m6871a(Context context, C9213Se c9213Se, C9145Ph c9145Ph, Handler handler, C9219Sk c9219Sk) {
        return new C8853Dh(context, c9213Se, c9145Ph, handler, c9219Sk);
    }
}
