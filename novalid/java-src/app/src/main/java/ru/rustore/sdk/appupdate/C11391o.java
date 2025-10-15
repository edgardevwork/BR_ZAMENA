package ru.rustore.sdk.appupdate;

import android.os.Bundle;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.core.util.PrimitivesExtensionKt;

/* renamed from: ru.rustore.sdk.appupdate.o */
/* loaded from: classes6.dex */
public final class C11391o {

    /* renamed from: a */
    @NotNull
    public final AppUpdateInfo.Factory f10136a;

    /* renamed from: b */
    @NotNull
    public final C11383i0 f10137b;

    public C11391o(@NotNull AppUpdateInfo.Factory appUpdateInfoFactory, @NotNull C11383i0 timeProvider) {
        Intrinsics.checkNotNullParameter(appUpdateInfoFactory, "appUpdateInfoFactory");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f10136a = appUpdateInfoFactory;
        this.f10137b = timeProvider;
    }

    @NotNull
    /* renamed from: a */
    public final AppUpdateInfo m7435a(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        AppUpdateInfo.Factory factory = this.f10136a;
        long j = bundle.getLong("APPLICATION_ID", 0L);
        String string = bundle.getString("APP_NAME");
        if (string == null) {
            string = "";
        }
        String string2 = bundle.getString("ICON_URL");
        if (string2 == null) {
            string2 = "";
        }
        long j2 = bundle.getLong("FILE_SIZE", 0L);
        String string3 = bundle.getString("PACKAGE_NAME");
        String str = string3 == null ? "" : string3;
        String string4 = bundle.getString("AVAILABLE_VERSION_NAME");
        String str2 = string4 == null ? "" : string4;
        long j3 = bundle.getLong("AVAILABLE_VERSION_CODE_LONG", bundle.getInt("AVAILABLE_VERSION_CODE"));
        int i = bundle.getInt("INSTALL_STATUS", 0);
        int i2 = bundle.getInt("UPDATE_AVAILABILITY", 0);
        int iCoerceIn = RangesKt___RangesKt.coerceIn(bundle.getInt("UPDATE_PRIORITY", 0), (ClosedRange<Integer>) new IntRange(0, 5));
        Date time = this.f10137b.f10126a.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        String string5 = bundle.getString("UPDATED_AT", time.toString());
        Intrinsics.checkNotNullExpressionValue(string5, "bundle.getString(\n      …w().toString(),\n        )");
        String string6 = bundle.getString("whatsNew");
        return factory.create$sdk_public_appupdate_release(j, string, string2, j2, str, str2, j3, i, i2, iCoerceIn, string5, string6 != null ? string6 : "");
    }

    @NotNull
    /* renamed from: a */
    public static Bundle m7434a(@NotNull AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
        Bundle bundle = new Bundle();
        bundle.putLong("APPLICATION_ID", appUpdateInfo.getAppId());
        bundle.putString("PACKAGE_NAME", appUpdateInfo.getPackageName());
        bundle.putString("APP_NAME", appUpdateInfo.getAppName());
        bundle.putString("ICON_URL", appUpdateInfo.getIconUrl());
        bundle.putLong("FILE_SIZE", appUpdateInfo.getFileSize());
        bundle.putString("AVAILABLE_VERSION_NAME", appUpdateInfo.getAvailableVersionName());
        bundle.putInt("AVAILABLE_VERSION_CODE", PrimitivesExtensionKt.safeToInt(appUpdateInfo.getAvailableVersionCode()));
        bundle.putLong("AVAILABLE_VERSION_CODE_LONG", appUpdateInfo.getAvailableVersionCode());
        bundle.putString("whatsNew", appUpdateInfo.getWhatsNew());
        return bundle;
    }
}
