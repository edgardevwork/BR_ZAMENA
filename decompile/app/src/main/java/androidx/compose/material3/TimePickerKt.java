package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.Selection;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.ZIndexModifierKt;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.focus.FocusRequesterModifierKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.BlendMode;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.input.key.KeyEvent;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.input.key.KeyInputModifierKt;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardType;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpOffset;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.CharsKt__CharKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimePicker.kt */
@Metadata(m7104d1 = {"\u0000²\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u001a7\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00190\u001e¢\u0006\u0002\b\u001fH\u0003ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u0010(\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\u0010+\u001a-\u0010,\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*H\u0003¢\u0006\u0002\u0010.\u001a\u0015\u0010/\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u00100\u001a\u001d\u00101\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u00102\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u00103\u001a1\u00104\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\u00105\u001a=\u00106\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0003¢\u0006\u0002\u0010<\u001a)\u0010=\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u0010>\u001a%\u0010?\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020$H\u0003¢\u0006\u0002\u0010@\u001a8\u0010A\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010B\u001a\u00020CH\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001ab\u0010F\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020G2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00190I2\u0006\u0010#\u001a\u00020$2\u0006\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a:\u0010R\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$2\u0006\u0010J\u001a\u00020K2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001aQ\u0010U\u001a\u00020\u00192\u0006\u0010V\u001a\u00020*2\u0006\u0010W\u001a\u00020:2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010%\u001a\u00020&2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00190I¢\u0006\u0002\b\u001f¢\u0006\u0002\bZH\u0003¢\u0006\u0002\u0010[\u001a\u001d\u0010\\\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a%\u0010]\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u00103\u001a1\u0010^\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\u00105\u001a\u0018\u0010_\u001a\u00020\t2\u0006\u0010`\u001a\u00020\t2\u0006\u0010a\u001a\u00020\tH\u0002\u001a(\u0010b\u001a\u00020\t2\u0006\u0010c\u001a\u00020\t2\u0006\u0010d\u001a\u00020\t2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u0007H\u0002\u001a*\u0010g\u001a\u00020h2\u0006\u0010J\u001a\u00020K2\u0006\u0010i\u001a\u00020*2\u0006\u0010j\u001a\u00020\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010l\u001a+\u0010m\u001a\u00020$2\b\b\u0002\u0010n\u001a\u00020\u00072\b\b\u0002\u0010o\u001a\u00020\u00072\b\b\u0002\u0010i\u001a\u00020*H\u0007¢\u0006\u0002\u0010p\u001a]\u0010q\u001a\u00020\u00192\u0006\u0010J\u001a\u00020K2\u0006\u0010#\u001a\u00020$2\u0006\u0010-\u001a\u00020G2\u0006\u0010r\u001a\u00020G2\u0006\u0010s\u001a\u00020\u00072!\u0010t\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bu\u0012\b\bv\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00190IH\u0002ø\u0001\u0000¢\u0006\u0004\bw\u0010x\u001a$\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0z2\u0006\u0010{\u001a\u00020\t2\u0006\u0010|\u001a\u00020\tH\u0002\u001a\u001c\u0010}\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002\u001a\u0014\u0010~\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010~\u001a\u00020*H\u0003\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0016\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0017\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u007f²\u0006\u000b\u0010\u0080\u0001\u001a\u00020*X\u008a\u0084\u0002²\u0006\u000b\u0010\u0081\u0001\u001a\u00020GX\u008a\u008e\u0002²\u0006\u000b\u0010\u0082\u0001\u001a\u00020GX\u008a\u008e\u0002²\u0006\f\u0010\u0083\u0001\u001a\u00030\u0084\u0001X\u008a\u008e\u0002"}, m7105d2 = {"ClockDisplayBottomMargin", "Landroidx/compose/ui/unit/Dp;", "F", "ClockFaceBottomMargin", "DisplaySeparatorWidth", "ExtraHours", "", "", "FullCircle", "", "Hours", "InnerCircleRadius", "MaxDistance", "MinimumInteractiveSize", "Minutes", "OuterCircleSizeRadius", "PeriodToggleMargin", "QuarterCircle", "", "RadiansPerHour", "RadiansPerMinute", "SeparatorZIndex", "SupportLabelTop", "TimeInputBottomPadding", "CircularLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "radius", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "CircularLayout-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ClockDisplayNumbers", "state", "Landroidx/compose/material3/TimePickerState;", "colors", "Landroidx/compose/material3/TimePickerColors;", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ClockFace", "autoSwitchToMinute", "", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "ClockText", "value", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;IZLandroidx/compose/runtime/Composer;I)V", "DisplaySeparator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "HorizontalClockDisplay", "HorizontalPeriodToggle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "HorizontalTimePicker", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "PeriodToggleImpl", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "startShape", "Landroidx/compose/ui/graphics/Shape;", "endShape", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimeInputImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", "TimePicker", "layoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePickerTextField", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "selection", "Landroidx/compose/material3/Selection;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "TimePickerTextField-lxUZ_iY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimeSelector", "TimeSelector-uXwN82Y", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ToggleItem", "checked", "shape", "onClick", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(ZLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/TimePickerColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "VerticalClockDisplay", "VerticalPeriodToggle", "VerticalTimePicker", "atan", "y", "x", "dist", "x1", "y1", "x2", "y2", "numberContentDescription", "", "is24Hour", "number", "numberContentDescription-YKJpE6Y", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "rememberTimePickerState", "initialHour", "initialMinute", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "timeInputOnChange", "prevValue", "max", "onNewValue", "Lkotlin/ParameterName;", "name", "timeInputOnChange-gIWD5Rc", "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILkotlin/jvm/functions/Function1;)V", "valuesForAnimation", "Lkotlin/Pair;", "current", "new", "drawSelector", "visible", "material3_release", "touchExplorationServicesEnabled", "hourValue", "minuteValue", TtmlNode.CENTER, "Landroidx/compose/ui/geometry/Offset;"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 12 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 13 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 14 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 15 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 16 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 17 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1843:1\n1116#2,6:1844\n1116#2,6:1930\n1116#2,6:1936\n1116#2,6:2184\n1116#2,6:2190\n1116#2,6:2197\n1116#2,6:2231\n1116#2,6:2237\n1116#2,6:2247\n1116#2,3:2301\n1119#2,3:2307\n1116#2,6:2311\n1116#2,6:2317\n1116#2,6:2325\n1116#2,3:2336\n1119#2,3:2342\n1116#2,6:2346\n1116#2,6:2352\n1116#2,6:2392\n1116#2,6:2403\n1116#2,6:2409\n1116#2,6:2487\n1116#2,6:2506\n1116#2,6:2512\n74#3,6:1850\n80#3:1884\n84#3:1889\n73#3,7:2022\n80#3:2057\n84#3:2102\n74#3,6:2415\n80#3:2449\n84#3:2505\n78#4,11:1856\n91#4:1888\n78#4,11:1896\n91#4:1928\n78#4,11:1948\n78#4,11:1983\n91#4:2015\n91#4:2020\n78#4,11:2029\n78#4,11:2064\n91#4:2096\n91#4:2101\n78#4,11:2110\n78#4,11:2145\n91#4:2177\n91#4:2182\n78#4,11:2203\n91#4:2246\n78#4,11:2260\n91#4:2292\n78#4,11:2363\n91#4:2401\n78#4,11:2421\n78#4,11:2458\n91#4:2497\n91#4:2504\n78#4,11:2518\n91#4:2549\n456#5,8:1867\n464#5,3:1881\n467#5,3:1885\n456#5,8:1907\n464#5,3:1921\n467#5,3:1925\n456#5,8:1959\n464#5,3:1973\n456#5,8:1994\n464#5,3:2008\n467#5,3:2012\n467#5,3:2017\n456#5,8:2040\n464#5,3:2054\n456#5,8:2075\n464#5,3:2089\n467#5,3:2093\n467#5,3:2098\n456#5,8:2121\n464#5,3:2135\n456#5,8:2156\n464#5,3:2170\n467#5,3:2174\n467#5,3:2179\n456#5,8:2214\n464#5,3:2228\n467#5,3:2243\n456#5,8:2271\n464#5,3:2285\n467#5,3:2289\n25#5:2300\n25#5:2335\n456#5,8:2374\n464#5,3:2388\n467#5,3:2398\n456#5,8:2432\n464#5,3:2446\n456#5,8:2469\n464#5,3:2483\n467#5,3:2494\n467#5,3:2501\n456#5,8:2529\n464#5,6:2543\n3737#6,6:1875\n3737#6,6:1915\n3737#6,6:1967\n3737#6,6:2002\n3737#6,6:2048\n3737#6,6:2083\n3737#6,6:2129\n3737#6,6:2164\n3737#6,6:2222\n3737#6,6:2279\n3737#6,6:2382\n3737#6,6:2440\n3737#6,6:2477\n3737#6,6:2537\n87#7,6:1890\n93#7:1924\n97#7:1929\n87#7,6:1942\n93#7:1976\n97#7:2021\n86#7,7:2103\n93#7:2138\n97#7:2183\n68#8,6:1977\n74#8:2011\n78#8:2016\n68#8,6:2058\n74#8:2092\n78#8:2097\n68#8,6:2139\n74#8:2173\n78#8:2178\n69#8,5:2255\n74#8:2288\n78#8:2293\n69#8,5:2358\n74#8:2391\n78#8:2402\n68#8,6:2452\n74#8:2486\n78#8:2498\n141#9:2196\n145#9:2294\n143#9:2295\n159#9:2450\n157#9:2451\n153#9:2499\n155#9:2500\n149#9:2550\n151#9:2551\n147#9:2552\n154#10:2253\n154#10:2564\n154#10:2565\n154#10:2566\n154#10:2567\n154#10:2568\n154#10:2569\n154#10:2570\n154#10:2571\n154#10:2572\n154#10:2584\n74#11:2254\n74#11:2323\n74#11:2493\n487#12,4:2296\n491#12,2:2304\n495#12:2310\n487#12,4:2331\n491#12,2:2339\n495#12:2345\n487#13:2306\n487#13:2341\n1#14:2324\n135#15:2553\n81#16:2554\n81#16:2555\n107#16,2:2556\n81#16:2558\n107#16,2:2559\n81#16:2561\n107#16,2:2562\n151#17,3:2573\n33#17,4:2576\n154#17,2:2580\n38#17:2582\n156#17:2583\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n559#1:1844,6\n819#1:1930,6\n822#1:1936,6\n1004#1:2184,6\n1049#1:2190,6\n1106#1:2197,6\n1117#1:2231,6\n1131#1:2237,6\n1153#1:2247,6\n1207#1:2301,3\n1207#1:2307,3\n1210#1:2311,6\n1214#1:2317,6\n1471#1:2325,6\n1472#1:2336,3\n1472#1:2342,3\n1492#1:2346,6\n1494#1:2352,6\n1503#1:2392,6\n1575#1:2403,6\n1576#1:2409,6\n1609#1:2487,6\n1667#1:2506,6\n1683#1:2512,6\n785#1:1850,6\n785#1:1884\n785#1:1889\n923#1:2022,7\n923#1:2057\n923#1:2102\n1583#1:2415,6\n1583#1:2449\n1583#1:2505\n785#1:1856,11\n785#1:1888\n803#1:1896,11\n803#1:1928\n826#1:1948,11\n907#1:1983,11\n907#1:2015\n826#1:2020\n923#1:2029,11\n926#1:2064,11\n926#1:2096\n923#1:2101\n942#1:2110,11\n945#1:2145,11\n945#1:2177\n942#1:2182\n1104#1:2203,11\n1104#1:2246\n1175#1:2260,11\n1175#1:2292\n1487#1:2363,11\n1487#1:2401\n1583#1:2421,11\n1602#1:2458,11\n1602#1:2497\n1583#1:2504\n1681#1:2518,11\n1681#1:2549\n785#1:1867,8\n785#1:1881,3\n785#1:1885,3\n803#1:1907,8\n803#1:1921,3\n803#1:1925,3\n826#1:1959,8\n826#1:1973,3\n907#1:1994,8\n907#1:2008,3\n907#1:2012,3\n826#1:2017,3\n923#1:2040,8\n923#1:2054,3\n926#1:2075,8\n926#1:2089,3\n926#1:2093,3\n923#1:2098,3\n942#1:2121,8\n942#1:2135,3\n945#1:2156,8\n945#1:2170,3\n945#1:2174,3\n942#1:2179,3\n1104#1:2214,8\n1104#1:2228,3\n1104#1:2243,3\n1175#1:2271,8\n1175#1:2285,3\n1175#1:2289,3\n1207#1:2300\n1472#1:2335\n1487#1:2374,8\n1487#1:2388,3\n1487#1:2398,3\n1583#1:2432,8\n1583#1:2446,3\n1602#1:2469,8\n1602#1:2483,3\n1602#1:2494,3\n1583#1:2501,3\n1681#1:2529,8\n1681#1:2543,6\n785#1:1875,6\n803#1:1915,6\n826#1:1967,6\n907#1:2002,6\n923#1:2048,6\n926#1:2083,6\n942#1:2129,6\n945#1:2164,6\n1104#1:2222,6\n1175#1:2279,6\n1487#1:2382,6\n1583#1:2440,6\n1602#1:2477,6\n1681#1:2537,6\n803#1:1890,6\n803#1:1924\n803#1:1929\n826#1:1942,6\n826#1:1976\n826#1:2021\n942#1:2103,7\n942#1:2138\n942#1:2183\n907#1:1977,6\n907#1:2011\n907#1:2016\n926#1:2058,6\n926#1:2092\n926#1:2097\n945#1:2139,6\n945#1:2173\n945#1:2178\n1175#1:2255,5\n1175#1:2288\n1175#1:2293\n1487#1:2358,5\n1487#1:2391\n1487#1:2402\n1602#1:2452,6\n1602#1:2486\n1602#1:2498\n1103#1:2196\n1199#1:2294\n1201#1:2295\n1596#1:2450\n1598#1:2451\n1655#1:2499\n1657#1:2500\n1727#1:2550\n1729#1:2551\n1731#1:2552\n1154#1:2253\n1787#1:2564\n1788#1:2565\n1789#1:2566\n1790#1:2567\n1791#1:2568\n1793#1:2569\n1794#1:2570\n1795#1:2571\n1796#1:2572\n1800#1:2584\n1167#1:2254\n1470#1:2323\n1615#1:2493\n1207#1:2296,4\n1207#1:2304,2\n1207#1:2310\n1472#1:2331,4\n1472#1:2339,2\n1472#1:2345\n1207#1:2306\n1472#1:2341\n1810#1:2553\n209#1:2554\n819#1:2555\n819#1:2556,2\n822#1:2558\n822#1:2559,2\n1471#1:2561\n1471#1:2562,2\n1799#1:2573,3\n1799#1:2576,4\n1799#1:2580,2\n1799#1:2582\n1799#1:2583\n*E\n"})
/* loaded from: classes2.dex */
public final class TimePickerKt {
    private static final float ClockFaceBottomMargin;
    private static final float DisplaySeparatorWidth;

    @NotNull
    private static final List<Integer> ExtraHours;
    private static final float FullCircle = 6.2831855f;

    @NotNull
    private static final List<Integer> Hours;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float TimeInputBottomPadding;
    private static final float OuterCircleSizeRadius = C2046Dp.m13666constructorimpl(101);
    private static final float InnerCircleRadius = C2046Dp.m13666constructorimpl(69);
    private static final float ClockDisplayBottomMargin = C2046Dp.m13666constructorimpl(36);
    private static final float SupportLabelTop = C2046Dp.m13666constructorimpl(7);
    private static final float MaxDistance = C2046Dp.m13666constructorimpl(74);
    private static final float MinimumInteractiveSize = C2046Dp.m13666constructorimpl(48);

    @NotNull
    private static final List<Integer> Minutes = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55});

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$2 */
    /* loaded from: classes.dex */
    public static final class C16812 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16812(TimePickerColors timePickerColors, int i) {
            super(2);
            timePickerColors = timePickerColors;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.ClockDisplayNumbers(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$3 */
    /* loaded from: classes.dex */
    public static final class C16843 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $autoSwitchToMinute;
        public final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16843(TimePickerColors timePickerColors, boolean z, int i) {
            super(2);
            timePickerColors = timePickerColors;
            z = z;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.ClockFace(timePickerState, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$4 */
    /* loaded from: classes.dex */
    public static final class C16864 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $autoSwitchToMinute;
        public final /* synthetic */ TimePickerState $state;
        public final /* synthetic */ int $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16864(TimePickerState timePickerState, int i, boolean z, int i2) {
            super(2);
            timePickerState = timePickerState;
            i = i;
            z = z;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.ClockText(modifier, timePickerState, i, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$DisplaySeparator$3 */
    /* loaded from: classes.dex */
    public static final class C16883 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16883(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.DisplaySeparator(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$HorizontalClockDisplay$2 */
    /* loaded from: classes.dex */
    public static final class C16892 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16892(TimePickerColors timePickerColors, int i) {
            super(2);
            timePickerColors = timePickerColors;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.HorizontalClockDisplay(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$1 */
    /* loaded from: classes.dex */
    public static final class C16901 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ TimePickerColors $colors;
        public final /* synthetic */ TimePickerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16901(TimePickerState timePickerState, TimePickerColors timePickerColors, int i) {
            super(2);
            timePickerState = timePickerState;
            timePickerColors = timePickerColors;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.HorizontalPeriodToggle(modifier, timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$HorizontalTimePicker$2 */
    /* loaded from: classes.dex */
    public static final class C16922 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $autoSwitchToMinute;
        public final /* synthetic */ TimePickerColors $colors;
        public final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16922(Modifier modifier, TimePickerColors timePickerColors, boolean z, int i, int i2) {
            super(2);
            modifier = modifier;
            timePickerColors = timePickerColors;
            z = z;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.HorizontalTimePicker(timePickerState, modifier, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$3 */
    /* loaded from: classes.dex */
    public static final class C16933 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ TimePickerColors $colors;
        public final /* synthetic */ Shape $endShape;
        public final /* synthetic */ MeasurePolicy $measurePolicy;
        public final /* synthetic */ Shape $startShape;
        public final /* synthetic */ TimePickerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16933(TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, int i) {
            super(2);
            timePickerState = timePickerState;
            timePickerColors = timePickerColors;
            measurePolicy = measurePolicy;
            shape = shape;
            shape = shape2;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$TimeInput$1 */
    /* loaded from: classes.dex */
    public static final class C16941 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TimePickerColors $colors;
        public final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16941(Modifier modifier, TimePickerColors timePickerColors, int i, int i2) {
            super(2);
            modifier = modifier;
            timePickerColors = timePickerColors;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.TimeInput(timePickerState, modifier, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$TimeInputImpl$2 */
    /* loaded from: classes.dex */
    public static final class C16972 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ TimePickerColors $colors;
        public final /* synthetic */ TimePickerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16972(TimePickerColors timePickerColors, TimePickerState timePickerState, int i) {
            super(2);
            timePickerColors = timePickerColors;
            timePickerState = timePickerState;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.TimeInputImpl(modifier, timePickerColors, timePickerState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$ToggleItem$2 */
    /* loaded from: classes.dex */
    public static final class C17002 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ TimePickerColors $colors;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17002(boolean z, Shape shape, Function0<Unit> function0, TimePickerColors timePickerColors, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i) {
            super(2);
            z = z;
            shape = shape;
            function0 = function0;
            timePickerColors = timePickerColors;
            function3 = function3;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.ToggleItem(z, shape, function0, timePickerColors, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$VerticalClockDisplay$2 */
    /* loaded from: classes.dex */
    public static final class C17012 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17012(TimePickerColors timePickerColors, int i) {
            super(2);
            timePickerColors = timePickerColors;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.VerticalClockDisplay(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$1 */
    /* loaded from: classes.dex */
    public static final class C17021 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ TimePickerColors $colors;
        public final /* synthetic */ TimePickerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17021(TimePickerState timePickerState, TimePickerColors timePickerColors, int i) {
            super(2);
            timePickerState = timePickerState;
            timePickerColors = timePickerColors;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.VerticalPeriodToggle(modifier, timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$VerticalTimePicker$3 */
    /* loaded from: classes.dex */
    public static final class C17053 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $autoSwitchToMinute;
        public final /* synthetic */ TimePickerColors $colors;
        public final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17053(Modifier modifier, TimePickerColors timePickerColors, boolean z, int i, int i2) {
            super(2);
            modifier = modifier;
            timePickerColors = timePickerColors;
            z = z;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TimePickerKt.VerticalTimePicker(timePickerState, modifier, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0106  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: TimePicker-mT9BvqQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10051TimePickermT9BvqQ(@NotNull final TimePickerState timePickerState, @Nullable Modifier modifier, @Nullable TimePickerColors timePickerColors, int i, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-619286452);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(timePickerColors)) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(i)) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                State<Boolean> state = TouchExplorationStateProvider_androidKt.touchExplorationState(composerStartRestartGroup, 0);
                if (!TimePickerLayoutType.m10065equalsimpl0(i, TimePickerLayoutType.INSTANCE.m10070getVerticalQJTpgSE())) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                if (i5 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    timePickerColors = TimePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i = TimePickerDefaults.INSTANCE.m10049layoutTypesDNSZnc(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-619286452, i4, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:207)");
                }
                State<Boolean> state2 = TouchExplorationStateProvider_androidKt.touchExplorationState(composerStartRestartGroup, 0);
                if (!TimePickerLayoutType.m10065equalsimpl0(i, TimePickerLayoutType.INSTANCE.m10070getVerticalQJTpgSE())) {
                    composerStartRestartGroup.startReplaceableGroup(1318082425);
                    VerticalTimePicker(timePickerState, modifier, timePickerColors, !TimePicker_mT9BvqQ$lambda$0(state2), composerStartRestartGroup, i4 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1318082631);
                    HorizontalTimePicker(timePickerState, modifier, timePickerColors, !TimePicker_mT9BvqQ$lambda$0(state2), composerStartRestartGroup, i4 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final TimePickerColors timePickerColors2 = timePickerColors;
        final int i6 = i;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePicker$1
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
                    TimePickerKt.m10051TimePickermT9BvqQ(timePickerState, modifier2, timePickerColors2, i6, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a5  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeInput(@NotNull TimePickerState timePickerState, @Nullable Modifier modifier, @Nullable TimePickerColors timePickerColors, @Nullable Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-760850373);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(timePickerColors)) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                TimeInputImpl(modifier, timePickerColors, timePickerState, composerStartRestartGroup, ((i3 >> 3) & 126) | ((i3 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    timePickerColors = TimePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-760850373, i3, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:248)");
                }
                TimeInputImpl(modifier, timePickerColors, timePickerState, composerStartRestartGroup, ((i3 >> 3) & 126) | ((i3 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        TimePickerColors timePickerColors2 = timePickerColors;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.TimeInput.1
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ TimePickerColors $colors;
                public final /* synthetic */ Modifier $modifier;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16941(Modifier modifier22, TimePickerColors timePickerColors22, int i5, int i22) {
                    super(2);
                    modifier = modifier22;
                    timePickerColors = timePickerColors22;
                    i = i5;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    TimePickerKt.TimeInput(timePickerState, modifier, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final TimePickerState rememberTimePickerState(int i, int i2, boolean z, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(1237715277);
        final int i5 = (i4 & 1) != 0 ? 0 : i;
        final int i6 = (i4 & 2) != 0 ? 0 : i2;
        final boolean zIs24HourFormat = (i4 & 4) != 0 ? TimeFormat_androidKt.is24HourFormat(composer, 0) : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i3, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:556)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerState, ?> Saver = TimePickerState.INSTANCE.Saver();
        composer.startReplaceableGroup(1737740702);
        boolean z2 = ((((i3 & 14) ^ 6) > 4 && composer.changed(i5)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(i6)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && composer.changed(zIs24HourFormat)) || (i3 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<TimePickerState>() { // from class: androidx.compose.material3.TimePickerKt$rememberTimePickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final TimePickerState invoke() {
                    return new TimePickerState(i5, i6, zIs24HourFormat);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TimePickerState timePickerState = (TimePickerState) RememberSaveableKt.m10957rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return timePickerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerticalTimePicker(@NotNull TimePickerState timePickerState, @Nullable Modifier modifier, @Nullable TimePickerColors timePickerColors, boolean z, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        TimePickerColors timePickerColorsColors;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(310683247);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    timePickerColorsColors = timePickerColors;
                    int i5 = composerStartRestartGroup.changed(timePickerColorsColors) ? 256 : 128;
                    i3 |= i5;
                } else {
                    timePickerColorsColors = timePickerColors;
                }
                i3 |= i5;
            } else {
                timePickerColorsColors = timePickerColors;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        timePickerColorsColors = TimePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(310683247, i3, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:783)");
                }
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier3, false, C17041.INSTANCE, 1, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSemantics$default);
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
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i6 = i3 & 14;
                int i7 = i3 >> 3;
                int i8 = i6 | (i7 & 112);
                VerticalClockDisplay(timePickerState, timePickerColorsColors, composerStartRestartGroup, i8);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion2, ClockDisplayBottomMargin), composerStartRestartGroup, 6);
                ClockFace(timePickerState, timePickerColorsColors, z, composerStartRestartGroup, i8 | (i7 & 896));
                SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion2, ClockFaceBottomMargin), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            TimePickerColors timePickerColors2 = timePickerColorsColors;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.VerticalTimePicker.3
                    public final /* synthetic */ int $$changed;
                    public final /* synthetic */ int $$default;
                    public final /* synthetic */ boolean $autoSwitchToMinute;
                    public final /* synthetic */ TimePickerColors $colors;
                    public final /* synthetic */ Modifier $modifier;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C17053(Modifier modifier32, TimePickerColors timePickerColors22, boolean z2, int i9, int i22) {
                        super(2);
                        modifier = modifier32;
                        timePickerColors = timePickerColors22;
                        z = z2;
                        i = i9;
                        i = i22;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i9) {
                        TimePickerKt.VerticalTimePicker(timePickerState, modifier, timePickerColors, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i9 & 384) != 0) {
        }
        if ((i22 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i9 & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i22 & 4) != 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifier32, false, C17041.INSTANCE, 1, null);
                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierSemantics$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting()) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    int i62 = i3 & 14;
                    int i72 = i3 >> 3;
                    int i82 = i62 | (i72 & 112);
                    VerticalClockDisplay(timePickerState, timePickerColorsColors, composerStartRestartGroup, i82);
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion22, ClockDisplayBottomMargin), composerStartRestartGroup, 6);
                    ClockFace(timePickerState, timePickerColorsColors, z2, composerStartRestartGroup, i82 | (i72 & 896));
                    SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion22, ClockFaceBottomMargin), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        TimePickerColors timePickerColors22 = timePickerColorsColors;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$VerticalTimePicker$1 */
    /* loaded from: classes.dex */
    public static final class C17041 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C17041 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HorizontalTimePicker(@NotNull TimePickerState timePickerState, @Nullable Modifier modifier, @Nullable TimePickerColors timePickerColors, boolean z, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        TimePickerColors timePickerColorsColors;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(5079681);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    timePickerColorsColors = timePickerColors;
                    int i5 = composerStartRestartGroup.changed(timePickerColorsColors) ? 256 : 128;
                    i3 |= i5;
                } else {
                    timePickerColorsColors = timePickerColors;
                }
                i3 |= i5;
            } else {
                timePickerColorsColors = timePickerColors;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        timePickerColorsColors = TimePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(5079681, i3, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:801)");
                }
                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, ClockFaceBottomMargin, 7, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i6 = i3 & 14;
                int i7 = i3 >> 3;
                int i8 = i6 | (i7 & 112);
                HorizontalClockDisplay(timePickerState, timePickerColorsColors, composerStartRestartGroup, i8);
                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, ClockDisplayBottomMargin), composerStartRestartGroup, 6);
                ClockFace(timePickerState, timePickerColorsColors, z, composerStartRestartGroup, i8 | (i7 & 896));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            TimePickerColors timePickerColors2 = timePickerColorsColors;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.HorizontalTimePicker.2
                    public final /* synthetic */ int $$changed;
                    public final /* synthetic */ int $$default;
                    public final /* synthetic */ boolean $autoSwitchToMinute;
                    public final /* synthetic */ TimePickerColors $colors;
                    public final /* synthetic */ Modifier $modifier;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C16922(Modifier modifier32, TimePickerColors timePickerColors22, boolean z2, int i9, int i22) {
                        super(2);
                        modifier = modifier32;
                        timePickerColors = timePickerColors22;
                        z = z2;
                        i = i9;
                        i = i22;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i9) {
                        TimePickerKt.HorizontalTimePicker(timePickerState, modifier, timePickerColors, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i9 & 384) != 0) {
        }
        if ((i22 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i9 & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i22 & 4) != 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(modifier32, 0.0f, 0.0f, 0.0f, ClockFaceBottomMargin, 7, null);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting()) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    int i62 = i3 & 14;
                    int i72 = i3 >> 3;
                    int i82 = i62 | (i72 & 112);
                    HorizontalClockDisplay(timePickerState, timePickerColorsColors, composerStartRestartGroup, i82);
                    SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, ClockDisplayBottomMargin), composerStartRestartGroup, 6);
                    ClockFace(timePickerState, timePickerColorsColors, z2, composerStartRestartGroup, i82 | (i72 & 896));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        TimePickerColors timePickerColors22 = timePickerColorsColors;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TimeInputImpl(Modifier modifier, final TimePickerColors timePickerColors, final TimePickerState timePickerState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-475657989);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerState) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i3, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:817)");
            }
            Object[] objArr = new Object[0];
            TextFieldValue.Companion companion = TextFieldValue.INSTANCE;
            Saver<TextFieldValue, Object> saver = companion.getSaver();
            composerStartRestartGroup.startReplaceableGroup(565122579);
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final MutableState<TextFieldValue> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(ActualJvm_jvmKt.toLocalString$default(timePickerState.getHourForDisplay$material3_release(), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 4);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = companion.getSaver();
            composerStartRestartGroup.startReplaceableGroup(565122759);
            boolean z2 = i4 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final MutableState<TextFieldValue> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(ActualJvm_jvmKt.toLocalString$default(timePickerState.getMinute(), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableStateRememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 4);
            composer2 = composerStartRestartGroup;
            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, TimeInputBottomPadding, 7, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical top = companion2.getTop();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Typography typography = MaterialTheme.INSTANCE.getTypography(composer2, 6);
            TimeInputTokens timeInputTokens = TimeInputTokens.INSTANCE;
            TextStyle textStyleFromToken = TypographyKt.fromToken(typography, timeInputTokens.getTimeFieldLabelTextFont());
            CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(textStyleFromToken.m13191copyp1EtxEg((15695871 & 1) != 0 ? textStyleFromToken.spanStyle.m13124getColor0d7_KjU() : timePickerColors.m10047timeSelectorContentColorvNxB06k$material3_release(true), (15695871 & 2) != 0 ? textStyleFromToken.spanStyle.getFontSize() : 0L, (15695871 & 4) != 0 ? textStyleFromToken.spanStyle.getFontWeight() : null, (15695871 & 8) != 0 ? textStyleFromToken.spanStyle.getFontStyle() : null, (15695871 & 16) != 0 ? textStyleFromToken.spanStyle.getFontSynthesis() : null, (15695871 & 32) != 0 ? textStyleFromToken.spanStyle.getFontFamily() : null, (15695871 & 64) != 0 ? textStyleFromToken.spanStyle.getFontFeatureSettings() : null, (15695871 & 128) != 0 ? textStyleFromToken.spanStyle.getLetterSpacing() : 0L, (15695871 & 256) != 0 ? textStyleFromToken.spanStyle.getBaselineShift() : null, (15695871 & 512) != 0 ? textStyleFromToken.spanStyle.getTextGeometricTransform() : null, (15695871 & 1024) != 0 ? textStyleFromToken.spanStyle.getLocaleList() : null, (15695871 & 2048) != 0 ? textStyleFromToken.spanStyle.getBackground() : 0L, (15695871 & 4096) != 0 ? textStyleFromToken.spanStyle.getTextDecoration() : null, (15695871 & 8192) != 0 ? textStyleFromToken.spanStyle.getShadow() : null, (15695871 & 16384) != 0 ? textStyleFromToken.spanStyle.getDrawStyle() : null, (15695871 & 32768) != 0 ? textStyleFromToken.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m13558getCentere0LSkKk(), (15695871 & 65536) != 0 ? textStyleFromToken.paragraphStyle.getTextDirection() : 0, (15695871 & 131072) != 0 ? textStyleFromToken.paragraphStyle.getLineHeight() : 0L, (15695871 & 262144) != 0 ? textStyleFromToken.paragraphStyle.getTextIndent() : null, (15695871 & 524288) != 0 ? textStyleFromToken.platformStyle : null, (15695871 & 1048576) != 0 ? textStyleFromToken.paragraphStyle.getLineHeightStyle() : null, (15695871 & 2097152) != 0 ? textStyleFromToken.paragraphStyle.getLineBreak() : 0, (15695871 & 4194304) != 0 ? textStyleFromToken.paragraphStyle.getHyphens() : 0, (15695871 & 8388608) != 0 ? textStyleFromToken.paragraphStyle.getTextMotion() : null)), ComposableLambdaKt.composableLambda(composer2, 1306700887, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                public final void invoke(@Nullable Composer composer3, int i5) {
                    if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1306700887, i5, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:837)");
                        }
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        composer3.startReplaceableGroup(-1645133303);
                        boolean zChanged = composer3.changed(mutableStateRememberSaveable) | composer3.changed(timePickerState);
                        final TimePickerState timePickerState2 = timePickerState;
                        final MutableState<TextFieldValue> mutableState = mutableStateRememberSaveable;
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                    return m10060invokeZmokQxo(keyEvent.m12337unboximpl());
                                }

                                @NotNull
                                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                public final Boolean m10060invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                                    int iM12350getUtf16CodePointZmokQxo = KeyEvent_androidKt.m12350getUtf16CodePointZmokQxo(keyEvent);
                                    if (48 <= iM12350getUtf16CodePointZmokQxo && iM12350getUtf16CodePointZmokQxo < 58 && TextRange.m13165getStartimpl(TimePickerKt.TimeInputImpl$lambda$5(mutableState).getSelection()) == 2 && TimePickerKt.TimeInputImpl$lambda$5(mutableState).getText().length() == 2) {
                                        timePickerState2.m10075setSelectioniHAOin8$material3_release(Selection.INSTANCE.m9749getMinuteJiIwxys());
                                    }
                                    return Boolean.FALSE;
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion4, (Function1) objRememberedValue3);
                        TextFieldValue textFieldValueTimeInputImpl$lambda$5 = TimePickerKt.TimeInputImpl$lambda$5(mutableStateRememberSaveable);
                        composer3.startReplaceableGroup(-1645132823);
                        boolean zChanged2 = composer3.changed(timePickerState) | composer3.changed(mutableStateRememberSaveable);
                        final TimePickerState timePickerState3 = timePickerState;
                        final MutableState<TextFieldValue> mutableState2 = mutableStateRememberSaveable;
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) throws NumberFormatException {
                                    invoke2(textFieldValue);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextFieldValue textFieldValue) throws NumberFormatException {
                                    int iM9748getHourJiIwxys = Selection.INSTANCE.m9748getHourJiIwxys();
                                    TimePickerState timePickerState4 = timePickerState3;
                                    TextFieldValue textFieldValueTimeInputImpl$lambda$52 = TimePickerKt.TimeInputImpl$lambda$5(mutableState2);
                                    int i6 = timePickerState3.getIs24hour() ? 23 : 12;
                                    final MutableState<TextFieldValue> mutableState3 = mutableState2;
                                    TimePickerKt.m10059timeInputOnChangegIWD5Rc(iM9748getHourJiIwxys, timePickerState4, textFieldValue, textFieldValueTimeInputImpl$lambda$52, i6, new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                            invoke2(textFieldValue2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                            mutableState3.setValue(textFieldValue2);
                                        }
                                    });
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        Function1 function1 = (Function1) objRememberedValue4;
                        composer3.endReplaceableGroup();
                        TimePickerState timePickerState4 = timePickerState;
                        Selection.Companion companion5 = Selection.INSTANCE;
                        int iM9748getHourJiIwxys = companion5.m9748getHourJiIwxys();
                        ImeAction.Companion companion6 = ImeAction.INSTANCE;
                        int iM13344getNexteUduSuo = companion6.m13344getNexteUduSuo();
                        KeyboardType.Companion companion7 = KeyboardType.INSTANCE;
                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, companion7.m13392getNumberPjHm6EE(), iM13344getNexteUduSuo, null, 19, null);
                        composer3.startReplaceableGroup(-1645132161);
                        boolean zChanged3 = composer3.changed(timePickerState);
                        final TimePickerState timePickerState5 = timePickerState;
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$3$1
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
                                    timePickerState5.m10075setSelectioniHAOin8$material3_release(Selection.INSTANCE.m9749getMinuteJiIwxys());
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceableGroup();
                        TimePickerKt.m10052TimePickerTextFieldlxUZ_iY(modifierOnKeyEvent, textFieldValueTimeInputImpl$lambda$5, function1, timePickerState4, iM9748getHourJiIwxys, keyboardOptions, new KeyboardActions(null, null, (Function1) objRememberedValue5, null, null, null, 59, null), timePickerColors, composer3, CpioConstants.C_ISBLK, 0);
                        TimePickerKt.DisplaySeparator(SizeKt.m8174sizeVpY3zN4(companion4, TimePickerKt.DisplaySeparatorWidth, TimeInputTokens.INSTANCE.m10727getPeriodSelectorContainerHeightD9Ej5fM()), composer3, 6);
                        composer3.startReplaceableGroup(-1645131867);
                        boolean zChanged4 = composer3.changed(mutableStateRememberSaveable2) | composer3.changed(timePickerState);
                        final TimePickerState timePickerState6 = timePickerState;
                        final MutableState<TextFieldValue> mutableState3 = mutableStateRememberSaveable2;
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                    return m10061invokeZmokQxo(keyEvent.m12337unboximpl());
                                }

                                @NotNull
                                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                public final Boolean m10061invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                                    boolean z3 = KeyEvent_androidKt.m12350getUtf16CodePointZmokQxo(keyEvent) == 0 && TextRange.m13165getStartimpl(TimePickerKt.TimeInputImpl$lambda$8(mutableState3).getSelection()) == 0;
                                    if (z3) {
                                        timePickerState6.m10075setSelectioniHAOin8$material3_release(Selection.INSTANCE.m9748getHourJiIwxys());
                                    }
                                    return Boolean.valueOf(z3);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion4, (Function1) objRememberedValue6);
                        TextFieldValue textFieldValueTimeInputImpl$lambda$8 = TimePickerKt.TimeInputImpl$lambda$8(mutableStateRememberSaveable2);
                        composer3.startReplaceableGroup(-1645131419);
                        boolean zChanged5 = composer3.changed(timePickerState) | composer3.changed(mutableStateRememberSaveable2);
                        final TimePickerState timePickerState7 = timePickerState;
                        final MutableState<TextFieldValue> mutableState4 = mutableStateRememberSaveable2;
                        Object objRememberedValue7 = composer3.rememberedValue();
                        if (zChanged5 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) throws NumberFormatException {
                                    invoke2(textFieldValue);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextFieldValue textFieldValue) throws NumberFormatException {
                                    int iM9749getMinuteJiIwxys = Selection.INSTANCE.m9749getMinuteJiIwxys();
                                    TimePickerState timePickerState8 = timePickerState7;
                                    TextFieldValue textFieldValueTimeInputImpl$lambda$82 = TimePickerKt.TimeInputImpl$lambda$8(mutableState4);
                                    final MutableState<TextFieldValue> mutableState5 = mutableState4;
                                    TimePickerKt.m10059timeInputOnChangegIWD5Rc(iM9749getMinuteJiIwxys, timePickerState8, textFieldValue, textFieldValueTimeInputImpl$lambda$82, 59, new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$5$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                            invoke2(textFieldValue2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull TextFieldValue textFieldValue2) {
                                            mutableState5.setValue(textFieldValue2);
                                        }
                                    });
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue7);
                        }
                        Function1 function12 = (Function1) objRememberedValue7;
                        composer3.endReplaceableGroup();
                        TimePickerState timePickerState8 = timePickerState;
                        int iM9749getMinuteJiIwxys = companion5.m9749getMinuteJiIwxys();
                        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, companion7.m13392getNumberPjHm6EE(), companion6.m13342getDoneeUduSuo(), null, 19, null);
                        composer3.startReplaceableGroup(-1645130777);
                        boolean zChanged6 = composer3.changed(timePickerState);
                        final TimePickerState timePickerState9 = timePickerState;
                        Object objRememberedValue8 = composer3.rememberedValue();
                        if (zChanged6 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$6$1
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
                                    timePickerState9.m10075setSelectioniHAOin8$material3_release(Selection.INSTANCE.m9749getMinuteJiIwxys());
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue8);
                        }
                        composer3.endReplaceableGroup();
                        TimePickerKt.m10052TimePickerTextFieldlxUZ_iY(modifierOnPreviewKeyEvent, textFieldValueTimeInputImpl$lambda$8, function12, timePickerState8, iM9749getMinuteJiIwxys, keyboardOptions2, new KeyboardActions(null, null, (Function1) objRememberedValue8, null, null, null, 59, null), timePickerColors, composer3, CpioConstants.C_ISBLK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, ProvidedValue.$stable | 48);
            composer2.startReplaceableGroup(565126032);
            if (!timePickerState.getIs24hour()) {
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(companion4, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
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
                VerticalPeriodToggle(SizeKt.m8174sizeVpY3zN4(companion4, timeInputTokens.m10728getPeriodSelectorContainerWidthD9Ej5fM(), timeInputTokens.m10727getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composer2, ((i3 >> 3) & 112) | 6 | ((i3 << 3) & 896));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.TimeInputImpl.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ TimePickerColors $colors;
                public final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16972(final TimePickerColors timePickerColors2, final TimePickerState timePickerState2, int i5) {
                    super(2);
                    timePickerColors = timePickerColors2;
                    timePickerState = timePickerState2;
                    i = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i5) {
                    TimePickerKt.TimeInputImpl(modifier, timePickerColors, timePickerState, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalClockDisplay(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(755539561);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i2, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:921)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion2.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, i2 & 126);
            composerStartRestartGroup.startReplaceableGroup(-552392411);
            if (!timePickerState.getIs24hour()) {
                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i3 = i2 << 3;
                HorizontalPeriodToggle(SizeKt.m8174sizeVpY3zN4(companion, timePickerTokens.m10739getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), timePickerTokens.m10738getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, (i3 & 896) | (i3 & 112) | 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.HorizontalClockDisplay.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ TimePickerColors $colors;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16892(TimePickerColors timePickerColors2, int i4) {
                    super(2);
                    timePickerColors = timePickerColors2;
                    i = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    TimePickerKt.HorizontalClockDisplay(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalClockDisplay(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2054675515);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i2, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:940)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, i2 & 126);
            composerStartRestartGroup.startReplaceableGroup(952914149);
            if (!timePickerState.getIs24hour()) {
                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i3 = i2 << 3;
                VerticalPeriodToggle(SizeKt.m8174sizeVpY3zN4(companion, timePickerTokens.m10742getPeriodSelectorVerticalContainerWidthD9Ej5fM(), timePickerTokens.m10741getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, (i3 & 896) | (i3 & 112) | 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.VerticalClockDisplay.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ TimePickerColors $colors;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C17012(TimePickerColors timePickerColors2, int i4) {
                    super(2);
                    timePickerColors = timePickerColors2;
                    i = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    TimePickerKt.VerticalClockDisplay(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockDisplayNumbers(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-934561141);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i2, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:962)");
            }
            CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont())), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -477913269, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockDisplayNumbers.1
                public final /* synthetic */ TimePickerColors $colors;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16801(TimePickerColors timePickerColors2) {
                    super(2);
                    timePickerColors = timePickerColors2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-477913269, i3, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:966)");
                        }
                        TimePickerState timePickerState2 = timePickerState;
                        TimePickerColors timePickerColors2 = timePickerColors;
                        composer2.startReplaceableGroup(693286680);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
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
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                        Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(companion, timePickerTokens.m10745getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m10744getTimeSelectorContainerHeightD9Ej5fM());
                        int hourForDisplay$material3_release = timePickerState2.getHourForDisplay$material3_release();
                        Selection.Companion companion3 = Selection.INSTANCE;
                        TimePickerKt.m10053TimeSelectoruXwN82Y(modifierM8174sizeVpY3zN4, hourForDisplay$material3_release, timePickerState2, companion3.m9748getHourJiIwxys(), timePickerColors2, composer2, 3078);
                        TimePickerKt.DisplaySeparator(SizeKt.m8174sizeVpY3zN4(companion, TimePickerKt.DisplaySeparatorWidth, timePickerTokens.m10741getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer2, 6);
                        TimePickerKt.m10053TimeSelectoruXwN82Y(SizeKt.m8174sizeVpY3zN4(companion, timePickerTokens.m10745getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m10744getTimeSelectorContainerHeightD9Ej5fM()), timePickerState2.getMinute(), timePickerState2, companion3.m9749getMinuteJiIwxys(), timePickerColors2, composer2, 3078);
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
            }), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockDisplayNumbers.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ TimePickerColors $colors;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16812(TimePickerColors timePickerColors2, int i3) {
                    super(2);
                    timePickerColors = timePickerColors2;
                    i = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    TimePickerKt.ClockDisplayNumbers(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1843:1\n86#2,7:1844\n93#2:1879\n97#2:1884\n78#3,11:1851\n91#3:1883\n456#4,8:1862\n464#4,3:1876\n467#4,3:1880\n3737#5,6:1870\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n*L\n967#1:1844,7\n967#1:1879\n967#1:1884\n967#1:1851,11\n967#1:1883\n967#1:1862,8\n967#1:1876,3\n967#1:1880,3\n967#1:1870,6\n*E\n"})
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$1 */
    /* loaded from: classes.dex */
    public static final class C16801 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16801(TimePickerColors timePickerColors2) {
            super(2);
            timePickerColors = timePickerColors2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i3) {
            if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-477913269, i3, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:966)");
                }
                TimePickerState timePickerState2 = timePickerState;
                TimePickerColors timePickerColors2 = timePickerColors;
                composer2.startReplaceableGroup(693286680);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
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
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(companion, timePickerTokens.m10745getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m10744getTimeSelectorContainerHeightD9Ej5fM());
                int hourForDisplay$material3_release = timePickerState2.getHourForDisplay$material3_release();
                Selection.Companion companion3 = Selection.INSTANCE;
                TimePickerKt.m10053TimeSelectoruXwN82Y(modifierM8174sizeVpY3zN4, hourForDisplay$material3_release, timePickerState2, companion3.m9748getHourJiIwxys(), timePickerColors2, composer2, 3078);
                TimePickerKt.DisplaySeparator(SizeKt.m8174sizeVpY3zN4(companion, TimePickerKt.DisplaySeparatorWidth, timePickerTokens.m10741getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer2, 6);
                TimePickerKt.m10053TimeSelectoruXwN82Y(SizeKt.m8174sizeVpY3zN4(companion, timePickerTokens.m10745getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m10744getTimeSelectorContainerHeightD9Ej5fM()), timePickerState2.getMinute(), timePickerState2, companion3.m9749getMinuteJiIwxys(), timePickerColors2, composer2, 3078);
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
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1261215927);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i2, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1002)");
            }
            composerStartRestartGroup.startReplaceableGroup(759555873);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.p003ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Measurable measurable = list.get(i3);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j, 0, measureScope.mo7868roundToPx0680j_4(TimePickerTokens.INSTANCE.m10740getPeriodSelectorOutlineWidthD9Ej5fM()), 0, 0, 12, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    Measurable measurable2 = list.get(i4);
                                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size3 = arrayList.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    arrayList2.add(((Measurable) arrayList.get(i5)).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j, 0, Constraints.m13622getMaxWidthimpl(j) / 2, 0, 0, 12, null)));
                                }
                                return MeasureScope.layout$default(measureScope, Constraints.m13622getMaxWidthimpl(j), Constraints.m13621getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.1
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
                                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(1), arrayList2.get(0).getWidth(), 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo12610measureBRTryo0, arrayList2.get(0).getWidth() - (placeableMo12610measureBRTryo0.getWidth() / 2), 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), composerStartRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.HorizontalPeriodToggle.1
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ TimePickerColors $colors;
                public final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16901(TimePickerState timePickerState2, TimePickerColors timePickerColors2, int i3) {
                    super(2);
                    timePickerState = timePickerState2;
                    timePickerColors = timePickerColors2;
                    i = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    TimePickerKt.HorizontalPeriodToggle(modifier, timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1898918107);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i2, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1047)");
            }
            composerStartRestartGroup.startReplaceableGroup(-2030104119);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.p003ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Measurable measurable = list.get(i3);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, measureScope.mo7868roundToPx0680j_4(TimePickerTokens.INSTANCE.m10740getPeriodSelectorOutlineWidthD9Ej5fM()), 3, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    Measurable measurable2 = list.get(i4);
                                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size3 = arrayList.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    arrayList2.add(((Measurable) arrayList.get(i5)).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, Constraints.m13621getMaxHeightimpl(j) / 2, 3, null)));
                                }
                                return MeasureScope.layout$default(measureScope, Constraints.m13622getMaxWidthimpl(j), Constraints.m13621getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.1
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
                                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList2.get(1), 0, arrayList2.get(0).getHeight(), 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo12610measureBRTryo0, 0, arrayList2.get(0).getHeight() - (placeableMo12610measureBRTryo0.getHeight() / 2), 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, ShapesKt.top(cornerBasedShape), ShapesKt.bottom(cornerBasedShape), composerStartRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.VerticalPeriodToggle.1
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ TimePickerColors $colors;
                public final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C17021(TimePickerState timePickerState2, TimePickerColors timePickerColors2, int i3) {
                    super(2);
                    timePickerState = timePickerState2;
                    timePickerColors = timePickerColors2;
                    i = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    TimePickerKt.VerticalPeriodToggle(modifier, timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PeriodToggleImpl(Modifier modifier, final TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1374241901);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(measurePolicy) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= composerStartRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i2, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1095)");
            }
            TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
            BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(timePickerTokens.m10740getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.getPeriodSelectorBorderColor());
            Shape value = ShapesKt.getValue(timePickerTokens.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            Strings.Companion companion = Strings.INSTANCE;
            final String strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_time_picker_period_toggle_description), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-2008454294);
            boolean zChanged = composerStartRestartGroup.changed(strM9866getStringNWtq28);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
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
                        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9866getStringNWtq28);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierBorder = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (Function1) objRememberedValue, 1, null)), borderStrokeM7798BorderStrokecXLIe8U, cornerBasedShape);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierBorder);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            boolean z = !timePickerState.isAfternoonToggle$material3_release();
            composerStartRestartGroup.startReplaceableGroup(1654477599);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
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
                        timePickerState.setAfternoonToggle$material3_release(false);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposableSingletons$TimePickerKt composableSingletons$TimePickerKt = ComposableSingletons$TimePickerKt.INSTANCE;
            int i4 = (i2 << 3) & 7168;
            ToggleItem(z, shape, (Function0) objRememberedValue2, timePickerColors, composableSingletons$TimePickerKt.m9342getLambda1$material3_release(), composerStartRestartGroup, ((i2 >> 9) & 112) | CpioConstants.C_ISBLK | i4);
            SpacerKt.Spacer(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.INSTANCE, "Spacer"), 2.0f), 0.0f, 1, null), timePickerColors.getPeriodSelectorBorderColor(), null, 2, null), composerStartRestartGroup, 0);
            boolean zIsAfternoonToggle$material3_release = timePickerState.isAfternoonToggle$material3_release();
            composerStartRestartGroup.startReplaceableGroup(1654478145);
            boolean z3 = i3 == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
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
                        timePickerState.setAfternoonToggle$material3_release(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ToggleItem(zIsAfternoonToggle$material3_release, shape2, (Function0) objRememberedValue3, timePickerColors, composableSingletons$TimePickerKt.m9343getLambda2$material3_release(), composerStartRestartGroup, ((i2 >> 12) & 112) | CpioConstants.C_ISBLK | i4);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.PeriodToggleImpl.3
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ TimePickerColors $colors;
                public final /* synthetic */ Shape $endShape;
                public final /* synthetic */ MeasurePolicy $measurePolicy;
                public final /* synthetic */ Shape $startShape;
                public final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16933(final TimePickerState timePickerState2, TimePickerColors timePickerColors2, MeasurePolicy measurePolicy2, Shape shape3, Shape shape22, int i5) {
                    super(2);
                    timePickerState = timePickerState2;
                    timePickerColors = timePickerColors2;
                    measurePolicy = measurePolicy2;
                    shape = shape3;
                    shape = shape22;
                    i = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    TimePickerKt.PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ToggleItem(final boolean z, Shape shape, Function0<Unit> function0, TimePickerColors timePickerColors, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1937408098);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerColors) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i2, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1144)");
            }
            long jM10045periodSelectorContentColorvNxB06k$material3_release = timePickerColors.m10045periodSelectorContentColorvNxB06k$material3_release(z);
            long jM10044periodSelectorContainerColorvNxB06k$material3_release = timePickerColors.m10044periodSelectorContainerColorvNxB06k$material3_release(z);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, z ? 0.0f : 1.0f), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(526522672);
            boolean z2 = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$1$1
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
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ButtonKt.TextButton(function0, SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m9177textButtonColorsro_MJ88(jM10044periodSelectorContainerColorvNxB06k$material3_release, jM10045periodSelectorContentColorvNxB06k$material3_release, 0L, 0L, composerStartRestartGroup, CpioConstants.C_ISBLK, 12), null, null, PaddingKt.m8116PaddingValues0680j_4(C2046Dp.m13666constructorimpl(0)), null, function3, composerStartRestartGroup, ((i2 >> 6) & 14) | 12582912 | ((i2 << 6) & 7168) | ((i2 << 15) & 1879048192), 356);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ToggleItem.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ boolean $checked;
                public final /* synthetic */ TimePickerColors $colors;
                public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                public final /* synthetic */ Function0<Unit> $onClick;
                public final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C17002(final boolean z3, Shape shape2, Function0<Unit> function02, TimePickerColors timePickerColors2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i3) {
                    super(2);
                    z = z3;
                    shape = shape2;
                    function0 = function02;
                    timePickerColors = timePickerColors2;
                    function3 = function32;
                    i = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    TimePickerKt.ToggleItem(z, shape, function0, timePickerColors, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DisplaySeparator(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2100674302);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i2, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1165)");
            }
            TextStyle textStyle = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
            TextStyle textStyleM13191copyp1EtxEg = textStyle.m13191copyp1EtxEg((15695871 & 1) != 0 ? textStyle.spanStyle.m13124getColor0d7_KjU() : 0L, (15695871 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (15695871 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (15695871 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (15695871 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (15695871 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (15695871 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (15695871 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (15695871 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (15695871 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (15695871 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (15695871 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (15695871 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (15695871 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (15695871 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (15695871 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m13558getCentere0LSkKk(), (15695871 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : 0, (15695871 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (15695871 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (15695871 & 524288) != 0 ? textStyle.platformStyle : null, (15695871 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m13535getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m13547getBothEVpEnUU(), null), (15695871 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : 0, (15695871 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : 0, (15695871 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, C16871.INSTANCE);
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierClearAndSetSemantics);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m10024Text4IGK_g(StringUtils.PROCESS_POSTFIX_DELIMITER, (Modifier) null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM13191copyp1EtxEg, composer2, 6, 0, 65530);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.DisplaySeparator.3
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16883(int i3) {
                    super(2);
                    i = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i3) {
                    TimePickerKt.DisplaySeparator(modifier, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$DisplaySeparator$1 */
    /* loaded from: classes.dex */
    public static final class C16871 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C16871 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: TimeSelector-uXwN82Y */
    public static final void m10053TimeSelectoruXwN82Y(final Modifier modifier, final int i, final TimePickerState timePickerState, final int i2, final TimePickerColors timePickerColors, Composer composer, final int i3) {
        int i4;
        int iM9797constructorimpl;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(21099367);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(timePickerState) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
        }
        if ((i3 & CpioConstants.C_ISBLK) == 0) {
            i4 |= composerStartRestartGroup.changed(timePickerColors) ? 16384 : 8192;
        }
        if ((i4 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(21099367, i4, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1194)");
            }
            boolean zM9744equalsimpl0 = Selection.m9744equalsimpl0(timePickerState.m10072getSelectionJiIwxys$material3_release(), i2);
            if (Selection.m9744equalsimpl0(i2, Selection.INSTANCE.m9748getHourJiIwxys())) {
                Strings.Companion companion = Strings.INSTANCE;
                iM9797constructorimpl = Strings.m9797constructorimpl(C1551R.string.m3c_time_picker_hour_selection);
            } else {
                Strings.Companion companion2 = Strings.INSTANCE;
                iM9797constructorimpl = Strings.m9797constructorimpl(C1551R.string.m3c_time_picker_minute_selection);
            }
            final String strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(iM9797constructorimpl, composerStartRestartGroup, 0);
            long jM10046timeSelectorContainerColorvNxB06k$material3_release = timePickerColors.m10046timeSelectorContainerColorvNxB06k$material3_release(zM9744equalsimpl0);
            final long jM10047timeSelectorContentColorvNxB06k$material3_release = timePickerColors.m10047timeSelectorContentColorvNxB06k$material3_release(zM9744equalsimpl0);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-633372797);
            boolean zChanged = composerStartRestartGroup.changed(strM9866getStringNWtq28);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$1$1
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
                        SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12997getRadioButtono7Vup1c());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9866getStringNWtq28);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, true, (Function1) objRememberedValue2);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-633372653);
            boolean zChangedInstance = ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$2$1
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
                        if (Selection.m9744equalsimpl0(i2, timePickerState.m10072getSelectionJiIwxys$material3_release())) {
                            return;
                        }
                        timePickerState.m10075setSelectioniHAOin8$material3_release(i2);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16991(timePickerState, null), 3, null);
                    }

                    /* compiled from: TimePicker.kt */
                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                    @DebugMetadata(m7119c = "androidx.compose.material3.TimePickerKt$TimeSelector$2$1$1", m7120f = "TimePicker.kt", m7121i = {}, m7122l = {1218}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                    /* renamed from: androidx.compose.material3.TimePickerKt$TimeSelector$2$1$1 */
                    /* loaded from: classes2.dex */
                    public static final class C16991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ TimePickerState $state;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C16991(TimePickerState timePickerState, Continuation<? super C16991> continuation) {
                            super(2, continuation);
                            this.$state = timePickerState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new C16991(this.$state, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((C16991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                TimePickerState timePickerState = this.$state;
                                this.label = 1;
                                if (timePickerState.animateToCurrent$material3_release(this) == coroutine_suspended) {
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
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            SurfaceKt.m9877Surfaced85dljk(zM9744equalsimpl0, (Function0<Unit>) objRememberedValue3, modifierSemantics, false, value, jM10046timeSelectorContainerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1338709103, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                public final void invoke(@Nullable Composer composer3, int i5) {
                    if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1338709103, i5, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1225)");
                        }
                        final String strM10058numberContentDescriptionYKJpE6Y = TimePickerKt.m10058numberContentDescriptionYKJpE6Y(i2, timePickerState.getIs24hour(), i, composer3, 0);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        int i6 = i;
                        long j = jM10047timeSelectorContentColorvNxB06k$material3_release;
                        composer3.startReplaceableGroup(733328855);
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion4);
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
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(992582240);
                        boolean zChanged2 = composer3.changed(strM10058numberContentDescriptionYKJpE6Y);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3$1$1$1
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
                                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM10058numberContentDescriptionYKJpE6Y);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        composer3.endReplaceableGroup();
                        TextKt.m10024Text4IGK_g(ActualJvm_jvmKt.toLocalString$default(i6, 2, 0, false, 6, null), SemanticsModifierKt.semantics$default(companion4, false, (Function1) objRememberedValue4, 1, null), j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131064);
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
            }), composer2, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i5) {
                    TimePickerKt.m10053TimeSelectoruXwN82Y(modifier, i, timePickerState, i2, timePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockFace(@NotNull TimePickerState timePickerState, @NotNull TimePickerColors timePickerColors, boolean z, @Nullable Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1525091100);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525091100, i2, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1339)");
            }
            CrossfadeKt.Crossfade(timePickerState.getValues$material3_release(), SemanticsModifierKt.semantics$default(SizeKt.m8172size3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(Modifier.INSTANCE, timePickerColors.getClockDialColor(), RoundedCornerShapeKt.getCircleShape()), TimePickerTokens.INSTANCE.m10733getClockDialContainerSizeD9Ej5fM()), false, C16821.INSTANCE, 1, null), AnimationSpecKt.tween$default(350, 0, null, 6, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1628166511, true, new Function3<List<? extends Integer>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2
                public final /* synthetic */ boolean $autoSwitchToMinute;
                public final /* synthetic */ TimePickerColors $colors;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16832(boolean z2, TimePickerColors timePickerColors2) {
                    super(3);
                    z = z2;
                    timePickerColors = timePickerColors2;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends Integer> list, Composer composer2, Integer num) {
                    invoke((List<Integer>) list, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull List<Integer> list, @Nullable Composer composer2, int i3) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1628166511, i3, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1348)");
                    }
                    TimePickerKt.m10050CircularLayoutuFdPcIQ(TimePickerKt.drawSelector(SizeKt.m8172size3ABfNKs(Modifier.INSTANCE.then(new ClockDialModifier(timePickerState, z)), TimePickerTokens.INSTANCE.m10733getClockDialContainerSizeD9Ej5fM()), timePickerState, timePickerColors), TimePickerKt.OuterCircleSizeRadius, ComposableLambdaKt.composableLambda(composer2, -1385633737, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1
                        public final /* synthetic */ boolean $autoSwitchToMinute;
                        public final /* synthetic */ List<Integer> $screen;
                        public final /* synthetic */ TimePickerState $state;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(List<Integer> list2, TimePickerState timePickerState2, boolean z2) {
                            super(2);
                            list = list2;
                            timePickerState = timePickerState2;
                            z = z2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i4) {
                            if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1385633737, i4, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1355)");
                                }
                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(timePickerColors.m10028clockDialContentColorvNxB06k$material3_release(false))), ComposableLambdaKt.composableLambda(composer3, -2018362505, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1
                                    public final /* synthetic */ boolean $autoSwitchToMinute;
                                    public final /* synthetic */ List<Integer> $screen;
                                    public final /* synthetic */ TimePickerState $state;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C118721(List<Integer> list2, TimePickerState timePickerState2, boolean z2) {
                                        super(2);
                                        list = list2;
                                        timePickerState = timePickerState2;
                                        z = z2;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i5) {
                                        int iIntValue;
                                        if ((i5 & 3) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2018362505, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1358)");
                                            }
                                            composer4.startReplaceableGroup(-504293055);
                                            int size = list.size();
                                            TimePickerState timePickerState2 = timePickerState;
                                            List<Integer> list2 = list;
                                            boolean z2 = z;
                                            for (final int i6 = 0; i6 < size; i6++) {
                                                if (!timePickerState2.getIs24hour() || Selection.m9744equalsimpl0(timePickerState2.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9749getMinuteJiIwxys())) {
                                                    iIntValue = list2.get(i6).intValue();
                                                } else {
                                                    iIntValue = list2.get(i6).intValue() % 12;
                                                }
                                                int i7 = iIntValue;
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                composer4.startReplaceableGroup(-1916851139);
                                                boolean zChanged = composer4.changed(i6);
                                                Object objRememberedValue = composer4.rememberedValue();
                                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$1$1$1
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
                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i6);
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(objRememberedValue);
                                                }
                                                composer4.endReplaceableGroup();
                                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), timePickerState2, i7, z2, composer4, 0);
                                            }
                                            composer4.endReplaceableGroup();
                                            if (Selection.m9744equalsimpl0(timePickerState.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9748getHourJiIwxys()) && timePickerState.getIs24hour()) {
                                                TimePickerKt.m10050CircularLayoutuFdPcIQ(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m10733getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m11375getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.composableLambda(composer4, -448649404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1.2
                                                    public final /* synthetic */ boolean $autoSwitchToMinute;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass2(boolean z3) {
                                                        super(2);
                                                        z = z3;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                    @Composable
                                                    public final void invoke(@Nullable Composer composer5, int i8) {
                                                        if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                                            }
                                                            int size2 = TimePickerKt.ExtraHours.size();
                                                            TimePickerState timePickerState3 = timePickerState;
                                                            boolean z3 = z;
                                                            for (final int i9 = 0; i9 < size2; i9++) {
                                                                int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                                composer5.startReplaceableGroup(-1469917176);
                                                                boolean zChanged2 = composer5.changed(i9);
                                                                Object objRememberedValue2 = composer5.rememberedValue();
                                                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                                        }
                                                                    };
                                                                    composer5.updateRememberedValue(objRememberedValue2);
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }
                                                }), composer4, 432, 0);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }

                                    /* compiled from: TimePicker.kt */
                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n*L\n1386#1:1844,6\n*E\n"})
                                    /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2 */
                                    public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
                                        public final /* synthetic */ boolean $autoSwitchToMinute;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass2(boolean z3) {
                                            super(2);
                                            z = z3;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer5, int i8) {
                                            if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                                }
                                                int size2 = TimePickerKt.ExtraHours.size();
                                                TimePickerState timePickerState3 = timePickerState;
                                                boolean z3 = z;
                                                for (final int i9 = 0; i9 < size2; i9++) {
                                                    int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    composer5.startReplaceableGroup(-1469917176);
                                                    boolean zChanged2 = composer5.changed(i9);
                                                    Object objRememberedValue2 = composer5.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }
                                }), composer3, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }

                        /* compiled from: TimePicker.kt */
                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                        @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1\n*L\n1366#1:1844,6\n*E\n"})
                        /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1 */
                        public static final class C118721 extends Lambda implements Function2<Composer, Integer, Unit> {
                            public final /* synthetic */ boolean $autoSwitchToMinute;
                            public final /* synthetic */ List<Integer> $screen;
                            public final /* synthetic */ TimePickerState $state;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C118721(List<Integer> list2, TimePickerState timePickerState2, boolean z2) {
                                super(2);
                                list = list2;
                                timePickerState = timePickerState2;
                                z = z2;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i5) {
                                int iIntValue;
                                if ((i5 & 3) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2018362505, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1358)");
                                    }
                                    composer4.startReplaceableGroup(-504293055);
                                    int size = list.size();
                                    TimePickerState timePickerState2 = timePickerState;
                                    List<Integer> list2 = list;
                                    boolean z2 = z;
                                    for (final int i6 = 0; i6 < size; i6++) {
                                        if (!timePickerState2.getIs24hour() || Selection.m9744equalsimpl0(timePickerState2.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9749getMinuteJiIwxys())) {
                                            iIntValue = list2.get(i6).intValue();
                                        } else {
                                            iIntValue = list2.get(i6).intValue() % 12;
                                        }
                                        int i7 = iIntValue;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        composer4.startReplaceableGroup(-1916851139);
                                        boolean zChanged = composer4.changed(i6);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$1$1$1
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
                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i6);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        composer4.endReplaceableGroup();
                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), timePickerState2, i7, z2, composer4, 0);
                                    }
                                    composer4.endReplaceableGroup();
                                    if (Selection.m9744equalsimpl0(timePickerState.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9748getHourJiIwxys()) && timePickerState.getIs24hour()) {
                                        TimePickerKt.m10050CircularLayoutuFdPcIQ(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m10733getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m11375getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.composableLambda(composer4, -448649404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1.2
                                            public final /* synthetic */ boolean $autoSwitchToMinute;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass2(boolean z3) {
                                                super(2);
                                                z = z3;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i8) {
                                                if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                                    }
                                                    int size2 = TimePickerKt.ExtraHours.size();
                                                    TimePickerState timePickerState3 = timePickerState;
                                                    boolean z3 = z;
                                                    for (final int i9 = 0; i9 < size2; i9++) {
                                                        int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        composer5.startReplaceableGroup(-1469917176);
                                                        boolean zChanged2 = composer5.changed(i9);
                                                        Object objRememberedValue2 = composer5.rememberedValue();
                                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(objRememberedValue2);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 432, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }

                            /* compiled from: TimePicker.kt */
                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                            @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n*L\n1386#1:1844,6\n*E\n"})
                            /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2 */
                            public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
                                public final /* synthetic */ boolean $autoSwitchToMinute;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(boolean z3) {
                                    super(2);
                                    z = z3;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer5, int i8) {
                                    if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                        }
                                        int size2 = TimePickerKt.ExtraHours.size();
                                        TimePickerState timePickerState3 = timePickerState;
                                        boolean z3 = z;
                                        for (final int i9 = 0; i9 < size2; i9++) {
                                            int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            composer5.startReplaceableGroup(-1469917176);
                                            boolean zChanged2 = composer5.changed(i9);
                                            Object objRememberedValue2 = composer5.rememberedValue();
                                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                    }
                                                };
                                                composer5.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer5.endReplaceableGroup();
                                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }
                        }
                    }), composer2, 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: TimePicker.kt */
                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1 */
                public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                    public final /* synthetic */ boolean $autoSwitchToMinute;
                    public final /* synthetic */ List<Integer> $screen;
                    public final /* synthetic */ TimePickerState $state;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(List<Integer> list2, TimePickerState timePickerState2, boolean z2) {
                        super(2);
                        list = list2;
                        timePickerState = timePickerState2;
                        z = z2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i4) {
                        if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1385633737, i4, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1355)");
                            }
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(timePickerColors.m10028clockDialContentColorvNxB06k$material3_release(false))), ComposableLambdaKt.composableLambda(composer3, -2018362505, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1
                                public final /* synthetic */ boolean $autoSwitchToMinute;
                                public final /* synthetic */ List<Integer> $screen;
                                public final /* synthetic */ TimePickerState $state;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C118721(List<Integer> list2, TimePickerState timePickerState2, boolean z2) {
                                    super(2);
                                    list = list2;
                                    timePickerState = timePickerState2;
                                    z = z2;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i5) {
                                    int iIntValue;
                                    if ((i5 & 3) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2018362505, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1358)");
                                        }
                                        composer4.startReplaceableGroup(-504293055);
                                        int size = list.size();
                                        TimePickerState timePickerState2 = timePickerState;
                                        List<Integer> list2 = list;
                                        boolean z2 = z;
                                        for (final int i6 = 0; i6 < size; i6++) {
                                            if (!timePickerState2.getIs24hour() || Selection.m9744equalsimpl0(timePickerState2.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9749getMinuteJiIwxys())) {
                                                iIntValue = list2.get(i6).intValue();
                                            } else {
                                                iIntValue = list2.get(i6).intValue() % 12;
                                            }
                                            int i7 = iIntValue;
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            composer4.startReplaceableGroup(-1916851139);
                                            boolean zChanged = composer4.changed(i6);
                                            Object objRememberedValue = composer4.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$1$1$1
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
                                                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i6);
                                                    }
                                                };
                                                composer4.updateRememberedValue(objRememberedValue);
                                            }
                                            composer4.endReplaceableGroup();
                                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), timePickerState2, i7, z2, composer4, 0);
                                        }
                                        composer4.endReplaceableGroup();
                                        if (Selection.m9744equalsimpl0(timePickerState.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9748getHourJiIwxys()) && timePickerState.getIs24hour()) {
                                            TimePickerKt.m10050CircularLayoutuFdPcIQ(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m10733getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m11375getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.composableLambda(composer4, -448649404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1.2
                                                public final /* synthetic */ boolean $autoSwitchToMinute;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass2(boolean z3) {
                                                    super(2);
                                                    z = z3;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer5, int i8) {
                                                    if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                                        }
                                                        int size2 = TimePickerKt.ExtraHours.size();
                                                        TimePickerState timePickerState3 = timePickerState;
                                                        boolean z3 = z;
                                                        for (final int i9 = 0; i9 < size2; i9++) {
                                                            int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                                            composer5.startReplaceableGroup(-1469917176);
                                                            boolean zChanged2 = composer5.changed(i9);
                                                            Object objRememberedValue2 = composer5.rememberedValue();
                                                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                                    }
                                                                };
                                                                composer5.updateRememberedValue(objRememberedValue2);
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 432, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }

                                /* compiled from: TimePicker.kt */
                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n*L\n1386#1:1844,6\n*E\n"})
                                /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2 */
                                public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
                                    public final /* synthetic */ boolean $autoSwitchToMinute;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass2(boolean z3) {
                                        super(2);
                                        z = z3;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i8) {
                                        if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                            }
                                            int size2 = TimePickerKt.ExtraHours.size();
                                            TimePickerState timePickerState3 = timePickerState;
                                            boolean z3 = z;
                                            for (final int i9 = 0; i9 < size2; i9++) {
                                                int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                composer5.startReplaceableGroup(-1469917176);
                                                boolean zChanged2 = composer5.changed(i9);
                                                Object objRememberedValue2 = composer5.rememberedValue();
                                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                        }
                                                    };
                                                    composer5.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer5.endReplaceableGroup();
                                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }
                            }), composer3, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }

                    /* compiled from: TimePicker.kt */
                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1\n*L\n1366#1:1844,6\n*E\n"})
                    /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1 */
                    public static final class C118721 extends Lambda implements Function2<Composer, Integer, Unit> {
                        public final /* synthetic */ boolean $autoSwitchToMinute;
                        public final /* synthetic */ List<Integer> $screen;
                        public final /* synthetic */ TimePickerState $state;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C118721(List<Integer> list2, TimePickerState timePickerState2, boolean z2) {
                            super(2);
                            list = list2;
                            timePickerState = timePickerState2;
                            z = z2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i5) {
                            int iIntValue;
                            if ((i5 & 3) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2018362505, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1358)");
                                }
                                composer4.startReplaceableGroup(-504293055);
                                int size = list.size();
                                TimePickerState timePickerState2 = timePickerState;
                                List<Integer> list2 = list;
                                boolean z2 = z;
                                for (final int i6 = 0; i6 < size; i6++) {
                                    if (!timePickerState2.getIs24hour() || Selection.m9744equalsimpl0(timePickerState2.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9749getMinuteJiIwxys())) {
                                        iIntValue = list2.get(i6).intValue();
                                    } else {
                                        iIntValue = list2.get(i6).intValue() % 12;
                                    }
                                    int i7 = iIntValue;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    composer4.startReplaceableGroup(-1916851139);
                                    boolean zChanged = composer4.changed(i6);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$1$1$1
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
                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i6);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    composer4.endReplaceableGroup();
                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), timePickerState2, i7, z2, composer4, 0);
                                }
                                composer4.endReplaceableGroup();
                                if (Selection.m9744equalsimpl0(timePickerState.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9748getHourJiIwxys()) && timePickerState.getIs24hour()) {
                                    TimePickerKt.m10050CircularLayoutuFdPcIQ(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m10733getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m11375getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.composableLambda(composer4, -448649404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1.2
                                        public final /* synthetic */ boolean $autoSwitchToMinute;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass2(boolean z3) {
                                            super(2);
                                            z = z3;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer5, int i8) {
                                            if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                                }
                                                int size2 = TimePickerKt.ExtraHours.size();
                                                TimePickerState timePickerState3 = timePickerState;
                                                boolean z3 = z;
                                                for (final int i9 = 0; i9 < size2; i9++) {
                                                    int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    composer5.startReplaceableGroup(-1469917176);
                                                    boolean zChanged2 = composer5.changed(i9);
                                                    Object objRememberedValue2 = composer5.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }), composer4, 432, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }

                        /* compiled from: TimePicker.kt */
                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                        @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n*L\n1386#1:1844,6\n*E\n"})
                        /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2 */
                        public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
                            public final /* synthetic */ boolean $autoSwitchToMinute;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass2(boolean z3) {
                                super(2);
                                z = z3;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer5, int i8) {
                                if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                    }
                                    int size2 = TimePickerKt.ExtraHours.size();
                                    TimePickerState timePickerState3 = timePickerState;
                                    boolean z3 = z;
                                    for (final int i9 = 0; i9 < size2; i9++) {
                                        int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        composer5.startReplaceableGroup(-1469917176);
                                        boolean zChanged2 = composer5.changed(i9);
                                        Object objRememberedValue2 = composer5.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                }
                                            };
                                            composer5.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer5.endReplaceableGroup();
                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        }
                    }
                }
            }), composerStartRestartGroup, CpioConstants.C_ISBLK, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.3
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ boolean $autoSwitchToMinute;
                public final /* synthetic */ TimePickerColors $colors;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16843(TimePickerColors timePickerColors2, boolean z2, int i3) {
                    super(2);
                    timePickerColors = timePickerColors2;
                    z = z2;
                    i = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    TimePickerKt.ClockFace(timePickerState, timePickerColors, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1 */
    /* loaded from: classes.dex */
    public static final class C16821 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C16821 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "screen", "", "", "invoke", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2 */
    /* loaded from: classes.dex */
    public static final class C16832 extends Lambda implements Function3<List<? extends Integer>, Composer, Integer, Unit> {
        public final /* synthetic */ boolean $autoSwitchToMinute;
        public final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16832(boolean z2, TimePickerColors timePickerColors2) {
            super(3);
            z = z2;
            timePickerColors = timePickerColors2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Integer> list, Composer composer2, Integer num) {
            invoke((List<Integer>) list, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull List<Integer> list2, @Nullable Composer composer2, int i3) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1628166511, i3, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1348)");
            }
            TimePickerKt.m10050CircularLayoutuFdPcIQ(TimePickerKt.drawSelector(SizeKt.m8172size3ABfNKs(Modifier.INSTANCE.then(new ClockDialModifier(timePickerState, z)), TimePickerTokens.INSTANCE.m10733getClockDialContainerSizeD9Ej5fM()), timePickerState, timePickerColors), TimePickerKt.OuterCircleSizeRadius, ComposableLambdaKt.composableLambda(composer2, -1385633737, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1
                public final /* synthetic */ boolean $autoSwitchToMinute;
                public final /* synthetic */ List<Integer> $screen;
                public final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(List<Integer> list22, TimePickerState timePickerState2, boolean z2) {
                    super(2);
                    list = list22;
                    timePickerState = timePickerState2;
                    z = z2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i4) {
                    if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1385633737, i4, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1355)");
                        }
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(timePickerColors.m10028clockDialContentColorvNxB06k$material3_release(false))), ComposableLambdaKt.composableLambda(composer3, -2018362505, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1
                            public final /* synthetic */ boolean $autoSwitchToMinute;
                            public final /* synthetic */ List<Integer> $screen;
                            public final /* synthetic */ TimePickerState $state;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C118721(List<Integer> list22, TimePickerState timePickerState2, boolean z2) {
                                super(2);
                                list = list22;
                                timePickerState = timePickerState2;
                                z = z2;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i5) {
                                int iIntValue;
                                if ((i5 & 3) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2018362505, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1358)");
                                    }
                                    composer4.startReplaceableGroup(-504293055);
                                    int size = list.size();
                                    TimePickerState timePickerState2 = timePickerState;
                                    List<Integer> list22 = list;
                                    boolean z2 = z;
                                    for (final int i6 = 0; i6 < size; i6++) {
                                        if (!timePickerState2.getIs24hour() || Selection.m9744equalsimpl0(timePickerState2.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9749getMinuteJiIwxys())) {
                                            iIntValue = list22.get(i6).intValue();
                                        } else {
                                            iIntValue = list22.get(i6).intValue() % 12;
                                        }
                                        int i7 = iIntValue;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        composer4.startReplaceableGroup(-1916851139);
                                        boolean zChanged = composer4.changed(i6);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$1$1$1
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
                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i6);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        composer4.endReplaceableGroup();
                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), timePickerState2, i7, z2, composer4, 0);
                                    }
                                    composer4.endReplaceableGroup();
                                    if (Selection.m9744equalsimpl0(timePickerState.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9748getHourJiIwxys()) && timePickerState.getIs24hour()) {
                                        TimePickerKt.m10050CircularLayoutuFdPcIQ(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m10733getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m11375getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.composableLambda(composer4, -448649404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1.2
                                            public final /* synthetic */ boolean $autoSwitchToMinute;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass2(boolean z3) {
                                                super(2);
                                                z = z3;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i8) {
                                                if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                                    }
                                                    int size2 = TimePickerKt.ExtraHours.size();
                                                    TimePickerState timePickerState3 = timePickerState;
                                                    boolean z3 = z;
                                                    for (final int i9 = 0; i9 < size2; i9++) {
                                                        int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        composer5.startReplaceableGroup(-1469917176);
                                                        boolean zChanged2 = composer5.changed(i9);
                                                        Object objRememberedValue2 = composer5.rememberedValue();
                                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(objRememberedValue2);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 432, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }

                            /* compiled from: TimePicker.kt */
                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                            @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n*L\n1386#1:1844,6\n*E\n"})
                            /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2 */
                            public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
                                public final /* synthetic */ boolean $autoSwitchToMinute;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(boolean z3) {
                                    super(2);
                                    z = z3;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer5, int i8) {
                                    if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                        }
                                        int size2 = TimePickerKt.ExtraHours.size();
                                        TimePickerState timePickerState3 = timePickerState;
                                        boolean z3 = z;
                                        for (final int i9 = 0; i9 < size2; i9++) {
                                            int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            composer5.startReplaceableGroup(-1469917176);
                                            boolean zChanged2 = composer5.changed(i9);
                                            Object objRememberedValue2 = composer5.rememberedValue();
                                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                    }
                                                };
                                                composer5.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer5.endReplaceableGroup();
                                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }
                        }), composer3, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }

                /* compiled from: TimePicker.kt */
                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1\n*L\n1366#1:1844,6\n*E\n"})
                /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1 */
                public static final class C118721 extends Lambda implements Function2<Composer, Integer, Unit> {
                    public final /* synthetic */ boolean $autoSwitchToMinute;
                    public final /* synthetic */ List<Integer> $screen;
                    public final /* synthetic */ TimePickerState $state;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C118721(List<Integer> list22, TimePickerState timePickerState2, boolean z2) {
                        super(2);
                        list = list22;
                        timePickerState = timePickerState2;
                        z = z2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer4, int i5) {
                        int iIntValue;
                        if ((i5 & 3) != 2 || !composer4.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2018362505, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1358)");
                            }
                            composer4.startReplaceableGroup(-504293055);
                            int size = list.size();
                            TimePickerState timePickerState2 = timePickerState;
                            List<Integer> list22 = list;
                            boolean z2 = z;
                            for (final int i6 = 0; i6 < size; i6++) {
                                if (!timePickerState2.getIs24hour() || Selection.m9744equalsimpl0(timePickerState2.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9749getMinuteJiIwxys())) {
                                    iIntValue = list22.get(i6).intValue();
                                } else {
                                    iIntValue = list22.get(i6).intValue() % 12;
                                }
                                int i7 = iIntValue;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                composer4.startReplaceableGroup(-1916851139);
                                boolean zChanged = composer4.changed(i6);
                                Object objRememberedValue = composer4.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$1$1$1
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
                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i6);
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue);
                                }
                                composer4.endReplaceableGroup();
                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), timePickerState2, i7, z2, composer4, 0);
                            }
                            composer4.endReplaceableGroup();
                            if (Selection.m9744equalsimpl0(timePickerState.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9748getHourJiIwxys()) && timePickerState.getIs24hour()) {
                                TimePickerKt.m10050CircularLayoutuFdPcIQ(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m10733getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m11375getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.composableLambda(composer4, -448649404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1.2
                                    public final /* synthetic */ boolean $autoSwitchToMinute;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass2(boolean z3) {
                                        super(2);
                                        z = z3;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i8) {
                                        if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                            }
                                            int size2 = TimePickerKt.ExtraHours.size();
                                            TimePickerState timePickerState3 = timePickerState;
                                            boolean z3 = z;
                                            for (final int i9 = 0; i9 < size2; i9++) {
                                                int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                composer5.startReplaceableGroup(-1469917176);
                                                boolean zChanged2 = composer5.changed(i9);
                                                Object objRememberedValue2 = composer5.rememberedValue();
                                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                        }
                                                    };
                                                    composer5.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer5.endReplaceableGroup();
                                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer4, 432, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer4.skipToGroupEnd();
                    }

                    /* compiled from: TimePicker.kt */
                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n*L\n1386#1:1844,6\n*E\n"})
                    /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2 */
                    public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
                        public final /* synthetic */ boolean $autoSwitchToMinute;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(boolean z3) {
                            super(2);
                            z = z3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer5, int i8) {
                            if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                }
                                int size2 = TimePickerKt.ExtraHours.size();
                                TimePickerState timePickerState3 = timePickerState;
                                boolean z3 = z;
                                for (final int i9 = 0; i9 < size2; i9++) {
                                    int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    composer5.startReplaceableGroup(-1469917176);
                                    boolean zChanged2 = composer5.changed(i9);
                                    Object objRememberedValue2 = composer5.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                            }
                                        };
                                        composer5.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer5.endReplaceableGroup();
                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    }
                }
            }), composer2, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: TimePicker.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1 */
        public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ boolean $autoSwitchToMinute;
            public final /* synthetic */ List<Integer> $screen;
            public final /* synthetic */ TimePickerState $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<Integer> list22, TimePickerState timePickerState2, boolean z2) {
                super(2);
                list = list22;
                timePickerState = timePickerState2;
                z = z2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer3, int i4) {
                if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1385633737, i4, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1355)");
                    }
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(timePickerColors.m10028clockDialContentColorvNxB06k$material3_release(false))), ComposableLambdaKt.composableLambda(composer3, -2018362505, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1
                        public final /* synthetic */ boolean $autoSwitchToMinute;
                        public final /* synthetic */ List<Integer> $screen;
                        public final /* synthetic */ TimePickerState $state;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C118721(List<Integer> list22, TimePickerState timePickerState2, boolean z2) {
                            super(2);
                            list = list22;
                            timePickerState = timePickerState2;
                            z = z2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i5) {
                            int iIntValue;
                            if ((i5 & 3) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2018362505, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1358)");
                                }
                                composer4.startReplaceableGroup(-504293055);
                                int size = list.size();
                                TimePickerState timePickerState2 = timePickerState;
                                List<Integer> list22 = list;
                                boolean z2 = z;
                                for (final int i6 = 0; i6 < size; i6++) {
                                    if (!timePickerState2.getIs24hour() || Selection.m9744equalsimpl0(timePickerState2.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9749getMinuteJiIwxys())) {
                                        iIntValue = list22.get(i6).intValue();
                                    } else {
                                        iIntValue = list22.get(i6).intValue() % 12;
                                    }
                                    int i7 = iIntValue;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    composer4.startReplaceableGroup(-1916851139);
                                    boolean zChanged = composer4.changed(i6);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$1$1$1
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
                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i6);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    composer4.endReplaceableGroup();
                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), timePickerState2, i7, z2, composer4, 0);
                                }
                                composer4.endReplaceableGroup();
                                if (Selection.m9744equalsimpl0(timePickerState.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9748getHourJiIwxys()) && timePickerState.getIs24hour()) {
                                    TimePickerKt.m10050CircularLayoutuFdPcIQ(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m10733getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m11375getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.composableLambda(composer4, -448649404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1.2
                                        public final /* synthetic */ boolean $autoSwitchToMinute;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass2(boolean z3) {
                                            super(2);
                                            z = z3;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer5, int i8) {
                                            if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                                }
                                                int size2 = TimePickerKt.ExtraHours.size();
                                                TimePickerState timePickerState3 = timePickerState;
                                                boolean z3 = z;
                                                for (final int i9 = 0; i9 < size2; i9++) {
                                                    int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    composer5.startReplaceableGroup(-1469917176);
                                                    boolean zChanged2 = composer5.changed(i9);
                                                    Object objRememberedValue2 = composer5.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }), composer4, 432, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }

                        /* compiled from: TimePicker.kt */
                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                        @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n*L\n1386#1:1844,6\n*E\n"})
                        /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2 */
                        public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
                            public final /* synthetic */ boolean $autoSwitchToMinute;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass2(boolean z3) {
                                super(2);
                                z = z3;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer5, int i8) {
                                if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                    }
                                    int size2 = TimePickerKt.ExtraHours.size();
                                    TimePickerState timePickerState3 = timePickerState;
                                    boolean z3 = z;
                                    for (final int i9 = 0; i9 < size2; i9++) {
                                        int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        composer5.startReplaceableGroup(-1469917176);
                                        boolean zChanged2 = composer5.changed(i9);
                                        Object objRememberedValue2 = composer5.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                }
                                            };
                                            composer5.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer5.endReplaceableGroup();
                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        }
                    }), composer3, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }

            /* compiled from: TimePicker.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1\n*L\n1366#1:1844,6\n*E\n"})
            /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1 */
            public static final class C118721 extends Lambda implements Function2<Composer, Integer, Unit> {
                public final /* synthetic */ boolean $autoSwitchToMinute;
                public final /* synthetic */ List<Integer> $screen;
                public final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C118721(List<Integer> list22, TimePickerState timePickerState2, boolean z2) {
                    super(2);
                    list = list22;
                    timePickerState = timePickerState2;
                    z = z2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer4, int i5) {
                    int iIntValue;
                    if ((i5 & 3) != 2 || !composer4.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2018362505, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1358)");
                        }
                        composer4.startReplaceableGroup(-504293055);
                        int size = list.size();
                        TimePickerState timePickerState2 = timePickerState;
                        List<Integer> list22 = list;
                        boolean z2 = z;
                        for (final int i6 = 0; i6 < size; i6++) {
                            if (!timePickerState2.getIs24hour() || Selection.m9744equalsimpl0(timePickerState2.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9749getMinuteJiIwxys())) {
                                iIntValue = list22.get(i6).intValue();
                            } else {
                                iIntValue = list22.get(i6).intValue() % 12;
                            }
                            int i7 = iIntValue;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            composer4.startReplaceableGroup(-1916851139);
                            boolean zChanged = composer4.changed(i6);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$1$1$1
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
                                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i6);
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            composer4.endReplaceableGroup();
                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), timePickerState2, i7, z2, composer4, 0);
                        }
                        composer4.endReplaceableGroup();
                        if (Selection.m9744equalsimpl0(timePickerState.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9748getHourJiIwxys()) && timePickerState.getIs24hour()) {
                            TimePickerKt.m10050CircularLayoutuFdPcIQ(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m10733getClockDialContainerSizeD9Ej5fM()), Color.INSTANCE.m11375getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.composableLambda(composer4, -448649404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2.1.1.2
                                public final /* synthetic */ boolean $autoSwitchToMinute;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(boolean z3) {
                                    super(2);
                                    z = z3;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer5, int i8) {
                                    if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                                        }
                                        int size2 = TimePickerKt.ExtraHours.size();
                                        TimePickerState timePickerState3 = timePickerState;
                                        boolean z3 = z;
                                        for (final int i9 = 0; i9 < size2; i9++) {
                                            int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            composer5.startReplaceableGroup(-1469917176);
                                            boolean zChanged2 = composer5.changed(i9);
                                            Object objRememberedValue2 = composer5.rememberedValue();
                                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                                    }
                                                };
                                                composer5.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer5.endReplaceableGroup();
                                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }), composer4, 432, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer4.skipToGroupEnd();
                }

                /* compiled from: TimePicker.kt */
                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockFace$2$1$1$2\n*L\n1386#1:1844,6\n*E\n"})
                /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2 */
                public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
                    public final /* synthetic */ boolean $autoSwitchToMinute;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(boolean z3) {
                        super(2);
                        z = z3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer5, int i8) {
                        if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-448649404, i8, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1382)");
                            }
                            int size2 = TimePickerKt.ExtraHours.size();
                            TimePickerState timePickerState3 = timePickerState;
                            boolean z3 = z;
                            for (final int i9 = 0; i9 < size2; i9++) {
                                int iIntValue2 = ((Number) TimePickerKt.ExtraHours.get(i9)).intValue();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                composer5.startReplaceableGroup(-1469917176);
                                boolean zChanged2 = composer5.changed(i9);
                                Object objRememberedValue2 = composer5.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2$1$1$1
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
                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i9);
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue2);
                                }
                                composer5.endReplaceableGroup();
                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), timePickerState3, iIntValue2, z3, composer5, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer5.skipToGroupEnd();
                    }
                }
            }
        }
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$drawSelector$1 */
    /* loaded from: classes.dex */
    public static final class C17061 extends Lambda implements Function1<ContentDrawScope, Unit> {
        public final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17061(TimePickerColors timePickerColors) {
            super(1);
            timePickerColors = timePickerColors;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
            long jOffset = OffsetKt.Offset(contentDrawScope.mo7874toPx0680j_4(DpOffset.m13727getXD9Ej5fM(timePickerState.m10073getSelectorPosRKDOV3M$material3_release())), contentDrawScope.mo7874toPx0680j_4(DpOffset.m13729getYD9Ej5fM(timePickerState.m10073getSelectorPosRKDOV3M$material3_release())));
            TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
            float f = 2;
            float fMo7874toPx0680j_4 = contentDrawScope.mo7874toPx0680j_4(timePickerTokens.m10735getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f;
            long selectorColor = timePickerColors.getSelectorColor();
            long jM11366getBlack0d7_KjU = Color.INSTANCE.m11366getBlack0d7_KjU();
            BlendMode.Companion companion = BlendMode.INSTANCE;
            DrawScope.m11871drawCircleVaOC9Bg$default(contentDrawScope, jM11366getBlack0d7_KjU, fMo7874toPx0680j_4, jOffset, 0.0f, null, null, companion.m11255getClear0nO6VwU(), 56, null);
            contentDrawScope.drawContent();
            DrawScope.m11871drawCircleVaOC9Bg$default(contentDrawScope, selectorColor, fMo7874toPx0680j_4, jOffset, 0.0f, null, null, companion.m11283getXor0nO6VwU(), 56, null);
            DrawScope.m11876drawLineNGM6Ib0$default(contentDrawScope, selectorColor, androidx.compose.p003ui.geometry.SizeKt.m11178getCenteruvyYCjk(contentDrawScope.mo11889getSizeNHjbRc()), Offset.m11103minusMKHz9U(jOffset, OffsetKt.Offset(((float) Math.cos(timePickerState.getCurrentAngle$material3_release().getValue().floatValue())) * fMo7874toPx0680j_4, ((float) Math.sin(timePickerState.getCurrentAngle$material3_release().getValue().floatValue())) * fMo7874toPx0680j_4)), contentDrawScope.mo7874toPx0680j_4(timePickerTokens.m10736getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, companion.m11282getSrcOver0nO6VwU(), 240, null);
            DrawScope.m11871drawCircleVaOC9Bg$default(contentDrawScope, selectorColor, contentDrawScope.mo7874toPx0680j_4(timePickerTokens.m10734getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f, androidx.compose.p003ui.geometry.SizeKt.m11178getCenteruvyYCjk(contentDrawScope.mo11889getSizeNHjbRc()), 0.0f, null, null, 0, 120, null);
            DrawScope.m11871drawCircleVaOC9Bg$default(contentDrawScope, timePickerColors.m10028clockDialContentColorvNxB06k$material3_release(true), fMo7874toPx0680j_4, jOffset, 0.0f, null, null, companion.m11265getDstOver0nO6VwU(), 56, null);
        }
    }

    public static final Modifier drawSelector(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt.drawSelector.1
            public final /* synthetic */ TimePickerColors $colors;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17061(TimePickerColors timePickerColors2) {
                super(1);
                timePickerColors = timePickerColors2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                long jOffset = OffsetKt.Offset(contentDrawScope.mo7874toPx0680j_4(DpOffset.m13727getXD9Ej5fM(timePickerState.m10073getSelectorPosRKDOV3M$material3_release())), contentDrawScope.mo7874toPx0680j_4(DpOffset.m13729getYD9Ej5fM(timePickerState.m10073getSelectorPosRKDOV3M$material3_release())));
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                float f = 2;
                float fMo7874toPx0680j_4 = contentDrawScope.mo7874toPx0680j_4(timePickerTokens.m10735getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f;
                long selectorColor = timePickerColors.getSelectorColor();
                long jM11366getBlack0d7_KjU = Color.INSTANCE.m11366getBlack0d7_KjU();
                BlendMode.Companion companion = BlendMode.INSTANCE;
                DrawScope.m11871drawCircleVaOC9Bg$default(contentDrawScope, jM11366getBlack0d7_KjU, fMo7874toPx0680j_4, jOffset, 0.0f, null, null, companion.m11255getClear0nO6VwU(), 56, null);
                contentDrawScope.drawContent();
                DrawScope.m11871drawCircleVaOC9Bg$default(contentDrawScope, selectorColor, fMo7874toPx0680j_4, jOffset, 0.0f, null, null, companion.m11283getXor0nO6VwU(), 56, null);
                DrawScope.m11876drawLineNGM6Ib0$default(contentDrawScope, selectorColor, androidx.compose.p003ui.geometry.SizeKt.m11178getCenteruvyYCjk(contentDrawScope.mo11889getSizeNHjbRc()), Offset.m11103minusMKHz9U(jOffset, OffsetKt.Offset(((float) Math.cos(timePickerState.getCurrentAngle$material3_release().getValue().floatValue())) * fMo7874toPx0680j_4, ((float) Math.sin(timePickerState.getCurrentAngle$material3_release().getValue().floatValue())) * fMo7874toPx0680j_4)), contentDrawScope.mo7874toPx0680j_4(timePickerTokens.m10736getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, companion.m11282getSrcOver0nO6VwU(), 240, null);
                DrawScope.m11871drawCircleVaOC9Bg$default(contentDrawScope, selectorColor, contentDrawScope.mo7874toPx0680j_4(timePickerTokens.m10734getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f, androidx.compose.p003ui.geometry.SizeKt.m11178getCenteruvyYCjk(contentDrawScope.mo11889getSizeNHjbRc()), 0.0f, null, null, 0, 120, null);
                DrawScope.m11871drawCircleVaOC9Bg$default(contentDrawScope, timePickerColors.m10028clockDialContentColorvNxB06k$material3_release(true), fMo7874toPx0680j_4, jOffset, 0.0f, null, null, companion.m11265getDstOver0nO6VwU(), 56, null);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockText(Modifier modifier, final TimePickerState timePickerState, int i, final boolean z, Composer composer, int i2) {
        int i3;
        boolean zAreEqual;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1420123631);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i4 = i3;
        if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1420123631, i4, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1467)");
            }
            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TimePickerTokens.INSTANCE.getClockDialLabelTextFont());
            final float fMo7874toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(MaxDistance);
            composerStartRestartGroup.startReplaceableGroup(-1652988653);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m11088boximpl(Offset.INSTANCE.m11115getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            final String strM10058numberContentDescriptionYKJpE6Y = m10058numberContentDescriptionYKJpE6Y(timePickerState.m10072getSelectionJiIwxys$material3_release(), timePickerState.getIs24hour(), i, composerStartRestartGroup, i4 & 896);
            String localString$default = ActualJvm_jvmKt.toLocalString$default(i, 0, 0, false, 7, null);
            if (Selection.m9744equalsimpl0(timePickerState.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9749getMinuteJiIwxys())) {
                zAreEqual = Intrinsics.areEqual(ActualJvm_jvmKt.toLocalString$default(timePickerState.getMinute(), 0, 0, false, 7, null), localString$default);
            } else {
                zAreEqual = Intrinsics.areEqual(ActualJvm_jvmKt.toLocalString$default(timePickerState.getHour(), 0, 0, false, 7, null), localString$default);
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), MinimumInteractiveSize);
            composerStartRestartGroup.startReplaceableGroup(-1652987978);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutCoordinates layoutCoordinates) {
                        TimePickerKt.ClockText$lambda$29(mutableState, LayoutCoordinatesKt.boundsInParent(layoutCoordinates).m11129getCenterF1C5BW0());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierFocusable$default = FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM8172size3ABfNKs, (Function1) objRememberedValue3), false, null, 3, null);
            composerStartRestartGroup.startReplaceableGroup(-1652987865);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | ((i4 & 112) == 32) | composerStartRestartGroup.changed(fMo7874toPx0680j_4) | ((i4 & 7168) == 2048) | composerStartRestartGroup.changed(zAreEqual);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                final boolean z2 = zAreEqual;
                objRememberedValue4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1
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
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final TimePickerState timePickerState2 = timePickerState;
                        final float f = fMo7874toPx0680j_4;
                        final boolean z3 = z;
                        final MutableState<Offset> mutableState2 = mutableState;
                        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* compiled from: TimePicker.kt */
                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                            @DebugMetadata(m7119c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", m7120f = "TimePicker.kt", m7121i = {}, m7122l = {1496}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                            /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: invalid class name */
                            /* loaded from: classes2.dex */
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public final /* synthetic */ boolean $autoSwitchToMinute;
                                public final /* synthetic */ MutableState<Offset> $center$delegate;
                                public final /* synthetic */ float $maxDist;
                                public final /* synthetic */ TimePickerState $state;
                                public int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(TimePickerState timePickerState, float f, boolean z, MutableState<Offset> mutableState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$state = timePickerState;
                                    this.$maxDist = f;
                                    this.$autoSwitchToMinute = z;
                                    this.$center$delegate = mutableState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        TimePickerState timePickerState = this.$state;
                                        float fM11099getXimpl = Offset.m11099getXimpl(TimePickerKt.ClockText$lambda$28(this.$center$delegate));
                                        float fM11100getYimpl = Offset.m11100getYimpl(TimePickerKt.ClockText$lambda$28(this.$center$delegate));
                                        float f = this.$maxDist;
                                        boolean z = this.$autoSwitchToMinute;
                                        this.label = 1;
                                        if (timePickerState.onTap$material3_release(fM11099getXimpl, fM11100getYimpl, f, z, this) == coroutine_suspended) {
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

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Boolean invoke() {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(timePickerState2, f, z3, mutableState2, null), 3, null);
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierFocusable$default, true, (Function1) objRememberedValue4);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSemantics);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(859631475);
            boolean zChanged = composerStartRestartGroup.changed(strM10058numberContentDescriptionYKJpE6Y);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$3$1$1
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
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM10058numberContentDescriptionYKJpE6Y);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion3, (Function1) objRememberedValue5);
            composer2 = composerStartRestartGroup;
            TextKt.m10024Text4IGK_g(localString$default, modifierClearAndSetSemantics, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleFromToken, composer2, 0, 0, 65532);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockText.4
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ boolean $autoSwitchToMinute;
                public final /* synthetic */ TimePickerState $state;
                public final /* synthetic */ int $value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16864(final TimePickerState timePickerState2, int i5, final boolean z3, int i22) {
                    super(2);
                    timePickerState = timePickerState2;
                    i = i5;
                    z = z3;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i5) {
                    TimePickerKt.ClockText(modifier, timePickerState, i, z, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ClockText$lambda$29(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m11088boximpl(j));
    }

    /* renamed from: timeInputOnChange-gIWD5Rc */
    public static final void m10059timeInputOnChangegIWD5Rc(int i, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i2, Function1<? super TextFieldValue, Unit> function1) throws NumberFormatException {
        int iDigitToInt;
        if (Intrinsics.areEqual(textFieldValue.getText(), textFieldValue2.getText())) {
            function1.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.getText().length() == 0) {
            if (Selection.m9744equalsimpl0(i, Selection.INSTANCE.m9748getHourJiIwxys())) {
                timePickerState.setHour$material3_release(0);
            } else {
                timePickerState.setMinute$material3_release(0);
            }
            function1.invoke(TextFieldValue.m13399copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            if (textFieldValue.getText().length() == 3 && TextRange.m13165getStartimpl(textFieldValue.getSelection()) == 1) {
                iDigitToInt = CharsKt__CharKt.digitToInt(textFieldValue.getText().charAt(0));
            } else {
                iDigitToInt = Integer.parseInt(textFieldValue.getText());
            }
            if (iDigitToInt <= i2) {
                Selection.Companion companion = Selection.INSTANCE;
                if (Selection.m9744equalsimpl0(i, companion.m9748getHourJiIwxys())) {
                    timePickerState.setHour$material3_release(iDigitToInt);
                    if (iDigitToInt > 1 && !timePickerState.getIs24hour()) {
                        timePickerState.m10075setSelectioniHAOin8$material3_release(companion.m9749getMinuteJiIwxys());
                    }
                } else {
                    timePickerState.setMinute$material3_release(iDigitToInt);
                }
                if (textFieldValue.getText().length() > 2) {
                    textFieldValue = TextFieldValue.m13399copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null);
                }
                function1.invoke(textFieldValue);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:243:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:353:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: TimePickerTextField-lxUZ_iY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10052TimePickerTextFieldlxUZ_iY(final Modifier modifier, final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, final TimePickerState timePickerState, final int i, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final TimePickerColors timePickerColors, Composer composer, final int i2, final int i3) {
        int i4;
        KeyboardOptions keyboardOptions2;
        int i5;
        KeyboardActions keyboardActions2;
        int i6;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        boolean zM9744equalsimpl0;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i7;
        FocusRequester focusRequester;
        MutableInteractionSource mutableInteractionSource;
        int i8;
        ?? r9;
        Selection.Companion companion2;
        int iM9797constructorimpl;
        final String strM9866getStringNWtq28;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChanged;
        Object objRememberedValue3;
        FocusRequester focusRequester2;
        int iM9797constructorimpl2;
        Composer composer2;
        boolean z;
        Object objRememberedValue4;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-367523658);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(textFieldValue) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(timePickerState) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= CpioConstants.C_ISBLK;
        } else if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        int i9 = i3 & 32;
        if (i9 == 0) {
            if ((196608 & i2) == 0) {
                keyboardOptions2 = keyboardOptions;
                i4 |= composerStartRestartGroup.changed(keyboardOptions2) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
                keyboardActions2 = keyboardActions;
            } else {
                keyboardActions2 = keyboardActions;
                if ((i2 & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(keyboardActions2) ? 1048576 : 524288;
                }
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changed(timePickerColors) ? 8388608 : 4194304;
            }
            i6 = i4;
            if ((4793491 & i6) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                KeyboardOptions keyboardOptions4 = i9 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                KeyboardActions keyboardActions4 = i5 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-367523658, i6, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1573)");
                }
                composerStartRestartGroup.startReplaceableGroup(-525715937);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-525715872);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                FocusRequester focusRequester3 = (FocusRequester) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                final TextFieldColors textFieldColorsM9626colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m9626colors0hiis_0(timePickerColors.m10047timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m10046timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m10046timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, 3072, 2147483598, UnixStat.PERM_MASK);
                zM9744equalsimpl0 = Selection.m9744equalsimpl0(i, timePickerState.m10072getSelectionJiIwxys$material3_release());
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(896157841);
                if (zM9744equalsimpl0) {
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    TimeInputTokens timeInputTokens = TimeInputTokens.INSTANCE;
                    int i10 = i6 >> 3;
                    i8 = -1323940314;
                    r9 = 1;
                    focusRequester = focusRequester3;
                    mutableInteractionSource = mutableInteractionSource2;
                    i7 = i6;
                    m10053TimeSelectoruXwN82Y(SizeKt.m8174sizeVpY3zN4(companion5, timeInputTokens.m10731getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens.m10730getTimeFieldContainerHeightD9Ej5fM()), Selection.m9744equalsimpl0(i, Selection.INSTANCE.m9748getHourJiIwxys()) ? timePickerState.getHourForDisplay$material3_release() : timePickerState.getMinute(), timePickerState, i, timePickerColors, composerStartRestartGroup, ((i6 >> 9) & 57344) | (i10 & 7168) | (i10 & 896) | 6);
                } else {
                    i7 = i6;
                    focusRequester = focusRequester3;
                    mutableInteractionSource = mutableInteractionSource2;
                    i8 = -1323940314;
                    r9 = 1;
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion2 = Selection.INSTANCE;
                if (!Selection.m9744equalsimpl0(i, companion2.m9749getMinuteJiIwxys())) {
                    Strings.Companion companion6 = Strings.INSTANCE;
                    iM9797constructorimpl = Strings.m9797constructorimpl(C1551R.string.m3c_time_picker_minute_text_field);
                } else {
                    Strings.Companion companion7 = Strings.INSTANCE;
                    iM9797constructorimpl = Strings.m9797constructorimpl(C1551R.string.m3c_time_picker_hour_text_field);
                }
                strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(iM9797constructorimpl, composerStartRestartGroup, 0);
                Modifier.Companion companion8 = Modifier.INSTANCE;
                Modifier modifierVisible = visible(companion8, zM9744equalsimpl0);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(i8);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierVisible);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion8, focusRequester);
                TimeInputTokens timeInputTokens2 = TimeInputTokens.INSTANCE;
                Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(modifierFocusRequester, timeInputTokens2.m10731getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens2.m10730getTimeFieldContainerHeightD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(-1694928032);
                zChanged = composerStartRestartGroup.changed(strM9866getStringNWtq28);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$1$1
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
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM8174sizeVpY3zN4, false, (Function1) objRememberedValue3, r9, null);
                TextStyle textStyle = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                Brush.Companion companion9 = Brush.INSTANCE;
                Float fValueOf = Float.valueOf(0.0f);
                Color.Companion companion10 = Color.INSTANCE;
                Pair pairM7112to = TuplesKt.m7112to(fValueOf, Color.m11330boximpl(companion10.m11375getTransparent0d7_KjU()));
                Pair pairM7112to2 = TuplesKt.m7112to(Float.valueOf(0.1f), Color.m11330boximpl(companion10.m11375getTransparent0d7_KjU()));
                Float fValueOf2 = Float.valueOf(0.1f);
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                Brush brushM11298verticalGradient8A3gB4$default = Brush.Companion.m11298verticalGradient8A3gB4$default(companion9, new Pair[]{pairM7112to, pairM7112to2, TuplesKt.m7112to(fValueOf2, Color.m11330boximpl(materialTheme.getColorScheme(composerStartRestartGroup, 6).getPrimary())), TuplesKt.m7112to(Float.valueOf(0.9f), Color.m11330boximpl(materialTheme.getColorScheme(composerStartRestartGroup, 6).getPrimary())), TuplesKt.m7112to(Float.valueOf(0.9f), Color.m11330boximpl(companion10.m11375getTransparent0d7_KjU())), TuplesKt.m7112to(Float.valueOf(1.0f), Color.m11330boximpl(companion10.m11375getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
                final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                int i11 = i7;
                int i12 = i11 >> 3;
                int i13 = i11 << 3;
                focusRequester2 = focusRequester;
                BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifierSemantics$default, true, false, textStyle, keyboardOptions4, keyboardActions4, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource3, brushM11298verticalGradient8A3gB4$default, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2133555260, r9, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                    public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer3, int i14) {
                        int i15;
                        if ((i14 & 6) == 0) {
                            i15 = i14 | (composer3.changedInstance(function2) ? 4 : 2);
                        } else {
                            i15 = i14;
                        }
                        if ((i15 & 19) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2133555260, i15, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1626)");
                            }
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                            String text = textFieldValue.getText();
                            VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                            PaddingValues paddingValuesM8116PaddingValues0680j_4 = PaddingKt.m8116PaddingValues0680j_4(C2046Dp.m13666constructorimpl(0));
                            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                            final TextFieldColors textFieldColors = textFieldColorsM9626colors0hiis_0;
                            outlinedTextFieldDefaults.DecorationBox(text, function2, true, true, none, mutableInteractionSource4, false, null, null, null, null, null, null, null, textFieldColors, paddingValuesM8116PaddingValues0680j_4, ComposableLambdaKt.composableLambda(composer3, -968963953, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                public final void invoke(@Nullable Composer composer4, int i16) {
                                    if ((i16 & 3) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-968963953, i16, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1636)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(true, false, mutableInteractionSource4, textFieldColors, ShapesKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), composer4, 6), 0.0f, 0.0f, composer4, 12583350, 96);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, ((i15 << 3) & 112) | 224640, 14352384, 16320);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, (i12 & 14) | 100666368 | (i12 & 112) | (i13 & 3670016) | (i13 & 29360128), 199680, 7696);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(androidx.compose.foundation.layout.OffsetKt.m8084offsetVpY3zN4$default(companion8, 0.0f, SupportLabelTop, 1, null), new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
                if (!Selection.m9744equalsimpl0(i, companion2.m9748getHourJiIwxys())) {
                    Strings.Companion companion11 = Strings.INSTANCE;
                    iM9797constructorimpl2 = Strings.m9797constructorimpl(C1551R.string.m3c_time_picker_hour);
                } else {
                    Strings.Companion companion12 = Strings.INSTANCE;
                    iM9797constructorimpl2 = Strings.m9797constructorimpl(C1551R.string.m3c_time_picker_minute);
                }
                TextKt.m10024Text4IGK_g(Strings_androidKt.m9866getStringNWtq28(iM9797constructorimpl2, composerStartRestartGroup, 0), modifierClearAndSetSemantics, ColorSchemeKt.getValue(timeInputTokens2.getTimeFieldSupportingTextColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(materialTheme.getTypography(composerStartRestartGroup, 6), timeInputTokens2.getTimeFieldSupportingTextFont()), composerStartRestartGroup, 0, 0, 65528);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Selection selectionM9741boximpl = Selection.m9741boximpl(timePickerState.m10072getSelectionJiIwxys$material3_release());
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-525712206);
                z = ((i11 & 57344) != 16384) | ((i11 & 7168) != 2048);
                objRememberedValue4 = composer2.rememberedValue();
                if (!z || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new TimePickerKt$TimePickerTextField$2$1(timePickerState, i, focusRequester2, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(selectionM9741boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                keyboardOptions3 = keyboardOptions4;
                keyboardActions3 = keyboardActions4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions3 = keyboardActions2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$3
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

                    public final void invoke(@Nullable Composer composer3, int i14) {
                        TimePickerKt.m10052TimePickerTextFieldlxUZ_iY(modifier, textFieldValue, function1, timePickerState, i, keyboardOptions3, keyboardActions3, timePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
        keyboardOptions2 = keyboardOptions;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        i6 = i4;
        if ((4793491 & i6) == 4793490) {
            if (i9 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceableGroup(-525715937);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-525715872);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            FocusRequester focusRequester32 = (FocusRequester) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            final TextFieldColors textFieldColorsM9626colors0hiis_02 = OutlinedTextFieldDefaults.INSTANCE.m9626colors0hiis_0(timePickerColors.m10047timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m10046timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m10046timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, 3072, 2147483598, UnixStat.PERM_MASK);
            zM9744equalsimpl0 = Selection.m9744equalsimpl0(i, timePickerState.m10072getSelectionJiIwxys$material3_release());
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion32 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top2, companion32.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion42.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy2, companion42.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap3, companion42.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
            if (!composerM10870constructorimpl.getInserting()) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(896157841);
                if (zM9744equalsimpl0) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion2 = Selection.INSTANCE;
                if (!Selection.m9744equalsimpl0(i, companion2.m9749getMinuteJiIwxys())) {
                }
                strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(iM9797constructorimpl, composerStartRestartGroup, 0);
                Modifier.Companion companion82 = Modifier.INSTANCE;
                Modifier modifierVisible2 = visible(companion82, zM9744equalsimpl0);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(i8);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierVisible2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl2.getInserting()) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(companion82, focusRequester);
                    TimeInputTokens timeInputTokens22 = TimeInputTokens.INSTANCE;
                    Modifier modifierM8174sizeVpY3zN42 = SizeKt.m8174sizeVpY3zN4(modifierFocusRequester2, timeInputTokens22.m10731getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens22.m10730getTimeFieldContainerHeightD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(-1694928032);
                    zChanged = composerStartRestartGroup.changed(strM9866getStringNWtq28);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$1$1
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
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierM8174sizeVpY3zN42, false, (Function1) objRememberedValue3, r9, null);
                        TextStyle textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        Brush.Companion companion92 = Brush.INSTANCE;
                        Float fValueOf3 = Float.valueOf(0.0f);
                        Color.Companion companion102 = Color.INSTANCE;
                        Pair pairM7112to3 = TuplesKt.m7112to(fValueOf3, Color.m11330boximpl(companion102.m11375getTransparent0d7_KjU()));
                        Pair pairM7112to22 = TuplesKt.m7112to(Float.valueOf(0.1f), Color.m11330boximpl(companion102.m11375getTransparent0d7_KjU()));
                        Float fValueOf22 = Float.valueOf(0.1f);
                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                        Brush brushM11298verticalGradient8A3gB4$default2 = Brush.Companion.m11298verticalGradient8A3gB4$default(companion92, new Pair[]{pairM7112to3, pairM7112to22, TuplesKt.m7112to(fValueOf22, Color.m11330boximpl(materialTheme2.getColorScheme(composerStartRestartGroup, 6).getPrimary())), TuplesKt.m7112to(Float.valueOf(0.9f), Color.m11330boximpl(materialTheme2.getColorScheme(composerStartRestartGroup, 6).getPrimary())), TuplesKt.m7112to(Float.valueOf(0.9f), Color.m11330boximpl(companion102.m11375getTransparent0d7_KjU())), TuplesKt.m7112to(Float.valueOf(1.0f), Color.m11330boximpl(companion102.m11375getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
                        final MutableInteractionSource mutableInteractionSource32 = mutableInteractionSource;
                        int i112 = i7;
                        int i122 = i112 >> 3;
                        int i132 = i112 << 3;
                        focusRequester2 = focusRequester;
                        BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifierSemantics$default2, true, false, textStyle2, keyboardOptions4, keyboardActions4, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource32, brushM11298verticalGradient8A3gB4$default2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2133555260, r9, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer3, int i14) {
                                int i15;
                                if ((i14 & 6) == 0) {
                                    i15 = i14 | (composer3.changedInstance(function2) ? 4 : 2);
                                } else {
                                    i15 = i14;
                                }
                                if ((i15 & 19) != 18 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2133555260, i15, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1626)");
                                    }
                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                    String text = textFieldValue.getText();
                                    VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                                    PaddingValues paddingValuesM8116PaddingValues0680j_4 = PaddingKt.m8116PaddingValues0680j_4(C2046Dp.m13666constructorimpl(0));
                                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource32;
                                    final TextFieldColors textFieldColors = textFieldColorsM9626colors0hiis_02;
                                    outlinedTextFieldDefaults.DecorationBox(text, function2, true, true, none, mutableInteractionSource4, false, null, null, null, null, null, null, null, textFieldColors, paddingValuesM8116PaddingValues0680j_4, ComposableLambdaKt.composableLambda(composer3, -968963953, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                        public final void invoke(@Nullable Composer composer4, int i16) {
                                            if ((i16 & 3) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-968963953, i16, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1636)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(true, false, mutableInteractionSource4, textFieldColors, ShapesKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), composer4, 6), 0.0f, 0.0f, composer4, 12583350, 96);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, ((i15 << 3) & 112) | 224640, 14352384, 16320);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, (i122 & 14) | 100666368 | (i122 & 112) | (i132 & 3670016) | (i132 & 29360128), 199680, 7696);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierClearAndSetSemantics2 = SemanticsModifierKt.clearAndSetSemantics(androidx.compose.foundation.layout.OffsetKt.m8084offsetVpY3zN4$default(companion82, 0.0f, SupportLabelTop, 1, null), new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$2
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        });
                        if (!Selection.m9744equalsimpl0(i, companion2.m9748getHourJiIwxys())) {
                        }
                        TextKt.m10024Text4IGK_g(Strings_androidKt.m9866getStringNWtq28(iM9797constructorimpl2, composerStartRestartGroup, 0), modifierClearAndSetSemantics2, ColorSchemeKt.getValue(timeInputTokens22.getTimeFieldSupportingTextColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(materialTheme2.getTypography(composerStartRestartGroup, 6), timeInputTokens22.getTimeFieldSupportingTextFont()), composerStartRestartGroup, 0, 0, 65528);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        Selection selectionM9741boximpl2 = Selection.m9741boximpl(timePickerState.m10072getSelectionJiIwxys$material3_release());
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-525712206);
                        if ((i112 & 7168) != 2048) {
                        }
                        z = ((i112 & 57344) != 16384) | ((i112 & 7168) != 2048);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (!z) {
                            objRememberedValue4 = new TimePickerKt$TimePickerTextField$2$1(timePickerState, i, focusRequester2, null);
                            composer2.updateRememberedValue(objRememberedValue4);
                            composer2.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(selectionM9741boximpl2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            keyboardOptions3 = keyboardOptions4;
                            keyboardActions3 = keyboardActions4;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: CircularLayout-uFdPcIQ */
    public static final void m10050CircularLayoutuFdPcIQ(Modifier modifier, final float f, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1548175696);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i3, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1679)");
            }
            composerStartRestartGroup.startReplaceableGroup(1651957759);
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1
                    @Override // androidx.compose.p003ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, final long j) {
                        Measurable measurable;
                        Measurable measurable2;
                        final float fMo7874toPx0680j_4 = measureScope.mo7874toPx0680j_4(f);
                        long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i5 = 0;
                        for (int i6 = 0; i6 < size; i6++) {
                            Measurable measurable3 = list.get(i6);
                            Measurable measurable4 = measurable3;
                            if (LayoutIdKt.getLayoutId(measurable4) != LayoutId.Selector && LayoutIdKt.getLayoutId(measurable4) != LayoutId.InnerCircle) {
                                arrayList.add(measurable3);
                            }
                        }
                        final ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size2 = arrayList.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            arrayList2.add(((Measurable) arrayList.get(i7)).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                        }
                        int size3 = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size3) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i8);
                            if (LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector) {
                                break;
                            }
                            i8++;
                        }
                        Measurable measurable5 = measurable;
                        int size4 = list.size();
                        while (true) {
                            if (i5 >= size4) {
                                measurable2 = null;
                                break;
                            }
                            measurable2 = list.get(i5);
                            if (LayoutIdKt.getLayoutId(measurable2) == LayoutId.InnerCircle) {
                                break;
                            }
                            i5++;
                        }
                        Measurable measurable6 = measurable2;
                        final float size5 = 6.2831855f / arrayList2.size();
                        Placeable placeableMo12610measureBRTryo0 = measurable5 != null ? measurable5.mo12610measureBRTryo0(jM13613copyZbe2FdA$default) : null;
                        final Placeable placeableMo12610measureBRTryo02 = measurable6 != null ? measurable6.mo12610measureBRTryo0(jM13613copyZbe2FdA$default) : null;
                        final Placeable placeable = placeableMo12610measureBRTryo0;
                        return MeasureScope.layout$default(measureScope, Constraints.m13624getMinWidthimpl(j), Constraints.m13623getMinHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1.1
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
                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                Placeable placeable2 = placeable;
                                if (placeable2 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable2, 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list2 = arrayList2;
                                long j2 = j;
                                float f2 = fMo7874toPx0680j_4;
                                float f3 = size5;
                                int size6 = list2.size();
                                int i9 = 0;
                                while (i9 < size6) {
                                    Placeable placeable3 = list2.get(i9);
                                    double d = f2;
                                    double d2 = (i9 * f3) - 1.5707963267948966d;
                                    Placeable.PlacementScope.place$default(placementScope, placeable3, MathKt__MathJVMKt.roundToInt((Math.cos(d2) * d) + ((Constraints.m13622getMaxWidthimpl(j2) / 2) - (placeable3.getWidth() / 2))), MathKt__MathJVMKt.roundToInt((d * Math.sin(d2)) + ((Constraints.m13621getMaxHeightimpl(j2) / 2) - (placeable3.getHeight() / 2))), 0.0f, 4, null);
                                    i9++;
                                    list2 = list2;
                                    j2 = j2;
                                }
                                Placeable placeable4 = placeableMo12610measureBRTryo02;
                                if (placeable4 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable4, (Constraints.m13624getMinWidthimpl(j) - placeableMo12610measureBRTryo02.getWidth()) / 2, (Constraints.m13623getMinHeightimpl(j) - placeableMo12610measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            int i5 = ((i3 >> 6) & 14) | ((i3 << 3) & 112);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i6 = ((i5 << 9) & 7168) | 6;
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
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$2
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

                public final void invoke(@Nullable Composer composer2, int i7) {
                    TimePickerKt.m10050CircularLayoutuFdPcIQ(modifier2, f, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    /* renamed from: numberContentDescription-YKJpE6Y */
    public static final String m10058numberContentDescriptionYKJpE6Y(int i, boolean z, int i2, @Nullable Composer composer, int i3) {
        int iM9797constructorimpl;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1826155772, i3, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1724)");
        }
        if (Selection.m9744equalsimpl0(i, Selection.INSTANCE.m9749getMinuteJiIwxys())) {
            Strings.Companion companion = Strings.INSTANCE;
            iM9797constructorimpl = Strings.m9797constructorimpl(C1551R.string.m3c_time_picker_minute_suffix);
        } else if (z) {
            Strings.Companion companion2 = Strings.INSTANCE;
            iM9797constructorimpl = Strings.m9797constructorimpl(C1551R.string.m3c_time_picker_hour_24h_suffix);
        } else {
            Strings.Companion companion3 = Strings.INSTANCE;
            iM9797constructorimpl = Strings.m9797constructorimpl(C1551R.string.m3c_time_picker_hour_suffix);
        }
        String strM9867getStringiSCLEhQ = Strings_androidKt.m9867getStringiSCLEhQ(iM9797constructorimpl, new Object[]{Integer.valueOf(i2)}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strM9867getStringiSCLEhQ;
    }

    public static final Pair<Float, Float> valuesForAnimation(float f, float f2) {
        if (Math.abs(f - f2) <= 3.141592653589793d) {
            return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
        }
        double d = f;
        if (d > 3.141592653589793d && f2 < 3.141592653589793d) {
            f2 += FullCircle;
        } else if (d < 3.141592653589793d && f2 > 3.141592653589793d) {
            f += FullCircle;
        }
        return new Pair<>(Float.valueOf(f), Float.valueOf(f2));
    }

    public static final float dist(float f, float f2, int i, int i2) {
        return (float) Math.hypot(i - f, i2 - f2);
    }

    public static final float atan(float f, float f2) {
        float fAtan2 = ((float) Math.atan2(f, f2)) - 1.5707964f;
        return fAtan2 < 0.0f ? fAtan2 + FullCircle : fAtan2;
    }

    @Stable
    private static final Modifier visible(Modifier modifier, final boolean z) {
        return modifier.then(new VisibleModifier(z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("visible");
                inspectorInfo.getProperties().set("visible", Boolean.valueOf(z));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final TextFieldValue TimeInputImpl$lambda$5(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    public static final TextFieldValue TimeInputImpl$lambda$8(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    public static final long ClockText$lambda$28(MutableState<Offset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    static {
        float f = 24;
        ClockFaceBottomMargin = C2046Dp.m13666constructorimpl(f);
        DisplaySeparatorWidth = C2046Dp.m13666constructorimpl(f);
        TimeInputBottomPadding = C2046Dp.m13666constructorimpl(f);
        List<Integer> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        Hours = listListOf;
        ArrayList arrayList = new ArrayList(listListOf.size());
        int size = listListOf.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf((listListOf.get(i).intValue() % 12) + 12));
        }
        ExtraHours = arrayList;
        PeriodToggleMargin = C2046Dp.m13666constructorimpl(12);
    }
}
