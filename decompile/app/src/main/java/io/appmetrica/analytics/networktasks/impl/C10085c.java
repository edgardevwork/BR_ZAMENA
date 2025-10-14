package io.appmetrica.analytics.networktasks.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.HttpHost;

/* renamed from: io.appmetrica.analytics.networktasks.impl.c */
/* loaded from: classes7.dex */
public final class C10085c {

    /* renamed from: a */
    public final String f9559a;

    public C10085c(String str) {
        this.f9559a = m7055a(str);
    }

    /* renamed from: a */
    public static String m7055a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Uri uri = Uri.parse(str);
        return Intrinsics.areEqual(HttpHost.DEFAULT_SCHEME_NAME, uri.getScheme()) ? uri.buildUpon().scheme("https").build().toString() : str;
    }
}
