package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nl */
/* loaded from: classes7.dex */
public final class C9737nl {

    /* renamed from: A */
    public final C8957Hl f8762A;

    /* renamed from: B */
    public final Map f8763B;

    /* renamed from: C */
    public final C10025z9 f8764C;

    /* renamed from: a */
    public final String f8765a;

    /* renamed from: b */
    public final List f8766b;

    /* renamed from: c */
    public final String f8767c;

    /* renamed from: d */
    public final String f8768d;

    /* renamed from: e */
    public final String f8769e;

    /* renamed from: f */
    public final List f8770f;

    /* renamed from: g */
    public final List f8771g;

    /* renamed from: h */
    public final List f8772h;

    /* renamed from: i */
    public final Map f8773i;

    /* renamed from: j */
    public final String f8774j;

    /* renamed from: k */
    public final String f8775k;

    /* renamed from: l */
    public final String f8776l;

    /* renamed from: m */
    public final C8765A4 f8777m;

    /* renamed from: n */
    public final long f8778n;

    /* renamed from: o */
    public final boolean f8779o;

    /* renamed from: p */
    public final boolean f8780p;

    /* renamed from: q */
    public final String f8781q;

    /* renamed from: r */
    public final C9053Ll f8782r;

    /* renamed from: s */
    public final C9165Qd f8783s;

    /* renamed from: t */
    public final RetryPolicyConfig f8784t;

    /* renamed from: u */
    public final long f8785u;

    /* renamed from: v */
    public final long f8786v;

    /* renamed from: w */
    public final boolean f8787w;

    /* renamed from: x */
    public final BillingConfig f8788x;

    /* renamed from: y */
    public final C9919v3 f8789y;

    /* renamed from: z */
    public final C9718n2 f8790z;

    public C9737nl(C9712ml c9712ml) {
        this.f8765a = c9712ml.f8663a;
        List list = c9712ml.f8664b;
        this.f8766b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f8767c = c9712ml.f8665c;
        this.f8768d = c9712ml.f8666d;
        this.f8769e = c9712ml.f8667e;
        List list2 = c9712ml.f8668f;
        this.f8770f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c9712ml.f8669g;
        this.f8771g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c9712ml.f8670h;
        this.f8772h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map = c9712ml.f8671i;
        this.f8773i = map != null ? CollectionUtils.unmodifiableMapCopy(map) : null;
        this.f8774j = c9712ml.f8672j;
        this.f8775k = c9712ml.f8673k;
        this.f8777m = c9712ml.f8675m;
        this.f8783s = c9712ml.f8676n;
        this.f8778n = c9712ml.f8677o;
        this.f8779o = c9712ml.f8678p;
        this.f8776l = c9712ml.f8674l;
        this.f8780p = c9712ml.f8679q;
        this.f8781q = c9712ml.f8680r;
        this.f8782r = c9712ml.f8681s;
        this.f8785u = c9712ml.f8682t;
        this.f8786v = c9712ml.f8683u;
        this.f8787w = c9712ml.f8684v;
        RetryPolicyConfig retryPolicyConfig = c9712ml.f8685w;
        if (retryPolicyConfig == null) {
            C8807Bl c8807Bl = new C8807Bl();
            this.f8784t = new RetryPolicyConfig(c8807Bl.f6412w, c8807Bl.f6413x);
        } else {
            this.f8784t = retryPolicyConfig;
        }
        this.f8788x = c9712ml.f8686x;
        this.f8789y = c9712ml.f8687y;
        this.f8790z = c9712ml.f8688z;
        this.f8762A = c9712ml.f8660A == null ? new C8957Hl(AbstractC8943H7.f6704a.f9408a) : c9712ml.f8660A;
        this.f8763B = c9712ml.f8661B == null ? Collections.emptyMap() : c9712ml.f8661B;
        this.f8764C = c9712ml.f8662C;
    }

    /* renamed from: a */
    public final C9712ml m6564a(C8765A4 c8765a4) {
        C9712ml c9712ml = new C9712ml(c8765a4);
        c9712ml.f8663a = this.f8765a;
        c9712ml.f8668f = this.f8770f;
        c9712ml.f8669g = this.f8771g;
        c9712ml.f8672j = this.f8774j;
        c9712ml.f8664b = this.f8766b;
        c9712ml.f8665c = this.f8767c;
        c9712ml.f8666d = this.f8768d;
        c9712ml.f8667e = this.f8769e;
        c9712ml.f8670h = this.f8772h;
        c9712ml.f8671i = this.f8773i;
        c9712ml.f8673k = this.f8775k;
        c9712ml.f8674l = this.f8776l;
        c9712ml.f8679q = this.f8780p;
        c9712ml.f8677o = this.f8778n;
        c9712ml.f8678p = this.f8779o;
        c9712ml.f8680r = this.f8781q;
        c9712ml.f8676n = this.f8783s;
        c9712ml.f8682t = this.f8785u;
        c9712ml.f8683u = this.f8786v;
        c9712ml.f8681s = this.f8782r;
        c9712ml.f8684v = this.f8787w;
        c9712ml.f8685w = this.f8784t;
        c9712ml.f8687y = this.f8789y;
        c9712ml.f8686x = this.f8788x;
        c9712ml.f8688z = this.f8790z;
        c9712ml.f8660A = this.f8762A;
        c9712ml.f8661B = this.f8763B;
        c9712ml.f8662C = this.f8764C;
        return c9712ml;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f8765a + "', reportUrls=" + this.f8766b + ", getAdUrl='" + this.f8767c + "', reportAdUrl='" + this.f8768d + "', certificateUrl='" + this.f8769e + "', hostUrlsFromStartup=" + this.f8770f + ", hostUrlsFromClient=" + this.f8771g + ", diagnosticUrls=" + this.f8772h + ", customSdkHosts=" + this.f8773i + ", encodedClidsFromResponse='" + this.f8774j + "', lastClientClidsForStartupRequest='" + this.f8775k + "', lastChosenForRequestClids='" + this.f8776l + "', collectingFlags=" + this.f8777m + ", obtainTime=" + this.f8778n + ", hadFirstStartup=" + this.f8779o + ", startupDidNotOverrideClids=" + this.f8780p + ", countryInit='" + this.f8781q + "', statSending=" + this.f8782r + ", permissionsCollectingConfig=" + this.f8783s + ", retryPolicyConfig=" + this.f8784t + ", obtainServerTime=" + this.f8785u + ", firstStartupServerTime=" + this.f8786v + ", outdated=" + this.f8787w + ", autoInappCollectingConfig=" + this.f8788x + ", cacheControl=" + this.f8789y + ", attributionConfig=" + this.f8790z + ", startupUpdateConfig=" + this.f8762A + ", modulesRemoteConfigs=" + this.f8763B + ", externalAttributionConfig=" + this.f8764C + '}';
    }
}
