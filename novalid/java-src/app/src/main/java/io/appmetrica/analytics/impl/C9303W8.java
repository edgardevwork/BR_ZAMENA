package io.appmetrica.analytics.impl;

import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.W8 */
/* loaded from: classes5.dex */
public final class C9303W8 extends AbstractC9237Te {

    /* renamed from: a */
    public final C9025Kh f7394a;

    /* renamed from: b */
    public final HashMap f7395b;

    /* renamed from: c */
    public final C8890F4 f7396c;

    public C9303W8(C9571h5 c9571h5) {
        C9025Kh c9025Kh = new C9025Kh(c9571h5);
        this.f7394a = c9025Kh;
        this.f7396c = new C8890F4(c9025Kh);
        this.f7395b = m5711a();
    }

    /* renamed from: a */
    public final HashMap m5711a() {
        HashMap map = new HashMap();
        map.put(EnumC9329Xa.EVENT_TYPE_ACTIVATION, new C9565h(this.f7394a));
        map.put(EnumC9329Xa.EVENT_TYPE_START, new C8980Ik(this.f7394a));
        map.put(EnumC9329Xa.EVENT_TYPE_REGULAR, new C9358Yf(this.f7394a));
        C9502eb c9502eb = new C9502eb(this.f7394a);
        map.put(EnumC9329Xa.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c9502eb);
        map.put(EnumC9329Xa.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c9502eb);
        map.put(EnumC9329Xa.EVENT_TYPE_SEND_REFERRER, c9502eb);
        map.put(EnumC9329Xa.EVENT_TYPE_CUSTOM_EVENT, c9502eb);
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_SET_SESSION_EXTRA;
        C9025Kh c9025Kh = this.f7394a;
        map.put(enumC9329Xa, new C8856Dk(c9025Kh, c9025Kh.f6910t));
        map.put(EnumC9329Xa.EVENT_TYPE_APP_OPEN, new C9532fg(this.f7394a));
        map.put(EnumC9329Xa.EVENT_TYPE_PURGE_BUFFER, new C9581hf(this.f7394a));
        map.put(EnumC9329Xa.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C9872t6(this.f7394a));
        map.put(EnumC9329Xa.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new C9094Ne(this.f7394a));
        map.put(EnumC9329Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C9269Um(this.f7394a));
        C9245Tm c9245Tm = new C9245Tm(this.f7394a);
        map.put(EnumC9329Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, c9245Tm);
        map.put(EnumC9329Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, c9245Tm);
        map.put(EnumC9329Xa.EVENT_TYPE_ANR, c9502eb);
        EnumC9329Xa enumC9329Xa2 = EnumC9329Xa.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C9025Kh c9025Kh2 = this.f7394a;
        map.put(enumC9329Xa2, new C8856Dk(c9025Kh2, c9025Kh2.f6895e));
        EnumC9329Xa enumC9329Xa3 = EnumC9329Xa.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C9025Kh c9025Kh3 = this.f7394a;
        map.put(enumC9329Xa3, new C8856Dk(c9025Kh3, c9025Kh3.f6896f));
        map.put(EnumC9329Xa.EVENT_TYPE_SEND_USER_PROFILE, c9502eb);
        EnumC9329Xa enumC9329Xa4 = EnumC9329Xa.EVENT_TYPE_SET_USER_PROFILE_ID;
        C9025Kh c9025Kh4 = this.f7394a;
        map.put(enumC9329Xa4, new C8856Dk(c9025Kh4, c9025Kh4.f6901k));
        map.put(EnumC9329Xa.EVENT_TYPE_SEND_REVENUE_EVENT, c9502eb);
        map.put(EnumC9329Xa.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c9502eb);
        map.put(EnumC9329Xa.EVENT_TYPE_CLEANUP, c9502eb);
        map.put(EnumC9329Xa.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c9502eb);
        map.put(EnumC9329Xa.EVENT_TYPE_WEBVIEW_SYNC, c9502eb);
        map.put(EnumC9329Xa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new C8820C9(this.f7394a));
        return map;
    }

    /* renamed from: b */
    public final C9025Kh m5713b() {
        return this.f7394a;
    }

    /* renamed from: a */
    public final void m5712a(EnumC9329Xa enumC9329Xa, AbstractC9701ma abstractC9701ma) {
        this.f7395b.put(enumC9329Xa, abstractC9701ma);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9237Te
    /* renamed from: a */
    public final AbstractC9279V8 mo5519a(int i) {
        LinkedList linkedList = new LinkedList();
        EnumC9329Xa enumC9329XaM5744a = EnumC9329Xa.m5744a(i);
        C8890F4 c8890f4 = this.f7396c;
        if (c8890f4 != null) {
            c8890f4.m5125a(enumC9329XaM5744a, linkedList);
        }
        AbstractC9701ma abstractC9701ma = (AbstractC9701ma) this.f7395b.get(enumC9329XaM5744a);
        if (abstractC9701ma != null) {
            abstractC9701ma.mo5022a(linkedList);
        }
        return new C9255U8(linkedList);
    }

    @VisibleForTesting
    /* renamed from: a */
    public final AbstractC9701ma m5710a(EnumC9329Xa enumC9329Xa) {
        return (AbstractC9701ma) this.f7395b.get(enumC9329Xa);
    }
}
