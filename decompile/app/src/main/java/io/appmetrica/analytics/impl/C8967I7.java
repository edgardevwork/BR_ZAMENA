package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.I7 */
/* loaded from: classes8.dex */
public final class C8967I7 {

    /* renamed from: a */
    public final Map f6771a;

    /* renamed from: b */
    public final String f6772b;

    /* renamed from: c */
    public final String f6773c;

    public C8967I7(String str, HashMap map, String str2) {
        this.f6772b = str;
        this.f6771a = map;
        this.f6773c = str2;
    }

    public final String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.f6771a + ", mDeeplink='" + this.f6772b + "', mUnparsedReferrer='" + this.f6773c + "'}";
    }
}
