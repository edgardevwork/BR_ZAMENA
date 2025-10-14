package com.sdkit.paylib.paylibnative.p033ui.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.CharsKt__CharJVMKt;
import org.apache.commons.lang3.ObjectUtils;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.b */
/* loaded from: classes5.dex */
public final class C8360b {

    /* renamed from: a */
    public static final C8360b f3658a = new C8360b();

    /* renamed from: a */
    public static final String m3430a(Object obj) {
        if (obj == null) {
            return "<null>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName());
        sb.append(ObjectUtils.AT_SIGN);
        String string = Integer.toString(obj.hashCode(), CharsKt__CharJVMKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        return sb.toString();
    }
}
