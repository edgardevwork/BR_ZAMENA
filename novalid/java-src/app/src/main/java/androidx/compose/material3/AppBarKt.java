package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.AlignmentLineKt;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.LayoutModifierKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.p003ui.unit.VelocityKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.p007ts.TsExtractor;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppBar.kt */
@Metadata(m7104d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0083\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u008f\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001al\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001ax\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a \u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0007\u001a\u007f\u00104\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u007f\u0010;\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u007f\u0010<\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u0085\u0001\u0010=\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u0010%\u001a\u0004\u0018\u000109H\u0003¢\u0006\u0002\u0010B\u001a\u007f\u0010C\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u007f\u0010D\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a£\u0001\u0010E\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010F\u001a\u0002012\u0006\u0010G\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020\u001c2\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010>\u001a\u00020?2\u0006\u0010J\u001a\u0002012\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020A2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u0015H\u0003ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001aµ\u0001\u0010T\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010>\u001a\u00020?2\u0006\u0010O\u001a\u00020\u00012\u0011\u0010U\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010V\u001a\u00020?2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u00107\u001a\u0002082\u0006\u0010W\u001a\u00020\u00012\u0006\u0010X\u001a\u00020\u00012\b\u0010%\u001a\u0004\u0018\u000109H\u0003ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a+\u0010[\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u000201H\u0007¢\u0006\u0002\u0010\\\u001a+\u0010]\u001a\u00020^2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u000201H\u0007¢\u0006\u0002\u0010_\u001a>\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020^2\u0006\u0010c\u001a\u0002012\u000e\u0010d\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010e2\u000e\u0010f\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010gH\u0082@¢\u0006\u0002\u0010h\u001a>\u0010i\u001a\u00020a2\u0006\u0010b\u001a\u00020/2\u0006\u0010c\u001a\u0002012\u000e\u0010d\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010e2\u000e\u0010f\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010gH\u0083@¢\u0006\u0002\u0010j\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006k²\u0006\n\u0010l\u001a\u00020\u001cX\u008a\u0084\u0002"}, m7105d2 = {"BottomAppBarHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "BottomAppBarVerticalPadding", "getBottomAppBarVerticalPadding", "()F", "FABHorizontalPadding", "FABVerticalPadding", "LargeTitleBottomPadding", "MediumTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "TopTitleAlphaEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "BottomAppBar", "", NotificationCompat.WearableExtender.KEY_ACTIONS, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "floatingActionButton", "Lkotlin/Function0;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "BottomAppBar-Snr_uVM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;II)V", "scrollBehavior", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "BottomAppBar-qhFBPw4", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "content", "BottomAppBar-1oL4kX8", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar-e-3WI5M", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBarState", "Landroidx/compose/material3/BottomAppBarState;", "initialHeightOffsetLimit", "", "initialHeightOffset", "initialContentOffset", "CenterAlignedTopAppBar", "title", "navigationIcon", "colors", "Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "LargeTopAppBar", "MediumTopAppBar", "SingleRowTopAppBar", "titleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "centeredTitle", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "SmallTopAppBar", "TopAppBar", "TopAppBarLayout", "heightPx", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "titleHorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "titleBottomPadding", "", "hideTitleSemantics", "TopAppBarLayout-kXwM9vE", "(Landroidx/compose/ui/Modifier;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TwoRowsTopAppBar", "smallTitle", "smallTitleTextStyle", "maxHeight", "pinnedHeight", "TwoRowsTopAppBar-tjU4iQQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;FFLandroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "rememberBottomAppBarState", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomAppBarState;", "rememberTopAppBarState", "Landroidx/compose/material3/TopAppBarState;", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarState;", "settleAppBar", "Landroidx/compose/ui/unit/Velocity;", "state", "velocity", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settleAppBarBottom", "(Landroidx/compose/material3/BottomAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release", "appBarContainerColor"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,2283:1\n1116#2,6:2284\n1116#2,6:2290\n1116#2,6:2296\n1116#2,6:2302\n1116#2,6:2308\n1116#2,6:2316\n1116#2,6:2322\n1116#2,6:2328\n1116#2,6:2335\n1116#2,6:2341\n1116#2,6:2347\n1116#2,6:2353\n74#3:2314\n74#3:2334\n1#4:2315\n78#5,11:2359\n78#5,11:2393\n91#5:2425\n78#5,11:2433\n91#5:2465\n78#5,11:2473\n91#5:2505\n91#5:2510\n456#6,8:2370\n464#6,3:2384\n456#6,8:2404\n464#6,3:2418\n467#6,3:2422\n456#6,8:2444\n464#6,3:2458\n467#6,3:2462\n456#6,8:2484\n464#6,3:2498\n467#6,3:2502\n467#6,3:2507\n3737#7,6:2378\n3737#7,6:2412\n3737#7,6:2452\n3737#7,6:2492\n68#8,6:2387\n74#8:2421\n78#8:2426\n68#8,6:2427\n74#8:2461\n78#8:2466\n68#8,6:2467\n74#8:2501\n78#8:2506\n81#9:2511\n154#10:2512\n154#10:2514\n154#10:2516\n154#10:2518\n154#10:2520\n154#10:2521\n154#10:2522\n154#10:2523\n58#11:2513\n58#11:2515\n58#11:2517\n58#11:2519\n58#11:2524\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt\n*L\n590#1:2284,6\n593#1:2290,6\n616#1:2296,6\n1053#1:2302,6\n1374#1:2308,6\n1641#1:2316,6\n1671#1:2322,6\n1674#1:2328,6\n1759#1:2335,6\n1792#1:2341,6\n1795#1:2347,6\n1937#1:2353,6\n1640#1:2314\n1751#1:2334\n1901#1:2359,11\n1903#1:2393,11\n1903#1:2425\n1913#1:2433,11\n1913#1:2465\n1925#1:2473,11\n1925#1:2505\n1901#1:2510\n1901#1:2370,8\n1901#1:2384,3\n1903#1:2404,8\n1903#1:2418,3\n1903#1:2422,3\n1913#1:2444,8\n1913#1:2458,3\n1913#1:2462,3\n1925#1:2484,8\n1925#1:2498,3\n1925#1:2502,3\n1901#1:2507,3\n1901#1:2378,6\n1903#1:2412,6\n1913#1:2452,6\n1925#1:2492,6\n1903#1:2387,6\n1903#1:2421\n1903#1:2426\n1913#1:2427,6\n1913#1:2461\n1913#1:2466\n1925#1:2467,6\n1925#1:2501\n1925#1:2506\n1653#1:2511\n1609#1:2512\n1610#1:2514\n1613#1:2516\n1614#1:2518\n2276#1:2520\n2277#1:2521\n2278#1:2522\n2282#1:2523\n1609#1:2513\n1610#1:2515\n1613#1:2517\n1614#1:2519\n2282#1:2524\n*E\n"})
/* loaded from: classes3.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;

    @NotNull
    private static final CubicBezierEasing TopTitleAlphaEasing;

    /* compiled from: AppBar.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AppBarKt$CenterAlignedTopAppBar$1 */
    /* loaded from: classes.dex */
    public static final class C13031 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        public final /* synthetic */ TopAppBarColors $colors;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        public final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13031(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            AppBarKt.CenterAlignedTopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AppBarKt$LargeTopAppBar$1 */
    /* loaded from: classes.dex */
    public static final class C13041 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        public final /* synthetic */ TopAppBarColors $colors;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        public final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13041(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            AppBarKt.LargeTopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AppBarKt$MediumTopAppBar$1 */
    /* loaded from: classes.dex */
    public static final class C13051 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        public final /* synthetic */ TopAppBarColors $colors;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        public final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13051(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            AppBarKt.MediumTopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$3 */
    /* loaded from: classes.dex */
    public static final class C13073 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        public final /* synthetic */ boolean $centeredTitle;
        public final /* synthetic */ TopAppBarColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        public final /* synthetic */ TextStyle $titleTextStyle;
        public final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13073(Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2) {
            super(2);
            function2 = function2;
            textStyle = textStyle;
            z = z;
            function2 = function22;
            function3 = function3;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            AppBarKt.SingleRowTopAppBar(modifier, function2, textStyle, z, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AppBarKt$SmallTopAppBar$1 */
    /* loaded from: classes.dex */
    public static final class C13081 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        public final /* synthetic */ TopAppBarColors $colors;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        public final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13081(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            AppBarKt.SmallTopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AppBarKt$TopAppBar$1 */
    /* loaded from: classes.dex */
    public static final class C13091 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
        public final /* synthetic */ TopAppBarColors $colors;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        public final /* synthetic */ WindowInsets $windowInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13091(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            function3 = function3;
            windowInsets = windowInsets;
            topAppBarColors = topAppBarColors;
            topAppBarScrollBehavior = topAppBarScrollBehavior;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            AppBarKt.TopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.AppBarKt", m7120f = "AppBar.kt", m7121i = {0, 0, 0, 1}, m7122l = {2241, 2257}, m7123m = "settleAppBar", m7124n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, m7125s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBar$1 */
    /* loaded from: classes.dex */
    public static final class C13111 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C13111(Continuation<? super C13111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppBarKt.settleAppBar(null, 0.0f, null, null, this);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.AppBarKt", m7120f = "AppBar.kt", m7121i = {0, 0, 0, 1}, m7122l = {1578, 1594}, m7123m = "settleAppBarBottom", m7124n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, m7125s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBarBottom$1 */
    /* loaded from: classes.dex */
    public static final class C13141 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C13141(Continuation<? super C13141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppBarKt.settleAppBarBottom(null, 0.0f, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopAppBar(@NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable WindowInsets windowInsets, @Nullable TopAppBarColors topAppBarColors, @Nullable TopAppBarScrollBehavior topAppBarScrollBehavior, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M9302getLambda1$material3_release;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M9306getLambda2$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        int i7;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        Function2<? super Composer, ? super Integer, Unit> function23;
        TopAppBarScrollBehavior topAppBarScrollBehavior4;
        TopAppBarColors topAppBarColors4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1906353009);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                    function2M9302getLambda1$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M9302getLambda1$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M9306getLambda2$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M9306getLambda2$material3_release) ? 2048 : 1024;
                    }
                    if ((i & CpioConstants.C_ISBLK) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i9 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColors2 = topAppBarColors;
                            int i10 = composerStartRestartGroup.changed(topAppBarColors2) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i3 |= i10;
                    } else {
                        topAppBarColors2 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M9302getLambda1$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m9302getLambda1$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M9306getLambda2$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m9306getLambda2$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(composerStartRestartGroup, 6);
                                }
                                if (i6 == 0) {
                                    i7 = i3;
                                    topAppBarScrollBehavior3 = null;
                                    function32 = function3M9306getLambda2$material3_release;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1906353009, i7, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:129)");
                                    }
                                    int i11 = ((i7 >> 3) & 14) | 3072 | ((i7 << 3) & 112);
                                    int i12 = i7 << 6;
                                    SingleRowTopAppBar(modifier3, function2, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), false, function2M9302getLambda1$material3_release, function32, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, composerStartRestartGroup, i11 | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    windowInsets2 = windowInsets3;
                                    function33 = function32;
                                    function23 = function2M9302getLambda1$material3_release;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                                    topAppBarColors4 = topAppBarColors3;
                                    modifier2 = modifier3;
                                } else {
                                    i7 = i3;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i7 = i3;
                                modifier3 = modifier2;
                            }
                            function32 = function3M9306getLambda2$material3_release;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = ((i7 >> 3) & 14) | 3072 | ((i7 << 3) & 112);
                            int i122 = i7 << 6;
                            SingleRowTopAppBar(modifier3, function2, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), false, function2M9302getLambda1$material3_release, function32, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, composerStartRestartGroup, i112 | (57344 & i122) | (458752 & i122) | (3670016 & i122) | (29360128 & i122) | (i122 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            windowInsets2 = windowInsets3;
                            function33 = function32;
                            function23 = function2M9302getLambda1$material3_release;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                            topAppBarColors4 = topAppBarColors3;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function23 = function2M9302getLambda1$material3_release;
                            function33 = function3M9306getLambda2$material3_release;
                            topAppBarColors4 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.TopAppBar.1
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                                public final /* synthetic */ TopAppBarColors $colors;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                                public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                                public final /* synthetic */ WindowInsets $windowInsets;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13091(Function2<? super Composer, ? super Integer, Unit> function24, Modifier modifier22, Function2<? super Composer, ? super Integer, Unit> function232, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function332, WindowInsets windowInsets22, TopAppBarColors topAppBarColors42, TopAppBarScrollBehavior topAppBarScrollBehavior42, int i13, int i22) {
                                    super(2);
                                    function2 = function24;
                                    modifier = modifier22;
                                    function2 = function232;
                                    function3 = function332;
                                    windowInsets = windowInsets22;
                                    topAppBarColors = topAppBarColors42;
                                    topAppBarScrollBehavior = topAppBarScrollBehavior42;
                                    i = i13;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i13) {
                                    AppBarKt.TopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i13 & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i22 & 16) != 0) {
                            }
                            if ((i22 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M9306getLambda2$material3_release = function3;
                if ((i13 & CpioConstants.C_ISBLK) != 0) {
                }
                if ((196608 & i13) != 0) {
                }
                i6 = i22 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M9302getLambda1$material3_release = function22;
            i5 = i22 & 8;
            if (i5 != 0) {
            }
            function3M9306getLambda2$material3_release = function3;
            if ((i13 & CpioConstants.C_ISBLK) != 0) {
            }
            if ((196608 & i13) != 0) {
            }
            i6 = i22 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier22 = modifier;
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        function2M9302getLambda1$material3_release = function22;
        i5 = i22 & 8;
        if (i5 != 0) {
        }
        function3M9306getLambda2$material3_release = function3;
        if ((i13 & CpioConstants.C_ISBLK) != 0) {
        }
        if ((196608 & i13) != 0) {
        }
        i6 = i22 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use TopAppBar instead.", replaceWith = @ReplaceWith(expression = "TopAppBar(title, modifier, navigationIcon, actions, windowInsets, colors, scrollBehavior)", imports = {}))
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SmallTopAppBar(@NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable WindowInsets windowInsets, @Nullable TopAppBarColors topAppBarColors, @Nullable TopAppBarScrollBehavior topAppBarScrollBehavior, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M9307getLambda3$material3_release;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M9308getLambda4$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        int i7;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        Function2<? super Composer, ? super Integer, Unit> function23;
        TopAppBarScrollBehavior topAppBarScrollBehavior4;
        TopAppBarColors topAppBarColors4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1967617284);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                    function2M9307getLambda3$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M9307getLambda3$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M9308getLambda4$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M9308getLambda4$material3_release) ? 2048 : 1024;
                    }
                    if ((i & CpioConstants.C_ISBLK) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i9 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColors2 = topAppBarColors;
                            int i10 = composerStartRestartGroup.changed(topAppBarColors2) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i3 |= i10;
                    } else {
                        topAppBarColors2 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function23 = function2M9307getLambda3$material3_release;
                            function33 = function3M9308getLambda4$material3_release;
                            topAppBarColors4 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M9307getLambda3$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m9307getLambda3$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M9308getLambda4$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m9308getLambda4$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(composerStartRestartGroup, 6);
                                }
                                if (i6 == 0) {
                                    i7 = i3;
                                    topAppBarScrollBehavior3 = null;
                                    function32 = function3M9308getLambda4$material3_release;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1967617284, i7, -1, "androidx.compose.material3.SmallTopAppBar (AppBar.kt:192)");
                                    }
                                    TopAppBar(function2, modifier3, function2M9307getLambda3$material3_release, function32, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, composerStartRestartGroup, i7 & 4194302, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    windowInsets2 = windowInsets3;
                                    function33 = function32;
                                    function23 = function2M9307getLambda3$material3_release;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                                    topAppBarColors4 = topAppBarColors3;
                                    modifier2 = modifier3;
                                } else {
                                    i7 = i3;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i7 = i3;
                                modifier3 = modifier2;
                            }
                            function32 = function3M9308getLambda4$material3_release;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TopAppBar(function2, modifier3, function2M9307getLambda3$material3_release, function32, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, composerStartRestartGroup, i7 & 4194302, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            windowInsets2 = windowInsets3;
                            function33 = function32;
                            function23 = function2M9307getLambda3$material3_release;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                            topAppBarColors4 = topAppBarColors3;
                            modifier2 = modifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.SmallTopAppBar.1
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                                public final /* synthetic */ TopAppBarColors $colors;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                                public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                                public final /* synthetic */ WindowInsets $windowInsets;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13081(Function2<? super Composer, ? super Integer, Unit> function24, Modifier modifier22, Function2<? super Composer, ? super Integer, Unit> function232, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function332, WindowInsets windowInsets22, TopAppBarColors topAppBarColors42, TopAppBarScrollBehavior topAppBarScrollBehavior42, int i11, int i22) {
                                    super(2);
                                    function2 = function24;
                                    modifier = modifier22;
                                    function2 = function232;
                                    function3 = function332;
                                    windowInsets = windowInsets22;
                                    topAppBarColors = topAppBarColors42;
                                    topAppBarScrollBehavior = topAppBarScrollBehavior42;
                                    i = i11;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i11) {
                                    AppBarKt.SmallTopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i22 & 16) != 0) {
                            }
                            if ((i22 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M9308getLambda4$material3_release = function3;
                if ((i11 & CpioConstants.C_ISBLK) != 0) {
                }
                if ((196608 & i11) != 0) {
                }
                i6 = i22 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M9307getLambda3$material3_release = function22;
            i5 = i22 & 8;
            if (i5 != 0) {
            }
            function3M9308getLambda4$material3_release = function3;
            if ((i11 & CpioConstants.C_ISBLK) != 0) {
            }
            if ((196608 & i11) != 0) {
            }
            i6 = i22 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier22 = modifier;
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        function2M9307getLambda3$material3_release = function22;
        i5 = i22 & 8;
        if (i5 != 0) {
        }
        function3M9308getLambda4$material3_release = function3;
        if ((i11 & CpioConstants.C_ISBLK) != 0) {
        }
        if ((196608 & i11) != 0) {
        }
        i6 = i22 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CenterAlignedTopAppBar(@NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable WindowInsets windowInsets, @Nullable TopAppBarColors topAppBarColors, @Nullable TopAppBarScrollBehavior topAppBarScrollBehavior, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M9309getLambda5$material3_release;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M9310getLambda6$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsCenterAlignedTopAppBarColors;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        int i7;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors2;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        Function2<? super Composer, ? super Integer, Unit> function23;
        TopAppBarScrollBehavior topAppBarScrollBehavior4;
        TopAppBarColors topAppBarColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2139286460);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                    function2M9309getLambda5$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M9309getLambda5$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M9310getLambda6$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M9310getLambda6$material3_release) ? 2048 : 1024;
                    }
                    if ((i & CpioConstants.C_ISBLK) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i9 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
                            int i10 = composerStartRestartGroup.changed(topAppBarColorsCenterAlignedTopAppBarColors) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
                        }
                        i3 |= i10;
                    } else {
                        topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M9309getLambda5$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m9309getLambda5$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M9310getLambda6$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m9310getLambda6$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColorsCenterAlignedTopAppBarColors = TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors(composerStartRestartGroup, 6);
                                }
                                if (i6 == 0) {
                                    i7 = i3;
                                    topAppBarScrollBehavior3 = null;
                                    function32 = function3M9310getLambda6$material3_release;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors2 = topAppBarColorsCenterAlignedTopAppBarColors;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2139286460, i7, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:233)");
                                    }
                                    int i11 = ((i7 >> 3) & 14) | 3072 | ((i7 << 3) & 112);
                                    int i12 = i7 << 6;
                                    SingleRowTopAppBar(modifier3, function2, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), true, function2M9309getLambda5$material3_release, function32, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composerStartRestartGroup, i11 | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    windowInsets2 = windowInsets3;
                                    function33 = function32;
                                    function23 = function2M9309getLambda5$material3_release;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                                    topAppBarColors3 = topAppBarColors2;
                                    modifier2 = modifier3;
                                } else {
                                    i7 = i3;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i7 = i3;
                                modifier3 = modifier2;
                            }
                            function32 = function3M9310getLambda6$material3_release;
                            windowInsets3 = windowInsets2;
                            topAppBarColors2 = topAppBarColorsCenterAlignedTopAppBarColors;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = ((i7 >> 3) & 14) | 3072 | ((i7 << 3) & 112);
                            int i122 = i7 << 6;
                            SingleRowTopAppBar(modifier3, function2, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), true, function2M9309getLambda5$material3_release, function32, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composerStartRestartGroup, i112 | (57344 & i122) | (458752 & i122) | (3670016 & i122) | (29360128 & i122) | (i122 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            windowInsets2 = windowInsets3;
                            function33 = function32;
                            function23 = function2M9309getLambda5$material3_release;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                            topAppBarColors3 = topAppBarColors2;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function23 = function2M9309getLambda5$material3_release;
                            function33 = function3M9310getLambda6$material3_release;
                            topAppBarColors3 = topAppBarColorsCenterAlignedTopAppBarColors;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.CenterAlignedTopAppBar.1
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                                public final /* synthetic */ TopAppBarColors $colors;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                                public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                                public final /* synthetic */ WindowInsets $windowInsets;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13031(Function2<? super Composer, ? super Integer, Unit> function24, Modifier modifier22, Function2<? super Composer, ? super Integer, Unit> function232, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function332, WindowInsets windowInsets22, TopAppBarColors topAppBarColors32, TopAppBarScrollBehavior topAppBarScrollBehavior42, int i13, int i22) {
                                    super(2);
                                    function2 = function24;
                                    modifier = modifier22;
                                    function2 = function232;
                                    function3 = function332;
                                    windowInsets = windowInsets22;
                                    topAppBarColors = topAppBarColors32;
                                    topAppBarScrollBehavior = topAppBarScrollBehavior42;
                                    i = i13;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i13) {
                                    AppBarKt.CenterAlignedTopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i13 & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i22 & 16) != 0) {
                            }
                            if ((i22 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M9310getLambda6$material3_release = function3;
                if ((i13 & CpioConstants.C_ISBLK) != 0) {
                }
                if ((196608 & i13) != 0) {
                }
                i6 = i22 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M9309getLambda5$material3_release = function22;
            i5 = i22 & 8;
            if (i5 != 0) {
            }
            function3M9310getLambda6$material3_release = function3;
            if ((i13 & CpioConstants.C_ISBLK) != 0) {
            }
            if ((196608 & i13) != 0) {
            }
            i6 = i22 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier22 = modifier;
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        function2M9309getLambda5$material3_release = function22;
        i5 = i22 & 8;
        if (i5 != 0) {
        }
        function3M9310getLambda6$material3_release = function3;
        if ((i13 & CpioConstants.C_ISBLK) != 0) {
        }
        if ((196608 & i13) != 0) {
        }
        i6 = i22 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MediumTopAppBar(@NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable WindowInsets windowInsets, @Nullable TopAppBarColors topAppBarColors, @Nullable TopAppBarScrollBehavior topAppBarScrollBehavior, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M9311getLambda7$material3_release;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M9312getLambda8$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsMediumTopAppBarColors;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        int i7;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors2;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        Function2<? super Composer, ? super Integer, Unit> function23;
        TopAppBarScrollBehavior topAppBarScrollBehavior4;
        TopAppBarColors topAppBarColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1805417862);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                    function2M9311getLambda7$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M9311getLambda7$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M9312getLambda8$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M9312getLambda8$material3_release) ? 2048 : 1024;
                    }
                    if ((i & CpioConstants.C_ISBLK) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i9 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColorsMediumTopAppBarColors = topAppBarColors;
                            int i10 = composerStartRestartGroup.changed(topAppBarColorsMediumTopAppBarColors) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            topAppBarColorsMediumTopAppBarColors = topAppBarColors;
                        }
                        i3 |= i10;
                    } else {
                        topAppBarColorsMediumTopAppBarColors = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M9311getLambda7$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m9311getLambda7$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M9312getLambda8$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m9312getLambda8$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColorsMediumTopAppBarColors = TopAppBarDefaults.INSTANCE.mediumTopAppBarColors(composerStartRestartGroup, 6);
                                }
                                if (i6 == 0) {
                                    i7 = i3;
                                    topAppBarScrollBehavior3 = null;
                                    function32 = function3M9312getLambda8$material3_release;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors2 = topAppBarColorsMediumTopAppBarColors;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1805417862, i7, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:288)");
                                    }
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    Typography typography = materialTheme.getTypography(composerStartRestartGroup, 6);
                                    TopAppBarMediumTokens topAppBarMediumTokens = TopAppBarMediumTokens.INSTANCE;
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(typography, topAppBarMediumTokens.getHeadlineFont());
                                    Typography typography2 = materialTheme.getTypography(composerStartRestartGroup, 6);
                                    TopAppBarSmallTokens topAppBarSmallTokens = TopAppBarSmallTokens.INSTANCE;
                                    int i11 = i7 << 12;
                                    m9132TwoRowsTopAppBartjU4iQQ(modifier3, function2, textStyleFromToken, MediumTitleBottomPadding, function2, TypographyKt.fromToken(typography2, topAppBarSmallTokens.getHeadlineFont()), function2M9311getLambda7$material3_release, function32, windowInsets3, topAppBarColors2, topAppBarMediumTokens.m10751getContainerHeightD9Ej5fM(), topAppBarSmallTokens.m10761getContainerHeightD9Ej5fM(), topAppBarScrollBehavior3, composerStartRestartGroup, ((i7 >> 3) & 14) | 3072 | ((i7 << 3) & 112) | (57344 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), ((i7 >> 12) & 896) | 54, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    windowInsets2 = windowInsets3;
                                    function33 = function32;
                                    function23 = function2M9311getLambda7$material3_release;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                                    topAppBarColors3 = topAppBarColors2;
                                    modifier2 = modifier3;
                                } else {
                                    i7 = i3;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i7 = i3;
                                modifier3 = modifier2;
                            }
                            function32 = function3M9312getLambda8$material3_release;
                            windowInsets3 = windowInsets2;
                            topAppBarColors2 = topAppBarColorsMediumTopAppBarColors;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                            Typography typography3 = materialTheme2.getTypography(composerStartRestartGroup, 6);
                            TopAppBarMediumTokens topAppBarMediumTokens2 = TopAppBarMediumTokens.INSTANCE;
                            TextStyle textStyleFromToken2 = TypographyKt.fromToken(typography3, topAppBarMediumTokens2.getHeadlineFont());
                            Typography typography22 = materialTheme2.getTypography(composerStartRestartGroup, 6);
                            TopAppBarSmallTokens topAppBarSmallTokens2 = TopAppBarSmallTokens.INSTANCE;
                            int i112 = i7 << 12;
                            m9132TwoRowsTopAppBartjU4iQQ(modifier3, function2, textStyleFromToken2, MediumTitleBottomPadding, function2, TypographyKt.fromToken(typography22, topAppBarSmallTokens2.getHeadlineFont()), function2M9311getLambda7$material3_release, function32, windowInsets3, topAppBarColors2, topAppBarMediumTokens2.m10751getContainerHeightD9Ej5fM(), topAppBarSmallTokens2.m10761getContainerHeightD9Ej5fM(), topAppBarScrollBehavior3, composerStartRestartGroup, ((i7 >> 3) & 14) | 3072 | ((i7 << 3) & 112) | (57344 & i112) | (3670016 & i112) | (29360128 & i112) | (234881024 & i112) | (i112 & 1879048192), ((i7 >> 12) & 896) | 54, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            windowInsets2 = windowInsets3;
                            function33 = function32;
                            function23 = function2M9311getLambda7$material3_release;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                            topAppBarColors3 = topAppBarColors2;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function23 = function2M9311getLambda7$material3_release;
                            function33 = function3M9312getLambda8$material3_release;
                            topAppBarColors3 = topAppBarColorsMediumTopAppBarColors;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.MediumTopAppBar.1
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                                public final /* synthetic */ TopAppBarColors $colors;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                                public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                                public final /* synthetic */ WindowInsets $windowInsets;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13051(Function2<? super Composer, ? super Integer, Unit> function24, Modifier modifier22, Function2<? super Composer, ? super Integer, Unit> function232, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function332, WindowInsets windowInsets22, TopAppBarColors topAppBarColors32, TopAppBarScrollBehavior topAppBarScrollBehavior42, int i12, int i22) {
                                    super(2);
                                    function2 = function24;
                                    modifier = modifier22;
                                    function2 = function232;
                                    function3 = function332;
                                    windowInsets = windowInsets22;
                                    topAppBarColors = topAppBarColors32;
                                    topAppBarScrollBehavior = topAppBarScrollBehavior42;
                                    i = i12;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    AppBarKt.MediumTopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i12 & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i22 & 16) != 0) {
                            }
                            if ((i22 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M9312getLambda8$material3_release = function3;
                if ((i12 & CpioConstants.C_ISBLK) != 0) {
                }
                if ((196608 & i12) != 0) {
                }
                i6 = i22 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M9311getLambda7$material3_release = function22;
            i5 = i22 & 8;
            if (i5 != 0) {
            }
            function3M9312getLambda8$material3_release = function3;
            if ((i12 & CpioConstants.C_ISBLK) != 0) {
            }
            if ((196608 & i12) != 0) {
            }
            i6 = i22 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier22 = modifier;
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        function2M9311getLambda7$material3_release = function22;
        i5 = i22 & 8;
        if (i5 != 0) {
        }
        function3M9312getLambda8$material3_release = function3;
        if ((i12 & CpioConstants.C_ISBLK) != 0) {
        }
        if ((196608 & i12) != 0) {
        }
        i6 = i22 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LargeTopAppBar(@NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable WindowInsets windowInsets, @Nullable TopAppBarColors topAppBarColors, @Nullable TopAppBarScrollBehavior topAppBarScrollBehavior, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M9313getLambda9$material3_release;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M9303getLambda10$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsLargeTopAppBarColors;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        int i7;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors2;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        Function2<? super Composer, ? super Integer, Unit> function23;
        TopAppBarScrollBehavior topAppBarScrollBehavior4;
        TopAppBarColors topAppBarColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-474540752);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                    function2M9313getLambda9$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M9313getLambda9$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M9303getLambda10$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M9303getLambda10$material3_release) ? 2048 : 1024;
                    }
                    if ((i & CpioConstants.C_ISBLK) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i9 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColorsLargeTopAppBarColors = topAppBarColors;
                            int i10 = composerStartRestartGroup.changed(topAppBarColorsLargeTopAppBarColors) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            topAppBarColorsLargeTopAppBarColors = topAppBarColors;
                        }
                        i3 |= i10;
                    } else {
                        topAppBarColorsLargeTopAppBarColors = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M9313getLambda9$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m9313getLambda9$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M9303getLambda10$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m9303getLambda10$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColorsLargeTopAppBarColors = TopAppBarDefaults.INSTANCE.largeTopAppBarColors(composerStartRestartGroup, 6);
                                }
                                if (i6 == 0) {
                                    i7 = i3;
                                    topAppBarScrollBehavior3 = null;
                                    function32 = function3M9303getLambda10$material3_release;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors2 = topAppBarColorsLargeTopAppBarColors;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-474540752, i7, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:346)");
                                    }
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    Typography typography = materialTheme.getTypography(composerStartRestartGroup, 6);
                                    TopAppBarLargeTokens topAppBarLargeTokens = TopAppBarLargeTokens.INSTANCE;
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(typography, topAppBarLargeTokens.getHeadlineFont());
                                    Typography typography2 = materialTheme.getTypography(composerStartRestartGroup, 6);
                                    TopAppBarSmallTokens topAppBarSmallTokens = TopAppBarSmallTokens.INSTANCE;
                                    int i11 = i7 << 12;
                                    m9132TwoRowsTopAppBartjU4iQQ(modifier3, function2, textStyleFromToken, LargeTitleBottomPadding, function2, TypographyKt.fromToken(typography2, topAppBarSmallTokens.getHeadlineFont()), function2M9313getLambda9$material3_release, function32, windowInsets3, topAppBarColors2, topAppBarLargeTokens.m10747getContainerHeightD9Ej5fM(), topAppBarSmallTokens.m10761getContainerHeightD9Ej5fM(), topAppBarScrollBehavior3, composerStartRestartGroup, ((i7 >> 3) & 14) | 3072 | ((i7 << 3) & 112) | (57344 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), ((i7 >> 12) & 896) | 54, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    windowInsets2 = windowInsets3;
                                    function33 = function32;
                                    function23 = function2M9313getLambda9$material3_release;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                                    topAppBarColors3 = topAppBarColors2;
                                    modifier2 = modifier3;
                                } else {
                                    i7 = i3;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i7 = i3;
                                modifier3 = modifier2;
                            }
                            function32 = function3M9303getLambda10$material3_release;
                            windowInsets3 = windowInsets2;
                            topAppBarColors2 = topAppBarColorsLargeTopAppBarColors;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                            Typography typography3 = materialTheme2.getTypography(composerStartRestartGroup, 6);
                            TopAppBarLargeTokens topAppBarLargeTokens2 = TopAppBarLargeTokens.INSTANCE;
                            TextStyle textStyleFromToken2 = TypographyKt.fromToken(typography3, topAppBarLargeTokens2.getHeadlineFont());
                            Typography typography22 = materialTheme2.getTypography(composerStartRestartGroup, 6);
                            TopAppBarSmallTokens topAppBarSmallTokens2 = TopAppBarSmallTokens.INSTANCE;
                            int i112 = i7 << 12;
                            m9132TwoRowsTopAppBartjU4iQQ(modifier3, function2, textStyleFromToken2, LargeTitleBottomPadding, function2, TypographyKt.fromToken(typography22, topAppBarSmallTokens2.getHeadlineFont()), function2M9313getLambda9$material3_release, function32, windowInsets3, topAppBarColors2, topAppBarLargeTokens2.m10747getContainerHeightD9Ej5fM(), topAppBarSmallTokens2.m10761getContainerHeightD9Ej5fM(), topAppBarScrollBehavior3, composerStartRestartGroup, ((i7 >> 3) & 14) | 3072 | ((i7 << 3) & 112) | (57344 & i112) | (3670016 & i112) | (29360128 & i112) | (234881024 & i112) | (i112 & 1879048192), ((i7 >> 12) & 896) | 54, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            windowInsets2 = windowInsets3;
                            function33 = function32;
                            function23 = function2M9313getLambda9$material3_release;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                            topAppBarColors3 = topAppBarColors2;
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function23 = function2M9313getLambda9$material3_release;
                            function33 = function3M9303getLambda10$material3_release;
                            topAppBarColors3 = topAppBarColorsLargeTopAppBarColors;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.LargeTopAppBar.1
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                                public final /* synthetic */ TopAppBarColors $colors;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                                public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                                public final /* synthetic */ WindowInsets $windowInsets;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13041(Function2<? super Composer, ? super Integer, Unit> function24, Modifier modifier22, Function2<? super Composer, ? super Integer, Unit> function232, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function332, WindowInsets windowInsets22, TopAppBarColors topAppBarColors32, TopAppBarScrollBehavior topAppBarScrollBehavior42, int i12, int i22) {
                                    super(2);
                                    function2 = function24;
                                    modifier = modifier22;
                                    function2 = function232;
                                    function3 = function332;
                                    windowInsets = windowInsets22;
                                    topAppBarColors = topAppBarColors32;
                                    topAppBarScrollBehavior = topAppBarScrollBehavior42;
                                    i = i12;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    AppBarKt.LargeTopAppBar(function2, modifier, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i12 & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i22 & 16) != 0) {
                            }
                            if ((i22 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M9303getLambda10$material3_release = function3;
                if ((i12 & CpioConstants.C_ISBLK) != 0) {
                }
                if ((196608 & i12) != 0) {
                }
                i6 = i22 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M9313getLambda9$material3_release = function22;
            i5 = i22 & 8;
            if (i5 != 0) {
            }
            function3M9303getLambda10$material3_release = function3;
            if ((i12 & CpioConstants.C_ISBLK) != 0) {
            }
            if ((196608 & i12) != 0) {
            }
            i6 = i22 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier22 = modifier;
        i4 = i22 & 4;
        if (i4 == 0) {
        }
        function2M9313getLambda9$material3_release = function22;
        i5 = i22 & 8;
        if (i5 != 0) {
        }
        function3M9303getLambda10$material3_release = function3;
        if ((i12 & CpioConstants.C_ISBLK) != 0) {
        }
        if ((196608 & i12) != 0) {
        }
        i6 = i22 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-Snr_uVM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9128BottomAppBarSnr_uVM(@NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, @Nullable PaddingValues paddingValues, @Nullable WindowInsets windowInsets, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        long containerColor;
        long jM9292contentColorForek8zF_U;
        int i5;
        float fM9145getContainerElevationD9Ej5fM;
        int i6;
        WindowInsets windowInsets2;
        PaddingValues paddingValues2;
        int i7;
        long j3;
        final WindowInsets windowInsets3;
        final float f2;
        final PaddingValues paddingValues3;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2141738945);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        containerColor = j;
                        int i9 = composerStartRestartGroup.changed(containerColor) ? 2048 : 1024;
                        i3 |= i9;
                    } else {
                        containerColor = j;
                    }
                    i3 |= i9;
                } else {
                    containerColor = j;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    jM9292contentColorForek8zF_U = j2;
                    i3 |= ((i2 & 16) == 0 && composerStartRestartGroup.changed(jM9292contentColorForek8zF_U)) ? 16384 : 8192;
                } else {
                    jM9292contentColorForek8zF_U = j2;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        fM9145getContainerElevationD9Ej5fM = f;
                        i3 |= composerStartRestartGroup.changed(fM9145getContainerElevationD9Ej5fM) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function22 = null;
                            }
                            if ((i2 & 8) != 0) {
                                containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 9) & 14);
                                i3 &= -57345;
                            }
                            if (i5 != 0) {
                                fM9145getContainerElevationD9Ej5fM = BottomAppBarDefaults.INSTANCE.m9145getContainerElevationD9Ej5fM();
                            }
                            PaddingValues contentPadding = i6 == 0 ? BottomAppBarDefaults.INSTANCE.getContentPadding() : paddingValues;
                            if ((i2 & 128) == 0) {
                                i7 = i3 & (-29360129);
                                windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                j3 = jM9292contentColorForek8zF_U;
                                paddingValues2 = contentPadding;
                                float f3 = fM9145getContainerElevationD9Ej5fM;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2141738945, i7, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:405)");
                                }
                                m9130BottomAppBarqhFBPw4(function3, modifier2, function22, containerColor, j3, f3, paddingValues2, windowInsets2, null, composerStartRestartGroup, (i7 & 14) | 100663296 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                windowInsets3 = windowInsets2;
                                long j6 = containerColor;
                                f2 = f3;
                                paddingValues3 = paddingValues2;
                                long j7 = j3;
                                modifier3 = modifier2;
                                function23 = function22;
                                j4 = j6;
                                j5 = j7;
                            } else {
                                windowInsets2 = windowInsets;
                                paddingValues2 = contentPadding;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            paddingValues2 = paddingValues;
                            windowInsets2 = windowInsets;
                        }
                        i7 = i3;
                        j3 = jM9292contentColorForek8zF_U;
                        float f32 = fM9145getContainerElevationD9Ej5fM;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        m9130BottomAppBarqhFBPw4(function3, modifier2, function22, containerColor, j3, f32, paddingValues2, windowInsets2, null, composerStartRestartGroup, (i7 & 14) | 100663296 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        windowInsets3 = windowInsets2;
                        long j62 = containerColor;
                        f2 = f32;
                        paddingValues3 = paddingValues2;
                        long j72 = j3;
                        modifier3 = modifier2;
                        function23 = function22;
                        j4 = j62;
                        j5 = j72;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        windowInsets3 = windowInsets;
                        modifier3 = modifier2;
                        function23 = function22;
                        j4 = containerColor;
                        j5 = jM9292contentColorForek8zF_U;
                        f2 = fM9145getContainerElevationD9Ej5fM;
                        paddingValues3 = paddingValues;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$1
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

                            public final void invoke(@Nullable Composer composer2, int i10) {
                                AppBarKt.m9128BottomAppBarSnr_uVM(function3, modifier3, function23, j4, j5, f2, paddingValues3, windowInsets3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                fM9145getContainerElevationD9Ej5fM = f;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function22 = function2;
            if ((i & 3072) == 0) {
            }
            if ((i & CpioConstants.C_ISBLK) == 0) {
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            fM9145getContainerElevationD9Ej5fM = f;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((i & 3072) == 0) {
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        fM9145getContainerElevationD9Ej5fM = f;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-qhFBPw4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9130BottomAppBarqhFBPw4(@NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, @Nullable PaddingValues paddingValues, @Nullable WindowInsets windowInsets, @Nullable BottomAppBarScrollBehavior bottomAppBarScrollBehavior, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        long containerColor;
        long jM9292contentColorForek8zF_U;
        int i5;
        float f2;
        int i6;
        int i7;
        Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        WindowInsets windowInsets2;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        float f3;
        int i8;
        PaddingValues paddingValues2;
        PaddingValues paddingValues3;
        WindowInsets windowInsets3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1044837119);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
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
                    i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
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
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        jM9292contentColorForek8zF_U = j2;
                        int i11 = composerStartRestartGroup.changed(jM9292contentColorForek8zF_U) ? 16384 : 8192;
                        i3 |= i11;
                    } else {
                        jM9292contentColorForek8zF_U = j2;
                    }
                    i3 |= i11;
                } else {
                    jM9292contentColorForek8zF_U = j2;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changed(bottomAppBarScrollBehavior) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i9 == 0 ? Modifier.INSTANCE : modifier;
                            function22 = i4 == 0 ? null : function2;
                            if ((i2 & 8) != 0) {
                                containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 9) & 14);
                                i3 &= -57345;
                            }
                            float fM9145getContainerElevationD9Ej5fM = i5 == 0 ? BottomAppBarDefaults.INSTANCE.m9145getContainerElevationD9Ej5fM() : f2;
                            PaddingValues contentPadding = i6 == 0 ? BottomAppBarDefaults.INSTANCE.getContentPadding() : paddingValues;
                            if ((i2 & 128) == 0) {
                                windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            if (i7 == 0) {
                                f3 = fM9145getContainerElevationD9Ej5fM;
                                bottomAppBarScrollBehavior2 = null;
                            } else {
                                bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                                f3 = fM9145getContainerElevationD9Ej5fM;
                            }
                            i8 = i3;
                            paddingValues2 = contentPadding;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            modifier2 = modifier;
                            function22 = function2;
                            windowInsets2 = windowInsets;
                            bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                            i8 = i3;
                            f3 = f2;
                            paddingValues2 = paddingValues;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1044837119, i8, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:468)");
                        }
                        int i12 = i8 >> 6;
                        m9129BottomAppBare3WI5M(modifier2, containerColor, jM9292contentColorForek8zF_U, f3, paddingValues2, windowInsets2, bottomAppBarScrollBehavior2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1566394874, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                invoke(rowScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer2, int i13) {
                                int i14;
                                if ((i13 & 6) == 0) {
                                    i14 = i13 | (composer2.changed(rowScope) ? 4 : 2);
                                } else {
                                    i14 = i13;
                                }
                                if ((i14 & 19) != 18 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1566394874, i14, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:477)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierWeight$default = RowScope.weight$default(rowScope, companion, 1.0f, false, 2, null);
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                    composer2.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWeight$default);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
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
                                    if (function22 != null) {
                                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, AppBarKt.FABVerticalPadding, AppBarKt.FABHorizontalPadding, 0.0f, 9, null);
                                        Alignment topStart = companion2.getTopStart();
                                        Function2<Composer, Integer, Unit> function24 = function22;
                                        composer2.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composer2, 6);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function24.invoke(composer2, 0);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, ((i8 >> 3) & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f2 = f3;
                        long j4 = jM9292contentColorForek8zF_U;
                        paddingValues3 = paddingValues2;
                        windowInsets3 = windowInsets2;
                        function23 = function22;
                        j3 = j4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        function23 = function2;
                        bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                        j3 = jM9292contentColorForek8zF_U;
                        paddingValues3 = paddingValues;
                        windowInsets3 = windowInsets;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        final long j5 = containerColor;
                        final float f4 = f2;
                        final PaddingValues paddingValues4 = paddingValues3;
                        final WindowInsets windowInsets4 = windowInsets3;
                        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$3
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
                                AppBarKt.m9130BottomAppBarqhFBPw4(function3, modifier3, function23, j5, j3, f4, paddingValues4, windowInsets4, bottomAppBarScrollBehavior3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                f2 = f;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        i8 = i3;
                        paddingValues2 = contentPadding;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i122 = i8 >> 6;
                        m9129BottomAppBare3WI5M(modifier2, containerColor, jM9292contentColorForek8zF_U, f3, paddingValues2, windowInsets2, bottomAppBarScrollBehavior2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1566394874, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                invoke(rowScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer2, int i13) {
                                int i14;
                                if ((i13 & 6) == 0) {
                                    i14 = i13 | (composer2.changed(rowScope) ? 4 : 2);
                                } else {
                                    i14 = i13;
                                }
                                if ((i14 & 19) != 18 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1566394874, i14, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:477)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierWeight$default = RowScope.weight$default(rowScope, companion, 1.0f, false, 2, null);
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                    composer2.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWeight$default);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
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
                                    if (function22 != null) {
                                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.0f, AppBarKt.FABVerticalPadding, AppBarKt.FABHorizontalPadding, 0.0f, 9, null);
                                        Alignment topStart = companion2.getTopStart();
                                        Function2<Composer, Integer, Unit> function24 = function22;
                                        composer2.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composer2, 6);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function24.invoke(composer2, 0);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, ((i8 >> 3) & 14) | 12582912 | (i122 & 112) | (i122 & 896) | (i122 & 7168) | (57344 & i122) | (458752 & i122) | (i122 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f2 = f3;
                        long j42 = jM9292contentColorForek8zF_U;
                        paddingValues3 = paddingValues2;
                        windowInsets3 = windowInsets2;
                        function23 = function22;
                        j3 = j42;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i & 3072) == 0) {
            }
            if ((i & CpioConstants.C_ISBLK) == 0) {
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            f2 = f;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-1oL4kX8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9127BottomAppBar1oL4kX8(@Nullable Modifier modifier, long j, long j2, float f, @Nullable PaddingValues paddingValues, @Nullable WindowInsets windowInsets, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        long containerColor;
        long jM9292contentColorForek8zF_U;
        float fM9145getContainerElevationD9Ej5fM;
        int i4;
        PaddingValues contentPadding;
        WindowInsets windowInsets2;
        Modifier modifier2;
        int i5;
        PaddingValues paddingValues2;
        WindowInsets windowInsets3;
        float f2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1391700845);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                containerColor = j;
                int i7 = composerStartRestartGroup.changed(containerColor) ? 32 : 16;
                i3 |= i7;
            } else {
                containerColor = j;
            }
            i3 |= i7;
        } else {
            containerColor = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jM9292contentColorForek8zF_U = j2;
                int i8 = composerStartRestartGroup.changed(jM9292contentColorForek8zF_U) ? 256 : 128;
                i3 |= i8;
            } else {
                jM9292contentColorForek8zF_U = j2;
            }
            i3 |= i8;
        } else {
            jM9292contentColorForek8zF_U = j2;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                fM9145getContainerElevationD9Ej5fM = f;
                i3 |= composerStartRestartGroup.changed(fM9145getContainerElevationD9Ej5fM) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else {
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    contentPadding = paddingValues;
                    i3 |= composerStartRestartGroup.changed(contentPadding) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        int i10 = composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
                        i3 |= i10;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i3 |= i10;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i2 & 64) == 0) {
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i6 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i9 != 0) {
                                fM9145getContainerElevationD9Ej5fM = BottomAppBarDefaults.INSTANCE.m9145getContainerElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                contentPadding = BottomAppBarDefaults.INSTANCE.getContentPadding();
                            }
                            if ((i2 & 32) == 0) {
                                i5 = i3 & (-458753);
                                paddingValues2 = contentPadding;
                                windowInsets3 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                f2 = fM9145getContainerElevationD9Ej5fM;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1391700845, i5, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:533)");
                            }
                            m9129BottomAppBare3WI5M(modifier2, containerColor, jM9292contentColorForek8zF_U, f2, paddingValues2, windowInsets3, null, function3, composerStartRestartGroup, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            fM9145getContainerElevationD9Ej5fM = f2;
                            contentPadding = paddingValues2;
                            windowInsets2 = windowInsets3;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier2 = modifier;
                        }
                        i5 = i3;
                        f2 = fM9145getContainerElevationD9Ej5fM;
                        paddingValues2 = contentPadding;
                        windowInsets3 = windowInsets2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        m9129BottomAppBare3WI5M(modifier2, containerColor, jM9292contentColorForek8zF_U, f2, paddingValues2, windowInsets3, null, function3, composerStartRestartGroup, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        fM9145getContainerElevationD9Ej5fM = f2;
                        contentPadding = paddingValues2;
                        windowInsets2 = windowInsets3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier3;
                        final long j3 = containerColor;
                        final long j4 = jM9292contentColorForek8zF_U;
                        final float f3 = fM9145getContainerElevationD9Ej5fM;
                        final PaddingValues paddingValues3 = contentPadding;
                        final WindowInsets windowInsets4 = windowInsets2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$4
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

                            public final void invoke(@Nullable Composer composer2, int i11) {
                                AppBarKt.m9127BottomAppBar1oL4kX8(modifier4, j3, j4, f3, paddingValues3, windowInsets4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                if ((i3 & 599187) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i6 == 0) {
                        }
                        if ((i2 & 2) != 0) {
                        }
                        if ((i2 & 4) != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 32) == 0) {
                            i5 = i3;
                            f2 = fM9145getContainerElevationD9Ej5fM;
                            paddingValues2 = contentPadding;
                            windowInsets3 = windowInsets2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        m9129BottomAppBare3WI5M(modifier2, containerColor, jM9292contentColorForek8zF_U, f2, paddingValues2, windowInsets3, null, function3, composerStartRestartGroup, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        fM9145getContainerElevationD9Ej5fM = f2;
                        contentPadding = paddingValues2;
                        windowInsets2 = windowInsets3;
                        modifier3 = modifier2;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            contentPadding = paddingValues;
            if ((196608 & i) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        fM9145getContainerElevationD9Ej5fM = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        contentPadding = paddingValues;
        if ((196608 & i) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:347:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-e-3WI5M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9129BottomAppBare3WI5M(@Nullable Modifier modifier, long j, long j2, float f, @Nullable PaddingValues paddingValues, @Nullable WindowInsets windowInsets, @Nullable BottomAppBarScrollBehavior bottomAppBarScrollBehavior, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        long containerColor;
        long jM9292contentColorForek8zF_U;
        float fM9145getContainerElevationD9Ej5fM;
        int i4;
        PaddingValues contentPadding;
        int i5;
        Modifier modifier2;
        WindowInsets windowInsets2;
        final WindowInsets windowInsets3;
        float f2;
        int i6;
        final PaddingValues paddingValues2;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        Modifier modifierDraggable;
        boolean z;
        Object objRememberedValue;
        Modifier modifier3;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior3;
        final float f3;
        final long j3;
        final PaddingValues paddingValues3;
        final long j4;
        final WindowInsets windowInsets4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(422438773);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                containerColor = j;
                int i8 = composerStartRestartGroup.changed(containerColor) ? 32 : 16;
                i3 |= i8;
            } else {
                containerColor = j;
            }
            i3 |= i8;
        } else {
            containerColor = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jM9292contentColorForek8zF_U = j2;
                int i9 = composerStartRestartGroup.changed(jM9292contentColorForek8zF_U) ? 256 : 128;
                i3 |= i9;
            } else {
                jM9292contentColorForek8zF_U = j2;
            }
            i3 |= i9;
        } else {
            jM9292contentColorForek8zF_U = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                fM9145getContainerElevationD9Ej5fM = f;
                i3 |= composerStartRestartGroup.changed(fM9145getContainerElevationD9Ej5fM) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    contentPadding = paddingValues;
                    i3 |= composerStartRestartGroup.changed(contentPadding) ? 16384 : 8192;
                }
                if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i3 |= ((i2 & 32) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(bottomAppBarScrollBehavior) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier2 = i7 == 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 2) != 0) {
                            containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                        }
                        if (i10 != 0) {
                            fM9145getContainerElevationD9Ej5fM = BottomAppBarDefaults.INSTANCE.m9145getContainerElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            contentPadding = BottomAppBarDefaults.INSTANCE.getContentPadding();
                        }
                        if ((i2 & 32) == 0) {
                            windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        windowInsets3 = windowInsets2;
                        f2 = fM9145getContainerElevationD9Ej5fM;
                        i6 = i3;
                        paddingValues2 = contentPadding;
                        if (i5 == 0) {
                            bottomAppBarScrollBehavior2 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(422438773, i6, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:584)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1291864525);
                        if (bottomAppBarScrollBehavior2 != null && !bottomAppBarScrollBehavior2.getIsPinned()) {
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Orientation orientation = Orientation.Vertical;
                            composerStartRestartGroup.startReplaceableGroup(1291864702);
                            int i11 = i6 & 3670016;
                            boolean z2 = i11 == 1048576;
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$appBarDragModifier$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f4) {
                                        invoke(f4.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(float f4) {
                                        BottomAppBarState state = bottomAppBarScrollBehavior2.getState();
                                        state.setHeightOffset(state.getHeightOffset() - f4);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue2, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1291864815);
                            boolean z3 = i11 == 1048576;
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new AppBarKt$BottomAppBar$appBarDragModifier$2$1(bottomAppBarScrollBehavior2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifierDraggable = DraggableKt.draggable(companion, draggableStateRememberDraggableState, orientation, (TsExtractor.TS_PACKET_SIZE & 4) != 0, (TsExtractor.TS_PACKET_SIZE & 8) != 0 ? null : null, (TsExtractor.TS_PACKET_SIZE & 16) != 0 ? false : false, (TsExtractor.TS_PACKET_SIZE & 32) != 0 ? new DraggableKt.C04701(null) : null, (TsExtractor.TS_PACKET_SIZE & 64) != 0 ? new DraggableKt.C04712(null) : (Function3) objRememberedValue3, (TsExtractor.TS_PACKET_SIZE & 128) != 0 ? false : false);
                        } else {
                            modifierDraggable = Modifier.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Shape value = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(1291865671);
                        z = (3670016 & i6) != 1048576;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                    return m9135invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                }

                                @NotNull
                                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                public final MeasureResult m9135invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j5) {
                                    BottomAppBarState state;
                                    BottomAppBarScrollBehavior bottomAppBarScrollBehavior4 = bottomAppBarScrollBehavior2;
                                    BottomAppBarState state2 = bottomAppBarScrollBehavior4 != null ? bottomAppBarScrollBehavior4.getState() : null;
                                    if (state2 != null) {
                                        state2.setHeightOffsetLimit(-measureScope.mo7874toPx0680j_4(BottomAppBarTokens.INSTANCE.m10213getContainerHeightD9Ej5fM()));
                                    }
                                    final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(j5);
                                    float height = placeableMo12610measureBRTryo0.getHeight();
                                    BottomAppBarScrollBehavior bottomAppBarScrollBehavior5 = bottomAppBarScrollBehavior2;
                                    return MeasureScope.layout$default(measureScope, placeableMo12610measureBRTryo0.getWidth(), MathKt__MathJVMKt.roundToInt(height + ((bottomAppBarScrollBehavior5 == null || (state = bottomAppBarScrollBehavior5.getState()) == null) ? 0.0f : state.getHeightOffset())), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1.1
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
                                            Placeable.PlacementScope.place$default(placementScope, placeableMo12610measureBRTryo0, 0, 0, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifier3 = modifier2;
                        int i12 = i6 << 3;
                        int i13 = (i12 & 896) | 12582912 | (i12 & 7168) | (i12 & 57344);
                        BottomAppBarScrollBehavior bottomAppBarScrollBehavior4 = bottomAppBarScrollBehavior2;
                        SurfaceKt.m9876SurfaceT9BRK9s(LayoutModifierKt.layout(modifier2, (Function3) objRememberedValue).then(modifierDraggable), value, containerColor, jM9292contentColorForek8zF_U, f2, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1243053520, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$6
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
                                        ComposerKt.traceEventStart(1243053520, i14, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:629)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m8158height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), windowInsets3), BottomAppBarTokens.INSTANCE.m10213getContainerHeightD9Ej5fM()), paddingValues2);
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                    composer2.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
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
                        }), composerStartRestartGroup, i13, 96);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        WindowInsets windowInsets5 = windowInsets3;
                        bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior4;
                        f3 = f2;
                        j3 = containerColor;
                        long j5 = jM9292contentColorForek8zF_U;
                        paddingValues3 = paddingValues2;
                        j4 = j5;
                        windowInsets4 = windowInsets5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier2 = modifier;
                        windowInsets3 = windowInsets;
                        f2 = fM9145getContainerElevationD9Ej5fM;
                        i6 = i3;
                        paddingValues2 = contentPadding;
                    }
                    bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1291864525);
                    if (bottomAppBarScrollBehavior2 != null) {
                        modifierDraggable = Modifier.INSTANCE;
                        composerStartRestartGroup.endReplaceableGroup();
                        Shape value2 = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(1291865671);
                        if ((3670016 & i6) != 1048576) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                    return m9135invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                }

                                @NotNull
                                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                public final MeasureResult m9135invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j52) {
                                    BottomAppBarState state;
                                    BottomAppBarScrollBehavior bottomAppBarScrollBehavior42 = bottomAppBarScrollBehavior2;
                                    BottomAppBarState state2 = bottomAppBarScrollBehavior42 != null ? bottomAppBarScrollBehavior42.getState() : null;
                                    if (state2 != null) {
                                        state2.setHeightOffsetLimit(-measureScope.mo7874toPx0680j_4(BottomAppBarTokens.INSTANCE.m10213getContainerHeightD9Ej5fM()));
                                    }
                                    final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(j52);
                                    float height = placeableMo12610measureBRTryo0.getHeight();
                                    BottomAppBarScrollBehavior bottomAppBarScrollBehavior5 = bottomAppBarScrollBehavior2;
                                    return MeasureScope.layout$default(measureScope, placeableMo12610measureBRTryo0.getWidth(), MathKt__MathJVMKt.roundToInt(height + ((bottomAppBarScrollBehavior5 == null || (state = bottomAppBarScrollBehavior5.getState()) == null) ? 0.0f : state.getHeightOffset())), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1.1
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
                                            Placeable.PlacementScope.place$default(placementScope, placeableMo12610measureBRTryo0, 0, 0, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier3 = modifier2;
                            int i122 = i6 << 3;
                            int i132 = (i122 & 896) | 12582912 | (i122 & 7168) | (i122 & 57344);
                            BottomAppBarScrollBehavior bottomAppBarScrollBehavior42 = bottomAppBarScrollBehavior2;
                            SurfaceKt.m9876SurfaceT9BRK9s(LayoutModifierKt.layout(modifier2, (Function3) objRememberedValue).then(modifierDraggable), value2, containerColor, jM9292contentColorForek8zF_U, f2, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1243053520, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$6
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
                                            ComposerKt.traceEventStart(1243053520, i14, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:629)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(SizeKt.m8158height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), windowInsets3), BottomAppBarTokens.INSTANCE.m10213getContainerHeightD9Ej5fM()), paddingValues2);
                                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                        composer2.startReplaceableGroup(693286680);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
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
                            }), composerStartRestartGroup, i132, 96);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            WindowInsets windowInsets52 = windowInsets3;
                            bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior42;
                            f3 = f2;
                            j3 = containerColor;
                            long j52 = jM9292contentColorForek8zF_U;
                            paddingValues3 = paddingValues2;
                            j4 = j52;
                            windowInsets4 = windowInsets52;
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                    j3 = containerColor;
                    j4 = jM9292contentColorForek8zF_U;
                    f3 = fM9145getContainerElevationD9Ej5fM;
                    paddingValues3 = contentPadding;
                    windowInsets4 = windowInsets;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$7
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
                            AppBarKt.m9129BottomAppBare3WI5M(modifier4, j3, j4, f3, paddingValues3, windowInsets4, bottomAppBarScrollBehavior3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= CpioConstants.C_ISBLK;
            contentPadding = paddingValues;
            if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((4793491 & i3) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 32) == 0) {
                    }
                    windowInsets3 = windowInsets2;
                    f2 = fM9145getContainerElevationD9Ej5fM;
                    i6 = i3;
                    paddingValues2 = contentPadding;
                    if (i5 == 0) {
                        bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1291864525);
                    if (bottomAppBarScrollBehavior2 != null) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        fM9145getContainerElevationD9Ej5fM = f;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        contentPadding = paddingValues;
        if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((4793491 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final TopAppBarState rememberTopAppBarState(final float f, final float f2, final float f3, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1801969826);
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1051)");
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.INSTANCE.getSaver();
        composer.startReplaceableGroup(1171243704);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(f3)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<TopAppBarState>() { // from class: androidx.compose.material3.AppBarKt$rememberTopAppBarState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final TopAppBarState invoke() {
                    return new TopAppBarState(f, f2, f3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m10957rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarState;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final BottomAppBarState rememberBottomAppBarState(final float f, final float f2, final float f3, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1420874240);
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420874240, i, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:1372)");
        }
        Object[] objArr = new Object[0];
        Saver<BottomAppBarState, ?> saver = BottomAppBarState.INSTANCE.getSaver();
        composer.startReplaceableGroup(647586024);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(f3)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<BottomAppBarState>() { // from class: androidx.compose.material3.AppBarKt$rememberBottomAppBarState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final BottomAppBarState invoke() {
                    return AppBarKt.BottomAppBarState(f, f2, f3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        BottomAppBarState bottomAppBarState = (BottomAppBarState) RememberSaveableKt.m10957rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomAppBarState;
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final BottomAppBarState BottomAppBarState(float f, float f2, float f3) {
        return new BottomAppBarStateImpl(f, f2, f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0017  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBarBottom(BottomAppBarState bottomAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Continuation<? super Velocity> continuation) throws Throwable {
        C13141 c13141;
        Ref.FloatRef floatRef;
        AnimationSpec<Float> animationSpec2;
        Ref.FloatRef floatRef2;
        BottomAppBarState bottomAppBarState2 = bottomAppBarState;
        if (continuation instanceof C13141) {
            c13141 = (C13141) continuation;
            int i = c13141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13141.label = i - Integer.MIN_VALUE;
            } else {
                c13141 = new C13141(continuation);
            }
        }
        Object obj = c13141.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13141.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (bottomAppBarState.getCollapsedFraction() < 0.01f || bottomAppBarState.getCollapsedFraction() == 1.0f) {
                return Velocity.m13892boximpl(Velocity.INSTANCE.m13912getZero9UxMQ8M());
            }
            floatRef = new Ref.FloatRef();
            floatRef.element = f;
            if (decayAnimationSpec == null || Math.abs(f) <= 1.0f) {
                animationSpec2 = animationSpec;
            } else {
                Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                C13152 c13152 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt.settleAppBarBottom.2
                    public final /* synthetic */ Ref.FloatRef $remainingVelocity;
                    public final /* synthetic */ BottomAppBarState $state;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C13152(BottomAppBarState bottomAppBarState22, Ref.FloatRef floatRef4) {
                        super(1);
                        bottomAppBarState = bottomAppBarState22;
                        floatRef = floatRef4;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                        float fFloatValue = animationScope.getValue().floatValue() - floatRef.element;
                        float heightOffset = bottomAppBarState.getHeightOffset();
                        bottomAppBarState.setHeightOffset(heightOffset + fFloatValue);
                        float fAbs = Math.abs(heightOffset - bottomAppBarState.getHeightOffset());
                        floatRef.element = animationScope.getValue().floatValue();
                        floatRef.element = animationScope.getVelocity().floatValue();
                        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                            animationScope.cancelAnimation();
                        }
                    }
                };
                c13141.L$0 = bottomAppBarState22;
                animationSpec2 = animationSpec;
                c13141.L$1 = animationSpec2;
                c13141.L$2 = floatRef4;
                c13141.label = 1;
                if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, c13152, c13141, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef2 = (Ref.FloatRef) c13141.L$0;
                ResultKt.throwOnFailure(obj);
                floatRef4 = floatRef2;
                return Velocity.m13892boximpl(VelocityKt.Velocity(0.0f, floatRef4.element));
            }
            Ref.FloatRef floatRef4 = (Ref.FloatRef) c13141.L$2;
            AnimationSpec<Float> animationSpec3 = (AnimationSpec) c13141.L$1;
            BottomAppBarState bottomAppBarState3 = (BottomAppBarState) c13141.L$0;
            ResultKt.throwOnFailure(obj);
            floatRef4 = floatRef4;
            animationSpec2 = animationSpec3;
            bottomAppBarState22 = bottomAppBarState3;
        }
        AnimationSpec<Float> animationSpec4 = animationSpec2;
        if (animationSpec4 != null && bottomAppBarState22.getHeightOffset() < 0.0f && bottomAppBarState22.getHeightOffset() > bottomAppBarState22.getHeightOffsetLimit()) {
            AnimationState animationStateAnimationState$default2 = AnimationStateKt.AnimationState$default(bottomAppBarState22.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            Float fBoxFloat = Boxing.boxFloat(bottomAppBarState22.getCollapsedFraction() < 0.5f ? 0.0f : bottomAppBarState22.getHeightOffsetLimit());
            C13163 c13163 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt.settleAppBarBottom.3
                public C13163() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                    bottomAppBarState.setHeightOffset(animationScope.getValue().floatValue());
                }
            };
            c13141.L$0 = floatRef4;
            c13141.L$1 = null;
            c13141.L$2 = null;
            c13141.label = 2;
            if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default2, fBoxFloat, animationSpec4, false, c13163, c13141, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef2 = floatRef4;
            floatRef4 = floatRef2;
        }
        return Velocity.m13892boximpl(VelocityKt.Velocity(0.0f, floatRef4.element));
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBarBottom$2 */
    /* loaded from: classes.dex */
    public static final class C13152 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        public final /* synthetic */ Ref.FloatRef $remainingVelocity;
        public final /* synthetic */ BottomAppBarState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13152(BottomAppBarState bottomAppBarState22, Ref.FloatRef floatRef4) {
            super(1);
            bottomAppBarState = bottomAppBarState22;
            floatRef = floatRef4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
            float fFloatValue = animationScope.getValue().floatValue() - floatRef.element;
            float heightOffset = bottomAppBarState.getHeightOffset();
            bottomAppBarState.setHeightOffset(heightOffset + fFloatValue);
            float fAbs = Math.abs(heightOffset - bottomAppBarState.getHeightOffset());
            floatRef.element = animationScope.getValue().floatValue();
            floatRef.element = animationScope.getVelocity().floatValue();
            if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                animationScope.cancelAnimation();
            }
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBarBottom$3 */
    /* loaded from: classes.dex */
    public static final class C13163 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        public C13163() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
            bottomAppBarState.setHeightOffset(animationScope.getValue().floatValue());
        }
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SingleRowTopAppBar(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifierDraggable;
        Modifier modifier3;
        TopAppBarState state;
        Composer composerStartRestartGroup = composer.startRestartGroup(1841601619);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= CpioConstants.C_ISBLK;
        } else if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
        } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(topAppBarColors) ? 8388608 : 4194304;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1841601619, i3, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1635)");
            }
            final float f = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m10761getContainerHeightD9Ej5fM());
            composerStartRestartGroup.startReplaceableGroup(-1008351447);
            int i5 = i3 & 234881024;
            boolean zChanged = (i5 == 67108864) | composerStartRestartGroup.changed(f);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$1$1
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
                        TopAppBarState state2;
                        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state2.getHeightOffsetLimit()), f)) {
                            return;
                        }
                        TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                        TopAppBarState state3 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                        if (state3 == null) {
                            return;
                        }
                        state3.setHeightOffsetLimit(f);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
            Modifier modifier5 = modifier4;
            State<Color> stateM7665animateColorAsStateeuL9pac = SingleValueAnimationKt.m7665animateColorAsStateeuL9pac(topAppBarColors.m10172containerColorvNxB06k$material3_release(((topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getOverlappedFraction()) > 0.01f ? 1.0f : 0.0f), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, null, composerStartRestartGroup, 48, 12);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1520880938, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1
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
                public final void invoke(@Nullable Composer composer2, int i6) {
                    if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1520880938, i6, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1659)");
                        }
                        Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                        composer2.startReplaceableGroup(693286680);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            });
            composerStartRestartGroup.startReplaceableGroup(-1008350212);
            if (topAppBarScrollBehavior != null && !topAppBarScrollBehavior.getIsPinned()) {
                Modifier.Companion companion = Modifier.INSTANCE;
                Orientation orientation = Orientation.Vertical;
                composerStartRestartGroup.startReplaceableGroup(-1008350035);
                boolean z2 = i5 == 67108864;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                            invoke(f2.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f2) {
                            topAppBarScrollBehavior.getState().setHeightOffset(topAppBarScrollBehavior.getState().getHeightOffset() + f2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1008349887);
                boolean z3 = i5 == 67108864;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierDraggable = DraggableKt.draggable(companion, draggableStateRememberDraggableState, orientation, (TsExtractor.TS_PACKET_SIZE & 4) != 0, (TsExtractor.TS_PACKET_SIZE & 8) != 0 ? null : null, (TsExtractor.TS_PACKET_SIZE & 16) != 0 ? false : false, (TsExtractor.TS_PACKET_SIZE & 32) != 0 ? new DraggableKt.C04701(null) : null, (TsExtractor.TS_PACKET_SIZE & 64) != 0 ? new DraggableKt.C04712(null) : (Function3) objRememberedValue3, (TsExtractor.TS_PACKET_SIZE & 128) != 0 ? false : false);
            } else {
                modifierDraggable = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifier3 = modifier5;
            SurfaceKt.m9876SurfaceT9BRK9s(modifier5.then(modifierDraggable), null, SingleRowTopAppBar$lambda$7(stateM7665animateColorAsStateeuL9pac), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 376925230, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.SingleRowTopAppBar.2
                public final /* synthetic */ Function2<Composer, Integer, Unit> $actionsRow;
                public final /* synthetic */ boolean $centeredTitle;
                public final /* synthetic */ TopAppBarColors $colors;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                public final /* synthetic */ TextStyle $titleTextStyle;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C13062(TopAppBarColors topAppBarColors2, Function2<? super Composer, ? super Integer, Unit> function23, TextStyle textStyle2, boolean z4, Function2<? super Composer, ? super Integer, Unit> function222, Function2<? super Composer, ? super Integer, Unit> composableLambda2, final TopAppBarScrollBehavior topAppBarScrollBehavior2) {
                    super(2);
                    topAppBarColors = topAppBarColors2;
                    function2 = function23;
                    textStyle = textStyle2;
                    z = z4;
                    function2 = function222;
                    function2 = composableLambda2;
                    topAppBarScrollBehavior = topAppBarScrollBehavior2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i6) {
                    TopAppBarState state2;
                    if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(376925230, i6, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1691)");
                        }
                        Object objConsume = composer2.consume(CompositionLocalsKt.getLocalDensity());
                        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        float fMo7874toPx0680j_4 = ((Density) objConsume).mo7874toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m10761getContainerHeightD9Ej5fM()) + ((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? 0.0f : state2.getHeightOffset());
                        Modifier modifierClipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.INSTANCE, windowInsets));
                        long navigationIconContentColor = topAppBarColors.getNavigationIconContentColor();
                        long titleContentColor = topAppBarColors.getTitleContentColor();
                        long actionIconContentColor = topAppBarColors.getActionIconContentColor();
                        Function2<Composer, Integer, Unit> function23 = function2;
                        TextStyle textStyle2 = textStyle;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        AppBarKt.m9131TopAppBarLayoutkXwM9vE(modifierClipToBounds, fMo7874toPx0680j_4, navigationIconContentColor, titleContentColor, actionIconContentColor, function23, textStyle2, 1.0f, arrangement.getCenter(), z ? arrangement.getCenter() : arrangement.getStart(), 0, false, function2, function2, composer2, 113246208, 3126);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 12582912, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.SingleRowTopAppBar.3
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $actions;
                public final /* synthetic */ boolean $centeredTitle;
                public final /* synthetic */ TopAppBarColors $colors;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
                public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
                public final /* synthetic */ TextStyle $titleTextStyle;
                public final /* synthetic */ WindowInsets $windowInsets;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C13073(Function2<? super Composer, ? super Integer, Unit> function23, TextStyle textStyle2, boolean z4, Function2<? super Composer, ? super Integer, Unit> function222, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, WindowInsets windowInsets2, TopAppBarColors topAppBarColors2, final TopAppBarScrollBehavior topAppBarScrollBehavior2, int i6, int i22) {
                    super(2);
                    function2 = function23;
                    textStyle = textStyle2;
                    z = z4;
                    function2 = function222;
                    function3 = function32;
                    windowInsets = windowInsets2;
                    topAppBarColors = topAppBarColors2;
                    topAppBarScrollBehavior = topAppBarScrollBehavior2;
                    i = i6;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    AppBarKt.SingleRowTopAppBar(modifier, function2, textStyle, z, function2, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,2283:1\n74#2:2284\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$2\n*L\n1692#1:2284\n*E\n"})
    /* renamed from: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2 */
    /* loaded from: classes.dex */
    public static final class C13062 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> $actionsRow;
        public final /* synthetic */ boolean $centeredTitle;
        public final /* synthetic */ TopAppBarColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $navigationIcon;
        public final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $title;
        public final /* synthetic */ TextStyle $titleTextStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13062(TopAppBarColors topAppBarColors2, Function2<? super Composer, ? super Integer, Unit> function23, TextStyle textStyle2, boolean z4, Function2<? super Composer, ? super Integer, Unit> function222, Function2<? super Composer, ? super Integer, Unit> composableLambda2, final TopAppBarScrollBehavior topAppBarScrollBehavior2) {
            super(2);
            topAppBarColors = topAppBarColors2;
            function2 = function23;
            textStyle = textStyle2;
            z = z4;
            function2 = function222;
            function2 = composableLambda2;
            topAppBarScrollBehavior = topAppBarScrollBehavior2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i6) {
            TopAppBarState state2;
            if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(376925230, i6, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1691)");
                }
                Object objConsume = composer2.consume(CompositionLocalsKt.getLocalDensity());
                TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                float fMo7874toPx0680j_4 = ((Density) objConsume).mo7874toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m10761getContainerHeightD9Ej5fM()) + ((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? 0.0f : state2.getHeightOffset());
                Modifier modifierClipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.INSTANCE, windowInsets));
                long navigationIconContentColor = topAppBarColors.getNavigationIconContentColor();
                long titleContentColor = topAppBarColors.getTitleContentColor();
                long actionIconContentColor = topAppBarColors.getActionIconContentColor();
                Function2<Composer, Integer, Unit> function23 = function2;
                TextStyle textStyle2 = textStyle;
                Arrangement arrangement = Arrangement.INSTANCE;
                AppBarKt.m9131TopAppBarLayoutkXwM9vE(modifierClipToBounds, fMo7874toPx0680j_4, navigationIconContentColor, titleContentColor, actionIconContentColor, function23, textStyle2, 1.0f, arrangement.getCenter(), z ? arrangement.getCenter() : arrangement.getStart(), 0, false, function2, function2, composer2, 113246208, 3126);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:240:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:407:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TwoRowsTopAppBar-tjU4iQQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9132TwoRowsTopAppBartjU4iQQ(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f, final Function2<? super Composer, ? super Integer, Unit> function22, final TextStyle textStyle2, final Function2<? super Composer, ? super Integer, Unit> function23, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final float f2, final float f3, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifierDraggable;
        Composer composer2;
        final Modifier modifier2;
        TopAppBarState state;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(210227552);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else {
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i4 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function23) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if ((i3 & 256) == 0) {
                    if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(windowInsets) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i3 & 512) == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= composerStartRestartGroup.changed(topAppBarColors) ? 536870912 : 268435456;
                    }
                    if ((i3 & 1024) == 0) {
                        i5 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i5 = i2 | (composerStartRestartGroup.changed(f2) ? 4 : 2);
                    } else {
                        i5 = i2;
                    }
                    if ((i3 & 2048) == 0) {
                        i5 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i5 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
                    }
                    if ((i3 & 4096) == 0) {
                        i5 |= 384;
                    } else if ((i2 & 384) == 0) {
                        i5 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 256 : 128;
                    }
                    if ((306783379 & i4) == 306783378 || (i5 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(210227552, i4, i5, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:1741)");
                        }
                        if (C2046Dp.m13665compareTo0680j_4(f2, f3) > 0) {
                            throw new IllegalArgumentException("A TwoRowsTopAppBar max height should be greater than its pinned height");
                        }
                        final Ref.FloatRef floatRef = new Ref.FloatRef();
                        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                        final Ref.IntRef intRef = new Ref.IntRef();
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        floatRef.element = density.mo7874toPx0680j_4(f3);
                        floatRef2.element = density.mo7874toPx0680j_4(f2);
                        intRef.element = density.mo7868roundToPx0680j_4(f);
                        composerStartRestartGroup.startReplaceableGroup(-1609641260);
                        int i7 = i5 & 896;
                        boolean zChanged = composerStartRestartGroup.changed(floatRef.element) | (i7 == 256) | composerStartRestartGroup.changed(floatRef2.element);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$2$1
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
                                    TopAppBarState state2;
                                    TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state2.getHeightOffsetLimit()), floatRef.element - floatRef2.element)) {
                                        return;
                                    }
                                    TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    TopAppBarState state3 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                    if (state3 == null) {
                                        return;
                                    }
                                    state3.setHeightOffsetLimit(floatRef.element - floatRef2.element);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                        float collapsedFraction = (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getCollapsedFraction();
                        long jM10172containerColorvNxB06k$material3_release = topAppBarColors.m10172containerColorvNxB06k$material3_release(collapsedFraction);
                        final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1048401111, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$actionsRow$1
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
                            public final void invoke(@Nullable Composer composer3, int i8) {
                                if ((i8 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1048401111, i8, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1774)");
                                    }
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                    composer3.startReplaceableGroup(693286680);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer3, 54);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
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
                        });
                        final float fTransform = TopTitleAlphaEasing.transform(collapsedFraction);
                        final float f4 = 1.0f - collapsedFraction;
                        final boolean z = collapsedFraction < 0.5f;
                        final boolean z2 = !z;
                        composerStartRestartGroup.startReplaceableGroup(-1609639731);
                        if (topAppBarScrollBehavior != null && !topAppBarScrollBehavior.getIsPinned()) {
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Orientation orientation = Orientation.Vertical;
                            composerStartRestartGroup.startReplaceableGroup(-1609639554);
                            boolean z3 = i7 == 256;
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f5) {
                                        invoke(f5.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(float f5) {
                                        topAppBarScrollBehavior.getState().setHeightOffset(topAppBarScrollBehavior.getState().getHeightOffset() + f5);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue2, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1609639406);
                            boolean z4 = i7 == 256;
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifierDraggable = DraggableKt.draggable(companion, draggableStateRememberDraggableState, orientation, (TsExtractor.TS_PACKET_SIZE & 4) != 0, (TsExtractor.TS_PACKET_SIZE & 8) != 0 ? null : null, (TsExtractor.TS_PACKET_SIZE & 16) != 0 ? false : false, (TsExtractor.TS_PACKET_SIZE & 32) != 0 ? new DraggableKt.C04701(null) : null, (TsExtractor.TS_PACKET_SIZE & 64) != 0 ? new DraggableKt.C04712(null) : (Function3) objRememberedValue3, (TsExtractor.TS_PACKET_SIZE & 128) != 0 ? false : false);
                        } else {
                            modifierDraggable = Modifier.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier4 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m9876SurfaceT9BRK9s(modifier3.then(modifierDraggable), null, jM10172containerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, 1985938853, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$3
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
                            public final void invoke(@Nullable Composer composer3, int i8) {
                                TopAppBarState state2;
                                if ((i8 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1985938853, i8, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1808)");
                                    }
                                    WindowInsets windowInsets2 = windowInsets;
                                    Ref.FloatRef floatRef3 = floatRef;
                                    TopAppBarColors topAppBarColors2 = topAppBarColors;
                                    Function2<Composer, Integer, Unit> function24 = function22;
                                    TextStyle textStyle3 = textStyle2;
                                    float f5 = fTransform;
                                    boolean z5 = z;
                                    Function2<Composer, Integer, Unit> function25 = function23;
                                    Function2<Composer, Integer, Unit> function26 = composableLambda;
                                    Ref.FloatRef floatRef4 = floatRef2;
                                    TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    Function2<Composer, Integer, Unit> function27 = function2;
                                    TextStyle textStyle4 = textStyle;
                                    float f6 = f4;
                                    Ref.IntRef intRef2 = intRef;
                                    boolean z6 = z2;
                                    composer3.startReplaceableGroup(-483455358);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    AppBarKt.m9131TopAppBarLayoutkXwM9vE(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion2, windowInsets2)), floatRef3.element, topAppBarColors2.getNavigationIconContentColor(), topAppBarColors2.getTitleContentColor(), topAppBarColors2.getActionIconContentColor(), function24, textStyle3, f5, arrangement.getCenter(), arrangement.getStart(), 0, z5, function25, function26, composer3, 905969664, 3078);
                                    Modifier modifierClipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion2, WindowInsetsKt.m8198onlybOOhFvg(windowInsets2, WindowInsetsSides.INSTANCE.m8219getHorizontalJoeWqyM())));
                                    float heightOffset = ((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? 0.0f : state2.getHeightOffset()) + (floatRef4.element - floatRef3.element);
                                    long navigationIconContentColor = topAppBarColors2.getNavigationIconContentColor();
                                    long titleContentColor = topAppBarColors2.getTitleContentColor();
                                    long actionIconContentColor = topAppBarColors2.getActionIconContentColor();
                                    Arrangement.Vertical bottom = arrangement.getBottom();
                                    Arrangement.Horizontal start = arrangement.getStart();
                                    int i9 = intRef2.element;
                                    ComposableSingletons$AppBarKt composableSingletons$AppBarKt = ComposableSingletons$AppBarKt.INSTANCE;
                                    AppBarKt.m9131TopAppBarLayoutkXwM9vE(modifierClipToBounds, heightOffset, navigationIconContentColor, titleContentColor, actionIconContentColor, function27, textStyle4, f6, bottom, start, i9, z6, composableSingletons$AppBarKt.m9304getLambda11$material3_release(), composableSingletons$AppBarKt.m9305getLambda12$material3_release(), composer3, 905969664, 3456);
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
                        }), composer2, 12582912, 122);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$4
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

                            public final void invoke(@Nullable Composer composer3, int i8) {
                                AppBarKt.m9132TwoRowsTopAppBartjU4iQQ(modifier2, function2, textStyle, f, function22, textStyle2, function23, function3, windowInsets, topAppBarColors, f2, f3, topAppBarScrollBehavior, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 100663296;
                if ((i3 & 512) == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if ((i3 & 4096) == 0) {
                }
                if ((306783379 & i4) == 306783378) {
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (C2046Dp.m13665compareTo0680j_4(f2, f3) > 0) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBarLayout-kXwM9vE */
    public static final void m9131TopAppBarLayoutkXwM9vE(final Modifier modifier, final float f, final long j, final long j2, final long j3, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f2, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-6794037);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= composerStartRestartGroup.changed(j3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(textStyle) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(vertical) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(horizontal) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(i) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
        }
        int i6 = i5;
        if ((i4 & 306783379) != 306783378 || (i6 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6794037, i4, i6, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:1899)");
            }
            composerStartRestartGroup.startReplaceableGroup(1019460550);
            boolean z2 = ((i4 & 112) == 32) | ((1879048192 & i4) == 536870912) | ((234881024 & i4) == 67108864) | ((i6 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1
                    @Override // androidx.compose.p003ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo7599measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, final long j4) {
                        int iCoerceAtLeast;
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            Measurable measurable = list.get(i7);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                                final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
                                int size2 = list.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    Measurable measurable2 = list.get(i8);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                                        final Placeable placeableMo12610measureBRTryo02 = measurable2.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
                                        if (Constraints.m13622getMaxWidthimpl(j4) == Integer.MAX_VALUE) {
                                            iCoerceAtLeast = Constraints.m13622getMaxWidthimpl(j4);
                                        } else {
                                            iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast((Constraints.m13622getMaxWidthimpl(j4) - placeableMo12610measureBRTryo0.getWidth()) - placeableMo12610measureBRTryo02.getWidth(), 0);
                                        }
                                        int i9 = iCoerceAtLeast;
                                        int size3 = list.size();
                                        for (int i10 = 0; i10 < size3; i10++) {
                                            Measurable measurable3 = list.get(i10);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "title")) {
                                                final Placeable placeableMo12610measureBRTryo03 = measurable3.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j4, 0, i9, 0, 0, 12, null));
                                                final int i11 = placeableMo12610measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? placeableMo12610measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) : 0;
                                                final int iRoundToInt = Float.isNaN(f) ? 0 : MathKt__MathJVMKt.roundToInt(f);
                                                int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j4);
                                                final Arrangement.Horizontal horizontal2 = horizontal;
                                                final Arrangement.Vertical vertical2 = vertical;
                                                final int i12 = i;
                                                return MeasureScope.layout$default(measureScope, iM13622getMaxWidthimpl, iRoundToInt, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1.1
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
                                                        int iMax;
                                                        int i13;
                                                        int height;
                                                        int iMax2;
                                                        int height2;
                                                        int iM13622getMaxWidthimpl2;
                                                        Placeable placeable = placeableMo12610measureBRTryo0;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (iRoundToInt - placeable.getHeight()) / 2, 0.0f, 4, null);
                                                        Placeable placeable2 = placeableMo12610measureBRTryo03;
                                                        Arrangement.Horizontal horizontal3 = horizontal2;
                                                        Arrangement arrangement = Arrangement.INSTANCE;
                                                        if (Intrinsics.areEqual(horizontal3, arrangement.getCenter())) {
                                                            iMax = (Constraints.m13622getMaxWidthimpl(j4) - placeableMo12610measureBRTryo03.getWidth()) / 2;
                                                            if (iMax < placeableMo12610measureBRTryo0.getWidth()) {
                                                                iM13622getMaxWidthimpl2 = placeableMo12610measureBRTryo0.getWidth() - iMax;
                                                            } else if (placeableMo12610measureBRTryo03.getWidth() + iMax > Constraints.m13622getMaxWidthimpl(j4) - placeableMo12610measureBRTryo02.getWidth()) {
                                                                iM13622getMaxWidthimpl2 = (Constraints.m13622getMaxWidthimpl(j4) - placeableMo12610measureBRTryo02.getWidth()) - (placeableMo12610measureBRTryo03.getWidth() + iMax);
                                                            }
                                                            iMax += iM13622getMaxWidthimpl2;
                                                        } else if (!Intrinsics.areEqual(horizontal3, arrangement.getEnd())) {
                                                            iMax = Math.max(measureScope.mo7868roundToPx0680j_4(AppBarKt.TopAppBarTitleInset), placeableMo12610measureBRTryo0.getWidth());
                                                        } else {
                                                            iMax = (Constraints.m13622getMaxWidthimpl(j4) - placeableMo12610measureBRTryo03.getWidth()) - placeableMo12610measureBRTryo02.getWidth();
                                                        }
                                                        int i14 = iMax;
                                                        Arrangement.Vertical vertical3 = vertical2;
                                                        if (Intrinsics.areEqual(vertical3, arrangement.getCenter())) {
                                                            height2 = (iRoundToInt - placeableMo12610measureBRTryo03.getHeight()) / 2;
                                                        } else if (!Intrinsics.areEqual(vertical3, arrangement.getBottom())) {
                                                            i13 = 0;
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i14, i13, 0.0f, 4, null);
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo02, Constraints.m13622getMaxWidthimpl(j4) - placeableMo12610measureBRTryo02.getWidth(), (iRoundToInt - placeableMo12610measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                        } else {
                                                            if (i12 == 0) {
                                                                height = iRoundToInt;
                                                                iMax2 = placeableMo12610measureBRTryo03.getHeight();
                                                            } else {
                                                                height = iRoundToInt - placeableMo12610measureBRTryo03.getHeight();
                                                                iMax2 = Math.max(0, (i12 - placeableMo12610measureBRTryo03.getHeight()) + i11);
                                                            }
                                                            height2 = height - iMax2;
                                                        }
                                                        i13 = height2;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i14, i13, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo02, Constraints.m13622getMaxWidthimpl(j4) - placeableMo12610measureBRTryo02.getWidth(), (iRoundToInt - placeableMo12610measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
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
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion2, "navigationIcon");
            float f3 = TopAppBarHorizontalPadding;
            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(modifierLayoutId, f3, 0.0f, 0.0f, 0.0f, 14, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j));
            int i7 = ProvidedValue.$stable;
            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, function22, composerStartRestartGroup, ((i6 >> 3) & 112) | i7);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM11501graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(PaddingKt.m8125paddingVpY3zN4$default(LayoutIdKt.layoutId(companion2, "title"), f3, 0.0f, 2, null).then(z ? SemanticsModifierKt.clearAndSetSemantics(companion2, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$1$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }) : companion2), 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM11501graphicsLayerAp8cVGQ$default);
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
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            int i8 = i4 >> 9;
            ProvideContentColorTextStyleKt.m9663ProvideContentColorTextStyle3JVO9M(j2, textStyle, function2, composerStartRestartGroup, ((i4 >> 15) & 112) | (i8 & 14) | (i8 & 896));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(LayoutIdKt.layoutId(companion2, "actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
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
            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion.getSetCompositeKeyHash();
            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j3)), function23, composerStartRestartGroup, ((i6 >> 6) & 112) | i7);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$3
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    AppBarKt.m9131TopAppBarLayoutkXwM9vE(modifier, f, j, j2, j3, function2, textStyle, f2, vertical, horizontal, i, z, function22, function23, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBar(TopAppBarState topAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Continuation<? super Velocity> continuation) throws Throwable {
        C13111 c13111;
        Ref.FloatRef floatRef;
        AnimationSpec<Float> animationSpec2;
        Ref.FloatRef floatRef2;
        TopAppBarState topAppBarState2 = topAppBarState;
        if (continuation instanceof C13111) {
            c13111 = (C13111) continuation;
            int i = c13111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13111.label = i - Integer.MIN_VALUE;
            } else {
                c13111 = new C13111(continuation);
            }
        }
        Object obj = c13111.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13111.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (topAppBarState.getCollapsedFraction() < 0.01f || topAppBarState.getCollapsedFraction() == 1.0f) {
                return Velocity.m13892boximpl(Velocity.INSTANCE.m13912getZero9UxMQ8M());
            }
            floatRef = new Ref.FloatRef();
            floatRef.element = f;
            if (decayAnimationSpec == null || Math.abs(f) <= 1.0f) {
                animationSpec2 = animationSpec;
            } else {
                Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                C13122 c13122 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt.settleAppBar.2
                    public final /* synthetic */ Ref.FloatRef $remainingVelocity;
                    public final /* synthetic */ TopAppBarState $state;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C13122(TopAppBarState topAppBarState22, Ref.FloatRef floatRef4) {
                        super(1);
                        topAppBarState = topAppBarState22;
                        floatRef = floatRef4;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                        float fFloatValue = animationScope.getValue().floatValue() - floatRef.element;
                        float heightOffset = topAppBarState.getHeightOffset();
                        topAppBarState.setHeightOffset(heightOffset + fFloatValue);
                        float fAbs = Math.abs(heightOffset - topAppBarState.getHeightOffset());
                        floatRef.element = animationScope.getValue().floatValue();
                        floatRef.element = animationScope.getVelocity().floatValue();
                        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                            animationScope.cancelAnimation();
                        }
                    }
                };
                c13111.L$0 = topAppBarState22;
                animationSpec2 = animationSpec;
                c13111.L$1 = animationSpec2;
                c13111.L$2 = floatRef4;
                c13111.label = 1;
                if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, c13122, c13111, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef2 = (Ref.FloatRef) c13111.L$0;
                ResultKt.throwOnFailure(obj);
                floatRef4 = floatRef2;
                return Velocity.m13892boximpl(VelocityKt.Velocity(0.0f, floatRef4.element));
            }
            Ref.FloatRef floatRef4 = (Ref.FloatRef) c13111.L$2;
            AnimationSpec<Float> animationSpec3 = (AnimationSpec) c13111.L$1;
            TopAppBarState topAppBarState3 = (TopAppBarState) c13111.L$0;
            ResultKt.throwOnFailure(obj);
            floatRef4 = floatRef4;
            animationSpec2 = animationSpec3;
            topAppBarState22 = topAppBarState3;
        }
        AnimationSpec<Float> animationSpec4 = animationSpec2;
        if (animationSpec4 != null && topAppBarState22.getHeightOffset() < 0.0f && topAppBarState22.getHeightOffset() > topAppBarState22.getHeightOffsetLimit()) {
            AnimationState animationStateAnimationState$default2 = AnimationStateKt.AnimationState$default(topAppBarState22.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            Float fBoxFloat = Boxing.boxFloat(topAppBarState22.getCollapsedFraction() < 0.5f ? 0.0f : topAppBarState22.getHeightOffsetLimit());
            C13133 c13133 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt.settleAppBar.3
                public C13133() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                    topAppBarState.setHeightOffset(animationScope.getValue().floatValue());
                }
            };
            c13111.L$0 = floatRef4;
            c13111.L$1 = null;
            c13111.L$2 = null;
            c13111.label = 2;
            if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default2, fBoxFloat, animationSpec4, false, c13133, c13111, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef2 = floatRef4;
            floatRef4 = floatRef2;
        }
        return Velocity.m13892boximpl(VelocityKt.Velocity(0.0f, floatRef4.element));
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBar$2 */
    /* loaded from: classes.dex */
    public static final class C13122 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        public final /* synthetic */ Ref.FloatRef $remainingVelocity;
        public final /* synthetic */ TopAppBarState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13122(TopAppBarState topAppBarState22, Ref.FloatRef floatRef4) {
            super(1);
            topAppBarState = topAppBarState22;
            floatRef = floatRef4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
            float fFloatValue = animationScope.getValue().floatValue() - floatRef.element;
            float heightOffset = topAppBarState.getHeightOffset();
            topAppBarState.setHeightOffset(heightOffset + fFloatValue);
            float fAbs = Math.abs(heightOffset - topAppBarState.getHeightOffset());
            floatRef.element = animationScope.getValue().floatValue();
            floatRef.element = animationScope.getVelocity().floatValue();
            if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                animationScope.cancelAnimation();
            }
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBar$3 */
    /* loaded from: classes.dex */
    public static final class C13133 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        public C13133() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
            topAppBarState.setHeightOffset(animationScope.getValue().floatValue());
        }
    }

    @NotNull
    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    private static final long SingleRowTopAppBar$lambda$7(State<Color> state) {
        return state.getValue().m11350unboximpl();
    }

    static {
        float f = 16;
        float f2 = 12;
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(f) - C2046Dp.m13666constructorimpl(f2));
        BottomAppBarHorizontalPadding = fM13666constructorimpl;
        float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(f) - C2046Dp.m13666constructorimpl(f2));
        BottomAppBarVerticalPadding = fM13666constructorimpl2;
        FABHorizontalPadding = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(f) - fM13666constructorimpl);
        FABVerticalPadding = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(f2) - fM13666constructorimpl2);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = C2046Dp.m13666constructorimpl(24);
        LargeTitleBottomPadding = C2046Dp.m13666constructorimpl(28);
        float fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(4);
        TopAppBarHorizontalPadding = fM13666constructorimpl3;
        TopAppBarTitleInset = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(f) - fM13666constructorimpl3);
    }
}
