package com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects;

import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.common.view.C8127a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8301d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.viewobjects.f */
/* loaded from: classes5.dex */
public final class C8303f {

    /* renamed from: a */
    public final InterfaceC8131b f3168a;

    /* renamed from: b */
    public final InterfaceC8412a f3169b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.viewobjects.f$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3170a;

        static {
            int[] iArr = new int[InterfaceC8419e.a.values().length];
            try {
                iArr[InterfaceC8419e.a.SBOLPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC8419e.a.BISTRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC8419e.a.TBANK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterfaceC8419e.a.WEBPAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InterfaceC8419e.a.MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InterfaceC8419e.a.CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3170a = iArr;
        }
    }

    public C8303f(InterfaceC8131b config, InterfaceC8412a paymentWaySelector) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(paymentWaySelector, "paymentWaySelector");
        this.f3168a = config;
        this.f3169b = paymentWaySelector;
    }

    /* renamed from: a */
    public final C8301d.a m2914a(AbstractC8128b paymentAction) {
        C8127a c8127a;
        Intrinsics.checkNotNullParameter(paymentAction, "paymentAction");
        InterfaceC8419e.a aVar = (InterfaceC8419e.a) this.f3169b.mo3643a().getValue();
        if (aVar == null) {
            return null;
        }
        int[] iArr = a.f3170a;
        switch (iArr[aVar.ordinal()]) {
            case 1:
            case 2:
                paymentAction = new AbstractC8128b.f(C11403R.string.paylib_native_pay_with);
                break;
            case 3:
                paymentAction = new AbstractC8128b.f(C11403R.string.paylib_native_pay_with_tbank);
                break;
            case 4:
                if (this.f3168a.isPaylibAddCardFlowWithProfileEnabled()) {
                    paymentAction = AbstractC8128b.b.f1933a;
                    break;
                }
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[aVar.ordinal()]) {
            case 1:
                c8127a = new C8127a(C11403R.color.paylib_design_color_solid_brand_dark, C11403R.attr.paylib_native_button_text_primary_color, new C8127a.b(C11403R.attr.paylib_native_sbolpay_payment_icon, Integer.valueOf(C11403R.string.paylib_native_sbolpay_info_icon_announcement)));
                break;
            case 2:
                c8127a = new C8127a(C11403R.attr.paylib_native_button_bistro_background_color, C11403R.attr.paylib_native_button_bistro_foreground_color, new C8127a.b(C11403R.drawable.paylib_native_ic_sbp_bistro_btn, Integer.valueOf(C11403R.string.paylib_native_bistro_info_icon_announcement)));
                break;
            case 3:
                c8127a = new C8127a(C11403R.attr.paylib_native_button_tbank_background_color, C11403R.attr.paylib_native_button_tbank_foreground_color, new C8127a.b(C11403R.drawable.paylib_native_ic_tbank_btn, Integer.valueOf(C11403R.string.paylib_native_tbank_info_icon_announcement)));
                break;
            case 4:
            case 5:
            case 6:
                c8127a = C8127a.f1924d.m1971a();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new C8301d.a(paymentAction, c8127a);
    }
}
