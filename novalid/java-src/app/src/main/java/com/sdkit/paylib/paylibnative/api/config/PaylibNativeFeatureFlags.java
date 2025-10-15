package com.sdkit.paylib.paylibnative.api.config;

import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/config/PaylibNativeFeatureFlags;", "", "isPaylibAddCardFlowWithProfileEnabled", "", "()Ljava/lang/Boolean;", "isPaylibMobileEnabled", "isPaylibSbpAllBanksEnabled", "isPaylibSbpEnabled", "isPaylibTPayEnabled", "isPaylibUseSaveCardFlowEnabled", "isSbolPayEnabled", "isSbolPayInExecutedStatusAvailable", "startExpanded", "getStartExpanded", "useSheetHandle", "getUseSheetHandle", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface PaylibNativeFeatureFlags {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static Boolean getStartExpanded(PaylibNativeFeatureFlags paylibNativeFeatureFlags) {
            return null;
        }

        public static Boolean getUseSheetHandle(PaylibNativeFeatureFlags paylibNativeFeatureFlags) {
            return null;
        }

        public static Boolean isPaylibAddCardFlowWithProfileEnabled(PaylibNativeFeatureFlags paylibNativeFeatureFlags) {
            return null;
        }

        public static Boolean isPaylibMobileEnabled(PaylibNativeFeatureFlags paylibNativeFeatureFlags) {
            return null;
        }

        public static Boolean isPaylibSbpAllBanksEnabled(PaylibNativeFeatureFlags paylibNativeFeatureFlags) {
            return null;
        }

        public static Boolean isPaylibSbpEnabled(PaylibNativeFeatureFlags paylibNativeFeatureFlags) {
            return null;
        }

        public static Boolean isPaylibTPayEnabled(PaylibNativeFeatureFlags paylibNativeFeatureFlags) {
            return null;
        }

        public static Boolean isPaylibUseSaveCardFlowEnabled(PaylibNativeFeatureFlags paylibNativeFeatureFlags) {
            return null;
        }

        public static Boolean isSbolPayEnabled(PaylibNativeFeatureFlags paylibNativeFeatureFlags) {
            return null;
        }

        public static Boolean isSbolPayInExecutedStatusAvailable(PaylibNativeFeatureFlags paylibNativeFeatureFlags) {
            return null;
        }
    }

    Boolean getStartExpanded();

    Boolean getUseSheetHandle();

    Boolean isPaylibAddCardFlowWithProfileEnabled();

    Boolean isPaylibMobileEnabled();

    Boolean isPaylibSbpAllBanksEnabled();

    Boolean isPaylibSbpEnabled();

    Boolean isPaylibTPayEnabled();

    Boolean isPaylibUseSaveCardFlowEnabled();

    Boolean isSbolPayEnabled();

    Boolean isSbolPayInExecutedStatusAvailable();
}
