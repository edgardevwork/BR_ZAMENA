package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.p048io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Aj */
/* loaded from: classes7.dex */
public final class C8780Aj implements InterfaceC9903uc {

    /* renamed from: a */
    public final C9939vn f6345a;

    /* renamed from: b */
    public final String f6346b = "startup_state";

    /* renamed from: c */
    public final AESEncrypter f6347c;

    public C8780Aj(@NotNull C9939vn c9939vn) {
        this.f6345a = c9939vn;
        C9390a c9390a = new C9390a(C9676la.m6362h().m6369e());
        this.f6347c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c9390a.m5822b(), c9390a.m5821a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9903uc
    /* renamed from: a */
    public final void mo4971a(@NotNull Context context) {
        SQLiteDatabase readableDatabase = C9398a7.m5836a(context).m5847h().getReadableDatabase();
        if (readableDatabase != null) {
            try {
                C9927vb c9927vbM4970a = m4970a(readableDatabase);
                C9712ml c9712ml = new C9712ml(new C8765A4(new C9995y4()));
                if (c9927vbM4970a != null) {
                    m4969a(this.f6345a, c9712ml, c9927vbM4970a);
                    c9712ml.f8678p = c9927vbM4970a.f9224c;
                    c9712ml.f8680r = c9927vbM4970a.f9223b;
                }
                C9737nl c9737nl = new C9737nl(c9712ml);
                AbstractC9292Vl abstractC9292VlM5684a = C9268Ul.m5684a(C9737nl.class);
                abstractC9292VlM5684a.mo5468a(context, abstractC9292VlM5684a.mo5470d(context)).save(c9737nl);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m4969a(C9939vn c9939vn, C9712ml c9712ml, C9927vb c9927vb) {
        String strOptStringOrNull;
        synchronized (c9939vn) {
            strOptStringOrNull = JsonUtils.optStringOrNull(c9939vn.f9242a.m6979a(), "device_id");
        }
        if (TextUtils.isEmpty(strOptStringOrNull)) {
            if (!TextUtils.isEmpty(c9927vb.f9225d)) {
                c9939vn.m6909a(c9927vb.f9225d);
            }
            if (!TextUtils.isEmpty(c9927vb.f9226e)) {
                c9939vn.m6911b(c9927vb.f9226e);
            }
            if (TextUtils.isEmpty(c9927vb.f9222a)) {
                return;
            }
            c9712ml.f8663a = c9927vb.f9222a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:5:0x001b, B:7:0x0022, B:9:0x0028, B:13:0x0047), top: B:21:0x001b }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C9927vb m4970a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery;
        try {
            cursorQuery = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.f6346b}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() == 1 && cursorQuery.moveToFirst()) {
                        C9927vb c9927vb = (C9927vb) MessageNano.mergeFrom(new C9927vb(), this.f6347c.decrypt(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("value"))));
                        CloseableUtilsKt.closeSafely(cursorQuery);
                        return c9927vb;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.getCount();
                    }
                } catch (Throwable unused) {
                }
            } else if (cursorQuery != null) {
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        CloseableUtilsKt.closeSafely(cursorQuery);
        return null;
    }
}
