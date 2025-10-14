package com.sdkit.paylib.paylibpayment.impl.domain.network.model;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.model.b */
/* loaded from: classes8.dex */
public abstract class AbstractC8559b {
    /* renamed from: a */
    public static final Map m4154a(C8558a c8558a) {
        Intrinsics.checkNotNullParameter(c8558a, "<this>");
        return MapsKt__MapsKt.toMap(m4155b(c8558a));
    }

    /* renamed from: b */
    public static final List m4155b(C8558a c8558a) {
        Intrinsics.checkNotNullParameter(c8558a, "<this>");
        String strM4150f = c8558a.m4150f();
        Pair pair = strM4150f != null ? new Pair("device_platform_type", strM4150f) : null;
        String strM4151g = c8558a.m4151g();
        Pair pair2 = strM4151g != null ? new Pair("device_platform_version", strM4151g) : null;
        String strM4149e = c8558a.m4149e();
        Pair pair3 = strM4149e != null ? new Pair("device_model", strM4149e) : null;
        String strM4148d = c8558a.m4148d();
        Pair pair4 = strM4148d != null ? new Pair("device_manufacturer", strM4148d) : null;
        String strM4147c = c8558a.m4147c();
        Pair pair5 = strM4147c != null ? new Pair("device_id", strM4147c) : null;
        String strM4152h = c8558a.m4152h();
        Pair pair6 = strM4152h != null ? new Pair("surface", strM4152h) : null;
        String strM4153i = c8558a.m4153i();
        Pair pair7 = strM4153i != null ? new Pair("surface_version", strM4153i) : null;
        String strM4146b = c8558a.m4146b();
        Pair pair8 = strM4146b != null ? new Pair("channel", strM4146b) : null;
        String strM4145a = c8558a.m4145a();
        return CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, strM4145a != null ? new Pair("auth_connector", strM4145a) : null});
    }
}
