package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.MotionLayoutKt;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.gui.calendar.CalendarKeys;
import java.util.EnumSet;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConstraintLayout.kt */
@Metadata(m7104d1 = {"\u0000Ì\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001e\b\u0004\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001an\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u00012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0010\b\n\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010!2\u0013\b\b\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u000f0!¢\u0006\u0002\b\u0017H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\"\u001a'\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0002\b\u0018\u001a\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\b\b\u0001\u0010'\u001a\u00020(\u001a\u001f\u0010#\u001a\u00020\u001b2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0002\b\u0018\u001a\u0010\u0010#\u001a\u00020\u001b2\b\b\u0001\u0010'\u001a\u00020(\u001a#\u0010#\u001a\u00020\u001b2\b\b\u0001\u0010\u0014\u001a\u00020(2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0002\u0010*\u001a\u001e\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0000\u001a\b\u00101\u001a\u000202H\u0000\u001a3\u00103\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\u00132\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\u0010:\u001aE\u00103\u001a\u0014\u0012\u0004\u0012\u000204\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0!0;2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00162\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0001062\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\u0010>\u001a\u001f\u0010?\u001a\u00020\u0003*\u00020\u00042\u0006\u0010@\u001a\u00020Aø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bB\u0010C\u001a\u001f\u0010?\u001a\u00020\u0007*\u00020\b2\u0006\u0010@\u001a\u00020Aø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bB\u0010D\u001a!\u0010\u0002\u001a\u00020\u0007*\u00020\b2\u0006\u0010@\u001a\u00020AH\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bE\u0010D\u001a\u001f\u0010F\u001a\u00020\b*\u00020\u00042\u0006\u0010@\u001a\u00020Aø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bG\u0010H\u001a\u001f\u0010F\u001a\u00020\u0007*\u00020\u00032\u0006\u0010@\u001a\u00020Aø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bG\u0010I\u001a\f\u0010J\u001a\u00020(*\u00020KH\u0002\u001a\f\u0010J\u001a\u00020(*\u00020LH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0002\u001a\u00020\u0007*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t\"\u0015\u0010\n\u001a\u00020\b*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\n\u001a\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r*\f\b\u0000\u0010M\"\u00020N2\u00020N*\f\b\u0000\u0010O\"\u00020P2\u00020P*\f\b\u0000\u0010Q\"\u00020R2\u00020R*\f\b\u0000\u0010S\"\u00020T2\u00020T\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006U"}, m7105d2 = {"DEBUG", "", "atLeastWrapContent", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "getAtLeastWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;)Landroidx/constraintlayout/compose/Dimension;", "atMostWrapContent", "getAtMostWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;)Landroidx/constraintlayout/compose/Dimension;", "ConstraintLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "optimizationLevel", "", "content", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "constraintSet", "Landroidx/constraintlayout/compose/ConstraintSet;", "animateChanges", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "finishedAnimationListener", "Lkotlin/Function0;", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/Modifier;IZLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ConstraintSet", "extendConstraintSet", "description", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "jsonContent", "", "overrideVariables", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/constraintlayout/compose/ConstraintSet;", "buildMapping", "state", "Landroidx/constraintlayout/compose/State;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "createId", "", "rememberConstraintLayoutMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "needsUpdate", "Landroidx/compose/runtime/MutableState;", "", "measurer", "Landroidx/constraintlayout/compose/Measurer;", "(ILandroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Pair;", PomReader.SCOPE, "remeasureRequesterState", "(ILandroidx/constraintlayout/compose/ConstraintLayoutScope;Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "atLeast", CalendarKeys.DAYS_GAME_KEY, "Landroidx/compose/ui/unit/Dp;", "atLeast-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "atLeastWrapContent-3ABfNKs", "atMost", "atMost-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "toDebugString", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "SolverChain", "Landroidx/constraintlayout/core/state/State$Chain;", "SolverDimension", "Landroidx/constraintlayout/core/state/Dimension;", "SolverDirection", "Landroidx/constraintlayout/core/state/State$Direction;", "SolverState", "Landroidx/constraintlayout/core/state/State;", "compose_release"}, m7106k = 2, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ConstraintLayoutKt {
    public static final boolean DEBUG = false;

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m7104d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m7105d2 = {"androidx/constraintlayout/compose/ConstraintLayoutKt$createId$1", "", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$createId$1 */
    public static final class C21081 {
    }

    @Composable
    public static final void ConstraintLayout(@Nullable Modifier modifier, int i, @NotNull Function3<? super ConstraintLayoutScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-270267587);
        if ((i3 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            i = 257;
        }
        int i4 = i;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Measurer();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Measurer measurer = (Measurer) objRememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new ConstraintLayoutScope();
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = rememberConstraintLayoutMeasurePolicy(i4, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composer, ((i2 >> 3) & 14) | 4544);
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.ConstraintLayout.1
            public C21021() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
            }
        }, 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.ConstraintLayout.2
            public final /* synthetic */ int $$changed;
            public final /* synthetic */ Function3<ConstraintLayoutScope, Composer, Integer, Unit> $content;
            public final /* synthetic */ Function0<Unit> $onHelpersChanged;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C21032(Function3<? super ConstraintLayoutScope, ? super Composer, ? super Integer, Unit> content2, int i22, Function0<Unit> function0) {
                super(2);
                function3 = content2;
                i = i22;
                function0 = function0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer2, int i5) {
                if (((i5 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    function3.invoke(constraintLayoutScope, composer2, Integer.valueOf(((i >> 3) & 112) | 8));
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), pairRememberConstraintLayoutMeasurePolicy.component1(), composer, 48, 0);
        composer.endReplaceableGroup();
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$1 */
    /* loaded from: classes4.dex */
    public static final class C21021 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public C21021() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
        }
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$2 */
    /* loaded from: classes4.dex */
    public static final class C21032 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function3<ConstraintLayoutScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ Function0<Unit> $onHelpersChanged;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21032(Function3<? super ConstraintLayoutScope, ? super Composer, ? super Integer, Unit> content2, int i22, Function0<Unit> function0) {
            super(2);
            function3 = content2;
            i = i22;
            function0 = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer2, int i5) {
            if (((i5 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                constraintLayoutScope.reset();
                function3.invoke(constraintLayoutScope, composer2, Integer.valueOf(((i >> 3) & 112) | 8));
                if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                    function0.invoke();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final Pair<MeasurePolicy, Function0<Unit>> rememberConstraintLayoutMeasurePolicy(final int i, @NotNull ConstraintLayoutScope scope, @NotNull final MutableState<Boolean> remeasureRequesterState, @NotNull final Measurer measurer, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(remeasureRequesterState, "remeasureRequesterState");
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        composer.startReplaceableGroup(-441911751);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new ConstraintSetForInlineDsl(scope);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue;
        Integer numValueOf = Integer.valueOf(i);
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed(numValueOf);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = TuplesKt.m7112to(new MeasurePolicy() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1
                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                @NotNull
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope MeasurePolicy, @NotNull final List<? extends Measurable> measurables, long j) throws NumberFormatException {
                    Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    long jM13981performMeasureDjhGOtQ = measurer.m13981performMeasureDjhGOtQ(j, MeasurePolicy.getLayoutDirection(), constraintSetForInlineDsl, measurables, i, MeasurePolicy);
                    remeasureRequesterState.getValue();
                    int iM13836getWidthimpl = IntSize.m13836getWidthimpl(jM13981performMeasureDjhGOtQ);
                    int iM13835getHeightimpl = IntSize.m13835getHeightimpl(jM13981performMeasureDjhGOtQ);
                    final Measurer measurer2 = measurer;
                    return MeasureScope.layout$default(MeasurePolicy, iM13836getWidthimpl, iM13835getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            measurer2.performLayout(layout, measurables);
                        }
                    }, 4, null);
                }
            }, new Function0<Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1
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
                    remeasureRequesterState.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
                    constraintSetForInlineDsl.setKnownDirty(true);
                }
            });
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        Pair<MeasurePolicy, Function0<Unit>> pair = (Pair) objRememberedValue2;
        composer.endReplaceableGroup();
        return pair;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    public static final void ConstraintLayout(@NotNull ConstraintSet constraintSet, @Nullable Modifier modifier, int i, boolean z, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function0<Unit> function0, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2, int i3) {
        final Measurer measurer;
        LayoutInformationReceiver layoutInformationReceiver;
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-270262697);
        Modifier modifierScale = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 4) != 0 ? 257 : i;
        boolean z2 = (i3 & 8) != 0 ? false : z;
        AnimationSpec<Float> animationSpecTween$default = (i3 & 16) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        Function0<Unit> function02 = (i3 & 32) != 0 ? null : function0;
        if (z2) {
            composer.startReplaceableGroup(-270262314);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            Animatable animatable = (Animatable) objRememberedValue3;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            Channel channel = (Channel) objRememberedValue4;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.ConstraintLayout.3
                public final /* synthetic */ Channel<ConstraintSet> $channel;
                public final /* synthetic */ ConstraintSet $constraintSet;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C21043(Channel<ConstraintSet> channel2, ConstraintSet constraintSet2) {
                    super(0);
                    channel = channel2;
                    constraintSet = constraintSet2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    channel.mo17201trySendJP2dKIU(constraintSet);
                }
            }, composer, 0);
            EffectsKt.LaunchedEffect(channel2, new C21054(channel2, (MutableState) objRememberedValue5, animatable, animationSpecTween$default, function02, mutableState, mutableState2, null), composer, 8);
            ConstraintSet constraintSetM13958ConstraintLayout$lambda6 = m13958ConstraintLayout$lambda6(mutableState);
            ConstraintSet constraintSetM13960ConstraintLayout$lambda9 = m13960ConstraintLayout$lambda9(mutableState2);
            float fFloatValue = ((Number) animatable.getValue()).floatValue();
            composer.startReplaceableGroup(-1330873847);
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.NONE;
            EnumSet enumSetOf = EnumSet.of(motionLayoutDebugFlags);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(MotionLayoutDebugFlags.NONE)");
            composer.startReplaceableGroup(-1330870962);
            final int i5 = 229376 | ((229376 | ((((i2 << 12) & 458752) << 3) & 3670016)) & 3670016);
            composer.startReplaceableGroup(-1401224268);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new MotionMeasurer();
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue6;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue7 = composer.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new MotionLayoutScope(motionMeasurer);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceableGroup();
            final MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue7;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue8;
            mutableState3.setValue(Float.valueOf(fFloatValue));
            MeasurePolicy measurePolicyRememberMotionLayoutMeasurePolicy = MotionLayoutKt.rememberMotionLayoutMeasurePolicy(257, enumSetOf, 0L, constraintSetM13958ConstraintLayout$lambda6, constraintSetM13960ConstraintLayout$lambda9, null, mutableState3, motionMeasurer, composer, 18350528);
            motionMeasurer.addLayoutInformationReceiver(null);
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            if (!enumSetOf.contains(motionLayoutDebugFlags) || !Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceableGroup(-1401223142);
                if (!Float.isNaN(forcedScaleFactor)) {
                    modifierScale = ScaleKt.scale(modifierScale, motionMeasurer.getForcedScaleFactor());
                }
                composer.startReplaceableGroup(-1990474327);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089335);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, density, companion3.getSetDensity());
                Updater.m10877setimpl(composerM10870constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                composer.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt$MotionLayoutCore$3$1(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819900388, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i6) {
                        if (((i6 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            content.invoke(composer2, Integer.valueOf((i2 >> 18) & 14));
                        }
                    }
                }), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                if (!Float.isNaN(forcedScaleFactor)) {
                    composer.startReplaceableGroup(-922833881);
                    motionMeasurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 518);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833807);
                    composer.endReplaceableGroup();
                }
                if (!enumSetOf.contains(motionLayoutDebugFlags)) {
                    composer.startReplaceableGroup(-922833740);
                    motionMeasurer.drawDebug(boxScopeInstance, composer, 70);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-922833689);
                    composer.endReplaceableGroup();
                }
                Unit unit = Unit.INSTANCE;
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1401222327);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, new MotionLayoutKt.C21214(motionMeasurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819896774, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i6) {
                        if (((i6 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            content.invoke(composer2, Integer.valueOf((i2 >> 18) & 14));
                        }
                    }
                }), measurePolicyRememberMotionLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-270260906);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue9 = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue9 == companion4.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                composer.updateRememberedValue(objRememberedValue9);
            }
            composer.endReplaceableGroup();
            MutableState<Long> mutableState4 = (MutableState) objRememberedValue9;
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue10 = composer.rememberedValue();
            if (objRememberedValue10 == companion4.getEmpty()) {
                objRememberedValue10 = new Measurer();
                composer.updateRememberedValue(objRememberedValue10);
            }
            composer.endReplaceableGroup();
            Measurer measurer2 = (Measurer) objRememberedValue10;
            Modifier modifier2 = modifierScale;
            MeasurePolicy measurePolicyRememberConstraintLayoutMeasurePolicy = rememberConstraintLayoutMeasurePolicy(i4, mutableState4, constraintSet2, measurer2, composer, ((i2 << 6) & 896) | ((i2 >> 6) & 14) | 4144);
            if (constraintSet2 instanceof EditableJSONLayout) {
                ((EditableJSONLayout) constraintSet2).setUpdateFlag(mutableState4);
            }
            if (constraintSet2 instanceof LayoutInformationReceiver) {
                layoutInformationReceiver = (LayoutInformationReceiver) constraintSet2;
                measurer = measurer2;
            } else {
                measurer = measurer2;
                layoutInformationReceiver = null;
            }
            measurer.addLayoutInformationReceiver(layoutInformationReceiver);
            float forcedScaleFactor2 = measurer.getForcedScaleFactor();
            if (!Float.isNaN(forcedScaleFactor2)) {
                composer.startReplaceableGroup(-270260292);
                Modifier modifierScale2 = ScaleKt.scale(modifier2, measurer.getForcedScaleFactor());
                composer.startReplaceableGroup(-1990474327);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089335);
                Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion5);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, density2, companion6.getSetDensity());
                Updater.m10877setimpl(composerM10870constructorimpl2, layoutDirection2, companion6.getSetLayoutDirection());
                composer.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$6$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
                    }
                }, 1, null), ComposableLambdaKt.composableLambda(composer, -819900598, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$6$2
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

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i6) {
                        if (((i6 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                            measurer.createDesignElements(composer2, 8);
                            content.invoke(composer2, Integer.valueOf((i2 >> 18) & 14));
                        } else {
                            composer2.skipToGroupEnd();
                        }
                    }
                }), measurePolicyRememberConstraintLayoutMeasurePolicy, composer, 48, 0);
                measurer.drawDebugBounds(boxScopeInstance2, forcedScaleFactor2, composer, 518);
                Unit unit2 = Unit.INSTANCE;
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-270259702);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.ConstraintLayout.7
                    public C21067() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
                    }
                }, 1, null), ComposableLambdaKt.composableLambda(composer, -819901122, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.ConstraintLayout.8
                    public final /* synthetic */ int $$changed;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C21078(final Function2<? super Composer, ? super Integer, Unit> content2, final int i22) {
                        super(2);
                        function2 = content2;
                        i = i22;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i6) {
                        if (((i6 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                            measurer.createDesignElements(composer2, 8);
                            function2.invoke(composer2, Integer.valueOf((i >> 18) & 14));
                        } else {
                            composer2.skipToGroupEnd();
                        }
                    }
                }), measurePolicyRememberConstraintLayoutMeasurePolicy, composer, 48, 0);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$3 */
    /* loaded from: classes4.dex */
    public static final class C21043 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Channel<ConstraintSet> $channel;
        public final /* synthetic */ ConstraintSet $constraintSet;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21043(Channel<ConstraintSet> channel2, ConstraintSet constraintSet2) {
            super(0);
            channel = channel2;
            constraintSet = constraintSet2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            channel.mo17201trySendJP2dKIU(constraintSet);
        }
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$7 */
    /* loaded from: classes4.dex */
    public static final class C21067 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public C21067() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
        }
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$8 */
    /* loaded from: classes4.dex */
    public static final class C21078 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21078(final Function2<? super Composer, ? super Integer, Unit> content2, final int i22) {
            super(2);
            function2 = content2;
            i = i22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer2, int i6) {
            if (((i6 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                measurer.createDesignElements(composer2, 8);
                function2.invoke(composer2, Integer.valueOf((i >> 18) & 14));
            } else {
                composer2.skipToGroupEnd();
            }
        }
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rememberConstraintLayoutMeasurePolicy(final int i, @NotNull MutableState<Long> needsUpdate, @NotNull final ConstraintSet constraintSet, @NotNull final Measurer measurer, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(needsUpdate, "needsUpdate");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        composer.startReplaceableGroup(-441904452);
        Integer numValueOf = Integer.valueOf(i);
        Long value = needsUpdate.getValue();
        composer.startReplaceableGroup(-3686095);
        boolean zChanged = composer.changed(value) | composer.changed(numValueOf) | composer.changed(constraintSet);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            measurer.parseDesignElements(constraintSet);
            objRememberedValue = new MeasurePolicy() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1
                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                @NotNull
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope MeasurePolicy, @NotNull final List<? extends Measurable> measurables, long j) throws NumberFormatException {
                    Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    long jM13981performMeasureDjhGOtQ = measurer.m13981performMeasureDjhGOtQ(j, MeasurePolicy.getLayoutDirection(), constraintSet, measurables, i, MeasurePolicy);
                    int iM13836getWidthimpl = IntSize.m13836getWidthimpl(jM13981performMeasureDjhGOtQ);
                    int iM13835getHeightimpl = IntSize.m13835getHeightimpl(jM13981performMeasureDjhGOtQ);
                    final Measurer measurer2 = measurer;
                    return MeasureScope.layout$default(MeasurePolicy, iM13836getWidthimpl, iM13835getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$2$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            measurer2.performLayout(layout, measurables);
                        }
                    }, 4, null);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    @NotNull
    public static final Object createId() {
        return new Object() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.createId.1
        };
    }

    @NotNull
    public static final Dimension.MaxCoercible getAtLeastWrapContent(@NotNull Dimension.Coercible coercible) {
        Intrinsics.checkNotNullParameter(coercible, "<this>");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.setMinSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @NotNull
    /* renamed from: atLeast-3ABfNKs */
    public static final Dimension.MaxCoercible m13965atLeast3ABfNKs(@NotNull Dimension.Coercible atLeast, float f) {
        Intrinsics.checkNotNullParameter(atLeast, "$this$atLeast");
        DimensionDescription dimensionDescription = (DimensionDescription) atLeast;
        dimensionDescription.m13976setMinYLDhkOg(C2046Dp.m13664boximpl(f));
        return dimensionDescription;
    }

    @NotNull
    /* renamed from: atMost-3ABfNKs */
    public static final Dimension.MinCoercible m13968atMost3ABfNKs(@NotNull Dimension.Coercible atMost, float f) {
        Intrinsics.checkNotNullParameter(atMost, "$this$atMost");
        DimensionDescription dimensionDescription = (DimensionDescription) atMost;
        dimensionDescription.m13975setMaxYLDhkOg(C2046Dp.m13664boximpl(f));
        return dimensionDescription;
    }

    @NotNull
    public static final Dimension.MinCoercible getAtMostWrapContent(@NotNull Dimension.Coercible coercible) {
        Intrinsics.checkNotNullParameter(coercible, "<this>");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.setMaxSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @Deprecated(message = "Unintended method name, use atLeast(dp) instead", replaceWith = @ReplaceWith(expression = "this.atLeast(dp)", imports = {"androidx.constraintlayout.compose.atLeast"}))
    @NotNull
    /* renamed from: atLeastWrapContent-3ABfNKs */
    public static final Dimension m13967atLeastWrapContent3ABfNKs(@NotNull Dimension.MinCoercible atLeastWrapContent, float f) {
        Intrinsics.checkNotNullParameter(atLeastWrapContent, "$this$atLeastWrapContent");
        DimensionDescription dimensionDescription = (DimensionDescription) atLeastWrapContent;
        dimensionDescription.m13976setMinYLDhkOg(C2046Dp.m13664boximpl(f));
        return dimensionDescription;
    }

    @NotNull
    /* renamed from: atLeast-3ABfNKs */
    public static final Dimension m13966atLeast3ABfNKs(@NotNull Dimension.MinCoercible atLeast, float f) {
        Intrinsics.checkNotNullParameter(atLeast, "$this$atLeast");
        DimensionDescription dimensionDescription = (DimensionDescription) atLeast;
        dimensionDescription.m13976setMinYLDhkOg(C2046Dp.m13664boximpl(f));
        return dimensionDescription;
    }

    @NotNull
    public static final Dimension getAtLeastWrapContent(@NotNull Dimension.MinCoercible minCoercible) {
        Intrinsics.checkNotNullParameter(minCoercible, "<this>");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.setMinSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @NotNull
    /* renamed from: atMost-3ABfNKs */
    public static final Dimension m13969atMost3ABfNKs(@NotNull Dimension.MaxCoercible atMost, float f) {
        Intrinsics.checkNotNullParameter(atMost, "$this$atMost");
        DimensionDescription dimensionDescription = (DimensionDescription) atMost;
        dimensionDescription.m13975setMaxYLDhkOg(C2046Dp.m13664boximpl(f));
        return dimensionDescription;
    }

    @NotNull
    public static final Dimension getAtMostWrapContent(@NotNull Dimension.MaxCoercible maxCoercible) {
        Intrinsics.checkNotNullParameter(maxCoercible, "<this>");
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.setMaxSymbol(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        return dimensionDescription;
    }

    @Composable
    @SuppressLint({"ComposableNaming"})
    @NotNull
    public static final ConstraintSet ConstraintSet(@Language("json5") @NotNull String content, @Language("json5") @Nullable String str, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1704604894);
        if ((i2 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(content) | composer.changed(str2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new JSONConstraintSet(content, str2, null, 4, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        JSONConstraintSet jSONConstraintSet = (JSONConstraintSet) objRememberedValue;
        composer.endReplaceableGroup();
        return jSONConstraintSet;
    }

    @NotNull
    public static final ConstraintSet ConstraintSet(@Language("json5") @NotNull String jsonContent) {
        Intrinsics.checkNotNullParameter(jsonContent, "jsonContent");
        return new JSONConstraintSet(jsonContent, null, null, 6, null);
    }

    @NotNull
    public static final ConstraintSet ConstraintSet(@NotNull ConstraintSet extendConstraintSet, @Language("json5") @NotNull String jsonContent) {
        Intrinsics.checkNotNullParameter(extendConstraintSet, "extendConstraintSet");
        Intrinsics.checkNotNullParameter(jsonContent, "jsonContent");
        return new JSONConstraintSet(jsonContent, null, extendConstraintSet, 2, null);
    }

    @NotNull
    public static final ConstraintSet ConstraintSet(@NotNull Function1<? super ConstraintSetScope, Unit> description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new DslConstraintSet(description, null, 2, null);
    }

    @NotNull
    public static final ConstraintSet ConstraintSet(@NotNull ConstraintSet extendConstraintSet, @NotNull Function1<? super ConstraintSetScope, Unit> description) {
        Intrinsics.checkNotNullParameter(extendConstraintSet, "extendConstraintSet");
        Intrinsics.checkNotNullParameter(description, "description");
        return new DslConstraintSet(description, extendConstraintSet);
    }

    public static final String toDebugString(ConstraintWidget constraintWidget) {
        return ((Object) constraintWidget.getDebugName()) + " width " + constraintWidget.getWidth() + " minWidth " + constraintWidget.getMinWidth() + " maxWidth " + constraintWidget.getMaxWidth() + " height " + constraintWidget.getHeight() + " minHeight " + constraintWidget.getMinHeight() + " maxHeight " + constraintWidget.getMaxHeight() + " HDB " + constraintWidget.getHorizontalDimensionBehaviour() + " VDB " + constraintWidget.getVerticalDimensionBehaviour() + " MCW " + constraintWidget.mMatchConstraintDefaultWidth + " MCH " + constraintWidget.mMatchConstraintDefaultHeight + " percentW " + constraintWidget.mMatchConstraintPercentWidth + " percentH " + constraintWidget.mMatchConstraintPercentHeight;
    }

    public static final String toDebugString(BasicMeasure.Measure measure) {
        return "measure strategy is ";
    }

    public static final void buildMapping(@NotNull State state, @NotNull List<? extends Measurable> measurables) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Measurable measurable = measurables.get(i);
            Object layoutId = LayoutIdKt.getLayoutId(measurable);
            if (layoutId == null && (layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable)) == null) {
                layoutId = createId();
            }
            state.map(layoutId, measurable);
            Object constraintLayoutTag = ConstraintLayoutTagKt.getConstraintLayoutTag(measurable);
            if (constraintLayoutTag != null && (constraintLayoutTag instanceof String) && (layoutId instanceof String)) {
                state.setTag((String) layoutId, (String) constraintLayoutTag);
            }
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: ConstraintLayout$lambda-6 */
    public static final ConstraintSet m13958ConstraintLayout$lambda6(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* renamed from: ConstraintLayout$lambda-7 */
    public static final void m13959ConstraintLayout$lambda7(MutableState<ConstraintSet> mutableState, ConstraintSet constraintSet) {
        mutableState.setValue(constraintSet);
    }

    /* renamed from: ConstraintLayout$lambda-9 */
    public static final ConstraintSet m13960ConstraintLayout$lambda9(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* renamed from: ConstraintLayout$lambda-10 */
    public static final void m13957ConstraintLayout$lambda10(MutableState<ConstraintSet> mutableState, ConstraintSet constraintSet) {
        mutableState.setValue(constraintSet);
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4", m7120f = "ConstraintLayout.kt", m7121i = {}, m7122l = {MatroskaExtractor.ID_TIME_CODE, 240}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4 */
    /* loaded from: classes2.dex */
    public static final class C21054 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ AnimationSpec<Float> $animationSpec;
        public final /* synthetic */ Channel<ConstraintSet> $channel;
        public final /* synthetic */ MutableState<Integer> $direction;
        public final /* synthetic */ MutableState<ConstraintSet> $endConstraint$delegate;
        public final /* synthetic */ Function0<Unit> $finishedAnimationListener;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
        public final /* synthetic */ MutableState<ConstraintSet> $startConstraint$delegate;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21054(Channel<ConstraintSet> channel, MutableState<Integer> mutableState, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, Function0<Unit> function0, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3, Continuation<? super C21054> continuation) {
            super(2, continuation);
            this.$channel = channel;
            this.$direction = mutableState;
            this.$progress = animatable;
            this.$animationSpec = animationSpec;
            this.$finishedAnimationListener = function0;
            this.$startConstraint$delegate = mutableState2;
            this.$endConstraint$delegate = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C21054(this.$channel, this.$direction, this.$progress, this.$animationSpec, this.$finishedAnimationListener, this.$startConstraint$delegate, this.$endConstraint$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C21054) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:60:0x003b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00e3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x00ba -> B:53:0x0015). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x00e0 -> B:58:0x0031). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ChannelIterator<ConstraintSet> it;
            ChannelIterator<ConstraintSet> channelIterator;
            Object objHasNext;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                it = this.$channel.iterator();
                this.L$0 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext != coroutine_suspended) {
                }
            } else if (i == 1) {
                channelIterator = (ChannelIterator) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i == 2) {
                channelIterator = (ChannelIterator) this.L$0;
                ResultKt.throwOnFailure(obj);
                it = channelIterator;
                MutableState<Integer> mutableState = this.$direction;
                mutableState.setValue(Boxing.boxInt(mutableState.getValue().intValue() != 1 ? 0 : 1));
                Function0<Unit> function0 = this.$finishedAnimationListener;
                if (function0 != null) {
                    function0.invoke();
                }
                this.L$0 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                channelIterator = it;
                obj = objHasNext;
                if (!((Boolean) obj).booleanValue()) {
                    ConstraintSet next = channelIterator.next();
                    ConstraintSet constraintSet = (ConstraintSet) ChannelResult.m17216getOrNullimpl(this.$channel.mo17206tryReceivePtdJZtk());
                    if (constraintSet != null) {
                        next = constraintSet;
                    }
                    if (Intrinsics.areEqual(next, this.$direction.getValue().intValue() == 1 ? ConstraintLayoutKt.m13958ConstraintLayout$lambda6(this.$startConstraint$delegate) : ConstraintLayoutKt.m13960ConstraintLayout$lambda9(this.$endConstraint$delegate))) {
                        it = channelIterator;
                        this.L$0 = it;
                        this.label = 1;
                        objHasNext = it.hasNext(this);
                        if (objHasNext != coroutine_suspended) {
                        }
                    } else {
                        if (this.$direction.getValue().intValue() == 1) {
                            ConstraintLayoutKt.m13957ConstraintLayout$lambda10(this.$endConstraint$delegate, next);
                        } else {
                            ConstraintLayoutKt.m13959ConstraintLayout$lambda7(this.$startConstraint$delegate, next);
                        }
                        Animatable<Float, AnimationVector1D> animatable = this.$progress;
                        Float fBoxFloat = Boxing.boxFloat(this.$direction.getValue().intValue());
                        AnimationSpec<Float> animationSpec = this.$animationSpec;
                        this.L$0 = channelIterator;
                        this.label = 2;
                        if (Animatable.animateTo$default(animatable, fBoxFloat, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it = channelIterator;
                        MutableState<Integer> mutableState2 = this.$direction;
                        mutableState2.setValue(Boxing.boxInt(mutableState2.getValue().intValue() != 1 ? 0 : 1));
                        Function0<Unit> function02 = this.$finishedAnimationListener;
                        if (function02 != null) {
                        }
                        this.L$0 = it;
                        this.label = 1;
                        objHasNext = it.hasNext(this);
                        if (objHasNext != coroutine_suspended) {
                        }
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
