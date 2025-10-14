package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.p047db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.p048io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Pg */
/* loaded from: classes6.dex */
public final class C9144Pg implements UnderlyingNetworkTask {

    /* renamed from: a */
    public final C9571h5 f7094a;

    /* renamed from: b */
    public final LinkedHashMap f7095b;

    /* renamed from: c */
    public C9723n7 f7096c;

    /* renamed from: d */
    public C9600i9 f7097d;

    /* renamed from: e */
    public final C9062M6 f7098e;

    /* renamed from: f */
    public List f7099f;

    /* renamed from: g */
    public int f7100g;

    /* renamed from: h */
    public int f7101h;

    /* renamed from: i */
    public int f7102i;

    /* renamed from: j */
    public C9120Og f7103j;

    /* renamed from: k */
    public final C9819r3 f7104k;

    /* renamed from: l */
    public final PublicLogger f7105l;

    /* renamed from: m */
    public final C9964wn f7106m;

    /* renamed from: n */
    public final InterfaceC9138Pa f7107n;

    /* renamed from: o */
    public final C9907ug f7108o;

    /* renamed from: p */
    public final FullUrlFormer f7109p;

    /* renamed from: q */
    public final C9877tb f7110q;

    /* renamed from: r */
    public final RequestDataHolder f7111r;

    /* renamed from: s */
    public final ResponseDataHolder f7112s;

    /* renamed from: t */
    public final SendingDataTaskHelper f7113t;

    /* renamed from: u */
    public int f7114u;

    public C9144Pg(@NonNull C9571h5 c9571h5, @NonNull C9907ug c9907ug, @NonNull C9877tb c9877tb, @NonNull FullUrlFormer<C8902Fg> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(c9571h5, c9907ug, c9877tb, fullUrlFormer, requestDataHolder, responseDataHolder, c9571h5.m6211h(), c9571h5.m6218o(), c9571h5.m6224u(), requestBodyEncrypter);
    }

