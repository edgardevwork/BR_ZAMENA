package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* renamed from: io.appmetrica.analytics.impl.Cb */
/* loaded from: classes6.dex */
public final class C8822Cb {
    /* renamed from: a */
    public static List m5026a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? AbstractC8847Db.m5059a(configuration) : CollectionsKt__CollectionsJVMKt.listOf(AbstractC9380Zd.m5810a(configuration.locale));
    }
}
