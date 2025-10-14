package com.sdkit.paylib.paylibnative.p033ui.utils;

import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.f */
/* loaded from: classes6.dex */
public abstract class AbstractC8371f {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.utils.f$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3677a;

        static {
            int[] iArr = new int[InterfaceC8419e.a.values().length];
            try {
                iArr[InterfaceC8419e.a.BISTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC8419e.a.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC8419e.a.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterfaceC8419e.a.SBOLPAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InterfaceC8419e.a.TBANK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InterfaceC8419e.a.WEBPAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3677a = iArr;
        }
    }

    /* renamed from: a */
    public static final String m3472a(InterfaceC8419e.a aVar) {
        switch (a.f3677a[aVar.ordinal()]) {
            case 1:
                return "bistro";
            case 2:
                return "card";
            case 3:
                return "mobile";
            case 4:
                return "sbolpay";
            case 5:
                return "tbank_p";
            case 6:
                return "new";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public static final List m3473a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m3472a((InterfaceC8419e.a) it.next()));
        }
        return arrayList;
    }
}
