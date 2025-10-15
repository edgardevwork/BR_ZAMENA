package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.wi */
/* loaded from: classes5.dex */
public final class C9959wi implements SdkEnvironmentProvider {

    /* renamed from: a */
    public final Context f9272a;

    /* renamed from: b */
    public final C8822Cb f9273b = new C8822Cb();

    /* renamed from: c */
    public final CopyOnWriteArrayList f9274c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public SdkEnvironment f9275d;

    /* renamed from: e */
    public String f9276e;

    public C9959wi(@NotNull Context context) {
        this.f9272a = context;
        this.f9275d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("7.3.0", "50119713", AbstractC9984xi.m6964a()), "phone", C8822Cb.m5026a(context.getResources().getConfiguration()));
    }

    /* renamed from: a */
    public final synchronized void m6923a(@Nullable ScreenInfo screenInfo) {
        float f;
        if (screenInfo != null) {
            try {
                if (!Intrinsics.areEqual(screenInfo, getSdkEnvironment().getScreenInfo())) {
                    String str = this.f9276e;
                    if (str == null) {
                        Context context = this.f9272a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = AbstractC9380Zd.f7639a;
                        try {
                            f = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f = 0.0f;
                        }
                        if (f == 0.0f) {
                            str = "phone";
                        } else {
                            float f2 = point.x;
                            float f3 = point.y;
                            float fMin = Math.min(f2 / f, f3 / f);
                            float f4 = f * 160.0f;
                            float f5 = f2 / f4;
                            float f6 = f3 / f4;
                            double dSqrt = Math.sqrt((f6 * f6) + (f5 * f5));
                            str = (dSqrt < 15.0d || AbstractC9380Zd.f7639a.hasSystemFeature(context, "android.hardware.touchscreen")) ? (dSqrt >= 7.0d || fMin >= 600.0f) ? "tablet" : "phone" : "tv";
                        }
                    }
                    this.f9275d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.f9274c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC9921v5) ((InterfaceC9934vi) it.next())).m6885d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m6927b(@NotNull InterfaceC9934vi interfaceC9934vi) {
        this.f9274c.remove(interfaceC9934vi);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    @NotNull
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f9275d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sdkEnvironment");
        return null;
    }

    /* renamed from: a */
    public final synchronized void m6925a(@Nullable String str) {
        if (str != null) {
            if (!Intrinsics.areEqual(str, this.f9276e)) {
                this.f9276e = str;
                if (!Intrinsics.areEqual(str, getSdkEnvironment().getDeviceType())) {
                    this.f9275d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f9274c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC9921v5) ((InterfaceC9934vi) it.next())).m6885d();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m6926a(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            try {
                str = getSdkEnvironment().getAppVersionInfo().getAppVersionName();
            } finally {
            }
        }
        if (str2 == null) {
            str2 = getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
        }
        AppVersionInfo appVersionInfo = getSdkEnvironment().getAppVersionInfo();
        if (!Intrinsics.areEqual(appVersionInfo.getAppVersionName(), str) || !Intrinsics.areEqual(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f9275d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f9274c.iterator();
            while (it.hasNext()) {
                ((AbstractC9921v5) ((InterfaceC9934vi) it.next())).m6885d();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m6922a(@NotNull Configuration configuration) {
        this.f9273b.getClass();
        List listM5026a = C8822Cb.m5026a(configuration);
        if (!Intrinsics.areEqual(getSdkEnvironment().getLocales(), listM5026a)) {
            this.f9275d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, listM5026a, 31, null);
            Iterator it = this.f9274c.iterator();
            while (it.hasNext()) {
                ((AbstractC9921v5) ((InterfaceC9934vi) it.next())).m6885d();
            }
        }
    }

    /* renamed from: a */
    public final void m6924a(@NotNull InterfaceC9934vi interfaceC9934vi) {
        this.f9274c.add(interfaceC9934vi);
    }
}
