package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.LayoutModifierKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.profileinstaller.ProfileVerifier;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimatedContent.kt */
@Metadata(m7104d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a´\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0017\u001aP\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2>\b\u0002\u0010\u001c\u001a8\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0 0\u0014\u001a¬\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020!2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\"\u001a\u0015\u0010#\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0086\u0004\u001a\u0015\u0010'\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0087\u0004¨\u0006("}, m7105d2 = {"AnimatedContent", "", "S", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "label", "", "contentKey", "Lkotlin/ParameterName;", "name", "", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "togetherWith", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", JsonPOJOBuilder.DEFAULT_WITH_PREFIX, "animation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,831:1\n74#2:832\n36#3:833\n36#3:840\n36#3:847\n50#3:867\n49#3:868\n25#3:875\n456#3,8:893\n464#3,3:907\n467#3,3:916\n1116#4,6:834\n1116#4,6:841\n1116#4,6:848\n1116#4,6:869\n1116#4,6:876\n350#5,7:854\n33#6,6:861\n33#6,6:910\n79#7,11:882\n92#7:919\n3737#8,6:901\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n667#1:832\n668#1:833\n672#1:840\n673#1:847\n761#1:867\n761#1:868\n772#1:875\n763#1:893,8\n763#1:907,3\n763#1:916,3\n668#1:834,6\n672#1:841,6\n673#1:848,6\n761#1:869,6\n772#1:876,6\n699#1:854,7\n708#1:861,6\n766#1:910,6\n763#1:882,11\n763#1:919\n763#1:901,6\n*E\n"})
/* loaded from: classes3.dex */
public final class AnimatedContentKt {

    /* compiled from: AnimatedContent.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2 */
    /* loaded from: classes4.dex */
    public static final class C02502<S> extends Lambda implements Function1<S, S> {
        public static final C02502 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public final S invoke(S s) {
            return s;
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3 */
    /* loaded from: classes4.dex */
    public static final class C02513 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content;
        public final /* synthetic */ Alignment $contentAlignment;
        public final /* synthetic */ Function1<S, Object> $contentKey;
        public final /* synthetic */ String $label;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ S $targetState;
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02513(S s, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, String str, Function1<? super S, ? extends Object> function12, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, int i, int i2) {
            super(2);
            s = s;
            modifier = modifier;
            function1 = function1;
            alignment = alignment;
            str = str;
            function1 = function12;
            function4 = function4;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            AnimatedContentKt.AnimatedContent(s, modifier, function1, alignment, str, function1, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5 */
    /* loaded from: classes4.dex */
    public static final class C02535<S> extends Lambda implements Function1<S, S> {
        public static final C02535 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public final S invoke(S s) {
            return s;
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9 */
    /* loaded from: classes4.dex */
    public static final class C02579 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content;
        public final /* synthetic */ Alignment $contentAlignment;
        public final /* synthetic */ Function1<S, Object> $contentKey;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Transition<S> $this_AnimatedContent;
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02579(Transition<S> transition, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, Function1<? super S, ? extends Object> function12, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, int i, int i2) {
            super(2);
            transition = transition;
            modifier = modifier;
            function1 = function1;
            alignment = alignment;
            function1 = function12;
            function4 = function4;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            AnimatedContentKt.AnimatedContent(transition, modifier, function1, alignment, function1, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1 */
    /* loaded from: classes4.dex */
    public static final class C02491<S> extends Lambda implements Function1<AnimatedContentTransitionScope<S>, ContentTransform> {
        public static final C02491 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ContentTransform invoke(@NotNull AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m7634scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(S s, @Nullable Modifier modifier, @Nullable Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, @Nullable Alignment alignment, @Nullable String str, @Nullable Function1<? super S, ? extends Object> function12, @NotNull Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13;
        int i5;
        Alignment alignment2;
        int i6;
        String str2;
        int i7;
        Function1<? super S, ? extends Object> function14;
        Alignment topStart;
        String str3;
        Function1<? super S, ? extends Object> function15;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2132720749);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        alignment2 = alignment;
                        i3 |= composerStartRestartGroup.changed(alignment2) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 57344) == 0) {
                            str2 = str;
                            i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                            function14 = function12;
                        } else {
                            function14 = function12;
                            if ((i & 458752) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
                            }
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function4) ? 1048576 : 524288;
                        }
                        if ((i3 & 2995931) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                function13 = C02491.INSTANCE;
                            }
                            topStart = i5 == 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                            str3 = i6 == 0 ? "AnimatedContent" : str2;
                            function15 = i7 == 0 ? C02502.INSTANCE : function14;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2132720749, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:138)");
                            }
                            Transition transitionUpdateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i9 = i3 & 8176;
                            int i10 = i3 >> 3;
                            AnimatedContent(transitionUpdateTransition, modifier3, function13, topStart, function15, function4, composerStartRestartGroup, i9 | (57344 & i10) | (i10 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            topStart = alignment2;
                            str3 = str2;
                            function15 = function14;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.3
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content;
                                public final /* synthetic */ Alignment $contentAlignment;
                                public final /* synthetic */ Function1<S, Object> $contentKey;
                                public final /* synthetic */ String $label;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ S $targetState;
                                public final /* synthetic */ Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C02513(S s2, Modifier modifier22, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function132, Alignment topStart2, String str32, Function1<? super S, ? extends Object> function152, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function42, int i11, int i22) {
                                    super(2);
                                    s = s2;
                                    modifier = modifier22;
                                    function1 = function132;
                                    alignment = topStart2;
                                    str = str32;
                                    function1 = function152;
                                    function4 = function42;
                                    i = i11;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i11) {
                                    AnimatedContentKt.AnimatedContent(s, modifier, function1, alignment, str, function1, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= CpioConstants.C_ISBLK;
                    str2 = str;
                    i7 = i22 & 32;
                    if (i7 != 0) {
                    }
                    if ((i22 & 64) != 0) {
                    }
                    if ((i3 & 2995931) != 599186) {
                        if (i8 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Transition transitionUpdateTransition2 = androidx.compose.animation.core.TransitionKt.updateTransition(s2, str32, composerStartRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i92 = i3 & 8176;
                        int i102 = i3 >> 3;
                        AnimatedContent(transitionUpdateTransition2, modifier3, function132, topStart2, function152, function42, composerStartRestartGroup, i92 | (57344 & i102) | (i102 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier22 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                alignment2 = alignment;
                i6 = i22 & 16;
                if (i6 != 0) {
                }
                str2 = str;
                i7 = i22 & 32;
                if (i7 != 0) {
                }
                if ((i22 & 64) != 0) {
                }
                if ((i3 & 2995931) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function132 = function1;
            i5 = i22 & 8;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i22 & 16;
            if (i6 != 0) {
            }
            str2 = str;
            i7 = i22 & 32;
            if (i7 != 0) {
            }
            if ((i22 & 64) != 0) {
            }
            if ((i3 & 2995931) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        function132 = function1;
        i5 = i22 & 8;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i22 & 16;
        if (i6 != 0) {
        }
        str2 = str;
        i7 = i22 & 32;
        if (i7 != 0) {
        }
        if ((i22 & 64) != 0) {
        }
        if ((i3 & 2995931) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/unit/IntSize;", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke-TemP2vQ", "(JJ)Landroidx/compose/animation/core/SpringSpec;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$SizeTransform$1 */
    /* loaded from: classes4.dex */
    public static final class C02581 extends Lambda implements Function2<IntSize, IntSize, SpringSpec<IntSize>> {
        public static final C02581 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
            return m7598invokeTemP2vQ(intSize.getPackedValue(), intSize2.getPackedValue());
        }

        @NotNull
        /* renamed from: invoke-TemP2vQ */
        public final SpringSpec<IntSize> m7598invokeTemP2vQ(long j, long j2) {
            return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13828boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = C02581.INSTANCE;
        }
        return SizeTransform(z, function2);
    }

    @NotNull
    public static final SizeTransform SizeTransform(boolean z, @NotNull Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> function2) {
        return new SizeTransformImpl(z, function2);
    }

    @NotNull
    public static final ContentTransform togetherWith(@NotNull EnterTransition enterTransition, @NotNull ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    @Deprecated(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @ReplaceWith(expression = "togetherWith(exit)", imports = {}))
    @ExperimentalAnimationApi
    @NotNull
    public static final ContentTransform with(@NotNull EnterTransition enterTransition, @NotNull ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4 */
    /* loaded from: classes4.dex */
    public static final class C02524<S> extends Lambda implements Function1<AnimatedContentTransitionScope<S>, ContentTransform> {
        public static final C02524 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ContentTransform invoke(@NotNull AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m7634scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x023e A[LOOP:2: B:324:0x023c->B:325:0x023e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(@NotNull final Transition<S> transition, @Nullable Modifier modifier, @Nullable Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, @Nullable Alignment alignment, @Nullable Function1<? super S, ? extends Object> function12, @NotNull final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13;
        int i5;
        Alignment topStart;
        int i6;
        Function1<? super S, ? extends Object> function14;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function15;
        LayoutDirection layoutDirection;
        boolean zChanged;
        Object objRememberedValue;
        final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        boolean zChanged2;
        Object objRememberedValue2;
        SnapshotStateList snapshotStateList;
        boolean zChanged3;
        Object objRememberedValue3;
        Map map;
        int size;
        int i7;
        boolean zChanged4;
        ContentTransform contentTransformRememberedValue;
        Object objRememberedValue4;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int size2;
        int i8;
        Alignment alignment2;
        Function1<? super S, ? extends Object> function16;
        Modifier modifier3;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function17;
        Iterator<T> it;
        int i9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-114689412);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
                }
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        topStart = alignment;
                        i3 |= composerStartRestartGroup.changed(topStart) ? 2048 : 1024;
                    }
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((57344 & i) == 0) {
                            function14 = function12;
                            i3 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
                        }
                        if ((i2 & 16) == 0) {
                            if ((458752 & i) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
                            }
                            if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                function15 = i4 == 0 ? C02524.INSTANCE : function13;
                                if (i5 != 0) {
                                    topStart = Alignment.INSTANCE.getTopStart();
                                }
                                if (i6 != 0) {
                                    function14 = C02535.INSTANCE;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-114689412, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:665)");
                                }
                                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(transition);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new AnimatedContentTransitionScopeImpl(transition, topStart, layoutDirection);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                animatedContentTransitionScopeImpl = objRememberedValue;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(transition);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                snapshotStateList = (SnapshotStateList) objRememberedValue2;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged3 = composerStartRestartGroup.changed(transition);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new LinkedHashMap();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                map = (Map) objRememberedValue3;
                                if (!snapshotStateList.contains(transition.getCurrentState())) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(transition.getCurrentState());
                                }
                                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                                    if (snapshotStateList.size() != 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition.getCurrentState())) {
                                        snapshotStateList.clear();
                                        snapshotStateList.add(transition.getCurrentState());
                                    }
                                    if (map.size() != 1 || map.containsKey(transition.getCurrentState())) {
                                        map.clear();
                                    }
                                    animatedContentTransitionScopeImpl.setContentAlignment(topStart);
                                    animatedContentTransitionScopeImpl.setLayoutDirection$animation_release(layoutDirection);
                                }
                                if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && !snapshotStateList.contains(transition.getTargetState())) {
                                    it = snapshotStateList.iterator();
                                    i9 = 0;
                                    while (true) {
                                        if (it.hasNext()) {
                                            i9 = -1;
                                            break;
                                        } else if (Intrinsics.areEqual(function14.invoke((Object) it.next()), function14.invoke(transition.getTargetState()))) {
                                            break;
                                        } else {
                                            i9++;
                                        }
                                    }
                                    if (i9 != -1) {
                                        snapshotStateList.add(transition.getTargetState());
                                    } else {
                                        snapshotStateList.set(i9, transition.getTargetState());
                                    }
                                }
                                if (map.containsKey(transition.getTargetState()) || !map.containsKey(transition.getCurrentState())) {
                                    map.clear();
                                    i7 = 0;
                                    for (size = snapshotStateList.size(); i7 < size; size = size) {
                                        final T t = snapshotStateList.get(i7);
                                        int i11 = i7;
                                        final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function18 = function15;
                                        Map map2 = map;
                                        final SnapshotStateList snapshotStateList2 = snapshotStateList;
                                        map2.put(t, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 885640742, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
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
                                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(885640742, i12, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:709)");
                                                }
                                                Function1<AnimatedContentTransitionScope<S>, ContentTransform> function19 = function18;
                                                Object obj = animatedContentTransitionScopeImpl;
                                                composer2.startReplaceableGroup(-492369756);
                                                ContentTransform contentTransformRememberedValue2 = composer2.rememberedValue();
                                                Composer.Companion companion = Composer.INSTANCE;
                                                if (contentTransformRememberedValue2 == companion.getEmpty()) {
                                                    contentTransformRememberedValue2 = function19.invoke(obj);
                                                    composer2.updateRememberedValue(contentTransformRememberedValue2);
                                                }
                                                composer2.endReplaceableGroup();
                                                final ContentTransform contentTransform = (ContentTransform) contentTransformRememberedValue2;
                                                Object objValueOf = Boolean.valueOf(Intrinsics.areEqual(transition.getSegment().getTargetState(), t));
                                                Transition<S> transition2 = transition;
                                                S s = t;
                                                Function1<AnimatedContentTransitionScope<S>, ContentTransform> function110 = function18;
                                                Object obj2 = animatedContentTransitionScopeImpl;
                                                composer2.startReplaceableGroup(1157296644);
                                                boolean zChanged5 = composer2.changed(objValueOf);
                                                Object objRememberedValue5 = composer2.rememberedValue();
                                                if (zChanged5 || objRememberedValue5 == companion.getEmpty()) {
                                                    objRememberedValue5 = Intrinsics.areEqual(transition2.getSegment().getTargetState(), s) ? ExitTransition.INSTANCE.getNone() : function110.invoke(obj2).getInitialContentExit();
                                                    composer2.updateRememberedValue(objRememberedValue5);
                                                }
                                                composer2.endReplaceableGroup();
                                                final ExitTransition exitTransition = (ExitTransition) objRememberedValue5;
                                                S s2 = t;
                                                Transition<S> transition3 = transition;
                                                composer2.startReplaceableGroup(-492369756);
                                                Object objRememberedValue6 = composer2.rememberedValue();
                                                if (objRememberedValue6 == companion.getEmpty()) {
                                                    objRememberedValue6 = new AnimatedContentTransitionScopeImpl.ChildData(Intrinsics.areEqual(s2, transition3.getTargetState()));
                                                    composer2.updateRememberedValue(objRememberedValue6);
                                                }
                                                composer2.endReplaceableGroup();
                                                AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) objRememberedValue6;
                                                EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
                                                Modifier modifierLayout = LayoutModifierKt.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.1
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                                        return m7597invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                                    }

                                                    @NotNull
                                                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                                    public final MeasureResult m7597invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
                                                        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(j);
                                                        int width = placeableMo12610measureBRTryo0.getWidth();
                                                        int height = placeableMo12610measureBRTryo0.getHeight();
                                                        final ContentTransform contentTransform2 = contentTransform;
                                                        return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.6.1.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                                                placementScope.place(placeableMo12610measureBRTryo0, 0, 0, contentTransform2.getTargetContentZIndex());
                                                            }
                                                        }, 4, null);
                                                    }
                                                });
                                                childData.setTarget(Intrinsics.areEqual(t, transition.getTargetState()));
                                                Modifier modifierThen = modifierLayout.then(childData);
                                                Transition<S> transition4 = transition;
                                                final S s3 = t;
                                                Function1<S, Boolean> function111 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj3) {
                                                        return invoke((C02553<S>) obj3);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    @NotNull
                                                    public final Boolean invoke(S s4) {
                                                        return Boolean.valueOf(Intrinsics.areEqual(s4, s3));
                                                    }
                                                };
                                                composer2.startReplaceableGroup(664245165);
                                                boolean zChanged6 = composer2.changed(exitTransition);
                                                Object objRememberedValue7 = composer2.rememberedValue();
                                                if (zChanged6 || objRememberedValue7 == companion.getEmpty()) {
                                                    objRememberedValue7 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        @NotNull
                                                        public final Boolean invoke(@NotNull EnterExitState enterExitState, @NotNull EnterExitState enterExitState2) {
                                                            EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !exitTransition.getData().getHold());
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue7);
                                                }
                                                composer2.endReplaceableGroup();
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                                final S s4 = t;
                                                final SnapshotStateList<S> snapshotStateList3 = snapshotStateList2;
                                                final Function4<AnimatedContentScope, S, Composer, Integer, Unit> function42 = function4;
                                                AnimatedVisibilityKt.AnimatedEnterExitImpl(transition4, function111, modifierThen, targetContentEnter, exitTransition, (Function2) objRememberedValue7, null, ComposableLambdaKt.composableLambda(composer2, -616195562, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
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
                                                        if ((i13 & 14) == 0) {
                                                            i13 |= composer3.changed(animatedVisibilityScope) ? 4 : 2;
                                                        }
                                                        if ((i13 & 91) == 18 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-616195562, i13, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:745)");
                                                        }
                                                        final SnapshotStateList<S> snapshotStateList4 = snapshotStateList3;
                                                        final S s5 = s4;
                                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                                                        EffectsKt.DisposableEffect(animatedVisibilityScope, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.6.1.5.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            @NotNull
                                                            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                                                                final SnapshotStateList<S> snapshotStateList5 = snapshotStateList4;
                                                                final S s6 = s5;
                                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl3;
                                                                return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$invoke$$inlined$onDispose$1
                                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                                    public void dispose() {
                                                                        snapshotStateList5.remove(s6);
                                                                        animatedContentTransitionScopeImpl4.getTargetSizeMap$animation_release().remove(s6);
                                                                    }
                                                                };
                                                            }
                                                        }, composer3, i13 & 14);
                                                        Map targetSizeMap$animation_release = animatedContentTransitionScopeImpl2.getTargetSizeMap$animation_release();
                                                        S s6 = s4;
                                                        Intrinsics.checkNotNull(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                        targetSizeMap$animation_release.put(s6, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation_release());
                                                        composer3.startReplaceableGroup(-492369756);
                                                        Object objRememberedValue8 = composer3.rememberedValue();
                                                        if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue8 = new AnimatedContentScopeImpl(animatedVisibilityScope);
                                                            composer3.updateRememberedValue(objRememberedValue8);
                                                        }
                                                        composer3.endReplaceableGroup();
                                                        function42.invoke((AnimatedContentScopeImpl) objRememberedValue8, s4, composer3, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }), composer2, 12582912, 64);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        i7 = i11 + 1;
                                        snapshotStateList = snapshotStateList;
                                        map = map2;
                                    }
                                }
                                Map map3 = map;
                                SnapshotStateList snapshotStateList3 = snapshotStateList;
                                Transition.Segment<S> segment = transition.getSegment();
                                composerStartRestartGroup.startReplaceableGroup(511388516);
                                zChanged4 = composerStartRestartGroup.changed(segment) | composerStartRestartGroup.changed(animatedContentTransitionScopeImpl);
                                contentTransformRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged4 || contentTransformRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    contentTransformRememberedValue = function15.invoke(animatedContentTransitionScopeImpl);
                                    composerStartRestartGroup.updateRememberedValue(contentTransformRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifierThen = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((ContentTransform) contentTransformRememberedValue, composerStartRestartGroup, 72));
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) objRememberedValue4;
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                                Updater.m10877setimpl(composerM10870constructorimpl, animatedContentMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                composerStartRestartGroup.startReplaceableGroup(-441506448);
                                size2 = snapshotStateList3.size();
                                i8 = 0;
                                while (i8 < size2) {
                                    SnapshotStateList snapshotStateList4 = snapshotStateList3;
                                    Object obj = snapshotStateList4.get(i8);
                                    composerStartRestartGroup.startMovableGroup(-1739558576, function14.invoke(obj));
                                    Function2 function2 = (Function2) map3.get(obj);
                                    if (function2 != null) {
                                        function2.invoke(composerStartRestartGroup, 0);
                                    }
                                    composerStartRestartGroup.endMovableGroup();
                                    i8++;
                                    snapshotStateList3 = snapshotStateList4;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                alignment2 = topStart;
                                function16 = function14;
                                modifier3 = modifier4;
                                function17 = function15;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                function17 = function13;
                                alignment2 = topStart;
                                function16 = function14;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.9
                                    public final /* synthetic */ int $$changed;
                                    public final /* synthetic */ int $$default;
                                    public final /* synthetic */ Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content;
                                    public final /* synthetic */ Alignment $contentAlignment;
                                    public final /* synthetic */ Function1<S, Object> $contentKey;
                                    public final /* synthetic */ Modifier $modifier;
                                    public final /* synthetic */ Transition<S> $this_AnimatedContent;
                                    public final /* synthetic */ Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public C02579(final Transition<S> transition2, Modifier modifier32, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function172, Alignment alignment22, Function1<? super S, ? extends Object> function162, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function42, int i12, int i22) {
                                        super(2);
                                        transition = transition2;
                                        modifier = modifier32;
                                        function1 = function172;
                                        alignment = alignment22;
                                        function1 = function162;
                                        function4 = function42;
                                        i = i12;
                                        i = i22;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        AnimatedContentKt.AnimatedContent(transition, modifier, function1, alignment, function1, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        if ((374491 & i3) == 74898) {
                            if (i10 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(transition2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = new AnimatedContentTransitionScopeImpl(transition2, topStart, layoutDirection);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceableGroup();
                                animatedContentTransitionScopeImpl = objRememberedValue;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(transition2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue2 = SnapshotStateKt.mutableStateListOf(transition2.getCurrentState());
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    snapshotStateList = (SnapshotStateList) objRememberedValue2;
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    zChanged3 = composerStartRestartGroup.changed(transition2);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged3) {
                                        objRememberedValue3 = new LinkedHashMap();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        map = (Map) objRememberedValue3;
                                        if (!snapshotStateList.contains(transition2.getCurrentState())) {
                                        }
                                        if (Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState())) {
                                        }
                                        if (!Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState())) {
                                            it = snapshotStateList.iterator();
                                            i9 = 0;
                                            while (true) {
                                                if (it.hasNext()) {
                                                }
                                                i9++;
                                            }
                                            if (i9 != -1) {
                                            }
                                        }
                                        if (map.containsKey(transition2.getTargetState())) {
                                            map.clear();
                                            i7 = 0;
                                            while (i7 < size) {
                                            }
                                            Map map32 = map;
                                            SnapshotStateList snapshotStateList32 = snapshotStateList;
                                            Transition.Segment<S> segment2 = transition2.getSegment();
                                            composerStartRestartGroup.startReplaceableGroup(511388516);
                                            zChanged4 = composerStartRestartGroup.changed(segment2) | composerStartRestartGroup.changed(animatedContentTransitionScopeImpl);
                                            contentTransformRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (!zChanged4) {
                                                contentTransformRememberedValue = function15.invoke(animatedContentTransitionScopeImpl);
                                                composerStartRestartGroup.updateRememberedValue(contentTransformRememberedValue);
                                                composerStartRestartGroup.endReplaceableGroup();
                                                Modifier modifierThen2 = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((ContentTransform) contentTransformRememberedValue, composerStartRestartGroup, 72));
                                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                AnimatedContentMeasurePolicy animatedContentMeasurePolicy2 = (AnimatedContentMeasurePolicy) objRememberedValue4;
                                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen2);
                                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (!composerStartRestartGroup.getInserting()) {
                                                }
                                                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                                                Updater.m10877setimpl(composerM10870constructorimpl, animatedContentMeasurePolicy2, companion2.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                if (!composerM10870constructorimpl.getInserting()) {
                                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                    composerStartRestartGroup.startReplaceableGroup(-441506448);
                                                    size2 = snapshotStateList32.size();
                                                    i8 = 0;
                                                    while (i8 < size2) {
                                                    }
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    composerStartRestartGroup.endNode();
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    alignment22 = topStart;
                                                    function162 = function14;
                                                    modifier32 = modifier4;
                                                    function172 = function15;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function14 = function12;
                    if ((i22 & 16) == 0) {
                    }
                    if ((374491 & i3) == 74898) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                topStart = alignment;
                i6 = i22 & 8;
                if (i6 == 0) {
                }
                function14 = function12;
                if ((i22 & 16) == 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function13 = function1;
            i5 = i22 & 4;
            if (i5 != 0) {
            }
            topStart = alignment;
            i6 = i22 & 8;
            if (i6 == 0) {
            }
            function14 = function12;
            if ((i22 & 16) == 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i22 & 2;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i22 & 4;
        if (i5 != 0) {
        }
        topStart = alignment;
        i6 = i22 & 8;
        if (i6 == 0) {
        }
        function14 = function12;
        if ((i22 & 16) == 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
