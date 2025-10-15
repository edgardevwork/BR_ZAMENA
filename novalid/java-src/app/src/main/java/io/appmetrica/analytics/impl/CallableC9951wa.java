package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.wa */
/* loaded from: classes8.dex */
public final class CallableC9951wa implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C9976xa f9254a;

    public CallableC9951wa(C9976xa c9976xa) {
        this.f9254a = c9976xa;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f9254a.f9303a.getContentResolver();
        C9976xa c9976xa = this.f9254a;
        c9976xa.f9304b = contentResolver.query(uri, null, null, new String[]{c9976xa.f9303a.getPackageName()}, null);
        Cursor cursor = this.f9254a.f9304b;
        if (cursor != null && cursor.moveToFirst()) {
            String string = this.f9254a.f9304b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C8901Ff(string, this.f9254a.f9304b.getLong(1), this.f9254a.f9304b.getLong(2), EnumC8876Ef.f6550d);
            }
        }
        return null;
    }
}
