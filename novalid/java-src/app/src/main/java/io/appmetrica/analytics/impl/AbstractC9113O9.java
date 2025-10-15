package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.O9 */
/* loaded from: classes5.dex */
public abstract class AbstractC9113O9 {
    /* renamed from: a */
    public final C9137P9 m5455a(@NonNull FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return mo5403b(featureInfo);
        }
        int i = featureInfo.reqGlEsVersion;
        if (i == 0) {
            return mo5403b(featureInfo);
        }
        return new C9137P9("openGlFeature", i, (featureInfo.flags & 1) != 0);
    }

    /* renamed from: b */
    public abstract C9137P9 mo5403b(FeatureInfo featureInfo);
}
