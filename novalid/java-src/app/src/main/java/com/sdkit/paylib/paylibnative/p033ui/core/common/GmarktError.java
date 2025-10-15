package com.sdkit.paylib.paylibnative.p033ui.core.common;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.activitylauncher.ActivityLauncherAnalytics;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001f"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/core/common/GmarktError;", "Lcom/sdkit/paylib/paylibnative/ui/core/common/GmarktException;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "getCode", "()I", "code", "b", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "c", "getErrorDescription", ActivityLauncherAnalytics.ERROR_DESCRIPTION, "d", "getTraceId", "traceId", "e", "getDebugMessage", "debugMessage", SegmentConstantPool.INITSTRING, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final /* data */ class GmarktError extends GmarktException {

    /* renamed from: a, reason: from kotlin metadata */
    public final int code;

    /* renamed from: b, reason: from kotlin metadata */
    public final String errorMessage;

    /* renamed from: c, reason: from kotlin metadata */
    public final String errorDescription;

    /* renamed from: d, reason: from kotlin metadata */
    public final String traceId;

    /* renamed from: e, reason: from kotlin metadata */
    public final String debugMessage;

    public GmarktError(int i, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        String str7;
        StringBuilder sb = new StringBuilder("GmarktError: ");
        String str8 = "code(" + i + ')';
        String str9 = null;
        if (str != null) {
            str5 = "errorMessage(" + str + ')';
        } else {
            str5 = null;
        }
        if (str2 != null) {
            str6 = "errorDescription(" + str2 + ')';
        } else {
            str6 = null;
        }
        if (str3 != null) {
            str7 = "traceId(" + str3 + ')';
        } else {
            str7 = null;
        }
        if (str4 != null) {
            str9 = "debugMessage(" + str4 + ')';
        }
        sb.append(CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str8, str5, str6, str7, str9}), " ", null, null, 0, null, null, 62, null));
        super(sb.toString());
        this.code = i;
        this.errorMessage = str;
        this.errorDescription = str2;
        this.traceId = str3;
        this.debugMessage = str4;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GmarktError)) {
            return false;
        }
        GmarktError gmarktError = (GmarktError) other;
        return this.code == gmarktError.code && Intrinsics.areEqual(this.errorMessage, gmarktError.errorMessage) && Intrinsics.areEqual(this.errorDescription, gmarktError.errorDescription) && Intrinsics.areEqual(this.traceId, gmarktError.traceId) && Intrinsics.areEqual(this.debugMessage, gmarktError.debugMessage);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.errorMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDescription;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.traceId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.debugMessage;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("GmarktError(code=");
        sb.append(this.code);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", errorDescription=");
        sb.append(this.errorDescription);
        sb.append(", traceId=");
        sb.append(this.traceId);
        sb.append(", debugMessage=");
        return C8032c.m1430a(sb, this.debugMessage, ')');
    }
}
