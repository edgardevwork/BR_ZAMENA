package com.sdkit.paylib.paylibpayment.impl.domain.network.utils;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8544o;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.ScanBuild;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.utils.a */
/* loaded from: classes5.dex */
public final class C8584a {

    /* renamed from: c */
    public static final a f5782c = new a(null);

    /* renamed from: a */
    public final String f5783a;

    /* renamed from: b */
    public final String f5784b;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.utils.a$a */
    public static final class a {
        public a() {
        }

        /* renamed from: a */
        public final C8584a m4646a() {
            C8544o c8544o = C8544o.f4976a;
            return new C8584a(c8544o.m4096a(32), c8544o.m4096a(16));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m4647a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((CharSequence) value, new String[]{"-"}, false, 0, 6, (Object) null));
        }
    }

    public C8584a(String traceId, String spanId) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        this.f5783a = traceId;
        this.f5784b = spanId;
    }

    /* renamed from: a */
    public final String m4644a() {
        return this.f5783a;
    }

    /* renamed from: b */
    public final String m4645b() {
        return this.f5783a + '-' + this.f5784b + ScanBuild.XRAY_FATAL_FAIL_STATUS;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8584a)) {
            return false;
        }
        C8584a c8584a = (C8584a) obj;
        return Intrinsics.areEqual(this.f5783a, c8584a.f5783a) && Intrinsics.areEqual(this.f5784b, c8584a.f5784b);
    }

    public int hashCode() {
        return this.f5784b.hashCode() + (this.f5783a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("B3Propagation(traceId=");
        sb.append(this.f5783a);
        sb.append(", spanId=");
        return C8032c.m1430a(sb, this.f5784b, ')');
    }
}
