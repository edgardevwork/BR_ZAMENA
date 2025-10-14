package com.blackhub.bronline.game.p019ui.minigameshelper;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MovingVerticalLine.kt */
@SourceDebugExtension({"SMAP\nMovingVerticalLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MovingVerticalLine.kt\ncom/blackhub/bronline/game/ui/minigameshelper/MovingVerticalLineKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,68:1\n1116#2,3:69\n1119#2,3:73\n1116#2,6:76\n1116#2,6:82\n1116#2,6:88\n154#3:72\n81#4:94\n107#4,2:95\n81#4:97\n107#4,2:98\n*S KotlinDebug\n*F\n+ 1 MovingVerticalLine.kt\ncom/blackhub/bronline/game/ui/minigameshelper/MovingVerticalLineKt\n*L\n37#1:69,3\n37#1:73,3\n38#1:76,6\n41#1:82,6\n46#1:88,6\n37#1:72\n37#1:94\n37#1:95,2\n38#1:97\n38#1:98,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MovingVerticalLineKt {
    public static final float RECTANGLE_WIDTH = 40.0f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: MovingVerticalLine-36lltbM, reason: not valid java name */
    public static final void m15011MovingVerticalLine36lltbM(final long j, final float f, final float f2, final int i, @NotNull final MutableState<Boolean> isLineHit, @Nullable Composer composer, final int i2) {
        int i3;
        int i4;
        float f3;
        C2046Dp c2046Dp;
        boolean z;
        Object obj;
        Intrinsics.checkNotNullParameter(isLineHit, "isLineHit");
        Composer composerStartRestartGroup = composer.startRestartGroup(-313044871);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            i3 |= composerStartRestartGroup.changed(isLineHit) ? 16384 : 8192;
        }
        if ((i3 & 46811) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-313044871, i3, -1, "com.blackhub.bronline.game.ui.minigameshelper.MovingVerticalLine (MovingVerticalLine.kt:35)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1119273686);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C2046Dp.m13664boximpl(C2046Dp.m13666constructorimpl(0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1119273617);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6);
            C2046Dp c2046DpM13664boximpl = C2046Dp.m13664boximpl(MovingVerticalLine_36lltbM$lambda$1(mutableState));
            composerStartRestartGroup.startReplaceableGroup(-1119273413);
            boolean z2 = ((57344 & i3) == 16384) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue3 == companion.getEmpty()) {
                i4 = i3;
                f3 = fDimensionResource;
                c2046Dp = c2046DpM13664boximpl;
                z = false;
                obj = null;
                MovingVerticalLineKt$MovingVerticalLine$1$1 movingVerticalLineKt$MovingVerticalLine$1$1 = new MovingVerticalLineKt$MovingVerticalLine$1$1(isLineHit, f, i, f2, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(movingVerticalLineKt$MovingVerticalLine$1$1);
                objRememberedValue3 = movingVerticalLineKt$MovingVerticalLine$1$1;
            } else {
                c2046Dp = c2046DpM13664boximpl;
                i4 = i3;
                f3 = fDimensionResource;
                obj = null;
                z = false;
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(c2046Dp, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 64);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj);
            composerStartRestartGroup.startReplaceableGroup(-1119273205);
            final float f4 = f3;
            boolean zChanged = composerStartRestartGroup.changed(f4) | ((i4 & 14) == 4 ? true : z);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MovingVerticalLineKt$MovingVerticalLine$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float fM11165getHeightimpl = Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc());
                        float fM11168getWidthimpl = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                        DrawScope.m11886drawRoundRectuAw5IA$default(Canvas, j, OffsetKt.Offset(MovingVerticalLineKt.MovingVerticalLine_36lltbM$lambda$1(mutableState), 0.0f), androidx.compose.p003ui.geometry.SizeKt.Size(40.0f, Math.abs(fM11165getHeightimpl)), CornerRadiusKt.CornerRadius$default(Canvas.mo7874toPx0680j_4(C2046Dp.m13666constructorimpl(100)), 0.0f, 2, null), null, 0.0f, null, 0, 240, null);
                        if (MovingVerticalLineKt.MovingVerticalLine_36lltbM$lambda$4(mutableState2)) {
                            MutableState<C2046Dp> mutableState3 = mutableState;
                            MovingVerticalLineKt.MovingVerticalLine_36lltbM$lambda$2(mutableState3, C2046Dp.m13666constructorimpl(MovingVerticalLineKt.MovingVerticalLine_36lltbM$lambda$1(mutableState3) - f4));
                        } else {
                            MutableState<C2046Dp> mutableState4 = mutableState;
                            MovingVerticalLineKt.MovingVerticalLine_36lltbM$lambda$2(mutableState4, C2046Dp.m13666constructorimpl(MovingVerticalLineKt.MovingVerticalLine_36lltbM$lambda$1(mutableState4) + f4));
                        }
                        if (C2046Dp.m13665compareTo0680j_4(MovingVerticalLineKt.MovingVerticalLine_36lltbM$lambda$1(mutableState), C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(fM11168getWidthimpl) - C2046Dp.m13666constructorimpl(40.0f))) >= 0 || C2046Dp.m13665compareTo0680j_4(MovingVerticalLineKt.MovingVerticalLine_36lltbM$lambda$1(mutableState), C2046Dp.m13666constructorimpl(0)) <= 0) {
                            MovingVerticalLineKt.MovingVerticalLine_36lltbM$lambda$5(mutableState2, !MovingVerticalLineKt.MovingVerticalLine_36lltbM$lambda$4(r1));
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue4, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MovingVerticalLineKt$MovingVerticalLine$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    MovingVerticalLineKt.m15011MovingVerticalLine36lltbM(j, f, f2, i, isLineHit, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final void MovingVerticalLine_36lltbM$lambda$2(MutableState<C2046Dp> mutableState, float f) {
        mutableState.setValue(C2046Dp.m13664boximpl(f));
    }

    public static final void MovingVerticalLine_36lltbM$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final float MovingVerticalLine_36lltbM$lambda$1(MutableState<C2046Dp> mutableState) {
        return mutableState.getValue().m13680unboximpl();
    }

    public static final boolean MovingVerticalLine_36lltbM$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}

