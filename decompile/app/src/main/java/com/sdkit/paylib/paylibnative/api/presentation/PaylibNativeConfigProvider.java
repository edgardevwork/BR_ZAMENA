package com.sdkit.paylib.paylibnative.api.presentation;

import com.sdkit.paylib.paylibnative.api.entity.PaylibNativeTheme;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibNativeConfigProvider;", "", "getTheme", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibNativeTheme;", "isSandbox", "", "useThemeIcon", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface PaylibNativeConfigProvider {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static PaylibNativeTheme getTheme(PaylibNativeConfigProvider paylibNativeConfigProvider) {
            return null;
        }

        public static boolean isSandbox(PaylibNativeConfigProvider paylibNativeConfigProvider) {
            return false;
        }

        public static boolean useThemeIcon(PaylibNativeConfigProvider paylibNativeConfigProvider) {
            return false;
        }
    }

    PaylibNativeTheme getTheme();

    boolean isSandbox();

    boolean useThemeIcon();
}
