package com.blackhub.bronline.game.gui.admintools.model;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ATButtonItem.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class ATButtonItem {
    public static final int $stable = 0;
    public final int id;

    @Nullable
    public final Integer imageRes;

    @NotNull
    public final Function0<Unit> onItemClick;

    @Nullable
    public final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ATButtonItem copy$default(ATButtonItem aTButtonItem, int i, String str, Integer num, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aTButtonItem.id;
        }
        if ((i2 & 2) != 0) {
            str = aTButtonItem.text;
        }
        if ((i2 & 4) != 0) {
            num = aTButtonItem.imageRes;
        }
        if ((i2 & 8) != 0) {
            function0 = aTButtonItem.onItemClick;
        }
        return aTButtonItem.copy(i, str, num, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getImageRes() {
        return this.imageRes;
    }

    @NotNull
    public final Function0<Unit> component4() {
        return this.onItemClick;
    }

    @NotNull
    public final ATButtonItem copy(int id, @Nullable String text, @DrawableRes @Nullable Integer imageRes, @NotNull Function0<Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        return new ATButtonItem(id, text, imageRes, onItemClick);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ATButtonItem)) {
            return false;
        }
        ATButtonItem aTButtonItem = (ATButtonItem) other;
        return this.id == aTButtonItem.id && Intrinsics.areEqual(this.text, aTButtonItem.text) && Intrinsics.areEqual(this.imageRes, aTButtonItem.imageRes) && Intrinsics.areEqual(this.onItemClick, aTButtonItem.onItemClick);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.imageRes;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.onItemClick.hashCode();
    }

    @NotNull
    public String toString() {
        return "ATButtonItem(id=" + this.id + ", text=" + this.text + ", imageRes=" + this.imageRes + ", onItemClick=" + this.onItemClick + ")";
    }

    public ATButtonItem(int i, @Nullable String str, @DrawableRes @Nullable Integer num, @NotNull Function0<Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.id = i;
        this.text = str;
        this.imageRes = num;
        this.onItemClick = onItemClick;
    }

    public /* synthetic */ ATButtonItem(int i, String str, Integer num, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : num, function0);
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getImageRes() {
        return this.imageRes;
    }

    @NotNull
    public final Function0<Unit> getOnItemClick() {
        return this.onItemClick;
    }
}

