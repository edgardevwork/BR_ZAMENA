package com.sdkit.paylib.paylibnative.p033ui.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.g */
/* loaded from: classes6.dex */
public abstract class AbstractC8372g {
    /* renamed from: a */
    public static final int m3474a(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.data : ContextCompat.getColor(context, i);
    }

    /* renamed from: a */
    public static final Drawable m3475a(Context context, Integer num) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (num == null) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        return ContextCompat.getDrawable(context, context.getTheme().resolveAttribute(num.intValue(), typedValue, true) ? typedValue.resourceId : num.intValue());
    }
}
