package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Pm */
/* loaded from: classes5.dex */
public final class C9150Pm {

    /* renamed from: a */
    public final C8908Fm f7124a;

    /* renamed from: b */
    public final C9222T f7125b;

    /* renamed from: c */
    public final List f7126c;

    /* renamed from: d */
    public final String f7127d;

    /* renamed from: e */
    public final String f7128e;

    /* renamed from: f */
    public final Map f7129f;

    /* renamed from: g */
    public final String f7130g;

    /* renamed from: h */
    public final Boolean f7131h;

    public C9150Pm(C8908Fm c8908Fm, C9222T c9222t, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f7124a = c8908Fm;
        this.f7125b = c9222t;
        this.f7126c = arrayList;
        this.f7127d = str;
        this.f7128e = str2;
        this.f7129f = map;
        this.f7130g = str3;
        this.f7131h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C8908Fm c8908Fm = this.f7124a;
        if (c8908Fm != null) {
            for (C8956Hk c8956Hk : c8908Fm.f6630c) {
                sb.append("at " + c8956Hk.f6728a + "." + c8956Hk.f6732e + "(" + c8956Hk.f6729b + StringUtils.PROCESS_POSTFIX_DELIMITER + c8956Hk.f6730c + StringUtils.PROCESS_POSTFIX_DELIMITER + c8956Hk.f6731d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f7124a + org.apache.commons.lang3.StringUtils.f9903LF + sb.toString() + '}';
    }
}
