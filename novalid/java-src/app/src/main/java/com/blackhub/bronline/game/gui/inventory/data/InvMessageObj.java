package com.blackhub.bronline.game.gui.inventory.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InvMessageObj.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006 "}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/data/InvMessageObj;", "", "ifMyMessage", "", "whoseMessage", "", "textMessage", "", "action", "itemName", "valueOfMoney", "(ZILjava/lang/String;ILjava/lang/String;I)V", "getAction", "()I", "getIfMyMessage", "()Z", "getItemName", "()Ljava/lang/String;", "getTextMessage", "getValueOfMoney", "getWhoseMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InvMessageObj {
    public static final int $stable = 0;
    public final int action;
    public final boolean ifMyMessage;

    @NotNull
    public final String itemName;

    @NotNull
    public final String textMessage;
    public final int valueOfMoney;
    public final int whoseMessage;

    public static /* synthetic */ InvMessageObj copy$default(InvMessageObj invMessageObj, boolean z, int i, String str, int i2, String str2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = invMessageObj.ifMyMessage;
        }
        if ((i4 & 2) != 0) {
            i = invMessageObj.whoseMessage;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            str = invMessageObj.textMessage;
        }
        String str3 = str;
        if ((i4 & 8) != 0) {
            i2 = invMessageObj.action;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            str2 = invMessageObj.itemName;
        }
        String str4 = str2;
        if ((i4 & 32) != 0) {
            i3 = invMessageObj.valueOfMoney;
        }
        return invMessageObj.copy(z, i5, str3, i6, str4, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIfMyMessage() {
        return this.ifMyMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWhoseMessage() {
        return this.whoseMessage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTextMessage() {
        return this.textMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* renamed from: component6, reason: from getter */
    public final int getValueOfMoney() {
        return this.valueOfMoney;
    }

    @NotNull
    public final InvMessageObj copy(boolean ifMyMessage, int whoseMessage, @NotNull String textMessage, int action, @NotNull String itemName, int valueOfMoney) {
        Intrinsics.checkNotNullParameter(textMessage, "textMessage");
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        return new InvMessageObj(ifMyMessage, whoseMessage, textMessage, action, itemName, valueOfMoney);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvMessageObj)) {
            return false;
        }
        InvMessageObj invMessageObj = (InvMessageObj) other;
        return this.ifMyMessage == invMessageObj.ifMyMessage && this.whoseMessage == invMessageObj.whoseMessage && Intrinsics.areEqual(this.textMessage, invMessageObj.textMessage) && this.action == invMessageObj.action && Intrinsics.areEqual(this.itemName, invMessageObj.itemName) && this.valueOfMoney == invMessageObj.valueOfMoney;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.ifMyMessage) * 31) + Integer.hashCode(this.whoseMessage)) * 31) + this.textMessage.hashCode()) * 31) + Integer.hashCode(this.action)) * 31) + this.itemName.hashCode()) * 31) + Integer.hashCode(this.valueOfMoney);
    }

    @NotNull
    public String toString() {
        return "InvMessageObj(ifMyMessage=" + this.ifMyMessage + ", whoseMessage=" + this.whoseMessage + ", textMessage=" + this.textMessage + ", action=" + this.action + ", itemName=" + this.itemName + ", valueOfMoney=" + this.valueOfMoney + ")";
    }

    public InvMessageObj(boolean z, int i, @NotNull String textMessage, int i2, @NotNull String itemName, int i3) {
        Intrinsics.checkNotNullParameter(textMessage, "textMessage");
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        this.ifMyMessage = z;
        this.whoseMessage = i;
        this.textMessage = textMessage;
        this.action = i2;
        this.itemName = itemName;
        this.valueOfMoney = i3;
    }

    public final boolean getIfMyMessage() {
        return this.ifMyMessage;
    }

    public final int getWhoseMessage() {
        return this.whoseMessage;
    }

    @NotNull
    public final String getTextMessage() {
        return this.textMessage;
    }

    public final int getAction() {
        return this.action;
    }

    @NotNull
    public final String getItemName() {
        return this.itemName;
    }

    public final int getValueOfMoney() {
        return this.valueOfMoney;
    }
}
