package com.sdkit.paylib.paylibpayment.api.network.entity.invoice;

import android.os.Parcel;
import android.os.Parcelable;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003JY\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0017\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0019\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000e\u0010$R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u0010(¨\u0006;"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/invoice/SmsConfirmConstraints;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "component3", "component4", "", "component5", "component6", "", "component7", "component8", "isNewRequestSmsAvailable", "smsCodeEnterAttemptsNumber", "smsRequestInterval", "smsCodeLength", "smsSentTime", "smsCodeExpiredTime", "validationRegex", "codeEnterAttemptsNumber", "copy", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "a", "Z", "()Z", "b", "I", "getSmsCodeEnterAttemptsNumber", "()I", "c", "getSmsRequestInterval", "d", "getSmsCodeLength", "e", "J", "getSmsSentTime", "()J", "f", "getSmsCodeExpiredTime", "g", "Ljava/lang/String;", "getValidationRegex", "()Ljava/lang/String;", "h", "getCodeEnterAttemptsNumber", SegmentConstantPool.INITSTRING, "(ZIIIJILjava/lang/String;I)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class SmsConfirmConstraints implements Parcelable {
    public static final Parcelable.Creator<SmsConfirmConstraints> CREATOR = new Creator();

    /* renamed from: a, reason: from kotlin metadata */
    public final boolean isNewRequestSmsAvailable;

    /* renamed from: b, reason: from kotlin metadata */
    public final int smsCodeEnterAttemptsNumber;

    /* renamed from: c, reason: from kotlin metadata */
    public final int smsRequestInterval;

    /* renamed from: d, reason: from kotlin metadata */
    public final int smsCodeLength;

    /* renamed from: e, reason: from kotlin metadata */
    public final long smsSentTime;

    /* renamed from: f, reason: from kotlin metadata */
    public final int smsCodeExpiredTime;

    /* renamed from: g, reason: from kotlin metadata */
    public final String validationRegex;

    /* renamed from: h, reason: from kotlin metadata */
    public final int codeEnterAttemptsNumber;

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Creator implements Parcelable.Creator<SmsConfirmConstraints> {
        @Override // android.os.Parcelable.Creator
        public final SmsConfirmConstraints createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SmsConfirmConstraints(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SmsConfirmConstraints[] newArray(int i) {
            return new SmsConfirmConstraints[i];
        }
    }

    public SmsConfirmConstraints(boolean z, int i, int i2, int i3, long j, int i4, String validationRegex, int i5) {
        Intrinsics.checkNotNullParameter(validationRegex, "validationRegex");
        this.isNewRequestSmsAvailable = z;
        this.smsCodeEnterAttemptsNumber = i;
        this.smsRequestInterval = i2;
        this.smsCodeLength = i3;
        this.smsSentTime = j;
        this.smsCodeExpiredTime = i4;
        this.validationRegex = validationRegex;
        this.codeEnterAttemptsNumber = i5;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNewRequestSmsAvailable() {
        return this.isNewRequestSmsAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSmsCodeEnterAttemptsNumber() {
        return this.smsCodeEnterAttemptsNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSmsRequestInterval() {
        return this.smsRequestInterval;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSmsCodeLength() {
        return this.smsCodeLength;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSmsSentTime() {
        return this.smsSentTime;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSmsCodeExpiredTime() {
        return this.smsCodeExpiredTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getValidationRegex() {
        return this.validationRegex;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCodeEnterAttemptsNumber() {
        return this.codeEnterAttemptsNumber;
    }

    public final SmsConfirmConstraints copy(boolean isNewRequestSmsAvailable, int smsCodeEnterAttemptsNumber, int smsRequestInterval, int smsCodeLength, long smsSentTime, int smsCodeExpiredTime, String validationRegex, int codeEnterAttemptsNumber) {
        Intrinsics.checkNotNullParameter(validationRegex, "validationRegex");
        return new SmsConfirmConstraints(isNewRequestSmsAvailable, smsCodeEnterAttemptsNumber, smsRequestInterval, smsCodeLength, smsSentTime, smsCodeExpiredTime, validationRegex, codeEnterAttemptsNumber);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmsConfirmConstraints)) {
            return false;
        }
        SmsConfirmConstraints smsConfirmConstraints = (SmsConfirmConstraints) other;
        return this.isNewRequestSmsAvailable == smsConfirmConstraints.isNewRequestSmsAvailable && this.smsCodeEnterAttemptsNumber == smsConfirmConstraints.smsCodeEnterAttemptsNumber && this.smsRequestInterval == smsConfirmConstraints.smsRequestInterval && this.smsCodeLength == smsConfirmConstraints.smsCodeLength && this.smsSentTime == smsConfirmConstraints.smsSentTime && this.smsCodeExpiredTime == smsConfirmConstraints.smsCodeExpiredTime && Intrinsics.areEqual(this.validationRegex, smsConfirmConstraints.validationRegex) && this.codeEnterAttemptsNumber == smsConfirmConstraints.codeEnterAttemptsNumber;
    }

    public final int getCodeEnterAttemptsNumber() {
        return this.codeEnterAttemptsNumber;
    }

    public final int getSmsCodeEnterAttemptsNumber() {
        return this.smsCodeEnterAttemptsNumber;
    }

    public final int getSmsCodeExpiredTime() {
        return this.smsCodeExpiredTime;
    }

    public final int getSmsCodeLength() {
        return this.smsCodeLength;
    }

    public final int getSmsRequestInterval() {
        return this.smsRequestInterval;
    }

    public final long getSmsSentTime() {
        return this.smsSentTime;
    }

    public final String getValidationRegex() {
        return this.validationRegex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.isNewRequestSmsAvailable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Integer.hashCode(this.codeEnterAttemptsNumber) + C8031b.m1429a(this.validationRegex, C8054b.m1525a(this.smsCodeExpiredTime, (Long.hashCode(this.smsSentTime) + C8054b.m1525a(this.smsCodeLength, C8054b.m1525a(this.smsRequestInterval, C8054b.m1525a(this.smsCodeEnterAttemptsNumber, r0 * 31, 31), 31), 31)) * 31, 31), 31);
    }

    public final boolean isNewRequestSmsAvailable() {
        return this.isNewRequestSmsAvailable;
    }

    public String toString() {
        return "SmsConfirmConstraints(isNewRequestSmsAvailable=" + this.isNewRequestSmsAvailable + ", smsCodeEnterAttemptsNumber=" + this.smsCodeEnterAttemptsNumber + ", smsRequestInterval=" + this.smsRequestInterval + ", smsCodeLength=" + this.smsCodeLength + ", smsSentTime=" + this.smsSentTime + ", smsCodeExpiredTime=" + this.smsCodeExpiredTime + ", validationRegex=" + this.validationRegex + ", codeEnterAttemptsNumber=" + this.codeEnterAttemptsNumber + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isNewRequestSmsAvailable ? 1 : 0);
        parcel.writeInt(this.smsCodeEnterAttemptsNumber);
        parcel.writeInt(this.smsRequestInterval);
        parcel.writeInt(this.smsCodeLength);
        parcel.writeLong(this.smsSentTime);
        parcel.writeInt(this.smsCodeExpiredTime);
        parcel.writeString(this.validationRegex);
        parcel.writeInt(this.codeEnterAttemptsNumber);
    }
}
