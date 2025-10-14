package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.vk */
/* loaded from: classes7.dex */
public final class C9936vk {

    /* renamed from: a */
    public final C9753oc f9232a;

    /* renamed from: b */
    public final C9728nc f9233b;

    public C9936vk(PublicLogger publicLogger, String str) {
        this(new C9753oc(str, publicLogger), new C9728nc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final synchronized boolean m6899a(C9828rc c9828rc, String str, String str2) {
        try {
            int size = c9828rc.size();
            int i = this.f9232a.f8832c.f6362a;
            if (size < i || (i == c9828rc.size() && c9828rc.containsKey(str))) {
                this.f9233b.getClass();
                int length = c9828rc.f8993a;
                if (str2 != null) {
                    length += str2.length();
                }
                if (c9828rc.containsKey(str)) {
                    String str3 = (String) c9828rc.get(str);
                    if (str3 != null) {
                        length -= str3.length();
                    }
                } else {
                    length += str.length();
                }
                if (length <= 4500) {
                    c9828rc.put(str, str2);
                    return true;
                }
                C9728nc c9728nc = this.f9233b;
                c9728nc.f8729b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", c9728nc.f8728a, 4500, str);
            } else {
                C9753oc c9753oc = this.f9232a;
                c9753oc.f8833d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", c9753oc.f8834e, Integer.valueOf(c9753oc.f8832c.f6362a), str);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final boolean m6900b(C9828rc c9828rc, String str, String str2) {
        if (c9828rc == null) {
            return false;
        }
        String strMo5338a = this.f9232a.f8830a.mo5338a(str);
        String strMo5338a2 = this.f9232a.f8831b.mo5338a(str2);
        if (!c9828rc.containsKey(strMo5338a)) {
            if (strMo5338a2 != null) {
                return m6899a(c9828rc, strMo5338a, strMo5338a2);
            }
            return false;
        }
        String str3 = (String) c9828rc.get(strMo5338a);
        if (strMo5338a2 == null || !strMo5338a2.equals(str3)) {
            return m6899a(c9828rc, strMo5338a, strMo5338a2);
        }
        return false;
    }

    public C9936vk(C9753oc c9753oc, C9728nc c9728nc) {
        this.f9232a = c9753oc;
        this.f9233b = c9728nc;
    }
}
