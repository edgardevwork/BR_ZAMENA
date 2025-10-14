package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b,\u0010-J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003Ji\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u001d¨\u0006."}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/InvoiceDeviceInfo;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "userChannel", "platformType", RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION, "model", "manufacturer", "id", "surface", "surfaceVersion", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUserChannel", "()Ljava/lang/String;", "b", "getPlatformType", "c", "getPlatformVersion", "d", "getModel", "e", "getManufacturer", "f", "getId", "g", "getSurface", "h", "getSurfaceVersion", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class InvoiceDeviceInfo {

    /* renamed from: a, reason: from kotlin metadata */
    public final String userChannel;

    /* renamed from: b, reason: from kotlin metadata */
    public final String platformType;

    /* renamed from: c, reason: from kotlin metadata */
    public final String platformVersion;

    /* renamed from: d, reason: from kotlin metadata */
    public final String model;

    /* renamed from: e, reason: from kotlin metadata */
    public final String manufacturer;

    /* renamed from: f, reason: from kotlin metadata */
    public final String id;

    /* renamed from: g, reason: from kotlin metadata */
    public final String surface;

    /* renamed from: h, reason: from kotlin metadata */
    public final String surfaceVersion;

    public InvoiceDeviceInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.userChannel = str;
        this.platformType = str2;
        this.platformVersion = str3;
        this.model = str4;
        this.manufacturer = str5;
        this.id = str6;
        this.surface = str7;
        this.surfaceVersion = str8;
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserChannel() {
        return this.userChannel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlatformType() {
        return this.platformType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    /* renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: component5, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    /* renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSurface() {
        return this.surface;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSurfaceVersion() {
        return this.surfaceVersion;
    }

    public final InvoiceDeviceInfo copy(String userChannel, String platformType, String platformVersion, String model, String manufacturer, String id, String surface, String surfaceVersion) {
        return new InvoiceDeviceInfo(userChannel, platformType, platformVersion, model, manufacturer, id, surface, surfaceVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceDeviceInfo)) {
            return false;
        }
        InvoiceDeviceInfo invoiceDeviceInfo = (InvoiceDeviceInfo) other;
        return Intrinsics.areEqual(this.userChannel, invoiceDeviceInfo.userChannel) && Intrinsics.areEqual(this.platformType, invoiceDeviceInfo.platformType) && Intrinsics.areEqual(this.platformVersion, invoiceDeviceInfo.platformVersion) && Intrinsics.areEqual(this.model, invoiceDeviceInfo.model) && Intrinsics.areEqual(this.manufacturer, invoiceDeviceInfo.manufacturer) && Intrinsics.areEqual(this.id, invoiceDeviceInfo.id) && Intrinsics.areEqual(this.surface, invoiceDeviceInfo.surface) && Intrinsics.areEqual(this.surfaceVersion, invoiceDeviceInfo.surfaceVersion);
    }

    public final String getId() {
        return this.id;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getPlatformType() {
        return this.platformType;
    }

    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    public final String getSurface() {
        return this.surface;
    }

    public final String getSurfaceVersion() {
        return this.surfaceVersion;
    }

    public final String getUserChannel() {
        return this.userChannel;
    }

    public int hashCode() {
        String str = this.userChannel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platformType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.platformVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.model;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.manufacturer;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.id;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.surface;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.surfaceVersion;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceDeviceInfo(userChannel=");
        sb.append(this.userChannel);
        sb.append(", platformType=");
        sb.append(this.platformType);
        sb.append(", platformVersion=");
        sb.append(this.platformVersion);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", manufacturer=");
        sb.append(this.manufacturer);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", surface=");
        sb.append(this.surface);
        sb.append(", surfaceVersion=");
        return C8032c.m1430a(sb, this.surfaceVersion, ')');
    }
}
