package com.sdkit.paylib.paylibdomain.api.entity;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\r\u0010 ¨\u0006#"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/SbpBankInfo;", "", "", "component1", "component2", "component3", "component4", "", "component5", "title", "iconUrl", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "schemaDeeplink", "isKnownPackage", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "getIconUrl", "c", "getPackageName", "d", "getSchemaDeeplink", "e", "Z", "()Z", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class SbpBankInfo {

    /* renamed from: a, reason: from kotlin metadata */
    public final String title;

    /* renamed from: b, reason: from kotlin metadata */
    public final String iconUrl;

    /* renamed from: c, reason: from kotlin metadata */
    public final String packageName;

    /* renamed from: d, reason: from kotlin metadata */
    public final String schemaDeeplink;

    /* renamed from: e, reason: from kotlin metadata */
    public final boolean isKnownPackage;

    public SbpBankInfo(String title, String iconUrl, String packageName, String schemaDeeplink, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(schemaDeeplink, "schemaDeeplink");
        this.title = title;
        this.iconUrl = iconUrl;
        this.packageName = packageName;
        this.schemaDeeplink = schemaDeeplink;
        this.isKnownPackage = z;
    }

    public static /* synthetic */ SbpBankInfo copy$default(SbpBankInfo sbpBankInfo, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sbpBankInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = sbpBankInfo.iconUrl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = sbpBankInfo.packageName;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = sbpBankInfo.schemaDeeplink;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = sbpBankInfo.isKnownPackage;
        }
        return sbpBankInfo.copy(str, str5, str6, str7, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSchemaDeeplink() {
        return this.schemaDeeplink;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsKnownPackage() {
        return this.isKnownPackage;
    }

    public final SbpBankInfo copy(String title, String iconUrl, String packageName, String schemaDeeplink, boolean isKnownPackage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(schemaDeeplink, "schemaDeeplink");
        return new SbpBankInfo(title, iconUrl, packageName, schemaDeeplink, isKnownPackage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SbpBankInfo)) {
            return false;
        }
        SbpBankInfo sbpBankInfo = (SbpBankInfo) other;
        return Intrinsics.areEqual(this.title, sbpBankInfo.title) && Intrinsics.areEqual(this.iconUrl, sbpBankInfo.iconUrl) && Intrinsics.areEqual(this.packageName, sbpBankInfo.packageName) && Intrinsics.areEqual(this.schemaDeeplink, sbpBankInfo.schemaDeeplink) && this.isKnownPackage == sbpBankInfo.isKnownPackage;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getSchemaDeeplink() {
        return this.schemaDeeplink;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iM1429a = C8031b.m1429a(this.schemaDeeplink, C8031b.m1429a(this.packageName, C8031b.m1429a(this.iconUrl, this.title.hashCode() * 31, 31), 31), 31);
        boolean z = this.isKnownPackage;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iM1429a + i;
    }

    public final boolean isKnownPackage() {
        return this.isKnownPackage;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SbpBankInfo(title=");
        sb.append(this.title);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", packageName=");
        sb.append(this.packageName);
        sb.append(", schemaDeeplink=");
        sb.append(this.schemaDeeplink);
        sb.append(", isKnownPackage=");
        return C8030a.m1428a(sb, this.isKnownPackage, ')');
    }
}
