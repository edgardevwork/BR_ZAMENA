package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.annotation.XmlRes;
import com.google.android.material.C6765R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale;
import org.xmlpull.p066v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class BadgeState {
    public static final String BADGE_RESOURCE_TAG = "badge";
    public final float badgeHeight;
    public final float badgeRadius;
    public final float badgeWidth;
    public final float badgeWithTextHeight;
    public final float badgeWithTextRadius;
    public final float badgeWithTextWidth;
    public final State currentState;
    public final int horizontalInset;
    public final int horizontalInsetWithText;
    public int offsetAlignmentMode;
    public final State overridingState;

    public BadgeState(Context context, @XmlRes int i, @AttrRes int i2, @StyleRes int i3, @Nullable State state) throws XmlPullParserException, Resources.NotFoundException {
        CharSequence string;
        int i4;
        int i5;
        int i6;
        int i7;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        int iIntValue8;
        int iIntValue9;
        int iIntValue10;
        int iIntValue11;
        int iIntValue12;
        int iIntValue13;
        int iIntValue14;
        boolean zBooleanValue;
        State state2 = new State();
        this.currentState = state2;
        state = state == null ? new State() : state;
        if (i != 0) {
            state.badgeResId = i;
        }
        TypedArray typedArrayGenerateTypedArray = generateTypedArray(context, state.badgeResId, i2, i3);
        Resources resources = context.getResources();
        this.badgeRadius = typedArrayGenerateTypedArray.getDimensionPixelSize(C6765R.styleable.Badge_badgeRadius, -1);
        this.horizontalInset = context.getResources().getDimensionPixelSize(C6765R.dimen.mtrl_badge_horizontal_edge_offset);
        this.horizontalInsetWithText = context.getResources().getDimensionPixelSize(C6765R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.badgeWithTextRadius = typedArrayGenerateTypedArray.getDimensionPixelSize(C6765R.styleable.Badge_badgeWithTextRadius, -1);
        int i8 = C6765R.styleable.Badge_badgeWidth;
        int i9 = C6765R.dimen.m3_badge_size;
        this.badgeWidth = typedArrayGenerateTypedArray.getDimension(i8, resources.getDimension(i9));
        int i10 = C6765R.styleable.Badge_badgeWithTextWidth;
        int i11 = C6765R.dimen.m3_badge_with_text_size;
        this.badgeWithTextWidth = typedArrayGenerateTypedArray.getDimension(i10, resources.getDimension(i11));
        this.badgeHeight = typedArrayGenerateTypedArray.getDimension(C6765R.styleable.Badge_badgeHeight, resources.getDimension(i9));
        this.badgeWithTextHeight = typedArrayGenerateTypedArray.getDimension(C6765R.styleable.Badge_badgeWithTextHeight, resources.getDimension(i11));
        boolean z = true;
        this.offsetAlignmentMode = typedArrayGenerateTypedArray.getInt(C6765R.styleable.Badge_offsetAlignmentMode, 1);
        state2.alpha = state.alpha == -2 ? 255 : state.alpha;
        if (state.number == -2) {
            int i12 = C6765R.styleable.Badge_number;
            if (typedArrayGenerateTypedArray.hasValue(i12)) {
                state2.number = typedArrayGenerateTypedArray.getInt(i12, 0);
            } else {
                state2.number = -1;
            }
        } else {
            state2.number = state.number;
        }
        if (state.text == null) {
            int i13 = C6765R.styleable.Badge_badgeText;
            if (typedArrayGenerateTypedArray.hasValue(i13)) {
                state2.text = typedArrayGenerateTypedArray.getString(i13);
            }
        } else {
            state2.text = state.text;
        }
        state2.contentDescriptionForText = state.contentDescriptionForText;
        if (state.contentDescriptionNumberless == null) {
            string = context.getString(C6765R.string.mtrl_badge_numberless_content_description);
        } else {
            string = state.contentDescriptionNumberless;
        }
        state2.contentDescriptionNumberless = string;
        if (state.contentDescriptionQuantityStrings == 0) {
            i4 = C6765R.plurals.mtrl_badge_content_description;
        } else {
            i4 = state.contentDescriptionQuantityStrings;
        }
        state2.contentDescriptionQuantityStrings = i4;
        if (state.contentDescriptionExceedsMaxBadgeNumberRes == 0) {
            i5 = C6765R.string.mtrl_exceed_max_badge_number_content_description;
        } else {
            i5 = state.contentDescriptionExceedsMaxBadgeNumberRes;
        }
        state2.contentDescriptionExceedsMaxBadgeNumberRes = i5;
        if (state.isVisible != null && !state.isVisible.booleanValue()) {
            z = false;
        }
        state2.isVisible = Boolean.valueOf(z);
        if (state.maxCharacterCount == -2) {
            i6 = typedArrayGenerateTypedArray.getInt(C6765R.styleable.Badge_maxCharacterCount, -2);
        } else {
            i6 = state.maxCharacterCount;
        }
        state2.maxCharacterCount = i6;
        if (state.maxNumber == -2) {
            i7 = typedArrayGenerateTypedArray.getInt(C6765R.styleable.Badge_maxNumber, -2);
        } else {
            i7 = state.maxNumber;
        }
        state2.maxNumber = i7;
        if (state.badgeShapeAppearanceResId == null) {
            iIntValue = typedArrayGenerateTypedArray.getResourceId(C6765R.styleable.Badge_badgeShapeAppearance, C6765R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            iIntValue = state.badgeShapeAppearanceResId.intValue();
        }
        state2.badgeShapeAppearanceResId = Integer.valueOf(iIntValue);
        if (state.badgeShapeAppearanceOverlayResId == null) {
            iIntValue2 = typedArrayGenerateTypedArray.getResourceId(C6765R.styleable.Badge_badgeShapeAppearanceOverlay, 0);
        } else {
            iIntValue2 = state.badgeShapeAppearanceOverlayResId.intValue();
        }
        state2.badgeShapeAppearanceOverlayResId = Integer.valueOf(iIntValue2);
        if (state.badgeWithTextShapeAppearanceResId == null) {
            iIntValue3 = typedArrayGenerateTypedArray.getResourceId(C6765R.styleable.Badge_badgeWithTextShapeAppearance, C6765R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            iIntValue3 = state.badgeWithTextShapeAppearanceResId.intValue();
        }
        state2.badgeWithTextShapeAppearanceResId = Integer.valueOf(iIntValue3);
        if (state.badgeWithTextShapeAppearanceOverlayResId == null) {
            iIntValue4 = typedArrayGenerateTypedArray.getResourceId(C6765R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0);
        } else {
            iIntValue4 = state.badgeWithTextShapeAppearanceOverlayResId.intValue();
        }
        state2.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(iIntValue4);
        if (state.backgroundColor == null) {
            iIntValue5 = readColorFromAttributes(context, typedArrayGenerateTypedArray, C6765R.styleable.Badge_backgroundColor);
        } else {
            iIntValue5 = state.backgroundColor.intValue();
        }
        state2.backgroundColor = Integer.valueOf(iIntValue5);
        if (state.badgeTextAppearanceResId == null) {
            iIntValue6 = typedArrayGenerateTypedArray.getResourceId(C6765R.styleable.Badge_badgeTextAppearance, C6765R.style.TextAppearance_MaterialComponents_Badge);
        } else {
            iIntValue6 = state.badgeTextAppearanceResId.intValue();
        }
        state2.badgeTextAppearanceResId = Integer.valueOf(iIntValue6);
        if (state.badgeTextColor == null) {
            int i14 = C6765R.styleable.Badge_badgeTextColor;
            if (typedArrayGenerateTypedArray.hasValue(i14)) {
                state2.badgeTextColor = Integer.valueOf(readColorFromAttributes(context, typedArrayGenerateTypedArray, i14));
            } else {
                state2.badgeTextColor = Integer.valueOf(new TextAppearance(context, state2.badgeTextAppearanceResId.intValue()).getTextColor().getDefaultColor());
            }
        } else {
            state2.badgeTextColor = state.badgeTextColor;
        }
        if (state.badgeGravity == null) {
            iIntValue7 = typedArrayGenerateTypedArray.getInt(C6765R.styleable.Badge_badgeGravity, 8388661);
        } else {
            iIntValue7 = state.badgeGravity.intValue();
        }
        state2.badgeGravity = Integer.valueOf(iIntValue7);
        if (state.badgeHorizontalPadding == null) {
            iIntValue8 = typedArrayGenerateTypedArray.getDimensionPixelSize(C6765R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(C6765R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            iIntValue8 = state.badgeHorizontalPadding.intValue();
        }
        state2.badgeHorizontalPadding = Integer.valueOf(iIntValue8);
        if (state.badgeVerticalPadding == null) {
            iIntValue9 = typedArrayGenerateTypedArray.getDimensionPixelSize(C6765R.styleable.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(C6765R.dimen.m3_badge_with_text_vertical_padding));
        } else {
            iIntValue9 = state.badgeVerticalPadding.intValue();
        }
        state2.badgeVerticalPadding = Integer.valueOf(iIntValue9);
        if (state.horizontalOffsetWithoutText == null) {
            iIntValue10 = typedArrayGenerateTypedArray.getDimensionPixelOffset(C6765R.styleable.Badge_horizontalOffset, 0);
        } else {
            iIntValue10 = state.horizontalOffsetWithoutText.intValue();
        }
        state2.horizontalOffsetWithoutText = Integer.valueOf(iIntValue10);
        if (state.verticalOffsetWithoutText == null) {
            iIntValue11 = typedArrayGenerateTypedArray.getDimensionPixelOffset(C6765R.styleable.Badge_verticalOffset, 0);
        } else {
            iIntValue11 = state.verticalOffsetWithoutText.intValue();
        }
        state2.verticalOffsetWithoutText = Integer.valueOf(iIntValue11);
        if (state.horizontalOffsetWithText == null) {
            iIntValue12 = typedArrayGenerateTypedArray.getDimensionPixelOffset(C6765R.styleable.Badge_horizontalOffsetWithText, state2.horizontalOffsetWithoutText.intValue());
        } else {
            iIntValue12 = state.horizontalOffsetWithText.intValue();
        }
        state2.horizontalOffsetWithText = Integer.valueOf(iIntValue12);
        if (state.verticalOffsetWithText == null) {
            iIntValue13 = typedArrayGenerateTypedArray.getDimensionPixelOffset(C6765R.styleable.Badge_verticalOffsetWithText, state2.verticalOffsetWithoutText.intValue());
        } else {
            iIntValue13 = state.verticalOffsetWithText.intValue();
        }
        state2.verticalOffsetWithText = Integer.valueOf(iIntValue13);
        if (state.largeFontVerticalOffsetAdjustment == null) {
            iIntValue14 = typedArrayGenerateTypedArray.getDimensionPixelOffset(C6765R.styleable.Badge_largeFontVerticalOffsetAdjustment, 0);
        } else {
            iIntValue14 = state.largeFontVerticalOffsetAdjustment.intValue();
        }
        state2.largeFontVerticalOffsetAdjustment = Integer.valueOf(iIntValue14);
        state2.additionalHorizontalOffset = Integer.valueOf(state.additionalHorizontalOffset == null ? 0 : state.additionalHorizontalOffset.intValue());
        state2.additionalVerticalOffset = Integer.valueOf(state.additionalVerticalOffset == null ? 0 : state.additionalVerticalOffset.intValue());
        if (state.autoAdjustToWithinGrandparentBounds == null) {
            zBooleanValue = typedArrayGenerateTypedArray.getBoolean(C6765R.styleable.Badge_autoAdjustToWithinGrandparentBounds, false);
        } else {
            zBooleanValue = state.autoAdjustToWithinGrandparentBounds.booleanValue();
        }
        state2.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(zBooleanValue);
        typedArrayGenerateTypedArray.recycle();
        if (state.numberLocale == null) {
            state2.numberLocale = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.numberLocale = state.numberLocale;
        }
        this.overridingState = state;
    }

    public final TypedArray generateTypedArray(Context context, @XmlRes int i, @AttrRes int i2, @StyleRes int i3) throws XmlPullParserException, Resources.NotFoundException {
        AttributeSet attributeSet;
        int styleAttribute;
        if (i != 0) {
            AttributeSet drawableXml = DrawableUtils.parseDrawableXml(context, i, BADGE_RESOURCE_TAG);
            styleAttribute = drawableXml.getStyleAttribute();
            attributeSet = drawableXml;
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        return ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C6765R.styleable.Badge, i2, styleAttribute == 0 ? i3 : styleAttribute, new int[0]);
    }

    public State getOverridingState() {
        return this.overridingState;
    }

    public boolean isVisible() {
        return this.currentState.isVisible.booleanValue();
    }

    public void setVisible(boolean z) {
        this.overridingState.isVisible = Boolean.valueOf(z);
        this.currentState.isVisible = Boolean.valueOf(z);
    }

    public boolean hasNumber() {
        return this.currentState.number != -1;
    }

    public int getNumber() {
        return this.currentState.number;
    }

    public void setNumber(int i) {
        this.overridingState.number = i;
        this.currentState.number = i;
    }

    public void clearNumber() {
        setNumber(-1);
    }

    public boolean hasText() {
        return this.currentState.text != null;
    }

    public String getText() {
        return this.currentState.text;
    }

    public void setText(String str) {
        this.overridingState.text = str;
        this.currentState.text = str;
    }

    public void clearText() {
        setText(null);
    }

    public int getAlpha() {
        return this.currentState.alpha;
    }

    public void setAlpha(int i) {
        this.overridingState.alpha = i;
        this.currentState.alpha = i;
    }

    public int getMaxCharacterCount() {
        return this.currentState.maxCharacterCount;
    }

    public void setMaxCharacterCount(int i) {
        this.overridingState.maxCharacterCount = i;
        this.currentState.maxCharacterCount = i;
    }

    public int getMaxNumber() {
        return this.currentState.maxNumber;
    }

    public void setMaxNumber(int i) {
        this.overridingState.maxNumber = i;
        this.currentState.maxNumber = i;
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.currentState.backgroundColor.intValue();
    }

    public void setBackgroundColor(@ColorInt int i) {
        this.overridingState.backgroundColor = Integer.valueOf(i);
        this.currentState.backgroundColor = Integer.valueOf(i);
    }

    @ColorInt
    public int getBadgeTextColor() {
        return this.currentState.badgeTextColor.intValue();
    }

    public void setBadgeTextColor(@ColorInt int i) {
        this.overridingState.badgeTextColor = Integer.valueOf(i);
        this.currentState.badgeTextColor = Integer.valueOf(i);
    }

    @StyleRes
    public int getTextAppearanceResId() {
        return this.currentState.badgeTextAppearanceResId.intValue();
    }

    public void setTextAppearanceResId(@StyleRes int i) {
        this.overridingState.badgeTextAppearanceResId = Integer.valueOf(i);
        this.currentState.badgeTextAppearanceResId = Integer.valueOf(i);
    }

    public int getBadgeShapeAppearanceResId() {
        return this.currentState.badgeShapeAppearanceResId.intValue();
    }

    public void setBadgeShapeAppearanceResId(int i) {
        this.overridingState.badgeShapeAppearanceResId = Integer.valueOf(i);
        this.currentState.badgeShapeAppearanceResId = Integer.valueOf(i);
    }

    public int getBadgeShapeAppearanceOverlayResId() {
        return this.currentState.badgeShapeAppearanceOverlayResId.intValue();
    }

    public void setBadgeShapeAppearanceOverlayResId(int i) {
        this.overridingState.badgeShapeAppearanceOverlayResId = Integer.valueOf(i);
        this.currentState.badgeShapeAppearanceOverlayResId = Integer.valueOf(i);
    }

    public int getBadgeWithTextShapeAppearanceResId() {
        return this.currentState.badgeWithTextShapeAppearanceResId.intValue();
    }

    public void setBadgeWithTextShapeAppearanceResId(int i) {
        this.overridingState.badgeWithTextShapeAppearanceResId = Integer.valueOf(i);
        this.currentState.badgeWithTextShapeAppearanceResId = Integer.valueOf(i);
    }

    public int getBadgeWithTextShapeAppearanceOverlayResId() {
        return this.currentState.badgeWithTextShapeAppearanceOverlayResId.intValue();
    }

    public void setBadgeWithTextShapeAppearanceOverlayResId(int i) {
        this.overridingState.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i);
        this.currentState.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i);
    }

    public int getBadgeGravity() {
        return this.currentState.badgeGravity.intValue();
    }

    public void setBadgeGravity(int i) {
        this.overridingState.badgeGravity = Integer.valueOf(i);
        this.currentState.badgeGravity = Integer.valueOf(i);
    }

    @Px
    public int getBadgeHorizontalPadding() {
        return this.currentState.badgeHorizontalPadding.intValue();
    }

    public void setBadgeHorizontalPadding(@Px int i) {
        this.overridingState.badgeHorizontalPadding = Integer.valueOf(i);
        this.currentState.badgeHorizontalPadding = Integer.valueOf(i);
    }

    @Px
    public int getBadgeVerticalPadding() {
        return this.currentState.badgeVerticalPadding.intValue();
    }

    public void setBadgeVerticalPadding(@Px int i) {
        this.overridingState.badgeVerticalPadding = Integer.valueOf(i);
        this.currentState.badgeVerticalPadding = Integer.valueOf(i);
    }

    @Dimension(unit = 1)
    public int getHorizontalOffsetWithoutText() {
        return this.currentState.horizontalOffsetWithoutText.intValue();
    }

    public void setHorizontalOffsetWithoutText(@Dimension(unit = 1) int i) {
        this.overridingState.horizontalOffsetWithoutText = Integer.valueOf(i);
        this.currentState.horizontalOffsetWithoutText = Integer.valueOf(i);
    }

    @Dimension(unit = 1)
    public int getVerticalOffsetWithoutText() {
        return this.currentState.verticalOffsetWithoutText.intValue();
    }

    public void setVerticalOffsetWithoutText(@Dimension(unit = 1) int i) {
        this.overridingState.verticalOffsetWithoutText = Integer.valueOf(i);
        this.currentState.verticalOffsetWithoutText = Integer.valueOf(i);
    }

    @Dimension(unit = 1)
    public int getHorizontalOffsetWithText() {
        return this.currentState.horizontalOffsetWithText.intValue();
    }

    public void setHorizontalOffsetWithText(@Dimension(unit = 1) int i) {
        this.overridingState.horizontalOffsetWithText = Integer.valueOf(i);
        this.currentState.horizontalOffsetWithText = Integer.valueOf(i);
    }

    @Dimension(unit = 1)
    public int getVerticalOffsetWithText() {
        return this.currentState.verticalOffsetWithText.intValue();
    }

    public void setVerticalOffsetWithText(@Dimension(unit = 1) int i) {
        this.overridingState.verticalOffsetWithText = Integer.valueOf(i);
        this.currentState.verticalOffsetWithText = Integer.valueOf(i);
    }

    @Dimension(unit = 1)
    public int getLargeFontVerticalOffsetAdjustment() {
        return this.currentState.largeFontVerticalOffsetAdjustment.intValue();
    }

    public void setLargeFontVerticalOffsetAdjustment(@Dimension(unit = 1) int i) {
        this.overridingState.largeFontVerticalOffsetAdjustment = Integer.valueOf(i);
        this.currentState.largeFontVerticalOffsetAdjustment = Integer.valueOf(i);
    }

    @Dimension(unit = 1)
    public int getAdditionalHorizontalOffset() {
        return this.currentState.additionalHorizontalOffset.intValue();
    }

    public void setAdditionalHorizontalOffset(@Dimension(unit = 1) int i) {
        this.overridingState.additionalHorizontalOffset = Integer.valueOf(i);
        this.currentState.additionalHorizontalOffset = Integer.valueOf(i);
    }

    @Dimension(unit = 1)
    public int getAdditionalVerticalOffset() {
        return this.currentState.additionalVerticalOffset.intValue();
    }

    public void setAdditionalVerticalOffset(@Dimension(unit = 1) int i) {
        this.overridingState.additionalVerticalOffset = Integer.valueOf(i);
        this.currentState.additionalVerticalOffset = Integer.valueOf(i);
    }

    public CharSequence getContentDescriptionForText() {
        return this.currentState.contentDescriptionForText;
    }

    public void setContentDescriptionForText(CharSequence charSequence) {
        this.overridingState.contentDescriptionForText = charSequence;
        this.currentState.contentDescriptionForText = charSequence;
    }

    public CharSequence getContentDescriptionNumberless() {
        return this.currentState.contentDescriptionNumberless;
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.overridingState.contentDescriptionNumberless = charSequence;
        this.currentState.contentDescriptionNumberless = charSequence;
    }

    @PluralsRes
    public int getContentDescriptionQuantityStrings() {
        return this.currentState.contentDescriptionQuantityStrings;
    }

    public void setContentDescriptionQuantityStringsResource(@PluralsRes int i) {
        this.overridingState.contentDescriptionQuantityStrings = i;
        this.currentState.contentDescriptionQuantityStrings = i;
    }

    @StringRes
    public int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
        return this.currentState.contentDescriptionExceedsMaxBadgeNumberRes;
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int i) {
        this.overridingState.contentDescriptionExceedsMaxBadgeNumberRes = i;
        this.currentState.contentDescriptionExceedsMaxBadgeNumberRes = i;
    }

    public Locale getNumberLocale() {
        return this.currentState.numberLocale;
    }

    public void setNumberLocale(Locale locale) {
        this.overridingState.numberLocale = locale;
        this.currentState.numberLocale = locale;
    }

    public boolean isAutoAdjustedToGrandparentBounds() {
        return this.currentState.autoAdjustToWithinGrandparentBounds.booleanValue();
    }

    public void setAutoAdjustToGrandparentBounds(boolean z) {
        this.overridingState.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(z);
        this.currentState.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(z);
    }

    public static int readColorFromAttributes(Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        return MaterialResources.getColorStateList(context, typedArray, i).getDefaultColor();
    }

    public static final class State implements Parcelable {
        public static final int BADGE_NUMBER_NONE = -1;
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State createFromParcel(@NonNull Parcel parcel) {
                return new State(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State[] newArray(int i) {
                return new State[i];
            }
        };
        public static final int NOT_SET = -2;

        @Dimension(unit = 1)
        public Integer additionalHorizontalOffset;

        @Dimension(unit = 1)
        public Integer additionalVerticalOffset;
        public int alpha;
        public Boolean autoAdjustToWithinGrandparentBounds;

        @ColorInt
        public Integer backgroundColor;
        public Integer badgeGravity;

        @Px
        public Integer badgeHorizontalPadding;

        @XmlRes
        public int badgeResId;

        @StyleRes
        public Integer badgeShapeAppearanceOverlayResId;

        @StyleRes
        public Integer badgeShapeAppearanceResId;

        @StyleRes
        public Integer badgeTextAppearanceResId;

        @ColorInt
        public Integer badgeTextColor;

        @Px
        public Integer badgeVerticalPadding;

        @StyleRes
        public Integer badgeWithTextShapeAppearanceOverlayResId;

        @StyleRes
        public Integer badgeWithTextShapeAppearanceResId;

        @StringRes
        public int contentDescriptionExceedsMaxBadgeNumberRes;

        @Nullable
        public CharSequence contentDescriptionForText;

        @Nullable
        public CharSequence contentDescriptionNumberless;

        @PluralsRes
        public int contentDescriptionQuantityStrings;

        @Dimension(unit = 1)
        public Integer horizontalOffsetWithText;

        @Dimension(unit = 1)
        public Integer horizontalOffsetWithoutText;
        public Boolean isVisible;

        @Dimension(unit = 1)
        public Integer largeFontVerticalOffsetAdjustment;
        public int maxCharacterCount;
        public int maxNumber;
        public int number;
        public Locale numberLocale;

        @Nullable
        public String text;

        @Dimension(unit = 1)
        public Integer verticalOffsetWithText;

        @Dimension(unit = 1)
        public Integer verticalOffsetWithoutText;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public State() {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.maxNumber = -2;
            this.isVisible = Boolean.TRUE;
        }

        public State(@NonNull Parcel parcel) {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.maxNumber = -2;
            this.isVisible = Boolean.TRUE;
            this.badgeResId = parcel.readInt();
            this.backgroundColor = (Integer) parcel.readSerializable();
            this.badgeTextColor = (Integer) parcel.readSerializable();
            this.badgeTextAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeShapeAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeShapeAppearanceOverlayResId = (Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceOverlayResId = (Integer) parcel.readSerializable();
            this.alpha = parcel.readInt();
            this.text = parcel.readString();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.maxNumber = parcel.readInt();
            this.contentDescriptionForText = parcel.readString();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = (Integer) parcel.readSerializable();
            this.badgeHorizontalPadding = (Integer) parcel.readSerializable();
            this.badgeVerticalPadding = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithText = (Integer) parcel.readSerializable();
            this.largeFontVerticalOffsetAdjustment = (Integer) parcel.readSerializable();
            this.additionalHorizontalOffset = (Integer) parcel.readSerializable();
            this.additionalVerticalOffset = (Integer) parcel.readSerializable();
            this.isVisible = (Boolean) parcel.readSerializable();
            this.numberLocale = (Locale) parcel.readSerializable();
            this.autoAdjustToWithinGrandparentBounds = (Boolean) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.badgeResId);
            parcel.writeSerializable(this.backgroundColor);
            parcel.writeSerializable(this.badgeTextColor);
            parcel.writeSerializable(this.badgeTextAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceOverlayResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceOverlayResId);
            parcel.writeInt(this.alpha);
            parcel.writeString(this.text);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeInt(this.maxNumber);
            CharSequence charSequence = this.contentDescriptionForText;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.contentDescriptionNumberless;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeSerializable(this.badgeGravity);
            parcel.writeSerializable(this.badgeHorizontalPadding);
            parcel.writeSerializable(this.badgeVerticalPadding);
            parcel.writeSerializable(this.horizontalOffsetWithoutText);
            parcel.writeSerializable(this.verticalOffsetWithoutText);
            parcel.writeSerializable(this.horizontalOffsetWithText);
            parcel.writeSerializable(this.verticalOffsetWithText);
            parcel.writeSerializable(this.largeFontVerticalOffsetAdjustment);
            parcel.writeSerializable(this.additionalHorizontalOffset);
            parcel.writeSerializable(this.additionalVerticalOffset);
            parcel.writeSerializable(this.isVisible);
            parcel.writeSerializable(this.numberLocale);
            parcel.writeSerializable(this.autoAdjustToWithinGrandparentBounds);
        }
    }
}
