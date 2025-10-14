package com.blackhub.bronline.game.core.extension;

import android.content.res.Resources;
import kotlin.Metadata;

/* compiled from: DisplayDensityExtensions.kt */
/* loaded from: classes2.dex */
public final class DisplayDensityExtensionsKt {
    public static final int getToDp(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int getToSp(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().scaledDensity);
    }
}

