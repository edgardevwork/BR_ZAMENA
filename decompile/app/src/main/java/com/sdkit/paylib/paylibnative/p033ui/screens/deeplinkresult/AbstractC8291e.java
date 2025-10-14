package com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SbolPayFinishState;
import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatus;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.e */
/* loaded from: classes5.dex */
public abstract class AbstractC8291e {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.e$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3027a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3028b;

        static {
            int[] iArr = new int[SbolPayFinishState.values().length];
            try {
                iArr[SbolPayFinishState.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SbolPayFinishState.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SbolPayFinishState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SbolPayFinishState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SbolPayFinishState.INCORRECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3027a = iArr;
            int[] iArr2 = new int[PaymentStatus.values().length];
            try {
                iArr2[PaymentStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PaymentStatus.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PaymentStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PaymentStatus.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f3028b = iArr2;
        }
    }

    /* renamed from: b */
    public static final EnumC8289c m2778b(SbolPayFinishState sbolPayFinishState) {
        int i = a.f3027a[sbolPayFinishState.ordinal()];
        if (i == 1) {
            return EnumC8289c.SUCCESS;
        }
        if (i == 2) {
            return EnumC8289c.CANCEL;
        }
        if (i == 3) {
            return EnumC8289c.FAILED;
        }
        if (i == 4 || i == 5) {
            return EnumC8289c.UNKNOWN_LINK;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static final EnumC8289c m2779b(PaymentStatus paymentStatus) {
        int i = a.f3028b[paymentStatus.ordinal()];
        if (i == 1) {
            return EnumC8289c.SUCCESS;
        }
        if (i == 2) {
            return EnumC8289c.CANCEL;
        }
        if (i == 3) {
            return EnumC8289c.FAILED;
        }
        if (i == 4) {
            return EnumC8289c.TIMEOUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
