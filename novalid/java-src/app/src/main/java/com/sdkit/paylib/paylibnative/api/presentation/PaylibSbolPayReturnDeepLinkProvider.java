package com.sdkit.paylib.paylibnative.api.presentation;

import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0017¨\u0006\n"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibSbolPayReturnDeepLinkProvider;", "", "isSbolPayDeepLinkSupported", "", "openSbolPayDeepLink", "", "deeplink", "", "provideInitialReturnDeepLink", "provideReturnDeepLink", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface PaylibSbolPayReturnDeepLinkProvider {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static String provideInitialReturnDeepLink(PaylibSbolPayReturnDeepLinkProvider paylibSbolPayReturnDeepLinkProvider) {
            return "";
        }

        @Deprecated(message = "Используйте метод provideInitialReturnDeepLink")
        public static String provideReturnDeepLink(PaylibSbolPayReturnDeepLinkProvider paylibSbolPayReturnDeepLinkProvider) {
            return "";
        }
    }

    boolean isSbolPayDeepLinkSupported();

    void openSbolPayDeepLink(String deeplink);

    String provideInitialReturnDeepLink();

    @Deprecated(message = "Используйте метод provideInitialReturnDeepLink")
    String provideReturnDeepLink();
}
