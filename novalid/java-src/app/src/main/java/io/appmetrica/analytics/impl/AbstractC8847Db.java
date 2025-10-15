package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.Db */
/* loaded from: classes6.dex */
public abstract class AbstractC8847Db {
    /* renamed from: a */
    public static final ArrayList m5059a(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        if (locales == null) {
            return arrayList;
        }
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            Locale locale = locales.get(i);
            if (locale != null) {
                arrayList.add(AbstractC9380Zd.m5810a(locale));
            }
        }
        return arrayList;
    }
}
