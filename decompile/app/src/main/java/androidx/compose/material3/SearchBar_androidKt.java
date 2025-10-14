package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.ZIndexModifierKt;
import androidx.compose.p003ui.focus.FocusChangedModifierKt;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.focus.FocusRequesterModifierKt;
import androidx.compose.p003ui.focus.FocusState;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.RoundRectKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.LayoutModifierKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.text.style.TextMotion;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SearchBar.android.kt */
@Metadata(m7104d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0087\u0002\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"0&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00102\b\b\u0002\u00108\u001a\u00020\u00102\b\b\u0002\u00109\u001a\u00020:2\u001c\u0010;\u001a\u0018\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\"0&¢\u0006\u0002\b0¢\u0006\u0002\b=H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a\u0091\u0002\u0010@\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"0&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00102\b\b\u0002\u00108\u001a\u00020\u00102\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u00109\u001a\u00020:2\u001c\u0010;\u001a\u0018\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\"0&¢\u0006\u0002\b0¢\u0006\u0002\b=H\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001aÆ\u0001\u0010E\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"0&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00105\u001a\u00020F2\b\b\u0002\u00109\u001a\u00020:H\u0003¢\u0006\u0002\u0010G\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0018\u001a\u00020\u0010X\u0082\u0004¢\u0006\n\n\u0002\u0010\u0013\u0012\u0004\b\u0019\u0010\u001a\"\u0010\u0010\u001b\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013\"\u0010\u0010\u001c\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013\"\u0016\u0010\u001d\u001a\u00020\u0010X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001e\u0010\u0012\"\u0016\u0010\u001f\u001a\u00020\u0010X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b \u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H²\u0006\n\u0010I\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010J\u001a\u00020)X\u008a\u0084\u0002"}, m7105d2 = {"AnimationDelayMillis", "", "AnimationEnterDurationMillis", "AnimationEnterEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationEnterFloatSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "AnimationEnterSizeSpec", "Landroidx/compose/ui/unit/IntSize;", "AnimationExitDurationMillis", "AnimationExitEasing", "AnimationExitFloatSpec", "AnimationExitSizeSpec", "DockedActiveTableMaxHeightScreenRatio", "DockedActiveTableMinHeight", "Landroidx/compose/ui/unit/Dp;", "getDockedActiveTableMinHeight", "()F", "F", "DockedEnterTransition", "Landroidx/compose/animation/EnterTransition;", "DockedExitTransition", "Landroidx/compose/animation/ExitTransition;", "SearchBarCornerRadius", "getSearchBarCornerRadius$annotations", "()V", "SearchBarIconOffsetX", "SearchBarMaxWidth", "SearchBarMinWidth", "getSearchBarMinWidth", "SearchBarVerticalPadding", "getSearchBarVerticalPadding", "DockedSearchBar", "", SearchIntents.EXTRA_QUERY, "", "onQueryChange", "Lkotlin/Function1;", "onSearch", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "onActiveChange", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "placeholder", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "leadingIcon", "trailingIcon", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/SearchBarColors;", "tonalElevation", "shadowElevation", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DockedSearchBar-eWTbjVg", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBar", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "SearchBar-WuY5d9Q", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarInputField", "Landroidx/compose/material3/TextFieldColors;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "material3_release", "useFullScreenShape", "showResults"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,741:1\n1116#2,6:742\n1116#2,6:750\n1116#2,6:756\n1116#2,6:762\n1116#2,6:768\n1116#2,6:774\n1116#2,6:780\n1116#2,6:786\n1116#2,6:792\n1116#2,6:798\n1116#2,6:805\n1116#2,6:811\n1116#2,6:817\n1116#2,6:823\n1116#2,6:834\n1116#2,6:840\n1116#2,6:847\n74#3:748\n74#3:749\n74#3:804\n74#3:831\n74#3:846\n60#4:829\n62#4:830\n658#5:832\n646#5:833\n81#6:853\n75#7:854\n154#8:855\n154#8:856\n154#8:857\n154#8:858\n154#8:859\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n*L\n176#1:742,6\n189#1:750,6\n192#1:756,6\n212#1:762,6\n213#1:768,6\n228#1:774,6\n232#1:780,6\n287#1:786,6\n296#1:792,6\n363#1:798,6\n416#1:805,6\n425#1:811,6\n444#1:817,6\n446#1:823,6\n460#1:834,6\n461#1:840,6\n476#1:847,6\n184#1:748\n185#1:749\n366#1:804\n449#1:831\n473#1:846\n447#1:829\n448#1:830\n449#1:832\n449#1:833\n189#1:853\n702#1:854\n703#1:855\n705#1:856\n706#1:857\n707#1:858\n709#1:859\n*E\n"})
/* loaded from: classes2.dex */
public final class SearchBar_androidKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;

    @NotNull
    private static final CubicBezierEasing AnimationEnterEasing;

    @NotNull
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;

    @NotNull
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;

    @NotNull
    private static final CubicBezierEasing AnimationExitEasing;

    @NotNull
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;

    @NotNull
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final float DockedActiveTableMaxHeightScreenRatio = 0.6666667f;

    @NotNull
    private static final EnterTransition DockedEnterTransition;

    @NotNull
    private static final ExitTransition DockedExitTransition;
    private static final float SearchBarCornerRadius = C2046Dp.m13666constructorimpl(SearchBarDefaults.INSTANCE.m9692getInputFieldHeightD9Ej5fM() / 2);
    private static final float DockedActiveTableMinHeight = C2046Dp.m13666constructorimpl(240);
    private static final float SearchBarMinWidth = C2046Dp.m13666constructorimpl(360);
    private static final float SearchBarMaxWidth = C2046Dp.m13666constructorimpl(720);
    private static final float SearchBarVerticalPadding = C2046Dp.m13666constructorimpl(8);
    private static final float SearchBarIconOffsetX = C2046Dp.m13666constructorimpl(4);

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04b6 A[PHI: r6
  0x04b6: PHI (r6v34 androidx.compose.foundation.layout.WindowInsets) = (r6v25 androidx.compose.foundation.layout.WindowInsets), (r6v35 androidx.compose.foundation.layout.WindowInsets) binds: [B:291:0x04b4, B:287:0x04ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:333:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0121  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SearchBar-WuY5d9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9698SearchBarWuY5d9Q(@NotNull final String str, @NotNull final Function1<? super String, Unit> function1, @NotNull final Function1<? super String, Unit> function12, final boolean z, @NotNull final Function1<? super Boolean, Unit> function13, @Nullable Modifier modifier, boolean z2, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Shape shape, @Nullable SearchBarColors searchBarColors, float f, float f2, @Nullable WindowInsets windowInsets, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Shape inputFieldShape;
        int i15;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i16;
        int i17;
        SearchBarColors searchBarColorsM9690colorsKlgxPg;
        int i18;
        WindowInsets windowInsets2;
        int i19;
        Function2<? super Composer, ? super Integer, Unit> function28;
        SearchBarColors searchBarColors2;
        float f3;
        float f4;
        WindowInsets windowInsets3;
        int i20;
        Modifier modifier2;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource2;
        int i21;
        final State<Float> stateAnimateFloatAsState;
        final Density density;
        Shape inputFieldShape2;
        Shape fullScreenShape;
        Object objRememberedValue;
        Composer.Companion companion;
        State state;
        boolean zChanged;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final MutableWindowInsets mutableWindowInsets;
        boolean zChanged2;
        Object objRememberedValue4;
        final WindowInsets windowInsets4;
        boolean z5;
        Object objRememberedValue5;
        boolean zChanged3;
        Object objRememberedValue6;
        Composer composer2;
        boolean z6;
        boolean zChanged4;
        Object objRememberedValue7;
        boolean z7;
        Object objRememberedValue8;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final SearchBarColors searchBarColors3;
        final float f5;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final WindowInsets windowInsets5;
        final Shape shape3;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1001512593);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            int i22 = 8192;
            if ((i3 & 16) == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else if ((i & CpioConstants.C_ISBLK) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                function24 = function2;
            } else {
                function24 = function2;
                if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function22) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
            }
            i9 = i3 & 512;
            if (i9 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
            }
            if ((i2 & 6) != 0) {
                i10 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(shape)) ? 4 : 2);
            } else {
                i10 = i2;
            }
            if ((i2 & 48) == 0) {
                i10 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(searchBarColors)) ? 32 : 16;
            }
            int i23 = i10;
            i11 = i3 & 4096;
            if (i11 == 0) {
                i23 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i23 |= composerStartRestartGroup.changed(f) ? 256 : 128;
                }
                i12 = i3 & 8192;
                if (i12 != 0) {
                    i23 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i23 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
                    }
                    if ((i2 & CpioConstants.C_ISBLK) == 0) {
                        if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(windowInsets)) {
                            i22 = 16384;
                        }
                        i23 |= i22;
                    }
                    i13 = i3 & 32768;
                    if (i13 != 0) {
                        if ((i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                            i14 = i12;
                            i23 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
                        }
                        if ((i3 & 65536) != 0) {
                            i23 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i23 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        int i24 = i4;
                        if ((i4 & 306783379) == 306783378 && (599187 & i23) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            function211 = function22;
                            shape3 = shape;
                            searchBarColors3 = searchBarColors;
                            f5 = f;
                            f4 = f2;
                            mutableInteractionSource3 = mutableInteractionSource;
                            function210 = function24;
                            windowInsets5 = windowInsets;
                            z8 = z3;
                            composer2 = composerStartRestartGroup;
                            function29 = function23;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier;
                                z4 = i6 == 0 ? true : z3;
                                function25 = i7 == 0 ? null : function24;
                                function26 = i8 == 0 ? null : function22;
                                Function2<? super Composer, ? super Integer, Unit> function212 = i9 == 0 ? null : function23;
                                if ((i3 & 1024) == 0) {
                                    i23 &= -15;
                                    inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                                } else {
                                    inputFieldShape = shape;
                                }
                                int i25 = i23;
                                if ((i3 & 2048) == 0) {
                                    i15 = i24;
                                    i16 = i14;
                                    i17 = i11;
                                    function27 = function212;
                                    searchBarColorsM9690colorsKlgxPg = SearchBarDefaults.INSTANCE.m9690colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                                    i25 &= -113;
                                } else {
                                    i15 = i24;
                                    function27 = function212;
                                    i16 = i14;
                                    i17 = i11;
                                    searchBarColorsM9690colorsKlgxPg = searchBarColors;
                                }
                                float fM9694getTonalElevationD9Ej5fM = i17 == 0 ? SearchBarDefaults.INSTANCE.m9694getTonalElevationD9Ej5fM() : f;
                                float fM9693getShadowElevationD9Ej5fM = i16 == 0 ? SearchBarDefaults.INSTANCE.m9693getShadowElevationD9Ej5fM() : f2;
                                if ((i3 & 16384) == 0) {
                                    i18 = 6;
                                    windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                    i19 = i25 & (-57345);
                                } else {
                                    i18 = 6;
                                    windowInsets2 = windowInsets;
                                    i19 = i25;
                                }
                                if (i13 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(851477946);
                                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue9 = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                    }
                                    MutableInteractionSource mutableInteractionSource4 = (MutableInteractionSource) objRememberedValue9;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    function28 = function27;
                                    searchBarColors2 = searchBarColorsM9690colorsKlgxPg;
                                    f3 = fM9694getTonalElevationD9Ej5fM;
                                    f4 = fM9693getShadowElevationD9Ej5fM;
                                    modifier2 = modifier4;
                                    shape2 = inputFieldShape;
                                    windowInsets3 = windowInsets2;
                                    i20 = i19;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                } else {
                                    function28 = function27;
                                    searchBarColors2 = searchBarColorsM9690colorsKlgxPg;
                                    f3 = fM9694getTonalElevationD9Ej5fM;
                                    f4 = fM9693getShadowElevationD9Ej5fM;
                                    windowInsets3 = windowInsets2;
                                    i20 = i19;
                                    modifier2 = modifier4;
                                    shape2 = inputFieldShape;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 1024) != 0) {
                                    i23 &= -15;
                                }
                                if ((i3 & 2048) != 0) {
                                    i23 &= -113;
                                }
                                if ((i3 & 16384) != 0) {
                                    i23 &= -57345;
                                }
                                modifier2 = modifier;
                                function26 = function22;
                                function28 = function23;
                                searchBarColors2 = searchBarColors;
                                f3 = f;
                                f4 = f2;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i15 = i24;
                                i20 = i23;
                                z4 = z3;
                                function25 = function24;
                                i18 = 6;
                                shape2 = shape;
                                windowInsets3 = windowInsets;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                i21 = i15;
                            } else {
                                i21 = i15;
                                ComposerKt.traceEventStart(1001512593, i21, i20, "androidx.compose.material3.SearchBar (SearchBar.android.kt:177)");
                            }
                            stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, !z ? AnimationEnterFloatSpec : AnimationExitFloatSpec, 0.0f, null, null, composerStartRestartGroup, 0, 28);
                            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            SearchBarDefaults searchBarDefaults = SearchBarDefaults.INSTANCE;
                            int i26 = i21;
                            inputFieldShape2 = searchBarDefaults.getInputFieldShape(composerStartRestartGroup, i18);
                            fullScreenShape = searchBarDefaults.getFullScreenShape(composerStartRestartGroup, i18);
                            composerStartRestartGroup.startReplaceableGroup(851478497);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$useFullScreenShape$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Boolean invoke() {
                                        return Boolean.valueOf(stateAnimateFloatAsState.getValue().floatValue() == 1.0f);
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            state = (State) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            boolean zSearchBar_WuY5d9Q$lambda$2 = SearchBar_WuY5d9Q$lambda$2(state);
                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                            composerStartRestartGroup.startReplaceableGroup(851478623);
                            zChanged = composerStartRestartGroup.changed(zSearchBar_WuY5d9Q$lambda$2) | ((((i20 & 14) ^ 6) <= 4 && composerStartRestartGroup.changed(shape2)) || (i20 & 6) == 4);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                Shape genericShape = !Intrinsics.areEqual(shape2, inputFieldShape2) ? new GenericShape(new Function3<Path, Size, LayoutDirection, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$animatedShape$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Path path, Size size, LayoutDirection layoutDirection) {
                                        m9700invoke12SF9DM(path, size.getPackedValue(), layoutDirection);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-12SF9DM, reason: not valid java name */
                                    public final void m9700invoke12SF9DM(@NotNull Path path, long j, @NotNull LayoutDirection layoutDirection) {
                                        path.addRoundRect(RoundRectKt.m11154RoundRectsniSvfs(SizeKt.m11189toRectuvyYCjk(j), CornerRadiusKt.CornerRadius$default(density.mo7874toPx0680j_4(C2046Dp.m13666constructorimpl(SearchBar_androidKt.SearchBarCornerRadius * (1 - stateAnimateFloatAsState.getValue().floatValue()))), 0.0f, 2, null)));
                                    }
                                }) : SearchBar_WuY5d9Q$lambda$2(state) ? fullScreenShape : shape2;
                                composerStartRestartGroup.updateRememberedValue(genericShape);
                                objRememberedValue2 = genericShape;
                            }
                            Shape shape4 = (Shape) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(851479649);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 != companion.getEmpty()) {
                                objRememberedValue3 = new MutableWindowInsets(null, 1, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            mutableWindowInsets = (MutableWindowInsets) objRememberedValue3;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(851479705);
                            zChanged2 = composerStartRestartGroup.changed(density);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<C2046Dp>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$topPadding$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ C2046Dp invoke() {
                                        return C2046Dp.m13664boximpl(m9701invokeD9Ej5fM());
                                    }

                                    /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
                                    public final float m9701invokeD9Ej5fM() {
                                        return C2046Dp.m13666constructorimpl(SearchBar_androidKt.getSearchBarVerticalPadding() + WindowInsetsKt.asPaddingValues(mutableWindowInsets, density).getTop());
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            final State state2 = (State) objRememberedValue4;
                            composerStartRestartGroup.endReplaceableGroup();
                            long containerColor = searchBarColors2.getContainerColor();
                            WindowInsets windowInsets6 = windowInsets3;
                            long jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(searchBarColors2.getContainerColor(), composerStartRestartGroup, 0);
                            Modifier modifierZIndex = ZIndexModifierKt.zIndex(modifier2, 1.0f);
                            composerStartRestartGroup.startReplaceableGroup(851480211);
                            if (((57344 & i20) ^ CpioConstants.C_ISBLK) <= 16384) {
                                windowInsets4 = windowInsets6;
                                if (composerStartRestartGroup.changed(windowInsets4)) {
                                    z5 = true;
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (z5 || objRememberedValue5 == companion.getEmpty()) {
                                        objRememberedValue5 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets7) {
                                                invoke2(windowInsets7);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull WindowInsets windowInsets7) {
                                                mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets4, windowInsets7));
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    Modifier modifierConsumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifierZIndex, (Function1) objRememberedValue5), mutableWindowInsets);
                                    composerStartRestartGroup.startReplaceableGroup(851480395);
                                    zChanged3 = composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                                        objRememberedValue6 = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                                return m9699invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                            }

                                            @NotNull
                                            /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                            public final MeasureResult m9699invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
                                                final int iMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(DpKt.m13709lerpMdfbLM(state2.getValue().m13680unboximpl(), C2046Dp.m13666constructorimpl(0), stateAnimateFloatAsState.getValue().floatValue()));
                                                int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(Math.max(Constraints.m13624getMinWidthimpl(j), measureScope.mo7868roundToPx0680j_4(SearchBar_androidKt.getSearchBarMinWidth())), Math.min(Constraints.m13622getMaxWidthimpl(j), measureScope.mo7868roundToPx0680j_4(SearchBar_androidKt.SearchBarMaxWidth)));
                                                int iCoerceAtMost2 = RangesKt___RangesKt.coerceAtMost(Math.max(Constraints.m13623getMinHeightimpl(j), measureScope.mo7868roundToPx0680j_4(SearchBarDefaults.INSTANCE.m9692getInputFieldHeightD9Ej5fM())), Constraints.m13621getMaxHeightimpl(j));
                                                int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j);
                                                int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j);
                                                int iLerp = MathHelpersKt.lerp(iCoerceAtMost, iM13622getMaxWidthimpl, stateAnimateFloatAsState.getValue().floatValue());
                                                int iLerp2 = MathHelpersKt.lerp(iCoerceAtMost2, iM13621getMaxHeightimpl, stateAnimateFloatAsState.getValue().floatValue()) + iMo7868roundToPx0680j_4;
                                                final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(ConstraintsKt.m13639offsetNN6EwU$default(Constraints.INSTANCE.m13630fixedJhjzzOo(iLerp, iLerp2), 0, -iMo7868roundToPx0680j_4, 1, null));
                                                return MeasureScope.layout$default(measureScope, iLerp, iLerp2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$3$1.1
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
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, 0, iMo7868roundToPx0680j_4, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i27 = i20;
                                    WindowInsets windowInsets7 = windowInsets4;
                                    final boolean z9 = z4;
                                    final Function2<? super Composer, ? super Integer, Unit> function213 = function25;
                                    Shape shape5 = shape2;
                                    final Function2<? super Composer, ? super Integer, Unit> function214 = function26;
                                    Modifier modifier5 = modifier2;
                                    final Function2<? super Composer, ? super Integer, Unit> function215 = function28;
                                    final SearchBarColors searchBarColors4 = searchBarColors2;
                                    composer2 = composerStartRestartGroup;
                                    int i28 = i27 << 6;
                                    SurfaceKt.m9876SurfaceT9BRK9s(LayoutModifierKt.layout(modifierConsumeWindowInsets, (Function3) objRememberedValue6), shape4, containerColor, jM9292contentColorForek8zF_U, f3, f4, null, ComposableLambdaKt.composableLambda(composer2, 483163116, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
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
                                        public final void invoke(@Nullable Composer composer3, int i29) {
                                            final State<Float> state3;
                                            if ((i29 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(483163116, i29, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:253)");
                                                }
                                                String str2 = str;
                                                Function1<String, Unit> function14 = function1;
                                                Function1<String, Unit> function15 = function12;
                                                boolean z10 = z;
                                                Function1<Boolean, Unit> function16 = function13;
                                                boolean z11 = z9;
                                                Function2<Composer, Integer, Unit> function216 = function213;
                                                Function2<Composer, Integer, Unit> function217 = function214;
                                                Function2<Composer, Integer, Unit> function218 = function215;
                                                SearchBarColors searchBarColors5 = searchBarColors4;
                                                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                                State<Float> state4 = stateAnimateFloatAsState;
                                                State<C2046Dp> state5 = state2;
                                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                                composer3.startReplaceableGroup(-483455358);
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                Arrangement.Vertical top = arrangement.getTop();
                                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                                                composer3.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
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
                                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(-685095283);
                                                Object objRememberedValue10 = composer3.rememberedValue();
                                                Composer.Companion companion5 = Composer.INSTANCE;
                                                if (objRememberedValue10 == companion5.getEmpty()) {
                                                    objRememberedValue10 = new AnimatedPaddingValues(state4, state5);
                                                    composer3.updateRememberedValue(objRememberedValue10);
                                                }
                                                composer3.endReplaceableGroup();
                                                SearchBar_androidKt.SearchBarInputField(str2, function14, function15, z10, function16, PaddingKt.padding(companion2, (AnimatedPaddingValues) objRememberedValue10), z11, function216, function217, function218, searchBarColors5.getInputFieldColors(), mutableInteractionSource6, composer3, ProfileVerifier.CompilationStatus.f342xf2722a21, 0, 0);
                                                composer3.startReplaceableGroup(-685094554);
                                                Object objRememberedValue11 = composer3.rememberedValue();
                                                if (objRememberedValue11 == companion5.getEmpty()) {
                                                    state3 = state4;
                                                    objRememberedValue11 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4$1$showResults$2$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        @NotNull
                                                        public final Boolean invoke() {
                                                            return Boolean.valueOf(state3.getValue().floatValue() > 0.0f);
                                                        }
                                                    });
                                                    composer3.updateRememberedValue(objRememberedValue11);
                                                } else {
                                                    state3 = state4;
                                                }
                                                composer3.endReplaceableGroup();
                                                composer3.startReplaceableGroup(551421253);
                                                if (invoke$lambda$5$lambda$2((State) objRememberedValue11)) {
                                                    composer3.startReplaceableGroup(-685094361);
                                                    boolean zChanged5 = composer3.changed(state3);
                                                    Object objRememberedValue12 = composer3.rememberedValue();
                                                    if (zChanged5 || objRememberedValue12 == companion5.getEmpty()) {
                                                        objRememberedValue12 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                invoke2(graphicsLayerScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                                                                graphicsLayerScope.setAlpha(state3.getValue().floatValue());
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue12);
                                                    }
                                                    composer3.endReplaceableGroup();
                                                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue12);
                                                    composer3.startReplaceableGroup(-483455358);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, 0);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierGraphicsLayer);
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
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    DividerKt.m9424HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors5.getDividerColor(), composer3, 0, 3);
                                                    function32.invoke(columnScopeInstance, composer3, 6);
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                }
                                                composer3.endReplaceableGroup();
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

                                        public static final boolean invoke$lambda$5$lambda$2(State<Boolean> state3) {
                                            return state3.getValue().booleanValue();
                                        }
                                    }), composer2, (57344 & i28) | 12582912 | (i28 & 458752), 64);
                                    z6 = z && FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource5, composer2, (i27 >> 15) & 14).getValue().booleanValue();
                                    Boolean boolValueOf = Boolean.valueOf(z);
                                    composer2.startReplaceableGroup(851482799);
                                    zChanged4 = composer2.changed(z6) | composer2.changedInstance(focusManager);
                                    objRememberedValue7 = composer2.rememberedValue();
                                    if (!zChanged4 || objRememberedValue7 == companion.getEmpty()) {
                                        objRememberedValue7 = new SearchBar_androidKt$SearchBar$5$1(z6, focusManager, null);
                                        composer2.updateRememberedValue(objRememberedValue7);
                                    }
                                    composer2.endReplaceableGroup();
                                    int i29 = (i26 >> 9) & 14;
                                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer2, i29);
                                    composer2.startReplaceableGroup(851483127);
                                    z7 = (i26 & 57344) == 16384;
                                    objRememberedValue8 = composer2.rememberedValue();
                                    if (!z7 || objRememberedValue8 == companion.getEmpty()) {
                                        objRememberedValue8 = new Function0<Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$6$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                function13.invoke(Boolean.FALSE);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue8);
                                    }
                                    composer2.endReplaceableGroup();
                                    BackHandlerKt.BackHandler(z, (Function0) objRememberedValue8, composer2, i29, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    function29 = function28;
                                    searchBarColors3 = searchBarColors2;
                                    f5 = f3;
                                    function210 = function25;
                                    function211 = function26;
                                    windowInsets5 = windowInsets7;
                                    shape3 = shape5;
                                    modifier3 = modifier5;
                                    mutableInteractionSource3 = mutableInteractionSource5;
                                    z8 = z4;
                                }
                            } else {
                                windowInsets4 = windowInsets6;
                            }
                            if ((i20 & CpioConstants.C_ISBLK) == 16384) {
                                z5 = false;
                            }
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (z5) {
                                objRememberedValue5 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets72) {
                                        invoke2(windowInsets72);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull WindowInsets windowInsets72) {
                                        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets4, windowInsets72));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifierConsumeWindowInsets2 = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifierZIndex, (Function1) objRememberedValue5), mutableWindowInsets);
                                composerStartRestartGroup.startReplaceableGroup(851480395);
                                zChanged3 = composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged3) {
                                    objRememberedValue6 = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                            return m9699invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                        }

                                        @NotNull
                                        /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                        public final MeasureResult m9699invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
                                            final int iMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(DpKt.m13709lerpMdfbLM(state2.getValue().m13680unboximpl(), C2046Dp.m13666constructorimpl(0), stateAnimateFloatAsState.getValue().floatValue()));
                                            int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(Math.max(Constraints.m13624getMinWidthimpl(j), measureScope.mo7868roundToPx0680j_4(SearchBar_androidKt.getSearchBarMinWidth())), Math.min(Constraints.m13622getMaxWidthimpl(j), measureScope.mo7868roundToPx0680j_4(SearchBar_androidKt.SearchBarMaxWidth)));
                                            int iCoerceAtMost2 = RangesKt___RangesKt.coerceAtMost(Math.max(Constraints.m13623getMinHeightimpl(j), measureScope.mo7868roundToPx0680j_4(SearchBarDefaults.INSTANCE.m9692getInputFieldHeightD9Ej5fM())), Constraints.m13621getMaxHeightimpl(j));
                                            int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j);
                                            int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j);
                                            int iLerp = MathHelpersKt.lerp(iCoerceAtMost, iM13622getMaxWidthimpl, stateAnimateFloatAsState.getValue().floatValue());
                                            int iLerp2 = MathHelpersKt.lerp(iCoerceAtMost2, iM13621getMaxHeightimpl, stateAnimateFloatAsState.getValue().floatValue()) + iMo7868roundToPx0680j_4;
                                            final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(ConstraintsKt.m13639offsetNN6EwU$default(Constraints.INSTANCE.m13630fixedJhjzzOo(iLerp, iLerp2), 0, -iMo7868roundToPx0680j_4, 1, null));
                                            return MeasureScope.layout$default(measureScope, iLerp, iLerp2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$3$1.1
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
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, 0, iMo7868roundToPx0680j_4, 0.0f, 4, null);
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i272 = i20;
                                    WindowInsets windowInsets72 = windowInsets4;
                                    final boolean z92 = z4;
                                    final Function2<? super Composer, ? super Integer, Unit> function2132 = function25;
                                    Shape shape52 = shape2;
                                    final Function2<? super Composer, ? super Integer, Unit> function2142 = function26;
                                    Modifier modifier52 = modifier2;
                                    final Function2<? super Composer, ? super Integer, Unit> function2152 = function28;
                                    final SearchBarColors searchBarColors42 = searchBarColors2;
                                    composer2 = composerStartRestartGroup;
                                    int i282 = i272 << 6;
                                    SurfaceKt.m9876SurfaceT9BRK9s(LayoutModifierKt.layout(modifierConsumeWindowInsets2, (Function3) objRememberedValue6), shape4, containerColor, jM9292contentColorForek8zF_U, f3, f4, null, ComposableLambdaKt.composableLambda(composer2, 483163116, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
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
                                        public final void invoke(@Nullable Composer composer3, int i292) {
                                            final State<Float> state3;
                                            if ((i292 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(483163116, i292, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:253)");
                                                }
                                                String str2 = str;
                                                Function1<String, Unit> function14 = function1;
                                                Function1<String, Unit> function15 = function12;
                                                boolean z10 = z;
                                                Function1<Boolean, Unit> function16 = function13;
                                                boolean z11 = z92;
                                                Function2<Composer, Integer, Unit> function216 = function2132;
                                                Function2<Composer, Integer, Unit> function217 = function2142;
                                                Function2<Composer, Integer, Unit> function218 = function2152;
                                                SearchBarColors searchBarColors5 = searchBarColors42;
                                                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                                State<Float> state4 = stateAnimateFloatAsState;
                                                State<C2046Dp> state5 = state2;
                                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                                composer3.startReplaceableGroup(-483455358);
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                Arrangement.Vertical top = arrangement.getTop();
                                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                                                composer3.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
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
                                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(-685095283);
                                                Object objRememberedValue10 = composer3.rememberedValue();
                                                Composer.Companion companion5 = Composer.INSTANCE;
                                                if (objRememberedValue10 == companion5.getEmpty()) {
                                                    objRememberedValue10 = new AnimatedPaddingValues(state4, state5);
                                                    composer3.updateRememberedValue(objRememberedValue10);
                                                }
                                                composer3.endReplaceableGroup();
                                                SearchBar_androidKt.SearchBarInputField(str2, function14, function15, z10, function16, PaddingKt.padding(companion2, (AnimatedPaddingValues) objRememberedValue10), z11, function216, function217, function218, searchBarColors5.getInputFieldColors(), mutableInteractionSource6, composer3, ProfileVerifier.CompilationStatus.f342xf2722a21, 0, 0);
                                                composer3.startReplaceableGroup(-685094554);
                                                Object objRememberedValue11 = composer3.rememberedValue();
                                                if (objRememberedValue11 == companion5.getEmpty()) {
                                                    state3 = state4;
                                                    objRememberedValue11 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4$1$showResults$2$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        @NotNull
                                                        public final Boolean invoke() {
                                                            return Boolean.valueOf(state3.getValue().floatValue() > 0.0f);
                                                        }
                                                    });
                                                    composer3.updateRememberedValue(objRememberedValue11);
                                                } else {
                                                    state3 = state4;
                                                }
                                                composer3.endReplaceableGroup();
                                                composer3.startReplaceableGroup(551421253);
                                                if (invoke$lambda$5$lambda$2((State) objRememberedValue11)) {
                                                    composer3.startReplaceableGroup(-685094361);
                                                    boolean zChanged5 = composer3.changed(state3);
                                                    Object objRememberedValue12 = composer3.rememberedValue();
                                                    if (zChanged5 || objRememberedValue12 == companion5.getEmpty()) {
                                                        objRememberedValue12 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                invoke2(graphicsLayerScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                                                                graphicsLayerScope.setAlpha(state3.getValue().floatValue());
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue12);
                                                    }
                                                    composer3.endReplaceableGroup();
                                                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue12);
                                                    composer3.startReplaceableGroup(-483455358);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, 0);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierGraphicsLayer);
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
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    DividerKt.m9424HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors5.getDividerColor(), composer3, 0, 3);
                                                    function32.invoke(columnScopeInstance, composer3, 6);
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                }
                                                composer3.endReplaceableGroup();
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

                                        public static final boolean invoke$lambda$5$lambda$2(State<Boolean> state3) {
                                            return state3.getValue().booleanValue();
                                        }
                                    }), composer2, (57344 & i282) | 12582912 | (i282 & 458752), 64);
                                    if (z) {
                                        Boolean boolValueOf2 = Boolean.valueOf(z);
                                        composer2.startReplaceableGroup(851482799);
                                        zChanged4 = composer2.changed(z6) | composer2.changedInstance(focusManager);
                                        objRememberedValue7 = composer2.rememberedValue();
                                        if (!zChanged4) {
                                            objRememberedValue7 = new SearchBar_androidKt$SearchBar$5$1(z6, focusManager, null);
                                            composer2.updateRememberedValue(objRememberedValue7);
                                            composer2.endReplaceableGroup();
                                            int i292 = (i26 >> 9) & 14;
                                            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer2, i292);
                                            composer2.startReplaceableGroup(851483127);
                                            if ((i26 & 57344) == 16384) {
                                            }
                                            objRememberedValue8 = composer2.rememberedValue();
                                            if (!z7) {
                                                objRememberedValue8 = new Function0<Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$6$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
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
                                                        function13.invoke(Boolean.FALSE);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue8);
                                                composer2.endReplaceableGroup();
                                                BackHandlerKt.BackHandler(z, (Function0) objRememberedValue8, composer2, i292, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                function29 = function28;
                                                searchBarColors3 = searchBarColors2;
                                                f5 = f3;
                                                function210 = function25;
                                                function211 = function26;
                                                windowInsets5 = windowInsets72;
                                                shape3 = shape52;
                                                modifier3 = modifier52;
                                                mutableInteractionSource3 = mutableInteractionSource5;
                                                z8 = z4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final float f6 = f4;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$7
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

                                public final void invoke(@Nullable Composer composer3, int i30) {
                                    SearchBar_androidKt.m9698SearchBarWuY5d9Q(str, function1, function12, z, function13, modifier3, z8, function210, function211, function29, shape3, searchBarColors3, f5, f6, windowInsets5, mutableInteractionSource3, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i23 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    i14 = i12;
                    if ((i3 & 65536) != 0) {
                    }
                    int i242 = i4;
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if ((i3 & 1024) == 0) {
                            }
                            int i252 = i23;
                            if ((i3 & 2048) == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if ((i3 & 16384) == 0) {
                            }
                            if (i13 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, !z ? AnimationEnterFloatSpec : AnimationExitFloatSpec, 0.0f, null, null, composerStartRestartGroup, 0, 28);
                            FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            SearchBarDefaults searchBarDefaults2 = SearchBarDefaults.INSTANCE;
                            int i262 = i21;
                            inputFieldShape2 = searchBarDefaults2.getInputFieldShape(composerStartRestartGroup, i18);
                            fullScreenShape = searchBarDefaults2.getFullScreenShape(composerStartRestartGroup, i18);
                            composerStartRestartGroup.startReplaceableGroup(851478497);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            state = (State) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            boolean zSearchBar_WuY5d9Q$lambda$22 = SearchBar_WuY5d9Q$lambda$2(state);
                            final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource2;
                            composerStartRestartGroup.startReplaceableGroup(851478623);
                            if (((i20 & 14) ^ 6) <= 4) {
                                zChanged = composerStartRestartGroup.changed(zSearchBar_WuY5d9Q$lambda$22) | ((((i20 & 14) ^ 6) <= 4 && composerStartRestartGroup.changed(shape2)) || (i20 & 6) == 4);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    if (!Intrinsics.areEqual(shape2, inputFieldShape2)) {
                                    }
                                    composerStartRestartGroup.updateRememberedValue(genericShape);
                                    objRememberedValue2 = genericShape;
                                    Shape shape42 = (Shape) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(851479649);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue3 != companion.getEmpty()) {
                                    }
                                    mutableWindowInsets = (MutableWindowInsets) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(851479705);
                                    zChanged2 = composerStartRestartGroup.changed(density);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged2) {
                                        objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<C2046Dp>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$topPadding$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ C2046Dp invoke() {
                                                return C2046Dp.m13664boximpl(m9701invokeD9Ej5fM());
                                            }

                                            /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
                                            public final float m9701invokeD9Ej5fM() {
                                                return C2046Dp.m13666constructorimpl(SearchBar_androidKt.getSearchBarVerticalPadding() + WindowInsetsKt.asPaddingValues(mutableWindowInsets, density).getTop());
                                            }
                                        });
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        final State<C2046Dp> state22 = (State) objRememberedValue4;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        long containerColor2 = searchBarColors2.getContainerColor();
                                        WindowInsets windowInsets62 = windowInsets3;
                                        long jM9292contentColorForek8zF_U2 = ColorSchemeKt.m9292contentColorForek8zF_U(searchBarColors2.getContainerColor(), composerStartRestartGroup, 0);
                                        Modifier modifierZIndex2 = ZIndexModifierKt.zIndex(modifier2, 1.0f);
                                        composerStartRestartGroup.startReplaceableGroup(851480211);
                                        if (((57344 & i20) ^ CpioConstants.C_ISBLK) <= 16384) {
                                        }
                                        if ((i20 & CpioConstants.C_ISBLK) == 16384) {
                                        }
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (z5) {
                                        }
                                    }
                                }
                            } else {
                                zChanged = composerStartRestartGroup.changed(zSearchBar_WuY5d9Q$lambda$22) | ((((i20 & 14) ^ 6) <= 4 && composerStartRestartGroup.changed(shape2)) || (i20 & 6) == 4);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                }
                i13 = i3 & 32768;
                if (i13 != 0) {
                }
                i14 = i12;
                if ((i3 & 65536) != 0) {
                }
                int i2422 = i4;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i12 = i3 & 8192;
            if (i12 != 0) {
            }
            if ((i2 & CpioConstants.C_ISBLK) == 0) {
            }
            i13 = i3 & 32768;
            if (i13 != 0) {
            }
            i14 = i12;
            if ((i3 & 65536) != 0) {
            }
            int i24222 = i4;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        int i222 = 8192;
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i232 = i10;
        i11 = i3 & 4096;
        if (i11 == 0) {
        }
        i12 = i3 & 8192;
        if (i12 != 0) {
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
        }
        i13 = i3 & 32768;
        if (i13 != 0) {
        }
        i14 = i12;
        if ((i3 & 65536) != 0) {
        }
        int i242222 = i4;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DockedSearchBar-eWTbjVg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9697DockedSearchBareWTbjVg(@NotNull final String str, @NotNull final Function1<? super String, Unit> function1, @NotNull final Function1<? super String, Unit> function12, final boolean z, @NotNull final Function1<? super Boolean, Unit> function13, @Nullable Modifier modifier, boolean z2, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Shape shape, @Nullable SearchBarColors searchBarColors, float f, float f2, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Shape dockedShape;
        int i15;
        boolean z3;
        int i16;
        int i17;
        SearchBarColors searchBarColorsM9690colorsKlgxPg;
        int i18;
        MutableInteractionSource mutableInteractionSource2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        SearchBarColors searchBarColors2;
        float f3;
        int i19;
        float f4;
        Modifier modifier2;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Shape shape2;
        int i20;
        FocusManager focusManager;
        Modifier modifier3;
        Composer composer2;
        boolean z5;
        boolean zChanged;
        Object objRememberedValue;
        boolean z6;
        Object objRememberedValue2;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Shape shape3;
        final SearchBarColors searchBarColors3;
        final float f5;
        final float f6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1299054533);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else if ((i & CpioConstants.C_ISBLK) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                function24 = function2;
            } else {
                function24 = function2;
                if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function22) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
            }
            i9 = i3 & 512;
            if (i9 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
            }
            if ((i2 & 6) != 0) {
                i10 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(shape)) ? 4 : 2);
            } else {
                i10 = i2;
            }
            if ((i2 & 48) == 0) {
                i10 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(searchBarColors)) ? 32 : 16;
            }
            int i21 = i10;
            i11 = i3 & 4096;
            if (i11 == 0) {
                i21 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i21 |= composerStartRestartGroup.changed(f) ? 256 : 128;
                }
                i12 = i3 & 8192;
                if (i12 != 0) {
                    i21 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i21 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
                    }
                    i13 = i3 & 16384;
                    if (i13 == 0) {
                        i21 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((i2 & CpioConstants.C_ISBLK) == 0) {
                            i21 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                        }
                        if ((i3 & 32768) == 0) {
                            if ((i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                                i14 = i13;
                                i21 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                            }
                            int i22 = i4;
                            if ((i4 & 306783379) != 306783378 && (74899 & i21) == 74898 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z7 = z2;
                                function29 = function22;
                                shape3 = shape;
                                searchBarColors3 = searchBarColors;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function28 = function24;
                                composer2 = composerStartRestartGroup;
                                function210 = function23;
                                f5 = f;
                                f6 = f2;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier;
                                    boolean z8 = i6 == 0 ? true : z2;
                                    Function2<? super Composer, ? super Integer, Unit> function211 = i7 == 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function212 = i8 == 0 ? null : function22;
                                    Function2<? super Composer, ? super Integer, Unit> function213 = i9 == 0 ? null : function23;
                                    if ((i3 & 1024) == 0) {
                                        i21 &= -15;
                                        dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                                    } else {
                                        dockedShape = shape;
                                    }
                                    int i23 = i21;
                                    if ((i3 & 2048) == 0) {
                                        i15 = i22;
                                        z3 = true;
                                        i16 = i14;
                                        i17 = i12;
                                        searchBarColorsM9690colorsKlgxPg = SearchBarDefaults.INSTANCE.m9690colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                                        i18 = i23 & (-113);
                                    } else {
                                        i15 = i22;
                                        z3 = true;
                                        i16 = i14;
                                        i17 = i12;
                                        searchBarColorsM9690colorsKlgxPg = searchBarColors;
                                        i18 = i23;
                                    }
                                    float fM9694getTonalElevationD9Ej5fM = i11 == 0 ? SearchBarDefaults.INSTANCE.m9694getTonalElevationD9Ej5fM() : f;
                                    float fM9693getShadowElevationD9Ej5fM = i17 == 0 ? SearchBarDefaults.INSTANCE.m9693getShadowElevationD9Ej5fM() : f2;
                                    if (i16 == 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-32072212);
                                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        function25 = function213;
                                        searchBarColors2 = searchBarColorsM9690colorsKlgxPg;
                                        f3 = fM9694getTonalElevationD9Ej5fM;
                                        i19 = i18;
                                        f4 = fM9693getShadowElevationD9Ej5fM;
                                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue3;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        function25 = function213;
                                        searchBarColors2 = searchBarColorsM9690colorsKlgxPg;
                                        f3 = fM9694getTonalElevationD9Ej5fM;
                                        i19 = i18;
                                        f4 = fM9693getShadowElevationD9Ej5fM;
                                    }
                                    modifier2 = modifier4;
                                    z4 = z8;
                                    function26 = function211;
                                    function27 = function212;
                                    shape2 = dockedShape;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 1024) != 0) {
                                        i21 &= -15;
                                    }
                                    if ((i3 & 2048) != 0) {
                                        i21 &= -113;
                                    }
                                    z4 = z2;
                                    function27 = function22;
                                    function25 = function23;
                                    shape2 = shape;
                                    searchBarColors2 = searchBarColors;
                                    f3 = f;
                                    f4 = f2;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i15 = i22;
                                    i19 = i21;
                                    function26 = function24;
                                    z3 = true;
                                    modifier2 = modifier;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    i20 = i15;
                                } else {
                                    i20 = i15;
                                    ComposerKt.traceEventStart(1299054533, i20, i19, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:364)");
                                }
                                focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                                long containerColor = searchBarColors2.getContainerColor();
                                long jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(searchBarColors2.getContainerColor(), composerStartRestartGroup, 0);
                                Modifier modifierM8177width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m8177width3ABfNKs(ZIndexModifierKt.zIndex(modifier2, 1.0f), SearchBarMinWidth);
                                int i24 = i20;
                                final boolean z9 = z4;
                                int i25 = i19;
                                final Function2<? super Composer, ? super Integer, Unit> function214 = function26;
                                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                final Function2<? super Composer, ? super Integer, Unit> function215 = function27;
                                modifier3 = modifier2;
                                final Function2<? super Composer, ? super Integer, Unit> function216 = function25;
                                final SearchBarColors searchBarColors4 = searchBarColors2;
                                int i26 = i25 << 6;
                                SurfaceKt.m9876SurfaceT9BRK9s(modifierM8177width3ABfNKs, shape2, containerColor, jM9292contentColorForek8zF_U, f3, f4, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1088676554, z3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$2
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
                                    public final void invoke(@Nullable Composer composer3, int i27) {
                                        if ((i27 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1088676554, i27, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:377)");
                                            }
                                            String str2 = str;
                                            Function1<String, Unit> function14 = function1;
                                            Function1<String, Unit> function15 = function12;
                                            boolean z10 = z;
                                            Function1<Boolean, Unit> function16 = function13;
                                            boolean z11 = z9;
                                            Function2<Composer, Integer, Unit> function217 = function214;
                                            Function2<Composer, Integer, Unit> function218 = function215;
                                            Function2<Composer, Integer, Unit> function219 = function216;
                                            final SearchBarColors searchBarColors5 = searchBarColors4;
                                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                            final Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                            composer3.startReplaceableGroup(-483455358);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            SearchBar_androidKt.SearchBarInputField(str2, function14, function15, z10, function16, null, z11, function217, function218, function219, searchBarColors5.getInputFieldColors(), mutableInteractionSource5, composer3, 0, 0, 32);
                                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z10, (Modifier) null, SearchBar_androidKt.DockedEnterTransition, SearchBar_androidKt.DockedExitTransition, (String) null, ComposableLambdaKt.composableLambda(composer3, 1804538904, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                                    invoke(animatedVisibilityScope, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer4, int i28) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1804538904, i28, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:397)");
                                                    }
                                                    float fM13666constructorimpl = C2046Dp.m13666constructorimpl(((Configuration) composer4.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
                                                    composer4.startReplaceableGroup(747855826);
                                                    boolean zChanged2 = composer4.changed(fM13666constructorimpl);
                                                    Object objRememberedValue4 = composer4.rememberedValue();
                                                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue4 = C2046Dp.m13664boximpl(C2046Dp.m13666constructorimpl(fM13666constructorimpl * 0.6666667f));
                                                        composer4.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    float fM13680unboximpl = ((C2046Dp) objRememberedValue4).m13680unboximpl();
                                                    composer4.endReplaceableGroup();
                                                    composer4.startReplaceableGroup(747855974);
                                                    boolean zChanged3 = composer4.changed(fM13680unboximpl);
                                                    Object objRememberedValue5 = composer4.rememberedValue();
                                                    if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue5 = C2046Dp.m13664boximpl(((C2046Dp) RangesKt___RangesKt.coerceAtMost(C2046Dp.m13664boximpl(SearchBar_androidKt.getDockedActiveTableMinHeight()), C2046Dp.m13664boximpl(fM13680unboximpl))).m13680unboximpl());
                                                        composer4.updateRememberedValue(objRememberedValue5);
                                                    }
                                                    float fM13680unboximpl2 = ((C2046Dp) objRememberedValue5).m13680unboximpl();
                                                    composer4.endReplaceableGroup();
                                                    Modifier modifierM8159heightInVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m8159heightInVpY3zN4(Modifier.INSTANCE, fM13680unboximpl2, fM13680unboximpl);
                                                    SearchBarColors searchBarColors6 = searchBarColors5;
                                                    Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                                                    composer4.startReplaceableGroup(-483455358);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                    composer4.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8159heightInVpY3zN4);
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor2);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer4);
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                    DividerKt.m9424HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors6.getDividerColor(), composer4, 0, 3);
                                                    function33.invoke(columnScopeInstance2, composer4, 6);
                                                    composer4.endReplaceableGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), composer3, 1600518, 18);
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
                                }), composerStartRestartGroup, ((i25 << 3) & 112) | 12582912 | (57344 & i26) | (i26 & 458752), 64);
                                composer2 = composerStartRestartGroup;
                                z5 = (z && FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composerStartRestartGroup, (i25 >> 12) & 14).getValue().booleanValue()) ? z3 : false;
                                Boolean boolValueOf = Boolean.valueOf(z);
                                composer2.startReplaceableGroup(-32070300);
                                zChanged = composer2.changed(z5) | composer2.changedInstance(focusManager);
                                objRememberedValue = composer2.rememberedValue();
                                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new SearchBar_androidKt$DockedSearchBar$3$1(z5, focusManager, null);
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                int i27 = (i24 >> 9) & 14;
                                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, i27);
                                composer2.startReplaceableGroup(-32069972);
                                z6 = (i24 & 57344) != 16384 ? z3 : false;
                                objRememberedValue2 = composer2.rememberedValue();
                                if (!z6 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            function13.invoke(Boolean.FALSE);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                BackHandlerKt.BackHandler(z, (Function0) objRememberedValue2, composer2, i27, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource3 = mutableInteractionSource4;
                                z7 = z4;
                                function28 = function26;
                                function29 = function27;
                                function210 = function25;
                                shape3 = shape2;
                                searchBarColors3 = searchBarColors2;
                                f5 = f3;
                                f6 = f4;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Modifier modifier5 = modifier3;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$5
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

                                    public final void invoke(@Nullable Composer composer3, int i28) {
                                        SearchBar_androidKt.m9697DockedSearchBareWTbjVg(str, function1, function12, z, function13, modifier5, z7, function28, function29, function210, shape3, searchBarColors3, f5, f6, mutableInteractionSource3, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i21 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        i14 = i13;
                        int i222 = i4;
                        if ((i4 & 306783379) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if ((i3 & 1024) == 0) {
                                }
                                int i232 = i21;
                                if ((i3 & 2048) == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                modifier2 = modifier4;
                                z4 = z8;
                                function26 = function211;
                                function27 = function212;
                                shape2 = dockedShape;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                                long containerColor2 = searchBarColors2.getContainerColor();
                                long jM9292contentColorForek8zF_U2 = ColorSchemeKt.m9292contentColorForek8zF_U(searchBarColors2.getContainerColor(), composerStartRestartGroup, 0);
                                Modifier modifierM8177width3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m8177width3ABfNKs(ZIndexModifierKt.zIndex(modifier2, 1.0f), SearchBarMinWidth);
                                int i242 = i20;
                                final boolean z92 = z4;
                                int i252 = i19;
                                final Function2<? super Composer, ? super Integer, Unit> function2142 = function26;
                                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                                final Function2<? super Composer, ? super Integer, Unit> function2152 = function27;
                                modifier3 = modifier2;
                                final Function2<? super Composer, ? super Integer, Unit> function2162 = function25;
                                final SearchBarColors searchBarColors42 = searchBarColors2;
                                int i262 = i252 << 6;
                                SurfaceKt.m9876SurfaceT9BRK9s(modifierM8177width3ABfNKs2, shape2, containerColor2, jM9292contentColorForek8zF_U2, f3, f4, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1088676554, z3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$2
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
                                    public final void invoke(@Nullable Composer composer3, int i272) {
                                        if ((i272 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1088676554, i272, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:377)");
                                            }
                                            String str2 = str;
                                            Function1<String, Unit> function14 = function1;
                                            Function1<String, Unit> function15 = function12;
                                            boolean z10 = z;
                                            Function1<Boolean, Unit> function16 = function13;
                                            boolean z11 = z92;
                                            Function2<Composer, Integer, Unit> function217 = function2142;
                                            Function2<Composer, Integer, Unit> function218 = function2152;
                                            Function2<Composer, Integer, Unit> function219 = function2162;
                                            final SearchBarColors searchBarColors5 = searchBarColors42;
                                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource42;
                                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                            composer3.startReplaceableGroup(-483455358);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            SearchBar_androidKt.SearchBarInputField(str2, function14, function15, z10, function16, null, z11, function217, function218, function219, searchBarColors5.getInputFieldColors(), mutableInteractionSource5, composer3, 0, 0, 32);
                                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z10, (Modifier) null, SearchBar_androidKt.DockedEnterTransition, SearchBar_androidKt.DockedExitTransition, (String) null, ComposableLambdaKt.composableLambda(composer3, 1804538904, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                                    invoke(animatedVisibilityScope, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer4, int i28) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1804538904, i28, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:397)");
                                                    }
                                                    float fM13666constructorimpl = C2046Dp.m13666constructorimpl(((Configuration) composer4.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
                                                    composer4.startReplaceableGroup(747855826);
                                                    boolean zChanged2 = composer4.changed(fM13666constructorimpl);
                                                    Object objRememberedValue4 = composer4.rememberedValue();
                                                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue4 = C2046Dp.m13664boximpl(C2046Dp.m13666constructorimpl(fM13666constructorimpl * 0.6666667f));
                                                        composer4.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    float fM13680unboximpl = ((C2046Dp) objRememberedValue4).m13680unboximpl();
                                                    composer4.endReplaceableGroup();
                                                    composer4.startReplaceableGroup(747855974);
                                                    boolean zChanged3 = composer4.changed(fM13680unboximpl);
                                                    Object objRememberedValue5 = composer4.rememberedValue();
                                                    if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue5 = C2046Dp.m13664boximpl(((C2046Dp) RangesKt___RangesKt.coerceAtMost(C2046Dp.m13664boximpl(SearchBar_androidKt.getDockedActiveTableMinHeight()), C2046Dp.m13664boximpl(fM13680unboximpl))).m13680unboximpl());
                                                        composer4.updateRememberedValue(objRememberedValue5);
                                                    }
                                                    float fM13680unboximpl2 = ((C2046Dp) objRememberedValue5).m13680unboximpl();
                                                    composer4.endReplaceableGroup();
                                                    Modifier modifierM8159heightInVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m8159heightInVpY3zN4(Modifier.INSTANCE, fM13680unboximpl2, fM13680unboximpl);
                                                    SearchBarColors searchBarColors6 = searchBarColors5;
                                                    Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                                                    composer4.startReplaceableGroup(-483455358);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                    composer4.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8159heightInVpY3zN4);
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor2);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer4);
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                    DividerKt.m9424HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors6.getDividerColor(), composer4, 0, 3);
                                                    function33.invoke(columnScopeInstance2, composer4, 6);
                                                    composer4.endReplaceableGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), composer3, 1600518, 18);
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
                                }), composerStartRestartGroup, ((i252 << 3) & 112) | 12582912 | (57344 & i262) | (i262 & 458752), 64);
                                composer2 = composerStartRestartGroup;
                                if (z) {
                                    Boolean boolValueOf2 = Boolean.valueOf(z);
                                    composer2.startReplaceableGroup(-32070300);
                                    zChanged = composer2.changed(z5) | composer2.changedInstance(focusManager);
                                    objRememberedValue = composer2.rememberedValue();
                                    if (!zChanged) {
                                        objRememberedValue = new SearchBar_androidKt$DockedSearchBar$3$1(z5, focusManager, null);
                                        composer2.updateRememberedValue(objRememberedValue);
                                        composer2.endReplaceableGroup();
                                        int i272 = (i242 >> 9) & 14;
                                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, i272);
                                        composer2.startReplaceableGroup(-32069972);
                                        if ((i242 & 57344) != 16384) {
                                        }
                                        objRememberedValue2 = composer2.rememberedValue();
                                        if (!z6) {
                                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
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
                                                    function13.invoke(Boolean.FALSE);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                            composer2.endReplaceableGroup();
                                            BackHandlerKt.BackHandler(z, (Function0) objRememberedValue2, composer2, i272, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            mutableInteractionSource3 = mutableInteractionSource42;
                                            z7 = z4;
                                            function28 = function26;
                                            function29 = function27;
                                            function210 = function25;
                                            shape3 = shape2;
                                            searchBarColors3 = searchBarColors2;
                                            f5 = f3;
                                            f6 = f4;
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i3 & 32768) == 0) {
                    }
                    i14 = i13;
                    int i2222 = i4;
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i13 = i3 & 16384;
                if (i13 == 0) {
                }
                if ((i3 & 32768) == 0) {
                }
                i14 = i13;
                int i22222 = i4;
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i12 = i3 & 8192;
            if (i12 != 0) {
            }
            i13 = i3 & 16384;
            if (i13 == 0) {
            }
            if ((i3 & 32768) == 0) {
            }
            i14 = i13;
            int i222222 = i4;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i212 = i10;
        i11 = i3 & 4096;
        if (i11 == 0) {
        }
        i12 = i3 & 8192;
        if (i12 != 0) {
        }
        i13 = i3 & 16384;
        if (i13 == 0) {
        }
        if ((i3 & 32768) == 0) {
        }
        i14 = i13;
        int i2222222 = i4;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SearchBarInputField(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final boolean z, final Function1<? super Boolean, Unit> function13, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        TextFieldColors textFieldColorsM9696inputFieldColorsITpI4ow;
        MutableInteractionSource mutableInteractionSource2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function26;
        boolean z4;
        TextFieldColors textFieldColors2;
        Composer composer2;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final MutableInteractionSource mutableInteractionSource3;
        final TextFieldColors textFieldColors3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(496394889);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= CpioConstants.C_ISBLK;
        } else if ((i & CpioConstants.C_ISBLK) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
        } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        int i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
            }
        }
        int i8 = i3 & 128;
        if (i8 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        int i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        int i10 = i3 & 512;
        if (i10 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i11 = i3 & 2048;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
        }
        int i12 = i5;
        if ((i4 & 306783379) == 306783378 && (i12 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
            function27 = function2;
            function28 = function22;
            function29 = function23;
            textFieldColors3 = textFieldColors;
            mutableInteractionSource3 = mutableInteractionSource;
            composer2 = composerStartRestartGroup;
            z5 = z3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier;
                boolean z6 = i7 != 0 ? true : z3;
                Function2<? super Composer, ? super Integer, Unit> function210 = i8 != 0 ? null : function2;
                Function2<? super Composer, ? super Integer, Unit> function211 = i9 != 0 ? null : function22;
                Function2<? super Composer, ? super Integer, Unit> function212 = i10 != 0 ? null : function23;
                if ((i3 & 1024) != 0) {
                    textFieldColorsM9696inputFieldColorsITpI4ow = SearchBarDefaults.INSTANCE.m9696inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, CpioConstants.C_ISBLK, 16383);
                    i12 &= -15;
                } else {
                    textFieldColorsM9696inputFieldColorsITpI4ow = textFieldColors;
                }
                if (i11 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(462567468);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function24 = function212;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    function24 = function212;
                }
                function25 = function210;
                modifier2 = modifier4;
                function26 = function211;
                z4 = z6;
                textFieldColors2 = textFieldColorsM9696inputFieldColorsITpI4ow;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 1024) != 0) {
                    i12 &= -15;
                }
                modifier2 = modifier;
                function25 = function2;
                function26 = function22;
                function24 = function23;
                textFieldColors2 = textFieldColors;
                mutableInteractionSource2 = mutableInteractionSource;
                z4 = z3;
            }
            int i13 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(496394889, i4, i13, "androidx.compose.material3.SearchBarInputField (SearchBar.android.kt:444)");
            }
            composerStartRestartGroup.startReplaceableGroup(462567538);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            Strings.Companion companion2 = Strings.INSTANCE;
            final String strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_search_bar_search), composerStartRestartGroup, 0);
            final String strM9866getStringNWtq282 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_suggestions_available), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(462567758);
            long jM13195getColor0d7_KjU = ((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle())).m13195getColor0d7_KjU();
            if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                jM13195getColor0d7_KjU = textFieldColors2.textColor$material3_release(z4, false, mutableInteractionSource2, composerStartRestartGroup, ((i13 << 3) & 896) | ((i4 >> 18) & 14) | 48 | ((i13 << 9) & 7168)).getValue().m11350unboximpl();
            }
            long j = jM13195getColor0d7_KjU;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier5 = modifier2;
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.SizeKt.m8158height3ABfNKs(modifier2, SearchBarDefaults.INSTANCE.m9692getInputFieldHeightD9Ej5fM()), 0.0f, 1, null), focusRequester);
            composerStartRestartGroup.startReplaceableGroup(462568122);
            boolean z7 = (57344 & i4) == 16384;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<FocusState, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarInputField$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                        invoke2(focusState);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull FocusState focusState) {
                        if (focusState.isFocused()) {
                            function13.invoke(Boolean.TRUE);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue3);
            composerStartRestartGroup.startReplaceableGroup(462568188);
            boolean zChanged = composerStartRestartGroup.changed(strM9866getStringNWtq28) | ((i4 & 7168) == 2048) | composerStartRestartGroup.changed(strM9866getStringNWtq282);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarInputField$3$1
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
                        if (z) {
                            SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, strM9866getStringNWtq282);
                        }
                        final FocusRequester focusRequester2 = focusRequester;
                        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarInputField$3$1.1
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Boolean invoke() {
                                focusRequester2.requestFocus();
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierOnFocusChanged, false, (Function1) objRememberedValue4, 1, null);
            TextStyle textStyleMerge = ((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle())).merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            SolidColor solidColor = new SolidColor(textFieldColors2.cursorColor$material3_release(false, composerStartRestartGroup, ((i13 << 3) & 112) | 6).getValue().m11350unboximpl(), null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m13347getSearcheUduSuo(), null, 23, null);
            composerStartRestartGroup.startReplaceableGroup(462568831);
            int i14 = i4 & 14;
            boolean z8 = ((i4 & 896) == 256) | (i14 == 4);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarInputField$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                        invoke2(keyboardActionScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyboardActionScope keyboardActionScope) {
                        function12.invoke(str);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final boolean z9 = z4;
            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
            final Function2<? super Composer, ? super Integer, Unit> function213 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function214 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function215 = function24;
            final TextFieldColors textFieldColors4 = textFieldColors2;
            TextFieldColors textFieldColors5 = textFieldColors2;
            composer2 = composerStartRestartGroup;
            BasicTextFieldKt.BasicTextField(str, function1, modifierSemantics$default, z4, false, textStyleMerge, keyboardOptions, new KeyboardActions(null, null, null, null, (Function1) objRememberedValue5, null, 47, null), true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -951844929, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt.SearchBarInputField.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function216, Composer composer3, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function216, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function216, @Nullable Composer composer3, int i15) {
                    int i16;
                    if ((i15 & 6) == 0) {
                        i16 = i15 | (composer3.changedInstance(function216) ? 4 : 2);
                    } else {
                        i16 = i15;
                    }
                    if ((i16 & 19) != 18 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-951844929, i16, -1, "androidx.compose.material3.SearchBarInputField.<anonymous> (SearchBar.android.kt:478)");
                        }
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                        String str2 = str;
                        boolean z10 = z9;
                        VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                        Function2<Composer, Integer, Unit> function217 = function213;
                        final Function2<Composer, Integer, Unit> function218 = function214;
                        ComposableLambda composableLambda = function218 != null ? ComposableLambdaKt.composableLambda(composer3, -1030845367, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarInputField$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i17) {
                                if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1030845367, i17, -1, "androidx.compose.material3.SearchBarInputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:487)");
                                }
                                Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(Modifier.INSTANCE, SearchBar_androidKt.SearchBarIconOffsetX, 0.0f, 2, null);
                                Function2<Composer, Integer, Unit> function219 = function218;
                                composer4.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function219.invoke(composer4, 0);
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }) : null;
                        final Function2<Composer, Integer, Unit> function219 = function215;
                        textFieldDefaults.DecorationBox(str2, function216, z10, true, none, mutableInteractionSource5, false, null, function217, composableLambda, function219 != null ? ComposableLambdaKt.composableLambda(composer3, -1558904811, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarInputField$5$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i17) {
                                if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1558904811, i17, -1, "androidx.compose.material3.SearchBarInputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:490)");
                                }
                                Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(-SearchBar_androidKt.SearchBarIconOffsetX), 0.0f, 2, null);
                                Function2<Composer, Integer, Unit> function220 = function219;
                                composer4.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function220.invoke(composer4, 0);
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }) : null, null, null, null, SearchBarDefaults.INSTANCE.getInputFieldShape(composer3, 6), textFieldColors4, TextFieldDefaults.m9985contentPaddingWithoutLabela9UjIt4$default(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableSingletons$SearchBar_androidKt.INSTANCE.m9331getLambda1$material3_release(), composer3, ((i16 << 3) & 112) | 27648, 113246208, 14528);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 102236160 | i14 | (i4 & 112) | ((i4 >> 9) & 7168), ((i13 << 6) & 7168) | ProfileVerifier.CompilationStatus.f342xf2722a21, 7696);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z4;
            function27 = function25;
            function28 = function26;
            function29 = function24;
            mutableInteractionSource3 = mutableInteractionSource2;
            textFieldColors3 = textFieldColors5;
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt.SearchBarInputField.6
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

                public final void invoke(@Nullable Composer composer3, int i15) {
                    SearchBar_androidKt.SearchBarInputField(str, function1, function12, z, function13, modifier3, z5, function27, function28, function29, textFieldColors3, mutableInteractionSource3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    static {
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tweenSpecTween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tweenSpecTween;
        TweenSpec tweenSpecTween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tweenSpecTween2;
        TweenSpec tweenSpecTween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tweenSpecTween3;
        TweenSpec tweenSpecTween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tweenSpecTween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tweenSpecTween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tweenSpecTween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tweenSpecTween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tweenSpecTween4, null, false, null, 14, null));
    }

    public static final float getDockedActiveTableMinHeight() {
        return DockedActiveTableMinHeight;
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }

    private static final boolean SearchBar_WuY5d9Q$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
