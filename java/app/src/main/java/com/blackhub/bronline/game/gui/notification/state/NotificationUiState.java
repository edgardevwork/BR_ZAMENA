package com.blackhub.bronline.game.gui.notification.state;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.notification.data.NotificationObj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NotificationUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class NotificationUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final List<NotificationObj> backlogNotification;
    public final boolean isHideInterface;
    public final boolean isNeedNotificationFromBacklog;
    public final boolean isNeedRemoveAllNotifications;
    public final boolean isNewHud;
    public final boolean isRemoved;
    public final int newSize;
    public final int notificationIdIfNeedRemove;

    public NotificationUiState() {
        this(false, null, false, false, false, false, 0, 0, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNewHud() {
        return this.isNewHud;
    }

    @NotNull
    public final List<NotificationObj> component2() {
        return this.backlogNotification;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsNeedNotificationFromBacklog() {
        return this.isNeedNotificationFromBacklog;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRemoved() {
        return this.isRemoved;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsHideInterface() {
        return this.isHideInterface;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsNeedRemoveAllNotifications() {
        return this.isNeedRemoveAllNotifications;
    }

    /* renamed from: component7, reason: from getter */
    public final int getNewSize() {
        return this.newSize;
    }

    /* renamed from: component8, reason: from getter */
    public final int getNotificationIdIfNeedRemove() {
        return this.notificationIdIfNeedRemove;
    }

    @NotNull
    public final NotificationUiState copy(boolean isNewHud, @NotNull List<NotificationObj> backlogNotification, boolean isNeedNotificationFromBacklog, boolean isRemoved, boolean isHideInterface, boolean isNeedRemoveAllNotifications, int newSize, int notificationIdIfNeedRemove) {
        Intrinsics.checkNotNullParameter(backlogNotification, "backlogNotification");
        return new NotificationUiState(isNewHud, backlogNotification, isNeedNotificationFromBacklog, isRemoved, isHideInterface, isNeedRemoveAllNotifications, newSize, notificationIdIfNeedRemove);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationUiState)) {
            return false;
        }
        NotificationUiState notificationUiState = (NotificationUiState) other;
        return this.isNewHud == notificationUiState.isNewHud && Intrinsics.areEqual(this.backlogNotification, notificationUiState.backlogNotification) && this.isNeedNotificationFromBacklog == notificationUiState.isNeedNotificationFromBacklog && this.isRemoved == notificationUiState.isRemoved && this.isHideInterface == notificationUiState.isHideInterface && this.isNeedRemoveAllNotifications == notificationUiState.isNeedRemoveAllNotifications && this.newSize == notificationUiState.newSize && this.notificationIdIfNeedRemove == notificationUiState.notificationIdIfNeedRemove;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.isNewHud) * 31) + this.backlogNotification.hashCode()) * 31) + Boolean.hashCode(this.isNeedNotificationFromBacklog)) * 31) + Boolean.hashCode(this.isRemoved)) * 31) + Boolean.hashCode(this.isHideInterface)) * 31) + Boolean.hashCode(this.isNeedRemoveAllNotifications)) * 31) + Integer.hashCode(this.newSize)) * 31) + Integer.hashCode(this.notificationIdIfNeedRemove);
    }

    @NotNull
    public String toString() {
        return "NotificationUiState(isNewHud=" + this.isNewHud + ", backlogNotification=" + this.backlogNotification + ", isNeedNotificationFromBacklog=" + this.isNeedNotificationFromBacklog + ", isRemoved=" + this.isRemoved + ", isHideInterface=" + this.isHideInterface + ", isNeedRemoveAllNotifications=" + this.isNeedRemoveAllNotifications + ", newSize=" + this.newSize + ", notificationIdIfNeedRemove=" + this.notificationIdIfNeedRemove + ")";
    }

    public NotificationUiState(boolean z, @NotNull List<NotificationObj> backlogNotification, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2) {
        Intrinsics.checkNotNullParameter(backlogNotification, "backlogNotification");
        this.isNewHud = z;
        this.backlogNotification = backlogNotification;
        this.isNeedNotificationFromBacklog = z2;
        this.isRemoved = z3;
        this.isHideInterface = z4;
        this.isNeedRemoveAllNotifications = z5;
        this.newSize = i;
        this.notificationIdIfNeedRemove = i2;
    }

    public final boolean isNewHud() {
        return this.isNewHud;
    }

    public /* synthetic */ NotificationUiState(boolean z, List list, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? true : z, (i3 & 2) != 0 ? new ArrayList() : list, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? false : z3, (i3 & 16) != 0 ? false : z4, (i3 & 32) != 0 ? false : z5, (i3 & 64) == 0 ? i : 0, (i3 & 128) != 0 ? -1 : i2);
    }

    @NotNull
    public final List<NotificationObj> getBacklogNotification() {
        return this.backlogNotification;
    }

    public final boolean isNeedNotificationFromBacklog() {
        return this.isNeedNotificationFromBacklog;
    }

    public final boolean isRemoved() {
        return this.isRemoved;
    }

    public final boolean isHideInterface() {
        return this.isHideInterface;
    }

    public final boolean isNeedRemoveAllNotifications() {
        return this.isNeedRemoveAllNotifications;
    }

    public final int getNewSize() {
        return this.newSize;
    }

    public final int getNotificationIdIfNeedRemove() {
        return this.notificationIdIfNeedRemove;
    }
}

