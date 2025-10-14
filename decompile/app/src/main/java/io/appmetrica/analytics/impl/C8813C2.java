package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;

@DoNotInline
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m7105d2 = {"Lio/appmetrica/analytics/impl/C2;", "", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/impl/e2;", "converter", "Lio/appmetrica/analytics/impl/F2;", "a", SegmentConstantPool.INITSTRING, "()V", "analytics_binaryProdRelease"}, m7106k = 1, m7107mv = {1, 6, 0})
@TargetApi(28)
/* renamed from: io.appmetrica.analytics.impl.C2 */
/* loaded from: classes6.dex */
public final class C8813C2 {

    /* renamed from: a */
    @NotNull
    public static final C8813C2 f6421a = new C8813C2();

    private C8813C2() {
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final C8888F2 m5015a(@NotNull Context context, @NotNull final C9493e2 converter) {
        return new C8888F2((EnumC8863E2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.C2$$ExternalSyntheticLambda2
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C8813C2.m5014a(converter, (UsageStatsManager) obj);
            }
        }), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, ActivityChooserModel.ATTRIBUTE_ACTIVITY, "getting is background restricted", "activityManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.C2$$ExternalSyntheticLambda3
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C8813C2.m5016a((ActivityManager) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final EnumC8863E2 m5014a(C9493e2 c9493e2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c9493e2.getClass();
        if (AndroidUtils.isApiAchieved(28)) {
            if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
                return EnumC8863E2.RESTRICTED;
            }
            if (appStandbyBucket == 10) {
                return EnumC8863E2.ACTIVE;
            }
            if (appStandbyBucket == 20) {
                return EnumC8863E2.WORKING_SET;
            }
            if (appStandbyBucket == 30) {
                return EnumC8863E2.FREQUENT;
            }
            if (appStandbyBucket == 40) {
                return EnumC8863E2.RARE;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final Boolean m5016a(ActivityManager activityManager) {
        return Boolean.valueOf(activityManager.isBackgroundRestricted());
    }
}
