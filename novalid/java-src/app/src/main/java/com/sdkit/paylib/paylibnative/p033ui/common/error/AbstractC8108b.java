package com.sdkit.paylib.paylibnative.p033ui.common.error;

import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult.EnumC8289c;
import kotlin.NoWhenBranchMatchedException;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.error.b */
/* loaded from: classes8.dex */
public abstract class AbstractC8108b {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.error.b$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1870a;

        static {
            int[] iArr = new int[EnumC8289c.values().length];
            try {
                iArr[EnumC8289c.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8289c.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8289c.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8289c.UNKNOWN_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC8289c.SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1870a = iArr;
        }
    }

    /* renamed from: c */
    public static final int m1924c(EnumC8289c enumC8289c) {
        int i = a.f1870a[enumC8289c.ordinal()];
        if (i == 1) {
            return C11403R.string.paylib_native_payment_cancelled_by_user;
        }
        if (i == 2 || i == 3) {
            return C11403R.string.paylib_native_payment_unknown_error;
        }
        if (i != 4) {
            return -1;
        }
        return C11403R.string.paylib_native_payment_unknown_deeplink;
    }

    /* renamed from: d */
    public static final EnumC8105d m1925d(EnumC8289c enumC8289c) {
        int i = a.f1870a[enumC8289c.ordinal()];
        if (i == 1) {
            return EnumC8105d.CLOSED_BY_USER;
        }
        if (i == 2) {
            return EnumC8105d.UNHANDLED_FORM_ERROR;
        }
        if (i == 3) {
            return EnumC8105d.PAYMENT_TIMEOUT;
        }
        if (i == 4) {
            return EnumC8105d.RESULT_UNKNOWN;
        }
        if (i == 5) {
            return EnumC8105d.SUCCESSFUL_PAYMENT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
