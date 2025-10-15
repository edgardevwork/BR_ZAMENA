package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.blackhub.bronline.game.core.preferences.Preferences;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.nb */
/* loaded from: classes6.dex */
public final class C9727nb implements InterfaceC8896Fa, Closeable {

    /* renamed from: a */
    public final HashMap f8722a = new HashMap();

    /* renamed from: b */
    public final HashMap f8723b = new HashMap();

    /* renamed from: c */
    public final String f8724c = Preferences.NAME;

    /* renamed from: d */
    public final C9702mb f8725d;

    /* renamed from: e */
    public volatile boolean f8726e;

    /* renamed from: f */
    public final InterfaceC10022z6 f8727f;

    public C9727nb(InterfaceC10022z6 interfaceC10022z6) {
        this.f8727f = interfaceC10022z6;
        C9702mb c9702mb = new C9702mb(this, String.format(Locale.US, "IAA-DW-%s", Integer.valueOf(ThreadFactoryC9479dd.m6025a())));
        this.f8725d = c9702mb;
        c9702mb.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6505a(C9727nb c9727nb) {
        SQLiteDatabase sQLiteDatabaseMo5554a;
        String str;
        c9727nb.getClass();
        Cursor cursor = null;
        try {
            sQLiteDatabaseMo5554a = c9727nb.f8727f.mo5554a();
            if (sQLiteDatabaseMo5554a != null) {
                try {
                    Cursor cursorQuery = sQLiteDatabaseMo5554a.query(c9727nb.f8724c, new String[]{"key", "value", "type"}, null, null, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        try {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("key"));
                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("value"));
                            int i = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("type"));
                            if (!TextUtils.isEmpty(string)) {
                                if (i != 1) {
                                    if (i == 2) {
                                        str = ParseUtils.parseInt(string2);
                                    } else if (i != 3) {
                                        str = string2;
                                        if (i != 4) {
                                            str = i != 5 ? null : ParseUtils.parseFloat(string2);
                                        }
                                    } else {
                                        str = ParseUtils.parseLong(string2);
                                    }
                                    if (str == null) {
                                        c9727nb.f8722a.put(string, str);
                                    }
                                } else {
                                    if ("true".equals(string2)) {
                                        str = Boolean.TRUE;
                                    } else if ("false".equals(string2)) {
                                        str = Boolean.FALSE;
                                    }
                                    if (str == null) {
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    cursor = cursorQuery;
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            sQLiteDatabaseMo5554a = null;
        }
        AbstractC9664kn.m6340a(cursor);
        c9727nb.f8727f.mo5555a(sQLiteDatabaseMo5554a);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    /* renamed from: b */
    public final void mo5137b() {
        synchronized (this.f8725d) {
            this.f8725d.notifyAll();
        }
    }

    /* renamed from: c */
    public final void m6509c() throws InterruptedException {
        if (this.f8726e) {
            return;
        }
        try {
            this.f8722a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8725d.isRunning()) {
            this.f8725d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    public final boolean getBoolean(String str, boolean z) {
        Object objM6508b = m6508b(str);
        return objM6508b instanceof Boolean ? ((Boolean) objM6508b).booleanValue() : z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    public final int getInt(String str, int i) {
        Object objM6508b = m6508b(str);
        return objM6508b instanceof Integer ? ((Integer) objM6508b).intValue() : i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    public final long getLong(String str, long j) {
        Object objM6508b = m6508b(str);
        return objM6508b instanceof Long ? ((Long) objM6508b).longValue() : j;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    public final String getString(String str, String str2) {
        Object objM6508b = m6508b(str);
        return objM6508b instanceof String ? (String) objM6508b : str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    public final InterfaceC8896Fa remove(String str) {
        synchronized (this.f8722a) {
            m6509c();
            this.f8722a.remove(str);
        }
        synchronized (this.f8725d) {
            this.f8723b.put(str, this);
            this.f8725d.notifyAll();
        }
        return this;
    }

    /* renamed from: b */
    public final Object m6508b(String str) {
        Object obj;
        synchronized (this.f8722a) {
            m6509c();
            obj = this.f8722a.get(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m6506a(C9727nb c9727nb, HashMap map) {
        SQLiteDatabase sQLiteDatabaseMo5554a;
        c9727nb.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c9727nb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i] = contentValues;
            i++;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseMo5554a = c9727nb.f8727f.mo5554a();
            if (sQLiteDatabaseMo5554a != null) {
                try {
                    sQLiteDatabaseMo5554a.beginTransaction();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContentValues contentValues2 = contentValuesArr[i2];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabaseMo5554a.delete(c9727nb.f8724c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabaseMo5554a.insertWithOnConflict(c9727nb.f8724c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseMo5554a.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseMo5554a;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabaseMo5554a = sQLiteDatabase;
                    c9727nb.f8727f.mo5555a(sQLiteDatabaseMo5554a);
                }
            }
            if (sQLiteDatabaseMo5554a != null) {
                try {
                    sQLiteDatabaseMo5554a.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c9727nb.f8727f.mo5555a(sQLiteDatabaseMo5554a);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    /* renamed from: a */
    public final synchronized InterfaceC8896Fa mo5133a(String str, String str2) {
        m6507a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    /* renamed from: a */
    public final InterfaceC8896Fa mo5132a(String str, long j) {
        m6507a(str, Long.valueOf(j));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    /* renamed from: a */
    public final synchronized InterfaceC8896Fa mo5130a(int i, String str) {
        m6507a(str, Integer.valueOf(i));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    /* renamed from: a */
    public final InterfaceC8896Fa mo5134a(String str, boolean z) {
        m6507a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    /* renamed from: a */
    public final InterfaceC8896Fa mo5131a(String str, float f) {
        m6507a(str, Float.valueOf(f));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    /* renamed from: a */
    public final boolean mo5136a(String str) {
        boolean zContainsKey;
        synchronized (this.f8722a) {
            m6509c();
            zContainsKey = this.f8722a.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8896Fa
    /* renamed from: a */
    public final Set mo5135a() {
        HashSet hashSet;
        synchronized (this.f8722a) {
            hashSet = new HashSet(this.f8722a.keySet());
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void m6507a(String str, Object obj) {
        synchronized (this.f8722a) {
            m6509c();
            this.f8722a.put(str, obj);
        }
        synchronized (this.f8725d) {
            this.f8723b.put(str, obj);
            this.f8725d.notifyAll();
        }
    }
}
