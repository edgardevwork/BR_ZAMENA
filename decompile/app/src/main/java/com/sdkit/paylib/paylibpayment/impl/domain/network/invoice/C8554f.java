package com.sdkit.paylib.paylibpayment.impl.domain.network.invoice;

import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentMethod;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentOperation;
import com.sdkit.paylib.paylibpayment.impl.domain.config.InterfaceC8504a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.model.AbstractC8559b;
import com.sdkit.paylib.paylibpayment.impl.domain.network.model.C8558a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.AbstractC8570a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.PaymentOperationJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.PaymentOperationTypeJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.PaymentRequestJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.PaymentUserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializersKt;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.f */
/* loaded from: classes8.dex */
public final class C8554f {

    /* renamed from: a */
    public final InterfaceC8504a f5020a;

    /* renamed from: b */
    public final InterfaceC8556a f5021b;

    public C8554f(InterfaceC8504a internalConfig, InterfaceC8556a json) {
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f5020a = internalConfig;
        this.f5021b = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m4139a(PaymentMethod paymentMethod, C8558a deviceInfo) {
        PaymentOperationJson paymentOperationJson;
        List list;
        List listM4140a;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        InterfaceC8504a interfaceC8504a = this.f5020a;
        String strMo3943b = interfaceC8504a.mo3943b();
        if (!interfaceC8504a.mo3944c()) {
            strMo3943b = null;
        }
        PaymentUserId paymentUserId = strMo3943b != null ? new PaymentUserId(strMo3943b) : null;
        Map mapM4154a = AbstractC8559b.m4154a(deviceInfo);
        if (paymentMethod instanceof PaymentMethod.ByCard) {
            paymentOperationJson = new PaymentOperationJson(PaymentOperationTypeJson.PAYMENT, "card", ((PaymentMethod.ByCard) paymentMethod).getCardId());
        } else if (paymentMethod instanceof PaymentMethod.ViaSbolPayLink) {
            paymentOperationJson = new PaymentOperationJson(PaymentOperationTypeJson.PAYMENT, "app2sbol", "0");
        } else {
            if (paymentMethod instanceof PaymentMethod.Web) {
                listM4140a = m4140a(((PaymentMethod.Web) paymentMethod).isCardShouldBeSaved());
                list = listM4140a;
                PaymentMethod.ViaSbolPayLink viaSbolPayLink = paymentMethod instanceof PaymentMethod.ViaSbolPayLink ? (PaymentMethod.ViaSbolPayLink) paymentMethod : null;
                String returnDeepLink = viaSbolPayLink != null ? viaSbolPayLink.getReturnDeepLink() : null;
                PaymentMethod.Sbp sbp = paymentMethod instanceof PaymentMethod.Sbp ? (PaymentMethod.Sbp) paymentMethod : null;
                String deeplink = sbp != null ? sbp.getDeeplink() : null;
                boolean z = paymentMethod instanceof PaymentMethod.TPay;
                PaymentMethod.TPay tPay = z ? (PaymentMethod.TPay) paymentMethod : null;
                String successUrl = tPay != null ? tPay.getSuccessUrl() : null;
                PaymentMethod.TPay tPay2 = z ? (PaymentMethod.TPay) paymentMethod : null;
                PaymentRequestJson paymentRequestJson = new PaymentRequestJson(paymentUserId, mapM4154a, list, returnDeepLink, deeplink, successUrl, tPay2 != null ? tPay2.getFailUrl() : null);
                InterfaceC8556a interfaceC8556a = this.f5021b;
                return interfaceC8556a.encodeToString(SerializersKt.serializer(interfaceC8556a.getSerializersModule(), Reflection.typeOf(PaymentRequestJson.class)), paymentRequestJson);
            }
            if (paymentMethod instanceof PaymentMethod.WithLoyalty) {
                List<PaymentOperation> operations = ((PaymentMethod.WithLoyalty) paymentMethod).getOperations();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(operations, 10));
                Iterator<T> it = operations.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC8570a.m4229a((PaymentOperation) it.next()));
                }
                list = arrayList;
                if (paymentMethod instanceof PaymentMethod.ViaSbolPayLink) {
                }
                if (viaSbolPayLink != null) {
                }
                if (paymentMethod instanceof PaymentMethod.Sbp) {
                }
                if (sbp != null) {
                }
                boolean z2 = paymentMethod instanceof PaymentMethod.TPay;
                if (z2) {
                }
                if (tPay != null) {
                }
                if (z2) {
                }
                PaymentRequestJson paymentRequestJson2 = new PaymentRequestJson(paymentUserId, mapM4154a, list, returnDeepLink, deeplink, successUrl, tPay2 != null ? tPay2.getFailUrl() : null);
                InterfaceC8556a interfaceC8556a2 = this.f5021b;
                return interfaceC8556a2.encodeToString(SerializersKt.serializer(interfaceC8556a2.getSerializersModule(), Reflection.typeOf(PaymentRequestJson.class)), paymentRequestJson2);
            }
            if (paymentMethod instanceof PaymentMethod.Sbp) {
                paymentOperationJson = new PaymentOperationJson(PaymentOperationTypeJson.PAYMENT, "sbp", "0");
            } else if (paymentMethod instanceof PaymentMethod.Mobile) {
                paymentOperationJson = new PaymentOperationJson(PaymentOperationTypeJson.PAYMENT, "mobile_b", ((PaymentMethod.Mobile) paymentMethod).getPhoneNumber());
            } else {
                if (!(paymentMethod instanceof PaymentMethod.TPay)) {
                    throw new NoWhenBranchMatchedException();
                }
                paymentOperationJson = new PaymentOperationJson(PaymentOperationTypeJson.PAYMENT, "tinkoff_p", "0");
            }
        }
        listM4140a = CollectionsKt__CollectionsJVMKt.listOf(paymentOperationJson);
        list = listM4140a;
        if (paymentMethod instanceof PaymentMethod.ViaSbolPayLink) {
        }
        if (viaSbolPayLink != null) {
        }
        if (paymentMethod instanceof PaymentMethod.Sbp) {
        }
        if (sbp != null) {
        }
        boolean z22 = paymentMethod instanceof PaymentMethod.TPay;
        if (z22) {
        }
        if (tPay != null) {
        }
        if (z22) {
        }
        PaymentRequestJson paymentRequestJson22 = new PaymentRequestJson(paymentUserId, mapM4154a, list, returnDeepLink, deeplink, successUrl, tPay2 != null ? tPay2.getFailUrl() : null);
        InterfaceC8556a interfaceC8556a22 = this.f5021b;
        return interfaceC8556a22.encodeToString(SerializersKt.serializer(interfaceC8556a22.getSerializersModule(), Reflection.typeOf(PaymentRequestJson.class)), paymentRequestJson22);
    }

    /* renamed from: a */
    public final List m4140a(boolean z) {
        List listListOf = CollectionsKt__CollectionsJVMKt.listOf(new PaymentOperationJson(PaymentOperationTypeJson.PAYMENT, "new", "0"));
        return z ? CollectionsKt___CollectionsKt.plus((Collection<? extends PaymentOperationJson>) listListOf, new PaymentOperationJson(PaymentOperationTypeJson.BINDING, "add", "0")) : listListOf;
    }
}
