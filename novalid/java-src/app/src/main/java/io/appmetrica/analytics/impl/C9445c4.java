package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.c4 */
/* loaded from: classes7.dex */
public final class C9445c4 extends C9252U5 {

    /* renamed from: q */
    public HashMap f7811q;

    /* renamed from: r */
    public C9413am f7812r;

    /* renamed from: s */
    public C9364Yl f7813s;

    /* renamed from: t */
    public C9364Yl f7814t;

    /* renamed from: u */
    public C9819r3 f7815u;

    /* renamed from: v */
    public C9413am f7816v;

    @VisibleForTesting
    public C9445c4(@NonNull PublicLogger publicLogger) {
        this.f7811q = new HashMap();
        m5938a(publicLogger);
    }

    /* renamed from: b */
    public static C9252U5 m5934b(String str, String str2) {
        C9252U5 c9252u5 = new C9252U5("", 0);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9252u5.f7312d = 5376;
        c9252u5.m5650a(str, str2);
        return c9252u5;
    }

    /* renamed from: n */
    public static C9252U5 m5935n() {
        C9252U5 c9252u5 = new C9252U5("", 0);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9252u5.f7312d = 5632;
        return c9252u5;
    }

    /* renamed from: o */
    public static C9252U5 m5936o() {
        C9252U5 c9252u5 = new C9252U5("", 0);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9252u5.f7312d = 40961;
        return c9252u5;
    }

    /* renamed from: a */
    public final void m5939a(String str, String str2, EnumC9420b4 enumC9420b4) {
        if (!StringUtils.equalsNullSafety(str, str2)) {
            this.f7811q.put(enumC9420b4, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        } else {
            this.f7811q.remove(enumC9420b4);
        }
        Iterator it = this.f7811q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f7315g = iIntValue;
    }

    @Override // io.appmetrica.analytics.impl.C9252U5
    @NonNull
    /* renamed from: c */
    public final void mo5656c(@Nullable String str) {
        C9413am c9413am = this.f7816v;
        c9413am.getClass();
        this.f7316h = c9413am.mo5338a(str);
    }

    /* renamed from: d */
    public final String m5941d(String str) {
        C9413am c9413am = this.f7812r;
        c9413am.getClass();
        String strMo5338a = c9413am.mo5338a(str);
        m5939a(str, strMo5338a, EnumC9420b4.NAME);
        return strMo5338a;
    }

    /* renamed from: e */
    public final String m5942e(String str) throws UnsupportedEncodingException {
        C9364Yl c9364Yl = this.f7813s;
        c9364Yl.getClass();
        String strMo5338a = c9364Yl.mo5338a(str);
        m5939a(str, strMo5338a, EnumC9420b4.VALUE);
        return strMo5338a;
    }

    /* renamed from: f */
    public final C9445c4 m5943f(@NonNull String str) throws UnsupportedEncodingException {
        C9364Yl c9364Yl = this.f7814t;
        c9364Yl.getClass();
        String strMo5338a = c9364Yl.mo5338a(str);
        m5939a(str, strMo5338a, EnumC9420b4.VALUE);
        this.f7310b = strMo5338a;
        return this;
    }

    @NonNull
    /* renamed from: p */
    public final HashMap<EnumC9420b4, Integer> m5944p() {
        return this.f7811q;
    }

    @Override // io.appmetrica.analytics.impl.C9252U5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(@Nullable String str) {
        this.f7309a = m5941d(str);
    }

