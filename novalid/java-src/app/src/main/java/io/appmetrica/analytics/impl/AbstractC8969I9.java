package io.appmetrica.analytics.impl;

import org.apache.ivy.core.cache.ArtifactOrigin;

/* renamed from: io.appmetrica.analytics.impl.I9 */
/* loaded from: classes8.dex */
public abstract class AbstractC8969I9 {
    /* renamed from: a */
    public static final String m5265a(int i) {
        switch (i) {
            case 1:
                return "APPSFLYER";
            case 2:
                return "ADJUST";
            case 3:
                return "KOCHAVA";
            case 4:
                return "TENJIN";
            case 5:
                return "AIRBRIDGE";
            case 6:
                return "SINGULAR";
            default:
                return ArtifactOrigin.UNKNOWN;
        }
    }
}
