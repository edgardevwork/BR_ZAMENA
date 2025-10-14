package com.blackhub.bronline.game.p019ui.widget.button;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.TransformOrigin;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CloseButtonWithGradient.kt */
@SourceDebugExtension({"SMAP\nCloseButtonWithGradient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseButtonWithGradient.kt\ncom/blackhub/bronline/game/ui/widget/button/CloseButtonWithGradientKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,44:1\n1116#2,6:45\n*S KotlinDebug\n*F\n+ 1 CloseButtonWithGradient.kt\ncom/blackhub/bronline/game/ui/widget/button/CloseButtonWithGradientKt\n*L\n25#1:45,6\n*E\n"})
/* loaded from: classes3.dex */
public final class CloseButtonWithGradientKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CloseButtonWithGradient-RYX2cs4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15071CloseButtonWithGradientRYX2cs4(@Nullable Modifier modifier, @DrawableRes int i, long j, @NotNull final Function0<Unit> onFinishClick, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        long jM11730getCenterSzJe1aQ;
        Modifier modifier3;
        boolean z;
        Object objRememberedValue;
        final long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onFinishClick, "onFinishClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(431968082);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 112) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    jM11730getCenterSzJe1aQ = j;
                    int i8 = composerStartRestartGroup.changed(jM11730getCenterSzJe1aQ) ? 256 : 128;
                    i4 |= i8;
                } else {
                    jM11730getCenterSzJe1aQ = j;
                }
                i4 |= i8;
            } else {
                jM11730getCenterSzJe1aQ = j;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onFinishClick) ? 2048 : 1024;
            }
            if ((i4 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i7 != 0) {
                        i5 = R.drawable.ic_close_gradient_red;
                    }
                    if ((i3 & 4) != 0) {
                        jM11730getCenterSzJe1aQ = TransformOrigin.INSTANCE.m11730getCenterSzJe1aQ();
                        i4 &= -897;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    modifier3 = modifier2;
                }
                final int i9 = i5;
                long j3 = jM11730getCenterSzJe1aQ;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(431968082, i4, -1, "com.blackhub.bronline.game.ui.widget.button.CloseButtonWithGradient (CloseButtonWithGradient.kt:20)");
                }
                composerStartRestartGroup.startReplaceableGroup(201124493);
                z = (i4 & 7168) != 2048;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.CloseButtonWithGradientKt$CloseButtonWithGradient$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            onFinishClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifier3, null, false, null, false, false, false, false, null, 0, j3, null, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -329809823, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.CloseButtonWithGradientKt$CloseButtonWithGradient$2
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
                    public final void invoke(@Nullable Composer composer2, int i10) {
                        if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-329809823, i10, -1, "com.blackhub.bronline.game.ui.widget.button.CloseButtonWithGradient.<anonymous> (CloseButtonWithGradient.kt:28)");
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i9, composer2, 0), (String) null, SizeKt.m8174sizeVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._38sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._23sdp, composer2, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, i4 & 14, ((i4 >> 6) & 14) | 3072, 3070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i5 = i9;
                j2 = j3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j2 = jM11730getCenterSzJe1aQ;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final int i10 = i5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.CloseButtonWithGradientKt$CloseButtonWithGradient$3
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
                        CloseButtonWithGradientKt.m15071CloseButtonWithGradientRYX2cs4(modifier4, i10, j2, onFinishClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        i5 = i;
        if ((i2 & 896) != 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i4 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                final int i92 = i5;
                long j32 = jM11730getCenterSzJe1aQ;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceableGroup(201124493);
                if ((i4 & 7168) != 2048) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.CloseButtonWithGradientKt$CloseButtonWithGradient$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            onFinishClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceableGroup();
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifier3, null, false, null, false, false, false, false, null, 0, j32, null, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -329809823, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.CloseButtonWithGradientKt$CloseButtonWithGradient$2
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
                        public final void invoke(@Nullable Composer composer2, int i102) {
                            if ((i102 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-329809823, i102, -1, "com.blackhub.bronline.game.ui.widget.button.CloseButtonWithGradient.<anonymous> (CloseButtonWithGradient.kt:28)");
                                }
                                ImageKt.Image(PainterResources_androidKt.painterResource(i92, composer2, 0), (String) null, SizeKt.m8174sizeVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._38sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._23sdp, composer2, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, i4 & 14, ((i4 >> 6) & 14) | 3072, 3070);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i5 = i92;
                    j2 = j32;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "CloseButtonWithGradient")
    public static final void PreviewCloseButtonWithGradient(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(411666);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(411666, i, -1, "com.blackhub.bronline.game.ui.widget.button.PreviewCloseButtonWithGradient (CloseButtonWithGradient.kt:41)");
            }
            m15071CloseButtonWithGradientRYX2cs4(null, 0, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.CloseButtonWithGradientKt.PreviewCloseButtonWithGradient.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.CloseButtonWithGradientKt.PreviewCloseButtonWithGradient.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CloseButtonWithGradientKt.PreviewCloseButtonWithGradient(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

