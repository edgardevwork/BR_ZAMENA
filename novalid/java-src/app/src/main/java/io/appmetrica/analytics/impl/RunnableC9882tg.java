package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser;

/* renamed from: io.appmetrica.analytics.impl.tg */
/* loaded from: classes7.dex */
public final class RunnableC9882tg implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C9830re c9830reM6386w = C9676la.f8552C.m6386w();
        if (timePassedChecker.didTimePassMillis(c9830reM6386w.m6771f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            Pair pairM7112to = TuplesKt.m7112to("major", Integer.valueOf(kotlinVersion.getMajor()));
            Pair pairM7112to2 = TuplesKt.m7112to("minor", Integer.valueOf(kotlinVersion.getMinor()));
            Pair pairM7112to3 = TuplesKt.m7112to(EclipseUpdateSiteParser.FeatureHandler.PATCH, Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append('.');
            sb.append(kotlinVersion.getMinor());
            sb.append('.');
            sb.append(kotlinVersion.getPatch());
            Map mapMapOf = MapsKt__MapsKt.mapOf(pairM7112to, pairM7112to2, pairM7112to3, TuplesKt.m7112to("version", sb.toString()));
            C9610ij c9610ij = AbstractC8954Hi.f6726a;
            c9610ij.getClass();
            c9610ij.m6292a(new C9585hj("kotlin_version", mapMapOf));
            c9830reM6386w.m6765c(systemTimeProvider.currentTimeMillis()).m6648b();
        }
    }
}
