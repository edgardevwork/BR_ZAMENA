package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.li */
/* loaded from: classes6.dex */
public final class C9684li implements InterfaceC9709mi {

    /* renamed from: a */
    public final Context f8594a;

    /* renamed from: b */
    public final String f8595b = "content://" + m6400a() + "/clids";

    /* renamed from: c */
    public final String f8596c = "clid_key";

    /* renamed from: d */
    public final String f8597d = "clid_value";

    public C9684li(@NotNull Context context) {
        this.f8594a = context;
    }

    @NotNull
    /* renamed from: a */
    public final String m6400a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8987J3 invoke() {
        Cursor cursorQuery;
        String string;
        String string2;
        if (!PackageManagerUtils.hasContentProvider(this.f8594a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC9984xi.m6965a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.f8594a.getContentResolver().query(Uri.parse(this.f8595b), null, null, null, null);
            try {
            } catch (Throwable th) {
                th = th;
                try {
                    ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Error while getting satellite clids", new Object[0]) + StringUtils.f9903LF + io.appmetrica.analytics.coreutils.internal.StringUtils.throwableToString(th), new Object[0]);
                    return null;
                } finally {
                    AbstractC9664kn.m6340a(cursorQuery);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
        if (cursorQuery == null) {
            AbstractC9984xi.m6965a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursorQuery.moveToNext()) {
            try {
                string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f8596c));
                string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f8597d));
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                AbstractC9984xi.m6965a("Invalid clid {%s : %s}", string, string2);
            } else {
                linkedHashMap.put(string, string2);
            }
        }
        AbstractC9984xi.m6965a("Clids from satellite: %s", linkedHashMap);
        return new C8987J3(linkedHashMap, EnumC9159Q7.f7147d);
    }
}
