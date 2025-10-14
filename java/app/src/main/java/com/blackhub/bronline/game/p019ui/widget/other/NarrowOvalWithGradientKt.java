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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NarrowOvalWithGradient.kt */
/* loaded from: classes3.dex */
public final class NarrowOvalWithGradientKt {
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NarrowOvalWithGradient(@Nullable final Modifier modifier, @Nullable final List<Color> list, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(537587759);
        int i4 = i2 & 1;
        final int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 16;
        }
        if (i6 != 2 || (i3 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i6 != 0) {
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                CanvasKt.Canvas(modifier, new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.NarrowOvalWithGradientKt.NarrowOvalWithGradient.1
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
                        long jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / i5, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / i5);
                        DrawScope.m11877drawOvalAsUm42w$default(Canvas, Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, list, jOffset, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / i5, 0, 8, (Object) null), OffsetKt.Offset(Offset.m11099getXimpl(jOffset) - (Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / i5), Offset.m11100getYimpl(jOffset) - (Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / i5)), SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), 0.0f, null, null, 0, 120, null);
                    }
                }, composerStartRestartGroup, i3 & 14);
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    list = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(Color.INSTANCE.m11377getWhite0d7_KjU()), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))});
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(537587759, i3, -1, "com.blackhub.bronline.game.ui.widget.other.NarrowOvalWithGradient (NarrowOvalWithGradient.kt:19)");
                }
                CanvasKt.Canvas(modifier, new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.NarrowOvalWithGradientKt.NarrowOvalWithGradient.1
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
                        long jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / i5, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / i5);
                        DrawScope.m11877drawOvalAsUm42w$default(Canvas, Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, list, jOffset, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / i5, 0, 8, (Object) null), OffsetKt.Offset(Offset.m11099getXimpl(jOffset) - (Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / i5), Offset.m11100getYimpl(jOffset) - (Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / i5)), SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), 0.0f, null, null, 0, 120, null);
                    }
                }, composerStartRestartGroup, i3 & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.NarrowOvalWithGradientKt.NarrowOvalWithGradient.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i7) {
                    NarrowOvalWithGradientKt.NarrowOvalWithGradient(modifier, list, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "NarrowOvalWithGradient")
    public static final void PreviewNarrowOvalWithGradient(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1200178080);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1200178080, i, -1, "com.blackhub.bronline.game.ui.widget.other.PreviewNarrowOvalWithGradient (NarrowOvalWithGradient.kt:43)");
            }
            NarrowOvalWithGradient(null, null, composerStartRestartGroup, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.NarrowOvalWithGradientKt.PreviewNarrowOvalWithGradient.1
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
                    NarrowOvalWithGradientKt.PreviewNarrowOvalWithGradient(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

