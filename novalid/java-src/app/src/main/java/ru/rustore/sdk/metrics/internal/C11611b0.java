package ru.rustore.sdk.metrics.internal;

import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.metrics.internal.b0 */
/* loaded from: classes8.dex */
public final class C11611b0 {

    /* renamed from: c */
    public static final Object f10666c = new Object();

    /* renamed from: a */
    public final C11606Y f10667a;

    /* renamed from: b */
    public final C11613c0 f10668b;

    public C11611b0(C11606Y sharedPreferenceProvider, C11613c0 uuidFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferenceProvider, "sharedPreferenceProvider");
        Intrinsics.checkNotNullParameter(uuidFactory, "uuidFactory");
        this.f10667a = sharedPreferenceProvider;
        this.f10668b = uuidFactory;
    }

    /* renamed from: a */
    public final String m7496a() {
        this.f10668b.getClass();
        String value = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(value, "randomUUID().toString()");
        SharedPreferences sharedPreferences = this.f10667a.f10661a;
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("USER_ID_KEY", value);
        editorEdit.apply();
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }
}
