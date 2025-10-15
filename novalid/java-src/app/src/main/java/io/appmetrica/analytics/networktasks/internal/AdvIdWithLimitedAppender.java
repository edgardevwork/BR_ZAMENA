package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes5.dex */
public class AdvIdWithLimitedAppender implements IParamsAppender<AdvertisingIdsHolder> {
    /* renamed from: a */
    private static void m7057a(Uri.Builder builder, String str, String str2, AdTrackingInfo adTrackingInfo) {
        if (adTrackingInfo == null) {
            builder.appendQueryParameter(str, "");
            builder.appendQueryParameter(str2, "");
        } else {
            builder.appendQueryParameter(str, StringUtils.emptyIfNull(adTrackingInfo.advId));
            Boolean bool = adTrackingInfo.limitedAdTracking;
            builder.appendQueryParameter(str2, bool != null ? bool.booleanValue() ? "1" : "0" : "");
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    public void appendParams(@NonNull Uri.Builder builder, @Nullable AdvertisingIdsHolder advertisingIdsHolder) {
        m7057a(builder, CommonUrlParts.ADV_ID, CommonUrlParts.LIMIT_AD_TRACKING, advertisingIdsHolder == null ? null : advertisingIdsHolder.getGoogle().mAdTrackingInfo);
        m7057a(builder, CommonUrlParts.HUAWEI_OAID, CommonUrlParts.HUAWEI_OAID_LIMIT_TRACKING, advertisingIdsHolder == null ? null : advertisingIdsHolder.getHuawei().mAdTrackingInfo);
        m7057a(builder, CommonUrlParts.YANDEX_ADV_ID, CommonUrlParts.YANDEX_ADV_ID_LIMIT_TRACKING, advertisingIdsHolder != null ? advertisingIdsHolder.getYandex().mAdTrackingInfo : null);
    }
}
