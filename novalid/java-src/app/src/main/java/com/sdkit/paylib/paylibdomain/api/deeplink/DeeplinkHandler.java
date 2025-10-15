package com.sdkit.paylib.paylibdomain.api.deeplink;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/deeplink/DeeplinkHandler;", "", "openDeeplink", "", "deeplink", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "provideInitialReturnDeepLink", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface DeeplinkHandler {
    boolean openDeeplink(String deeplink, String packageName);

    String provideInitialReturnDeepLink();
}
