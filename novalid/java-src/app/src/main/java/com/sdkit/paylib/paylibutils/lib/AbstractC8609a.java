package com.sdkit.paylib.paylibutils.lib;

import java.util.concurrent.CancellationException;
import kotlin.Result;

/* renamed from: com.sdkit.paylib.paylibutils.lib.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8609a {
    /* renamed from: a */
    public static final Object m4713a(Object obj) throws Throwable {
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(obj);
        if (thM15702exceptionOrNullimpl == null || !(thM15702exceptionOrNullimpl instanceof CancellationException)) {
            return obj;
        }
        throw thM15702exceptionOrNullimpl;
    }
}
