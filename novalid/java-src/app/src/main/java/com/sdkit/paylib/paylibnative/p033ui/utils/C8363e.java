package com.sdkit.paylib.paylibnative.p033ui.utils;

import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.e */
/* loaded from: classes5.dex */
public final class C8363e {

    /* renamed from: a */
    public static final C8363e f3667a = new C8363e();

    /* renamed from: com.sdkit.paylib.paylibnative.ui.utils.e$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3668a;

        static {
            int[] iArr = new int[PaymentWay.Type.values().length];
            try {
                iArr[PaymentWay.Type.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentWay.Type.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentWay.Type.NEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentWay.Type.TPAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentWay.Type.SBOLPAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentWay.Type.SBP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3668a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.utils.e$b */
    public static final class b implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ List f3669a;

        public b(List list) {
            this.f3669a = list;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iIndexOf = this.f3669a.indexOf((InterfaceC8419e.a) obj);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            if (iIndexOf == -1) {
                numValueOf = null;
            }
            Integer numValueOf2 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE);
            int iIndexOf2 = this.f3669a.indexOf((InterfaceC8419e.a) obj2);
            Integer numValueOf3 = iIndexOf2 != -1 ? Integer.valueOf(iIndexOf2) : null;
            return ComparisonsKt__ComparisonsKt.compareValues(numValueOf2, Integer.valueOf(numValueOf3 != null ? numValueOf3.intValue() : Integer.MAX_VALUE));
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.utils.e$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
        public c(Object obj) {
            super(1, obj, C8363e.class, "convertWayToWidget", "convertWayToWidget$com_sdkit_assistant_paylib_native(Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentWay$Type;)Lcom/sdkit/paylib/paylibnative/ui/widgets/paymentways/PaymentWaysProvider$PaymentWidgets;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8419e.a invoke(PaymentWay.Type p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8363e.m3433a(p0);
        }
    }

    /* renamed from: a */
    public static final InterfaceC8419e.a m3433a(PaymentWay.Type way) {
        Intrinsics.checkNotNullParameter(way, "way");
        switch (a.f3668a[way.ordinal()]) {
            case 1:
                return InterfaceC8419e.a.CARD;
            case 2:
                return InterfaceC8419e.a.MOBILE;
            case 3:
                return InterfaceC8419e.a.WEBPAY;
            case 4:
                return InterfaceC8419e.a.TBANK;
            case 5:
                return InterfaceC8419e.a.SBOLPAY;
            case 6:
                return InterfaceC8419e.a.BISTRO;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public static final List m3434a(List widgets, List waysOrder) {
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        Intrinsics.checkNotNullParameter(waysOrder, "waysOrder");
        c cVar = new c(f3667a);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(waysOrder, 10));
        Iterator it = waysOrder.iterator();
        while (it.hasNext()) {
            arrayList.add(cVar.invoke(it.next()));
        }
        return CollectionsKt___CollectionsKt.sortedWith(widgets, new b(arrayList));
    }
}
