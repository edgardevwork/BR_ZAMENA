package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ui */
/* loaded from: classes7.dex */
public final class C9909ui {

    /* renamed from: a */
    public final String f9191a;

    /* renamed from: b */
    public final List f9192b;

    /* renamed from: c */
    public final String f9193c;

    /* renamed from: d */
    public final Map f9194d;

    public C9909ui(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f9191a + "', categoriesPath=" + this.f9192b + ", searchQuery='" + this.f9193c + "', payload=" + this.f9194d + '}';
    }

    public C9909ui(String str, String str2, List list, Map map) {
        this.f9191a = str;
        this.f9192b = list;
        this.f9193c = str2;
        this.f9194d = map;
    }
}
