package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FloatingActionButton.kt */
@Metadata(m7104d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u001az\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u008c\u0001\u0010\n\u001a\u00020\u000b2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001c2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001c2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001ao\u0010&\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001ao\u0010)\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010(\u001ao\u0010+\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010(\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, m7105d2 = {"ExtendedFabCollapseAnimation", "Landroidx/compose/animation/ExitTransition;", "ExtendedFabEndIconPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabExpandAnimation", "Landroidx/compose/animation/EnterTransition;", "ExtendedFabMinimumWidth", "ExtendedFabStartIconPadding", "ExtendedFabTextPadding", "ExtendedFloatingActionButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "ExtendedFloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "text", "icon", "expanded", "", "ExtendedFloatingActionButton-ElI5-7k", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", FloatingActionButton.LOG_TAG, "FloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LargeFloatingActionButton", "LargeFloatingActionButton-X-z6DiA", "SmallFloatingActionButton", "SmallFloatingActionButton-X-z6DiA", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,671:1\n1116#2,6:672\n1116#2,6:678\n1116#2,6:684\n1116#2,6:690\n1116#2,6:696\n154#3:702\n154#3:703\n154#3:704\n154#3:705\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n*L\n101#1:672,6\n164#1:678,6\n216#1:684,6\n271#1:690,6\n341#1:696,6\n637#1:702\n639#1:703\n641#1:704\n643#1:705\n*E\n"})
/* loaded from: classes4.dex */
public final class FloatingActionButtonKt {

    @NotNull
    private static final ExitTransition ExtendedFabCollapseAnimation;

    @NotNull
    private static final EnterTransition ExtendedFabExpandAnimation;
    private static final float ExtendedFabStartIconPadding = C2046Dp.m13666constructorimpl(16);
    private static final float ExtendedFabEndIconPadding = C2046Dp.m13666constructorimpl(12);
    private static final float ExtendedFabTextPadding = C2046Dp.m13666constructorimpl(20);
    private static final float ExtendedFabMinimumWidth = C2046Dp.m13666constructorimpl(80);

    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: FloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9476FloatingActionButtonXz6DiA(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long containerColor;
        final long j3;
        FloatingActionButtonElevation floatingActionButtonElevationM9468elevationxZ9QkE;
        int i4;
        Modifier modifier2;
        Shape shape3;
        int i5;
        long jM9292contentColorForek8zF_U;
        long j4;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        MutableInteractionSource mutableInteractionSource3;
        final Shape shape4;
        final long j5;
        final long j6;
        final Modifier modifier3;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-731723913);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    int i9 = composerStartRestartGroup.changed(shape2) ? 256 : 128;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                i3 |= i9;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    containerColor = j;
                    int i10 = composerStartRestartGroup.changed(containerColor) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    containerColor = j;
                }
                i3 |= i10;
            } else {
                containerColor = j;
            }
            if ((i & CpioConstants.C_ISBLK) != 0) {
                if ((i2 & 16) == 0) {
                    j3 = j2;
                    int i11 = composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                    i3 |= i11;
                } else {
                    j3 = j2;
                }
                i3 |= i11;
            } else {
                j3 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation;
                    int i12 = composerStartRestartGroup.changed(floatingActionButtonElevationM9468elevationxZ9QkE) ? 131072 : 65536;
                    i3 |= i12;
                } else {
                    floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation;
                }
                i3 |= i12;
            } else {
                floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier2 = i8 == 0 ? Modifier.INSTANCE : modifier;
                    if ((i2 & 4) == 0) {
                        i3 &= -897;
                        shape3 = FloatingActionButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i2 & 16) == 0) {
                        i5 = i3 & (-57345);
                        jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 9) & 14);
                    } else {
                        i5 = i3;
                        jM9292contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 32) == 0) {
                        j4 = containerColor;
                        floatingActionButtonElevationM9468elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m9468elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                        i6 = i5 & (-458753);
                    } else {
                        j4 = containerColor;
                        i6 = i5;
                    }
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceableGroup(2094975814);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i7 = i6;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM9468elevationxZ9QkE;
                    shape2 = shape3;
                    j3 = jM9292contentColorForek8zF_U;
                    containerColor = j4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier2 = modifier;
                    mutableInteractionSource2 = mutableInteractionSource;
                    i7 = i3;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM9468elevationxZ9QkE;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-731723913, i7, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:102)");
                }
                int i13 = i7 << 3;
                SurfaceKt.m9879Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12993getButtono7Vup1c());
                    }
                }, 1, null), false, shape2, containerColor, j3, floatingActionButtonElevation2.getDefaultElevation(), floatingActionButtonElevation2.shadowElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, ((i7 >> 18) & 14) | ((i7 >> 12) & 112)).getValue().m13680unboximpl(), null, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1249316354, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                    public final void invoke(@Nullable Composer composer2, int i14) {
                        if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1249316354, i14, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:113)");
                            }
                            long j7 = j3;
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), ExtendedFabPrimaryTokens.INSTANCE.getLabelTextFont());
                            final Function2<Composer, Integer, Unit> function22 = function2;
                            ProvideContentColorTextStyleKt.m9663ProvideContentColorTextStyle3JVO9M(j7, textStyleFromToken, ComposableLambdaKt.composableLambda(composer2, -1771489750, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i15) {
                                    if ((i15 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1771489750, i15, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:117)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        FabPrimaryTokens fabPrimaryTokens = FabPrimaryTokens.INSTANCE;
                                        Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(companion, fabPrimaryTokens.m10411getContainerWidthD9Ej5fM(), fabPrimaryTokens.m10410getContainerHeightD9Ej5fM());
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function23 = function22;
                                        composer3.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                        composer3.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8156defaultMinSizeVpY3zN4);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function23.invoke(composer3, 0);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, (i7 & 14) | (i13 & 7168) | (57344 & i13) | (i13 & 458752) | ((i7 << 9) & 1879048192), 6, 260);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                shape4 = shape2;
                j5 = containerColor;
                j6 = j3;
                modifier3 = modifier2;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                mutableInteractionSource3 = mutableInteractionSource;
                shape4 = shape2;
                j5 = containerColor;
                j6 = j3;
                floatingActionButtonElevation3 = floatingActionButtonElevationM9468elevationxZ9QkE;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i14) {
                        FloatingActionButtonKt.m9476FloatingActionButtonXz6DiA(function0, modifier3, shape4, j5, j6, floatingActionButtonElevation3, mutableInteractionSource4, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & CpioConstants.C_ISBLK) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i4 == 0) {
                }
                i7 = i6;
                floatingActionButtonElevation2 = floatingActionButtonElevationM9468elevationxZ9QkE;
                shape2 = shape3;
                j3 = jM9292contentColorForek8zF_U;
                containerColor = j4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i132 = i7 << 3;
                SurfaceKt.m9879Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12993getButtono7Vup1c());
                    }
                }, 1, null), false, shape2, containerColor, j3, floatingActionButtonElevation2.getDefaultElevation(), floatingActionButtonElevation2.shadowElevation$material3_release(mutableInteractionSource2, composerStartRestartGroup, ((i7 >> 18) & 14) | ((i7 >> 12) & 112)).getValue().m13680unboximpl(), null, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1249316354, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                    public final void invoke(@Nullable Composer composer2, int i14) {
                        if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1249316354, i14, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:113)");
                            }
                            long j7 = j3;
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), ExtendedFabPrimaryTokens.INSTANCE.getLabelTextFont());
                            final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
                            ProvideContentColorTextStyleKt.m9663ProvideContentColorTextStyle3JVO9M(j7, textStyleFromToken, ComposableLambdaKt.composableLambda(composer2, -1771489750, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i15) {
                                    if ((i15 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1771489750, i15, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:117)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        FabPrimaryTokens fabPrimaryTokens = FabPrimaryTokens.INSTANCE;
                                        Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(companion, fabPrimaryTokens.m10411getContainerWidthD9Ej5fM(), fabPrimaryTokens.m10410getContainerHeightD9Ej5fM());
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function23 = function22;
                                        composer3.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                        composer3.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8156defaultMinSizeVpY3zN4);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function23.invoke(composer3, 0);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, (i7 & 14) | (i132 & 7168) | (57344 & i132) | (i132 & 458752) | ((i7 << 9) & 1879048192), 6, 260);
                if (ComposerKt.isTraceInProgress()) {
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                shape4 = shape2;
                j5 = containerColor;
                j6 = j3;
                modifier3 = modifier2;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0106  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: SmallFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9478SmallFloatingActionButtonXz6DiA(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long containerColor;
        long j3;
        FloatingActionButtonElevation floatingActionButtonElevationM9468elevationxZ9QkE;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        Shape smallShape;
        int i5;
        long jM9292contentColorForek8zF_U;
        long j4;
        int i6;
        int i7;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        final long j5;
        final long j6;
        final Modifier modifier3;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1444748300);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    int i9 = composerStartRestartGroup.changed(shape2) ? 256 : 128;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                i3 |= i9;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    containerColor = j;
                    int i10 = composerStartRestartGroup.changed(containerColor) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    containerColor = j;
                }
                i3 |= i10;
            } else {
                containerColor = j;
            }
            if ((i & CpioConstants.C_ISBLK) != 0) {
                if ((i2 & 16) == 0) {
                    j3 = j2;
                    int i11 = composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                    i3 |= i11;
                } else {
                    j3 = j2;
                }
                i3 |= i11;
            } else {
                j3 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation;
                    int i12 = composerStartRestartGroup.changed(floatingActionButtonElevationM9468elevationxZ9QkE) ? 131072 : 65536;
                    i3 |= i12;
                } else {
                    floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation;
                }
                i3 |= i12;
            } else {
                floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else {
                if ((1572864 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                }
                if ((i2 & 128) == 0) {
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i8 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 4) == 0) {
                                i3 &= -897;
                                smallShape = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composerStartRestartGroup, 6);
                            } else {
                                smallShape = shape2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            }
                            if ((i2 & 16) == 0) {
                                i5 = i3 & (-57345);
                                jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 9) & 14);
                            } else {
                                i5 = i3;
                                jM9292contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 32) == 0) {
                                j4 = containerColor;
                                floatingActionButtonElevationM9468elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m9468elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                                i6 = i5 & (-458753);
                            } else {
                                j4 = containerColor;
                                i6 = i5;
                            }
                            if (i4 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(585135857);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i7 = i6;
                                floatingActionButtonElevation2 = floatingActionButtonElevationM9468elevationxZ9QkE;
                            } else {
                                i7 = i6;
                                floatingActionButtonElevation2 = floatingActionButtonElevationM9468elevationxZ9QkE;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            shape2 = smallShape;
                            j3 = jM9292contentColorForek8zF_U;
                            containerColor = j4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier2 = modifier;
                            i7 = i3;
                            floatingActionButtonElevation2 = floatingActionButtonElevationM9468elevationxZ9QkE;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1444748300, i7, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:165)");
                        }
                        FabPrimarySmallTokens fabPrimarySmallTokens = FabPrimarySmallTokens.INSTANCE;
                        m9476FloatingActionButtonXz6DiA(function0, SizeKt.m8176sizeInqDBjuR0$default(modifier2, fabPrimarySmallTokens.m10400getContainerWidthD9Ej5fM(), fabPrimarySmallTokens.m10399getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape2, containerColor, j3, floatingActionButtonElevation2, mutableInteractionSource3, function2, composerStartRestartGroup, i7 & 33554318, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource3;
                        shape3 = shape2;
                        j5 = containerColor;
                        j6 = j3;
                        modifier3 = modifier2;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        shape3 = shape2;
                        j5 = containerColor;
                        j6 = j3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM9468elevationxZ9QkE;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i13) {
                                FloatingActionButtonKt.m9478SmallFloatingActionButtonXz6DiA(function0, modifier3, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource4, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if ((i2 & 4) == 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                        if (i4 == 0) {
                        }
                        shape2 = smallShape;
                        j3 = jM9292contentColorForek8zF_U;
                        containerColor = j4;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        FabPrimarySmallTokens fabPrimarySmallTokens2 = FabPrimarySmallTokens.INSTANCE;
                        m9476FloatingActionButtonXz6DiA(function0, SizeKt.m8176sizeInqDBjuR0$default(modifier2, fabPrimarySmallTokens2.m10400getContainerWidthD9Ej5fM(), fabPrimarySmallTokens2.m10399getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape2, containerColor, j3, floatingActionButtonElevation2, mutableInteractionSource3, function2, composerStartRestartGroup, i7 & 33554318, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        mutableInteractionSource2 = mutableInteractionSource3;
                        shape3 = shape2;
                        j5 = containerColor;
                        j6 = j3;
                        modifier3 = modifier2;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 128) == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & CpioConstants.C_ISBLK) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 128) == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0106  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: LargeFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9477LargeFloatingActionButtonXz6DiA(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long containerColor;
        long j3;
        FloatingActionButtonElevation floatingActionButtonElevationM9468elevationxZ9QkE;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        Shape largeShape;
        int i5;
        long jM9292contentColorForek8zF_U;
        long j4;
        int i6;
        int i7;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        final long j5;
        final long j6;
        final Modifier modifier3;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1650866856);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    int i9 = composerStartRestartGroup.changed(shape2) ? 256 : 128;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                i3 |= i9;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    containerColor = j;
                    int i10 = composerStartRestartGroup.changed(containerColor) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    containerColor = j;
                }
                i3 |= i10;
            } else {
                containerColor = j;
            }
            if ((i & CpioConstants.C_ISBLK) != 0) {
                if ((i2 & 16) == 0) {
                    j3 = j2;
                    int i11 = composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                    i3 |= i11;
                } else {
                    j3 = j2;
                }
                i3 |= i11;
            } else {
                j3 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation;
                    int i12 = composerStartRestartGroup.changed(floatingActionButtonElevationM9468elevationxZ9QkE) ? 131072 : 65536;
                    i3 |= i12;
                } else {
                    floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation;
                }
                i3 |= i12;
            } else {
                floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else {
                if ((1572864 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                }
                if ((i2 & 128) == 0) {
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i8 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 4) == 0) {
                                i3 &= -897;
                                largeShape = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composerStartRestartGroup, 6);
                            } else {
                                largeShape = shape2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            }
                            if ((i2 & 16) == 0) {
                                i5 = i3 & (-57345);
                                jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 9) & 14);
                            } else {
                                i5 = i3;
                                jM9292contentColorForek8zF_U = j3;
                            }
                            if ((i2 & 32) == 0) {
                                j4 = containerColor;
                                floatingActionButtonElevationM9468elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m9468elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                                i6 = i5 & (-458753);
                            } else {
                                j4 = containerColor;
                                i6 = i5;
                            }
                            if (i4 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(2133197715);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i7 = i6;
                                floatingActionButtonElevation2 = floatingActionButtonElevationM9468elevationxZ9QkE;
                            } else {
                                i7 = i6;
                                floatingActionButtonElevation2 = floatingActionButtonElevationM9468elevationxZ9QkE;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            shape2 = largeShape;
                            j3 = jM9292contentColorForek8zF_U;
                            containerColor = j4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier2 = modifier;
                            i7 = i3;
                            floatingActionButtonElevation2 = floatingActionButtonElevationM9468elevationxZ9QkE;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1650866856, i7, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:217)");
                        }
                        FabPrimaryLargeTokens fabPrimaryLargeTokens = FabPrimaryLargeTokens.INSTANCE;
                        m9476FloatingActionButtonXz6DiA(function0, SizeKt.m8176sizeInqDBjuR0$default(modifier2, fabPrimaryLargeTokens.m10389getContainerWidthD9Ej5fM(), fabPrimaryLargeTokens.m10388getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape2, containerColor, j3, floatingActionButtonElevation2, mutableInteractionSource3, function2, composerStartRestartGroup, i7 & 33554318, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource3;
                        shape3 = shape2;
                        j5 = containerColor;
                        j6 = j3;
                        modifier3 = modifier2;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        shape3 = shape2;
                        j5 = containerColor;
                        j6 = j3;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM9468elevationxZ9QkE;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i13) {
                                FloatingActionButtonKt.m9477LargeFloatingActionButtonXz6DiA(function0, modifier3, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource4, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if ((i2 & 4) == 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                        if (i4 == 0) {
                        }
                        shape2 = largeShape;
                        j3 = jM9292contentColorForek8zF_U;
                        containerColor = j4;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        FabPrimaryLargeTokens fabPrimaryLargeTokens2 = FabPrimaryLargeTokens.INSTANCE;
                        m9476FloatingActionButtonXz6DiA(function0, SizeKt.m8176sizeInqDBjuR0$default(modifier2, fabPrimaryLargeTokens2.m10389getContainerWidthD9Ej5fM(), fabPrimaryLargeTokens2.m10388getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape2, containerColor, j3, floatingActionButtonElevation2, mutableInteractionSource3, function2, composerStartRestartGroup, i7 & 33554318, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        mutableInteractionSource2 = mutableInteractionSource3;
                        shape3 = shape2;
                        j5 = containerColor;
                        j6 = j3;
                        modifier3 = modifier2;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 128) == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & CpioConstants.C_ISBLK) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 128) == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ExtendedFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9475ExtendedFloatingActionButtonXz6DiA(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long containerColor;
        long j3;
        FloatingActionButtonElevation floatingActionButtonElevationM9468elevationxZ9QkE;
        int i4;
        Modifier modifier2;
        Shape extendedFabShape;
        int i5;
        long jM9292contentColorForek8zF_U;
        long j4;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        final long j5;
        final long j6;
        final Modifier modifier3;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-326283107);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    int i9 = composerStartRestartGroup.changed(shape2) ? 256 : 128;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                i3 |= i9;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    containerColor = j;
                    int i10 = composerStartRestartGroup.changed(containerColor) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    containerColor = j;
                }
                i3 |= i10;
            } else {
                containerColor = j;
            }
            if ((i & CpioConstants.C_ISBLK) != 0) {
                if ((i2 & 16) == 0) {
                    j3 = j2;
                    int i11 = composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                    i3 |= i11;
                } else {
                    j3 = j2;
                }
                i3 |= i11;
            } else {
                j3 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation;
                    int i12 = composerStartRestartGroup.changed(floatingActionButtonElevationM9468elevationxZ9QkE) ? 131072 : 65536;
                    i3 |= i12;
                } else {
                    floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation;
                }
                i3 |= i12;
            } else {
                floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier2 = i8 == 0 ? Modifier.INSTANCE : modifier;
                    if ((i2 & 4) == 0) {
                        i3 &= -897;
                        extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                    } else {
                        extendedFabShape = shape2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    }
                    if ((i2 & 16) == 0) {
                        i5 = i3 & (-57345);
                        jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 9) & 14);
                    } else {
                        i5 = i3;
                        jM9292contentColorForek8zF_U = j3;
                    }
                    if ((i2 & 32) == 0) {
                        j4 = containerColor;
                        floatingActionButtonElevationM9468elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m9468elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                        i6 = i5 & (-458753);
                    } else {
                        j4 = containerColor;
                        i6 = i5;
                    }
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceableGroup(-2039336939);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i7 = i6;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM9468elevationxZ9QkE;
                    shape2 = extendedFabShape;
                    j3 = jM9292contentColorForek8zF_U;
                    containerColor = j4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier2 = modifier;
                    mutableInteractionSource2 = mutableInteractionSource;
                    i7 = i3;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM9468elevationxZ9QkE;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-326283107, i7, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:272)");
                }
                m9476FloatingActionButtonXz6DiA(function0, modifier2, shape2, containerColor, j3, floatingActionButtonElevation2, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 398457247, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                    public final void invoke(@Nullable Composer composer2, int i13) {
                        if ((i13 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(398457247, i13, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:282)");
                            }
                            Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(SizeKt.m8176sizeInqDBjuR0$default(Modifier.INSTANCE, FloatingActionButtonKt.ExtendedFabMinimumWidth, 0.0f, 0.0f, 0.0f, 14, null), FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 2, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8125paddingVpY3zN4$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            function32.invoke(RowScopeInstance.INSTANCE, composer2, 6);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, (i7 & 14) | 12582912 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (i7 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                shape3 = shape2;
                j5 = containerColor;
                j6 = j3;
                modifier3 = modifier2;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                mutableInteractionSource3 = mutableInteractionSource;
                shape3 = shape2;
                j5 = containerColor;
                j6 = j3;
                floatingActionButtonElevation3 = floatingActionButtonElevationM9468elevationxZ9QkE;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i13) {
                        FloatingActionButtonKt.m9475ExtendedFloatingActionButtonXz6DiA(function0, modifier3, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & CpioConstants.C_ISBLK) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i4 == 0) {
                }
                i7 = i6;
                floatingActionButtonElevation2 = floatingActionButtonElevationM9468elevationxZ9QkE;
                shape2 = extendedFabShape;
                j3 = jM9292contentColorForek8zF_U;
                containerColor = j4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m9476FloatingActionButtonXz6DiA(function0, modifier2, shape2, containerColor, j3, floatingActionButtonElevation2, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 398457247, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                    public final void invoke(@Nullable Composer composer2, int i13) {
                        if ((i13 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(398457247, i13, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:282)");
                            }
                            Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(SizeKt.m8176sizeInqDBjuR0$default(Modifier.INSTANCE, FloatingActionButtonKt.ExtendedFabMinimumWidth, 0.0f, 0.0f, 0.0f, 14, null), FloatingActionButtonKt.ExtendedFabTextPadding, 0.0f, 2, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8125paddingVpY3zN4$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            function32.invoke(RowScopeInstance.INSTANCE, composer2, 6);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, (i7 & 14) | 12582912 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (i7 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                shape3 = shape2;
                j5 = containerColor;
                j6 = j3;
                modifier3 = modifier2;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0100  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ExtendedFloatingActionButton-ElI5-7k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9474ExtendedFloatingActionButtonElI57k(@NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @NotNull final Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, long j, long j2, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        final boolean z2;
        Shape shape2;
        long j3;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i6;
        Modifier modifier3;
        final Shape extendedFabShape;
        final long containerColor;
        long jM9292contentColorForek8zF_U;
        FloatingActionButtonElevation floatingActionButtonElevationM9468elevationxZ9QkE;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier4;
        final boolean z3;
        final long j4;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1387401842);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            int i8 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i3 |= i8;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i8;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            j3 = j;
                            int i9 = composerStartRestartGroup.changed(j3) ? 1048576 : 524288;
                            i3 |= i9;
                        } else {
                            j3 = j;
                        }
                        i3 |= i9;
                    } else {
                        j3 = j;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(j2)) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) != 0) {
                        if ((i2 & 256) == 0) {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                            if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                                i7 = 67108864;
                            }
                            i3 |= i7;
                        } else {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                        }
                        i7 = NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        i3 |= i7;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i6 = i2 & 512;
                    if (i6 != 0) {
                        if ((805306368 & i) == 0) {
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            z3 = z2;
                            extendedFabShape = shape2;
                            containerColor = j3;
                            floatingActionButtonElevation3 = floatingActionButtonElevation2;
                            j4 = j2;
                            mutableInteractionSource3 = mutableInteractionSource;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 32) == 0) {
                                    extendedFabShape = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composerStartRestartGroup, 6);
                                    i3 &= -458753;
                                } else {
                                    extendedFabShape = shape2;
                                }
                                if ((i2 & 64) == 0) {
                                    containerColor = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    containerColor = j3;
                                }
                                if ((i2 & 128) == 0) {
                                    jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 18) & 14);
                                    i3 &= -29360129;
                                } else {
                                    jM9292contentColorForek8zF_U = j2;
                                }
                                if ((i2 & 256) == 0) {
                                    floatingActionButtonElevationM9468elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m9468elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                                    i3 &= -234881025;
                                } else {
                                    floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation2;
                                }
                                if (i6 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-2039333397);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                mutableInteractionSource2 = mutableInteractionSource;
                                modifier3 = modifier2;
                                extendedFabShape = shape2;
                                containerColor = j3;
                                floatingActionButtonElevationM9468elevationxZ9QkE = floatingActionButtonElevation2;
                                jM9292contentColorForek8zF_U = j2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1387401842, i3, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:341)");
                            }
                            int i10 = i3 >> 6;
                            int i11 = i3 >> 9;
                            m9476FloatingActionButtonXz6DiA(function0, modifier3, extendedFabShape, containerColor, jM9292contentColorForek8zF_U, floatingActionButtonElevationM9468elevationxZ9QkE, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1172118032, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    float fM13666constructorimpl;
                                    float fM13666constructorimpl2;
                                    float fM10411getContainerWidthD9Ej5fM;
                                    if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1172118032, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:351)");
                                        }
                                        if (z2) {
                                            fM13666constructorimpl = FloatingActionButtonKt.ExtendedFabStartIconPadding;
                                        } else {
                                            fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                        }
                                        float f = fM13666constructorimpl;
                                        if (z2) {
                                            fM13666constructorimpl2 = FloatingActionButtonKt.ExtendedFabTextPadding;
                                        } else {
                                            fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(0);
                                        }
                                        float f2 = fM13666constructorimpl2;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        if (z2) {
                                            fM10411getContainerWidthD9Ej5fM = FloatingActionButtonKt.ExtendedFabMinimumWidth;
                                        } else {
                                            fM10411getContainerWidthD9Ej5fM = FabPrimaryTokens.INSTANCE.m10411getContainerWidthD9Ej5fM();
                                        }
                                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8176sizeInqDBjuR0$default(companion, fM10411getContainerWidthD9Ej5fM, 0.0f, 0.0f, 0.0f, 14, null), f, 0.0f, f2, 0.0f, 10, null);
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Arrangement.Horizontal start = z2 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function23 = function22;
                                        boolean z4 = z2;
                                        final Function2<Composer, Integer, Unit> function24 = function2;
                                        composer2.startReplaceableGroup(693286680);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 48);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        function23.invoke(composer2, 0);
                                        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z4, (Modifier) null, FloatingActionButtonKt.ExtendedFabExpandAnimation, FloatingActionButtonKt.ExtendedFabCollapseAnimation, (String) null, ComposableLambdaKt.composableLambda(composer2, 176242764, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer3, int i13) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(176242764, i13, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:370)");
                                                }
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion3, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1.1
                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        invoke2(semanticsPropertyReceiver);
                                                        return Unit.INSTANCE;
                                                    }
                                                });
                                                Function2<Composer, Integer, Unit> function25 = function24;
                                                composer3.startReplaceableGroup(693286680);
                                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                                                composer3.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierClearAndSetSemantics);
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor2);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion3, FloatingActionButtonKt.ExtendedFabEndIconPadding), composer3, 6);
                                                function25.invoke(composer3, 0);
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), composer2, 1600518, 18);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, (i10 & 112) | (i10 & 14) | 12582912 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (i11 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            z3 = z2;
                            j4 = jM9292contentColorForek8zF_U;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM9468elevationxZ9QkE;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    FloatingActionButtonKt.m9474ExtendedFloatingActionButtonElI57k(function2, function22, function0, modifier4, z3, extendedFabShape, containerColor, j4, floatingActionButtonElevation3, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 32) == 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                            if ((i2 & 128) == 0) {
                            }
                            if ((i2 & 256) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i102 = i3 >> 6;
                            int i112 = i3 >> 9;
                            m9476FloatingActionButtonXz6DiA(function0, modifier3, extendedFabShape, containerColor, jM9292contentColorForek8zF_U, floatingActionButtonElevationM9468elevationxZ9QkE, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1172118032, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    float fM13666constructorimpl;
                                    float fM13666constructorimpl2;
                                    float fM10411getContainerWidthD9Ej5fM;
                                    if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1172118032, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:351)");
                                        }
                                        if (z2) {
                                            fM13666constructorimpl = FloatingActionButtonKt.ExtendedFabStartIconPadding;
                                        } else {
                                            fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                        }
                                        float f = fM13666constructorimpl;
                                        if (z2) {
                                            fM13666constructorimpl2 = FloatingActionButtonKt.ExtendedFabTextPadding;
                                        } else {
                                            fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(0);
                                        }
                                        float f2 = fM13666constructorimpl2;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        if (z2) {
                                            fM10411getContainerWidthD9Ej5fM = FloatingActionButtonKt.ExtendedFabMinimumWidth;
                                        } else {
                                            fM10411getContainerWidthD9Ej5fM = FabPrimaryTokens.INSTANCE.m10411getContainerWidthD9Ej5fM();
                                        }
                                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8176sizeInqDBjuR0$default(companion, fM10411getContainerWidthD9Ej5fM, 0.0f, 0.0f, 0.0f, 14, null), f, 0.0f, f2, 0.0f, 10, null);
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Arrangement.Horizontal start = z2 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function23 = function22;
                                        boolean z4 = z2;
                                        final Function2<? super Composer, ? super Integer, Unit> function24 = function2;
                                        composer2.startReplaceableGroup(693286680);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 48);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        function23.invoke(composer2, 0);
                                        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z4, (Modifier) null, FloatingActionButtonKt.ExtendedFabExpandAnimation, FloatingActionButtonKt.ExtendedFabCollapseAnimation, (String) null, ComposableLambdaKt.composableLambda(composer2, 176242764, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer3, int i13) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(176242764, i13, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:370)");
                                                }
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion3, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1.1
                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        invoke2(semanticsPropertyReceiver);
                                                        return Unit.INSTANCE;
                                                    }
                                                });
                                                Function2<Composer, Integer, Unit> function25 = function24;
                                                composer3.startReplaceableGroup(693286680);
                                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                                                composer3.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierClearAndSetSemantics);
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor2);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion3, FloatingActionButtonKt.ExtendedFabEndIconPadding), composer3, 6);
                                                function25.invoke(composer3, 0);
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), composer2, 1600518, 18);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, (i102 & 112) | (i102 & 14) | 12582912 | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (i112 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            z3 = z2;
                            j4 = jM9292contentColorForek8zF_U;
                            floatingActionButtonElevation3 = floatingActionButtonElevationM9468elevationxZ9QkE;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z2 = z;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) != 0) {
                }
                i6 = i2 & 512;
                if (i6 != 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z2 = z;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) != 0) {
            }
            i6 = i2 & 512;
            if (i6 != 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z2 = z;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) != 0) {
        }
        i6 = i2 & 512;
        if (i6 != 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    static {
        MotionTokens motionTokens = MotionTokens.INSTANCE;
        ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, motionTokens.getEasingLinearCubicBezier(), 2, null), 0.0f, 2, null);
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, motionTokens.getEasingEmphasizedCubicBezier(), 2, null);
        Alignment.Companion companion = Alignment.INSTANCE;
        ExtendedFabCollapseAnimation = exitTransitionFadeOut$default.plus(EnterExitTransitionKt.shrinkHorizontally$default(tweenSpecTween$default, companion.getStart(), false, null, 12, null));
        ExtendedFabExpandAnimation = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(200, 100, motionTokens.getEasingLinearCubicBezier()), 0.0f, 2, null).plus(EnterExitTransitionKt.expandHorizontally$default(AnimationSpecKt.tween$default(500, 0, motionTokens.getEasingEmphasizedCubicBezier(), 2, null), companion.getStart(), false, null, 12, null));
    }
}
