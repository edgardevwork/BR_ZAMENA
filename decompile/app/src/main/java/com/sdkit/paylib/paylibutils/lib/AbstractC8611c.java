package com.sdkit.paylib.paylibutils.lib;

import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: com.sdkit.paylib.paylibutils.lib.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8611c {
    /* renamed from: a */
    public static final String m4716a(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        String strValueOf = String.valueOf(Reflection.getOrCreateKotlinClass(th.getClass()).getQualifiedName());
        String message = th.getMessage();
        String str = null;
        String strConcat = message != null ? ": ".concat(message) : null;
        Throwable cause = th.getCause();
        if (cause != null) {
            str = " by " + m4716a(cause);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{strValueOf, strConcat, str}), "", null, null, 0, null, null, 62, null);
    }
}
