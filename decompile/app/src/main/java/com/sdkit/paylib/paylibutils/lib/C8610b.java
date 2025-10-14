package com.sdkit.paylib.paylibutils.lib;

import io.ktor.util.date.GMTDateParser;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibutils.lib.b */
/* loaded from: classes5.dex */
public final class C8610b {

    /* renamed from: a */
    public static final C8610b f5886a = new C8610b();

    /* renamed from: a */
    public final String m4714a() {
        return new String(new char[]{GMTDateParser.SECONDS, 'b', 'e', 'r'});
    }

    /* renamed from: b */
    public final String m4715b() {
        String upperCase = m4714a().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }
}
