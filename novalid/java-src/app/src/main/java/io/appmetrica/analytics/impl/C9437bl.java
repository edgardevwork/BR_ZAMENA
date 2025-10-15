package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.bl */
/* loaded from: classes8.dex */
public final class C9437bl implements IParamsAppender {

    /* renamed from: a */
    public final C8824Cd f7799a;

    /* renamed from: b */
    public final InterfaceC9235Tc f7800b;

    public C9437bl(@NonNull C8824Cd c8824Cd, @NonNull InterfaceC9235Tc interfaceC9235Tc) {
        this.f7799a = c8824Cd;
        this.f7800b = interfaceC9235Tc;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C9537fl c9537fl) {
        C8901Ff c8901Ff;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.DEVICE_ID), c9537fl.getDeviceId());
        m5923a(builder, C9676la.f8552C.m6370f(), c9537fl);
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.APP_SET_ID), c9537fl.getAppSetId());
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.APP_SET_ID_SCOPE), c9537fl.getAppSetIdScope());
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.APP_PLATFORM), c9537fl.getAppPlatform());
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.PROTOCOL_VERSION), c9537fl.getProtocolVersion());
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c9537fl.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f7799a.m5028a("model"), c9537fl.getModel());
        builder.appendQueryParameter(this.f7799a.m5028a("manufacturer"), c9537fl.getManufacturer());
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.OS_VERSION), c9537fl.getOsVersion());
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c9537fl.getScreenWidth()));
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c9537fl.getScreenHeight()));
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.SCREEN_DPI), String.valueOf(c9537fl.getScreenDpi()));
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c9537fl.getScaleFactor()));
        builder.appendQueryParameter(this.f7799a.m5028a("locale"), c9537fl.getLocale());
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.DEVICE_TYPE), c9537fl.getDeviceType());
        builder.appendQueryParameter(this.f7799a.m5028a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f7799a.m5028a("query_hosts"), String.valueOf(2));
        String strM5028a = this.f7799a.m5028a("features");
        List<String> listMo4995g = ((C8855Dj) this.f7800b).mo4995g();
        String[] strArr = {this.f7799a.m5028a("permissions_collecting"), this.f7799a.m5028a("features_collecting"), this.f7799a.m5028a("google_aid"), this.f7799a.m5028a("huawei_oaid"), this.f7799a.m5028a("sim_info"), this.f7799a.m5028a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(listMo4995g);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(strM5028a, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.APP_ID), c9537fl.getPackageName());
        builder.appendQueryParameter(this.f7799a.m5028a("app_debuggable"), ((C9204S5) c9537fl).f7231a);
        if (c9537fl.f8144l) {
            String str = c9537fl.f8145m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f7799a.m5028a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f7799a.m5028a("detect_locale"), String.valueOf(1));
        }
        C8987J3 c8987j3 = c9537fl.f8141i;
        if (!AbstractC9664kn.m6345a(c8987j3.f6805a)) {
            builder.appendQueryParameter(this.f7799a.m5028a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f7799a.m5028a("clids_set"), AbstractC9029Kl.m5334a(c8987j3.f6805a));
            int iOrdinal = c8987j3.f6806b.ordinal();
            builder.appendQueryParameter(this.f7799a.m5028a("clids_set_source"), iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c9537fl.f8138f;
            String str3 = c9537fl.f8139g;
            if (TextUtils.isEmpty(str2) && (c8901Ff = c9537fl.f8147o.f6470b) != null) {
                str2 = c8901Ff.f6595a;
                str3 = c8901Ff.f6598d.f6552a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f7799a.m5028a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f7799a.m5028a("install_referrer_source"), str3);
            }
        }
        String uuid = c9537fl.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f7799a.m5028a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f7799a.m5028a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f7799a.m5028a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f7799a.m5028a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f7799a.m5028a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f7799a.m5028a("app_system_flag"), ((C9204S5) c9537fl).f7232b);
        builder.appendQueryParameter(this.f7799a.m5028a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f7799a.m5028a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f7799a.m5028a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f7799a.m5028a("external_attribution"), String.valueOf(1));
        Map<String, Integer> mapMo4991c = ((C8855Dj) this.f7800b).mo4991c();
        for (String str4 : mapMo4991c.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(mapMo4991c.get(str4)));
        }
    }

    /* renamed from: a */
    public final void m5923a(@NonNull Uri.Builder builder, @NonNull DataSendingRestrictionController dataSendingRestrictionController, @NonNull C9537fl c9537fl) {
        AdvertisingIdsHolder advertisingIdsHolder = c9537fl.getAdvertisingIdsHolder();
        if (advertisingIdsHolder != null && !dataSendingRestrictionController.isRestrictedForReporter()) {
            AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f7799a.m5028a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
