package ru.rustore.sdk.billingclient.impl.analytics;

import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.analytics.PaylibEvent;
import com.sdkit.paylib.paylibnative.api.analytics.PaylibMetric;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import ru.rustore.sdk.billingclient.impl.data.repository.C11474b;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.analytics.l */
/* loaded from: classes7.dex */
public final class C11416l implements CustomPaylibAnalytics {

    /* renamed from: a */
    public final C11405a f10181a;

    /* renamed from: b */
    public final C11414j f10182b;

    public C11416l(C11405a billingAnalytics, C11414j billingAnalyticsEventMapper) {
        Intrinsics.checkNotNullParameter(billingAnalytics, "billingAnalytics");
        Intrinsics.checkNotNullParameter(billingAnalyticsEventMapper, "billingAnalyticsEventMapper");
        this.f10181a = billingAnalytics;
        this.f10182b = billingAnalyticsEventMapper;
    }

    @Override // com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics
    public final void logEvent(PaylibEvent event, PaylibMetric metric) {
        C11413i analyticsEvent;
        C11413i c11413i;
        String name;
        String strValueOf;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(metric, "metric");
        this.f10182b.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(metric, "metric");
        List<PaylibMetric.Param> params = metric.getParams();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(params, 10)), 16));
        for (PaylibMetric.Param param : params) {
            if (param instanceof PaylibMetric.StringParam) {
                name = param.getName();
                strValueOf = ((PaylibMetric.StringParam) param).getValue();
            } else {
                if (!(param instanceof PaylibMetric.IntParam)) {
                    throw new NoWhenBranchMatchedException();
                }
                name = param.getName();
                strValueOf = String.valueOf(((PaylibMetric.IntParam) param).getValue());
            }
            Pair pairM7112to = TuplesKt.m7112to(name, strValueOf);
            linkedHashMap.put(pairM7112to.getFirst(), pairM7112to.getSecond());
        }
        if (event instanceof PaylibEvent.PaylibInvoiceLoadingSuccess) {
            analyticsEvent = new C11413i("PaySheetLoaded", linkedHashMap);
        } else {
            if (event instanceof PaylibEvent.PaySheetPaymentMethodSelect) {
                Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
                mapCreateMapBuilder.putAll(linkedHashMap);
                mapCreateMapBuilder.put("methodType", ((PaylibEvent.PaySheetPaymentMethodSelect) event).getMethodType());
                c11413i = new C11413i("PaySheetPaymentMethodSelect", MapsKt__MapsJVMKt.build(mapCreateMapBuilder));
            } else if (event instanceof PaylibEvent.PaySheetPaymentAgain) {
                analyticsEvent = new C11413i("PaySheetPaymentAgain", linkedHashMap);
            } else if (event instanceof PaylibEvent.PaySheetPaymentMethodSaveAndPay) {
                analyticsEvent = new C11413i("PaySheetPaymentMethodSaveAndPay", linkedHashMap);
            } else if (event instanceof PaylibEvent.PaySheetPaymentMethodShowFull) {
                analyticsEvent = new C11413i("PaySheetPaymentMethodShowFull", linkedHashMap);
            } else if (event instanceof PaylibEvent.PaySheetPaymentProceed) {
                Map mapCreateMapBuilder2 = MapsKt__MapsJVMKt.createMapBuilder();
                mapCreateMapBuilder2.putAll(linkedHashMap);
                PaylibEvent.PaySheetPaymentProceed paySheetPaymentProceed = (PaylibEvent.PaySheetPaymentProceed) event;
                mapCreateMapBuilder2.put("methodType", paySheetPaymentProceed.getMethodType());
                mapCreateMapBuilder2.put("purchaseId", paySheetPaymentProceed.getPurchaseId());
                c11413i = new C11413i("PaySheetPaymentProceed", MapsKt__MapsJVMKt.build(mapCreateMapBuilder2));
            } else if (event instanceof PaylibEvent.PaySheetPaymentSBP) {
                Map mapCreateMapBuilder3 = MapsKt__MapsJVMKt.createMapBuilder();
                mapCreateMapBuilder3.putAll(linkedHashMap);
                PaylibEvent.PaySheetPaymentSBP paySheetPaymentSBP = (PaylibEvent.PaySheetPaymentSBP) event;
                mapCreateMapBuilder3.put("selectedAppBankName", paySheetPaymentSBP.getSelectedAppBankName());
                mapCreateMapBuilder3.put("selectedAppPackageName", paySheetPaymentSBP.getSelectedAppPackageName());
                mapCreateMapBuilder3.put("installedAppsCount", String.valueOf(paySheetPaymentSBP.getInstalledApps().size()));
                c11413i = new C11413i("PaySheetPaymentSBP", MapsKt__MapsJVMKt.build(mapCreateMapBuilder3));
            } else if (event instanceof PaylibEvent.PaySheetAddPhoneNumber) {
                analyticsEvent = new C11413i("PaySheetAddPhoneNumber", linkedHashMap);
            } else if (event instanceof PaylibEvent.PaySheetPhoneNumberConfirmed) {
                analyticsEvent = new C11413i("PaySheetPhoneNumberConfirmed", linkedHashMap);
            } else if (event instanceof PaylibEvent.PaySheetPhoneNumberCodeAgain) {
                analyticsEvent = new C11413i("PaySheetPhoneNumberCodeAgain", linkedHashMap);
            } else if (event instanceof PaylibEvent.PaySheetSaveCardSelected) {
                Map mapCreateMapBuilder4 = MapsKt__MapsJVMKt.createMapBuilder();
                mapCreateMapBuilder4.putAll(linkedHashMap);
                mapCreateMapBuilder4.put("isSaveCardSelected", String.valueOf(((PaylibEvent.PaySheetSaveCardSelected) event).isSaveCardSelected()));
                c11413i = new C11413i("PaySheetSaveCardSelected", MapsKt__MapsJVMKt.build(mapCreateMapBuilder4));
            } else if (event instanceof PaylibEvent.PaySheetPaymentAvailableMethods) {
                Map mapCreateMapBuilder5 = MapsKt__MapsJVMKt.createMapBuilder();
                mapCreateMapBuilder5.putAll(linkedHashMap);
                PaylibEvent.PaySheetPaymentAvailableMethods paySheetPaymentAvailableMethods = (PaylibEvent.PaySheetPaymentAvailableMethods) event;
                mapCreateMapBuilder5.put("paymentMethods", CollectionsKt___CollectionsKt.joinToString$default(paySheetPaymentAvailableMethods.getPaymentMethods(), null, null, null, 0, null, null, 63, null));
                mapCreateMapBuilder5.put("purchaseId", paySheetPaymentAvailableMethods.getPurchaseId());
                c11413i = new C11413i("PaySheetPaymentAvailableMethods", MapsKt__MapsJVMKt.build(mapCreateMapBuilder5));
            } else if (event instanceof PaylibEvent.Other) {
                c11413i = new C11413i(StringsKt__StringsKt.removePrefix(metric.getName(), (CharSequence) "SANDBOX_"), linkedHashMap);
            } else {
                if (!(event instanceof PaylibEvent.PaymentsLoading ? true : event instanceof PaylibEvent.PaymentsPayFailed ? true : event instanceof PaylibEvent.PaymentsPayLoading ? true : event instanceof PaylibEvent.PaymentsPaySucceeded)) {
                    throw new NoWhenBranchMatchedException();
                }
                analyticsEvent = null;
            }
            analyticsEvent = c11413i;
        }
        if (analyticsEvent != null) {
            C11405a c11405a = this.f10181a;
            c11405a.getClass();
            Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
            C11474b c11474b = c11405a.f10160a;
            String eventName = analyticsEvent.getEventName();
            Map mapCreateMapBuilder6 = MapsKt__MapsJVMKt.createMapBuilder();
            mapCreateMapBuilder6.putAll((Map) c11405a.f10167h.getValue());
            mapCreateMapBuilder6.putAll(analyticsEvent.getEventData());
            Unit unit = Unit.INSTANCE;
            SingleSubscribeKt.subscribe$default(c11474b.m7454a(new C11413i(eventName, MapsKt__MapsJVMKt.build(mapCreateMapBuilder6)), c11405a.m7440a()), null, C11406b.f10170a, 1, null);
        }
    }
}
