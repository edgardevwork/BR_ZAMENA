package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.C1841R;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerEventKt;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
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
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.DpKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.p007ts.TsExtractor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Slider.kt */
@Metadata(m7104d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0098\u0001\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\u0019\b\u0002\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#2\u0019\b\u0002\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#H\u0007¢\u0006\u0002\u0010&\u001aä\u0001\u0010\u0015\u001a\u00020\u00162\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0018\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0004\u0012\u00020\u00160\"2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010-2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\u0019\b\u0002\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#2\u0019\b\u0002\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#2\b\b\u0003\u0010.\u001a\u00020/H\u0007¢\u0006\u0002\u00100\u001a\u007f\u0010\u0015\u001a\u00020\u00162\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0018\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0004\u0012\u00020\u00160\"2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0003\u0010.\u001a\u00020/2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010-2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u00101\u001a\u0080\u0001\u00102\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#H\u0003¢\u0006\u0002\u00103\u001as\u00104\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u0002052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u00106\u001a\u00020\u001f2\u0019\b\u0002\u00107\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#H\u0007¢\u0006\u0002\u00108\u001a³\u0001\u00104\u001a\u00020\u00162\u0006\u0010'\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00160\"2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010-2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u00106\u001a\u00020\u001f2\b\b\u0003\u0010.\u001a\u00020/2\u0019\b\u0002\u00107\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(H\u0007¢\u0006\u0002\u00109\u001a}\u00104\u001a\u00020\u00162\u0006\u0010'\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00160\"2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0003\u0010.\u001a\u00020/2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010-2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u00106\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010:\u001a_\u0010;\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u0002052\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u001f2\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00160\"¢\u0006\u0002\b#H\u0003¢\u0006\u0002\u0010<\u001a\u001d\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020)H\u0001¢\u0006\u0002\u0010@\u001a\u001b\u0010=\u001a\u00020\u00102\f\u0010A\u001a\b\u0012\u0004\u0012\u00020)0(H\u0001¢\u0006\u0002\u0010B\u001a \u0010C\u001a\u00020)2\u0006\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020)2\u0006\u0010F\u001a\u00020)H\u0002\u001a:\u0010G\u001a\u00020\u00102\u0006\u0010H\u001a\u00020)2\u0006\u0010I\u001a\u00020)2\u0006\u0010J\u001a\u00020\u00102\u0006\u0010K\u001a\u00020)2\u0006\u0010L\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a0\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020)2\u0006\u0010I\u001a\u00020)2\u0006\u0010O\u001a\u00020)2\u0006\u0010K\u001a\u00020)2\u0006\u0010L\u001a\u00020)H\u0002\u001a(\u0010P\u001a\u00020)2\u0006\u0010Q\u001a\u00020)2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020)2\u0006\u0010U\u001a\u00020)H\u0002\u001a\u0010\u0010V\u001a\u00020S2\u0006\u0010.\u001a\u00020/H\u0002\u001a5\u0010W\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020)\u0018\u00010X*\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^H\u0082@ø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a\u001c\u0010a\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000fH\u0002\u001a,\u0010b\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0003\u001a\u001c\u0010c\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000fH\u0002\u001a\u001c\u0010d\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0017\u001a\u0002052\u0006\u0010\u001b\u001a\u00020\u000fH\u0002\u001a$\u0010e\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0017\u001a\u0002052\u0006\u00106\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0003\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0016\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\t\u0010\n\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\f\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\r\u0010\n\"\u001e\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006f"}, m7105d2 = {"ThumbDefaultElevation", "Landroidx/compose/ui/unit/Dp;", "F", "ThumbHeight", "ThumbPressedElevation", "ThumbSize", "Landroidx/compose/ui/unit/DpSize;", "J", "ThumbWidth", "getThumbWidth", "()F", "TickSize", "TrackHeight", "getTrackHeight", "isSpecified", "", "Landroidx/compose/material3/SliderRange;", "isSpecified-If1S1O4$annotations", "(J)V", "isSpecified-If1S1O4", "(J)Z", "RangeSlider", "", "state", "Landroidx/compose/material3/RangeSliderState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/SliderColors;", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumb", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "endThumb", "track", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "value", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "onValueChange", "valueRange", "onValueChangeFinished", "Lkotlin/Function0;", "steps", "", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;III)V", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RangeSliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Slider", "Landroidx/compose/material3/SliderState;", "interactionSource", "thumb", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/Composer;III)V", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "SliderRange", TtmlNode.START, "endInclusive", "(FF)J", P2MetadataParser.RequiredHandler.RANGE, "(Lkotlin/ranges/ClosedFloatingPointRange;)J", "calcFraction", "a", "b", "pos", "scale", "a1", "b1", "x", "a2", "b2", "scale-ziovWd0", "(FFJFF)J", "x1", "snapValueToTick", "current", "tickFractions", "", "minPx", "maxPx", "stepsToTickFractions", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderEndThumbSemantics", "rangeSliderPressDragModifier", "rangeSliderStartThumbSemantics", "sliderSemantics", "sliderTapModifier", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 10 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2151:1\n1116#2,6:2152\n1116#2,6:2158\n1116#2,6:2164\n1116#2,6:2170\n1116#2,6:2177\n1116#2,6:2183\n1116#2,6:2189\n1116#2,6:2195\n1116#2,6:2201\n1116#2,6:2207\n1116#2,6:2213\n1116#2,6:2219\n1116#2,6:2226\n1116#2,6:2232\n1116#2,6:2353\n1116#2,6:2387\n1116#2,6:2433\n1#3:2176\n74#4:2225\n74#4:2350\n78#5,11:2238\n78#5,11:2272\n91#5:2304\n78#5,11:2312\n91#5:2344\n91#5:2349\n78#5,11:2359\n78#5,11:2399\n91#5:2431\n78#5,11:2445\n91#5:2477\n78#5,11:2485\n91#5:2517\n91#5:2522\n456#6,8:2249\n464#6,3:2263\n456#6,8:2283\n464#6,3:2297\n467#6,3:2301\n456#6,8:2323\n464#6,3:2337\n467#6,3:2341\n467#6,3:2346\n456#6,8:2370\n464#6,3:2384\n456#6,8:2410\n464#6,3:2424\n467#6,3:2428\n456#6,8:2456\n464#6,3:2470\n467#6,3:2474\n456#6,8:2496\n464#6,3:2510\n467#6,3:2514\n467#6,3:2519\n3737#7,6:2257\n3737#7,6:2291\n3737#7,6:2331\n3737#7,6:2378\n3737#7,6:2418\n3737#7,6:2464\n3737#7,6:2504\n68#8,6:2266\n74#8:2300\n78#8:2305\n68#8,6:2306\n74#8:2340\n78#8:2345\n68#8,6:2393\n74#8:2427\n78#8:2432\n68#8,6:2439\n74#8:2473\n78#8:2478\n68#8,6:2479\n74#8:2513\n78#8:2518\n52#9:2351\n53#9:2352\n16867#10,14:2523\n25#11,3:2537\n25#11,3:2540\n154#12:2543\n154#12:2544\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n*L\n157#1:2152,6\n248#1:2158,6\n268#1:2164,6\n344#1:2170,6\n418#1:2177,6\n419#1:2183,6\n519#1:2189,6\n520#1:2195,6\n546#1:2201,6\n559#1:2207,6\n626#1:2213,6\n627#1:2219,6\n685#1:2226,6\n712#1:2232,6\n808#1:2353,6\n783#1:2387,6\n791#1:2433,6\n674#1:2225\n764#1:2350\n690#1:2238,11\n692#1:2272,11\n692#1:2304\n695#1:2312,11\n695#1:2344\n690#1:2349\n779#1:2359,11\n781#1:2399,11\n781#1:2431\n789#1:2445,11\n789#1:2477\n797#1:2485,11\n797#1:2517\n779#1:2522\n690#1:2249,8\n690#1:2263,3\n692#1:2283,8\n692#1:2297,3\n692#1:2301,3\n695#1:2323,8\n695#1:2337,3\n695#1:2341,3\n690#1:2346,3\n779#1:2370,8\n779#1:2384,3\n781#1:2410,8\n781#1:2424,3\n781#1:2428,3\n789#1:2456,8\n789#1:2470,3\n789#1:2474,3\n797#1:2496,8\n797#1:2510,3\n797#1:2514,3\n779#1:2519,3\n690#1:2257,6\n692#1:2291,6\n695#1:2331,6\n779#1:2378,6\n781#1:2418,6\n789#1:2464,6\n797#1:2504,6\n692#1:2266,6\n692#1:2300\n692#1:2305\n695#1:2306,6\n695#1:2340\n695#1:2345\n781#1:2393,6\n781#1:2427\n781#1:2432\n789#1:2439,6\n789#1:2473\n789#1:2478\n797#1:2479,6\n797#1:2513\n797#1:2518\n776#1:2351\n777#1:2352\n1248#1:2523,14\n2124#1:2537,3\n2142#1:2540,3\n1710#1:2543\n1711#1:2544\n*E\n"})
/* loaded from: classes2.dex */
public final class SliderKt {
    private static final float ThumbDefaultElevation;
    private static final float ThumbHeight;
    private static final float ThumbPressedElevation;
    private static final long ThumbSize;
    private static final float ThumbWidth;
    private static final float TickSize;
    private static final float TrackHeight;

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$11 */
    /* loaded from: classes3.dex */
    public static final class C158611 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $endInteractionSource;
        public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $endThumb;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<ClosedFloatingPointRange<Float>, Unit> $onValueChange;
        public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        public final /* synthetic */ MutableInteractionSource $startInteractionSource;
        public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $startThumb;
        public final /* synthetic */ int $steps;
        public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $track;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $value;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C158611(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange2, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, int i, int i2, int i3, int i4) {
            super(2);
            closedFloatingPointRange = closedFloatingPointRange;
            function1 = function1;
            modifier = modifier;
            z = z;
            closedFloatingPointRange = closedFloatingPointRange2;
            function0 = function0;
            sliderColors = sliderColors;
            mutableInteractionSource = mutableInteractionSource;
            mutableInteractionSource = mutableInteractionSource2;
            function3 = function3;
            function3 = function32;
            function3 = function33;
            i = i;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier, z, closedFloatingPointRange, function0, sliderColors, mutableInteractionSource, mutableInteractionSource, function3, function3, function3, i, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$18 */
    /* loaded from: classes4.dex */
    public static final class C159018 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $endInteractionSource;
        public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $endThumb;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ MutableInteractionSource $startInteractionSource;
        public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $startThumb;
        public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C159018(Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, int i, int i2) {
            super(2);
            modifier = modifier;
            z = z;
            sliderColors = sliderColors;
            mutableInteractionSource = mutableInteractionSource;
            mutableInteractionSource = mutableInteractionSource2;
            function3 = function3;
            function3 = function32;
            function3 = function33;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            SliderKt.RangeSlider(rangeSliderState, modifier, z, sliderColors, mutableInteractionSource, mutableInteractionSource, function3, function3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$4 */
    /* loaded from: classes4.dex */
    public static final class C15934 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<ClosedFloatingPointRange<Float>, Unit> $onValueChange;
        public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        public final /* synthetic */ int $steps;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $value;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15934(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i, Function0<Unit> function0, SliderColors sliderColors, int i2, int i3) {
            super(2);
            closedFloatingPointRange = closedFloatingPointRange;
            function1 = function1;
            modifier = modifier;
            z = z;
            closedFloatingPointRange = closedFloatingPointRange2;
            i = i;
            function0 = function0;
            sliderColors = sliderColors;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier, z, closedFloatingPointRange, i, function0, sliderColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSliderImpl$3 */
    /* loaded from: classes4.dex */
    public static final class C15983 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $endInteractionSource;
        public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $endThumb;
        public final /* synthetic */ MutableInteractionSource $startInteractionSource;
        public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $startThumb;
        public final /* synthetic */ RangeSliderState $state;
        public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15983(RangeSliderState rangeSliderState, boolean z, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, int i) {
            super(2);
            rangeSliderState = rangeSliderState;
            z = z;
            mutableInteractionSource = mutableInteractionSource;
            mutableInteractionSource = mutableInteractionSource2;
            function3 = function3;
            function3 = function32;
            function3 = function33;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            SliderKt.RangeSliderImpl(modifier, rangeSliderState, z, mutableInteractionSource, mutableInteractionSource, function3, function3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$Slider$13 */
    /* loaded from: classes4.dex */
    public static final class C160113 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $thumb;
        public final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C160113(Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, int i, int i2) {
            super(2);
            modifier = modifier;
            z = z;
            sliderColors = sliderColors;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            function3 = function32;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            SliderKt.Slider(sliderState, modifier, z, sliderColors, mutableInteractionSource, function3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$Slider$4 */
    /* loaded from: classes4.dex */
    public static final class C16044 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<Float, Unit> $onValueChange;
        public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        public final /* synthetic */ int $steps;
        public final /* synthetic */ float $value;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16044(float f, Function1<? super Float, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
            super(2);
            f = f;
            function1 = function1;
            modifier = modifier;
            z = z;
            closedFloatingPointRange = closedFloatingPointRange;
            i = i;
            function0 = function0;
            sliderColors = sliderColors;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            SliderKt.Slider(f, function1, modifier, z, closedFloatingPointRange, i, function0, sliderColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$Slider$8 */
    /* loaded from: classes4.dex */
    public static final class C16078 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<Float, Unit> $onValueChange;
        public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        public final /* synthetic */ int $steps;
        public final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $thumb;
        public final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $track;
        public final /* synthetic */ float $value;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16078(float f, Function1<? super Float, Unit> function1, Modifier modifier, boolean z, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i2, int i3, int i4) {
            super(2);
            f = f;
            function1 = function1;
            modifier = modifier;
            z = z;
            function0 = function0;
            sliderColors = sliderColors;
            mutableInteractionSource = mutableInteractionSource;
            i = i;
            function3 = function3;
            function3 = function32;
            closedFloatingPointRange = closedFloatingPointRange;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            SliderKt.Slider(f, function1, modifier, z, function0, sliderColors, mutableInteractionSource, i, function3, function3, closedFloatingPointRange, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$SliderImpl$3 */
    /* loaded from: classes4.dex */
    public static final class C16093 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ SliderState $state;
        public final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $thumb;
        public final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16093(SliderState sliderState, boolean z, MutableInteractionSource mutableInteractionSource, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, int i) {
            super(2);
            sliderState = sliderState;
            z = z;
            mutableInteractionSource = mutableInteractionSource;
            function3 = function3;
            function3 = function32;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            SliderKt.SliderImpl(modifier, sliderState, z, mutableInteractionSource, function3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @Stable
    /* renamed from: isSpecified-If1S1O4$annotations */
    public static /* synthetic */ void m9773isSpecifiedIf1S1O4$annotations(long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(float f, @NotNull Function1<? super Float, Unit> function1, @Nullable Modifier modifier, boolean z, @Nullable ClosedFloatingPointRange<Float> closedFloatingPointRange, @IntRange(from = 0) int i, @Nullable Function0<Unit> function0, @Nullable SliderColors sliderColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        int i7;
        int i8;
        int i9;
        Function0<Unit> function02;
        int i10;
        SliderColors sliderColorsColors;
        MutableInteractionSource mutableInteractionSource2;
        int i11;
        int i12;
        SliderColors sliderColors2;
        Function0<Unit> function03;
        Function0<Unit> function04;
        boolean z3;
        SliderColors sliderColors3;
        Modifier modifier3;
        int i13;
        MutableInteractionSource mutableInteractionSource3;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-202044027);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z2 = z;
                        i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    if ((i2 & CpioConstants.C_ISBLK) != 0) {
                        if ((i3 & 16) == 0) {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                            int i14 = composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo) ? 16384 : 8192;
                            i4 |= i14;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                        }
                        i4 |= i14;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else {
                        if ((196608 & i2) == 0) {
                            i8 = i;
                            i4 |= composerStartRestartGroup.changed(i8) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 == 0) {
                            if ((1572864 & i2) == 0) {
                                function02 = function0;
                                i4 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                            }
                            if ((i2 & 12582912) == 0) {
                                i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(sliderColors)) ? 8388608 : 4194304;
                            }
                            i10 = i3 & 256;
                            if (i10 == 0) {
                                i4 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                            }
                            if ((i4 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i5 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i6 != 0) {
                                        z2 = true;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                        closedFloatingPointRangeRangeTo = RangesKt__RangesKt.rangeTo(0.0f, 1.0f);
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i9 != 0) {
                                        function02 = null;
                                    }
                                    if ((i3 & 128) == 0) {
                                        sliderColorsColors = SliderDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                        i4 &= -29360129;
                                    } else {
                                        sliderColorsColors = sliderColors;
                                    }
                                    if (i10 == 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-1537043190);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    i11 = i4;
                                    i12 = i8;
                                    sliderColors2 = sliderColorsColors;
                                    function03 = function02;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i11 = i4;
                                    i12 = i8;
                                    function03 = function02;
                                    sliderColors2 = sliderColors;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-202044027, i11, -1, "androidx.compose.material3.Slider (Slider.kt:157)");
                                }
                                int i15 = i11 >> 6;
                                Slider(f, function1, modifier2, z2, function03, sliderColors2, mutableInteractionSource2, i12, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 308249025, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.2
                                    public final /* synthetic */ SliderColors $colors;
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C16022(SliderColors sliderColors22, boolean z22) {
                                        super(3);
                                        sliderColors = sliderColors22;
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                                        invoke(sliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull SliderState sliderState, @Nullable Composer composer2, int i16) {
                                        if ((i16 & 17) != 16 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(308249025, i16, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:168)");
                                            }
                                            SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1843234110, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.3
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C16033(boolean z22) {
                                        super(3);
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                                        invoke(sliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull SliderState sliderState, @Nullable Composer composer2, int i16) {
                                        if ((i16 & 6) == 0) {
                                            i16 |= composer2.changed(sliderState) ? 4 : 2;
                                        }
                                        if ((i16 & 19) != 18 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1843234110, i16, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:175)");
                                            }
                                            SliderDefaults.INSTANCE.Track(sliderState, (Modifier) null, sliderColors, z, composer2, (i16 & 14) | CpioConstants.C_ISBLK, 2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), closedFloatingPointRangeRangeTo, composerStartRestartGroup, (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i15) | (458752 & i15) | (i15 & 3670016) | ((i11 << 6) & 29360128), (i11 >> 12) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function04 = function03;
                                z3 = z22;
                                sliderColors3 = sliderColors22;
                                modifier3 = modifier2;
                                i13 = i12;
                                ClosedFloatingPointRange<Float> closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                closedFloatingPointRange2 = closedFloatingPointRange3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z3 = z22;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                i13 = i8;
                                function04 = function02;
                                sliderColors3 = sliderColors;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.4
                                    public final /* synthetic */ int $$changed;
                                    public final /* synthetic */ int $$default;
                                    public final /* synthetic */ SliderColors $colors;
                                    public final /* synthetic */ boolean $enabled;
                                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                                    public final /* synthetic */ Modifier $modifier;
                                    public final /* synthetic */ Function1<Float, Unit> $onValueChange;
                                    public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                                    public final /* synthetic */ int $steps;
                                    public final /* synthetic */ float $value;
                                    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public C16044(float f2, Function1<? super Float, Unit> function12, Modifier modifier32, boolean z32, ClosedFloatingPointRange<Float> closedFloatingPointRange22, int i132, Function0<Unit> function042, SliderColors sliderColors32, MutableInteractionSource mutableInteractionSource32, int i22, int i32) {
                                        super(2);
                                        f = f2;
                                        function1 = function12;
                                        modifier = modifier32;
                                        z = z32;
                                        closedFloatingPointRange = closedFloatingPointRange22;
                                        i = i132;
                                        function0 = function042;
                                        sliderColors = sliderColors32;
                                        mutableInteractionSource = mutableInteractionSource32;
                                        i = i22;
                                        i = i32;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer2, int i16) {
                                        SliderKt.Slider(f, function1, modifier, z, closedFloatingPointRange, i, function0, sliderColors, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 1572864;
                        function02 = function0;
                        if ((i22 & 12582912) == 0) {
                        }
                        i10 = i32 & 256;
                        if (i10 == 0) {
                        }
                        if ((i4 & 38347923) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i22 & 1) != 0) {
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if ((i32 & 16) != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if ((i32 & 128) == 0) {
                                }
                                if (i10 == 0) {
                                }
                                i11 = i4;
                                i12 = i8;
                                sliderColors22 = sliderColorsColors;
                                function03 = function02;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i152 = i11 >> 6;
                                Slider(f2, function12, modifier2, z22, function03, sliderColors22, mutableInteractionSource2, i12, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 308249025, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.2
                                    public final /* synthetic */ SliderColors $colors;
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C16022(SliderColors sliderColors22, boolean z22) {
                                        super(3);
                                        sliderColors = sliderColors22;
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                                        invoke(sliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull SliderState sliderState, @Nullable Composer composer2, int i16) {
                                        if ((i16 & 17) != 16 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(308249025, i16, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:168)");
                                            }
                                            SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1843234110, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.3
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C16033(boolean z22) {
                                        super(3);
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                                        invoke(sliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull SliderState sliderState, @Nullable Composer composer2, int i16) {
                                        if ((i16 & 6) == 0) {
                                            i16 |= composer2.changed(sliderState) ? 4 : 2;
                                        }
                                        if ((i16 & 19) != 18 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1843234110, i16, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:175)");
                                            }
                                            SliderDefaults.INSTANCE.Track(sliderState, (Modifier) null, sliderColors, z, composer2, (i16 & 14) | CpioConstants.C_ISBLK, 2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), closedFloatingPointRangeRangeTo, composerStartRestartGroup, (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i152) | (458752 & i152) | (i152 & 3670016) | ((i11 << 6) & 29360128), (i11 >> 12) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function042 = function03;
                                z32 = z22;
                                sliderColors32 = sliderColors22;
                                modifier32 = modifier2;
                                i132 = i12;
                                ClosedFloatingPointRange<Float> closedFloatingPointRange32 = closedFloatingPointRangeRangeTo;
                                mutableInteractionSource32 = mutableInteractionSource2;
                                closedFloatingPointRange22 = closedFloatingPointRange32;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i8 = i;
                    i9 = i32 & 64;
                    if (i9 == 0) {
                    }
                    function02 = function0;
                    if ((i22 & 12582912) == 0) {
                    }
                    i10 = i32 & 256;
                    if (i10 == 0) {
                    }
                    if ((i4 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z22 = z;
                if ((i22 & CpioConstants.C_ISBLK) != 0) {
                }
                i7 = i32 & 32;
                if (i7 == 0) {
                }
                i8 = i;
                i9 = i32 & 64;
                if (i9 == 0) {
                }
                function02 = function0;
                if ((i22 & 12582912) == 0) {
                }
                i10 = i32 & 256;
                if (i10 == 0) {
                }
                if ((i4 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i32 & 8;
            if (i6 != 0) {
            }
            z22 = z;
            if ((i22 & CpioConstants.C_ISBLK) != 0) {
            }
            i7 = i32 & 32;
            if (i7 == 0) {
            }
            i8 = i;
            i9 = i32 & 64;
            if (i9 == 0) {
            }
            function02 = function0;
            if ((i22 & 12582912) == 0) {
            }
            i10 = i32 & 256;
            if (i10 == 0) {
            }
            if ((i4 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i32 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i32 & 8;
        if (i6 != 0) {
        }
        z22 = z;
        if ((i22 & CpioConstants.C_ISBLK) != 0) {
        }
        i7 = i32 & 32;
        if (i7 == 0) {
        }
        i8 = i;
        i9 = i32 & 64;
        if (i9 == 0) {
        }
        function02 = function0;
        if ((i22 & 12582912) == 0) {
        }
        i10 = i32 & 256;
        if (i10 == 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SliderState;", "invoke", "(Landroidx/compose/material3/SliderState;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$Slider$2 */
    /* loaded from: classes4.dex */
    public static final class C16022 extends Lambda implements Function3<SliderState, Composer, Integer, Unit> {
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16022(SliderColors sliderColors22, boolean z22) {
            super(3);
            sliderColors = sliderColors22;
            z = z22;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
            invoke(sliderState, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull SliderState sliderState, @Nullable Composer composer2, int i16) {
            if ((i16 & 17) != 16 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(308249025, i16, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:168)");
                }
                SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "sliderState", "Landroidx/compose/material3/SliderState;", "invoke", "(Landroidx/compose/material3/SliderState;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$Slider$3 */
    /* loaded from: classes4.dex */
    public static final class C16033 extends Lambda implements Function3<SliderState, Composer, Integer, Unit> {
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16033(boolean z22) {
            super(3);
            z = z22;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
            invoke(sliderState, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull SliderState sliderState, @Nullable Composer composer2, int i16) {
            if ((i16 & 6) == 0) {
                i16 |= composer2.changed(sliderState) ? 4 : 2;
            }
            if ((i16 & 19) != 18 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1843234110, i16, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:175)");
                }
                SliderDefaults.INSTANCE.Track(sliderState, (Modifier) null, sliderColors, z, composer2, (i16 & 14) | CpioConstants.C_ISBLK, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$Slider$6 */
    /* loaded from: classes4.dex */
    public static final class C16056 extends Lambda implements Function3<SliderState, Composer, Integer, Unit> {
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16056(SliderColors sliderColors, boolean z) {
            super(3);
            sliderColors = sliderColors;
            z = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer, Integer num) {
            invoke(sliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull SliderState sliderState, @Nullable Composer composer, int i) {
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1756326375, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:251)");
                }
                SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$Slider$7 */
    /* loaded from: classes4.dex */
    public static final class C16067 extends Lambda implements Function3<SliderState, Composer, Integer, Unit> {
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16067(boolean z) {
            super(3);
            z = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer, Integer num) {
            invoke(sliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull SliderState sliderState, @Nullable Composer composer, int i) {
            if ((i & 6) == 0) {
                i |= composer.changed(sliderState) ? 4 : 2;
            }
            if ((i & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2083675534, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:258)");
                }
                SliderDefaults.INSTANCE.Track(sliderState, (Modifier) null, sliderColors, z, composer, (i & 14) | CpioConstants.C_ISBLK, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:236:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:399:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(float f, @NotNull Function1<? super Float, Unit> function1, @Nullable Modifier modifier, boolean z, @Nullable Function0<Unit> function0, @Nullable SliderColors sliderColors, @Nullable MutableInteractionSource mutableInteractionSource, @IntRange(from = 0) int i, @Nullable Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, @Nullable Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, @Nullable ClosedFloatingPointRange<Float> closedFloatingPointRange, @Nullable Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        Function0<Unit> function02;
        SliderColors sliderColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier modifier2;
        boolean z2;
        Function0<Unit> function03;
        SliderColors sliderColorsColors;
        MutableInteractionSource mutableInteractionSource2;
        int i13;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3ComposableLambda2;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        int i14;
        SliderColors sliderColors3;
        final State stateRememberUpdatedState;
        boolean z3;
        Object objRememberedValue;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function33;
        boolean z4;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        Function0<Unit> function04;
        int i15;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function34;
        SliderColors sliderColors4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1191170377);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i16 = i4 & 4;
        if (i16 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i5 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 == 0) {
                    if ((i2 & CpioConstants.C_ISBLK) == 0) {
                        function02 = function0;
                        i5 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i4 & 32) == 0) {
                            sliderColors2 = sliderColors;
                            int i17 = composerStartRestartGroup.changed(sliderColors2) ? 131072 : 65536;
                            i5 |= i17;
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i5 |= i17;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i8 = i4 & 64;
                    if (i8 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    i9 = i4 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i10 = i4 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i11 = i4 & 512;
                    if (i11 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function32) ? 536870912 : 268435456;
                    }
                    if ((i3 & 6) != 0) {
                        i12 = i3 | (((i4 & 1024) == 0 && composerStartRestartGroup.changed(closedFloatingPointRange)) ? 4 : 2);
                    } else {
                        i12 = i3;
                    }
                    if ((i5 & 306783379) == 306783378 || (i12 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i16 == 0 ? Modifier.INSTANCE : modifier;
                            z2 = i6 == 0 ? true : z;
                            function03 = i7 == 0 ? null : function02;
                            if ((i4 & 32) == 0) {
                                sliderColorsColors = SliderDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                i5 &= -458753;
                            } else {
                                sliderColorsColors = sliderColors2;
                            }
                            if (i8 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1537039109);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            i13 = i9 == 0 ? 0 : i;
                            function3ComposableLambda = i10 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1756326375, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.6
                                public final /* synthetic */ SliderColors $colors;
                                public final /* synthetic */ boolean $enabled;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C16056(SliderColors sliderColorsColors2, boolean z22) {
                                    super(3);
                                    sliderColors = sliderColorsColors2;
                                    z = z22;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                                    invoke(sliderState, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull SliderState sliderState, @Nullable Composer composer2, int i18) {
                                    if ((i18 & 17) != 16 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1756326375, i18, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:251)");
                                        }
                                        SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }) : function3;
                            function3ComposableLambda2 = i11 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2083675534, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.7
                                public final /* synthetic */ boolean $enabled;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C16067(boolean z22) {
                                    super(3);
                                    z = z22;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                                    invoke(sliderState, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull SliderState sliderState, @Nullable Composer composer2, int i18) {
                                    if ((i18 & 6) == 0) {
                                        i18 |= composer2.changed(sliderState) ? 4 : 2;
                                    }
                                    if ((i18 & 19) != 18 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2083675534, i18, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:258)");
                                        }
                                        SliderDefaults.INSTANCE.Track(sliderState, (Modifier) null, sliderColors, z, composer2, (i18 & 14) | CpioConstants.C_ISBLK, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }) : function32;
                            if ((i4 & 1024) == 0) {
                                closedFloatingPointRangeRangeTo = RangesKt__RangesKt.rangeTo(0.0f, 1.0f);
                                i12 &= -15;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                            }
                            i14 = i12;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i4 & 1024) != 0) {
                                i12 &= -15;
                            }
                            modifier2 = modifier;
                            z22 = z;
                            i13 = i;
                            function3ComposableLambda = function3;
                            function3ComposableLambda2 = function32;
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                            function03 = function02;
                            sliderColorsColors2 = sliderColors2;
                            i14 = i12;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            sliderColors3 = sliderColorsColors2;
                        } else {
                            sliderColors3 = sliderColorsColors2;
                            ComposerKt.traceEventStart(1191170377, i5, i14, "androidx.compose.material3.Slider (Slider.kt:265)");
                        }
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function03, composerStartRestartGroup, (i5 >> 12) & 14);
                        composerStartRestartGroup.startReplaceableGroup(-1537038451);
                        Function0<Unit> function05 = function03;
                        z3 = ((29360128 & i5) != 8388608) | ((((i14 & 14) ^ 6) <= 4 && composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) || (i14 & 6) == 4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new SliderState(f, i13, new Function0<Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$state$1$1
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
                                    Function0<Unit> value = stateRememberUpdatedState.getValue();
                                    if (value != null) {
                                        value.invoke();
                                    }
                                }
                            }, closedFloatingPointRangeRangeTo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        SliderState sliderState = (SliderState) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        sliderState.setOnValueChange$material3_release(function1);
                        sliderState.setValue(f);
                        int i18 = ((i5 >> 3) & 1008) | ((i5 >> 6) & 57344);
                        int i19 = i5 >> 9;
                        Slider(sliderState, modifier2, z22, null, mutableInteractionSource2, function3ComposableLambda, function3ComposableLambda2, composerStartRestartGroup, (i19 & 3670016) | i18 | (458752 & i19), 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function33 = function3ComposableLambda;
                        z4 = z22;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        function04 = function05;
                        i15 = i13;
                        function34 = function3ComposableLambda2;
                        sliderColors4 = sliderColors3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        z4 = z;
                        i15 = i;
                        function33 = function3;
                        function34 = function32;
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        function04 = function02;
                        sliderColors4 = sliderColors2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.8
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$changed1;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ SliderColors $colors;
                            public final /* synthetic */ boolean $enabled;
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public final /* synthetic */ Modifier $modifier;
                            public final /* synthetic */ Function1<Float, Unit> $onValueChange;
                            public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                            public final /* synthetic */ int $steps;
                            public final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $thumb;
                            public final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $track;
                            public final /* synthetic */ float $value;
                            public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C16078(float f2, Function1<? super Float, Unit> function12, Modifier modifier22, boolean z42, Function0<Unit> function042, SliderColors sliderColors42, MutableInteractionSource mutableInteractionSource22, int i152, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function332, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function342, ClosedFloatingPointRange<Float> closedFloatingPointRange22, int i22, int i32, int i42) {
                                super(2);
                                f = f2;
                                function1 = function12;
                                modifier = modifier22;
                                z = z42;
                                function0 = function042;
                                sliderColors = sliderColors42;
                                mutableInteractionSource = mutableInteractionSource22;
                                i = i152;
                                function3 = function332;
                                function3 = function342;
                                closedFloatingPointRange = closedFloatingPointRange22;
                                i = i22;
                                i = i32;
                                i = i42;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i20) {
                                SliderKt.Slider(f, function1, modifier, z, function0, sliderColors, mutableInteractionSource, i, function3, function3, closedFloatingPointRange, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= CpioConstants.C_ISBLK;
                function02 = function0;
                if ((196608 & i22) != 0) {
                }
                i8 = i42 & 64;
                if (i8 == 0) {
                }
                i9 = i42 & 128;
                if (i9 == 0) {
                }
                i10 = i42 & 256;
                if (i10 == 0) {
                }
                i11 = i42 & 512;
                if (i11 == 0) {
                }
                if ((i32 & 6) != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i22 & 1) != 0) {
                        if (i16 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i42 & 32) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if ((i42 & 1024) == 0) {
                        }
                        i14 = i12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function03, composerStartRestartGroup, (i5 >> 12) & 14);
                        composerStartRestartGroup.startReplaceableGroup(-1537038451);
                        Function0<Unit> function052 = function03;
                        if (((i14 & 14) ^ 6) <= 4) {
                            z3 = ((29360128 & i5) != 8388608) | ((((i14 & 14) ^ 6) <= 4 && composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) || (i14 & 6) == 4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z3) {
                                objRememberedValue = new SliderState(f2, i13, new Function0<Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$state$1$1
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
                                        Function0<Unit> value = stateRememberUpdatedState.getValue();
                                        if (value != null) {
                                            value.invoke();
                                        }
                                    }
                                }, closedFloatingPointRangeRangeTo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                SliderState sliderState2 = (SliderState) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                sliderState2.setOnValueChange$material3_release(function12);
                                sliderState2.setValue(f2);
                                int i182 = ((i5 >> 3) & 1008) | ((i5 >> 6) & 57344);
                                int i192 = i5 >> 9;
                                Slider(sliderState2, modifier22, z22, null, mutableInteractionSource22, function3ComposableLambda, function3ComposableLambda2, composerStartRestartGroup, (i192 & 3670016) | i182 | (458752 & i192), 8);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function332 = function3ComposableLambda;
                                z42 = z22;
                                closedFloatingPointRange22 = closedFloatingPointRangeRangeTo;
                                function042 = function052;
                                i152 = i13;
                                function342 = function3ComposableLambda2;
                                sliderColors42 = sliderColors3;
                            }
                        } else {
                            z3 = ((29360128 & i5) != 8388608) | ((((i14 & 14) ^ 6) <= 4 && composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) || (i14 & 6) == 4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z3) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i42 & 16;
            if (i7 == 0) {
            }
            function02 = function0;
            if ((196608 & i22) != 0) {
            }
            i8 = i42 & 64;
            if (i8 == 0) {
            }
            i9 = i42 & 128;
            if (i9 == 0) {
            }
            i10 = i42 & 256;
            if (i10 == 0) {
            }
            i11 = i42 & 512;
            if (i11 == 0) {
            }
            if ((i32 & 6) != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i6 = i42 & 8;
        if (i6 == 0) {
        }
        i7 = i42 & 16;
        if (i7 == 0) {
        }
        function02 = function0;
        if ((196608 & i22) != 0) {
        }
        i8 = i42 & 64;
        if (i8 == 0) {
        }
        i9 = i42 & 128;
        if (i9 == 0) {
        }
        i10 = i42 & 256;
        if (i10 == 0) {
        }
        i11 = i42 & 512;
        if (i11 == 0) {
        }
        if ((i32 & 6) != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$Slider$10 */
    /* loaded from: classes4.dex */
    public static final class C159910 extends Lambda implements Function3<SliderState, Composer, Integer, Unit> {
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C159910(SliderColors sliderColors, boolean z) {
            super(3);
            sliderColors = sliderColors;
            z = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer, Integer num) {
            invoke(sliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull SliderState sliderState, @Nullable Composer composer, int i) {
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1426271326, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:345)");
                }
                SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$Slider$11 */
    /* loaded from: classes4.dex */
    public static final class C160011 extends Lambda implements Function3<SliderState, Composer, Integer, Unit> {
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C160011(boolean z) {
            super(3);
            z = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer, Integer num) {
            invoke(sliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull SliderState sliderState, @Nullable Composer composer, int i) {
            if ((i & 6) == 0) {
                i |= composer.changed(sliderState) ? 4 : 2;
            }
            if ((i & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(577038345, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:352)");
                }
                SliderDefaults.INSTANCE.Track(sliderState, (Modifier) null, sliderColors, z, composer, (i & 14) | CpioConstants.C_ISBLK, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(@NotNull SliderState sliderState, @Nullable Modifier modifier, boolean z, @Nullable SliderColors sliderColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, @Nullable Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        SliderColors sliderColorsColors;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        int i7;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function33;
        Modifier modifier3;
        int i8;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3ComposableLambda2;
        SliderColors sliderColors2;
        MutableInteractionSource mutableInteractionSource3;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function34;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function35;
        SliderColors sliderColors3;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        boolean z3;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function36;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1303883986);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColorsColors = sliderColors;
                        int i10 = composerStartRestartGroup.changed(sliderColorsColors) ? 2048 : 1024;
                        i3 |= i10;
                    } else {
                        sliderColorsColors = sliderColors;
                    }
                    i3 |= i10;
                } else {
                    sliderColorsColors = sliderColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else {
                        if ((196608 & i) == 0) {
                            function3ComposableLambda = function3;
                            i3 |= composerStartRestartGroup.changedInstance(function3ComposableLambda) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 == 0) {
                            if ((1572864 & i) == 0) {
                                function33 = function32;
                                i3 |= composerStartRestartGroup.changedInstance(function33) ? 1048576 : 524288;
                            }
                            if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        sliderColorsColors = SliderDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                    }
                                    if (i5 != 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-1537035483);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    }
                                    if (i6 != 0) {
                                        function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1426271326, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.10
                                            public final /* synthetic */ SliderColors $colors;
                                            public final /* synthetic */ boolean $enabled;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C159910(SliderColors sliderColorsColors2, boolean z22) {
                                                super(3);
                                                sliderColors = sliderColorsColors2;
                                                z = z22;
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState2, Composer composer2, Integer num) {
                                                invoke(sliderState2, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@NotNull SliderState sliderState2, @Nullable Composer composer2, int i11) {
                                                if ((i11 & 17) != 16 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1426271326, i11, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:345)");
                                                    }
                                                    SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        });
                                    }
                                    if (i7 == 0) {
                                        function3ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 577038345, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.11
                                            public final /* synthetic */ boolean $enabled;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C160011(boolean z22) {
                                                super(3);
                                                z = z22;
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState2, Composer composer2, Integer num) {
                                                invoke(sliderState2, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@NotNull SliderState sliderState2, @Nullable Composer composer2, int i11) {
                                                if ((i11 & 6) == 0) {
                                                    i11 |= composer2.changed(sliderState2) ? 4 : 2;
                                                }
                                                if ((i11 & 19) != 18 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(577038345, i11, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:352)");
                                                    }
                                                    SliderDefaults.INSTANCE.Track(sliderState2, (Modifier) null, sliderColors, z, composer2, (i11 & 14) | CpioConstants.C_ISBLK, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        });
                                        i8 = i3;
                                        sliderColors2 = sliderColorsColors2;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        function34 = function3ComposableLambda;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1303883986, i8, -1, "androidx.compose.material3.Slider (Slider.kt:358)");
                                        }
                                        if (sliderState.getSteps() >= 0) {
                                            throw new IllegalArgumentException("steps should be >= 0".toString());
                                        }
                                        int i11 = i8 >> 3;
                                        SliderImpl(modifier3, sliderState, z22, mutableInteractionSource3, function34, function3ComposableLambda2, composerStartRestartGroup, (i8 & 896) | (i11 & 14) | ((i8 << 3) & 112) | (i11 & 7168) | (57344 & i11) | (i11 & 458752));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function35 = function34;
                                        sliderColors3 = sliderColors2;
                                        modifier4 = modifier3;
                                        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function37 = function3ComposableLambda2;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        z3 = z22;
                                        function36 = function37;
                                    } else {
                                        i8 = i3;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    i8 = i3;
                                    modifier3 = modifier2;
                                }
                                sliderColors2 = sliderColorsColors2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                function34 = function3ComposableLambda;
                                function3ComposableLambda2 = function33;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (sliderState.getSteps() >= 0) {
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier2;
                                z3 = z22;
                                sliderColors3 = sliderColorsColors2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                function35 = function3ComposableLambda;
                                function36 = function33;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.13
                                    public final /* synthetic */ int $$changed;
                                    public final /* synthetic */ int $$default;
                                    public final /* synthetic */ SliderColors $colors;
                                    public final /* synthetic */ boolean $enabled;
                                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                                    public final /* synthetic */ Modifier $modifier;
                                    public final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $thumb;
                                    public final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $track;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public C160113(Modifier modifier42, boolean z32, SliderColors sliderColors32, MutableInteractionSource mutableInteractionSource42, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function352, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function362, int i12, int i22) {
                                        super(2);
                                        modifier = modifier42;
                                        z = z32;
                                        sliderColors = sliderColors32;
                                        mutableInteractionSource = mutableInteractionSource42;
                                        function3 = function352;
                                        function3 = function362;
                                        i = i12;
                                        i = i22;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        SliderKt.Slider(sliderState, modifier, z, sliderColors, mutableInteractionSource, function3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 1572864;
                        function33 = function32;
                        if ((i3 & 599187) == 599186) {
                            composerStartRestartGroup.startDefaults();
                            if ((i12 & 1) != 0) {
                                if (i9 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if ((i22 & 8) != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function3ComposableLambda = function3;
                    i7 = i22 & 64;
                    if (i7 == 0) {
                    }
                    function33 = function32;
                    if ((i3 & 599187) == 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                i6 = i22 & 32;
                if (i6 == 0) {
                }
                function3ComposableLambda = function3;
                i7 = i22 & 64;
                if (i7 == 0) {
                }
                function33 = function32;
                if ((i3 & 599187) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z22 = z;
            if ((i12 & 3072) == 0) {
            }
            i5 = i22 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i6 = i22 & 32;
            if (i6 == 0) {
            }
            function3ComposableLambda = function3;
            i7 = i22 & 64;
            if (i7 == 0) {
            }
            function33 = function32;
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        z22 = z;
        if ((i12 & 3072) == 0) {
        }
        i5 = i22 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i6 = i22 & 32;
        if (i6 == 0) {
        }
        function3ComposableLambda = function3;
        i7 = i22 & 64;
        if (i7 == 0) {
        }
        function33 = function32;
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(@NotNull ClosedFloatingPointRange<Float> closedFloatingPointRange, @NotNull Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, @Nullable Modifier modifier, boolean z, @Nullable ClosedFloatingPointRange<Float> closedFloatingPointRange2, @IntRange(from = 0) int i, @Nullable Function0<Unit> function0, @Nullable SliderColors sliderColors, @Nullable Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        int i7;
        int i8;
        int i9;
        Function0<Unit> function02;
        SliderColors sliderColorsColors;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        SliderColors sliderColors2;
        Function0<Unit> function03;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        int i10;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-743091416);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(closedFloatingPointRange) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z2 = z;
                        i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    if ((i2 & CpioConstants.C_ISBLK) != 0) {
                        if ((i3 & 16) == 0) {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            int i11 = composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo) ? 16384 : 8192;
                            i4 |= i11;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        i4 |= i11;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else {
                        if ((196608 & i2) == 0) {
                            i8 = i;
                            i4 |= composerStartRestartGroup.changed(i8) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 == 0) {
                            if ((1572864 & i2) == 0) {
                                function02 = function0;
                                i4 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                            }
                            if ((i2 & 12582912) == 0) {
                                i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(sliderColors)) ? 8388608 : 4194304;
                            }
                            if ((i4 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                } else {
                                    if (i5 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i6 != 0) {
                                        z2 = true;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                        closedFloatingPointRangeRangeTo = RangesKt__RangesKt.rangeTo(0.0f, 1.0f);
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i9 != 0) {
                                        function02 = null;
                                    }
                                    if ((i3 & 128) == 0) {
                                        i4 &= -29360129;
                                        sliderColorsColors = SliderDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                    }
                                    ClosedFloatingPointRange<Float> closedFloatingPointRange4 = closedFloatingPointRangeRangeTo;
                                    Function0<Unit> function04 = function02;
                                    int i12 = i4;
                                    int i13 = i8;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-743091416, i12, -1, "androidx.compose.material3.RangeSlider (Slider.kt:416)");
                                    }
                                    composerStartRestartGroup.startReplaceableGroup(-223513570);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(-223513473);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue2 == companion.getEmpty()) {
                                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    RangeSlider(closedFloatingPointRange, function1, modifier2, z2, closedFloatingPointRange4, function04, null, mutableInteractionSource, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.1
                                        public final /* synthetic */ SliderColors $colors;
                                        public final /* synthetic */ boolean $enabled;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C15851(SliderColors sliderColorsColors2, boolean z22) {
                                            super(3);
                                            sliderColors = sliderColorsColors2;
                                            z = z22;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                            invoke(rangeSliderState, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i14) {
                                            if ((i14 & 17) != 16 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-811582901, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                                                }
                                                SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, 196614, 18);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.2
                                        public final /* synthetic */ SliderColors $colors;
                                        public final /* synthetic */ boolean $enabled;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C15912(SliderColors sliderColorsColors2, boolean z22) {
                                            super(3);
                                            sliderColors = sliderColorsColors2;
                                            z = z22;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                            invoke(rangeSliderState, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i14) {
                                            if ((i14 & 17) != 16 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1832060001, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                                                }
                                                SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, 196614, 18);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.3
                                        public final /* synthetic */ boolean $enabled;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C15923(boolean z22) {
                                            super(3);
                                            z = z22;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                            invoke(rangeSliderState, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i14) {
                                            if ((i14 & 6) == 0) {
                                                i14 |= composer2.changed(rangeSliderState) ? 4 : 2;
                                            }
                                            if ((i14 & 19) != 18 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(377064480, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:445)");
                                                }
                                                SliderDefaults.INSTANCE.Track(rangeSliderState, (Modifier) null, sliderColors, z, composer2, (i14 & 14) | CpioConstants.C_ISBLK, 2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }), i13, composerStartRestartGroup, (i12 & 14) | 918552576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | ((i12 >> 3) & 458752), ((i12 >> 9) & 896) | 54, 64);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    sliderColors2 = sliderColorsColors2;
                                    function03 = function04;
                                    closedFloatingPointRange3 = closedFloatingPointRange4;
                                    Modifier modifier4 = modifier2;
                                    i10 = i13;
                                    modifier3 = modifier4;
                                }
                                sliderColorsColors2 = sliderColors;
                                ClosedFloatingPointRange<Float> closedFloatingPointRange42 = closedFloatingPointRangeRangeTo;
                                Function0<Unit> function042 = function02;
                                int i122 = i4;
                                int i132 = i8;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(-223513570);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                }
                                MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(-223513473);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                }
                                MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) objRememberedValue2;
                                composerStartRestartGroup.endReplaceableGroup();
                                RangeSlider(closedFloatingPointRange, function1, modifier2, z22, closedFloatingPointRange42, function042, null, mutableInteractionSource3, mutableInteractionSource22, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.1
                                    public final /* synthetic */ SliderColors $colors;
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C15851(SliderColors sliderColorsColors2, boolean z22) {
                                        super(3);
                                        sliderColors = sliderColorsColors2;
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                        invoke(rangeSliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i14) {
                                        if ((i14 & 17) != 16 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-811582901, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                                            }
                                            SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, 196614, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.2
                                    public final /* synthetic */ SliderColors $colors;
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C15912(SliderColors sliderColorsColors2, boolean z22) {
                                        super(3);
                                        sliderColors = sliderColorsColors2;
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                        invoke(rangeSliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i14) {
                                        if ((i14 & 17) != 16 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1832060001, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                                            }
                                            SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, 196614, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.3
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C15923(boolean z22) {
                                        super(3);
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                        invoke(rangeSliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i14) {
                                        if ((i14 & 6) == 0) {
                                            i14 |= composer2.changed(rangeSliderState) ? 4 : 2;
                                        }
                                        if ((i14 & 19) != 18 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(377064480, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:445)");
                                            }
                                            SliderDefaults.INSTANCE.Track(rangeSliderState, (Modifier) null, sliderColors, z, composer2, (i14 & 14) | CpioConstants.C_ISBLK, 2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), i132, composerStartRestartGroup, (i122 & 14) | 918552576 | (i122 & 112) | (i122 & 896) | (i122 & 7168) | (57344 & i122) | ((i122 >> 3) & 458752), ((i122 >> 9) & 896) | 54, 64);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                sliderColors2 = sliderColorsColors2;
                                function03 = function042;
                                closedFloatingPointRange3 = closedFloatingPointRange42;
                                Modifier modifier42 = modifier2;
                                i10 = i132;
                                modifier3 = modifier42;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                                i10 = i8;
                                function03 = function02;
                                sliderColors2 = sliderColors;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.4
                                    public final /* synthetic */ int $$changed;
                                    public final /* synthetic */ int $$default;
                                    public final /* synthetic */ SliderColors $colors;
                                    public final /* synthetic */ boolean $enabled;
                                    public final /* synthetic */ Modifier $modifier;
                                    public final /* synthetic */ Function1<ClosedFloatingPointRange<Float>, Unit> $onValueChange;
                                    public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                                    public final /* synthetic */ int $steps;
                                    public final /* synthetic */ ClosedFloatingPointRange<Float> $value;
                                    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public C15934(ClosedFloatingPointRange<Float> closedFloatingPointRange5, Function1<? super ClosedFloatingPointRange<Float>, Unit> function12, Modifier modifier32, boolean z22, ClosedFloatingPointRange<Float> closedFloatingPointRange32, int i102, Function0<Unit> function032, SliderColors sliderColors22, int i22, int i32) {
                                        super(2);
                                        closedFloatingPointRange = closedFloatingPointRange5;
                                        function1 = function12;
                                        modifier = modifier32;
                                        z = z22;
                                        closedFloatingPointRange = closedFloatingPointRange32;
                                        i = i102;
                                        function0 = function032;
                                        sliderColors = sliderColors22;
                                        i = i22;
                                        i = i32;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer2, int i14) {
                                        SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier, z, closedFloatingPointRange, i, function0, sliderColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 1572864;
                        function02 = function0;
                        if ((i22 & 12582912) == 0) {
                        }
                        if ((i4 & 4793491) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i22 & 1) == 0) {
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if ((i32 & 16) != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if ((i32 & 128) == 0) {
                                    sliderColorsColors2 = sliderColors;
                                }
                                ClosedFloatingPointRange<Float> closedFloatingPointRange422 = closedFloatingPointRangeRangeTo;
                                Function0<Unit> function0422 = function02;
                                int i1222 = i4;
                                int i1322 = i8;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(-223513570);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                }
                                MutableInteractionSource mutableInteractionSource32 = (MutableInteractionSource) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(-223513473);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                }
                                MutableInteractionSource mutableInteractionSource222 = (MutableInteractionSource) objRememberedValue2;
                                composerStartRestartGroup.endReplaceableGroup();
                                RangeSlider(closedFloatingPointRange5, function12, modifier2, z22, closedFloatingPointRange422, function0422, null, mutableInteractionSource32, mutableInteractionSource222, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.1
                                    public final /* synthetic */ SliderColors $colors;
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C15851(SliderColors sliderColorsColors2, boolean z22) {
                                        super(3);
                                        sliderColors = sliderColorsColors2;
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                        invoke(rangeSliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i14) {
                                        if ((i14 & 17) != 16 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-811582901, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                                            }
                                            SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, 196614, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.2
                                    public final /* synthetic */ SliderColors $colors;
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C15912(SliderColors sliderColorsColors2, boolean z22) {
                                        super(3);
                                        sliderColors = sliderColorsColors2;
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                        invoke(rangeSliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i14) {
                                        if ((i14 & 17) != 16 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1832060001, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                                            }
                                            SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, 196614, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.3
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C15923(boolean z22) {
                                        super(3);
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                        invoke(rangeSliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i14) {
                                        if ((i14 & 6) == 0) {
                                            i14 |= composer2.changed(rangeSliderState) ? 4 : 2;
                                        }
                                        if ((i14 & 19) != 18 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(377064480, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:445)");
                                            }
                                            SliderDefaults.INSTANCE.Track(rangeSliderState, (Modifier) null, sliderColors, z, composer2, (i14 & 14) | CpioConstants.C_ISBLK, 2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), i1322, composerStartRestartGroup, (i1222 & 14) | 918552576 | (i1222 & 112) | (i1222 & 896) | (i1222 & 7168) | (57344 & i1222) | ((i1222 >> 3) & 458752), ((i1222 >> 9) & 896) | 54, 64);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                sliderColors22 = sliderColorsColors2;
                                function032 = function0422;
                                closedFloatingPointRange32 = closedFloatingPointRange422;
                                Modifier modifier422 = modifier2;
                                i102 = i1322;
                                modifier32 = modifier422;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i8 = i;
                    i9 = i32 & 64;
                    if (i9 == 0) {
                    }
                    function02 = function0;
                    if ((i22 & 12582912) == 0) {
                    }
                    if ((i4 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z22 = z;
                if ((i22 & CpioConstants.C_ISBLK) != 0) {
                }
                i7 = i32 & 32;
                if (i7 == 0) {
                }
                i8 = i;
                i9 = i32 & 64;
                if (i9 == 0) {
                }
                function02 = function0;
                if ((i22 & 12582912) == 0) {
                }
                if ((i4 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i32 & 8;
            if (i6 != 0) {
            }
            z22 = z;
            if ((i22 & CpioConstants.C_ISBLK) != 0) {
            }
            i7 = i32 & 32;
            if (i7 == 0) {
            }
            i8 = i;
            i9 = i32 & 64;
            if (i9 == 0) {
            }
            function02 = function0;
            if ((i22 & 12582912) == 0) {
            }
            if ((i4 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i32 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i32 & 8;
        if (i6 != 0) {
        }
        z22 = z;
        if ((i22 & CpioConstants.C_ISBLK) != 0) {
        }
        i7 = i32 & 32;
        if (i7 == 0) {
        }
        i8 = i;
        i9 = i32 & 64;
        if (i9 == 0) {
        }
        function02 = function0;
        if ((i22 & 12582912) == 0) {
        }
        if ((i4 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/RangeSliderState;", "invoke", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$1 */
    /* loaded from: classes4.dex */
    public static final class C15851 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15851(SliderColors sliderColorsColors2, boolean z22) {
            super(3);
            sliderColors = sliderColorsColors2;
            z = z22;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
            invoke(rangeSliderState, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i14) {
            if ((i14 & 17) != 16 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-811582901, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                }
                SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, 196614, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/RangeSliderState;", "invoke", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$2 */
    /* loaded from: classes4.dex */
    public static final class C15912 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15912(SliderColors sliderColorsColors2, boolean z22) {
            super(3);
            sliderColors = sliderColorsColors2;
            z = z22;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
            invoke(rangeSliderState, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i14) {
            if ((i14 & 17) != 16 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1832060001, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                }
                SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, 196614, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "rangeSliderState", "Landroidx/compose/material3/RangeSliderState;", "invoke", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$3 */
    /* loaded from: classes4.dex */
    public static final class C15923 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15923(boolean z22) {
            super(3);
            z = z22;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
            invoke(rangeSliderState, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i14) {
            if ((i14 & 6) == 0) {
                i14 |= composer2.changed(rangeSliderState) ? 4 : 2;
            }
            if ((i14 & 19) != 18 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(377064480, i14, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:445)");
                }
                SliderDefaults.INSTANCE.Track(rangeSliderState, (Modifier) null, sliderColors, z, composer2, (i14 & 14) | CpioConstants.C_ISBLK, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$7 */
    /* loaded from: classes4.dex */
    public static final class C15947 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15947(SliderColors sliderColors, boolean z) {
            super(3);
            sliderColors = sliderColors;
            z = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
            invoke(rangeSliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer, int i) {
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1963073082, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:521)");
                }
                SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$8 */
    /* loaded from: classes4.dex */
    public static final class C15958 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15958(SliderColors sliderColors, boolean z) {
            super(3);
            sliderColors = sliderColors;
            z = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
            invoke(rangeSliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer, int i) {
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1908709951, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:528)");
                }
                SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$9 */
    /* loaded from: classes4.dex */
    public static final class C15969 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15969(boolean z) {
            super(3);
            z = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
            invoke(rangeSliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer, int i) {
            if ((i & 6) == 0) {
                i |= composer.changed(rangeSliderState) ? 4 : 2;
            }
            if ((i & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-429193201, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:535)");
                }
                SliderDefaults.INSTANCE.Track(rangeSliderState, (Modifier) null, sliderColors, z, composer, (i & 14) | CpioConstants.C_ISBLK, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:277:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:481:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(@NotNull ClosedFloatingPointRange<Float> closedFloatingPointRange, @NotNull final Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, @Nullable Modifier modifier, boolean z, @Nullable ClosedFloatingPointRange<Float> closedFloatingPointRange2, @Nullable Function0<Unit> function0, @Nullable SliderColors sliderColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable MutableInteractionSource mutableInteractionSource2, @Nullable Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, @Nullable Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, @Nullable Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, @IntRange(from = 0) int i, @Nullable Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        Modifier modifier2;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        Function0<Unit> function02;
        SliderColors sliderColorsColors;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        int i15;
        boolean z3;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        int i16;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function34;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function35;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function36;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        Function0<Unit> function03;
        MutableInteractionSource mutableInteractionSource5;
        Modifier modifier3;
        SliderColors sliderColors2;
        final State stateRememberUpdatedState;
        boolean z4;
        Object objRememberedValue;
        boolean z5;
        Object objRememberedValue2;
        MutableInteractionSource mutableInteractionSource6;
        boolean z6;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function37;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function38;
        int i17;
        SliderColors sliderColors3;
        Function0<Unit> function04;
        MutableInteractionSource mutableInteractionSource7;
        ClosedFloatingPointRange<Float> closedFloatingPointRange4;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1048796133);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(closedFloatingPointRange) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i18 = i4 & 4;
        if (i18 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i5 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                }
                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                    i5 |= ((i4 & 16) == 0 && composerStartRestartGroup.changed(closedFloatingPointRange2)) ? 16384 : 8192;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i5 |= ((i4 & 64) == 0 && composerStartRestartGroup.changed(sliderColors)) ? 1048576 : 524288;
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i5 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i10 = i4 & 512;
                if (i10 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                }
                i11 = i4 & 1024;
                if (i11 != 0) {
                    i12 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i12 = i3 | (composerStartRestartGroup.changedInstance(function32) ? 4 : 2);
                } else {
                    i12 = i3;
                }
                i13 = i4 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                } else if ((i3 & 48) == 0) {
                    i12 |= composerStartRestartGroup.changedInstance(function33) ? 32 : 16;
                }
                int i19 = i12;
                i14 = i4 & 4096;
                if (i14 == 0) {
                    if ((i3 & 384) == 0) {
                        i19 |= composerStartRestartGroup.changed(i) ? 256 : 128;
                    }
                    if ((i5 & 306783379) == 306783378 || (i19 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i18 == 0 ? Modifier.INSTANCE : modifier;
                            z2 = i6 == 0 ? true : z;
                            if ((i4 & 16) == 0) {
                                modifier2 = modifier5;
                                closedFloatingPointRangeRangeTo = RangesKt__RangesKt.rangeTo(0.0f, 1.0f);
                                i5 &= -57345;
                            } else {
                                modifier2 = modifier5;
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            Function0<Unit> function05 = i7 == 0 ? null : function0;
                            ClosedFloatingPointRange<Float> closedFloatingPointRange5 = closedFloatingPointRangeRangeTo;
                            if ((i4 & 64) == 0) {
                                function02 = function05;
                                sliderColorsColors = SliderDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                i5 &= -3670017;
                            } else {
                                function02 = function05;
                                sliderColorsColors = sliderColors;
                            }
                            if (i8 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-223508693);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            if (i9 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-223508599);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                mutableInteractionSource4 = (MutableInteractionSource) objRememberedValue4;
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            if (i10 == 0) {
                                i15 = i5;
                                z3 = true;
                                function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1963073082, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.7
                                    public final /* synthetic */ SliderColors $colors;
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C15947(SliderColors sliderColorsColors2, boolean z22) {
                                        super(3);
                                        sliderColors = sliderColorsColors2;
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                        invoke(rangeSliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i20) {
                                        if ((i20 & 17) != 16 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1963073082, i20, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:521)");
                                            }
                                            SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                });
                            } else {
                                i15 = i5;
                                z3 = true;
                                function3ComposableLambda = function3;
                            }
                            Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3ComposableLambda2 = i11 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1908709951, z3, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.8
                                public final /* synthetic */ SliderColors $colors;
                                public final /* synthetic */ boolean $enabled;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C15958(SliderColors sliderColorsColors2, boolean z22) {
                                    super(3);
                                    sliderColors = sliderColorsColors2;
                                    z = z22;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                    invoke(rangeSliderState, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i20) {
                                    if ((i20 & 17) != 16 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1908709951, i20, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:528)");
                                        }
                                        SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }) : function32;
                            Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3ComposableLambda3 = i13 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -429193201, z3, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.9
                                public final /* synthetic */ boolean $enabled;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C15969(boolean z22) {
                                    super(3);
                                    z = z22;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                    invoke(rangeSliderState, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer2, int i20) {
                                    if ((i20 & 6) == 0) {
                                        i20 |= composer2.changed(rangeSliderState) ? 4 : 2;
                                    }
                                    if ((i20 & 19) != 18 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-429193201, i20, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:535)");
                                        }
                                        SliderDefaults.INSTANCE.Track(rangeSliderState, (Modifier) null, sliderColors, z, composer2, (i20 & 14) | CpioConstants.C_ISBLK, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }) : function33;
                            i5 = i15;
                            if (i14 == 0) {
                                function34 = function3ComposableLambda;
                                function35 = function3ComposableLambda2;
                                function36 = function3ComposableLambda3;
                                i16 = 0;
                            } else {
                                i16 = i;
                                function34 = function3ComposableLambda;
                                function35 = function3ComposableLambda2;
                                function36 = function3ComposableLambda3;
                            }
                            closedFloatingPointRange3 = closedFloatingPointRange5;
                            function03 = function02;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i4 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            modifier3 = modifier;
                            z22 = z;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            function03 = function0;
                            sliderColorsColors2 = sliderColors;
                            mutableInteractionSource3 = mutableInteractionSource;
                            mutableInteractionSource5 = mutableInteractionSource2;
                            function34 = function3;
                            function35 = function32;
                            function36 = function33;
                            i16 = i;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            sliderColors2 = sliderColorsColors2;
                        } else {
                            sliderColors2 = sliderColorsColors2;
                            ComposerKt.traceEventStart(-1048796133, i5, i19, "androidx.compose.material3.RangeSlider (Slider.kt:543)");
                        }
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function03, composerStartRestartGroup, (i5 >> 15) & 14);
                        composerStartRestartGroup.startReplaceableGroup(-223507747);
                        Function0<Unit> function06 = function03;
                        z4 = ((i19 & 896) != 256) | ((((57344 & i5) ^ CpioConstants.C_ISBLK) <= 16384 && composerStartRestartGroup.changed(closedFloatingPointRange3)) || (i5 & CpioConstants.C_ISBLK) == 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RangeSliderState(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i16, new Function0<Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$state$1$1
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
                                    Function0<Unit> value = stateRememberUpdatedState.getValue();
                                    if (value != null) {
                                        value.invoke();
                                    }
                                }
                            }, closedFloatingPointRange3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        RangeSliderState rangeSliderState = (RangeSliderState) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-223507467);
                        z5 = (i5 & 112) != 32;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<SliderRange, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$10$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SliderRange sliderRange) {
                                    m9775invokeIf1S1O4(sliderRange.m9786unboximpl());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-If1S1O4, reason: not valid java name */
                                public final void m9775invokeIf1S1O4(long j) {
                                    function1.invoke(RangesKt__RangesKt.rangeTo(SliderRange.m9783getStartimpl(j), SliderRange.m9782getEndInclusiveimpl(j)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        rangeSliderState.setOnValueChange$material3_release((Function1) objRememberedValue2);
                        rangeSliderState.setActiveRangeStart(closedFloatingPointRange.getStart().floatValue());
                        rangeSliderState.setActiveRangeEnd(closedFloatingPointRange.getEndInclusive().floatValue());
                        int i20 = (i5 >> 3) & 1008;
                        int i21 = i5 >> 9;
                        int i22 = (i21 & 3670016) | i20 | (57344 & i21) | (458752 & i21);
                        int i23 = i19 << 21;
                        RangeSlider(rangeSliderState, modifier3, z22, null, mutableInteractionSource3, mutableInteractionSource5, function34, function35, function36, composerStartRestartGroup, i22 | (29360128 & i23) | (i23 & 234881024), 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource6 = mutableInteractionSource3;
                        z6 = z22;
                        function37 = function35;
                        function38 = function36;
                        i17 = i16;
                        sliderColors3 = sliderColors2;
                        function04 = function06;
                        mutableInteractionSource7 = mutableInteractionSource5;
                        closedFloatingPointRange4 = closedFloatingPointRange3;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        z6 = z;
                        closedFloatingPointRange4 = closedFloatingPointRange2;
                        function04 = function0;
                        sliderColors3 = sliderColors;
                        mutableInteractionSource6 = mutableInteractionSource;
                        mutableInteractionSource7 = mutableInteractionSource2;
                        function34 = function3;
                        function37 = function32;
                        function38 = function33;
                        i17 = i;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.11
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$changed1;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ SliderColors $colors;
                            public final /* synthetic */ boolean $enabled;
                            public final /* synthetic */ MutableInteractionSource $endInteractionSource;
                            public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $endThumb;
                            public final /* synthetic */ Modifier $modifier;
                            public final /* synthetic */ Function1<ClosedFloatingPointRange<Float>, Unit> $onValueChange;
                            public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
                            public final /* synthetic */ MutableInteractionSource $startInteractionSource;
                            public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $startThumb;
                            public final /* synthetic */ int $steps;
                            public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $track;
                            public final /* synthetic */ ClosedFloatingPointRange<Float> $value;
                            public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C158611(ClosedFloatingPointRange<Float> closedFloatingPointRange6, final Function1<? super ClosedFloatingPointRange<Float>, Unit> function12, Modifier modifier42, boolean z62, ClosedFloatingPointRange<Float> closedFloatingPointRange42, Function0<Unit> function042, SliderColors sliderColors32, MutableInteractionSource mutableInteractionSource62, MutableInteractionSource mutableInteractionSource72, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function342, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function372, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function382, int i172, int i24, int i32, int i42) {
                                super(2);
                                closedFloatingPointRange = closedFloatingPointRange6;
                                function1 = function12;
                                modifier = modifier42;
                                z = z62;
                                closedFloatingPointRange = closedFloatingPointRange42;
                                function0 = function042;
                                sliderColors = sliderColors32;
                                mutableInteractionSource = mutableInteractionSource62;
                                mutableInteractionSource = mutableInteractionSource72;
                                function3 = function342;
                                function3 = function372;
                                function3 = function382;
                                i = i172;
                                i = i24;
                                i = i32;
                                i = i42;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i24) {
                                SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier, z, closedFloatingPointRange, function0, sliderColors, mutableInteractionSource, mutableInteractionSource, function3, function3, function3, i, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i19 |= 384;
                if ((i5 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i24 & 1) != 0) {
                        if (i18 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i42 & 16) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        ClosedFloatingPointRange<Float> closedFloatingPointRange52 = closedFloatingPointRangeRangeTo;
                        if ((i42 & 64) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        i5 = i15;
                        if (i14 == 0) {
                        }
                        closedFloatingPointRange3 = closedFloatingPointRange52;
                        function03 = function02;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        modifier3 = modifier2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function03, composerStartRestartGroup, (i5 >> 15) & 14);
                        composerStartRestartGroup.startReplaceableGroup(-223507747);
                        Function0<Unit> function062 = function03;
                        if (((57344 & i5) ^ CpioConstants.C_ISBLK) <= 16384) {
                            z4 = ((i19 & 896) != 256) | ((((57344 & i5) ^ CpioConstants.C_ISBLK) <= 16384 && composerStartRestartGroup.changed(closedFloatingPointRange3)) || (i5 & CpioConstants.C_ISBLK) == 16384);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z4) {
                                objRememberedValue = new RangeSliderState(closedFloatingPointRange6.getStart().floatValue(), closedFloatingPointRange6.getEndInclusive().floatValue(), i16, new Function0<Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$state$1$1
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
                                        Function0<Unit> value = stateRememberUpdatedState.getValue();
                                        if (value != null) {
                                            value.invoke();
                                        }
                                    }
                                }, closedFloatingPointRange3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                RangeSliderState rangeSliderState2 = (RangeSliderState) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(-223507467);
                                if ((i5 & 112) != 32) {
                                }
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!z5) {
                                    objRememberedValue2 = new Function1<SliderRange, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$10$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SliderRange sliderRange) {
                                            m9775invokeIf1S1O4(sliderRange.m9786unboximpl());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-If1S1O4, reason: not valid java name */
                                        public final void m9775invokeIf1S1O4(long j) {
                                            function12.invoke(RangesKt__RangesKt.rangeTo(SliderRange.m9783getStartimpl(j), SliderRange.m9782getEndInclusiveimpl(j)));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    rangeSliderState2.setOnValueChange$material3_release((Function1) objRememberedValue2);
                                    rangeSliderState2.setActiveRangeStart(closedFloatingPointRange6.getStart().floatValue());
                                    rangeSliderState2.setActiveRangeEnd(closedFloatingPointRange6.getEndInclusive().floatValue());
                                    int i202 = (i5 >> 3) & 1008;
                                    int i212 = i5 >> 9;
                                    int i222 = (i212 & 3670016) | i202 | (57344 & i212) | (458752 & i212);
                                    int i232 = i19 << 21;
                                    RangeSlider(rangeSliderState2, modifier3, z22, null, mutableInteractionSource3, mutableInteractionSource5, function342, function35, function36, composerStartRestartGroup, i222 | (29360128 & i232) | (i232 & 234881024), 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    mutableInteractionSource62 = mutableInteractionSource3;
                                    z62 = z22;
                                    function372 = function35;
                                    function382 = function36;
                                    i172 = i16;
                                    sliderColors32 = sliderColors2;
                                    function042 = function062;
                                    mutableInteractionSource72 = mutableInteractionSource5;
                                    closedFloatingPointRange42 = closedFloatingPointRange3;
                                    modifier42 = modifier3;
                                }
                            }
                        } else {
                            z4 = ((i19 & 896) != 256) | ((((57344 & i5) ^ CpioConstants.C_ISBLK) <= 16384 && composerStartRestartGroup.changed(closedFloatingPointRange3)) || (i5 & CpioConstants.C_ISBLK) == 16384);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z4) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i24 & CpioConstants.C_ISBLK) == 0) {
            }
            i7 = i42 & 32;
            if (i7 != 0) {
            }
            if ((i24 & 1572864) == 0) {
            }
            i8 = i42 & 128;
            if (i8 != 0) {
            }
            i9 = i42 & 256;
            if (i9 != 0) {
            }
            i10 = i42 & 512;
            if (i10 != 0) {
            }
            i11 = i42 & 1024;
            if (i11 != 0) {
            }
            i13 = i42 & 2048;
            if (i13 != 0) {
            }
            int i192 = i12;
            i14 = i42 & 4096;
            if (i14 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i6 = i42 & 8;
        if (i6 == 0) {
        }
        if ((i24 & CpioConstants.C_ISBLK) == 0) {
        }
        i7 = i42 & 32;
        if (i7 != 0) {
        }
        if ((i24 & 1572864) == 0) {
        }
        i8 = i42 & 128;
        if (i8 != 0) {
        }
        i9 = i42 & 256;
        if (i9 != 0) {
        }
        i10 = i42 & 512;
        if (i10 != 0) {
        }
        i11 = i42 & 1024;
        if (i11 != 0) {
        }
        i13 = i42 & 2048;
        if (i13 != 0) {
        }
        int i1922 = i12;
        i14 = i42 & 4096;
        if (i14 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$14 */
    /* loaded from: classes4.dex */
    public static final class C158714 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C158714(SliderColors sliderColors, boolean z) {
            super(3);
            sliderColors = sliderColors;
            z = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
            invoke(rangeSliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer, int i) {
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1884205643, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:628)");
                }
                SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$15 */
    /* loaded from: classes4.dex */
    public static final class C158815 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        public final /* synthetic */ SliderColors $colors;
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C158815(SliderColors sliderColors, boolean z) {
            super(3);
            sliderColors = sliderColors;
            z = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
            invoke(rangeSliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer, int i) {
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1016457138, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:635)");
                }
                SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$16 */
    /* loaded from: classes4.dex */
    public static final class C158916 extends Lambda implements Function3<RangeSliderState, Composer, Integer, Unit> {
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C158916(boolean z) {
            super(3);
            z = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer, Integer num) {
            invoke(rangeSliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull RangeSliderState rangeSliderState, @Nullable Composer composer, int i) {
            if ((i & 6) == 0) {
                i |= composer.changed(rangeSliderState) ? 4 : 2;
            }
            if ((i & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1617375262, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:642)");
                }
                SliderDefaults.INSTANCE.Track(rangeSliderState, (Modifier) null, sliderColors, z, composer, (i & 14) | CpioConstants.C_ISBLK, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(@NotNull RangeSliderState rangeSliderState, @Nullable Modifier modifier, boolean z, @Nullable SliderColors sliderColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable MutableInteractionSource mutableInteractionSource2, @Nullable Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, @Nullable Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, @Nullable Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        SliderColors sliderColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        MutableInteractionSource mutableInteractionSource4;
        int i7;
        int i8;
        int i9;
        Modifier modifier2;
        boolean z2;
        SliderColors sliderColorsColors;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource6;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function34;
        int i10;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function35;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        MutableInteractionSource mutableInteractionSource7;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function36;
        Modifier modifier3;
        SliderColors sliderColors3;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function37;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function38;
        boolean z3;
        MutableInteractionSource mutableInteractionSource8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(511405654);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        int i12 = composerStartRestartGroup.changed(sliderColors2) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i3 |= i12;
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        mutableInteractionSource3 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource3) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            mutableInteractionSource4 = mutableInteractionSource2;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource4) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                        }
                        i9 = i2 & 256;
                        if (i9 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function33) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i11 == 0 ? Modifier.INSTANCE : modifier;
                                z2 = i4 == 0 ? true : z;
                                if ((i2 & 8) == 0) {
                                    sliderColorsColors = SliderDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                    i3 &= -7169;
                                } else {
                                    sliderColorsColors = sliderColors2;
                                }
                                if (i5 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-223504269);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource5 = (MutableInteractionSource) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    mutableInteractionSource5 = mutableInteractionSource3;
                                }
                                if (i6 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-223504175);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    mutableInteractionSource6 = (MutableInteractionSource) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    mutableInteractionSource6 = mutableInteractionSource4;
                                }
                                Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3ComposableLambda2 = i7 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1884205643, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.14
                                    public final /* synthetic */ SliderColors $colors;
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C158714(SliderColors sliderColorsColors2, boolean z22) {
                                        super(3);
                                        sliderColors = sliderColorsColors2;
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState2, Composer composer2, Integer num) {
                                        invoke(rangeSliderState2, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull RangeSliderState rangeSliderState2, @Nullable Composer composer2, int i13) {
                                        if ((i13 & 17) != 16 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1884205643, i13, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:628)");
                                            }
                                            SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }) : function3;
                                Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3ComposableLambda3 = i8 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1016457138, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.15
                                    public final /* synthetic */ SliderColors $colors;
                                    public final /* synthetic */ boolean $enabled;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C158815(SliderColors sliderColorsColors2, boolean z22) {
                                        super(3);
                                        sliderColors = sliderColorsColors2;
                                        z = z22;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState2, Composer composer2, Integer num) {
                                        invoke(rangeSliderState2, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull RangeSliderState rangeSliderState2, @Nullable Composer composer2, int i13) {
                                        if ((i13 & 17) != 16 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1016457138, i13, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:635)");
                                            }
                                            SliderDefaults.INSTANCE.m9767Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }) : function32;
                                if (i9 == 0) {
                                    i10 = i3;
                                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1617375262, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.16
                                        public final /* synthetic */ boolean $enabled;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C158916(boolean z22) {
                                            super(3);
                                            z = z22;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState2, Composer composer2, Integer num) {
                                            invoke(rangeSliderState2, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@NotNull RangeSliderState rangeSliderState2, @Nullable Composer composer2, int i13) {
                                            if ((i13 & 6) == 0) {
                                                i13 |= composer2.changed(rangeSliderState2) ? 4 : 2;
                                            }
                                            if ((i13 & 19) != 18 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1617375262, i13, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:642)");
                                                }
                                                SliderDefaults.INSTANCE.Track(rangeSliderState2, (Modifier) null, sliderColors, z, composer2, (i13 & 14) | CpioConstants.C_ISBLK, 2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    });
                                    function34 = function3ComposableLambda3;
                                    function35 = function3ComposableLambda2;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(511405654, i10, -1, "androidx.compose.material3.RangeSlider (Slider.kt:648)");
                                    }
                                    if (rangeSliderState.getSteps() >= 0) {
                                        throw new IllegalArgumentException("steps should be >= 0".toString());
                                    }
                                    int i13 = i10 >> 3;
                                    RangeSliderImpl(modifier2, rangeSliderState, z22, mutableInteractionSource5, mutableInteractionSource6, function35, function34, function3ComposableLambda, composerStartRestartGroup, (i10 & 896) | (i13 & 14) | ((i10 << 3) & 112) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (i13 & 29360128));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    mutableInteractionSource7 = mutableInteractionSource5;
                                    function36 = function34;
                                    modifier3 = modifier2;
                                    sliderColors3 = sliderColorsColors2;
                                    function37 = function35;
                                    MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource6;
                                    function38 = function3ComposableLambda;
                                    z3 = z22;
                                    mutableInteractionSource8 = mutableInteractionSource9;
                                } else {
                                    function34 = function3ComposableLambda3;
                                    i10 = i3;
                                    function35 = function3ComposableLambda2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                modifier2 = modifier;
                                z22 = z;
                                function35 = function3;
                                function34 = function32;
                                i10 = i3;
                                sliderColorsColors2 = sliderColors2;
                                mutableInteractionSource5 = mutableInteractionSource3;
                                mutableInteractionSource6 = mutableInteractionSource4;
                            }
                            function3ComposableLambda = function33;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (rangeSliderState.getSteps() >= 0) {
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z;
                            function37 = function3;
                            function38 = function33;
                            sliderColors3 = sliderColors2;
                            mutableInteractionSource7 = mutableInteractionSource3;
                            mutableInteractionSource8 = mutableInteractionSource4;
                            function36 = function32;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.18
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ SliderColors $colors;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ MutableInteractionSource $endInteractionSource;
                                public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $endThumb;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ MutableInteractionSource $startInteractionSource;
                                public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $startThumb;
                                public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $track;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C159018(Modifier modifier32, boolean z32, SliderColors sliderColors32, MutableInteractionSource mutableInteractionSource72, MutableInteractionSource mutableInteractionSource82, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function372, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function362, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function382, int i14, int i22) {
                                    super(2);
                                    modifier = modifier32;
                                    z = z32;
                                    sliderColors = sliderColors32;
                                    mutableInteractionSource = mutableInteractionSource72;
                                    mutableInteractionSource = mutableInteractionSource82;
                                    function3 = function372;
                                    function3 = function362;
                                    function3 = function382;
                                    i = i14;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i14) {
                                    SliderKt.RangeSlider(rangeSliderState, modifier, z, sliderColors, mutableInteractionSource, mutableInteractionSource, function3, function3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    i7 = i22 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i22 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i22 & 256;
                    if (i9 != 0) {
                    }
                    if ((i3 & 38347923) != 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i14 & 1) != 0) {
                            if (i11 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if ((i22 & 8) == 0) {
                            }
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
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                mutableInteractionSource3 = mutableInteractionSource;
                i6 = i22 & 32;
                if (i6 != 0) {
                }
                mutableInteractionSource4 = mutableInteractionSource2;
                i7 = i22 & 64;
                if (i7 != 0) {
                }
                i8 = i22 & 128;
                if (i8 != 0) {
                }
                i9 = i22 & 256;
                if (i9 != 0) {
                }
                if ((i3 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i14 & 3072) == 0) {
            }
            i5 = i22 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource3 = mutableInteractionSource;
            i6 = i22 & 32;
            if (i6 != 0) {
            }
            mutableInteractionSource4 = mutableInteractionSource2;
            i7 = i22 & 64;
            if (i7 != 0) {
            }
            i8 = i22 & 128;
            if (i8 != 0) {
            }
            i9 = i22 & 256;
            if (i9 != 0) {
            }
            if ((i3 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        if ((i14 & 3072) == 0) {
        }
        i5 = i22 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource3 = mutableInteractionSource;
        i6 = i22 & 32;
        if (i6 != 0) {
        }
        mutableInteractionSource4 = mutableInteractionSource2;
        i7 = i22 & 64;
        if (i7 != 0) {
        }
        i8 = i22 & 128;
        if (i8 != 0) {
        }
        i9 = i22 & 256;
        if (i9 != 0) {
        }
        if ((i3 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SliderImpl(Modifier modifier, final SliderState sliderState, boolean z, MutableInteractionSource mutableInteractionSource, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1390990089);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(sliderState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1390990089, i3, -1, "androidx.compose.material3.SliderImpl (Slider.kt:672)");
            }
            sliderState.setRtl$material3_release(composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierSliderTapModifier = sliderTapModifier(companion, sliderState, mutableInteractionSource, z);
            Orientation orientation = Orientation.Horizontal;
            boolean isRtl = sliderState.getIsRtl();
            boolean zIsDragging$material3_release = sliderState.isDragging$material3_release();
            composerStartRestartGroup.startReplaceableGroup(1114013383);
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SliderKt$SliderImpl$drag$1$1(sliderState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierDraggable = DraggableKt.draggable(companion, sliderState, orientation, (TsExtractor.TS_PACKET_SIZE & 4) != 0 ? true : z, (TsExtractor.TS_PACKET_SIZE & 8) != 0 ? null : mutableInteractionSource, (TsExtractor.TS_PACKET_SIZE & 16) != 0 ? false : zIsDragging$material3_release, (TsExtractor.TS_PACKET_SIZE & 32) != 0 ? new DraggableKt.C04701(null) : null, (TsExtractor.TS_PACKET_SIZE & 64) != 0 ? new DraggableKt.C04712(null) : (Function3) objRememberedValue, (TsExtractor.TS_PACKET_SIZE & 128) != 0 ? false : isRtl);
            Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            SliderTokens sliderTokens = SliderTokens.INSTANCE;
            Modifier modifierThen = FocusableKt.focusable(sliderSemantics(SizeKt.m8168requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize, sliderTokens.m10688getHandleWidthD9Ej5fM(), sliderTokens.m10687getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), sliderState, z), z, mutableInteractionSource).then(modifierSliderTapModifier).then(modifierDraggable);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(1114014176);
            boolean z3 = i4 == 32;
            Object objRememberedValue2 = composer2.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1
                    @Override // androidx.compose.p003ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            Measurable measurable = list.get(i5);
                            if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                                final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(j);
                                int size2 = list.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    Measurable measurable2 = list.get(i6);
                                    if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                                        final Placeable placeableMo12610measureBRTryo02 = measurable2.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(ConstraintsKt.m13639offsetNN6EwU$default(j, -placeableMo12610measureBRTryo0.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                                        int width = placeableMo12610measureBRTryo0.getWidth() + placeableMo12610measureBRTryo02.getWidth();
                                        int iMax = Math.max(placeableMo12610measureBRTryo02.getHeight(), placeableMo12610measureBRTryo0.getHeight());
                                        sliderState.updateDimensions$material3_release(placeableMo12610measureBRTryo0.getWidth(), width);
                                        final int width2 = placeableMo12610measureBRTryo0.getWidth() / 2;
                                        final int iRoundToInt = MathKt__MathJVMKt.roundToInt(placeableMo12610measureBRTryo02.getWidth() * sliderState.getCoercedValueAsFraction$material3_release());
                                        final int height = (iMax - placeableMo12610measureBRTryo02.getHeight()) / 2;
                                        final int height2 = (iMax - placeableMo12610measureBRTryo0.getHeight()) / 2;
                                        return MeasureScope.layout$default(measureScope, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1.1
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
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo02, width2, height, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, iRoundToInt, height2, 0.0f, 4, null);
                                            }
                                        }, 4, null);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, SliderComponents.THUMB);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i5 = (i3 >> 3) & 14;
            function3.invoke(sliderState, composer2, Integer.valueOf(((i3 >> 9) & 112) | i5));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, SliderComponents.TRACK);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierLayoutId2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            function32.invoke(sliderState, composer2, Integer.valueOf(i5 | ((i3 >> 12) & 112)));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.SliderImpl.3
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ boolean $enabled;
                public final /* synthetic */ MutableInteractionSource $interactionSource;
                public final /* synthetic */ SliderState $state;
                public final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $thumb;
                public final /* synthetic */ Function3<SliderState, Composer, Integer, Unit> $track;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16093(final SliderState sliderState2, boolean z4, MutableInteractionSource mutableInteractionSource2, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function33, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function322, int i6) {
                    super(2);
                    sliderState = sliderState2;
                    z = z4;
                    mutableInteractionSource = mutableInteractionSource2;
                    function3 = function33;
                    function3 = function322;
                    i = i6;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i6) {
                    SliderKt.SliderImpl(modifier, sliderState, z, mutableInteractionSource, function3, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void RangeSliderImpl(Modifier modifier, final RangeSliderState rangeSliderState, boolean z, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1411725677);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(rangeSliderState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function32) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function33) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1411725677, i2, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:762)");
            }
            rangeSliderState.setRtl$material3_release(composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierRangeSliderPressDragModifier = rangeSliderPressDragModifier(companion, rangeSliderState, mutableInteractionSource, mutableInteractionSource2, z);
            Modifier modifierRangeSliderStartThumbSemantics = rangeSliderStartThumbSemantics(companion, rangeSliderState, z);
            Modifier modifierRangeSliderEndThumbSemantics = rangeSliderEndThumbSemantics(companion, rangeSliderState, z);
            Strings.Companion companion2 = Strings.INSTANCE;
            final String strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.range_start), composerStartRestartGroup, 0);
            final String strM9866getStringNWtq282 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.range_end), composerStartRestartGroup, 0);
            Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            SliderTokens sliderTokens = SliderTokens.INSTANCE;
            Modifier modifierThen = SizeKt.m8168requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize, sliderTokens.m10688getHandleWidthD9Ej5fM(), sliderTokens.m10687getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null).then(modifierRangeSliderPressDragModifier);
            composerStartRestartGroup.startReplaceableGroup(1300547382);
            boolean z2 = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1
                    @Override // androidx.compose.p003ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Measurable measurable = list.get(i3);
                            if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                                final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(j);
                                int size2 = list.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    Measurable measurable2 = list.get(i4);
                                    if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                        final Placeable placeableMo12610measureBRTryo02 = measurable2.mo12610measureBRTryo0(j);
                                        int size3 = list.size();
                                        for (int i5 = 0; i5 < size3; i5++) {
                                            Measurable measurable3 = list.get(i5);
                                            if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                                final Placeable placeableMo12610measureBRTryo03 = measurable3.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(ConstraintsKt.m13639offsetNN6EwU$default(j, (-(placeableMo12610measureBRTryo0.getWidth() + placeableMo12610measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                                int width = placeableMo12610measureBRTryo03.getWidth() + ((placeableMo12610measureBRTryo0.getWidth() + placeableMo12610measureBRTryo02.getWidth()) / 2);
                                                int iMax = Math.max(placeableMo12610measureBRTryo03.getHeight(), Math.max(placeableMo12610measureBRTryo0.getHeight(), placeableMo12610measureBRTryo02.getHeight()));
                                                rangeSliderState.setStartThumbWidth$material3_release(placeableMo12610measureBRTryo0.getWidth());
                                                rangeSliderState.setEndThumbWidth$material3_release(placeableMo12610measureBRTryo02.getWidth());
                                                rangeSliderState.setTotalWidth$material3_release(width);
                                                rangeSliderState.updateMinMaxPx$material3_release();
                                                final int width2 = placeableMo12610measureBRTryo0.getWidth() / 2;
                                                final int iRoundToInt = MathKt__MathJVMKt.roundToInt(placeableMo12610measureBRTryo03.getWidth() * rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release());
                                                final int iRoundToInt2 = MathKt__MathJVMKt.roundToInt((placeableMo12610measureBRTryo03.getWidth() * rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release()) + ((placeableMo12610measureBRTryo0.getWidth() - placeableMo12610measureBRTryo02.getWidth()) / 2));
                                                final int height = (iMax - placeableMo12610measureBRTryo03.getHeight()) / 2;
                                                final int height2 = (iMax - placeableMo12610measureBRTryo0.getHeight()) / 2;
                                                final int height3 = (iMax - placeableMo12610measureBRTryo02.getHeight()) / 2;
                                                return MeasureScope.layout$default(measureScope, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1.1
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
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo03, width2, height, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, iRoundToInt, height2, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo02, iRoundToInt2, height3, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, RangeSliderComponents.STARTTHUMB);
            composerStartRestartGroup.startReplaceableGroup(-2040261114);
            boolean zChanged = composerStartRestartGroup.changed(strM9866getStringNWtq28);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$1$1
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
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen2 = FocusableKt.focusable(SemanticsModifierKt.semantics(modifierLayoutId, true, (Function1) objRememberedValue2), z, mutableInteractionSource).then(modifierRangeSliderStartThumbSemantics);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = (i2 >> 3) & 14;
            function3.invoke(rangeSliderState, composerStartRestartGroup, Integer.valueOf(((i2 >> 12) & 112) | i3));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, RangeSliderComponents.ENDTHUMB);
            composerStartRestartGroup.startReplaceableGroup(-2040260744);
            boolean zChanged2 = composerStartRestartGroup.changed(strM9866getStringNWtq282);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$3$1
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
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9866getStringNWtq282);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen3 = FocusableKt.focusable(SemanticsModifierKt.semantics(modifierLayoutId2, true, (Function1) objRememberedValue3), z, mutableInteractionSource2).then(modifierRangeSliderEndThumbSemantics);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierThen3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function32.invoke(rangeSliderState, composerStartRestartGroup, Integer.valueOf(((i2 >> 15) & 112) | i3));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLayoutId3 = LayoutIdKt.layoutId(companion, RangeSliderComponents.TRACK);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierLayoutId3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function33.invoke(rangeSliderState, composerStartRestartGroup, Integer.valueOf(((i2 >> 18) & 112) | i3));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSliderImpl.3
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ boolean $enabled;
                public final /* synthetic */ MutableInteractionSource $endInteractionSource;
                public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $endThumb;
                public final /* synthetic */ MutableInteractionSource $startInteractionSource;
                public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $startThumb;
                public final /* synthetic */ RangeSliderState $state;
                public final /* synthetic */ Function3<RangeSliderState, Composer, Integer, Unit> $track;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C15983(final RangeSliderState rangeSliderState2, boolean z3, MutableInteractionSource mutableInteractionSource3, MutableInteractionSource mutableInteractionSource22, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function34, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function322, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function332, int i4) {
                    super(2);
                    rangeSliderState = rangeSliderState2;
                    z = z3;
                    mutableInteractionSource = mutableInteractionSource3;
                    mutableInteractionSource = mutableInteractionSource22;
                    function3 = function34;
                    function3 = function322;
                    function3 = function332;
                    i = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    SliderKt.RangeSliderImpl(modifier, rangeSliderState, z, mutableInteractionSource, mutableInteractionSource, function3, function3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0014  */
    /* renamed from: awaitSlop-8vUncbI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9771awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Continuation<? super Pair<PointerInputChange, Float>> continuation) throws Throwable {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        Ref.FloatRef floatRef;
        if (continuation instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) continuation;
            int i2 = sliderKt$awaitSlop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.label = i2 - Integer.MIN_VALUE;
            } else {
                sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(continuation);
            }
        }
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$12 = sliderKt$awaitSlop$1;
        Object obj = sliderKt$awaitSlop$12.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = sliderKt$awaitSlop$12.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Float f) {
                    invoke(pointerInputChange, f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull PointerInputChange pointerInputChange, float f) {
                    pointerInputChange.consume();
                    floatRef2.element = f;
                }
            };
            sliderKt$awaitSlop$12.L$0 = floatRef2;
            sliderKt$awaitSlop$12.label = 1;
            Object objM9426awaitHorizontalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorCopyKt.m9426awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, function2, sliderKt$awaitSlop$12);
            if (objM9426awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM9426awaitHorizontalPointerSlopOrCancellationgDDlDlE;
            floatRef = floatRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) sliderKt$awaitSlop$12.L$0;
            ResultKt.throwOnFailure(obj);
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null) {
            return TuplesKt.m7112to(pointerInputChange, Boxing.boxFloat(floatRef.element));
        }
        return null;
    }

    public static final float[] stepsToTickFractions(int i) {
        if (i == 0) {
            return new float[0];
        }
        int i2 = i + 2;
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = i3 / (i + 1);
        }
        return fArr;
    }

    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* renamed from: scale-ziovWd0 */
    public static final long m9774scaleziovWd0(float f, float f2, long j, float f3, float f4) {
        return SliderRange(scale(f, f2, SliderRange.m9783getStartimpl(j), f3, f4), scale(f, f2, SliderRange.m9782getEndInclusiveimpl(j), f3, f4));
    }

    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return RangesKt___RangesKt.coerceIn(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    /* compiled from: Slider.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$sliderSemantics$1 */
    /* loaded from: classes4.dex */
    public static final class C16141 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ SliderState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16141(boolean z, SliderState sliderState) {
            super(1);
            z = z;
            sliderState = sliderState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* compiled from: Slider.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.material3.SliderKt$sliderSemantics$1$1 */
        public static final class AnonymousClass1 extends Lambda implements Function1<Float, Boolean> {
            public AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                return invoke(f.floatValue());
            }

            @NotNull
            public final Boolean invoke(float f) {
                int steps;
                float fCoerceIn = RangesKt___RangesKt.coerceIn(f, sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue());
                boolean z = false;
                if (sliderState.getSteps() > 0 && (steps = sliderState.getSteps() + 1) >= 0) {
                    float fAbs = fCoerceIn;
                    float f2 = fAbs;
                    int i = 0;
                    while (true) {
                        float fLerp = MathHelpersKt.lerp(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue(), i / (sliderState.getSteps() + 1));
                        float f3 = fLerp - fCoerceIn;
                        if (Math.abs(f3) <= fAbs) {
                            fAbs = Math.abs(f3);
                            f2 = fLerp;
                        }
                        if (i == steps) {
                            break;
                        }
                        i++;
                    }
                    fCoerceIn = f2;
                }
                if (fCoerceIn != sliderState.getValue()) {
                    if (fCoerceIn != sliderState.getValue()) {
                        if (sliderState.getOnValueChange$material3_release() != null) {
                            Function1<Float, Unit> onValueChange$material3_release = sliderState.getOnValueChange$material3_release();
                            if (onValueChange$material3_release != null) {
                                onValueChange$material3_release.invoke(Float.valueOf(fCoerceIn));
                            }
                        } else {
                            sliderState.setValue(fCoerceIn);
                        }
                    }
                    Function0<Unit> onValueChangeFinished = sliderState.getOnValueChangeFinished();
                    if (onValueChangeFinished != null) {
                        onValueChangeFinished.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            if (!z) {
                SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
            }
            SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1.1
                public AnonymousClass1() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                    return invoke(f.floatValue());
                }

                @NotNull
                public final Boolean invoke(float f) {
                    int steps;
                    float fCoerceIn = RangesKt___RangesKt.coerceIn(f, sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue());
                    boolean z = false;
                    if (sliderState.getSteps() > 0 && (steps = sliderState.getSteps() + 1) >= 0) {
                        float fAbs = fCoerceIn;
                        float f2 = fAbs;
                        int i = 0;
                        while (true) {
                            float fLerp = MathHelpersKt.lerp(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue(), i / (sliderState.getSteps() + 1));
                            float f3 = fLerp - fCoerceIn;
                            if (Math.abs(f3) <= fAbs) {
                                fAbs = Math.abs(f3);
                                f2 = fLerp;
                            }
                            if (i == steps) {
                                break;
                            }
                            i++;
                        }
                        fCoerceIn = f2;
                    }
                    if (fCoerceIn != sliderState.getValue()) {
                        if (fCoerceIn != sliderState.getValue()) {
                            if (sliderState.getOnValueChange$material3_release() != null) {
                                Function1<Float, Unit> onValueChange$material3_release = sliderState.getOnValueChange$material3_release();
                                if (onValueChange$material3_release != null) {
                                    onValueChange$material3_release.invoke(Float.valueOf(fCoerceIn));
                                }
                            } else {
                                sliderState.setValue(fCoerceIn);
                            }
                        }
                        Function0<Unit> onValueChangeFinished = sliderState.getOnValueChangeFinished();
                        if (onValueChangeFinished != null) {
                            onValueChangeFinished.invoke();
                        }
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }, 1, null);
        }
    }

    private static final Modifier sliderSemantics(Modifier modifier, SliderState sliderState, boolean z) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1
            public final /* synthetic */ boolean $enabled;
            public final /* synthetic */ SliderState $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16141(boolean z2, SliderState sliderState2) {
                super(1);
                z = z2;
                sliderState = sliderState2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* compiled from: Slider.kt */
            @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* renamed from: androidx.compose.material3.SliderKt$sliderSemantics$1$1 */
            public static final class AnonymousClass1 extends Lambda implements Function1<Float, Boolean> {
                public AnonymousClass1() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                    return invoke(f.floatValue());
                }

                @NotNull
                public final Boolean invoke(float f) {
                    int steps;
                    float fCoerceIn = RangesKt___RangesKt.coerceIn(f, sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue());
                    boolean z = false;
                    if (sliderState.getSteps() > 0 && (steps = sliderState.getSteps() + 1) >= 0) {
                        float fAbs = fCoerceIn;
                        float f2 = fAbs;
                        int i = 0;
                        while (true) {
                            float fLerp = MathHelpersKt.lerp(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue(), i / (sliderState.getSteps() + 1));
                            float f3 = fLerp - fCoerceIn;
                            if (Math.abs(f3) <= fAbs) {
                                fAbs = Math.abs(f3);
                                f2 = fLerp;
                            }
                            if (i == steps) {
                                break;
                            }
                            i++;
                        }
                        fCoerceIn = f2;
                    }
                    if (fCoerceIn != sliderState.getValue()) {
                        if (fCoerceIn != sliderState.getValue()) {
                            if (sliderState.getOnValueChange$material3_release() != null) {
                                Function1<Float, Unit> onValueChange$material3_release = sliderState.getOnValueChange$material3_release();
                                if (onValueChange$material3_release != null) {
                                    onValueChange$material3_release.invoke(Float.valueOf(fCoerceIn));
                                }
                            } else {
                                sliderState.setValue(fCoerceIn);
                            }
                        }
                        Function0<Unit> onValueChangeFinished = sliderState.getOnValueChangeFinished();
                        if (onValueChangeFinished != null) {
                            onValueChangeFinished.invoke();
                        }
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1.1
                    public AnonymousClass1() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                        return invoke(f.floatValue());
                    }

                    @NotNull
                    public final Boolean invoke(float f) {
                        int steps;
                        float fCoerceIn = RangesKt___RangesKt.coerceIn(f, sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue());
                        boolean z2 = false;
                        if (sliderState.getSteps() > 0 && (steps = sliderState.getSteps() + 1) >= 0) {
                            float fAbs = fCoerceIn;
                            float f2 = fAbs;
                            int i = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue(), i / (sliderState.getSteps() + 1));
                                float f3 = fLerp - fCoerceIn;
                                if (Math.abs(f3) <= fAbs) {
                                    fAbs = Math.abs(f3);
                                    f2 = fLerp;
                                }
                                if (i == steps) {
                                    break;
                                }
                                i++;
                            }
                            fCoerceIn = f2;
                        }
                        if (fCoerceIn != sliderState.getValue()) {
                            if (fCoerceIn != sliderState.getValue()) {
                                if (sliderState.getOnValueChange$material3_release() != null) {
                                    Function1<Float, Unit> onValueChange$material3_release = sliderState.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(Float.valueOf(fCoerceIn));
                                    }
                                } else {
                                    sliderState.setValue(fCoerceIn);
                                }
                            }
                            Function0<Unit> onValueChangeFinished = sliderState.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }, 1, null), sliderState2.getValue(), RangesKt__RangesKt.rangeTo(sliderState2.getValueRange().getStart().floatValue(), sliderState2.getValueRange().getEndInclusive().floatValue()), sliderState2.getSteps());
    }

    private static final Modifier rangeSliderStartThumbSemantics(Modifier modifier, RangeSliderState rangeSliderState, boolean z) {
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt__RangesKt.rangeTo(rangeSliderState.getValueRange().getStart().floatValue(), rangeSliderState.getActiveRangeEnd());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt.rangeSliderStartThumbSemantics.1
            public final /* synthetic */ boolean $enabled;
            public final /* synthetic */ RangeSliderState $state;
            public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16131(boolean z2, ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2, RangeSliderState rangeSliderState2) {
                super(1);
                z = z2;
                closedFloatingPointRange = closedFloatingPointRangeRangeTo2;
                rangeSliderState = rangeSliderState2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* compiled from: Slider.kt */
            @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$rangeSliderStartThumbSemantics$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n1#2:2152\n*E\n"})
            /* renamed from: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1$1 */
            public static final class AnonymousClass1 extends Lambda implements Function1<Float, Boolean> {
                public final /* synthetic */ RangeSliderState $state;
                public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState) {
                    super(1);
                    closedFloatingPointRange = closedFloatingPointRange;
                    rangeSliderState = rangeSliderState;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                    return invoke(f.floatValue());
                }

                @NotNull
                public final Boolean invoke(float f) {
                    int startSteps$material3_release;
                    float fCoerceIn = RangesKt___RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                    boolean z = false;
                    if (rangeSliderState.getStartSteps$material3_release() > 0 && (startSteps$material3_release = rangeSliderState.getStartSteps$material3_release() + 1) >= 0) {
                        float fAbs = fCoerceIn;
                        float f2 = fAbs;
                        int i = 0;
                        while (true) {
                            float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i / (rangeSliderState.getStartSteps$material3_release() + 1));
                            float f3 = fLerp - fCoerceIn;
                            if (Math.abs(f3) <= fAbs) {
                                fAbs = Math.abs(f3);
                                f2 = fLerp;
                            }
                            if (i == startSteps$material3_release) {
                                break;
                            }
                            i++;
                        }
                        fCoerceIn = f2;
                    }
                    if (fCoerceIn != rangeSliderState.getActiveRangeStart()) {
                        long jSliderRange = SliderKt.SliderRange(fCoerceIn, rangeSliderState.getActiveRangeEnd());
                        if (!SliderRange.m9781equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                            if (rangeSliderState.getOnValueChange$material3_release() != null) {
                                Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                                if (onValueChange$material3_release != null) {
                                    onValueChange$material3_release.invoke(SliderRange.m9778boximpl(jSliderRange));
                                }
                            } else {
                                rangeSliderState.setActiveRangeStart(SliderRange.m9783getStartimpl(jSliderRange));
                                rangeSliderState.setActiveRangeEnd(SliderRange.m9782getEndInclusiveimpl(jSliderRange));
                            }
                        }
                        Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                        if (onValueChangeFinished != null) {
                            onValueChangeFinished.invoke();
                        }
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.rangeSliderStartThumbSemantics.1.1
                    public final /* synthetic */ RangeSliderState $state;
                    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                        super(1);
                        closedFloatingPointRange = closedFloatingPointRange;
                        rangeSliderState = rangeSliderState2;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                        return invoke(f.floatValue());
                    }

                    @NotNull
                    public final Boolean invoke(float f) {
                        int startSteps$material3_release;
                        float fCoerceIn = RangesKt___RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                        boolean z2 = false;
                        if (rangeSliderState.getStartSteps$material3_release() > 0 && (startSteps$material3_release = rangeSliderState.getStartSteps$material3_release() + 1) >= 0) {
                            float fAbs = fCoerceIn;
                            float f2 = fAbs;
                            int i = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i / (rangeSliderState.getStartSteps$material3_release() + 1));
                                float f3 = fLerp - fCoerceIn;
                                if (Math.abs(f3) <= fAbs) {
                                    fAbs = Math.abs(f3);
                                    f2 = fLerp;
                                }
                                if (i == startSteps$material3_release) {
                                    break;
                                }
                                i++;
                            }
                            fCoerceIn = f2;
                        }
                        if (fCoerceIn != rangeSliderState.getActiveRangeStart()) {
                            long jSliderRange = SliderKt.SliderRange(fCoerceIn, rangeSliderState.getActiveRangeEnd());
                            if (!SliderRange.m9781equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                                if (rangeSliderState.getOnValueChange$material3_release() != null) {
                                    Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(SliderRange.m9778boximpl(jSliderRange));
                                    }
                                } else {
                                    rangeSliderState.setActiveRangeStart(SliderRange.m9783getStartimpl(jSliderRange));
                                    rangeSliderState.setActiveRangeEnd(SliderRange.m9782getEndInclusiveimpl(jSliderRange));
                                }
                            }
                            Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }, 1, null), rangeSliderState2.getActiveRangeStart(), closedFloatingPointRangeRangeTo2, rangeSliderState2.getStartSteps$material3_release());
    }

    /* compiled from: Slider.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1 */
    /* loaded from: classes4.dex */
    public static final class C16131 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ RangeSliderState $state;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16131(boolean z2, ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2, RangeSliderState rangeSliderState2) {
            super(1);
            z = z2;
            closedFloatingPointRange = closedFloatingPointRangeRangeTo2;
            rangeSliderState = rangeSliderState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* compiled from: Slider.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$rangeSliderStartThumbSemantics$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n1#2:2152\n*E\n"})
        /* renamed from: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1$1 */
        public static final class AnonymousClass1 extends Lambda implements Function1<Float, Boolean> {
            public final /* synthetic */ RangeSliderState $state;
            public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                super(1);
                closedFloatingPointRange = closedFloatingPointRange;
                rangeSliderState = rangeSliderState2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                return invoke(f.floatValue());
            }

            @NotNull
            public final Boolean invoke(float f) {
                int startSteps$material3_release;
                float fCoerceIn = RangesKt___RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                boolean z2 = false;
                if (rangeSliderState.getStartSteps$material3_release() > 0 && (startSteps$material3_release = rangeSliderState.getStartSteps$material3_release() + 1) >= 0) {
                    float fAbs = fCoerceIn;
                    float f2 = fAbs;
                    int i = 0;
                    while (true) {
                        float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i / (rangeSliderState.getStartSteps$material3_release() + 1));
                        float f3 = fLerp - fCoerceIn;
                        if (Math.abs(f3) <= fAbs) {
                            fAbs = Math.abs(f3);
                            f2 = fLerp;
                        }
                        if (i == startSteps$material3_release) {
                            break;
                        }
                        i++;
                    }
                    fCoerceIn = f2;
                }
                if (fCoerceIn != rangeSliderState.getActiveRangeStart()) {
                    long jSliderRange = SliderKt.SliderRange(fCoerceIn, rangeSliderState.getActiveRangeEnd());
                    if (!SliderRange.m9781equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                        if (rangeSliderState.getOnValueChange$material3_release() != null) {
                            Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                            if (onValueChange$material3_release != null) {
                                onValueChange$material3_release.invoke(SliderRange.m9778boximpl(jSliderRange));
                            }
                        } else {
                            rangeSliderState.setActiveRangeStart(SliderRange.m9783getStartimpl(jSliderRange));
                            rangeSliderState.setActiveRangeEnd(SliderRange.m9782getEndInclusiveimpl(jSliderRange));
                        }
                    }
                    Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                    if (onValueChangeFinished != null) {
                        onValueChangeFinished.invoke();
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            if (!z) {
                SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
            }
            SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.rangeSliderStartThumbSemantics.1.1
                public final /* synthetic */ RangeSliderState $state;
                public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                    super(1);
                    closedFloatingPointRange = closedFloatingPointRange;
                    rangeSliderState = rangeSliderState2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                    return invoke(f.floatValue());
                }

                @NotNull
                public final Boolean invoke(float f) {
                    int startSteps$material3_release;
                    float fCoerceIn = RangesKt___RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                    boolean z2 = false;
                    if (rangeSliderState.getStartSteps$material3_release() > 0 && (startSteps$material3_release = rangeSliderState.getStartSteps$material3_release() + 1) >= 0) {
                        float fAbs = fCoerceIn;
                        float f2 = fAbs;
                        int i = 0;
                        while (true) {
                            float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i / (rangeSliderState.getStartSteps$material3_release() + 1));
                            float f3 = fLerp - fCoerceIn;
                            if (Math.abs(f3) <= fAbs) {
                                fAbs = Math.abs(f3);
                                f2 = fLerp;
                            }
                            if (i == startSteps$material3_release) {
                                break;
                            }
                            i++;
                        }
                        fCoerceIn = f2;
                    }
                    if (fCoerceIn != rangeSliderState.getActiveRangeStart()) {
                        long jSliderRange = SliderKt.SliderRange(fCoerceIn, rangeSliderState.getActiveRangeEnd());
                        if (!SliderRange.m9781equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                            if (rangeSliderState.getOnValueChange$material3_release() != null) {
                                Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                                if (onValueChange$material3_release != null) {
                                    onValueChange$material3_release.invoke(SliderRange.m9778boximpl(jSliderRange));
                                }
                            } else {
                                rangeSliderState.setActiveRangeStart(SliderRange.m9783getStartimpl(jSliderRange));
                                rangeSliderState.setActiveRangeEnd(SliderRange.m9782getEndInclusiveimpl(jSliderRange));
                            }
                        }
                        Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                        if (onValueChangeFinished != null) {
                            onValueChangeFinished.invoke();
                        }
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
            }, 1, null);
        }
    }

    private static final Modifier rangeSliderEndThumbSemantics(Modifier modifier, RangeSliderState rangeSliderState, boolean z) {
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt__RangesKt.rangeTo(rangeSliderState.getActiveRangeStart(), rangeSliderState.getValueRange().getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt.rangeSliderEndThumbSemantics.1
            public final /* synthetic */ boolean $enabled;
            public final /* synthetic */ RangeSliderState $state;
            public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16101(boolean z2, ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2, RangeSliderState rangeSliderState2) {
                super(1);
                z = z2;
                closedFloatingPointRange = closedFloatingPointRangeRangeTo2;
                rangeSliderState = rangeSliderState2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.rangeSliderEndThumbSemantics.1.1
                    public final /* synthetic */ RangeSliderState $state;
                    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                        super(1);
                        closedFloatingPointRange = closedFloatingPointRange;
                        rangeSliderState = rangeSliderState2;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                        return invoke(f.floatValue());
                    }

                    @NotNull
                    public final Boolean invoke(float f) {
                        int endSteps$material3_release;
                        float fCoerceIn = RangesKt___RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                        boolean z2 = false;
                        if (rangeSliderState.getEndSteps$material3_release() > 0 && (endSteps$material3_release = rangeSliderState.getEndSteps$material3_release() + 1) >= 0) {
                            float fAbs = fCoerceIn;
                            float f2 = fAbs;
                            int i = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i / (rangeSliderState.getEndSteps$material3_release() + 1));
                                float f3 = fLerp - fCoerceIn;
                                if (Math.abs(f3) <= fAbs) {
                                    fAbs = Math.abs(f3);
                                    f2 = fLerp;
                                }
                                if (i == endSteps$material3_release) {
                                    break;
                                }
                                i++;
                            }
                            fCoerceIn = f2;
                        }
                        if (fCoerceIn != rangeSliderState.getActiveRangeEnd()) {
                            long jSliderRange = SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), fCoerceIn);
                            if (!SliderRange.m9781equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                                if (rangeSliderState.getOnValueChange$material3_release() != null) {
                                    Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(SliderRange.m9778boximpl(jSliderRange));
                                    }
                                } else {
                                    rangeSliderState.setActiveRangeStart(SliderRange.m9783getStartimpl(jSliderRange));
                                    rangeSliderState.setActiveRangeEnd(SliderRange.m9782getEndInclusiveimpl(jSliderRange));
                                }
                            }
                            Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }

            /* compiled from: Slider.kt */
            @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$rangeSliderEndThumbSemantics$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n1#2:2152\n*E\n"})
            /* renamed from: androidx.compose.material3.SliderKt$rangeSliderEndThumbSemantics$1$1 */
            public static final class AnonymousClass1 extends Lambda implements Function1<Float, Boolean> {
                public final /* synthetic */ RangeSliderState $state;
                public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                    super(1);
                    closedFloatingPointRange = closedFloatingPointRange;
                    rangeSliderState = rangeSliderState2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                    return invoke(f.floatValue());
                }

                @NotNull
                public final Boolean invoke(float f) {
                    int endSteps$material3_release;
                    float fCoerceIn = RangesKt___RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                    boolean z2 = false;
                    if (rangeSliderState.getEndSteps$material3_release() > 0 && (endSteps$material3_release = rangeSliderState.getEndSteps$material3_release() + 1) >= 0) {
                        float fAbs = fCoerceIn;
                        float f2 = fAbs;
                        int i = 0;
                        while (true) {
                            float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i / (rangeSliderState.getEndSteps$material3_release() + 1));
                            float f3 = fLerp - fCoerceIn;
                            if (Math.abs(f3) <= fAbs) {
                                fAbs = Math.abs(f3);
                                f2 = fLerp;
                            }
                            if (i == endSteps$material3_release) {
                                break;
                            }
                            i++;
                        }
                        fCoerceIn = f2;
                    }
                    if (fCoerceIn != rangeSliderState.getActiveRangeEnd()) {
                        long jSliderRange = SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), fCoerceIn);
                        if (!SliderRange.m9781equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                            if (rangeSliderState.getOnValueChange$material3_release() != null) {
                                Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                                if (onValueChange$material3_release != null) {
                                    onValueChange$material3_release.invoke(SliderRange.m9778boximpl(jSliderRange));
                                }
                            } else {
                                rangeSliderState.setActiveRangeStart(SliderRange.m9783getStartimpl(jSliderRange));
                                rangeSliderState.setActiveRangeEnd(SliderRange.m9782getEndInclusiveimpl(jSliderRange));
                            }
                        }
                        Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                        if (onValueChangeFinished != null) {
                            onValueChangeFinished.invoke();
                        }
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
            }
        }, 1, null), rangeSliderState2.getActiveRangeEnd(), closedFloatingPointRangeRangeTo2, rangeSliderState2.getEndSteps$material3_release());
    }

    /* compiled from: Slider.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderEndThumbSemantics$1 */
    /* loaded from: classes4.dex */
    public static final class C16101 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ RangeSliderState $state;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16101(boolean z2, ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2, RangeSliderState rangeSliderState2) {
            super(1);
            z = z2;
            closedFloatingPointRange = closedFloatingPointRangeRangeTo2;
            rangeSliderState = rangeSliderState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            if (!z) {
                SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
            }
            SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.rangeSliderEndThumbSemantics.1.1
                public final /* synthetic */ RangeSliderState $state;
                public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                    super(1);
                    closedFloatingPointRange = closedFloatingPointRange;
                    rangeSliderState = rangeSliderState2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                    return invoke(f.floatValue());
                }

                @NotNull
                public final Boolean invoke(float f) {
                    int endSteps$material3_release;
                    float fCoerceIn = RangesKt___RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                    boolean z2 = false;
                    if (rangeSliderState.getEndSteps$material3_release() > 0 && (endSteps$material3_release = rangeSliderState.getEndSteps$material3_release() + 1) >= 0) {
                        float fAbs = fCoerceIn;
                        float f2 = fAbs;
                        int i = 0;
                        while (true) {
                            float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i / (rangeSliderState.getEndSteps$material3_release() + 1));
                            float f3 = fLerp - fCoerceIn;
                            if (Math.abs(f3) <= fAbs) {
                                fAbs = Math.abs(f3);
                                f2 = fLerp;
                            }
                            if (i == endSteps$material3_release) {
                                break;
                            }
                            i++;
                        }
                        fCoerceIn = f2;
                    }
                    if (fCoerceIn != rangeSliderState.getActiveRangeEnd()) {
                        long jSliderRange = SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), fCoerceIn);
                        if (!SliderRange.m9781equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                            if (rangeSliderState.getOnValueChange$material3_release() != null) {
                                Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                                if (onValueChange$material3_release != null) {
                                    onValueChange$material3_release.invoke(SliderRange.m9778boximpl(jSliderRange));
                                }
                            } else {
                                rangeSliderState.setActiveRangeStart(SliderRange.m9783getStartimpl(jSliderRange));
                                rangeSliderState.setActiveRangeEnd(SliderRange.m9782getEndInclusiveimpl(jSliderRange));
                            }
                        }
                        Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                        if (onValueChangeFinished != null) {
                            onValueChangeFinished.invoke();
                        }
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
            }, 1, null);
        }

        /* compiled from: Slider.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$rangeSliderEndThumbSemantics$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n1#2:2152\n*E\n"})
        /* renamed from: androidx.compose.material3.SliderKt$rangeSliderEndThumbSemantics$1$1 */
        public static final class AnonymousClass1 extends Lambda implements Function1<Float, Boolean> {
            public final /* synthetic */ RangeSliderState $state;
            public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, RangeSliderState rangeSliderState2) {
                super(1);
                closedFloatingPointRange = closedFloatingPointRange;
                rangeSliderState = rangeSliderState2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                return invoke(f.floatValue());
            }

            @NotNull
            public final Boolean invoke(float f) {
                int endSteps$material3_release;
                float fCoerceIn = RangesKt___RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                boolean z2 = false;
                if (rangeSliderState.getEndSteps$material3_release() > 0 && (endSteps$material3_release = rangeSliderState.getEndSteps$material3_release() + 1) >= 0) {
                    float fAbs = fCoerceIn;
                    float f2 = fAbs;
                    int i = 0;
                    while (true) {
                        float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i / (rangeSliderState.getEndSteps$material3_release() + 1));
                        float f3 = fLerp - fCoerceIn;
                        if (Math.abs(f3) <= fAbs) {
                            fAbs = Math.abs(f3);
                            f2 = fLerp;
                        }
                        if (i == endSteps$material3_release) {
                            break;
                        }
                        i++;
                    }
                    fCoerceIn = f2;
                }
                if (fCoerceIn != rangeSliderState.getActiveRangeEnd()) {
                    long jSliderRange = SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), fCoerceIn);
                    if (!SliderRange.m9781equalsimpl0(jSliderRange, SliderKt.SliderRange(rangeSliderState.getActiveRangeStart(), rangeSliderState.getActiveRangeEnd()))) {
                        if (rangeSliderState.getOnValueChange$material3_release() != null) {
                            Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState.getOnValueChange$material3_release();
                            if (onValueChange$material3_release != null) {
                                onValueChange$material3_release.invoke(SliderRange.m9778boximpl(jSliderRange));
                            }
                        } else {
                            rangeSliderState.setActiveRangeStart(SliderRange.m9783getStartimpl(jSliderRange));
                            rangeSliderState.setActiveRangeEnd(SliderRange.m9782getEndInclusiveimpl(jSliderRange));
                        }
                    }
                    Function0<Unit> onValueChangeFinished = rangeSliderState.getOnValueChangeFinished();
                    if (onValueChangeFinished != null) {
                        onValueChangeFinished.invoke();
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.SliderKt$sliderTapModifier$1", m7120f = "Slider.kt", m7121i = {}, m7122l = {1469}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1 */
    public static final class C16151 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SliderState $state;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16151(SliderState sliderState, Continuation<? super C16151> continuation) {
            super(2, continuation);
            this.$state = sliderState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C16151 c16151 = new C16151(this.$state, continuation);
            c16151.L$0 = obj;
            return c16151;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C16151) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Slider.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$2 */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends Lambda implements Function1<Offset, Unit> {
            public AnonymousClass2() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m9777invokek4lQ0M(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M */
            public final void m9777invokek4lQ0M(long j) {
                sliderState.dispatchRawDelta(0.0f);
                sliderState.getGestureEndAction$material3_release().invoke();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, null);
                AnonymousClass2 anonymousClass2 = new Function1<Offset, Unit>() { // from class: androidx.compose.material3.SliderKt.sliderTapModifier.1.2
                    public AnonymousClass2() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        m9777invokek4lQ0M(offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-k-4lQ0M */
                    public final void m9777invokek4lQ0M(long j) {
                        sliderState.dispatchRawDelta(0.0f);
                        sliderState.getGestureEndAction$material3_release().invoke();
                    }
                };
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, anonymousClass2, this, 3, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: Slider.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", m7120f = "Slider.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
            public final /* synthetic */ SliderState $state;
            public /* synthetic */ long J$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SliderState sliderState, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.$state = sliderState;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                return m9776invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
            }

            @Nullable
            /* renamed from: invoke-d-4ec7I */
            public final Object m9776invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j, @Nullable Continuation<? super Unit> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, continuation);
                anonymousClass1.J$0 = j;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$state.m9789onPressk4lQ0M$material3_release(this.J$0);
                return Unit.INSTANCE;
            }
        }
    }

    @Stable
    private static final Modifier sliderTapModifier(Modifier modifier, SliderState sliderState, MutableInteractionSource mutableInteractionSource, boolean z) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, sliderState, mutableInteractionSource, new C16151(sliderState, null)) : modifier;
    }

    /* compiled from: Slider.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", m7120f = "Slider.kt", m7121i = {}, m7122l = {1496}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1 */
    public static final class C16111 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableInteractionSource $endInteractionSource;
        public final /* synthetic */ MutableInteractionSource $startInteractionSource;
        public final /* synthetic */ RangeSliderState $state;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16111(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Continuation<? super C16111> continuation) {
            super(2, continuation);
            this.$state = rangeSliderState;
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C16111 c16111 = new C16111(this.$state, this.$startInteractionSource, this.$endInteractionSource, continuation);
            c16111.L$0 = obj;
            return c16111;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C16111) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$state, new RangeSliderLogic(this.$state, this.$startInteractionSource, this.$endInteractionSource), null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: Slider.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", m7120f = "Slider.kt", m7121i = {}, m7122l = {1497}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PointerInputScope $$this$pointerInput;
            public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            public final /* synthetic */ RangeSliderState $state;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$pointerInput = pointerInputScope;
                this.$state = rangeSliderState;
                this.$rangeSliderLogic = rangeSliderLogic;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$state, this.$rangeSliderLogic, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: Slider.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", m7120f = "Slider.kt", m7121i = {0, 1, 1, 1, 1, 1, 2, 2}, m7122l = {1498, 1509, 1528}, m7123m = "invokeSuspend", m7124n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "event", "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, m7125s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
            /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1 */
            public static final class C118711 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ CoroutineScope $$this$coroutineScope;
                public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                public final /* synthetic */ RangeSliderState $state;
                public /* synthetic */ Object L$0;
                public Object L$1;
                public Object L$2;
                public Object L$3;
                public Object L$4;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C118711(RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, CoroutineScope coroutineScope, Continuation<? super C118711> continuation) {
                    super(2, continuation);
                    this.$state = rangeSliderState;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$$this$coroutineScope = coroutineScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C118711 c118711 = new C118711(this.$state, this.$rangeSliderLogic, this.$$this$coroutineScope, continuation);
                    c118711.L$0 = obj;
                    return c118711;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C118711) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:103:0x00da  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x015f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
                /* JADX WARN: Removed duplicated region for block: B:123:0x016a A[Catch: CancellationException -> 0x0178, TryCatch #0 {CancellationException -> 0x0178, blocks: (B:75:0x001b, B:121:0x0162, B:123:0x016a, B:124:0x0170), top: B:131:0x001b }] */
                /* JADX WARN: Removed duplicated region for block: B:124:0x0170 A[Catch: CancellationException -> 0x0178, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0178, blocks: (B:75:0x001b, B:121:0x0162, B:123:0x016a, B:124:0x0170), top: B:131:0x001b }] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    AwaitPointerEventScope awaitPointerEventScope;
                    PointerInputChange pointerInputChange;
                    DragInteraction.Start start;
                    Ref.FloatRef floatRef;
                    final Ref.BooleanRef booleanRef;
                    Pair pair;
                    Ref.BooleanRef booleanRef2;
                    DragInteraction.Start start2;
                    DragInteraction cancel;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    boolean z = false;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope2;
                        this.label = 1;
                        Object objAwaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, this, 2, null);
                        if (objAwaitFirstDown$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope = awaitPointerEventScope2;
                        obj = objAwaitFirstDown$default;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                booleanRef2 = (Ref.BooleanRef) this.L$1;
                                start2 = (DragInteraction.Start) this.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    if (!((Boolean) obj).booleanValue()) {
                                        cancel = new DragInteraction.Stop(start2);
                                    } else {
                                        cancel = new DragInteraction.Cancel(start2);
                                    }
                                } catch (CancellationException unused) {
                                    cancel = new DragInteraction.Cancel(start2);
                                    this.$state.getGestureEndAction$material3_release().invoke(Boxing.boxBoolean(booleanRef2.element));
                                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                    return Unit.INSTANCE;
                                }
                                this.$state.getGestureEndAction$material3_release().invoke(Boxing.boxBoolean(booleanRef2.element));
                                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                return Unit.INSTANCE;
                            }
                            booleanRef = (Ref.BooleanRef) this.L$4;
                            floatRef = (Ref.FloatRef) this.L$3;
                            start = (DragInteraction.Start) this.L$2;
                            pointerInputChange = (PointerInputChange) this.L$1;
                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            pair = (Pair) obj;
                            if (pair != null) {
                                RangeSliderState rangeSliderState = this.$state;
                                float fM9429pointerSlopE8SPZFQ = DragGestureDetectorCopyKt.m9429pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), pointerInputChange.getType());
                                if (Math.abs(rangeSliderState.getRawOffsetEnd$material3_release() - floatRef.element) < fM9429pointerSlopE8SPZFQ && Math.abs(rangeSliderState.getRawOffsetStart$material3_release() - floatRef.element) < fM9429pointerSlopE8SPZFQ) {
                                    float fFloatValue = ((Number) pair.getSecond()).floatValue();
                                    if (!rangeSliderState.isRtl$material3_release() ? fFloatValue < 0.0f : fFloatValue >= 0.0f) {
                                        z = true;
                                    }
                                    booleanRef.element = z;
                                    floatRef.element += Offset.m11099getXimpl(PointerEventKt.positionChange((PointerInputChange) pair.getFirst()));
                                }
                            }
                            this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                            try {
                                long id = pointerInputChange.getId();
                                final RangeSliderState rangeSliderState2 = this.$state;
                                Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                                        invoke2(pointerInputChange2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull PointerInputChange pointerInputChange2) {
                                        float fM11099getXimpl = Offset.m11099getXimpl(PointerEventKt.positionChange(pointerInputChange2));
                                        RangeSliderState rangeSliderState3 = rangeSliderState2;
                                        boolean z2 = booleanRef.element;
                                        if (rangeSliderState3.isRtl$material3_release()) {
                                            fM11099getXimpl = -fM11099getXimpl;
                                        }
                                        rangeSliderState3.onDrag$material3_release(z2, fM11099getXimpl);
                                    }
                                };
                                this.L$0 = start;
                                this.L$1 = booleanRef;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 3;
                                obj = DragGestureDetectorKt.m7910horizontalDragjO51t88(awaitPointerEventScope, id, function1, this);
                            } catch (CancellationException unused2) {
                                booleanRef2 = booleanRef;
                                start2 = start;
                                cancel = new DragInteraction.Cancel(start2);
                                this.$state.getGestureEndAction$material3_release().invoke(Boxing.boxBoolean(booleanRef2.element));
                                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                return Unit.INSTANCE;
                            }
                            if (obj != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            booleanRef2 = booleanRef;
                            start2 = start;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                            this.$state.getGestureEndAction$material3_release().invoke(Boxing.boxBoolean(booleanRef2.element));
                            BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                            return Unit.INSTANCE;
                        }
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = awaitPointerEventScope3;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    DragInteraction.Start start3 = new DragInteraction.Start();
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    float totalWidth$material3_release = this.$state.isRtl$material3_release() ? this.$state.getTotalWidth$material3_release() - Offset.m11099getXimpl(pointerInputChange.getPosition()) : Offset.m11099getXimpl(pointerInputChange.getPosition());
                    floatRef2.element = totalWidth$material3_release;
                    int iCompareOffsets = this.$rangeSliderLogic.compareOffsets(totalWidth$material3_release);
                    Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                    booleanRef3.element = iCompareOffsets == 0 ? this.$state.getRawOffsetStart$material3_release() > floatRef2.element : iCompareOffsets < 0;
                    long id2 = pointerInputChange.getId();
                    int type = pointerInputChange.getType();
                    this.L$0 = awaitPointerEventScope;
                    this.L$1 = pointerInputChange;
                    this.L$2 = start3;
                    this.L$3 = floatRef2;
                    this.L$4 = booleanRef3;
                    this.label = 2;
                    Object objM9771awaitSlop8vUncbI = SliderKt.m9771awaitSlop8vUncbI(awaitPointerEventScope, id2, type, this);
                    if (objM9771awaitSlop8vUncbI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    start = start3;
                    obj = objM9771awaitSlop8vUncbI;
                    floatRef = floatRef2;
                    booleanRef = booleanRef3;
                    pair = (Pair) obj;
                    if (pair != null) {
                    }
                    this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                    long id3 = pointerInputChange.getId();
                    final RangeSliderState rangeSliderState22 = this.$state;
                    Function1<PointerInputChange, Unit> function12 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                            invoke2(pointerInputChange2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull PointerInputChange pointerInputChange2) {
                            float fM11099getXimpl = Offset.m11099getXimpl(PointerEventKt.positionChange(pointerInputChange2));
                            RangeSliderState rangeSliderState3 = rangeSliderState22;
                            boolean z2 = booleanRef.element;
                            if (rangeSliderState3.isRtl$material3_release()) {
                                fM11099getXimpl = -fM11099getXimpl;
                            }
                            rangeSliderState3.onDrag$material3_release(z2, fM11099getXimpl);
                        }
                    };
                    this.L$0 = start;
                    this.L$1 = booleanRef;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    obj = DragGestureDetectorKt.m7910horizontalDragjO51t88(awaitPointerEventScope, id3, function12, this);
                    if (obj != coroutine_suspended) {
                    }
                }

                /* compiled from: Slider.kt */
                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                @DebugMetadata(m7119c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", m7120f = "Slider.kt", m7121i = {}, m7122l = {1545}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2 */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ Ref.BooleanRef $draggingStart;
                    public final /* synthetic */ DragInteraction $finishInteraction;
                    public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$draggingStart = booleanRef;
                        this.$finishInteraction = dragInteraction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            MutableInteractionSource mutableInteractionSourceActiveInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element);
                            DragInteraction dragInteraction = this.$finishInteraction;
                            this.label = 1;
                            if (mutableInteractionSourceActiveInteraction.emit(dragInteraction, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C118711 c118711 = new C118711(this.$state, this.$rangeSliderLogic, coroutineScope, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c118711, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Stable
    private static final Modifier rangeSliderPressDragModifier(Modifier modifier, RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, rangeSliderState}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new C16111(rangeSliderState, mutableInteractionSource, mutableInteractionSource2, null)) : modifier;
    }

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        float fM10688getHandleWidthD9Ej5fM = sliderTokens.m10688getHandleWidthD9Ej5fM();
        ThumbWidth = fM10688getHandleWidthD9Ej5fM;
        float fM10687getHandleHeightD9Ej5fM = sliderTokens.m10687getHandleHeightD9Ej5fM();
        ThumbHeight = fM10687getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m13688DpSizeYgX7TsA(fM10688getHandleWidthD9Ej5fM, fM10687getHandleHeightD9Ej5fM);
        ThumbDefaultElevation = C2046Dp.m13666constructorimpl(1);
        ThumbPressedElevation = C2046Dp.m13666constructorimpl(6);
        TickSize = sliderTokens.m10694getTickMarksContainerSizeD9Ej5fM();
        TrackHeight = sliderTokens.m10689getInactiveTrackHeightD9Ej5fM();
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    @Stable
    public static final long SliderRange(float f, float f2) {
        if ((!Float.isNaN(f) || !Float.isNaN(f2)) && f > f2) {
            throw new IllegalArgumentException(("start(" + f + ") must be <= endInclusive(" + f2 + ')').toString());
        }
        return SliderRange.m9779constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    @Stable
    public static final long SliderRange(@NotNull ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        float fFloatValue = closedFloatingPointRange.getStart().floatValue();
        float fFloatValue2 = closedFloatingPointRange.getEndInclusive().floatValue();
        if ((!Float.isNaN(fFloatValue) || !Float.isNaN(fFloatValue2)) && fFloatValue > fFloatValue2) {
            throw new IllegalArgumentException(("ClosedFloatingPointRange<Float>.start(" + fFloatValue + ") must be <= ClosedFloatingPoint.endInclusive(" + fFloatValue2 + ')').toString());
        }
        return SliderRange.m9779constructorimpl((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(fFloatValue2) & 4294967295L));
    }

    /* renamed from: isSpecified-If1S1O4 */
    public static final boolean m9772isSpecifiedIf1S1O4(long j) {
        return j != SliderRange.INSTANCE.m9788getUnspecifiedFYbKRX4();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final float snapValueToTick(float f, float[] fArr, float f2, float f3) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f4 = fArr[0];
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
            if (lastIndex != 0) {
                float fAbs = Math.abs(MathHelpersKt.lerp(f2, f3, f4) - f);
                ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    float f5 = fArr[it.nextInt()];
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f2, f3, f5) - f);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f4 = f5;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f4);
            } else {
                fValueOf = Float.valueOf(f4);
            }
        }
        return fValueOf != null ? MathHelpersKt.lerp(f2, f3, fValueOf.floatValue()) : f;
    }
}
