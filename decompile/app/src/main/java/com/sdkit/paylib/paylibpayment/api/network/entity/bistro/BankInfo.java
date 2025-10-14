package com.sdkit.paylib.paylibpayment.api.network.entity.bistro;

import android.net.Uri;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016¨\u0006!"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/bistro/BankInfo;", "", "", "component1", "Landroid/net/Uri;", "component2", "component3", "component4", "bankName", "bankLogoUrl", "bankSchema", "bankPackageName", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getBankName", "()Ljava/lang/String;", "b", "Landroid/net/Uri;", "getBankLogoUrl", "()Landroid/net/Uri;", "c", "getBankSchema", "d", "getBankPackageName", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class BankInfo {

    /* renamed from: a, reason: from kotlin metadata */
    public final String bankName;

    /* renamed from: b, reason: from kotlin metadata */
    public final Uri bankLogoUrl;

    /* renamed from: c, reason: from kotlin metadata */
    public final String bankSchema;

    /* renamed from: d, reason: from kotlin metadata */
    public final String bankPackageName;

    public BankInfo(String bankName, Uri bankLogoUrl, String bankSchema, String bankPackageName) {
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(bankLogoUrl, "bankLogoUrl");
        Intrinsics.checkNotNullParameter(bankSchema, "bankSchema");
        Intrinsics.checkNotNullParameter(bankPackageName, "bankPackageName");
        this.bankName = bankName;
        this.bankLogoUrl = bankLogoUrl;
        this.bankSchema = bankSchema;
        this.bankPackageName = bankPackageName;
    }

    public static /* synthetic */ BankInfo copy$default(BankInfo bankInfo, String str, Uri uri, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankInfo.bankName;
        }
        if ((i & 2) != 0) {
            uri = bankInfo.bankLogoUrl;
        }
        if ((i & 4) != 0) {
            str2 = bankInfo.bankSchema;
        }
        if ((i & 8) != 0) {
            str3 = bankInfo.bankPackageName;
        }
        return bankInfo.copy(str, uri, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getBankLogoUrl() {
        return this.bankLogoUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBankSchema() {
        return this.bankSchema;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBankPackageName() {
        return this.bankPackageName;
    }

    public final BankInfo copy(String bankName, Uri bankLogoUrl, String bankSchema, String bankPackageName) {
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(bankLogoUrl, "bankLogoUrl");
        Intrinsics.checkNotNullParameter(bankSchema, "bankSchema");
        Intrinsics.checkNotNullParameter(bankPackageName, "bankPackageName");
        return new BankInfo(bankName, bankLogoUrl, bankSchema, bankPackageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankInfo)) {
            return false;
        }
        BankInfo bankInfo = (BankInfo) other;
        return Intrinsics.areEqual(this.bankName, bankInfo.bankName) && Intrinsics.areEqual(this.bankLogoUrl, bankInfo.bankLogoUrl) && Intrinsics.areEqual(this.bankSchema, bankInfo.bankSchema) && Intrinsics.areEqual(this.bankPackageName, bankInfo.bankPackageName);
    }

    public final Uri getBankLogoUrl() {
        return this.bankLogoUrl;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getBankPackageName() {
        return this.bankPackageName;
    }

    public final String getBankSchema() {
        return this.bankSchema;
    }

    public int hashCode() {
        return this.bankPackageName.hashCode() + C8031b.m1429a(this.bankSchema, (this.bankLogoUrl.hashCode() + (this.bankName.hashCode() * 31)) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BankInfo(bankName=");
        sb.append(this.bankName);
        sb.append(", bankLogoUrl=");
        sb.append(this.bankLogoUrl);
        sb.append(", bankSchema=");
        sb.append(this.bankSchema);
        sb.append(", bankPackageName=");
        return C8032c.m1430a(sb, this.bankPackageName, ')');
    }
}
