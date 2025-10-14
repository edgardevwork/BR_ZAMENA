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

