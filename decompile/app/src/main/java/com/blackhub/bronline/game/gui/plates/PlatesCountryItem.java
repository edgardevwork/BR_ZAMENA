package com.blackhub.bronline.game.gui.plates;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlatesCountryItem.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/plates/PlatesCountryItem;", "", "countryId", "", "text", "", "bgShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "isClicked", "", "onItemClick", "Lkotlin/Function0;", "", "(ILjava/lang/String;Landroidx/compose/foundation/shape/RoundedCornerShape;ZLkotlin/jvm/functions/Function0;)V", "getBgShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCountryId", "()I", "()Z", "getOnItemClick", "()Lkotlin/jvm/functions/Function0;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PlatesCountryItem {
    public static final int $stable = 0;

    @NotNull
    public final RoundedCornerShape bgShape;
    public final int countryId;
    public final boolean isClicked;

    @NotNull
    public final Function0<Unit> onItemClick;

    @NotNull
    public final String text;

    public static /* synthetic */ PlatesCountryItem copy$default(PlatesCountryItem platesCountryItem, int i, String str, RoundedCornerShape roundedCornerShape, boolean z, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = platesCountryItem.countryId;
        }
        if ((i2 & 2) != 0) {
            str = platesCountryItem.text;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            roundedCornerShape = platesCountryItem.bgShape;
        }
        RoundedCornerShape roundedCornerShape2 = roundedCornerShape;
        if ((i2 & 8) != 0) {
            z = platesCountryItem.isClicked;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            function0 = platesCountryItem.onItemClick;
        }
        return platesCountryItem.copy(i, str2, roundedCornerShape2, z2, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCountryId() {
        return this.countryId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RoundedCornerShape getBgShape() {
        return this.bgShape;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    @NotNull
    public final Function0<Unit> component5() {
        return this.onItemClick;
    }

    @NotNull
    public final PlatesCountryItem copy(int countryId, @NotNull String text, @NotNull RoundedCornerShape bgShape, boolean isClicked, @NotNull Function0<Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(bgShape, "bgShape");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        return new PlatesCountryItem(countryId, text, bgShape, isClicked, onItemClick);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatesCountryItem)) {
            return false;
        }
        PlatesCountryItem platesCountryItem = (PlatesCountryItem) other;
        return this.countryId == platesCountryItem.countryId && Intrinsics.areEqual(this.text, platesCountryItem.text) && Intrinsics.areEqual(this.bgShape, platesCountryItem.bgShape) && this.isClicked == platesCountryItem.isClicked && Intrinsics.areEqual(this.onItemClick, platesCountryItem.onItemClick);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.countryId) * 31) + this.text.hashCode()) * 31) + this.bgShape.hashCode()) * 31) + Boolean.hashCode(this.isClicked)) * 31) + this.onItemClick.hashCode();
    }

    @NotNull
    public String toString() {
        return "PlatesCountryItem(countryId=" + this.countryId + ", text=" + this.text + ", bgShape=" + this.bgShape + ", isClicked=" + this.isClicked + ", onItemClick=" + this.onItemClick + ")";
    }

    public PlatesCountryItem(int i, @NotNull String text, @NotNull RoundedCornerShape bgShape, boolean z, @NotNull Function0<Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(bgShape, "bgShape");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.countryId = i;
        this.text = text;
        this.bgShape = bgShape;
        this.isClicked = z;
        this.onItemClick = onItemClick;
    }

    public final int getCountryId() {
        return this.countryId;
    }

    public /* synthetic */ PlatesCountryItem(int i, String str, RoundedCornerShape roundedCornerShape, boolean z, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 4) != 0 ? RoundedCornerShapeKt.RoundedCornerShape(0) : roundedCornerShape, (i2 & 8) != 0 ? false : z, function0);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final RoundedCornerShape getBgShape() {
        return this.bgShape;
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    @NotNull
    public final Function0<Unit> getOnItemClick() {
        return this.onItemClick;
    }
}
