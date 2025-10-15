package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Be */
/* loaded from: classes7.dex */
public final class C8800Be implements InterfaceC9709mi {

    /* renamed from: a */
    public final Context f6370a;

    /* renamed from: b */
    public final String f6371b = "content://" + m4997a() + "/preload_info";

    /* renamed from: c */
    public final String f6372c = "tracking_id";

    /* renamed from: d */
    public final String f6373d = "additional_parameters";

    public C8800Be(@NotNull Context context) {
        this.f6370a = context;
    }

    @NotNull
    /* renamed from: a */
    public final String m4997a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:8:0x002a, B:10:0x0030, B:19:0x0061, B:21:0x0067, B:24:0x006e, B:25:0x0076, B:18:0x005b, B:28:0x0092, B:29:0x009a, B:12:0x0046, B:15:0x004d, B:16:0x0054), top: B:37:0x0028, inners: #2 }] */
    @Override // kotlin.jvm.functions.Function0
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C8974Ie invoke() {
        Cursor cursorQuery;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (!PackageManagerUtils.hasContentProvider(this.f6370a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC9984xi.m6965a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.f6370a.getContentResolver().query(Uri.parse(this.f6371b), null, null, null, null);
            try {
                if (cursorQuery == null) {
                    AbstractC9984xi.m6965a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f6372c));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f6373d));
                        if (string2 == null) {
                            jSONObject = new JSONObject();
                            jSONObject2 = jSONObject;
                            if (!TextUtils.isEmpty(string)) {
                            }
                            AbstractC9984xi.m6965a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                            C8974Ie c8974Ie = new C8974Ie(string, jSONObject2, !TextUtils.isEmpty(string), false, EnumC9159Q7.f7147d);
                            AbstractC9664kn.m6340a(cursorQuery);
                            return c8974Ie;
                        }
                        try {
                        } catch (Throwable unused) {
                            jSONObject = new JSONObject();
                        }
                        if (string2.length() != 0) {
                            jSONObject2 = new JSONObject(string2);
                            if (!TextUtils.isEmpty(string)) {
                                AbstractC9984xi.m6965a("Tracking id from Satellite is not a number.", new Object[0]);
                            }
                            AbstractC9984xi.m6965a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                            C8974Ie c8974Ie2 = new C8974Ie(string, jSONObject2, !TextUtils.isEmpty(string), false, EnumC9159Q7.f7147d);
                            AbstractC9664kn.m6340a(cursorQuery);
                            return c8974Ie2;
                        }
                        jSONObject = new JSONObject();
                        jSONObject2 = jSONObject;
                        if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                            AbstractC9984xi.m6965a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC9984xi.m6965a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                        C8974Ie c8974Ie22 = new C8974Ie(string, jSONObject2, !TextUtils.isEmpty(string), false, EnumC9159Q7.f7147d);
                        AbstractC9664kn.m6340a(cursorQuery);
                        return c8974Ie22;
                    }
                    AbstractC9984xi.m6965a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursorQuery = null;
        }
        AbstractC9664kn.m6340a(cursorQuery);
        return null;
    }
}
