package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.H3 */
/* loaded from: classes7.dex */
public final class C8939H3 implements InterfaceC8891F5 {
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap mapM5970c = AbstractC9452cb.m5970c(asString);
        if (AbstractC9029Kl.m5336a(mapM5970c)) {
            return mapM5970c;
        }
        AbstractC9984xi.m6965a("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}
