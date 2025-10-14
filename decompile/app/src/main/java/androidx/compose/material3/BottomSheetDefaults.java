package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SheetDefaults.kt */
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0016\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0017\u0010\nR\u0011\u0010\u0018\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m7105d2 = {"Landroidx/compose/material3/BottomSheetDefaults;", "", "()V", "ContainerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "ExpandedShape", "Landroidx/compose/ui/graphics/Shape;", "getExpandedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "HiddenShape", "getHiddenShape", "ScrimColor", "getScrimColor", "SheetMaxWidth", "getSheetMaxWidth-D9Ej5fM", "SheetPeekHeight", "getSheetPeekHeight-D9Ej5fM", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "DragHandle", "", "modifier", "Landroidx/compose/ui/Modifier;", "width", "height", "shape", "color", "DragHandle-lgZ2HuY", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/runtime/Composer;II)V", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,503:1\n127#2:504\n1116#3,6:505\n154#4:511\n154#4:512\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n*L\n398#1:504\n402#1:505,6\n372#1:511\n377#1:512\n*E\n"})
/* loaded from: classes3.dex */
public final class BottomSheetDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final BottomSheetDefaults INSTANCE = new BottomSheetDefaults();
    private static final float Elevation = SheetBottomTokens.INSTANCE.m10682getDockedModalContainerElevationD9Ej5fM();
    private static final float SheetPeekHeight = C2046Dp.m13666constructorimpl(56);
    private static final float SheetMaxWidth = C2046Dp.m13666constructorimpl(640);

    private BottomSheetDefaults() {
    }

    @Composable
    @JvmName(name = "getHiddenShape")
    @NotNull
    public final Shape getHiddenShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1971658024);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1971658024, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:348)");
        }
        Shape value = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedMinimizedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @Composable
    @JvmName(name = "getExpandedShape")
    @NotNull
    public final Shape getExpandedShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1683783414);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1683783414, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:353)");
        }
        Shape value = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(433375448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(433375448, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:358)");
        }
        long value = ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getElevation-D9Ej5fM */
    public final float m9147getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    @JvmName(name = "getScrimColor")
    public final long getScrimColor(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-2040719176);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2040719176, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:366)");
        }
        long jM11339copywmQWz5c$default = Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jM11339copywmQWz5c$default;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM */
    public final float m9149getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }

    /* renamed from: getSheetMaxWidth-D9Ej5fM */
    public final float m9148getSheetMaxWidthD9Ej5fM() {
        return SheetMaxWidth;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-511309409);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511309409, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:383)");
        }
        WindowInsets windowInsetsM8198onlybOOhFvg = WindowInsetsKt.m8198onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.INSTANCE, composer, 6), WindowInsetsSides.INSTANCE.m8224getVerticalJoeWqyM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return windowInsetsM8198onlybOOhFvg;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: DragHandle-lgZ2HuY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9146DragHandlelgZ2HuY(@Nullable Modifier modifier, float f, float f2, @Nullable Shape shape, long j, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final float fM10681getDockedDragHandleWidthD9Ej5fM;
        int i4;
        float fM10680getDockedDragHandleHeightD9Ej5fM;
        Shape extraLarge;
        long jM11339copywmQWz5c$default;
        final Modifier modifier3;
        final String strM9866getStringNWtq28;
        boolean zChanged;
        Object objRememberedValue;
        final Shape shape2;
        final float f3;
        final float f4;
        final long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1364277227);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                fM10681getDockedDragHandleWidthD9Ej5fM = f;
                i3 |= composerStartRestartGroup.changed(fM10681getDockedDragHandleWidthD9Ej5fM) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    fM10680getDockedDragHandleHeightD9Ej5fM = f2;
                    i3 |= composerStartRestartGroup.changed(fM10680getDockedDragHandleHeightD9Ej5fM) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        extraLarge = shape;
                        int i7 = composerStartRestartGroup.changed(extraLarge) ? 2048 : 1024;
                        i3 |= i7;
                    } else {
                        extraLarge = shape;
                    }
                    i3 |= i7;
                } else {
                    extraLarge = shape;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        jM11339copywmQWz5c$default = j;
                        int i8 = composerStartRestartGroup.changed(jM11339copywmQWz5c$default) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        jM11339copywmQWz5c$default = j;
                    }
                    i3 |= i8;
                } else {
                    jM11339copywmQWz5c$default = j;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i6 != 0) {
                            fM10681getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m10681getDockedDragHandleWidthD9Ej5fM();
                        }
                        if (i4 != 0) {
                            fM10680getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m10680getDockedDragHandleHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                        }
                        if ((i2 & 16) != 0) {
                            jM11339copywmQWz5c$default = Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -57345;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier3 = modifier2;
                    }
                    int i9 = i3;
                    final float f5 = fM10680getDockedDragHandleHeightD9Ej5fM;
                    Shape shape3 = extraLarge;
                    long j3 = jM11339copywmQWz5c$default;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1364277227, i9, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
                    }
                    Strings.Companion companion = Strings.INSTANCE;
                    strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_drag_handle_description), composerStartRestartGroup, 0);
                    Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(modifier3, 0.0f, SheetDefaultsKt.DragHandleVerticalPadding, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-363350248);
                    zChanged = composerStartRestartGroup.changed(strM9866getStringNWtq28);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9866getStringNWtq28);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i10 = i9 >> 6;
                    SurfaceKt.m9876SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM8125paddingVpY3zN4$default, false, (Function1) objRememberedValue, 1, null), shape3, j3, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i11) {
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1039573072, i11, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:405)");
                                }
                                BoxKt.Box(SizeKt.m8174sizeVpY3zN4(Modifier.INSTANCE, fM10681getDockedDragHandleWidthD9Ej5fM, f5), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, (i10 & 112) | 12582912 | (i10 & 896), 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape2 = shape3;
                    f3 = f5;
                    f4 = fM10681getDockedDragHandleWidthD9Ej5fM;
                    j2 = j3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    f4 = fM10681getDockedDragHandleWidthD9Ej5fM;
                    f3 = fM10680getDockedDragHandleHeightD9Ej5fM;
                    shape2 = extraLarge;
                    j2 = jM11339copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i11) {
                            this.$tmp1_rcvr.m9146DragHandlelgZ2HuY(modifier3, f4, f3, shape2, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            fM10680getDockedDragHandleHeightD9Ej5fM = f2;
            if ((i & 3072) == 0) {
            }
            if ((i & CpioConstants.C_ISBLK) == 0) {
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    int i92 = i3;
                    final float f52 = fM10680getDockedDragHandleHeightD9Ej5fM;
                    Shape shape32 = extraLarge;
                    long j32 = jM11339copywmQWz5c$default;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Strings.Companion companion2 = Strings.INSTANCE;
                    strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_drag_handle_description), composerStartRestartGroup, 0);
                    Modifier modifierM8125paddingVpY3zN4$default2 = PaddingKt.m8125paddingVpY3zN4$default(modifier3, 0.0f, SheetDefaultsKt.DragHandleVerticalPadding, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-363350248);
                    zChanged = composerStartRestartGroup.changed(strM9866getStringNWtq28);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9866getStringNWtq28);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceableGroup();
                        int i102 = i92 >> 6;
                        SurfaceKt.m9876SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM8125paddingVpY3zN4$default2, false, (Function1) objRememberedValue, 1, null), shape32, j32, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i11) {
                                if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1039573072, i11, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:405)");
                                    }
                                    BoxKt.Box(SizeKt.m8174sizeVpY3zN4(Modifier.INSTANCE, fM10681getDockedDragHandleWidthD9Ej5fM, f52), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, (i102 & 112) | 12582912 | (i102 & 896), 120);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        shape2 = shape32;
                        f3 = f52;
                        f4 = fM10681getDockedDragHandleWidthD9Ej5fM;
                        j2 = j32;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        fM10681getDockedDragHandleWidthD9Ej5fM = f;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        fM10680getDockedDragHandleHeightD9Ej5fM = f2;
        if ((i & 3072) == 0) {
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
