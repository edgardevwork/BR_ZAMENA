package com.sdkit.paylib.paylibpayment.impl.domain.network.invoice;

import com.blackhub.bronline.game.gui.fractions.Const;
import com.sdkit.paylib.paylibpayment.impl.domain.network.model.AbstractC8559b;
import com.sdkit.paylib.paylibpayment.impl.domain.network.model.C8558a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.utils.AbstractC8585b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.d */
/* loaded from: classes8.dex */
public final class C8552d {

    /* renamed from: b */
    public static final a f5016b = new a(null);

    /* renamed from: c */
    public static final Regex f5017c = new Regex("^[0-9]{4}$");

    /* renamed from: a */
    public final SimpleDateFormat f5018a = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.d$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String m4127a(int i, int i2, ClosedRange closedRange, List list, IntRange intRange, String str, String str2) {
        if (str != null && !f5017c.matches(str)) {
            throw new IllegalArgumentException("Masked PAN should contain exactly 4 digits.".toString());
        }
        return "smartpay/v1/invoices/?" + AbstractC8585b.m4649b(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Pair[]{TuplesKt.m7112to(Const.PAGE_KEY, String.valueOf(i)), TuplesKt.m7112to("size", String.valueOf(i2)), closedRange != null ? TuplesKt.m7112to("date_from", this.f5018a.format((Date) closedRange.getStart())) : null, closedRange != null ? TuplesKt.m7112to("date_to", this.f5018a.format((Date) closedRange.getEndInclusive())) : null, list != null ? TuplesKt.m7112to("invoice_status", CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null)) : null, intRange != null ? TuplesKt.m7112to("amount_from", String.valueOf(intRange.getFirst())) : null, intRange != null ? TuplesKt.m7112to("amount_to", String.valueOf(intRange.getLast())) : null, str != null ? TuplesKt.m7112to("masked_pan", str) : null, str2 != null ? TuplesKt.m7112to("order_num", str2) : null}));
    }

    /* renamed from: b */
    public final String m4132b(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        return "smartpay/v1/invoices/" + invoiceId;
    }

    /* renamed from: c */
    public final String m4133c(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        return "smartpay/v1/invoices/" + invoiceId + "/verify";
    }

    /* renamed from: d */
    public final String m4134d(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        return "smartpay/v1/invoices/" + invoiceId + "/verify";
    }

    /* renamed from: a */
    public final String m4128a(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        return "smartpay/v1/invoices/" + invoiceId;
    }

    /* renamed from: a */
    public final String m4129a(String invoiceId, C8558a deviceInfo) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return "smartpay/v1/invoices/" + invoiceId + "?receipt_info=true&" + AbstractC8585b.m4649b(AbstractC8559b.m4155b(deviceInfo));
    }

    /* renamed from: a */
    public final String m4130a(String invoiceId, C8558a deviceInfo, long j) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return "smartpay/v1/invoices/" + invoiceId + '?' + AbstractC8585b.m4649b(AbstractC8559b.m4155b(deviceInfo)) + '&' + ("all_info=true&time_to_get_ext_info=" + j);
    }

    /* renamed from: a */
    public final String m4131a(String invoiceId, String invoiceStatus, C8558a deviceInfo, long j) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(invoiceStatus, "invoiceStatus");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return "smartpay/v1/invoices/" + invoiceId + '?' + AbstractC8585b.m4649b(AbstractC8559b.m4155b(deviceInfo)) + '&' + ("inv_status=" + invoiceStatus + "&wait=" + j);
    }
}
