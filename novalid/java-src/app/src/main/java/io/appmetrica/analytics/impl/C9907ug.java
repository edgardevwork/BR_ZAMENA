package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* renamed from: io.appmetrica.analytics.impl.ug */
/* loaded from: classes5.dex */
public final class C9907ug implements IParamsAppender {

    /* renamed from: a */
    public final AdvIdWithLimitedAppender f9185a;

    /* renamed from: b */
    public final NetworkTaskForSendingDataParamsAppender f9186b;

    /* renamed from: c */
    public C9723n7 f9187c;

    /* renamed from: d */
    public long f9188d;

    public C9907ug(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter));
    }

    /* renamed from: a */
    public final void m6862a(@NonNull C9723n7 c9723n7) {
        this.f9187c = c9723n7;
    }

    public C9907ug(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender) {
        this.f9185a = advIdWithLimitedAppender;
        this.f9186b = networkTaskForSendingDataParamsAppender;
    }

    /* renamed from: a */
    public final void m6860a(long j) {
        this.f9188d = j;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C8902Fg c8902Fg) {
        builder.path("report");
        this.f9186b.appendEncryptedData(builder);
        C9723n7 c9723n7 = this.f9187c;
        if (c9723n7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c9723n7.f8703a, c8902Fg.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f9187c.f8704b, c8902Fg.getUuid()));
            m6859a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f9187c.f8705c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f9187c.f8708f, c8902Fg.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f9187c.f8710h, c8902Fg.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f9187c.f8711i, c8902Fg.getOsVersion()));
            m6859a(builder, CommonUrlParts.OS_API_LEVEL, this.f9187c.f8712j);
            m6859a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f9187c.f8706d);
            m6859a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f9187c.f8707e);
            m6859a(builder, "app_debuggable", this.f9187c.f8709g);
            builder.appendQueryParameter("locale", StringUtils.ifIsEmptyToDef(this.f9187c.f8713k, c8902Fg.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f9187c.f8714l, c8902Fg.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f9187c.f8715m, c8902Fg.getAppFramework()));
            m6859a(builder, "attribution_id", this.f9187c.f8716n);
        }
        builder.appendQueryParameter("api_key_128", c8902Fg.f6609n);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c8902Fg.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c8902Fg.getAppPlatform());
        builder.appendQueryParameter("model", c8902Fg.getModel());
        builder.appendQueryParameter("manufacturer", c8902Fg.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c8902Fg.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c8902Fg.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c8902Fg.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c8902Fg.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c8902Fg.getDeviceType());
        m6859a(builder, "clids_set", (String) WrapUtils.getOrDefault(c8902Fg.f6612q, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c8902Fg.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c8902Fg.getAppSetIdScope());
        this.f9185a.appendParams(builder, c8902Fg.getAdvertisingIdsHolder());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f9188d));
    }

    /* renamed from: a */
    public static void m6859a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
