package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;

@DoNotInline
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, m7105d2 = {"Lio/appmetrica/analytics/impl/sk;", "", "Landroid/content/Context;", "context", "", "Lio/appmetrica/analytics/impl/mk;", "a", SegmentConstantPool.INITSTRING, "()V", "analytics_binaryProdRelease"}, m7106k = 1, m7107mv = {1, 6, 0})
@TargetApi(23)
/* renamed from: io.appmetrica.analytics.impl.sk */
/* loaded from: classes7.dex */
public final class C9861sk {

    /* renamed from: a */
    @NotNull
    public static final C9861sk f9052a = new C9861sk();

    private C9861sk() {
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final List<C9711mk> m6803a(@NotNull Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.sk$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C9861sk.m6804a((SubscriptionManager) obj);
            }
        });
        if (list == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer numM6831a = AndroidUtils.isApiAchieved(29) ? C9886tk.m6831a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer numM6832b = AndroidUtils.isApiAchieved(29) ? C9886tk.m6832b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C9711mk(numM6831a, numM6832b, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final List m6804a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
