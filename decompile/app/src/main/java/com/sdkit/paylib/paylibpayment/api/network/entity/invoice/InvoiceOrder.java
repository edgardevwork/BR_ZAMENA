package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.blackhub.bronline.game.gui.moduledialog.ModuleDialogKeys;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.ivy.osgi.core.BundleInfo;

@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\be\u0010fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003Jé\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0001J\t\u0010/\u001a\u00020\u0002HÖ\u0001J\t\u00101\u001a\u000200HÖ\u0001J\u0013\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u001f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010 \u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bH\u00108R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bJ\u00108R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u00108R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u00106\u001a\u0004\bN\u00108R\u0019\u0010%\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bO\u0010>\u001a\u0004\bP\u0010@R\u0019\u0010&\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bQ\u0010>\u001a\u0004\bR\u0010@R\u0019\u0010'\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u00106\u001a\u0004\bX\u00108R\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bY\u00106\u001a\u0004\bZ\u00108R\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b[\u00106\u001a\u0004\b\\\u00108R\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b]\u00106\u001a\u0004\b^\u00108R\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b_\u00106\u001a\u0004\b`\u00108R\u001f\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d¨\u0006g"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrder;", "", "", "component1", "component2", "component3", "Ljava/util/Date;", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderTaxSystem;", "component13", "component14", "component15", "component16", "component17", "component18", "", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderBundleItem;", "component19", "orderId", "orderNumber", "purchaseId", "orderDate", "serviceId", "amount", FirebaseAnalytics.Param.CURRENCY, "purpose", "description", "language", "expirationDate", "autocompletionDate", "taxSystem", "tradeName", "orgName", "orgInn", "visualName", "visualAmount", BundleInfo.BUNDLE_TYPE, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "b", "getOrderNumber", "c", "getPurchaseId", "d", "Ljava/util/Date;", "getOrderDate", "()Ljava/util/Date;", "e", "J", "getServiceId", "()J", "f", "getAmount", "g", "getCurrency", "h", "getPurpose", "i", "getDescription", "j", "getLanguage", "k", "getExpirationDate", "l", "getAutocompletionDate", "m", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderTaxSystem;", "getTaxSystem", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderTaxSystem;", "n", "getTradeName", "o", "getOrgName", "p", "getOrgInn", ModuleDialogKeys.PLAYERS_IN_QUEUE_KEY, "getVisualName", "r", "getVisualAmount", "s", "Ljava/util/List;", "getBundle", "()Ljava/util/List;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceOrderTaxSystem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class InvoiceOrder {

    /* renamed from: a, reason: from kotlin metadata */
    public final String orderId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String orderNumber;

    /* renamed from: c, reason: from kotlin metadata */
    public final String purchaseId;

    /* renamed from: d, reason: from kotlin metadata */
    public final Date orderDate;

    /* renamed from: e, reason: from kotlin metadata */
    public final long serviceId;

    /* renamed from: f, reason: from kotlin metadata */
    public final long amount;

    /* renamed from: g, reason: from kotlin metadata */
    public final String currency;

    /* renamed from: h, reason: from kotlin metadata */
    public final String purpose;

    /* renamed from: i, reason: from kotlin metadata */
    public final String description;

    /* renamed from: j, reason: from kotlin metadata */
    public final String language;

    /* renamed from: k, reason: from kotlin metadata */
    public final Date expirationDate;

    /* renamed from: l, reason: from kotlin metadata */
    public final Date autocompletionDate;

    /* renamed from: m, reason: from kotlin metadata */
    public final InvoiceOrderTaxSystem taxSystem;

    /* renamed from: n, reason: from kotlin metadata */
    public final String tradeName;

    /* renamed from: o, reason: from kotlin metadata */
    public final String orgName;

    /* renamed from: p, reason: from kotlin metadata */
    public final String orgInn;

    /* renamed from: q, reason: from kotlin metadata */
    public final String visualName;

    /* renamed from: r, reason: from kotlin metadata */
    public final String visualAmount;

    /* renamed from: s, reason: from kotlin metadata */
    public final List bundle;

    public InvoiceOrder(String orderId, String str, String str2, Date orderDate, long j, long j2, String currency, String str3, String str4, String str5, Date date, Date date2, InvoiceOrderTaxSystem invoiceOrderTaxSystem, String str6, String str7, String str8, String str9, String str10, List<InvoiceOrderBundleItem> list) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderDate, "orderDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.orderId = orderId;
        this.orderNumber = str;
        this.purchaseId = str2;
        this.orderDate = orderDate;
        this.serviceId = j;
        this.amount = j2;
        this.currency = currency;
        this.purpose = str3;
        this.description = str4;
        this.language = str5;
        this.expirationDate = date;
        this.autocompletionDate = date2;
        this.taxSystem = invoiceOrderTaxSystem;
        this.tradeName = str6;
        this.orgName = str7;
        this.orgInn = str8;
        this.visualName = str9;
        this.visualAmount = str10;
        this.bundle = list;
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component11, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component12, reason: from getter */
    public final Date getAutocompletionDate() {
        return this.autocompletionDate;
    }

    /* renamed from: component13, reason: from getter */
    public final InvoiceOrderTaxSystem getTaxSystem() {
        return this.taxSystem;
    }

    /* renamed from: component14, reason: from getter */
    public final String getTradeName() {
        return this.tradeName;
    }

    /* renamed from: component15, reason: from getter */
    public final String getOrgName() {
        return this.orgName;
    }

    /* renamed from: component16, reason: from getter */
    public final String getOrgInn() {
        return this.orgInn;
    }

    /* renamed from: component17, reason: from getter */
    public final String getVisualName() {
        return this.visualName;
    }

    /* renamed from: component18, reason: from getter */
    public final String getVisualAmount() {
        return this.visualAmount;
    }

    public final List<InvoiceOrderBundleItem> component19() {
        return this.bundle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPurchaseId() {
        return this.purchaseId;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getOrderDate() {
        return this.orderDate;
    }

    /* renamed from: component5, reason: from getter */
    public final long getServiceId() {
        return this.serviceId;
    }

    /* renamed from: component6, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPurpose() {
        return this.purpose;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final InvoiceOrder copy(String orderId, String orderNumber, String purchaseId, Date orderDate, long serviceId, long amount, String currency, String purpose, String description, String language, Date expirationDate, Date autocompletionDate, InvoiceOrderTaxSystem taxSystem, String tradeName, String orgName, String orgInn, String visualName, String visualAmount, List<InvoiceOrderBundleItem> bundle) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderDate, "orderDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new InvoiceOrder(orderId, orderNumber, purchaseId, orderDate, serviceId, amount, currency, purpose, description, language, expirationDate, autocompletionDate, taxSystem, tradeName, orgName, orgInn, visualName, visualAmount, bundle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceOrder)) {
            return false;
        }
        InvoiceOrder invoiceOrder = (InvoiceOrder) other;
        return Intrinsics.areEqual(this.orderId, invoiceOrder.orderId) && Intrinsics.areEqual(this.orderNumber, invoiceOrder.orderNumber) && Intrinsics.areEqual(this.purchaseId, invoiceOrder.purchaseId) && Intrinsics.areEqual(this.orderDate, invoiceOrder.orderDate) && this.serviceId == invoiceOrder.serviceId && this.amount == invoiceOrder.amount && Intrinsics.areEqual(this.currency, invoiceOrder.currency) && Intrinsics.areEqual(this.purpose, invoiceOrder.purpose) && Intrinsics.areEqual(this.description, invoiceOrder.description) && Intrinsics.areEqual(this.language, invoiceOrder.language) && Intrinsics.areEqual(this.expirationDate, invoiceOrder.expirationDate) && Intrinsics.areEqual(this.autocompletionDate, invoiceOrder.autocompletionDate) && this.taxSystem == invoiceOrder.taxSystem && Intrinsics.areEqual(this.tradeName, invoiceOrder.tradeName) && Intrinsics.areEqual(this.orgName, invoiceOrder.orgName) && Intrinsics.areEqual(this.orgInn, invoiceOrder.orgInn) && Intrinsics.areEqual(this.visualName, invoiceOrder.visualName) && Intrinsics.areEqual(this.visualAmount, invoiceOrder.visualAmount) && Intrinsics.areEqual(this.bundle, invoiceOrder.bundle);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final Date getAutocompletionDate() {
        return this.autocompletionDate;
    }

    public final List<InvoiceOrderBundleItem> getBundle() {
        return this.bundle;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Date getOrderDate() {
        return this.orderDate;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final String getOrgInn() {
        return this.orgInn;
    }

    public final String getOrgName() {
        return this.orgName;
    }

    public final String getPurchaseId() {
        return this.purchaseId;
    }

    public final String getPurpose() {
        return this.purpose;
    }

    public final long getServiceId() {
        return this.serviceId;
    }

    public final InvoiceOrderTaxSystem getTaxSystem() {
        return this.taxSystem;
    }

    public final String getTradeName() {
        return this.tradeName;
    }

    public final String getVisualAmount() {
        return this.visualAmount;
    }

    public final String getVisualName() {
        return this.visualName;
    }

    public int hashCode() {
        int iHashCode = this.orderId.hashCode() * 31;
        String str = this.orderNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.purchaseId;
        int iM1429a = C8031b.m1429a(this.currency, (Long.hashCode(this.amount) + ((Long.hashCode(this.serviceId) + ((this.orderDate.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31, 31);
        String str3 = this.purpose;
        int iHashCode3 = (iM1429a + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.language;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Date date = this.expirationDate;
        int iHashCode6 = (iHashCode5 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.autocompletionDate;
        int iHashCode7 = (iHashCode6 + (date2 == null ? 0 : date2.hashCode())) * 31;
        InvoiceOrderTaxSystem invoiceOrderTaxSystem = this.taxSystem;
        int iHashCode8 = (iHashCode7 + (invoiceOrderTaxSystem == null ? 0 : invoiceOrderTaxSystem.hashCode())) * 31;
        String str6 = this.tradeName;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.orgName;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.orgInn;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.visualName;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.visualAmount;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List list = this.bundle;
        return iHashCode13 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "InvoiceOrder(orderId=" + this.orderId + ", orderNumber=" + this.orderNumber + ", purchaseId=" + this.purchaseId + ", orderDate=" + this.orderDate + ", serviceId=" + this.serviceId + ", amount=" + this.amount + ", currency=" + this.currency + ", purpose=" + this.purpose + ", description=" + this.description + ", language=" + this.language + ", expirationDate=" + this.expirationDate + ", autocompletionDate=" + this.autocompletionDate + ", taxSystem=" + this.taxSystem + ", tradeName=" + this.tradeName + ", orgName=" + this.orgName + ", orgInn=" + this.orgInn + ", visualName=" + this.visualName + ", visualAmount=" + this.visualAmount + ", bundle=" + this.bundle + ')';
    }
}
