package ru.rustore.sdk.appupdate.model;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.util.PrimitivesExtensionKt;

@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m7105d2 = {"KEY_VERSION_CODE", "", "KEY_VERSION_CODE_LONG", "toBundle", "Landroid/os/Bundle;", "Lru/rustore/sdk/appupdate/model/AppUpdateParams;", "sdk-public-appupdate_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class AppUpdateParamsKt {

    @NotNull
    private static final String KEY_VERSION_CODE = "VERSION_CODE";

    @NotNull
    private static final String KEY_VERSION_CODE_LONG = "VERSION_CODE_LONG";

    @NotNull
    public static final Bundle toBundle(@NotNull AppUpdateParams appUpdateParams) {
        Intrinsics.checkNotNullParameter(appUpdateParams, "<this>");
        return BundleKt.bundleOf(TuplesKt.m7112to(KEY_VERSION_CODE, Integer.valueOf(PrimitivesExtensionKt.safeToInt(appUpdateParams.getVersionCode()))), TuplesKt.m7112to(KEY_VERSION_CODE_LONG, Long.valueOf(appUpdateParams.getVersionCode())));
    }
}
