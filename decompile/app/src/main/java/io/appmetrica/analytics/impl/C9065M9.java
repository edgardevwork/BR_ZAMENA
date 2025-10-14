package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.M9 */
/* loaded from: classes6.dex */
public final class C9065M9 extends AbstractC9113O9 {
    @Override // io.appmetrica.analytics.impl.AbstractC9113O9
    @TargetApi(24)
    /* renamed from: b */
    public final C9137P9 mo5403b(@NonNull FeatureInfo featureInfo) {
        return new C9137P9(featureInfo.name, featureInfo.version, (featureInfo.flags & 1) != 0);
    }
}
