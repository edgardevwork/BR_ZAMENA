package com.blackhub.bronline.game.gui.notification.data;

import android.os.CountDownTimer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NotificationObj.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/notification/data/NotificationObj;", "", "type", "", "bodyText", "", "duration", "notificationId", "subId", "buttonText", "timer", "Landroid/os/CountDownTimer;", "(ILjava/lang/String;IIILjava/lang/String;Landroid/os/CountDownTimer;)V", "getBodyText", "()Ljava/lang/String;", "getButtonText", "getDuration", "()I", "getNotificationId", "getSubId", "getTimer", "()Landroid/os/CountDownTimer;", "setTimer", "(Landroid/os/CountDownTimer;)V", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NotificationObj {
    public static final int $stable = 8;

    @NotNull
    public final String bodyText;

    @NotNull
    public final String buttonText;
    public final int duration;
    public final int notificationId;
    public final int subId;

    @Nullable
    public CountDownTimer timer;
    public final int type;

    public NotificationObj() {
        this(0, null, 0, 0, 0, null, null, 127, null);
    }

    public static /* synthetic */ NotificationObj copy$default(NotificationObj notificationObj, int i, String str, int i2, int i3, int i4, String str2, CountDownTimer countDownTimer, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = notificationObj.type;
        }
        if ((i5 & 2) != 0) {
            str = notificationObj.bodyText;
        }
        String str3 = str;
        if ((i5 & 4) != 0) {
            i2 = notificationObj.duration;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = notificationObj.notificationId;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = notificationObj.subId;
        }
        int i8 = i4;
        if ((i5 & 32) != 0) {
            str2 = notificationObj.buttonText;
        }
        String str4 = str2;
        if ((i5 & 64) != 0) {
            countDownTimer = notificationObj.timer;
        }
        return notificationObj.copy(i, str3, i6, i7, i8, str4, countDownTimer);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component4, reason: from getter */
    public final int getNotificationId() {
        return this.notificationId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSubId() {
        return this.subId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final CountDownTimer getTimer() {
        return this.timer;
    }

    @NotNull
    public final NotificationObj copy(int type, @NotNull String bodyText, int duration, int notificationId, int subId, @NotNull String buttonText, @Nullable CountDownTimer timer) {
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        return new NotificationObj(type, bodyText, duration, notificationId, subId, buttonText, timer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationObj)) {
            return false;
        }
        NotificationObj notificationObj = (NotificationObj) other;
        return this.type == notificationObj.type && Intrinsics.areEqual(this.bodyText, notificationObj.bodyText) && this.duration == notificationObj.duration && this.notificationId == notificationObj.notificationId && this.subId == notificationObj.subId && Intrinsics.areEqual(this.buttonText, notificationObj.buttonText) && Intrinsics.areEqual(this.timer, notificationObj.timer);
    }

    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.type) * 31) + this.bodyText.hashCode()) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.notificationId)) * 31) + Integer.hashCode(this.subId)) * 31) + this.buttonText.hashCode()) * 31;
        CountDownTimer countDownTimer = this.timer;
        return iHashCode + (countDownTimer == null ? 0 : countDownTimer.hashCode());
    }

    @NotNull
    public String toString() {
        return "NotificationObj(type=" + this.type + ", bodyText=" + this.bodyText + ", duration=" + this.duration + ", notificationId=" + this.notificationId + ", subId=" + this.subId + ", buttonText=" + this.buttonText + ", timer=" + this.timer + ")";
    }

    public NotificationObj(int i, @NotNull String bodyText, int i2, int i3, int i4, @NotNull String buttonText, @Nullable CountDownTimer countDownTimer) {
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.type = i;
        this.bodyText = bodyText;
        this.duration = i2;
        this.notificationId = i3;
        this.subId = i4;
        this.buttonText = buttonText;
        this.timer = countDownTimer;
    }

    public final int getType() {
        return this.type;
    }

    public /* synthetic */ NotificationObj(int i, String str, int i2, int i3, int i4, String str2, CountDownTimer countDownTimer, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) == 0 ? i4 : 0, (i5 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i5 & 64) != 0 ? null : countDownTimer);
    }

    @NotNull
    public final String getBodyText() {
        return this.bodyText;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getNotificationId() {
        return this.notificationId;
    }

    public final int getSubId() {
        return this.subId;
    }

    @NotNull
    public final String getButtonText() {
        return this.buttonText;
    }

    @Nullable
    public final CountDownTimer getTimer() {
        return this.timer;
    }

    public final void setTimer(@Nullable CountDownTimer countDownTimer) {
        this.timer = countDownTimer;
    }
}
