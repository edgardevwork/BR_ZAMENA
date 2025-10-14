package com.blackhub.bronline.game.p019ui.widget.other;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NarrowOvalWithGradientCustom.kt */
@SourceDebugExtension({"SMAP\nNarrowOvalWithGradientCustom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NarrowOvalWithGradientCustom.kt\ncom/blackhub/bronline/game/ui/widget/other/NarrowOvalWithGradientCustomKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,52:1\n154#2:53\n*S KotlinDebug\n*F\n+ 1 NarrowOvalWithGradientCustom.kt\ncom/blackhub/bronline/game/ui/widget/other/NarrowOvalWithGradientCustomKt\n*L\n51#1:53\n*E\n"})
/* loaded from: classes3.dex */
public final class NarrowOvalWithGradientCustomKt {

    /* compiled from: NarrowOvalWithGradientCustom.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.other.NarrowOvalWithGradientCustomKt$PreviewNarrowOvalWithGradientCustom$1 */
    /* loaded from: classes8.dex */
    public static final class C64401 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64401(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            NarrowOvalWithGradientCustomKt.PreviewNarrowOvalWithGradientCustom(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: NarrowOvalWithGradientCustom-iJQMabo */
    public static final void m15096NarrowOvalWithGradientCustomiJQMabo(@Nullable Modifier modifier, long j, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1165140378);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                j = Color.INSTANCE.m11377getWhite0d7_KjU();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1165140378, i3, -1, "com.blackhub.bronline.game.ui.widget.other.NarrowOvalWithGradientCustom (NarrowOvalWithGradientCustom.kt:20)");
            }
            final List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(j), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))});
            CanvasKt.Canvas(modifier, new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.NarrowOvalWithGradientCustomKt$NarrowOvalWithGradientCustom$1
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
                    float f = 2;
                    long jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / f);
                    DrawScope.m11877drawOvalAsUm42w$default(Canvas, Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, listListOf, jOffset, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / f, 0, 8, (Object) null), OffsetKt.Offset(Offset.m11099getXimpl(jOffset) - (Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / f), Offset.m11100getYimpl(jOffset) - (Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / f)), SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), 0.0f, null, null, 0, 120, null);
                }
            }, composerStartRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final long j2 = j;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.NarrowOvalWithGradientCustomKt$NarrowOvalWithGradientCustom$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(modifier2, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "NarrowOvalWithGradient")
    public static final void PreviewNarrowOvalWithGradientCustom(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1211659840);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1211659840, i, -1, "com.blackhub.bronline.game.ui.widget.other.PreviewNarrowOvalWithGradientCustom (NarrowOvalWithGradientCustom.kt:49)");
            }
            m15096NarrowOvalWithGradientCustomiJQMabo(androidx.compose.foundation.layout.SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(300)), 0L, composerStartRestartGroup, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.NarrowOvalWithGradientCustomKt.PreviewNarrowOvalWithGradientCustom.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C64401(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    NarrowOvalWithGradientCustomKt.PreviewNarrowOvalWithGradientCustom(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

