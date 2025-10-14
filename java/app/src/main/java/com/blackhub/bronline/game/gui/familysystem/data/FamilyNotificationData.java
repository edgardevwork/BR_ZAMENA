package com.blackhub.bronline.game.gui.familysystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyNotificationData.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class FamilyNotificationData {
    public static final int $stable = 0;

    @NotNull
    public final String notificationsAuthor;
    public final int notificationsId;

    @NotNull
    public final String notificationsValue;

    public static /* synthetic */ FamilyNotificationData copy$default(FamilyNotificationData familyNotificationData, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = familyNotificationData.notificationsValue;
        }
        if ((i2 & 2) != 0) {
            str2 = familyNotificationData.notificationsAuthor;
        }
        if ((i2 & 4) != 0) {
            i = familyNotificationData.notificationsId;
        }
        return familyNotificationData.copy(str, str2, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNotificationsValue() {
        return this.notificationsValue;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNotificationsAuthor() {
        return this.notificationsAuthor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNotificationsId() {
        return this.notificationsId;
    }

    @NotNull
    public final FamilyNotificationData copy(@NotNull String notificationsValue, @NotNull String notificationsAuthor, int notificationsId) {
        Intrinsics.checkNotNullParameter(notificationsValue, "notificationsValue");
        Intrinsics.checkNotNullParameter(notificationsAuthor, "notificationsAuthor");
        return new FamilyNotificationData(notificationsValue, notificationsAuthor, notificationsId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyNotificationData)) {
            return false;
        }
        FamilyNotificationData familyNotificationData = (FamilyNotificationData) other;
        return Intrinsics.areEqual(this.notificationsValue, familyNotificationData.notificationsValue) && Intrinsics.areEqual(this.notificationsAuthor, familyNotificationData.notificationsAuthor) && this.notificationsId == familyNotificationData.notificationsId;
    }

    public int hashCode() {
        return (((this.notificationsValue.hashCode() * 31) + this.notificationsAuthor.hashCode()) * 31) + Integer.hashCode(this.notificationsId);
    }

    @NotNull
    public String toString() {
        return "FamilyNotificationData(notificationsValue=" + this.notificationsValue + ", notificationsAuthor=" + this.notificationsAuthor + ", notificationsId=" + this.notificationsId + ")";
    }

    public FamilyNotificationData(@NotNull String notificationsValue, @NotNull String notificationsAuthor, int i) {
        Intrinsics.checkNotNullParameter(notificationsValue, "notificationsValue");
        Intrinsics.checkNotNullParameter(notificationsAuthor, "notificationsAuthor");
        this.notificationsValue = notificationsValue;
        this.notificationsAuthor = notificationsAuthor;
        this.notificationsId = i;
    }

    @NotNull
    public final String getNotificationsValue() {
        return this.notificationsValue;
    }

    @NotNull
    public final String getNotificationsAuthor() {
        return this.notificationsAuthor;
    }

    public final int getNotificationsId() {
        return this.notificationsId;
    }
}

