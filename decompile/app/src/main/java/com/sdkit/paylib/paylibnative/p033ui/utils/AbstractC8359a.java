package com.sdkit.paylib.paylibnative.p033ui.utils;

import android.content.res.TypedArray;
import androidx.core.content.res.TypedArrayKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8359a {
    /* renamed from: a */
    public static final Integer m3428a(TypedArray typedArray, int i) {
        Object objM15699constructorimpl;
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(Integer.valueOf(TypedArrayKt.getColorOrThrow(typedArray, i)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m15702exceptionOrNullimpl(objM15699constructorimpl) != null) {
            objM15699constructorimpl = null;
        }
        return (Integer) objM15699constructorimpl;
    }

    /* renamed from: b */
    public static final Integer m3429b(TypedArray typedArray, int i) {
        Object objM15699constructorimpl;
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(Integer.valueOf(TypedArrayKt.getResourceIdOrThrow(typedArray, i)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m15702exceptionOrNullimpl(objM15699constructorimpl) != null) {
            objM15699constructorimpl = null;
        }
        return (Integer) objM15699constructorimpl;
    }
}