    /* renamed from: a */
    public final C9600i9 m5488a(C9120Og c9120Og, List list, C8902Fg c8902Fg) {
        C9600i9 c9600i9 = new C9600i9();
        C9400a9 c9400a9 = new C9400a9();
        c9400a9.f7706a = WrapUtils.getOrDefaultIfEmpty(this.f7096c.f8704b, c8902Fg.getUuid());
        c9400a9.f7707b = WrapUtils.getOrDefaultIfEmpty(this.f7096c.f8703a, c8902Fg.getDeviceId());
        this.f7100g = CodedOutputByteBufferNano.computeMessageSize(4, c9400a9) + this.f7100g;
        c9600i9.f8356b = c9400a9;
        C9738nm c9738nmM6389z = C9676la.f8552C.m6389z();
        C9072Mg c9072Mg = new C9072Mg(this, c9600i9);
        synchronized (c9738nmM6389z) {
            c9738nmM6389z.f8791a.mo5628a(c9072Mg);
        }
        List list2 = c9120Og.f7066a;
        c9600i9.f8355a = (C9525f9[]) list2.toArray(new C9525f9[list2.size()]);
        c9600i9.f8357c = m5483a(c9120Og.f7068c);
        c9600i9.f8359e = (String[]) list.toArray(new String[list.size()]);
        this.f7100g = CodedOutputByteBufferNano.computeTagSize(8) + this.f7100g;
        return c9600i9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f7094a.f8229b.f7669b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f7109p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f7111r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f7112s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C8902Fg) this.f7094a.f8239l.m6880a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((C8881Ek) C9676la.f8552C.m6387x()).getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateTask() {
        Cursor cursorRawQuery;
        int iOptInt;
        C9062M6 c9062m6 = this.f7094a.f8233f;
        c9062m6.getClass();
        ArrayList arrayList = new ArrayList();
        c9062m6.f6974a.lock();
        try {
            SQLiteDatabase readableDatabase = c9062m6.f6976c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(AbstractC8791B5.f6364b, null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    } catch (Throwable unused) {
                        try {
                            arrayList = new ArrayList();
                            if (!arrayList.isEmpty()) {
                            }
                        } finally {
                            AbstractC9664kn.m6340a(cursorRawQuery);
                            c9062m6.f6974a.unlock();
                        }
                    }
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursorRawQuery = null;
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        ContentValues contentValues2 = (ContentValues) arrayList.get(0);
        this.f7095b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f7095b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C9723n7 c9723n7 = new C9723n7();
            this.f7096c = c9723n7;
            this.f7108o.f9187c = c9723n7;
        } else {
            try {
                C9723n7 c9723n72 = new C9723n7(new C9427bb(asString));
                this.f7096c = c9723n72;
                this.f7108o.f9187c = c9723n72;
            } catch (Throwable unused3) {
                C9723n7 c9723n73 = new C9723n7();
                this.f7096c = c9723n73;
                this.f7108o.f9187c = c9723n73;
            }
        }
        C8902Fg config = this.f7110q.getConfig();
        List list = config.f6619x;
        if (AbstractC9664kn.m6344a((Collection) list)) {
            return false;
        }
        this.f7109p.setHosts(config.f6613r);
        if (!config.m5183u() || AbstractC9664kn.m6344a((Collection) this.f7109p.getAllHosts())) {
            return false;
        }
        this.f7099f = null;
        C9120Og c9120OgM5487a = m5487a(config);
        this.f7103j = c9120OgM5487a;
        if (c9120OgM5487a.f7066a.isEmpty()) {
            return false;
        }
        C9964wn c9964wn = this.f7106m;
        synchronized (c9964wn) {
            iOptInt = c9964wn.f9286a.m6979a().optInt("report_request_id", -1);
        }
        int i = iOptInt + 1;
        this.f7114u = i;
        this.f7108o.f9188d = i;
        C9600i9 c9600i9M5488a = m5488a(this.f7103j, list, config);
        this.f7097d = c9600i9M5488a;
        this.f7099f = this.f7103j.f7067b;
        this.f7113t.prepareAndSetPostData(MessageNano.toByteArray(c9600i9M5488a));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f7113t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        String strM6184a;
        if (z) {
            m5489a(false);
        } else if (this.f7112s.getResponseCode() == 400) {
            m5489a(true);
        }
        if (z) {
            for (int i = 0; i < this.f7103j.f7066a.size(); i++) {
                for (C9475d9 c9475d9 : ((C9525f9) this.f7103j.f7066a.get(i)).f8102c) {
                    if (c9475d9 != null && (strM6184a = AbstractC9556gf.m6184a(c9475d9)) != null) {
                        this.f7105l.info(strM6184a, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f7113t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(@Nullable Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f7094a.f8244q.m6633b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        this.f7094a.f8244q.f8892c.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        SQLiteDatabase writableDatabase;
        C9062M6 c9062m6 = this.f7094a.f8233f;
        c9062m6.getClass();
        try {
            c9062m6.f6975b.lock();
            if (c9062m6.f6982i.get() > ((C8902Fg) c9062m6.f6981h.f8239l.m6880a()).f6618w && (writableDatabase = c9062m6.f6976c.getWritableDatabase()) != null) {
                int iM5389a = c9062m6.m5389a(writableDatabase);
                c9062m6.f6982i.addAndGet(-iM5389a);
                if (iM5389a != 0) {
                    Iterator it = c9062m6.f6983j.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC9136P8) it.next()).mo5099a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        c9062m6.f6975b.unlock();
        this.f7094a.f8244q.f8892c.set(true);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        this.f7094a.f8244q.f8892c.set(true);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public C9144Pg(C9571h5 c9571h5, C9907ug c9907ug, C9877tb c9877tb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, C9062M6 c9062m6, PublicLogger publicLogger, C9964wn c9964wn, RequestBodyEncrypter requestBodyEncrypter) {
        this(c9571h5, publicLogger, c9062m6, c9907ug, c9964wn, c9877tb, new C9819r3(1024000, "event value in ReportTask", publicLogger), AbstractC9742o1.m6565a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C9144Pg(C9571h5 c9571h5, PublicLogger publicLogger, C9062M6 c9062m6, C9907ug c9907ug, C9964wn c9964wn, C9877tb c9877tb, C9819r3 c9819r3, C9610ij c9610ij, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f7095b = new LinkedHashMap();
        this.f7100g = 0;
        this.f7101h = 0;
        this.f7102i = -1;
        this.f7113t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f7108o = c9907ug;
        this.f7094a = c9571h5;
        this.f7098e = c9062m6;
        this.f7105l = publicLogger;
        this.f7104k = c9819r3;
        this.f7106m = c9964wn;
        this.f7110q = c9877tb;
        this.f7107n = c9610ij;
        this.f7111r = requestDataHolder;
        this.f7112s = responseDataHolder;
        this.f7109p = fullUrlFormer;
    }

    /* renamed from: a */
    public static C9327X8[] m5483a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C9327X8[] c9327x8Arr = new C9327X8[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                C9327X8 c9327x8 = new C9327X8();
                c9327x8.f7477a = next;
                c9327x8.f7478b = jSONObject.getString(next);
                c9327x8Arr[i] = c9327x8;
            } catch (Throwable unused) {
            }
            i++;
        }
        return c9327x8Arr;
    }

    /* renamed from: a */
    public final void m5489a(boolean z) {
        C9964wn c9964wn = this.f7106m;
        int i = this.f7114u;
        synchronized (c9964wn) {
            C9989xn c9989xn = c9964wn.f9286a;
            c9989xn.m6980a(c9989xn.m6979a().put("report_request_id", i));
        }
        C9525f9[] c9525f9Arr = this.f7097d.f8355a;
        for (int i2 = 0; i2 < c9525f9Arr.length; i2++) {
            try {
                C9525f9 c9525f9 = c9525f9Arr[i2];
                long jLongValue = ((Long) this.f7099f.get(i2)).longValue();
                EnumC9436bk enumC9436bk = (EnumC9436bk) AbstractC9531ff.f8127b.get(c9525f9.f8101b.f8002c);
                if (enumC9436bk == null) {
                    enumC9436bk = EnumC9436bk.FOREGROUND;
                }
                this.f7098e.m5393a(jLongValue, enumC9436bk.f7798a, c9525f9.f8102c.length, z);
                AbstractC9531ff.m6127a(c9525f9);
            } catch (Throwable unused) {
            }
        }
        C9062M6 c9062m6 = this.f7098e;
        long jM5753a = this.f7094a.f8238k.m5753a();
        c9062m6.f6975b.lock();
        try {
            if (AbstractC8841D5.f6458a.booleanValue()) {
                c9062m6.m5399c();
            }
            SQLiteDatabase writableDatabase = c9062m6.f6976c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", AbstractC8791B5.f6365c, new String[]{String.valueOf(jM5753a)});
            }
        } catch (Throwable unused2) {
        }
        c9062m6.f6975b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea A[LOOP:1: B:44:0x00e4->B:46:0x00ea, LOOP_END] */
    @NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C9120Og m5487a(@NonNull C8902Fg c8902Fg) {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        byte b = 0;
        byte b2 = 0;
        try {
            Cursor cursorM5484a = m5484a();
            if (cursorM5484a != null) {
                JSONObject jSONObject2 = jSONObject;
                C9466d0 c9466d0 = null;
                while (cursorM5484a.moveToNext() && this.f7101h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursorM5484a, contentValues);
                        C9898u7 model = new C9923v7(b2 == true ? 1 : 0, 1, b == true ? 1 : 0).toModel(contentValues);
                        Long l = model.f9166a;
                        if (l != null) {
                            C9873t7 c9873t7 = model.f9169d;
                            C9575h9 c9575h9M6126a = AbstractC9531ff.m6126a(c9873t7.f9087a, c9873t7.f9088b, c9873t7.f9089c);
                            String locale = c8902Fg.getLocale();
                            EnumC9436bk enumC9436bk = model.f9167b;
                            C9500e9 c9500e9 = new C9500e9();
                            c9500e9.f8000a = c9575h9M6126a;
                            c9500e9.f8001b = locale;
                            if (enumC9436bk != null) {
                                Integer num = (Integer) AbstractC9531ff.f8126a.get(enumC9436bk);
                                c9500e9.f8002c = num != null ? num.intValue() : 0;
                            }
                            int iComputeUInt64Size = this.f7100g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f7100g = iComputeUInt64Size;
                            int iComputeMessageSize = iComputeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c9500e9);
                            this.f7100g = iComputeMessageSize;
                            if (iComputeMessageSize >= 250880) {
                                break;
                            }
                            C9096Ng c9096NgM5486a = m5486a(l.longValue(), c9500e9, c8902Fg, arrayList3, arrayList.size());
                            if (c9096NgM5486a == null) {
                                continue;
                            } else {
                                if (c9466d0 == null) {
                                    c9466d0 = c9096NgM5486a.f7033b;
                                } else if (!c9466d0.equals(c9096NgM5486a.f7033b)) {
                                    break;
                                }
                                arrayList2.add(l);
                                arrayList.add(c9096NgM5486a.f7032a);
                                if (!TextUtils.isEmpty(c9096NgM5486a.f7033b.f7885a)) {
                                    try {
                                        jSONObject2 = new JSONObject(c9096NgM5486a.f7033b.f7885a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (c9096NgM5486a.f7034c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorM5484a;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            return new C9120Og(arrayList, arrayList2, jSONObject);
                        } finally {
                            AbstractC9664kn.m6340a(cursor);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            AbstractC9664kn.m6340a(cursorM5484a);
        } catch (Throwable th2) {
            th = th2;
        }
        it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f7107n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new C9120Og(arrayList, arrayList2, jSONObject);
    }

    /* renamed from: a */
    public static C9466d0 m5482a(ContentValues contentValues) {
        C9548g7 model = new C9573h7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        return new C9466d0((String) WrapUtils.getOrDefault(model.f8177g.f8071g, ""), ((Long) WrapUtils.getOrDefault(model.f8177g.f8072h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x009c, TryCatch #4 {all -> 0x009c, blocks: (B:7:0x0025, B:8:0x002b, B:10:0x0032, B:12:0x0038, B:28:0x006c, B:30:0x0072, B:39:0x0094, B:46:0x00a9, B:48:0x00b8, B:55:0x00c4, B:54:0x00c3, B:51:0x00be, B:56:0x00ca, B:59:0x00dc, B:62:0x00e3, B:43:0x00a1, B:65:0x00eb, B:25:0x0065, B:66:0x00f5, B:68:0x00fb), top: B:89:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00eb A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C9096Ng m5486a(long j, C9500e9 c9500e9, C8902Fg c8902Fg, ArrayList arrayList, int i) {
        Cursor cursorM5485a;
        boolean z;
        C9096Ng c9096Ng;
        C9475d9 c9475d9M5612a;
        int iComputeMessageSize;
        C9327X8[] c9327x8ArrM5483a;
        C9231T8 c9231t8;
        C9525f9 c9525f9 = new C9525f9();
        c9525f9.f8100a = j;
        c9525f9.f8101b = c9500e9;
        EnumC9436bk enumC9436bk = (EnumC9436bk) AbstractC9531ff.f8127b.get(c9500e9.f8002c);
        if (enumC9436bk == null) {
            enumC9436bk = EnumC9436bk.FOREGROUND;
        }
        try {
            cursorM5485a = m5485a(j, enumC9436bk);
            if (cursorM5485a != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C9466d0 c9466d0 = null;
                    while (true) {
                        z = false;
                        if (!cursorM5485a.moveToNext() || this.f7101h >= 100) {
                            break;
                        }
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursorM5485a, contentValues);
                        try {
                            C9016K8 c9016k8 = new C9016K8(contentValues);
                            EnumC9329Xa enumC9329Xa = c9016k8.f6868h;
                            if (enumC9329Xa != null) {
                                c9231t8 = (C9231T8) AbstractC9531ff.f8129d.get(enumC9329Xa);
                            } else {
                                Map map = AbstractC9531ff.f8126a;
                                c9231t8 = null;
                            }
                            if (c9231t8 == null) {
                                c9231t8 = C9231T8.f7277i;
                            }
                            try {
                                c9475d9M5612a = c9231t8.m5612a(c9016k8, c8902Fg);
                            } catch (Throwable th) {
                                th = th;
                                arrayList.add(th);
                                c9475d9M5612a = null;
                                if (c9475d9M5612a == null) {
                                }
                                arrayList2.add(c9475d9M5612a);
                                this.f7101h++;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (c9475d9M5612a == null) {
                            C9466d0 c9466d0M5482a = m5482a(contentValues);
                            if (c9466d0 == null) {
                                if (this.f7102i < 0) {
                                    try {
                                        c9327x8ArrM5483a = m5483a(new JSONObject(c9466d0M5482a.f7885a));
                                    } catch (Throwable unused) {
                                    }
                                    if (c9327x8ArrM5483a != null) {
                                        iComputeMessageSize = 0;
                                        for (C9327X8 c9327x8 : c9327x8ArrM5483a) {
                                            iComputeMessageSize += CodedOutputByteBufferNano.computeMessageSize(7, c9327x8);
                                        }
                                    } else {
                                        iComputeMessageSize = 0;
                                    }
                                    this.f7102i = iComputeMessageSize;
                                    this.f7100g += iComputeMessageSize;
                                }
                                c9466d0 = c9466d0M5482a;
                            } else if (!c9466d0.equals(c9466d0M5482a)) {
                                z = true;
                                break;
                            }
                            C9819r3 c9819r3 = this.f7104k;
                            byte[] bArr = c9475d9M5612a.f7935e;
                            c9819r3.getClass();
                            byte[] bArrMo5338a = c9819r3.mo5338a(bArr);
                            byte[] bArr2 = c9475d9M5612a.f7935e;
                            if (bArr2 != bArrMo5338a) {
                                c9475d9M5612a.f7939i = ((bArr2 == null ? 0 : bArr2.length) - (bArrMo5338a == null ? 0 : bArrMo5338a.length)) + c9475d9M5612a.f7939i;
                                c9475d9M5612a.f7935e = bArrMo5338a;
                            }
                            this.f7100g += CodedOutputByteBufferNano.computeMessageSize(3, c9475d9M5612a);
                            if (arrayList2.isEmpty() && i == 0) {
                                if (this.f7100g >= 1048576) {
                                    break;
                                }
                            } else if (this.f7100g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c9475d9M5612a);
                        this.f7101h++;
                    }
                    if (arrayList2.size() > 0) {
                        c9525f9.f8102c = (C9475d9[]) arrayList2.toArray(new C9475d9[arrayList2.size()]);
                        c9096Ng = new C9096Ng(c9525f9, c9466d0, z);
                    } else {
                        c9096Ng = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        arrayList.add(th);
                        AbstractC9664kn.m6340a(cursorM5485a);
                        return null;
                    } finally {
                        AbstractC9664kn.m6340a(cursorM5485a);
                    }
                }
            }
            return c9096Ng;
        } catch (Throwable th4) {
            th = th4;
            cursorM5485a = null;
        }
    }

    /* renamed from: a */
    public final Cursor m5484a() {
        SQLiteDatabase readableDatabase;
        C9062M6 c9062m6 = this.f7098e;
        LinkedHashMap linkedHashMap = this.f7095b;
        c9062m6.f6974a.lock();
        try {
            readableDatabase = c9062m6.f6976c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, C9062M6.m5386a(linkedHashMap), C9062M6.m5388a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null) : null;
        c9062m6.f6974a.unlock();
        return cursorQuery;
    }

    /* renamed from: a */
    public final Cursor m5485a(long j, EnumC9436bk enumC9436bk) {
        SQLiteDatabase readableDatabase;
        C9062M6 c9062m6 = this.f7098e;
        c9062m6.f6974a.lock();
        try {
            readableDatabase = c9062m6.f6976c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j), Integer.toString(enumC9436bk.f7798a)}, null, null, "number_in_session ASC", null) : null;
        c9062m6.f6974a.unlock();
        return cursorQuery;
    }
}
