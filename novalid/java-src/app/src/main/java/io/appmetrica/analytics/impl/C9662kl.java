package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.kl */
/* loaded from: classes7.dex */
public final class C9662kl implements ProtobufConverter {

    /* renamed from: a */
    public final C9188Rd f8522a = new C9188Rd();

    /* renamed from: b */
    public final C9476da f8523b = new C9476da();

    /* renamed from: c */
    public final C9077Ml f8524c = new C9077Ml();

    /* renamed from: d */
    public final C9793q2 f8525d = new C9793q2();

    /* renamed from: e */
    public final C9969x3 f8526e = new C9969x3();

    /* renamed from: f */
    public final C9743o2 f8527f = new C9743o2();

    /* renamed from: g */
    public final C9972x6 f8528g = new C9972x6();

    /* renamed from: h */
    public final C8981Il f8529h = new C8981Il();

    /* renamed from: i */
    public final C9259Uc f8530i = new C9259Uc();

    /* renamed from: j */
    public final C8770A9 f8531j = new C8770A9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8807Bl fromModel(@NonNull C9737nl c9737nl) {
        C8807Bl c8807Bl = new C8807Bl();
        c8807Bl.f6408s = c9737nl.f8785u;
        c8807Bl.f6409t = c9737nl.f8786v;
        String str = c9737nl.f8765a;
        if (str != null) {
            c8807Bl.f6390a = str;
        }
        List list = c9737nl.f8770f;
        if (list != null) {
            c8807Bl.f6395f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c9737nl.f8771g;
        if (list2 != null) {
            c8807Bl.f6396g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c9737nl.f8766b;
        if (list3 != null) {
            c8807Bl.f6392c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c9737nl.f8772h;
        if (list4 != null) {
            c8807Bl.f6404o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c9737nl.f8773i;
        if (map != null) {
            c8807Bl.f6397h = this.f8528g.fromModel(map);
        }
        C9165Qd c9165Qd = c9737nl.f8783s;
        if (c9165Qd != null) {
            c8807Bl.f6411v = this.f8522a.fromModel(c9165Qd);
        }
        String str2 = c9737nl.f8774j;
        if (str2 != null) {
            c8807Bl.f6399j = str2;
        }
        String str3 = c9737nl.f8767c;
        if (str3 != null) {
            c8807Bl.f6393d = str3;
        }
        String str4 = c9737nl.f8768d;
        if (str4 != null) {
            c8807Bl.f6394e = str4;
        }
        String str5 = c9737nl.f8769e;
        if (str5 != null) {
            c8807Bl.f6407r = str5;
        }
        c8807Bl.f6398i = this.f8523b.fromModel(c9737nl.f8777m);
        String str6 = c9737nl.f8775k;
        if (str6 != null) {
            c8807Bl.f6400k = str6;
        }
        String str7 = c9737nl.f8776l;
        if (str7 != null) {
            c8807Bl.f6401l = str7;
        }
        c8807Bl.f6402m = c9737nl.f8780p;
        c8807Bl.f6391b = c9737nl.f8778n;
        c8807Bl.f6406q = c9737nl.f8779o;
        RetryPolicyConfig retryPolicyConfig = c9737nl.f8784t;
        c8807Bl.f6412w = retryPolicyConfig.maxIntervalSeconds;
        c8807Bl.f6413x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c9737nl.f8781q;
        if (str8 != null) {
            c8807Bl.f6403n = str8;
        }
        C9053Ll c9053Ll = c9737nl.f8782r;
        if (c9053Ll != null) {
            this.f8524c.getClass();
            C8782Al c8782Al = new C8782Al();
            c8782Al.f6349a = c9053Ll.f6953a;
            c8807Bl.f6405p = c8782Al;
        }
        c8807Bl.f6410u = c9737nl.f8787w;
        BillingConfig billingConfig = c9737nl.f8788x;
        if (billingConfig != null) {
            c8807Bl.f6415z = this.f8525d.fromModel(billingConfig);
        }
        C9919v3 c9919v3 = c9737nl.f8789y;
        if (c9919v3 != null) {
            this.f8526e.getClass();
            C9887tl c9887tl = new C9887tl();
            c9887tl.f9134a = c9919v3.f9210a;
            c8807Bl.f6414y = c9887tl;
        }
        C9718n2 c9718n2 = c9737nl.f8790z;
        if (c9718n2 != null) {
            c8807Bl.f6386A = this.f8527f.fromModel(c9718n2);
        }
        c8807Bl.f6387B = this.f8529h.fromModel(c9737nl.f8762A);
        c8807Bl.f6388C = this.f8530i.fromModel(c9737nl.f8763B);
        c8807Bl.f6389D = this.f8531j.fromModel(c9737nl.f8764C);
        return c8807Bl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9737nl toModel(@NonNull C8807Bl c8807Bl) {
        C9712ml c9712ml = new C9712ml(this.f8523b.toModel(c8807Bl.f6398i));
        c9712ml.f8663a = c8807Bl.f6390a;
        c9712ml.f8672j = c8807Bl.f6399j;
        c9712ml.f8665c = c8807Bl.f6393d;
        c9712ml.f8664b = Arrays.asList(c8807Bl.f6392c);
        c9712ml.f8669g = Arrays.asList(c8807Bl.f6396g);
        c9712ml.f8668f = Arrays.asList(c8807Bl.f6395f);
        c9712ml.f8666d = c8807Bl.f6394e;
        c9712ml.f8667e = c8807Bl.f6407r;
        c9712ml.f8670h = Arrays.asList(c8807Bl.f6404o);
        c9712ml.f8673k = c8807Bl.f6400k;
        c9712ml.f8674l = c8807Bl.f6401l;
        c9712ml.f8679q = c8807Bl.f6402m;
        c9712ml.f8677o = c8807Bl.f6391b;
        c9712ml.f8678p = c8807Bl.f6406q;
        c9712ml.f8682t = c8807Bl.f6408s;
        c9712ml.f8683u = c8807Bl.f6409t;
        c9712ml.f8680r = c8807Bl.f6403n;
        c9712ml.f8684v = c8807Bl.f6410u;
        c9712ml.f8685w = new RetryPolicyConfig(c8807Bl.f6412w, c8807Bl.f6413x);
        c9712ml.f8671i = this.f8528g.toModel(c8807Bl.f6397h);
        C10012yl c10012yl = c8807Bl.f6411v;
        if (c10012yl != null) {
            this.f8522a.getClass();
            c9712ml.f8676n = new C9165Qd(c10012yl.f9371a, c10012yl.f9372b);
        }
        C8782Al c8782Al = c8807Bl.f6405p;
        if (c8782Al != null) {
            this.f8524c.getClass();
            c9712ml.f8681s = new C9053Ll(c8782Al.f6349a);
        }
        C9862sl c9862sl = c8807Bl.f6415z;
        if (c9862sl != null) {
            this.f8525d.getClass();
            c9712ml.f8686x = new BillingConfig(c9862sl.f9054a, c9862sl.f9055b);
        }
        C9887tl c9887tl = c8807Bl.f6414y;
        if (c9887tl != null) {
            this.f8526e.getClass();
            c9712ml.f8687y = new C9919v3(c9887tl.f9134a);
        }
        C9837rl c9837rl = c8807Bl.f6386A;
        if (c9837rl != null) {
            c9712ml.f8688z = this.f8527f.toModel(c9837rl);
        }
        C10037zl c10037zl = c8807Bl.f6387B;
        if (c10037zl != null) {
            this.f8529h.getClass();
            c9712ml.f8660A = new C8957Hl(c10037zl.f9408a);
        }
        c9712ml.f8661B = this.f8530i.toModel(c8807Bl.f6388C);
        C9937vl c9937vl = c8807Bl.f6389D;
        if (c9937vl != null) {
            this.f8531j.getClass();
            c9712ml.f8662C = new C10025z9(c9937vl.f9235a);
        }
        return new C9737nl(c9712ml);
    }
}
