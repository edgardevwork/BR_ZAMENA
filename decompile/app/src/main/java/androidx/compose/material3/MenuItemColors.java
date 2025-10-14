package androidx.compose.material3;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Menu.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010\u001a\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u001cR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m7105d2 = {"Landroidx/compose/material3/MenuItemColors;", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDisabledLeadingIconColor-0d7_KjU", "()J", "J", "getDisabledTextColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "getLeadingIconColor-0d7_KjU", "getTextColor-0d7_KjU", "getTrailingIconColor-0d7_KjU", "copy", "copy-tNS2XkQ", "(JJJJJJ)Landroidx/compose/material3/MenuItemColors;", "equals", "", "other", "hashCode", "", "enabled", "leadingIconColor-XeAY9LY$material3_release", "(ZLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/runtime/State;", "textColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trailingIconColor-XeAY9LY$material3_release", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuItemColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,407:1\n658#2:408\n646#2:409\n658#2:410\n646#2:411\n658#2:412\n646#2:413\n658#2:414\n646#2:415\n658#2:416\n646#2:417\n658#2:418\n646#2:419\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuItemColors\n*L\n165#1:408\n165#1:409\n166#1:410\n166#1:411\n167#1:412\n167#1:413\n168#1:414\n168#1:415\n169#1:416\n169#1:417\n170#1:418\n170#1:419\n*E\n"})
/* loaded from: classes4.dex */
public final class MenuItemColors {
    public static final int $stable = 0;
    private final long disabledLeadingIconColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long leadingIconColor;
    private final long textColor;
    private final long trailingIconColor;

    public /* synthetic */ MenuItemColors(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    private MenuItemColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.textColor = j;
        this.leadingIconColor = j2;
        this.trailingIconColor = j3;
        this.disabledTextColor = j4;
        this.disabledLeadingIconColor = j5;
        this.disabledTrailingIconColor = j6;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getLeadingIconColor() {
        return this.leadingIconColor;
    }

    /* renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTrailingIconColor() {
        return this.trailingIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTextColor() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledLeadingIconColor() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTrailingIconColor() {
        return this.disabledTrailingIconColor;
    }

    @Composable
    @NotNull
    public final State<Color> textColor$material3_release(boolean z, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1023108655);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1023108655, i, -1, "androidx.compose.material3.MenuItemColors.textColor (Menu.kt:178)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(z ? this.textColor : this.disabledTextColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    /* renamed from: leadingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m9568leadingIconColorXeAY9LY$material3_release(boolean z, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-395881771);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-395881771, i, -1, "androidx.compose.material3.MenuItemColors.leadingIconColor (Menu.kt:189)");
        }
        long j = z ? this.leadingIconColor : this.disabledLeadingIconColor;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    @Composable
    /* renamed from: trailingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m9569trailingIconColorXeAY9LY$material3_release(boolean z, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-892832569);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-892832569, i, -1, "androidx.compose.material3.MenuItemColors.trailingIconColor (Menu.kt:198)");
        }
        long j = z ? this.trailingIconColor : this.disabledTrailingIconColor;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) other;
        return Color.m11341equalsimpl0(this.textColor, menuItemColors.textColor) && Color.m11341equalsimpl0(this.leadingIconColor, menuItemColors.leadingIconColor) && Color.m11341equalsimpl0(this.trailingIconColor, menuItemColors.trailingIconColor) && Color.m11341equalsimpl0(this.disabledTextColor, menuItemColors.disabledTextColor) && Color.m11341equalsimpl0(this.disabledLeadingIconColor, menuItemColors.disabledLeadingIconColor) && Color.m11341equalsimpl0(this.disabledTrailingIconColor, menuItemColors.disabledTrailingIconColor);
    }

    public int hashCode() {
        return (((((((((Color.m11347hashCodeimpl(this.textColor) * 31) + Color.m11347hashCodeimpl(this.leadingIconColor)) * 31) + Color.m11347hashCodeimpl(this.trailingIconColor)) * 31) + Color.m11347hashCodeimpl(this.disabledTextColor)) * 31) + Color.m11347hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m11347hashCodeimpl(this.disabledTrailingIconColor);
    }

    @NotNull
    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final MenuItemColors m9561copytNS2XkQ(long textColor, long leadingIconColor, long trailingIconColor, long disabledTextColor, long disabledLeadingIconColor, long disabledTrailingIconColor) {
        Color.Companion companion = Color.INSTANCE;
        return new MenuItemColors(textColor != companion.m11376getUnspecified0d7_KjU() ? textColor : this.textColor, leadingIconColor != companion.m11376getUnspecified0d7_KjU() ? leadingIconColor : this.leadingIconColor, trailingIconColor != companion.m11376getUnspecified0d7_KjU() ? trailingIconColor : this.trailingIconColor, disabledTextColor != companion.m11376getUnspecified0d7_KjU() ? disabledTextColor : this.disabledTextColor, disabledLeadingIconColor != companion.m11376getUnspecified0d7_KjU() ? disabledLeadingIconColor : this.disabledLeadingIconColor, disabledTrailingIconColor != companion.m11376getUnspecified0d7_KjU() ? disabledTrailingIconColor : this.disabledTrailingIconColor, null);
    }
}
