package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.N9 */
/* loaded from: classes6.dex */
public final class C9089N9 extends AbstractC9113O9 {
    @Override // io.appmetrica.analytics.impl.AbstractC9113O9
    /* renamed from: b */
    public final C9137P9 mo5403b(@NonNull FeatureInfo featureInfo) {
        return new C9137P9(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
