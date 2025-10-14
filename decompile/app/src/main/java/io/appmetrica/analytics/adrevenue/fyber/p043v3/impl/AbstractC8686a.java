package io.appmetrica.analytics.adrevenue.fyber.p043v3.impl;

import com.fyber.fairbid.ads.PlacementType;

/* renamed from: io.appmetrica.analytics.adrevenue.fyber.v3.impl.a */
/* loaded from: classes8.dex */
public abstract /* synthetic */ class AbstractC8686a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6016a;

    static {
        int[] iArr = new int[PlacementType.values().length];
        f6016a = iArr;
        try {
            iArr[PlacementType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6016a[PlacementType.REWARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6016a[PlacementType.INTERSTITIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