    @Override // io.appmetrica.analytics.impl.C9252U5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(@Nullable String str) {
        this.f7310b = m5942e(str);
    }

    @Override // io.appmetrica.analytics.impl.C9252U5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final void setValueBytes(@Nullable byte[] bArr) {
        m5940a(bArr);
    }

    public C9445c4(String str, int i, @NonNull PublicLogger publicLogger) {
        this("", str, i, publicLogger);
    }

    public C9445c4(String str, String str2, int i, @NonNull PublicLogger publicLogger) {
        this(str, str2, i, 0, publicLogger);
    }

    /* renamed from: a */
    public final C9445c4 m5937a(@NonNull HashMap<EnumC9420b4, Integer> map) {
        this.f7811q = map;
        return this;
    }

    public C9445c4(String str, String str2, int i, int i2, @NonNull PublicLogger publicLogger) {
        this.f7811q = new HashMap();
        m5938a(publicLogger);
        this.f7310b = m5942e(str);
        this.f7309a = m5941d(str2);
        setType(i);
        setCustomType(i2);
    }

    /* renamed from: a */
    public final void m5938a(PublicLogger publicLogger) {
        this.f7812r = new C9413am(1000, "event name", publicLogger);
        this.f7813s = new C9364Yl(245760, "event value", publicLogger);
        this.f7814t = new C9364Yl(1024000, "event extended value", publicLogger);
        this.f7815u = new C9819r3(245760, "event value bytes", publicLogger);
        this.f7816v = new C9413am(200, "user profile id", publicLogger);
    }

    /* renamed from: a */
    public final void m5940a(byte[] bArr) {
        C9819r3 c9819r3 = this.f7815u;
        c9819r3.getClass();
        byte[] bArrMo5338a = c9819r3.mo5338a(bArr);
        EnumC9420b4 enumC9420b4 = EnumC9420b4.VALUE;
        if (bArr.length != bArrMo5338a.length) {
            this.f7811q.put(enumC9420b4, Integer.valueOf(bArr.length - bArrMo5338a.length));
        } else {
            this.f7811q.remove(enumC9420b4);
        }
        Iterator it = this.f7811q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f7315g = iIntValue;
        super.setValueBytes(bArrMo5338a);
    }

    /* renamed from: a */
    public static C9252U5 m5931a(@NonNull C9589hn c9589hn) {
        C9252U5 c9252u5M5936o = m5936o();
        c9252u5M5936o.setValue(new String(Base64.encode(MessageNano.toByteArray(c9589hn), 0)));
        return c9252u5M5936o;
    }

    /* renamed from: a */
    public static C9445c4 m5933a(PublicLogger publicLogger, C9559gi c9559gi) {
        int length;
        C9445c4 c9445c4 = new C9445c4(publicLogger);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9445c4.f7312d = 40976;
        C9509ei c9509ei = new C9509ei();
        c9509ei.f8020b = c9559gi.f8202a.currency.getCurrencyCode().getBytes();
        c9509ei.f8024f = c9559gi.f8202a.priceMicros;
        c9509ei.f8021c = StringUtils.stringToBytesForProtobuf(new C9413am(200, "revenue productID", c9559gi.f8206e).mo5338a(c9559gi.f8202a.productID));
        c9509ei.f8019a = ((Integer) WrapUtils.getOrDefault(c9559gi.f8202a.quantity, 1)).intValue();
        C9364Yl c9364Yl = c9559gi.f8203b;
        String str = c9559gi.f8202a.payload;
        c9364Yl.getClass();
        c9509ei.f8022d = StringUtils.stringToBytesForProtobuf(c9364Yl.mo5338a(str));
        if (AbstractC9664kn.m6342a(c9559gi.f8202a.receipt)) {
            C9384Zh c9384Zh = new C9384Zh();
            String str2 = (String) c9559gi.f8204c.mo5338a(c9559gi.f8202a.receipt.data);
            length = true ^ StringUtils.equalsNullSafety(c9559gi.f8202a.receipt.data, str2) ? c9559gi.f8202a.receipt.data.length() : 0;
            String str3 = (String) c9559gi.f8205d.mo5338a(c9559gi.f8202a.receipt.signature);
            c9384Zh.f7648a = StringUtils.stringToBytesForProtobuf(str2);
            c9384Zh.f7649b = StringUtils.stringToBytesForProtobuf(str3);
            c9509ei.f8023e = c9384Zh;
        } else {
            length = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(c9509ei), Integer.valueOf(length));
        c9445c4.f7310b = c9445c4.m5942e(new String(Base64.encode((byte[]) pair.first, 0)));
        c9445c4.f7315g = ((Integer) pair.second).intValue();
        return c9445c4;
    }

    public C9445c4(byte[] bArr, @Nullable String str, int i, @NonNull PublicLogger publicLogger) {
        this.f7811q = new HashMap();
        m5938a(publicLogger);
        m5940a(bArr);
        this.f7309a = m5941d(str);
        setType(i);
    }

    /* renamed from: a */
    public static C9445c4 m5932a(PublicLogger publicLogger, C8785B c8785b) {
        C9445c4 c9445c4 = new C9445c4(publicLogger);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9445c4.f7312d = 40977;
        kotlin.Pair pairM4980a = c8785b.m4980a();
        c9445c4.f7310b = c9445c4.m5942e(new String(Base64.encode((byte[]) pairM4980a.getFirst(), 0)));
        c9445c4.f7315g = ((Integer) pairM4980a.getSecond()).intValue();
        return c9445c4;
    }
}
