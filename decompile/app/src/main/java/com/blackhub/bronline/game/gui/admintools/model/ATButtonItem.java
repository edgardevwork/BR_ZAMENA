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
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J@\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/admintools/model/ATButtonItem;", "", "id", "", "text", "", "imageRes", "onItemClick", "Lkotlin/Function0;", "", "(ILjava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "getId", "()I", "getImageRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOnItemClick", "()Lkotlin/jvm/functions/Function0;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)Lcom/blackhub/bronline/game/gui/admintools/model/ATButtonItem;", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
