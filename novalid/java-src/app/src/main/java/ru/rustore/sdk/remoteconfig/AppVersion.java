package ru.rustore.sdk.remoteconfig;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/AppVersion;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
@JvmInline
/* loaded from: classes8.dex */
public final class AppVersion {
    public final String value;

    public /* synthetic */ AppVersion(String str) {
        this.value = str;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ AppVersion m17620boximpl(String str) {
        return new AppVersion(str);
    }

    /* renamed from: constructor-impl */
    public static String m17621constructorimpl(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl */
    public static boolean m17622equalsimpl(String str, Object obj) {
        return (obj instanceof AppVersion) && Intrinsics.areEqual(str, ((AppVersion) obj).m17626unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m17623equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl */
    public static int m17624hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl */
    public static String m17625toStringimpl(String str) {
        return "AppVersion(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m17622equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m17624hashCodeimpl(this.value);
    }

    public String toString() {
        return m17625toStringimpl(this.value);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ String m17626unboximpl() {
        return this.value;
    }
}
