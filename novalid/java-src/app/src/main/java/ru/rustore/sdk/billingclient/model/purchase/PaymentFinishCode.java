package ru.rustore.sdk.billingclient.model.purchase;

import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/PaymentFinishCode;", "", "(Ljava/lang/String;I)V", "isClosedByUser", "", "isClosedByUser$sdk_public_billingclient_release", "isErrorCode", "isErrorCode$sdk_public_billingclient_release", "isSuccessfulPayment", "isSuccessfulPayment$sdk_public_billingclient_release", "SUCCESSFUL_PAYMENT", "CLOSED_BY_USER", "UNHANDLED_FORM_ERROR", "PAYMENT_TIMEOUT", "DECLINED_BY_SERVER", "RESULT_UNKNOWN", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public enum PaymentFinishCode {
    SUCCESSFUL_PAYMENT,
    CLOSED_BY_USER,
    UNHANDLED_FORM_ERROR,
    PAYMENT_TIMEOUT,
    DECLINED_BY_SERVER,
    RESULT_UNKNOWN;

    @Metadata(m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentFinishCode.values().length];
            try {
                iArr[PaymentFinishCode.UNHANDLED_FORM_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentFinishCode.PAYMENT_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentFinishCode.DECLINED_BY_SERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentFinishCode.RESULT_UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean isClosedByUser$sdk_public_billingclient_release() {
        return this == CLOSED_BY_USER;
    }

    public final boolean isErrorCode$sdk_public_billingclient_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final boolean isSuccessfulPayment$sdk_public_billingclient_release() {
        return this == SUCCESSFUL_PAYMENT;
    }
}
