package com.blackhub.bronline.game.gui.inventory.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InvMessageObj.kt */
@StabilityInferred(parameters = 1)

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

