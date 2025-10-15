package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ye */
/* loaded from: classes6.dex */
public final class C10005ye implements InterfaceC8891F5 {
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: a */
    public final C8974Ie invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("tracking_id");
        if (TextUtils.isEmpty(asString)) {
            AbstractC9984xi.m6965a("Tracking id is empty", new Object[0]);
            return null;
        }
        if (ParseUtils.parseLong(asString) == null) {
            AbstractC9984xi.m6965a("Tracking id from preload info content provider is not a number", new Object[0]);
            return null;
        }
        try {
            String asString2 = contentValues.getAsString("additional_params");
            if (TextUtils.isEmpty(asString2)) {
                AbstractC9984xi.m6965a("No additional params", new Object[0]);
                return null;
            }
            JSONObject jSONObject = new JSONObject(asString2);
            if (jSONObject.length() == 0) {
                AbstractC9984xi.m6965a("Additional params are empty", new Object[0]);
                return null;
            }
            AbstractC9984xi.m6965a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
            return new C8974Ie(asString, jSONObject, true, false, EnumC9159Q7.f7148e);
        } catch (Throwable th) {
            ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Could not parse additional parameters", new Object[0]) + StringUtils.f9903LF + io.appmetrica.analytics.coreutils.internal.StringUtils.throwableToString(th), new Object[0]);
            return null;
        }
    }
}
