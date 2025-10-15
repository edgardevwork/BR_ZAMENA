package com.sdkit.paylib.paylibpayment.api.network.entity.cards;

import android.net.Uri;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J9\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016¨\u0006!"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/cards/BankInfo;", "", "", "component1", "Landroid/net/Uri;", "component2", "component3", "component4", "name", "imageUrl", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "countryName", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Landroid/net/Uri;", "getImageUrl", "()Landroid/net/Uri;", "c", "getCountryCode", "d", "getCountryName", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class BankInfo {

    /* renamed from: a, reason: from kotlin metadata */
    public final String name;

    /* renamed from: b, reason: from kotlin metadata */
    public final Uri imageUrl;

    /* renamed from: c, reason: from kotlin metadata */
    public final String countryCode;

    /* renamed from: d, reason: from kotlin metadata */
    public final String countryName;

    public BankInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ BankInfo copy$default(BankInfo bankInfo, String str, Uri uri, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankInfo.name;
        }
        if ((i & 2) != 0) {
            uri = bankInfo.imageUrl;
        }
        if ((i & 4) != 0) {
            str2 = bankInfo.countryCode;
        }
        if ((i & 8) != 0) {
            str3 = bankInfo.countryName;
        }
        return bankInfo.copy(str, uri, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    public final BankInfo copy(String name, Uri imageUrl, String countryCode, String countryName) {
        return new BankInfo(name, imageUrl, countryCode, countryName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankInfo)) {
            return false;
        }
        BankInfo bankInfo = (BankInfo) other;
        return Intrinsics.areEqual(this.name, bankInfo.name) && Intrinsics.areEqual(this.imageUrl, bankInfo.imageUrl) && Intrinsics.areEqual(this.countryCode, bankInfo.countryCode) && Intrinsics.areEqual(this.countryName, bankInfo.countryName);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Uri uri = this.imageUrl;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.countryCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryName;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BankInfo(name=");
        sb.append(this.name);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(", countryName=");
        return C8032c.m1430a(sb, this.countryName, ')');
    }

    public BankInfo(String str, Uri uri, String str2, String str3) {
        this.name = str;
        this.imageUrl = uri;
        this.countryCode = str2;
        this.countryName = str3;
    }

    public /* synthetic */ BankInfo(String str, Uri uri, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : uri, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
