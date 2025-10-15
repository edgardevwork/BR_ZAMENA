package com.sdkit.paylib.paylibpayment.impl.domain.network.utils;

import com.sdkit.paylib.paylibpayment.api.network.entity.products.SubscriptionPeriod;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.SubscriptionPeriodParsingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.utils.c */
/* loaded from: classes5.dex */
public final class C8586c {

    /* renamed from: a */
    public static final C8586c f5787a = new C8586c();

    /* renamed from: a */
    public final boolean m4652a(String str) {
        return (str == null || str.length() == 0 || str.length() == 1) ? false : true;
    }

    /* renamed from: b */
    public final SubscriptionPeriod m4653b(String source) throws SubscriptionPeriodParsingException {
        String strGroup;
        String strGroup2;
        String strGroup3;
        Intrinsics.checkNotNullParameter(source, "source");
        Matcher matcher = Pattern.compile("([+-]?)P(?:([+-]?[0-9]+)Y)?(?:([+-]?[0-9]+)M)?(?:([+-]?[0-9]+)W)?(?:([+-]?[0-9]+)D)?(T(?:([+-]?[0-9]+)H)?(?:([+-]?[0-9]+)M)?(?:([+-]?[0-9]+)S)?)?", 2).matcher(source);
        try {
            if (!matcher.matches()) {
                throw new SubscriptionPeriodParsingException("Cannot parse to SubscriptionPeriod: +" + this);
            }
            String strGroup4 = matcher.group(6);
            String strGroup5 = matcher.group(2);
            if ((strGroup5 != null && strGroup5.length() != 0) || (((strGroup = matcher.group(3)) != null && strGroup.length() != 0) || (((strGroup2 = matcher.group(4)) != null && strGroup2.length() != 0) || ((strGroup3 = matcher.group(5)) != null && strGroup3.length() != 0)))) {
                int i = Intrinsics.areEqual(matcher.group(1), "-") ? -1 : 1;
                String strGroup6 = matcher.group(4);
                int i2 = strGroup6 != null ? Integer.parseInt(strGroup6) * i : 0;
                String strGroup7 = matcher.group(5);
                int i3 = strGroup7 != null ? Integer.parseInt(strGroup7) * i : 0;
                String strGroup8 = matcher.group(2);
                int i4 = strGroup8 != null ? Integer.parseInt(strGroup8) * i : 0;
                String strGroup9 = matcher.group(3);
                return new SubscriptionPeriod(i4, strGroup9 != null ? Integer.parseInt(strGroup9) * i : 0, (i2 * 7) + i3);
            }
            if (m4652a(strGroup4)) {
                return new SubscriptionPeriod(0, 0, 0);
            }
            throw new SubscriptionPeriodParsingException("Cannot parse to SubscriptionPeriod: +" + this);
        } catch (NumberFormatException unused) {
            throw new SubscriptionPeriodParsingException("Cannot parse to SubscriptionPeriod: +" + this);
        }
    }
}
