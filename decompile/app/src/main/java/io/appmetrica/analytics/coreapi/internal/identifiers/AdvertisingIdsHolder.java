package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a */
    private final AdTrackingInfoResult f6099a;

    /* renamed from: b */
    private final AdTrackingInfoResult f6100b;

    /* renamed from: c */
    private final AdTrackingInfoResult f6101c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    @NonNull
    public AdTrackingInfoResult getGoogle() {
        return this.f6099a;
    }

    @NonNull
    public AdTrackingInfoResult getHuawei() {
        return this.f6100b;
    }

    @NonNull
    public AdTrackingInfoResult getYandex() {
        return this.f6101c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f6099a + ", mHuawei=" + this.f6100b + ", yandex=" + this.f6101c + '}';
    }

    public AdvertisingIdsHolder(@NonNull AdTrackingInfoResult adTrackingInfoResult, @NonNull AdTrackingInfoResult adTrackingInfoResult2, @NonNull AdTrackingInfoResult adTrackingInfoResult3) {
        this.f6099a = adTrackingInfoResult;
        this.f6100b = adTrackingInfoResult2;
        this.f6101c = adTrackingInfoResult3;
    }
}
