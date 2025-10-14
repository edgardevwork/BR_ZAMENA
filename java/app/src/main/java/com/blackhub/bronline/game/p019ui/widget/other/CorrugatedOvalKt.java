package com.blackhub.bronline.game.p019ui.widget.other;

import android.content.res.Configuration;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CorrugatedOval.kt */
@SourceDebugExtension({"SMAP\nCorrugatedOval.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CorrugatedOval.kt\ncom/blackhub/bronline/game/ui/widget/other/CorrugatedOvalKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,103:1\n1116#2,6:104\n74#3:110\n154#4:111\n154#4:112\n*S KotlinDebug\n*F\n+ 1 CorrugatedOval.kt\ncom/blackhub/bronline/game/ui/widget/other/CorrugatedOvalKt\n*L\n25#1:104,6\n52#1:110\n57#1:111\n58#1:112\n*E\n"})
/* loaded from: classes3.dex */
public final class CorrugatedOvalKt {

    /* compiled from: CorrugatedOval.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.other.CorrugatedOvalKt$CorrugatedOval$3 */
    /* loaded from: classes8.dex */
    public static final class C64333 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64333(int i, int i2) {
            super(2);
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CorrugatedOvalKt.CorrugatedOval(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: CorrugatedOval.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.other.CorrugatedOvalKt$PreviewCorrugatedOval$1 */
    /* loaded from: classes8.dex */
    public static final class C64341 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64341(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CorrugatedOvalKt.PreviewCorrugatedOval(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CorrugatedOval(@Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-620428387);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-620428387, i3, -1, "com.blackhub.bronline.game.ui.widget.other.CorrugatedOval (CorrugatedOval.kt:23)");
            }
            composerStartRestartGroup.startReplaceableGroup(811507480);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Animatable animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            long jColorResource = ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6);
            long jColorResource2 = ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6);
            EffectsKt.LaunchedEffect("animatedFloat", new C64311(animatable, 1.0f, 600, 0.3f, null), composerStartRestartGroup, 70);
            Configuration configuration = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
            float fMin = Integer.min(configuration.screenWidthDp, configuration.screenHeightDp);
            CanvasKt.Canvas(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier3, C2046Dp.m13666constructorimpl(fMin)), C2046Dp.m13666constructorimpl(fMin)), new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.CorrugatedOvalKt.CorrugatedOval.2
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $animatedFloat;
                public final /* synthetic */ long $colorOne;
                public final /* synthetic */ long $colorTwo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C64322(long jColorResource3, long jColorResource22, Animatable<Float, AnimationVector1D> animatable2) {
                    super(1);
                    j = jColorResource3;
                    j = jColorResource22;
                    animatable = animatable2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull DrawScope Canvas) {
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    float f = 360.0f / 30;
                    float f2 = f - 6.0f;
                    Brush.Companion companion = Brush.INSTANCE;
                    Float fValueOf = Float.valueOf(0.0f);
                    Brush brushM11294radialGradientP_VxKs$default = Brush.Companion.m11294radialGradientP_VxKs$default(companion, new Pair[]{TuplesKt.m7112to(fValueOf, Color.m11330boximpl(j)), TuplesKt.m7112to(Float.valueOf(1.0f), Color.m11330boximpl(j))}, 0L, 0.0f, 0, 14, (Object) null);
                    Brush brushM11294radialGradientP_VxKs$default2 = Brush.Companion.m11294radialGradientP_VxKs$default(companion, new Pair[]{TuplesKt.m7112to(fValueOf, Color.m11330boximpl(j)), TuplesKt.m7112to(animatable.getValue(), Color.m11330boximpl(j))}, 0L, 0.0f, 0, 14, (Object) null);
                    int i5 = 0;
                    for (int i6 = 30; i5 < i6; i6 = i6) {
                        float f3 = 0.0f + (i5 * f);
                        DrawScope.m11868drawArcillE91I$default(Canvas, brushM11294radialGradientP_VxKs$default, f3, f2, true, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) - 4.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) - 4.0f), 0.4f, null, null, 0, 912, null);
                        DrawScope.m11868drawArcillE91I$default(Canvas, brushM11294radialGradientP_VxKs$default2, f3, f2, true, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) - 4.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) - 4.0f), 0.4f, null, null, 0, 912, null);
                        i5++;
                    }
                }
            }, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.CorrugatedOvalKt.CorrugatedOval.3
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C64333(int i5, int i22) {
                    super(2);
                    i = i5;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    CorrugatedOvalKt.CorrugatedOval(modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* compiled from: CorrugatedOval.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.other.CorrugatedOvalKt$CorrugatedOval$1", m7120f = "CorrugatedOval.kt", m7121i = {}, m7122l = {35, 42}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.widget.other.CorrugatedOvalKt$CorrugatedOval$1 */
    /* loaded from: classes8.dex */
    public static final class C64311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $animatedFloat;
        public final /* synthetic */ int $durationMillis;
        public final /* synthetic */ float $targetValueOne;
        public final /* synthetic */ float $targetValueTwo;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64311(Animatable<Float, AnimationVector1D> animatable, float f, int i, float f2, Continuation<? super C64311> continuation) {
            super(2, continuation);
            this.$animatedFloat = animatable;
            this.$targetValueOne = f;
            this.$durationMillis = i;
            this.$targetValueTwo = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C64311(this.$animatedFloat, this.$targetValueOne, this.$durationMillis, this.$targetValueTwo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C64311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0040 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x005f -> B:28:0x0020). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.label
                r2 = 0
                r3 = 0
                r4 = 1
                r5 = 2
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r5) goto L11
                goto L1d
            L11:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L19:
                kotlin.ResultKt.throwOnFailure(r15)
                goto L41
            L1d:
                kotlin.ResultKt.throwOnFailure(r15)
            L20:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r6 = r14.$animatedFloat
                float r15 = r14.$targetValueOne
                java.lang.Float r7 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r15)
                int r15 = r14.$durationMillis
                androidx.compose.animation.core.Easing r1 = androidx.compose.animation.core.EasingKt.getLinearEasing()
                androidx.compose.animation.core.TweenSpec r8 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r15, r3, r1, r5, r2)
                r14.label = r4
                r9 = 0
                r10 = 0
                r12 = 12
                r13 = 0
                r11 = r14
                java.lang.Object r15 = androidx.compose.animation.core.Animatable.animateTo$default(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r0) goto L41
                return r0
            L41:
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r6 = r14.$animatedFloat
                float r15 = r14.$targetValueTwo
                java.lang.Float r7 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r15)
                int r15 = r14.$durationMillis
                androidx.compose.animation.core.Easing r1 = androidx.compose.animation.core.EasingKt.getLinearEasing()
                androidx.compose.animation.core.TweenSpec r8 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r15, r3, r1, r5, r2)
                r14.label = r5
                r9 = 0
                r10 = 0
                r12 = 12
                r13 = 0
                r11 = r14
                java.lang.Object r15 = androidx.compose.animation.core.Animatable.animateTo$default(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r0) goto L20
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.p019ui.widget.other.CorrugatedOvalKt.C64311.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CorrugatedOval.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.other.CorrugatedOvalKt$CorrugatedOval$2 */
    /* loaded from: classes8.dex */
    public static final class C64322 extends Lambda implements Function1<DrawScope, Unit> {
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $animatedFloat;
        public final /* synthetic */ long $colorOne;
        public final /* synthetic */ long $colorTwo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64322(long jColorResource3, long jColorResource22, Animatable<Float, AnimationVector1D> animatable2) {
            super(1);
            j = jColorResource3;
            j = jColorResource22;
            animatable = animatable2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float f = 360.0f / 30;
            float f2 = f - 6.0f;
            Brush.Companion companion = Brush.INSTANCE;
            Float fValueOf = Float.valueOf(0.0f);
            Brush brushM11294radialGradientP_VxKs$default = Brush.Companion.m11294radialGradientP_VxKs$default(companion, new Pair[]{TuplesKt.m7112to(fValueOf, Color.m11330boximpl(j)), TuplesKt.m7112to(Float.valueOf(1.0f), Color.m11330boximpl(j))}, 0L, 0.0f, 0, 14, (Object) null);
            Brush brushM11294radialGradientP_VxKs$default2 = Brush.Companion.m11294radialGradientP_VxKs$default(companion, new Pair[]{TuplesKt.m7112to(fValueOf, Color.m11330boximpl(j)), TuplesKt.m7112to(animatable.getValue(), Color.m11330boximpl(j))}, 0L, 0.0f, 0, 14, (Object) null);
            int i5 = 0;
            for (int i6 = 30; i5 < i6; i6 = i6) {
                float f3 = 0.0f + (i5 * f);
                DrawScope.m11868drawArcillE91I$default(Canvas, brushM11294radialGradientP_VxKs$default, f3, f2, true, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) - 4.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) - 4.0f), 0.4f, null, null, 0, 912, null);
                DrawScope.m11868drawArcillE91I$default(Canvas, brushM11294radialGradientP_VxKs$default2, f3, f2, true, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) - 4.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) - 4.0f), 0.4f, null, null, 0, 912, null);
                i5++;
            }
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "CorrugatedOval")
    public static final void PreviewCorrugatedOval(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1970340160);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1970340160, i, -1, "com.blackhub.bronline.game.ui.widget.other.PreviewCorrugatedOval (CorrugatedOval.kt:100)");
            }
            CorrugatedOval(null, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.CorrugatedOvalKt.PreviewCorrugatedOval.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C64341(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CorrugatedOvalKt.PreviewCorrugatedOval(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

