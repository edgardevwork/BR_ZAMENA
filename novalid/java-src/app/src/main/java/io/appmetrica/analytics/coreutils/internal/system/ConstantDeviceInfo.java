package io.appmetrica.analytics.coreutils.internal.system;

import android.annotation.SuppressLint;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/system/ConstantDeviceInfo;", "", "", "APP_PLATFORM", "Ljava/lang/String;", "MANUFACTURER", "MODEL", "OS_VERSION", "", "OS_API_LEVEL", "I", "DEVICE_ROOT_STATUS", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class ConstantDeviceInfo {

    @NotNull
    public static final String APP_PLATFORM = "android";

    @NotNull
    public static final ConstantDeviceInfo INSTANCE = new ConstantDeviceInfo();

    @JvmField
    @NotNull
    public static final String MANUFACTURER = Build.MANUFACTURER;

    @JvmField
    @NotNull
    public static final String MODEL = Build.MODEL;

    @JvmField
    @NotNull
    public static final String OS_VERSION = Build.VERSION.RELEASE;

    @JvmField
    @SuppressLint({"AnnotateVersionCheck"})
    public static final int OS_API_LEVEL = Build.VERSION.SDK_INT;

    @JvmField
    @NotNull
    public static final String DEVICE_ROOT_STATUS = String.valueOf(RootChecker.isRootedPhone());

    private ConstantDeviceInfo() {
    }
}
