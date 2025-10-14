package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.Strings;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.C1841R;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ClipOp;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.TextFieldValue;
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
import androidx.compose.p003ui.unit.DpKt;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OutlinedTextField.kt */
@Metadata(m7104d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÖ\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u0010-\u001a¨\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u0010.\u001aÖ\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020/2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u00100\u001a¨\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020/2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u00101\u001a\u0080\u0002\u00102\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u00152\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0002\b\u00152\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0013\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0006\u0010#\u001a\u00020\u000f2\u0006\u00106\u001a\u0002072\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00070\u000b2\u0011\u0010:\u001a\r\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u00152\u0013\u0010;\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\u0010>\u001ar\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020%2\u0006\u0010G\u001a\u00020%2\u0006\u00106\u001a\u0002072\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u0002072\u0006\u0010<\u001a\u00020=H\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001aj\u0010M\u001a\u00020%2\u0006\u0010N\u001a\u00020%2\u0006\u0010O\u001a\u00020%2\u0006\u0010P\u001a\u00020%2\u0006\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010S\u001a\u00020%2\u0006\u0010T\u001a\u00020%2\u0006\u00106\u001a\u0002072\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u0002072\u0006\u0010<\u001a\u00020=H\u0002ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a&\u0010W\u001a\u00020\r*\u00020\r2\u0006\u0010X\u001a\u0002092\u0006\u0010<\u001a\u00020=H\u0000ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a\u009a\u0001\u0010[\u001a\u00020\u0007*\u00020\\2\u0006\u0010]\u001a\u00020%2\u0006\u0010^\u001a\u00020%2\b\u0010_\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010`2\b\u0010b\u001a\u0004\u0018\u00010`2\b\u0010c\u001a\u0004\u0018\u00010`2\u0006\u0010d\u001a\u00020`2\b\u0010e\u001a\u0004\u0018\u00010`2\b\u0010f\u001a\u0004\u0018\u00010`2\u0006\u0010g\u001a\u00020`2\b\u0010h\u001a\u0004\u0018\u00010`2\u0006\u00106\u001a\u0002072\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010J\u001a\u0002072\u0006\u0010i\u001a\u00020j2\u0006\u0010<\u001a\u00020=H\u0002\u001a\u0014\u0010k\u001a\u00020%*\u00020%2\u0006\u0010l\u001a\u00020%H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006m"}, m7105d2 = {"OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "OutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", TtmlNode.RUBY_CONTAINER, "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "textFieldHeight", "labelHeight", "placeholderHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-DHJA7U0", "(IIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "substractConstraintSafely", "from", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1156:1\n74#2:1157\n74#2:1166\n74#2:1175\n74#2:1182\n74#2:1195\n1116#3,6:1158\n1116#3,6:1167\n1116#3,6:1176\n1116#3,6:1183\n1116#3,6:1189\n658#4:1164\n646#4:1165\n658#4:1173\n646#4:1174\n78#5,11:1196\n78#5,11:1229\n91#5:1261\n78#5,11:1268\n91#5:1300\n78#5,11:1314\n91#5:1346\n78#5,11:1354\n91#5:1386\n78#5,11:1396\n91#5:1428\n78#5,11:1436\n91#5:1468\n78#5,11:1476\n91#5:1508\n91#5:1513\n456#6,8:1207\n464#6,3:1221\n456#6,8:1240\n464#6,3:1254\n467#6,3:1258\n456#6,8:1279\n464#6,3:1293\n467#6,3:1297\n456#6,8:1325\n464#6,3:1339\n467#6,3:1343\n456#6,8:1365\n464#6,3:1379\n467#6,3:1383\n456#6,8:1407\n464#6,3:1421\n467#6,3:1425\n456#6,8:1447\n464#6,3:1461\n467#6,3:1465\n456#6,8:1487\n464#6,3:1501\n467#6,3:1505\n467#6,3:1510\n3737#7,6:1215\n3737#7,6:1248\n3737#7,6:1287\n3737#7,6:1333\n3737#7,6:1373\n3737#7,6:1415\n3737#7,6:1455\n3737#7,6:1495\n69#8,5:1224\n74#8:1257\n78#8:1262\n69#8,5:1263\n74#8:1296\n78#8:1301\n68#8,6:1308\n74#8:1342\n78#8:1347\n68#8,6:1348\n74#8:1382\n78#8:1387\n68#8,6:1390\n74#8:1424\n78#8:1429\n68#8,6:1430\n74#8:1464\n78#8:1469\n68#8,6:1470\n74#8:1504\n78#8:1509\n58#9:1302\n58#9:1305\n51#9:1514\n154#10:1303\n211#10:1304\n154#10:1306\n211#10:1307\n154#10:1388\n154#10:1389\n154#10:1515\n154#10:1516\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n*L\n148#1:1157\n308#1:1166\n403#1:1175\n456#1:1182\n531#1:1195\n163#1:1158,6\n323#1:1167,6\n416#1:1176,6\n469#1:1183,6\n523#1:1189,6\n168#1:1164\n168#1:1165\n328#1:1173\n328#1:1174\n532#1:1196,11\n538#1:1229,11\n538#1:1261\n546#1:1268,11\n546#1:1300\n569#1:1314,11\n569#1:1346\n580#1:1354,11\n580#1:1386\n605#1:1396,11\n605#1:1428\n615#1:1436,11\n615#1:1468\n624#1:1476,11\n624#1:1508\n532#1:1513\n532#1:1207,8\n532#1:1221,3\n538#1:1240,8\n538#1:1254,3\n538#1:1258,3\n546#1:1279,8\n546#1:1293,3\n546#1:1297,3\n569#1:1325,8\n569#1:1339,3\n569#1:1343,3\n580#1:1365,8\n580#1:1379,3\n580#1:1383,3\n605#1:1407,8\n605#1:1421,3\n605#1:1425,3\n615#1:1447,8\n615#1:1461,3\n615#1:1465,3\n624#1:1487,8\n624#1:1501,3\n624#1:1505,3\n532#1:1510,3\n532#1:1215,6\n538#1:1248,6\n546#1:1287,6\n569#1:1333,6\n580#1:1373,6\n605#1:1415,6\n615#1:1455,6\n624#1:1495,6\n538#1:1224,5\n538#1:1257\n538#1:1262\n546#1:1263,5\n546#1:1296\n546#1:1301\n569#1:1308,6\n569#1:1342\n569#1:1347\n580#1:1348,6\n580#1:1382\n580#1:1387\n605#1:1390,6\n605#1:1424\n605#1:1429\n615#1:1430,6\n615#1:1464\n615#1:1469\n624#1:1470,6\n624#1:1504\n624#1:1509\n558#1:1302\n563#1:1305\n969#1:1514\n558#1:1303\n558#1:1304\n563#1:1306\n563#1:1307\n595#1:1388\n596#1:1389\n1147#1:1515\n1155#1:1516\n*E\n"})
/* loaded from: classes2.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = C2046Dp.m13666constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = C2046Dp.m13666constructorimpl(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : i - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:363:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(@NotNull final String str, @NotNull final Function1<? super String, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable TextStyle textStyle, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, @Nullable Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, @Nullable VisualTransformation visualTransformation, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, boolean z4, int i, int i2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, @Nullable TextFieldColors textFieldColors, @Nullable Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Modifier modifier2;
        boolean z5;
        TextStyle textStyle2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i29;
        Function2<? super Composer, ? super Integer, Unit> function29;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        int i30;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        TextFieldColors textFieldColorsColors;
        int i31;
        int i32;
        boolean z6;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z7;
        int i33;
        Function2<? super Composer, ? super Integer, Unit> function210;
        int i34;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        int i35;
        Function2<? super Composer, ? super Integer, Unit> function213;
        VisualTransformation visualTransformation2;
        Function2<? super Composer, ? super Integer, Unit> function214;
        boolean z8;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Function2<? super Composer, ? super Integer, Unit> function217;
        long jM13195getColor0d7_KjU;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final VisualTransformation visualTransformation3;
        final TextFieldColors textFieldColors2;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z9;
        final int i36;
        final int i37;
        final MutableInteractionSource mutableInteractionSource5;
        final Shape shape4;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final boolean z10;
        final boolean z11;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        final boolean z12;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function224;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1922450045);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i7 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    i7 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                }
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i7 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((i3 & CpioConstants.C_ISBLK) == 0) {
                            i7 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                            i7 |= ((i6 & 32) == 0 && composerStartRestartGroup.changed(textStyle)) ? 131072 : 65536;
                        }
                        i11 = i6 & 64;
                        if (i11 != 0) {
                            i7 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        }
                        i12 = i6 & 128;
                        if (i12 != 0) {
                            i7 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i13 = i6 & 256;
                        if (i13 != 0) {
                            i7 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i15 = i6 & 1024;
                        if (i15 != 0) {
                            i16 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i16 = i4 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i16 = i4;
                        }
                        i17 = i6 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i16 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
                        }
                        int i38 = i16;
                        i18 = i6 & 4096;
                        if (i18 != 0) {
                            i38 |= 384;
                        } else {
                            if ((i4 & 384) == 0) {
                                i38 |= composerStartRestartGroup.changedInstance(function27) ? 256 : 128;
                            }
                            i19 = i6 & 8192;
                            if (i19 == 0) {
                                i38 |= 3072;
                            } else {
                                if ((i4 & 3072) == 0) {
                                    i38 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                                }
                                i20 = i6 & 16384;
                                if (i20 == 0) {
                                    i21 = i20;
                                    if ((i4 & CpioConstants.C_ISBLK) == 0) {
                                        i38 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                                    }
                                    i22 = i6 & 32768;
                                    if (i22 == 0) {
                                        i38 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                                    } else if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                                        i38 |= composerStartRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                                    }
                                    i23 = i6 & 65536;
                                    if (i23 == 0) {
                                        i38 |= 1572864;
                                    } else if ((i4 & 1572864) == 0) {
                                        i38 |= composerStartRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                                    }
                                    i24 = i6 & 131072;
                                    if (i24 == 0) {
                                        i38 |= 12582912;
                                    } else if ((i4 & 12582912) == 0) {
                                        i38 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                                    }
                                    if ((i4 & 100663296) == 0) {
                                        i38 |= ((i6 & 262144) == 0 && composerStartRestartGroup.changed(i)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                                    }
                                    i25 = i6 & 524288;
                                    if (i25 == 0) {
                                        i38 |= 805306368;
                                    } else if ((i4 & 805306368) == 0) {
                                        i38 |= composerStartRestartGroup.changed(i2) ? 536870912 : 268435456;
                                    }
                                    i26 = i6 & 1048576;
                                    if (i26 == 0) {
                                        i27 = i5 | 6;
                                    } else if ((i5 & 6) == 0) {
                                        i27 = i5 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                    } else {
                                        i27 = i5;
                                    }
                                    if ((i5 & 48) == 0) {
                                        i27 |= ((i6 & 2097152) == 0 && composerStartRestartGroup.changed(shape)) ? 32 : 16;
                                    }
                                    if ((i5 & 384) == 0) {
                                        i27 |= ((i6 & 4194304) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 256 : 128;
                                    }
                                    i28 = i27;
                                    if ((i7 & 306783379) == 306783378 || (306783379 & i38) != 306783378 || (i28 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            modifier2 = i8 == 0 ? Modifier.INSTANCE : modifier;
                                            z5 = i9 == 0 ? true : z;
                                            boolean z13 = i10 == 0 ? false : z2;
                                            if ((i6 & 32) == 0) {
                                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                                i7 &= -458753;
                                            } else {
                                                textStyle2 = textStyle;
                                            }
                                            Function2<? super Composer, ? super Integer, Unit> function225 = i11 == 0 ? null : function2;
                                            function28 = i12 == 0 ? null : function22;
                                            Function2<? super Composer, ? super Integer, Unit> function226 = i13 == 0 ? null : function23;
                                            Function2<? super Composer, ? super Integer, Unit> function227 = i14 == 0 ? null : function24;
                                            Function2<? super Composer, ? super Integer, Unit> function228 = i15 == 0 ? null : function25;
                                            Function2<? super Composer, ? super Integer, Unit> function229 = i17 == 0 ? null : function26;
                                            Function2<? super Composer, ? super Integer, Unit> function230 = i18 == 0 ? function27 : null;
                                            boolean z14 = i19 == 0 ? false : z3;
                                            VisualTransformation none = i21 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                            KeyboardOptions keyboardOptions4 = i22 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                            KeyboardActions keyboardActions4 = i23 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                            boolean z15 = i24 == 0 ? false : z4;
                                            if ((i6 & 262144) == 0) {
                                                i29 = z15 ? 1 : Integer.MAX_VALUE;
                                                i38 &= -234881025;
                                            } else {
                                                i29 = i;
                                            }
                                            int i39 = i25 == 0 ? 1 : i2;
                                            Function2<? super Composer, ? super Integer, Unit> function231 = function226;
                                            if (i26 == 0) {
                                                composerStartRestartGroup.startReplaceableGroup(1663535677);
                                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                function29 = function227;
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                }
                                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                                composerStartRestartGroup.endReplaceableGroup();
                                            } else {
                                                function29 = function227;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                            }
                                            if ((2097152 & i6) == 0) {
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                                i30 = 6;
                                                shape2 = OutlinedTextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                                i28 &= -113;
                                            } else {
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                                i30 = 6;
                                                shape2 = shape;
                                            }
                                            Shape shape5 = shape2;
                                            if ((i6 & 4194304) == 0) {
                                                i28 &= -897;
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                                shape3 = shape5;
                                                textFieldColorsColors = OutlinedTextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, i30);
                                            } else {
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                                shape3 = shape5;
                                                textFieldColorsColors = textFieldColors;
                                            }
                                            i31 = i7;
                                            i32 = i38;
                                            z6 = z13;
                                            keyboardOptions2 = keyboardOptions4;
                                            keyboardActions2 = keyboardActions4;
                                            z7 = z15;
                                            i33 = i29;
                                            function210 = function225;
                                            i34 = i39;
                                            function211 = function29;
                                            function212 = function229;
                                            i35 = i28;
                                            function213 = function228;
                                            visualTransformation2 = none;
                                            function214 = function231;
                                            z8 = z14;
                                            function215 = function230;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i6 & 32) != 0) {
                                                i7 &= -458753;
                                            }
                                            if ((262144 & i6) != 0) {
                                                i38 &= -234881025;
                                            }
                                            if ((2097152 & i6) != 0) {
                                                i28 &= -113;
                                            }
                                            if ((i6 & 4194304) != 0) {
                                                i28 &= -897;
                                            }
                                            modifier2 = modifier;
                                            z5 = z;
                                            z6 = z2;
                                            textStyle2 = textStyle;
                                            function210 = function2;
                                            function28 = function22;
                                            function214 = function23;
                                            function213 = function25;
                                            function215 = function27;
                                            z8 = z3;
                                            keyboardOptions2 = keyboardOptions;
                                            keyboardActions2 = keyboardActions;
                                            z7 = z4;
                                            i33 = i;
                                            i34 = i2;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColorsColors = textFieldColors;
                                            i31 = i7;
                                            i32 = i38;
                                            i35 = i28;
                                            function211 = function24;
                                            function212 = function26;
                                            visualTransformation2 = visualTransformation;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            function216 = function212;
                                            function217 = function215;
                                        } else {
                                            function217 = function215;
                                            function216 = function212;
                                            ComposerKt.traceEventStart(-1922450045, i31, i32, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:165)");
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(1663535958);
                                        jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                                        if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                            jM13195getColor0d7_KjU = textFieldColorsColors.textColor$material3_release(z5, z8, mutableInteractionSource4, composerStartRestartGroup, ((i31 >> 9) & 14) | ((i32 >> 6) & 112) | ((i35 << 6) & 896) | ((i35 << 3) & 7168)).getValue().m11350unboximpl();
                                        }
                                        long j = jM13195getColor0d7_KjU;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        final TextStyle textStyleMerge = textStyle2.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        final TextFieldColors textFieldColors3 = textFieldColorsColors;
                                        final Function2<? super Composer, ? super Integer, Unit> function232 = function210;
                                        final Modifier modifier4 = modifier2;
                                        final boolean z16 = z8;
                                        final boolean z17 = z5;
                                        final boolean z18 = z6;
                                        final KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                        final KeyboardActions keyboardActions5 = keyboardActions2;
                                        final boolean z19 = z7;
                                        final int i40 = i33;
                                        final int i41 = i34;
                                        final VisualTransformation visualTransformation4 = visualTransformation2;
                                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                        final Function2<? super Composer, ? super Integer, Unit> function233 = function28;
                                        final Function2<? super Composer, ? super Integer, Unit> function234 = function214;
                                        final Function2<? super Composer, ? super Integer, Unit> function235 = function211;
                                        final Function2<? super Composer, ? super Integer, Unit> function236 = function213;
                                        final Function2<? super Composer, ? super Integer, Unit> function237 = function216;
                                        final Function2<? super Composer, ? super Integer, Unit> function238 = function217;
                                        final Shape shape6 = shape3;
                                        boolean z20 = z6;
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getSelectionColors(composerStartRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1886965181, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2
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
                                            public final void invoke(@Nullable Composer composer2, int i42) {
                                                Modifier modifierM8127paddingqDBjuR0$default;
                                                if ((i42 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1886965181, i42, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:173)");
                                                    }
                                                    if (function232 != null) {
                                                        modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier4, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.1
                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                invoke2(semanticsPropertyReceiver);
                                                                return Unit.INSTANCE;
                                                            }
                                                        }), 0.0f, OutlinedTextFieldKt.getOutlinedTextFieldTopPadding(), 0.0f, 0.0f, 13, null);
                                                    } else {
                                                        modifierM8127paddingqDBjuR0$default = modifier4;
                                                    }
                                                    boolean z21 = z16;
                                                    Strings.Companion companion = Strings.INSTANCE;
                                                    Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifierM8127paddingqDBjuR0$default, z21, Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.default_error_message), composer2, 0));
                                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, outlinedTextFieldDefaults.m9630getMinWidthD9Ej5fM(), outlinedTextFieldDefaults.m9629getMinHeightD9Ej5fM());
                                                    SolidColor solidColor = new SolidColor(textFieldColors3.cursorColor$material3_release(z16, composer2, 0).getValue().m11350unboximpl(), null);
                                                    final String str2 = str;
                                                    Function1<String, Unit> function12 = function1;
                                                    final boolean z22 = z17;
                                                    boolean z23 = z18;
                                                    TextStyle textStyle4 = textStyleMerge;
                                                    KeyboardOptions keyboardOptions6 = keyboardOptions5;
                                                    KeyboardActions keyboardActions6 = keyboardActions5;
                                                    final boolean z24 = z19;
                                                    int i43 = i40;
                                                    int i44 = i41;
                                                    final VisualTransformation visualTransformation5 = visualTransformation4;
                                                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                                    final boolean z25 = z16;
                                                    final Function2<Composer, Integer, Unit> function239 = function232;
                                                    final Function2<Composer, Integer, Unit> function240 = function233;
                                                    final Function2<Composer, Integer, Unit> function241 = function234;
                                                    final Function2<Composer, Integer, Unit> function242 = function235;
                                                    final Function2<Composer, Integer, Unit> function243 = function236;
                                                    final Function2<Composer, Integer, Unit> function244 = function237;
                                                    final Function2<Composer, Integer, Unit> function245 = function238;
                                                    final TextFieldColors textFieldColors4 = textFieldColors3;
                                                    final Shape shape7 = shape6;
                                                    BasicTextFieldKt.BasicTextField(str2, function12, modifierM8156defaultMinSizeVpY3zN4, z22, z23, textStyle4, keyboardOptions6, keyboardActions6, z24, i43, i44, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor, ComposableLambdaKt.composableLambda(composer2, 1474611661, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function246, Composer composer3, Integer num) {
                                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function246, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @Composable
                                                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function246, @Nullable Composer composer3, int i45) {
                                                            int i46;
                                                            if ((i45 & 6) == 0) {
                                                                i46 = i45 | (composer3.changedInstance(function246) ? 4 : 2);
                                                            } else {
                                                                i46 = i45;
                                                            }
                                                            if ((i46 & 19) != 18 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1474611661, i46, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:202)");
                                                                }
                                                                OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                                                                String str3 = str2;
                                                                final boolean z26 = z22;
                                                                boolean z27 = z24;
                                                                VisualTransformation visualTransformation6 = visualTransformation5;
                                                                final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                                                final boolean z28 = z25;
                                                                Function2<Composer, Integer, Unit> function247 = function239;
                                                                Function2<Composer, Integer, Unit> function248 = function240;
                                                                Function2<Composer, Integer, Unit> function249 = function241;
                                                                Function2<Composer, Integer, Unit> function250 = function242;
                                                                Function2<Composer, Integer, Unit> function251 = function243;
                                                                int i47 = i46;
                                                                Function2<Composer, Integer, Unit> function252 = function244;
                                                                Function2<Composer, Integer, Unit> function253 = function245;
                                                                final TextFieldColors textFieldColors5 = textFieldColors4;
                                                                final Shape shape8 = shape7;
                                                                outlinedTextFieldDefaults2.DecorationBox(str3, function246, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function247, function248, function249, function250, function251, function252, function253, textFieldColors5, null, ComposableLambdaKt.composableLambda(composer3, 2108828640, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
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
                                                                    public final void invoke(@Nullable Composer composer4, int i48) {
                                                                        if ((i48 & 3) != 2 || !composer4.getSkipping()) {
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(2108828640, i48, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:219)");
                                                                            }
                                                                            OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z26, z28, mutableInteractionSource8, textFieldColors5, shape8, 0.0f, 0.0f, composer4, 12582912, 96);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        composer4.skipToGroupEnd();
                                                                    }
                                                                }), composer3, (i47 << 3) & 112, 14155776, 32768);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }), composer2, 0, ProfileVerifier.CompilationStatus.f342xf2722a21, 4096);
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
                                        function218 = function210;
                                        visualTransformation3 = visualTransformation2;
                                        textFieldColors2 = textFieldColors3;
                                        textStyle3 = textStyle2;
                                        keyboardOptions3 = keyboardOptions2;
                                        keyboardActions3 = keyboardActions2;
                                        z9 = z7;
                                        i36 = i33;
                                        i37 = i34;
                                        mutableInteractionSource5 = mutableInteractionSource4;
                                        shape4 = shape3;
                                        function219 = function216;
                                        function220 = function213;
                                        z10 = z8;
                                        z11 = z20;
                                        function221 = function211;
                                        z12 = z5;
                                        function222 = function217;
                                        Function2<? super Composer, ? super Integer, Unit> function239 = function28;
                                        function223 = function214;
                                        modifier3 = modifier2;
                                        function224 = function239;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        modifier3 = modifier;
                                        z12 = z;
                                        z11 = z2;
                                        textStyle3 = textStyle;
                                        function218 = function2;
                                        function224 = function22;
                                        function223 = function23;
                                        function221 = function24;
                                        function220 = function25;
                                        function219 = function26;
                                        function222 = function27;
                                        z10 = z3;
                                        visualTransformation3 = visualTransformation;
                                        keyboardOptions3 = keyboardOptions;
                                        keyboardActions3 = keyboardActions;
                                        z9 = z4;
                                        i36 = i;
                                        i37 = i2;
                                        mutableInteractionSource5 = mutableInteractionSource;
                                        shape4 = shape;
                                        textFieldColors2 = textFieldColors;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3
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

                                            public final void invoke(@Nullable Composer composer2, int i42) {
                                                OutlinedTextFieldKt.OutlinedTextField(str, function1, modifier3, z12, z11, textStyle3, function218, function224, function223, function221, function220, function219, function222, z10, visualTransformation3, keyboardOptions3, keyboardActions3, z9, i36, i37, mutableInteractionSource5, shape4, textFieldColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i38 |= CpioConstants.C_ISBLK;
                                i21 = i20;
                                i22 = i6 & 32768;
                                if (i22 == 0) {
                                }
                                i23 = i6 & 65536;
                                if (i23 == 0) {
                                }
                                i24 = i6 & 131072;
                                if (i24 == 0) {
                                }
                                if ((i4 & 100663296) == 0) {
                                }
                                i25 = i6 & 524288;
                                if (i25 == 0) {
                                }
                                i26 = i6 & 1048576;
                                if (i26 == 0) {
                                }
                                if ((i5 & 48) == 0) {
                                }
                                if ((i5 & 384) == 0) {
                                }
                                i28 = i27;
                                if ((i7 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0) {
                                        if (i8 == 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if ((i6 & 32) == 0) {
                                        }
                                        if (i11 == 0) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        if (i13 == 0) {
                                        }
                                        if (i14 == 0) {
                                        }
                                        if (i15 == 0) {
                                        }
                                        if (i17 == 0) {
                                        }
                                        if (i18 == 0) {
                                        }
                                        if (i19 == 0) {
                                        }
                                        if (i21 == 0) {
                                        }
                                        if (i22 == 0) {
                                        }
                                        if (i23 == 0) {
                                        }
                                        if (i24 == 0) {
                                        }
                                        if ((i6 & 262144) == 0) {
                                        }
                                        if (i25 == 0) {
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function2312 = function226;
                                        if (i26 == 0) {
                                        }
                                        if ((2097152 & i6) == 0) {
                                        }
                                        Shape shape52 = shape2;
                                        if ((i6 & 4194304) == 0) {
                                        }
                                        i31 = i7;
                                        i32 = i38;
                                        z6 = z13;
                                        keyboardOptions2 = keyboardOptions4;
                                        keyboardActions2 = keyboardActions4;
                                        z7 = z15;
                                        i33 = i29;
                                        function210 = function225;
                                        i34 = i39;
                                        function211 = function29;
                                        function212 = function229;
                                        i35 = i28;
                                        function213 = function228;
                                        visualTransformation2 = none;
                                        function214 = function2312;
                                        z8 = z14;
                                        function215 = function230;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(1663535958);
                                        jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                                        if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                        }
                                        long j2 = jM13195getColor0d7_KjU;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        final TextStyle textStyleMerge2 = textStyle2.merge(new TextStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        final TextFieldColors textFieldColors32 = textFieldColorsColors;
                                        final Function2<? super Composer, ? super Integer, Unit> function2322 = function210;
                                        final Modifier modifier42 = modifier2;
                                        final boolean z162 = z8;
                                        final boolean z172 = z5;
                                        final boolean z182 = z6;
                                        final KeyboardOptions keyboardOptions52 = keyboardOptions2;
                                        final KeyboardActions keyboardActions52 = keyboardActions2;
                                        final boolean z192 = z7;
                                        final int i402 = i33;
                                        final int i412 = i34;
                                        final VisualTransformation visualTransformation42 = visualTransformation2;
                                        final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                                        final Function2<? super Composer, ? super Integer, Unit> function2332 = function28;
                                        final Function2<? super Composer, ? super Integer, Unit> function2342 = function214;
                                        final Function2<? super Composer, ? super Integer, Unit> function2352 = function211;
                                        final Function2<? super Composer, ? super Integer, Unit> function2362 = function213;
                                        final Function2<? super Composer, ? super Integer, Unit> function2372 = function216;
                                        final Function2<? super Composer, ? super Integer, Unit> function2382 = function217;
                                        final Shape shape62 = shape3;
                                        boolean z202 = z6;
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors32.getSelectionColors(composerStartRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1886965181, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2
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
                                            public final void invoke(@Nullable Composer composer2, int i42) {
                                                Modifier modifierM8127paddingqDBjuR0$default;
                                                if ((i42 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1886965181, i42, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:173)");
                                                    }
                                                    if (function2322 != null) {
                                                        modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier42, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.1
                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                invoke2(semanticsPropertyReceiver);
                                                                return Unit.INSTANCE;
                                                            }
                                                        }), 0.0f, OutlinedTextFieldKt.getOutlinedTextFieldTopPadding(), 0.0f, 0.0f, 13, null);
                                                    } else {
                                                        modifierM8127paddingqDBjuR0$default = modifier42;
                                                    }
                                                    boolean z21 = z162;
                                                    Strings.Companion companion = Strings.INSTANCE;
                                                    Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifierM8127paddingqDBjuR0$default, z21, Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.default_error_message), composer2, 0));
                                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, outlinedTextFieldDefaults.m9630getMinWidthD9Ej5fM(), outlinedTextFieldDefaults.m9629getMinHeightD9Ej5fM());
                                                    SolidColor solidColor = new SolidColor(textFieldColors32.cursorColor$material3_release(z162, composer2, 0).getValue().m11350unboximpl(), null);
                                                    final String str2 = str;
                                                    Function1<String, Unit> function12 = function1;
                                                    final boolean z22 = z172;
                                                    boolean z23 = z182;
                                                    TextStyle textStyle4 = textStyleMerge2;
                                                    KeyboardOptions keyboardOptions6 = keyboardOptions52;
                                                    KeyboardActions keyboardActions6 = keyboardActions52;
                                                    final boolean z24 = z192;
                                                    int i43 = i402;
                                                    int i44 = i412;
                                                    final VisualTransformation visualTransformation5 = visualTransformation42;
                                                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                                                    final boolean z25 = z162;
                                                    final Function2<? super Composer, ? super Integer, Unit> function2392 = function2322;
                                                    final Function2<? super Composer, ? super Integer, Unit> function240 = function2332;
                                                    final Function2<? super Composer, ? super Integer, Unit> function241 = function2342;
                                                    final Function2<? super Composer, ? super Integer, Unit> function242 = function2352;
                                                    final Function2<? super Composer, ? super Integer, Unit> function243 = function2362;
                                                    final Function2<? super Composer, ? super Integer, Unit> function244 = function2372;
                                                    final Function2<? super Composer, ? super Integer, Unit> function245 = function2382;
                                                    final TextFieldColors textFieldColors4 = textFieldColors32;
                                                    final Shape shape7 = shape62;
                                                    BasicTextFieldKt.BasicTextField(str2, function12, modifierM8156defaultMinSizeVpY3zN4, z22, z23, textStyle4, keyboardOptions6, keyboardActions6, z24, i43, i44, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor, ComposableLambdaKt.composableLambda(composer2, 1474611661, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function246, Composer composer3, Integer num) {
                                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function246, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @Composable
                                                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function246, @Nullable Composer composer3, int i45) {
                                                            int i46;
                                                            if ((i45 & 6) == 0) {
                                                                i46 = i45 | (composer3.changedInstance(function246) ? 4 : 2);
                                                            } else {
                                                                i46 = i45;
                                                            }
                                                            if ((i46 & 19) != 18 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1474611661, i46, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:202)");
                                                                }
                                                                OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                                                                String str3 = str2;
                                                                final boolean z26 = z22;
                                                                boolean z27 = z24;
                                                                VisualTransformation visualTransformation6 = visualTransformation5;
                                                                final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                                                final boolean z28 = z25;
                                                                Function2<Composer, Integer, Unit> function247 = function2392;
                                                                Function2<Composer, Integer, Unit> function248 = function240;
                                                                Function2<Composer, Integer, Unit> function249 = function241;
                                                                Function2<Composer, Integer, Unit> function250 = function242;
                                                                Function2<Composer, Integer, Unit> function251 = function243;
                                                                int i47 = i46;
                                                                Function2<Composer, Integer, Unit> function252 = function244;
                                                                Function2<Composer, Integer, Unit> function253 = function245;
                                                                final TextFieldColors textFieldColors5 = textFieldColors4;
                                                                final Shape shape8 = shape7;
                                                                outlinedTextFieldDefaults2.DecorationBox(str3, function246, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function247, function248, function249, function250, function251, function252, function253, textFieldColors5, null, ComposableLambdaKt.composableLambda(composer3, 2108828640, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
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
                                                                    public final void invoke(@Nullable Composer composer4, int i48) {
                                                                        if ((i48 & 3) != 2 || !composer4.getSkipping()) {
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(2108828640, i48, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:219)");
                                                                            }
                                                                            OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z26, z28, mutableInteractionSource8, textFieldColors5, shape8, 0.0f, 0.0f, composer4, 12582912, 96);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        composer4.skipToGroupEnd();
                                                                    }
                                                                }), composer3, (i47 << 3) & 112, 14155776, 32768);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }), composer2, 0, ProfileVerifier.CompilationStatus.f342xf2722a21, 4096);
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
                                        }
                                        function218 = function210;
                                        visualTransformation3 = visualTransformation2;
                                        textFieldColors2 = textFieldColors32;
                                        textStyle3 = textStyle2;
                                        keyboardOptions3 = keyboardOptions2;
                                        keyboardActions3 = keyboardActions2;
                                        z9 = z7;
                                        i36 = i33;
                                        i37 = i34;
                                        mutableInteractionSource5 = mutableInteractionSource4;
                                        shape4 = shape3;
                                        function219 = function216;
                                        function220 = function213;
                                        z10 = z8;
                                        z11 = z202;
                                        function221 = function211;
                                        z12 = z5;
                                        function222 = function217;
                                        Function2<? super Composer, ? super Integer, Unit> function2392 = function28;
                                        function223 = function214;
                                        modifier3 = modifier2;
                                        function224 = function2392;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i20 = i6 & 16384;
                            if (i20 == 0) {
                            }
                            i22 = i6 & 32768;
                            if (i22 == 0) {
                            }
                            i23 = i6 & 65536;
                            if (i23 == 0) {
                            }
                            i24 = i6 & 131072;
                            if (i24 == 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            i25 = i6 & 524288;
                            if (i25 == 0) {
                            }
                            i26 = i6 & 1048576;
                            if (i26 == 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            if ((i5 & 384) == 0) {
                            }
                            i28 = i27;
                            if ((i7 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i19 = i6 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i6 & 16384;
                        if (i20 == 0) {
                        }
                        i22 = i6 & 32768;
                        if (i22 == 0) {
                        }
                        i23 = i6 & 65536;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 131072;
                        if (i24 == 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i25 = i6 & 524288;
                        if (i25 == 0) {
                        }
                        i26 = i6 & 1048576;
                        if (i26 == 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        if ((i5 & 384) == 0) {
                        }
                        i28 = i27;
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    i11 = i6 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i6 & 2048;
                    if (i17 != 0) {
                    }
                    int i382 = i16;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i6 & 16384;
                    if (i20 == 0) {
                    }
                    i22 = i6 & 32768;
                    if (i22 == 0) {
                    }
                    i23 = i6 & 65536;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 131072;
                    if (i24 == 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i25 = i6 & 524288;
                    if (i25 == 0) {
                    }
                    i26 = i6 & 1048576;
                    if (i26 == 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    if ((i5 & 384) == 0) {
                    }
                    i28 = i27;
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i6 & 1024;
                if (i15 != 0) {
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                }
                int i3822 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                }
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i20 = i6 & 16384;
                if (i20 == 0) {
                }
                i22 = i6 & 32768;
                if (i22 == 0) {
                }
                i23 = i6 & 65536;
                if (i23 == 0) {
                }
                i24 = i6 & 131072;
                if (i24 == 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i25 = i6 & 524288;
                if (i25 == 0) {
                }
                i26 = i6 & 1048576;
                if (i26 == 0) {
                }
                if ((i5 & 48) == 0) {
                }
                if ((i5 & 384) == 0) {
                }
                i28 = i27;
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i38222 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i20 = i6 & 16384;
            if (i20 == 0) {
            }
            i22 = i6 & 32768;
            if (i22 == 0) {
            }
            i23 = i6 & 65536;
            if (i23 == 0) {
            }
            i24 = i6 & 131072;
            if (i24 == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i25 = i6 & 524288;
            if (i25 == 0) {
            }
            i26 = i6 & 1048576;
            if (i26 == 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            i28 = i27;
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i382222 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i20 = i6 & 16384;
        if (i20 == 0) {
        }
        i22 = i6 & 32768;
        if (i22 == 0) {
        }
        i23 = i6 & 65536;
        if (i23 == 0) {
        }
        i24 = i6 & 131072;
        if (i24 == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i25 = i6 & 524288;
        if (i25 == 0) {
        }
        i26 = i6 & 1048576;
        if (i26 == 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        i28 = i27;
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:363:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(@NotNull final TextFieldValue textFieldValue, @NotNull final Function1<? super TextFieldValue, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable TextStyle textStyle, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, @Nullable Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, @Nullable VisualTransformation visualTransformation, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, boolean z4, int i, int i2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, @Nullable TextFieldColors textFieldColors, @Nullable Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Modifier modifier2;
        boolean z5;
        TextStyle textStyle2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i29;
        Function2<? super Composer, ? super Integer, Unit> function29;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        int i30;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        TextFieldColors textFieldColorsColors;
        int i31;
        int i32;
        boolean z6;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z7;
        int i33;
        Function2<? super Composer, ? super Integer, Unit> function210;
        int i34;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        int i35;
        Function2<? super Composer, ? super Integer, Unit> function213;
        VisualTransformation visualTransformation2;
        Function2<? super Composer, ? super Integer, Unit> function214;
        boolean z8;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Function2<? super Composer, ? super Integer, Unit> function217;
        long jM13195getColor0d7_KjU;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final VisualTransformation visualTransformation3;
        final TextFieldColors textFieldColors2;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z9;
        final int i36;
        final int i37;
        final MutableInteractionSource mutableInteractionSource5;
        final Shape shape4;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final boolean z10;
        final boolean z11;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        final boolean z12;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function224;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1570442800);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i7 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    i7 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                }
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i7 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((i3 & CpioConstants.C_ISBLK) == 0) {
                            i7 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                            i7 |= ((i6 & 32) == 0 && composerStartRestartGroup.changed(textStyle)) ? 131072 : 65536;
                        }
                        i11 = i6 & 64;
                        if (i11 != 0) {
                            i7 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        }
                        i12 = i6 & 128;
                        if (i12 != 0) {
                            i7 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i13 = i6 & 256;
                        if (i13 != 0) {
                            i7 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i15 = i6 & 1024;
                        if (i15 != 0) {
                            i16 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i16 = i4 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i16 = i4;
                        }
                        i17 = i6 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i16 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
                        }
                        int i38 = i16;
                        i18 = i6 & 4096;
                        if (i18 != 0) {
                            i38 |= 384;
                        } else {
                            if ((i4 & 384) == 0) {
                                i38 |= composerStartRestartGroup.changedInstance(function27) ? 256 : 128;
                            }
                            i19 = i6 & 8192;
                            if (i19 == 0) {
                                i38 |= 3072;
                            } else {
                                if ((i4 & 3072) == 0) {
                                    i38 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                                }
                                i20 = i6 & 16384;
                                if (i20 == 0) {
                                    i21 = i20;
                                    if ((i4 & CpioConstants.C_ISBLK) == 0) {
                                        i38 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                                    }
                                    i22 = i6 & 32768;
                                    if (i22 == 0) {
                                        i38 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                                    } else if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                                        i38 |= composerStartRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                                    }
                                    i23 = i6 & 65536;
                                    if (i23 == 0) {
                                        i38 |= 1572864;
                                    } else if ((i4 & 1572864) == 0) {
                                        i38 |= composerStartRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                                    }
                                    i24 = i6 & 131072;
                                    if (i24 == 0) {
                                        i38 |= 12582912;
                                    } else if ((i4 & 12582912) == 0) {
                                        i38 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                                    }
                                    if ((i4 & 100663296) == 0) {
                                        i38 |= ((i6 & 262144) == 0 && composerStartRestartGroup.changed(i)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                                    }
                                    i25 = i6 & 524288;
                                    if (i25 == 0) {
                                        i38 |= 805306368;
                                    } else if ((i4 & 805306368) == 0) {
                                        i38 |= composerStartRestartGroup.changed(i2) ? 536870912 : 268435456;
                                    }
                                    i26 = i6 & 1048576;
                                    if (i26 == 0) {
                                        i27 = i5 | 6;
                                    } else if ((i5 & 6) == 0) {
                                        i27 = i5 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                    } else {
                                        i27 = i5;
                                    }
                                    if ((i5 & 48) == 0) {
                                        i27 |= ((i6 & 2097152) == 0 && composerStartRestartGroup.changed(shape)) ? 32 : 16;
                                    }
                                    if ((i5 & 384) == 0) {
                                        i27 |= ((i6 & 4194304) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 256 : 128;
                                    }
                                    i28 = i27;
                                    if ((i7 & 306783379) == 306783378 || (306783379 & i38) != 306783378 || (i28 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            modifier2 = i8 == 0 ? Modifier.INSTANCE : modifier;
                                            z5 = i9 == 0 ? true : z;
                                            boolean z13 = i10 == 0 ? false : z2;
                                            if ((i6 & 32) == 0) {
                                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                                i7 &= -458753;
                                            } else {
                                                textStyle2 = textStyle;
                                            }
                                            Function2<? super Composer, ? super Integer, Unit> function225 = i11 == 0 ? null : function2;
                                            function28 = i12 == 0 ? null : function22;
                                            Function2<? super Composer, ? super Integer, Unit> function226 = i13 == 0 ? null : function23;
                                            Function2<? super Composer, ? super Integer, Unit> function227 = i14 == 0 ? null : function24;
                                            Function2<? super Composer, ? super Integer, Unit> function228 = i15 == 0 ? null : function25;
                                            Function2<? super Composer, ? super Integer, Unit> function229 = i17 == 0 ? null : function26;
                                            Function2<? super Composer, ? super Integer, Unit> function230 = i18 == 0 ? function27 : null;
                                            boolean z14 = i19 == 0 ? false : z3;
                                            VisualTransformation none = i21 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                            KeyboardOptions keyboardOptions4 = i22 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                            KeyboardActions keyboardActions4 = i23 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                            boolean z15 = i24 == 0 ? false : z4;
                                            if ((i6 & 262144) == 0) {
                                                i29 = z15 ? 1 : Integer.MAX_VALUE;
                                                i38 &= -234881025;
                                            } else {
                                                i29 = i;
                                            }
                                            int i39 = i25 == 0 ? 1 : i2;
                                            Function2<? super Composer, ? super Integer, Unit> function231 = function226;
                                            if (i26 == 0) {
                                                composerStartRestartGroup.startReplaceableGroup(1663544507);
                                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                function29 = function227;
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                }
                                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                                composerStartRestartGroup.endReplaceableGroup();
                                            } else {
                                                function29 = function227;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                            }
                                            if ((2097152 & i6) == 0) {
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                                i30 = 6;
                                                shape2 = OutlinedTextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                                i28 &= -113;
                                            } else {
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                                i30 = 6;
                                                shape2 = shape;
                                            }
                                            Shape shape5 = shape2;
                                            if ((i6 & 4194304) == 0) {
                                                i28 &= -897;
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                                shape3 = shape5;
                                                textFieldColorsColors = OutlinedTextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, i30);
                                            } else {
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                                shape3 = shape5;
                                                textFieldColorsColors = textFieldColors;
                                            }
                                            i31 = i7;
                                            i32 = i38;
                                            z6 = z13;
                                            keyboardOptions2 = keyboardOptions4;
                                            keyboardActions2 = keyboardActions4;
                                            z7 = z15;
                                            i33 = i29;
                                            function210 = function225;
                                            i34 = i39;
                                            function211 = function29;
                                            function212 = function229;
                                            i35 = i28;
                                            function213 = function228;
                                            visualTransformation2 = none;
                                            function214 = function231;
                                            z8 = z14;
                                            function215 = function230;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i6 & 32) != 0) {
                                                i7 &= -458753;
                                            }
                                            if ((262144 & i6) != 0) {
                                                i38 &= -234881025;
                                            }
                                            if ((2097152 & i6) != 0) {
                                                i28 &= -113;
                                            }
                                            if ((i6 & 4194304) != 0) {
                                                i28 &= -897;
                                            }
                                            modifier2 = modifier;
                                            z5 = z;
                                            z6 = z2;
                                            textStyle2 = textStyle;
                                            function210 = function2;
                                            function28 = function22;
                                            function214 = function23;
                                            function213 = function25;
                                            function215 = function27;
                                            z8 = z3;
                                            keyboardOptions2 = keyboardOptions;
                                            keyboardActions2 = keyboardActions;
                                            z7 = z4;
                                            i33 = i;
                                            i34 = i2;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColorsColors = textFieldColors;
                                            i31 = i7;
                                            i32 = i38;
                                            i35 = i28;
                                            function211 = function24;
                                            function212 = function26;
                                            visualTransformation2 = visualTransformation;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            function216 = function212;
                                            function217 = function215;
                                        } else {
                                            function217 = function215;
                                            function216 = function212;
                                            ComposerKt.traceEventStart(-1570442800, i31, i32, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:325)");
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(1663544788);
                                        jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                                        if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                            jM13195getColor0d7_KjU = textFieldColorsColors.textColor$material3_release(z5, z8, mutableInteractionSource4, composerStartRestartGroup, ((i31 >> 9) & 14) | ((i32 >> 6) & 112) | ((i35 << 6) & 896) | ((i35 << 3) & 7168)).getValue().m11350unboximpl();
                                        }
                                        long j = jM13195getColor0d7_KjU;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        final TextStyle textStyleMerge = textStyle2.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        final TextFieldColors textFieldColors3 = textFieldColorsColors;
                                        final Function2<? super Composer, ? super Integer, Unit> function232 = function210;
                                        final Modifier modifier4 = modifier2;
                                        final boolean z16 = z8;
                                        final boolean z17 = z5;
                                        final boolean z18 = z6;
                                        final KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                        final KeyboardActions keyboardActions5 = keyboardActions2;
                                        final boolean z19 = z7;
                                        final int i40 = i33;
                                        final int i41 = i34;
                                        final VisualTransformation visualTransformation4 = visualTransformation2;
                                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                        final Function2<? super Composer, ? super Integer, Unit> function233 = function28;
                                        final Function2<? super Composer, ? super Integer, Unit> function234 = function214;
                                        final Function2<? super Composer, ? super Integer, Unit> function235 = function211;
                                        final Function2<? super Composer, ? super Integer, Unit> function236 = function213;
                                        final Function2<? super Composer, ? super Integer, Unit> function237 = function216;
                                        final Function2<? super Composer, ? super Integer, Unit> function238 = function217;
                                        final Shape shape6 = shape3;
                                        boolean z20 = z6;
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getSelectionColors(composerStartRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1830921872, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5
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
                                            public final void invoke(@Nullable Composer composer2, int i42) {
                                                Modifier modifierM8127paddingqDBjuR0$default;
                                                if ((i42 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1830921872, i42, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:333)");
                                                    }
                                                    if (function232 != null) {
                                                        modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier4, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.1
                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                invoke2(semanticsPropertyReceiver);
                                                                return Unit.INSTANCE;
                                                            }
                                                        }), 0.0f, OutlinedTextFieldKt.getOutlinedTextFieldTopPadding(), 0.0f, 0.0f, 13, null);
                                                    } else {
                                                        modifierM8127paddingqDBjuR0$default = modifier4;
                                                    }
                                                    boolean z21 = z16;
                                                    Strings.Companion companion = Strings.INSTANCE;
                                                    Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifierM8127paddingqDBjuR0$default, z21, Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.default_error_message), composer2, 0));
                                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, outlinedTextFieldDefaults.m9630getMinWidthD9Ej5fM(), outlinedTextFieldDefaults.m9629getMinHeightD9Ej5fM());
                                                    SolidColor solidColor = new SolidColor(textFieldColors3.cursorColor$material3_release(z16, composer2, 0).getValue().m11350unboximpl(), null);
                                                    final TextFieldValue textFieldValue2 = textFieldValue;
                                                    Function1<TextFieldValue, Unit> function12 = function1;
                                                    final boolean z22 = z17;
                                                    boolean z23 = z18;
                                                    TextStyle textStyle4 = textStyleMerge;
                                                    KeyboardOptions keyboardOptions6 = keyboardOptions5;
                                                    KeyboardActions keyboardActions6 = keyboardActions5;
                                                    final boolean z24 = z19;
                                                    int i43 = i40;
                                                    int i44 = i41;
                                                    final VisualTransformation visualTransformation5 = visualTransformation4;
                                                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                                    final boolean z25 = z16;
                                                    final Function2<Composer, Integer, Unit> function239 = function232;
                                                    final Function2<Composer, Integer, Unit> function240 = function233;
                                                    final Function2<Composer, Integer, Unit> function241 = function234;
                                                    final Function2<Composer, Integer, Unit> function242 = function235;
                                                    final Function2<Composer, Integer, Unit> function243 = function236;
                                                    final Function2<Composer, Integer, Unit> function244 = function237;
                                                    final Function2<Composer, Integer, Unit> function245 = function238;
                                                    final TextFieldColors textFieldColors4 = textFieldColors3;
                                                    final Shape shape7 = shape6;
                                                    BasicTextFieldKt.BasicTextField(textFieldValue2, function12, modifierM8156defaultMinSizeVpY3zN4, z22, z23, textStyle4, keyboardOptions6, keyboardActions6, z24, i43, i44, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor, ComposableLambdaKt.composableLambda(composer2, -757328870, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function246, Composer composer3, Integer num) {
                                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function246, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @Composable
                                                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function246, @Nullable Composer composer3, int i45) {
                                                            int i46;
                                                            if ((i45 & 6) == 0) {
                                                                i46 = i45 | (composer3.changedInstance(function246) ? 4 : 2);
                                                            } else {
                                                                i46 = i45;
                                                            }
                                                            if ((i46 & 19) != 18 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-757328870, i46, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:362)");
                                                                }
                                                                OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                                                                String text = textFieldValue2.getText();
                                                                final boolean z26 = z22;
                                                                boolean z27 = z24;
                                                                VisualTransformation visualTransformation6 = visualTransformation5;
                                                                final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                                                final boolean z28 = z25;
                                                                Function2<Composer, Integer, Unit> function247 = function239;
                                                                Function2<Composer, Integer, Unit> function248 = function240;
                                                                Function2<Composer, Integer, Unit> function249 = function241;
                                                                Function2<Composer, Integer, Unit> function250 = function242;
                                                                Function2<Composer, Integer, Unit> function251 = function243;
                                                                int i47 = i46;
                                                                Function2<Composer, Integer, Unit> function252 = function244;
                                                                Function2<Composer, Integer, Unit> function253 = function245;
                                                                final TextFieldColors textFieldColors5 = textFieldColors4;
                                                                final Shape shape8 = shape7;
                                                                outlinedTextFieldDefaults2.DecorationBox(text, function246, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function247, function248, function249, function250, function251, function252, function253, textFieldColors5, null, ComposableLambdaKt.composableLambda(composer3, 255570733, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
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
                                                                    public final void invoke(@Nullable Composer composer4, int i48) {
                                                                        if ((i48 & 3) != 2 || !composer4.getSkipping()) {
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(255570733, i48, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:379)");
                                                                            }
                                                                            OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z26, z28, mutableInteractionSource8, textFieldColors5, shape8, 0.0f, 0.0f, composer4, 12582912, 96);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        composer4.skipToGroupEnd();
                                                                    }
                                                                }), composer3, (i47 << 3) & 112, 14155776, 32768);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }), composer2, 0, ProfileVerifier.CompilationStatus.f342xf2722a21, 4096);
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
                                        function218 = function210;
                                        visualTransformation3 = visualTransformation2;
                                        textFieldColors2 = textFieldColors3;
                                        textStyle3 = textStyle2;
                                        keyboardOptions3 = keyboardOptions2;
                                        keyboardActions3 = keyboardActions2;
                                        z9 = z7;
                                        i36 = i33;
                                        i37 = i34;
                                        mutableInteractionSource5 = mutableInteractionSource4;
                                        shape4 = shape3;
                                        function219 = function216;
                                        function220 = function213;
                                        z10 = z8;
                                        z11 = z20;
                                        function221 = function211;
                                        z12 = z5;
                                        function222 = function217;
                                        Function2<? super Composer, ? super Integer, Unit> function239 = function28;
                                        function223 = function214;
                                        modifier3 = modifier2;
                                        function224 = function239;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        modifier3 = modifier;
                                        z12 = z;
                                        z11 = z2;
                                        textStyle3 = textStyle;
                                        function218 = function2;
                                        function224 = function22;
                                        function223 = function23;
                                        function221 = function24;
                                        function220 = function25;
                                        function219 = function26;
                                        function222 = function27;
                                        z10 = z3;
                                        visualTransformation3 = visualTransformation;
                                        keyboardOptions3 = keyboardOptions;
                                        keyboardActions3 = keyboardActions;
                                        z9 = z4;
                                        i36 = i;
                                        i37 = i2;
                                        mutableInteractionSource5 = mutableInteractionSource;
                                        shape4 = shape;
                                        textFieldColors2 = textFieldColors;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.6
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

                                            public final void invoke(@Nullable Composer composer2, int i42) {
                                                OutlinedTextFieldKt.OutlinedTextField(textFieldValue, function1, modifier3, z12, z11, textStyle3, function218, function224, function223, function221, function220, function219, function222, z10, visualTransformation3, keyboardOptions3, keyboardActions3, z9, i36, i37, mutableInteractionSource5, shape4, textFieldColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i38 |= CpioConstants.C_ISBLK;
                                i21 = i20;
                                i22 = i6 & 32768;
                                if (i22 == 0) {
                                }
                                i23 = i6 & 65536;
                                if (i23 == 0) {
                                }
                                i24 = i6 & 131072;
                                if (i24 == 0) {
                                }
                                if ((i4 & 100663296) == 0) {
                                }
                                i25 = i6 & 524288;
                                if (i25 == 0) {
                                }
                                i26 = i6 & 1048576;
                                if (i26 == 0) {
                                }
                                if ((i5 & 48) == 0) {
                                }
                                if ((i5 & 384) == 0) {
                                }
                                i28 = i27;
                                if ((i7 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0) {
                                        if (i8 == 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if ((i6 & 32) == 0) {
                                        }
                                        if (i11 == 0) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        if (i13 == 0) {
                                        }
                                        if (i14 == 0) {
                                        }
                                        if (i15 == 0) {
                                        }
                                        if (i17 == 0) {
                                        }
                                        if (i18 == 0) {
                                        }
                                        if (i19 == 0) {
                                        }
                                        if (i21 == 0) {
                                        }
                                        if (i22 == 0) {
                                        }
                                        if (i23 == 0) {
                                        }
                                        if (i24 == 0) {
                                        }
                                        if ((i6 & 262144) == 0) {
                                        }
                                        if (i25 == 0) {
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function2312 = function226;
                                        if (i26 == 0) {
                                        }
                                        if ((2097152 & i6) == 0) {
                                        }
                                        Shape shape52 = shape2;
                                        if ((i6 & 4194304) == 0) {
                                        }
                                        i31 = i7;
                                        i32 = i38;
                                        z6 = z13;
                                        keyboardOptions2 = keyboardOptions4;
                                        keyboardActions2 = keyboardActions4;
                                        z7 = z15;
                                        i33 = i29;
                                        function210 = function225;
                                        i34 = i39;
                                        function211 = function29;
                                        function212 = function229;
                                        i35 = i28;
                                        function213 = function228;
                                        visualTransformation2 = none;
                                        function214 = function2312;
                                        z8 = z14;
                                        function215 = function230;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(1663544788);
                                        jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                                        if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                        }
                                        long j2 = jM13195getColor0d7_KjU;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        final TextStyle textStyleMerge2 = textStyle2.merge(new TextStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        final TextFieldColors textFieldColors32 = textFieldColorsColors;
                                        final Function2<? super Composer, ? super Integer, Unit> function2322 = function210;
                                        final Modifier modifier42 = modifier2;
                                        final boolean z162 = z8;
                                        final boolean z172 = z5;
                                        final boolean z182 = z6;
                                        final KeyboardOptions keyboardOptions52 = keyboardOptions2;
                                        final KeyboardActions keyboardActions52 = keyboardActions2;
                                        final boolean z192 = z7;
                                        final int i402 = i33;
                                        final int i412 = i34;
                                        final VisualTransformation visualTransformation42 = visualTransformation2;
                                        final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                                        final Function2<? super Composer, ? super Integer, Unit> function2332 = function28;
                                        final Function2<? super Composer, ? super Integer, Unit> function2342 = function214;
                                        final Function2<? super Composer, ? super Integer, Unit> function2352 = function211;
                                        final Function2<? super Composer, ? super Integer, Unit> function2362 = function213;
                                        final Function2<? super Composer, ? super Integer, Unit> function2372 = function216;
                                        final Function2<? super Composer, ? super Integer, Unit> function2382 = function217;
                                        final Shape shape62 = shape3;
                                        boolean z202 = z6;
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors32.getSelectionColors(composerStartRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1830921872, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5
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
                                            public final void invoke(@Nullable Composer composer2, int i42) {
                                                Modifier modifierM8127paddingqDBjuR0$default;
                                                if ((i42 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1830921872, i42, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:333)");
                                                    }
                                                    if (function2322 != null) {
                                                        modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier42, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.1
                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                invoke2(semanticsPropertyReceiver);
                                                                return Unit.INSTANCE;
                                                            }
                                                        }), 0.0f, OutlinedTextFieldKt.getOutlinedTextFieldTopPadding(), 0.0f, 0.0f, 13, null);
                                                    } else {
                                                        modifierM8127paddingqDBjuR0$default = modifier42;
                                                    }
                                                    boolean z21 = z162;
                                                    Strings.Companion companion = Strings.INSTANCE;
                                                    Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifierM8127paddingqDBjuR0$default, z21, Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.default_error_message), composer2, 0));
                                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, outlinedTextFieldDefaults.m9630getMinWidthD9Ej5fM(), outlinedTextFieldDefaults.m9629getMinHeightD9Ej5fM());
                                                    SolidColor solidColor = new SolidColor(textFieldColors32.cursorColor$material3_release(z162, composer2, 0).getValue().m11350unboximpl(), null);
                                                    final TextFieldValue textFieldValue2 = textFieldValue;
                                                    Function1<TextFieldValue, Unit> function12 = function1;
                                                    final boolean z22 = z172;
                                                    boolean z23 = z182;
                                                    TextStyle textStyle4 = textStyleMerge2;
                                                    KeyboardOptions keyboardOptions6 = keyboardOptions52;
                                                    KeyboardActions keyboardActions6 = keyboardActions52;
                                                    final boolean z24 = z192;
                                                    int i43 = i402;
                                                    int i44 = i412;
                                                    final VisualTransformation visualTransformation5 = visualTransformation42;
                                                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                                                    final boolean z25 = z162;
                                                    final Function2<? super Composer, ? super Integer, Unit> function2392 = function2322;
                                                    final Function2<? super Composer, ? super Integer, Unit> function240 = function2332;
                                                    final Function2<? super Composer, ? super Integer, Unit> function241 = function2342;
                                                    final Function2<? super Composer, ? super Integer, Unit> function242 = function2352;
                                                    final Function2<? super Composer, ? super Integer, Unit> function243 = function2362;
                                                    final Function2<? super Composer, ? super Integer, Unit> function244 = function2372;
                                                    final Function2<? super Composer, ? super Integer, Unit> function245 = function2382;
                                                    final TextFieldColors textFieldColors4 = textFieldColors32;
                                                    final Shape shape7 = shape62;
                                                    BasicTextFieldKt.BasicTextField(textFieldValue2, function12, modifierM8156defaultMinSizeVpY3zN4, z22, z23, textStyle4, keyboardOptions6, keyboardActions6, z24, i43, i44, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor, ComposableLambdaKt.composableLambda(composer2, -757328870, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function246, Composer composer3, Integer num) {
                                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function246, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @Composable
                                                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function246, @Nullable Composer composer3, int i45) {
                                                            int i46;
                                                            if ((i45 & 6) == 0) {
                                                                i46 = i45 | (composer3.changedInstance(function246) ? 4 : 2);
                                                            } else {
                                                                i46 = i45;
                                                            }
                                                            if ((i46 & 19) != 18 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-757328870, i46, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:362)");
                                                                }
                                                                OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                                                                String text = textFieldValue2.getText();
                                                                final boolean z26 = z22;
                                                                boolean z27 = z24;
                                                                VisualTransformation visualTransformation6 = visualTransformation5;
                                                                final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                                                final boolean z28 = z25;
                                                                Function2<Composer, Integer, Unit> function247 = function2392;
                                                                Function2<Composer, Integer, Unit> function248 = function240;
                                                                Function2<Composer, Integer, Unit> function249 = function241;
                                                                Function2<Composer, Integer, Unit> function250 = function242;
                                                                Function2<Composer, Integer, Unit> function251 = function243;
                                                                int i47 = i46;
                                                                Function2<Composer, Integer, Unit> function252 = function244;
                                                                Function2<Composer, Integer, Unit> function253 = function245;
                                                                final TextFieldColors textFieldColors5 = textFieldColors4;
                                                                final Shape shape8 = shape7;
                                                                outlinedTextFieldDefaults2.DecorationBox(text, function246, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function247, function248, function249, function250, function251, function252, function253, textFieldColors5, null, ComposableLambdaKt.composableLambda(composer3, 255570733, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
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
                                                                    public final void invoke(@Nullable Composer composer4, int i48) {
                                                                        if ((i48 & 3) != 2 || !composer4.getSkipping()) {
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(255570733, i48, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:379)");
                                                                            }
                                                                            OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z26, z28, mutableInteractionSource8, textFieldColors5, shape8, 0.0f, 0.0f, composer4, 12582912, 96);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        composer4.skipToGroupEnd();
                                                                    }
                                                                }), composer3, (i47 << 3) & 112, 14155776, 32768);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }), composer2, 0, ProfileVerifier.CompilationStatus.f342xf2722a21, 4096);
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
                                        }
                                        function218 = function210;
                                        visualTransformation3 = visualTransformation2;
                                        textFieldColors2 = textFieldColors32;
                                        textStyle3 = textStyle2;
                                        keyboardOptions3 = keyboardOptions2;
                                        keyboardActions3 = keyboardActions2;
                                        z9 = z7;
                                        i36 = i33;
                                        i37 = i34;
                                        mutableInteractionSource5 = mutableInteractionSource4;
                                        shape4 = shape3;
                                        function219 = function216;
                                        function220 = function213;
                                        z10 = z8;
                                        z11 = z202;
                                        function221 = function211;
                                        z12 = z5;
                                        function222 = function217;
                                        Function2<? super Composer, ? super Integer, Unit> function2392 = function28;
                                        function223 = function214;
                                        modifier3 = modifier2;
                                        function224 = function2392;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i20 = i6 & 16384;
                            if (i20 == 0) {
                            }
                            i22 = i6 & 32768;
                            if (i22 == 0) {
                            }
                            i23 = i6 & 65536;
                            if (i23 == 0) {
                            }
                            i24 = i6 & 131072;
                            if (i24 == 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            i25 = i6 & 524288;
                            if (i25 == 0) {
                            }
                            i26 = i6 & 1048576;
                            if (i26 == 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            if ((i5 & 384) == 0) {
                            }
                            i28 = i27;
                            if ((i7 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i19 = i6 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i6 & 16384;
                        if (i20 == 0) {
                        }
                        i22 = i6 & 32768;
                        if (i22 == 0) {
                        }
                        i23 = i6 & 65536;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 131072;
                        if (i24 == 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i25 = i6 & 524288;
                        if (i25 == 0) {
                        }
                        i26 = i6 & 1048576;
                        if (i26 == 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        if ((i5 & 384) == 0) {
                        }
                        i28 = i27;
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    i11 = i6 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i6 & 2048;
                    if (i17 != 0) {
                    }
                    int i382 = i16;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i6 & 16384;
                    if (i20 == 0) {
                    }
                    i22 = i6 & 32768;
                    if (i22 == 0) {
                    }
                    i23 = i6 & 65536;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 131072;
                    if (i24 == 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i25 = i6 & 524288;
                    if (i25 == 0) {
                    }
                    i26 = i6 & 1048576;
                    if (i26 == 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    if ((i5 & 384) == 0) {
                    }
                    i28 = i27;
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i6 & 1024;
                if (i15 != 0) {
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                }
                int i3822 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                }
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i20 = i6 & 16384;
                if (i20 == 0) {
                }
                i22 = i6 & 32768;
                if (i22 == 0) {
                }
                i23 = i6 & 65536;
                if (i23 == 0) {
                }
                i24 = i6 & 131072;
                if (i24 == 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i25 = i6 & 524288;
                if (i25 == 0) {
                }
                i26 = i6 & 1048576;
                if (i26 == 0) {
                }
                if ((i5 & 48) == 0) {
                }
                if ((i5 & 384) == 0) {
                }
                i28 = i27;
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i38222 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i20 = i6 & 16384;
            if (i20 == 0) {
            }
            i22 = i6 & 32768;
            if (i22 == 0) {
            }
            i23 = i6 & 65536;
            if (i23 == 0) {
            }
            i24 = i6 & 131072;
            if (i24 == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i25 = i6 & 524288;
            if (i25 == 0) {
            }
            i26 = i6 & 1048576;
            if (i26 == 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            i28 = i27;
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i382222 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i20 = i6 & 16384;
        if (i20 == 0) {
        }
        i22 = i6 & 32768;
        if (i22 == 0) {
        }
        i23 = i6 & 65536;
        if (i23 == 0) {
        }
        i24 = i6 & 131072;
        if (i24 == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i25 = i6 & 524288;
        if (i25 == 0) {
        }
        i26 = i6 & 1048576;
        if (i26 == 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        i28 = i27;
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:329:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void OutlinedTextField(final String str, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Modifier modifier2;
        boolean z5;
        TextStyle textStyle2;
        Function2 function26;
        int i26;
        Function2 function27;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        int i27;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource4;
        TextFieldColors textFieldColorsColors;
        int i28;
        int i29;
        Shape shape3;
        boolean z6;
        int i30;
        boolean z7;
        int i31;
        Function2 function28;
        Function2 function29;
        boolean z8;
        KeyboardActions keyboardActions2;
        Function2 function210;
        KeyboardOptions keyboardOptions2;
        VisualTransformation visualTransformation2;
        Function2 function211;
        Composer composer2;
        KeyboardActions keyboardActions3;
        final KeyboardActions keyboardActions4;
        final VisualTransformation visualTransformation3;
        final KeyboardOptions keyboardOptions3;
        final boolean z9;
        final int i32;
        final int i33;
        final MutableInteractionSource mutableInteractionSource5;
        final Shape shape4;
        final TextFieldColors textFieldColors2;
        final Function2 function212;
        final Function2 function213;
        final Modifier modifier3;
        final Function2 function214;
        final Function2 function215;
        final boolean z10;
        final boolean z11;
        final TextStyle textStyle3;
        final Function2 function216;
        final boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1575225237);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i7 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    i7 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                }
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i7 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((i3 & CpioConstants.C_ISBLK) == 0) {
                            i7 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                            i7 |= ((i6 & 32) == 0 && composerStartRestartGroup.changed(textStyle)) ? 131072 : 65536;
                        }
                        i11 = i6 & 64;
                        if (i11 != 0) {
                            i7 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        }
                        i12 = i6 & 128;
                        if (i12 != 0) {
                            i7 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i13 = i6 & 256;
                        if (i13 != 0) {
                            i7 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i15 = i6 & 1024;
                        if (i15 != 0) {
                            i16 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i16 = i4 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i16 = i4;
                        }
                        i17 = i6 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i16 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
                        }
                        int i34 = i16;
                        i18 = i6 & 4096;
                        if (i18 != 0) {
                            i34 |= 384;
                        } else {
                            if ((i4 & 384) == 0) {
                                i34 |= composerStartRestartGroup.changed(visualTransformation) ? 256 : 128;
                            }
                            i19 = i6 & 8192;
                            if (i19 == 0) {
                                i34 |= 3072;
                            } else {
                                if ((i4 & 3072) == 0) {
                                    i34 |= composerStartRestartGroup.changed(keyboardOptions) ? 2048 : 1024;
                                }
                                i20 = i6 & 16384;
                                if (i20 == 0) {
                                    i21 = i20;
                                    if ((i4 & CpioConstants.C_ISBLK) == 0) {
                                        i34 |= composerStartRestartGroup.changed(keyboardActions) ? 16384 : 8192;
                                    }
                                    i22 = i6 & 32768;
                                    if (i22 == 0) {
                                        i34 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                                    } else if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                                        i34 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                                    }
                                    if ((i4 & 1572864) == 0) {
                                        i34 |= ((i6 & 65536) == 0 && composerStartRestartGroup.changed(i)) ? 1048576 : 524288;
                                    }
                                    i23 = i6 & 131072;
                                    if (i23 == 0) {
                                        i34 |= 12582912;
                                    } else if ((i4 & 12582912) == 0) {
                                        i34 |= composerStartRestartGroup.changed(i2) ? 8388608 : 4194304;
                                    }
                                    i24 = i6 & 262144;
                                    if (i24 == 0) {
                                        i34 |= 100663296;
                                    } else if ((i4 & 100663296) == 0) {
                                        i34 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                                    }
                                    if ((i4 & 805306368) == 0) {
                                        i34 |= ((i6 & 524288) == 0 && composerStartRestartGroup.changed(shape)) ? 536870912 : 268435456;
                                    }
                                    if ((i5 & 6) != 0) {
                                        i25 = i5 | (((i6 & 1048576) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 4 : 2);
                                    } else {
                                        i25 = i5;
                                    }
                                    if ((i7 & 306783379) == 306783378 || (306783379 & i34) != 306783378 || (i25 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            modifier2 = i8 == 0 ? Modifier.INSTANCE : modifier;
                                            z5 = i9 == 0 ? true : z;
                                            boolean z13 = i10 == 0 ? false : z2;
                                            if ((i6 & 32) == 0) {
                                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                                i7 &= -458753;
                                            } else {
                                                textStyle2 = textStyle;
                                            }
                                            Function2 function217 = i11 == 0 ? null : function2;
                                            function26 = i12 == 0 ? null : function22;
                                            Function2 function218 = i13 == 0 ? null : function23;
                                            Function2 function219 = i14 == 0 ? null : function24;
                                            Function2 function220 = i15 == 0 ? function25 : null;
                                            boolean z14 = i17 == 0 ? false : z3;
                                            VisualTransformation none = i18 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                            KeyboardOptions keyboardOptions4 = i19 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                            KeyboardActions keyboardActions5 = i21 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                            boolean z15 = i22 == 0 ? false : z4;
                                            if ((i6 & 65536) == 0) {
                                                i26 = z15 ? 1 : Integer.MAX_VALUE;
                                                i34 &= -3670017;
                                            } else {
                                                i26 = i;
                                            }
                                            int i35 = i23 == 0 ? 1 : i2;
                                            if (i24 == 0) {
                                                composerStartRestartGroup.startReplaceableGroup(1663548494);
                                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                function27 = function218;
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                }
                                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                                composerStartRestartGroup.endReplaceableGroup();
                                            } else {
                                                function27 = function218;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                            }
                                            if ((i6 & 524288) == 0) {
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                                i27 = 6;
                                                shape2 = OutlinedTextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                                i34 &= -1879048193;
                                            } else {
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                                i27 = 6;
                                                shape2 = shape;
                                            }
                                            Function2 function221 = function219;
                                            if ((i6 & 1048576) == 0) {
                                                i25 &= -15;
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                                textFieldColorsColors = OutlinedTextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, i27);
                                            } else {
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                                textFieldColorsColors = textFieldColors;
                                            }
                                            i28 = i7;
                                            i29 = i34;
                                            shape3 = shape2;
                                            z6 = z15;
                                            i30 = i26;
                                            z7 = z13;
                                            i31 = i35;
                                            function28 = function217;
                                            function29 = function221;
                                            z8 = z14;
                                            keyboardActions2 = keyboardActions5;
                                            function210 = function27;
                                            keyboardOptions2 = keyboardOptions4;
                                            visualTransformation2 = none;
                                            function211 = function220;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i6 & 32) != 0) {
                                                i7 &= -458753;
                                            }
                                            if ((i6 & 65536) != 0) {
                                                i34 &= -3670017;
                                            }
                                            if ((i6 & 524288) != 0) {
                                                i34 &= -1879048193;
                                            }
                                            if ((i6 & 1048576) != 0) {
                                                i25 &= -15;
                                            }
                                            modifier2 = modifier;
                                            z5 = z;
                                            z7 = z2;
                                            textStyle2 = textStyle;
                                            function28 = function2;
                                            function26 = function22;
                                            function210 = function23;
                                            function211 = function25;
                                            visualTransformation2 = visualTransformation;
                                            keyboardOptions2 = keyboardOptions;
                                            keyboardActions2 = keyboardActions;
                                            z6 = z4;
                                            i30 = i;
                                            i31 = i2;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColorsColors = textFieldColors;
                                            i28 = i7;
                                            i29 = i34;
                                            function29 = function24;
                                            z8 = z3;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        composer2 = composerStartRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                            keyboardActions3 = keyboardActions2;
                                        } else {
                                            keyboardActions3 = keyboardActions2;
                                            ComposerKt.traceEventStart(-1575225237, i28, i29, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:418)");
                                        }
                                        int i36 = i29 << 6;
                                        OutlinedTextField(str, (Function1<? super String, Unit>) function1, modifier2, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function211, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColorsColors, composer2, i28 & 2147483646, (i36 & 896) | 54 | (i36 & 7168) | (57344 & i36) | (458752 & i36) | (3670016 & i36) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192), ((i29 >> 24) & 126) | ((i25 << 6) & 896), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        keyboardActions4 = keyboardActions3;
                                        visualTransformation3 = visualTransformation2;
                                        keyboardOptions3 = keyboardOptions2;
                                        z9 = z6;
                                        i32 = i30;
                                        i33 = i31;
                                        mutableInteractionSource5 = mutableInteractionSource4;
                                        shape4 = shape3;
                                        textFieldColors2 = textFieldColorsColors;
                                        function212 = function28;
                                        function213 = function210;
                                        modifier3 = modifier2;
                                        function214 = function26;
                                        function215 = function29;
                                        z10 = z5;
                                        z11 = z8;
                                        textStyle3 = textStyle2;
                                        function216 = function211;
                                        z12 = z7;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        modifier3 = modifier;
                                        z10 = z;
                                        z12 = z2;
                                        textStyle3 = textStyle;
                                        function212 = function2;
                                        function214 = function22;
                                        function213 = function23;
                                        function215 = function24;
                                        function216 = function25;
                                        z11 = z3;
                                        visualTransformation3 = visualTransformation;
                                        keyboardOptions3 = keyboardOptions;
                                        keyboardActions4 = keyboardActions;
                                        z9 = z4;
                                        i32 = i;
                                        i33 = i2;
                                        mutableInteractionSource5 = mutableInteractionSource;
                                        shape4 = shape;
                                        textFieldColors2 = textFieldColors;
                                        composer2 = composerStartRestartGroup;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.8
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

                                            public final void invoke(@Nullable Composer composer3, int i37) {
                                                OutlinedTextFieldKt.OutlinedTextField(str, function1, modifier3, z10, z12, textStyle3, function212, function214, function213, function215, function216, z11, visualTransformation3, keyboardOptions3, keyboardActions4, z9, i32, i33, mutableInteractionSource5, shape4, textFieldColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i34 |= CpioConstants.C_ISBLK;
                                i21 = i20;
                                i22 = i6 & 32768;
                                if (i22 == 0) {
                                }
                                if ((i4 & 1572864) == 0) {
                                }
                                i23 = i6 & 131072;
                                if (i23 == 0) {
                                }
                                i24 = i6 & 262144;
                                if (i24 == 0) {
                                }
                                if ((i4 & 805306368) == 0) {
                                }
                                if ((i5 & 6) != 0) {
                                }
                                if ((i7 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0) {
                                        if (i8 == 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if ((i6 & 32) == 0) {
                                        }
                                        if (i11 == 0) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        if (i13 == 0) {
                                        }
                                        if (i14 == 0) {
                                        }
                                        if (i15 == 0) {
                                        }
                                        if (i17 == 0) {
                                        }
                                        if (i18 == 0) {
                                        }
                                        if (i19 == 0) {
                                        }
                                        if (i21 == 0) {
                                        }
                                        if (i22 == 0) {
                                        }
                                        if ((i6 & 65536) == 0) {
                                        }
                                        if (i23 == 0) {
                                        }
                                        if (i24 == 0) {
                                        }
                                        if ((i6 & 524288) == 0) {
                                        }
                                        Function2 function2212 = function219;
                                        if ((i6 & 1048576) == 0) {
                                        }
                                        i28 = i7;
                                        i29 = i34;
                                        shape3 = shape2;
                                        z6 = z15;
                                        i30 = i26;
                                        z7 = z13;
                                        i31 = i35;
                                        function28 = function217;
                                        function29 = function2212;
                                        z8 = z14;
                                        keyboardActions2 = keyboardActions5;
                                        function210 = function27;
                                        keyboardOptions2 = keyboardOptions4;
                                        visualTransformation2 = none;
                                        function211 = function220;
                                        composerStartRestartGroup.endDefaults();
                                        composer2 = composerStartRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        int i362 = i29 << 6;
                                        OutlinedTextField(str, (Function1<? super String, Unit>) function1, modifier2, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function211, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColorsColors, composer2, i28 & 2147483646, (i362 & 896) | 54 | (i362 & 7168) | (57344 & i362) | (458752 & i362) | (3670016 & i362) | (29360128 & i362) | (234881024 & i362) | (i362 & 1879048192), ((i29 >> 24) & 126) | ((i25 << 6) & 896), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        keyboardActions4 = keyboardActions3;
                                        visualTransformation3 = visualTransformation2;
                                        keyboardOptions3 = keyboardOptions2;
                                        z9 = z6;
                                        i32 = i30;
                                        i33 = i31;
                                        mutableInteractionSource5 = mutableInteractionSource4;
                                        shape4 = shape3;
                                        textFieldColors2 = textFieldColorsColors;
                                        function212 = function28;
                                        function213 = function210;
                                        modifier3 = modifier2;
                                        function214 = function26;
                                        function215 = function29;
                                        z10 = z5;
                                        z11 = z8;
                                        textStyle3 = textStyle2;
                                        function216 = function211;
                                        z12 = z7;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i20 = i6 & 16384;
                            if (i20 == 0) {
                            }
                            i22 = i6 & 32768;
                            if (i22 == 0) {
                            }
                            if ((i4 & 1572864) == 0) {
                            }
                            i23 = i6 & 131072;
                            if (i23 == 0) {
                            }
                            i24 = i6 & 262144;
                            if (i24 == 0) {
                            }
                            if ((i4 & 805306368) == 0) {
                            }
                            if ((i5 & 6) != 0) {
                            }
                            if ((i7 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i19 = i6 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i6 & 16384;
                        if (i20 == 0) {
                        }
                        i22 = i6 & 32768;
                        if (i22 == 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        i23 = i6 & 131072;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 262144;
                        if (i24 == 0) {
                        }
                        if ((i4 & 805306368) == 0) {
                        }
                        if ((i5 & 6) != 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    i11 = i6 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i6 & 2048;
                    if (i17 != 0) {
                    }
                    int i342 = i16;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i6 & 16384;
                    if (i20 == 0) {
                    }
                    i22 = i6 & 32768;
                    if (i22 == 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    i23 = i6 & 131072;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 262144;
                    if (i24 == 0) {
                    }
                    if ((i4 & 805306368) == 0) {
                    }
                    if ((i5 & 6) != 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i6 & 1024;
                if (i15 != 0) {
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                }
                int i3422 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                }
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i20 = i6 & 16384;
                if (i20 == 0) {
                }
                i22 = i6 & 32768;
                if (i22 == 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                i23 = i6 & 131072;
                if (i23 == 0) {
                }
                i24 = i6 & 262144;
                if (i24 == 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                if ((i5 & 6) != 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i34222 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i20 = i6 & 16384;
            if (i20 == 0) {
            }
            i22 = i6 & 32768;
            if (i22 == 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            i23 = i6 & 131072;
            if (i23 == 0) {
            }
            i24 = i6 & 262144;
            if (i24 == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            if ((i5 & 6) != 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i342222 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i20 = i6 & 16384;
        if (i20 == 0) {
        }
        i22 = i6 & 32768;
        if (i22 == 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        i23 = i6 & 131072;
        if (i23 == 0) {
        }
        i24 = i6 & 262144;
        if (i24 == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if ((i5 & 6) != 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:329:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void OutlinedTextField(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Modifier modifier2;
        boolean z5;
        TextStyle textStyle2;
        Function2 function26;
        int i26;
        Function2 function27;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        int i27;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource4;
        TextFieldColors textFieldColorsColors;
        int i28;
        int i29;
        Shape shape3;
        boolean z6;
        int i30;
        boolean z7;
        int i31;
        Function2 function28;
        Function2 function29;
        boolean z8;
        KeyboardActions keyboardActions2;
        Function2 function210;
        KeyboardOptions keyboardOptions2;
        VisualTransformation visualTransformation2;
        Function2 function211;
        Composer composer2;
        KeyboardActions keyboardActions3;
        final KeyboardActions keyboardActions4;
        final VisualTransformation visualTransformation3;
        final KeyboardOptions keyboardOptions3;
        final boolean z9;
        final int i32;
        final int i33;
        final MutableInteractionSource mutableInteractionSource5;
        final Shape shape4;
        final TextFieldColors textFieldColors2;
        final Function2 function212;
        final Function2 function213;
        final Modifier modifier3;
        final Function2 function214;
        final Function2 function215;
        final boolean z10;
        final boolean z11;
        final TextStyle textStyle3;
        final Function2 function216;
        final boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-989817544);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i7 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    i7 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                }
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i7 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((i3 & CpioConstants.C_ISBLK) == 0) {
                            i7 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                            i7 |= ((i6 & 32) == 0 && composerStartRestartGroup.changed(textStyle)) ? 131072 : 65536;
                        }
                        i11 = i6 & 64;
                        if (i11 != 0) {
                            i7 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        }
                        i12 = i6 & 128;
                        if (i12 != 0) {
                            i7 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i13 = i6 & 256;
                        if (i13 != 0) {
                            i7 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i15 = i6 & 1024;
                        if (i15 != 0) {
                            i16 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i16 = i4 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i16 = i4;
                        }
                        i17 = i6 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i16 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
                        }
                        int i34 = i16;
                        i18 = i6 & 4096;
                        if (i18 != 0) {
                            i34 |= 384;
                        } else {
                            if ((i4 & 384) == 0) {
                                i34 |= composerStartRestartGroup.changed(visualTransformation) ? 256 : 128;
                            }
                            i19 = i6 & 8192;
                            if (i19 == 0) {
                                i34 |= 3072;
                            } else {
                                if ((i4 & 3072) == 0) {
                                    i34 |= composerStartRestartGroup.changed(keyboardOptions) ? 2048 : 1024;
                                }
                                i20 = i6 & 16384;
                                if (i20 == 0) {
                                    i21 = i20;
                                    if ((i4 & CpioConstants.C_ISBLK) == 0) {
                                        i34 |= composerStartRestartGroup.changed(keyboardActions) ? 16384 : 8192;
                                    }
                                    i22 = i6 & 32768;
                                    if (i22 == 0) {
                                        i34 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                                    } else if ((i4 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                                        i34 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                                    }
                                    if ((i4 & 1572864) == 0) {
                                        i34 |= ((i6 & 65536) == 0 && composerStartRestartGroup.changed(i)) ? 1048576 : 524288;
                                    }
                                    i23 = i6 & 131072;
                                    if (i23 == 0) {
                                        i34 |= 12582912;
                                    } else if ((i4 & 12582912) == 0) {
                                        i34 |= composerStartRestartGroup.changed(i2) ? 8388608 : 4194304;
                                    }
                                    i24 = i6 & 262144;
                                    if (i24 == 0) {
                                        i34 |= 100663296;
                                    } else if ((i4 & 100663296) == 0) {
                                        i34 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                                    }
                                    if ((i4 & 805306368) == 0) {
                                        i34 |= ((i6 & 524288) == 0 && composerStartRestartGroup.changed(shape)) ? 536870912 : 268435456;
                                    }
                                    if ((i5 & 6) != 0) {
                                        i25 = i5 | (((i6 & 1048576) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 4 : 2);
                                    } else {
                                        i25 = i5;
                                    }
                                    if ((i7 & 306783379) == 306783378 || (306783379 & i34) != 306783378 || (i25 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            modifier2 = i8 == 0 ? Modifier.INSTANCE : modifier;
                                            z5 = i9 == 0 ? true : z;
                                            boolean z13 = i10 == 0 ? false : z2;
                                            if ((i6 & 32) == 0) {
                                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                                i7 &= -458753;
                                            } else {
                                                textStyle2 = textStyle;
                                            }
                                            Function2 function217 = i11 == 0 ? null : function2;
                                            function26 = i12 == 0 ? null : function22;
                                            Function2 function218 = i13 == 0 ? null : function23;
                                            Function2 function219 = i14 == 0 ? null : function24;
                                            Function2 function220 = i15 == 0 ? function25 : null;
                                            boolean z14 = i17 == 0 ? false : z3;
                                            VisualTransformation none = i18 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                            KeyboardOptions keyboardOptions4 = i19 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                            KeyboardActions keyboardActions5 = i21 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                            boolean z15 = i22 == 0 ? false : z4;
                                            if ((i6 & 65536) == 0) {
                                                i26 = z15 ? 1 : Integer.MAX_VALUE;
                                                i34 &= -3670017;
                                            } else {
                                                i26 = i;
                                            }
                                            int i35 = i23 == 0 ? 1 : i2;
                                            if (i24 == 0) {
                                                composerStartRestartGroup.startReplaceableGroup(1663550460);
                                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                function27 = function218;
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                }
                                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                                composerStartRestartGroup.endReplaceableGroup();
                                            } else {
                                                function27 = function218;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                            }
                                            if ((i6 & 524288) == 0) {
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                                i27 = 6;
                                                shape2 = OutlinedTextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                                i34 &= -1879048193;
                                            } else {
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                                i27 = 6;
                                                shape2 = shape;
                                            }
                                            Function2 function221 = function219;
                                            if ((i6 & 1048576) == 0) {
                                                i25 &= -15;
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                                textFieldColorsColors = OutlinedTextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, i27);
                                            } else {
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                                textFieldColorsColors = textFieldColors;
                                            }
                                            i28 = i7;
                                            i29 = i34;
                                            shape3 = shape2;
                                            z6 = z15;
                                            i30 = i26;
                                            z7 = z13;
                                            i31 = i35;
                                            function28 = function217;
                                            function29 = function221;
                                            z8 = z14;
                                            keyboardActions2 = keyboardActions5;
                                            function210 = function27;
                                            keyboardOptions2 = keyboardOptions4;
                                            visualTransformation2 = none;
                                            function211 = function220;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i6 & 32) != 0) {
                                                i7 &= -458753;
                                            }
                                            if ((i6 & 65536) != 0) {
                                                i34 &= -3670017;
                                            }
                                            if ((i6 & 524288) != 0) {
                                                i34 &= -1879048193;
                                            }
                                            if ((i6 & 1048576) != 0) {
                                                i25 &= -15;
                                            }
                                            modifier2 = modifier;
                                            z5 = z;
                                            z7 = z2;
                                            textStyle2 = textStyle;
                                            function28 = function2;
                                            function26 = function22;
                                            function210 = function23;
                                            function211 = function25;
                                            visualTransformation2 = visualTransformation;
                                            keyboardOptions2 = keyboardOptions;
                                            keyboardActions2 = keyboardActions;
                                            z6 = z4;
                                            i30 = i;
                                            i31 = i2;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColorsColors = textFieldColors;
                                            i28 = i7;
                                            i29 = i34;
                                            function29 = function24;
                                            z8 = z3;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        composer2 = composerStartRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                            keyboardActions3 = keyboardActions2;
                                        } else {
                                            keyboardActions3 = keyboardActions2;
                                            ComposerKt.traceEventStart(-989817544, i28, i29, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:471)");
                                        }
                                        int i36 = i29 << 6;
                                        OutlinedTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier2, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function211, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColorsColors, composer2, i28 & 2147483646, (i36 & 896) | 54 | (i36 & 7168) | (57344 & i36) | (458752 & i36) | (3670016 & i36) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192), ((i29 >> 24) & 126) | ((i25 << 6) & 896), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        keyboardActions4 = keyboardActions3;
                                        visualTransformation3 = visualTransformation2;
                                        keyboardOptions3 = keyboardOptions2;
                                        z9 = z6;
                                        i32 = i30;
                                        i33 = i31;
                                        mutableInteractionSource5 = mutableInteractionSource4;
                                        shape4 = shape3;
                                        textFieldColors2 = textFieldColorsColors;
                                        function212 = function28;
                                        function213 = function210;
                                        modifier3 = modifier2;
                                        function214 = function26;
                                        function215 = function29;
                                        z10 = z5;
                                        z11 = z8;
                                        textStyle3 = textStyle2;
                                        function216 = function211;
                                        z12 = z7;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        modifier3 = modifier;
                                        z10 = z;
                                        z12 = z2;
                                        textStyle3 = textStyle;
                                        function212 = function2;
                                        function214 = function22;
                                        function213 = function23;
                                        function215 = function24;
                                        function216 = function25;
                                        z11 = z3;
                                        visualTransformation3 = visualTransformation;
                                        keyboardOptions3 = keyboardOptions;
                                        keyboardActions4 = keyboardActions;
                                        z9 = z4;
                                        i32 = i;
                                        i33 = i2;
                                        mutableInteractionSource5 = mutableInteractionSource;
                                        shape4 = shape;
                                        textFieldColors2 = textFieldColors;
                                        composer2 = composerStartRestartGroup;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.10
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

                                            public final void invoke(@Nullable Composer composer3, int i37) {
                                                OutlinedTextFieldKt.OutlinedTextField(textFieldValue, function1, modifier3, z10, z12, textStyle3, function212, function214, function213, function215, function216, z11, visualTransformation3, keyboardOptions3, keyboardActions4, z9, i32, i33, mutableInteractionSource5, shape4, textFieldColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i34 |= CpioConstants.C_ISBLK;
                                i21 = i20;
                                i22 = i6 & 32768;
                                if (i22 == 0) {
                                }
                                if ((i4 & 1572864) == 0) {
                                }
                                i23 = i6 & 131072;
                                if (i23 == 0) {
                                }
                                i24 = i6 & 262144;
                                if (i24 == 0) {
                                }
                                if ((i4 & 805306368) == 0) {
                                }
                                if ((i5 & 6) != 0) {
                                }
                                if ((i7 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0) {
                                        if (i8 == 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if ((i6 & 32) == 0) {
                                        }
                                        if (i11 == 0) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        if (i13 == 0) {
                                        }
                                        if (i14 == 0) {
                                        }
                                        if (i15 == 0) {
                                        }
                                        if (i17 == 0) {
                                        }
                                        if (i18 == 0) {
                                        }
                                        if (i19 == 0) {
                                        }
                                        if (i21 == 0) {
                                        }
                                        if (i22 == 0) {
                                        }
                                        if ((i6 & 65536) == 0) {
                                        }
                                        if (i23 == 0) {
                                        }
                                        if (i24 == 0) {
                                        }
                                        if ((i6 & 524288) == 0) {
                                        }
                                        Function2 function2212 = function219;
                                        if ((i6 & 1048576) == 0) {
                                        }
                                        i28 = i7;
                                        i29 = i34;
                                        shape3 = shape2;
                                        z6 = z15;
                                        i30 = i26;
                                        z7 = z13;
                                        i31 = i35;
                                        function28 = function217;
                                        function29 = function2212;
                                        z8 = z14;
                                        keyboardActions2 = keyboardActions5;
                                        function210 = function27;
                                        keyboardOptions2 = keyboardOptions4;
                                        visualTransformation2 = none;
                                        function211 = function220;
                                        composerStartRestartGroup.endDefaults();
                                        composer2 = composerStartRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        int i362 = i29 << 6;
                                        OutlinedTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier2, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function211, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColorsColors, composer2, i28 & 2147483646, (i362 & 896) | 54 | (i362 & 7168) | (57344 & i362) | (458752 & i362) | (3670016 & i362) | (29360128 & i362) | (234881024 & i362) | (i362 & 1879048192), ((i29 >> 24) & 126) | ((i25 << 6) & 896), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        keyboardActions4 = keyboardActions3;
                                        visualTransformation3 = visualTransformation2;
                                        keyboardOptions3 = keyboardOptions2;
                                        z9 = z6;
                                        i32 = i30;
                                        i33 = i31;
                                        mutableInteractionSource5 = mutableInteractionSource4;
                                        shape4 = shape3;
                                        textFieldColors2 = textFieldColorsColors;
                                        function212 = function28;
                                        function213 = function210;
                                        modifier3 = modifier2;
                                        function214 = function26;
                                        function215 = function29;
                                        z10 = z5;
                                        z11 = z8;
                                        textStyle3 = textStyle2;
                                        function216 = function211;
                                        z12 = z7;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i20 = i6 & 16384;
                            if (i20 == 0) {
                            }
                            i22 = i6 & 32768;
                            if (i22 == 0) {
                            }
                            if ((i4 & 1572864) == 0) {
                            }
                            i23 = i6 & 131072;
                            if (i23 == 0) {
                            }
                            i24 = i6 & 262144;
                            if (i24 == 0) {
                            }
                            if ((i4 & 805306368) == 0) {
                            }
                            if ((i5 & 6) != 0) {
                            }
                            if ((i7 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i19 = i6 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i6 & 16384;
                        if (i20 == 0) {
                        }
                        i22 = i6 & 32768;
                        if (i22 == 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        i23 = i6 & 131072;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 262144;
                        if (i24 == 0) {
                        }
                        if ((i4 & 805306368) == 0) {
                        }
                        if ((i5 & 6) != 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    i11 = i6 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i6 & 2048;
                    if (i17 != 0) {
                    }
                    int i342 = i16;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i6 & 16384;
                    if (i20 == 0) {
                    }
                    i22 = i6 & 32768;
                    if (i22 == 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    i23 = i6 & 131072;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 262144;
                    if (i24 == 0) {
                    }
                    if ((i4 & 805306368) == 0) {
                    }
                    if ((i5 & 6) != 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i6 & 1024;
                if (i15 != 0) {
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                }
                int i3422 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                }
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i20 = i6 & 16384;
                if (i20 == 0) {
                }
                i22 = i6 & 32768;
                if (i22 == 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                i23 = i6 & 131072;
                if (i23 == 0) {
                }
                i24 = i6 & 262144;
                if (i24 == 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                if ((i5 & 6) != 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i34222 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i20 = i6 & 16384;
            if (i20 == 0) {
            }
            i22 = i6 & 32768;
            if (i22 == 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            i23 = i6 & 131072;
            if (i23 == 0) {
            }
            i24 = i6 & 262144;
            if (i24 == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            if ((i5 & 6) != 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i342222 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i20 = i6 & 16384;
        if (i20 == 0) {
        }
        i22 = i6 & 32768;
        if (i22 == 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        i23 = i6 & 131072;
        if (i23 == 0) {
        }
        i24 = i6 & 262144;
        if (i24 == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if ((i5 & 6) != 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(@NotNull final Modifier modifier, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, @Nullable final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable final Function2<? super Composer, ? super Integer, Unit> function23, @Nullable final Function2<? super Composer, ? super Integer, Unit> function24, @Nullable final Function2<? super Composer, ? super Integer, Unit> function25, @Nullable final Function2<? super Composer, ? super Integer, Unit> function26, final boolean z, final float f, @NotNull final Function1<? super Size, Unit> function1, @NotNull final Function2<? super Composer, ? super Integer, Unit> function27, @Nullable final Function2<? super Composer, ? super Integer, Unit> function28, @NotNull final PaddingValues paddingValues, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1408290209);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function27) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function28) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            paddingValues2 = paddingValues;
            i4 |= composerStartRestartGroup.changed(paddingValues2) ? 2048 : 1024;
        } else {
            paddingValues2 = paddingValues;
        }
        int i7 = i4;
        if ((i6 & 306783379) != 306783378 || (i7 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1408290209, i6, i7, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:521)");
            }
            composerStartRestartGroup.startReplaceableGroup(-2058767641);
            boolean z2 = ((234881024 & i6) == 67108864) | ((i7 & 14) == 4) | ((1879048192 & i6) == 536870912) | ((i7 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(function1, z, f, paddingValues2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
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
            Updater.m10877setimpl(composerM10870constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function27.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 14));
            composerStartRestartGroup.startReplaceableGroup(1116455313);
            if (function23 != null) {
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen);
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
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 12) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1116455598);
            if (function24 != null) {
                Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.INSTANCE, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierThen2);
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
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 15) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (function23 != null) {
                i5 = 0;
                fCalculateStartPadding = C2046Dp.m13666constructorimpl(RangesKt___RangesKt.coerceAtLeast(C2046Dp.m13666constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), C2046Dp.m13666constructorimpl(0)));
            } else {
                i5 = 0;
            }
            if (function24 != null) {
                fCalculateEndPadding = C2046Dp.m13666constructorimpl(RangesKt___RangesKt.coerceAtLeast(C2046Dp.m13666constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), C2046Dp.m13666constructorimpl(i5)));
            }
            composerStartRestartGroup.startReplaceableGroup(1116456488);
            if (function25 != null) {
                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m8160heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), fCalculateStartPadding, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                function25.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 18) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1116456887);
            if (function26 != null) {
                Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m8160heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, fCalculateEndPadding, 0.0f, 10, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor5 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion.getSetCompositeKeyHash();
                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                function26.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 21) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m8160heightInVpY3zN4$default(companion2, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (function25 != null) {
                fCalculateStartPadding = C2046Dp.m13666constructorimpl(0);
            }
            float f2 = fCalculateStartPadding;
            if (function26 != null) {
                fCalculateEndPadding = C2046Dp.m13666constructorimpl(0);
            }
            Modifier modifierM8127paddingqDBjuR0$default3 = PaddingKt.m8127paddingqDBjuR0$default(modifierWrapContentHeight$default, f2, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(1116457597);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(modifierM8127paddingqDBjuR0$default3), composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 112));
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, "TextField").then(modifierM8127paddingqDBjuR0$default3);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor6 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierThen3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy5, companion.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion.getSetCompositeKeyHash();
            if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1116458015);
            if (function22 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(SizeKt.m8160heightInVpY3zN4$default(companion2, DpKt.m13709lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f), 0.0f, 2, null), null, false, 3, null), "Label");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor7 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor7);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy6, companion.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion.getSetCompositeKeyHash();
                if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-2058764244);
            if (function28 != null) {
                Modifier modifierPadding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m8160heightInVpY3zN4$default(LayoutIdKt.layoutId(companion2, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m9990supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor8 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierPadding);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor8);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyRememberBoxMeasurePolicy7, companion.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion.getSetCompositeKeyHash();
                if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function28.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 6) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
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

                public final void invoke(@Nullable Composer composer2, int i8) {
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, function2, function3, function22, function23, function24, function25, function26, z, f, function1, function27, function28, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-DHJA7U0, reason: not valid java name */
    public static final int m9635calculateWidthDHJA7U0(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, float f2, PaddingValues paddingValues) {
        int i8 = i3 + i4;
        int iMax = i + Math.max(i5 + i8, Math.max(i7 + i8, MathHelpersKt.lerp(i6, 0, f))) + i2;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return Math.max(iMax, Math.max(MathKt__MathJVMKt.roundToInt((i6 + (C2046Dp.m13666constructorimpl(paddingValues.mo8074calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo8075calculateRightPaddingu2uoSUM(layoutDirection)) * f2)) * f), Constraints.m13624getMinWidthimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public static final int m9634calculateHeightmKXJcVc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, PaddingValues paddingValues) {
        int iMaxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(i5, i7, i3, i4, MathHelpersKt.lerp(i6, 0, f));
        float top = paddingValues.getTop() * f2;
        return Math.max(Constraints.m13623getMinHeightimpl(j), Math.max(i, Math.max(i2, MathKt__MathJVMKt.roundToInt(MathHelpersKt.lerp(top, Math.max(top, i6 / 2.0f), f) + iMaxOf + (paddingValues.getBottom() * f2)))) + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        Placeable.PlacementScope.m12661place70tqf50$default(placementScope, placeable8, IntOffset.INSTANCE.m13804getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i - TextFieldImplKt.heightOrZero(placeable9);
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(paddingValues.getTop() * f2);
        int iRoundToInt2 = MathKt__MathJVMKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, MathKt__MathJVMKt.roundToInt(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f)) + iRoundToInt2, MathHelpersKt.lerp(z ? Alignment.INSTANCE.getCenterVertically().align(placeable6.getHeight(), iHeightOrZero) : iRoundToInt, -(placeable6.getHeight() / 2), f), 0.0f, 4, null);
        }
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), place$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable6, placeable3), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (i2 - TextFieldImplKt.widthOrZero(placeable2)) - placeable4.getWidth(), place$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable6, placeable4), 0.0f, 4, null);
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable) + TextFieldImplKt.widthOrZero(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, iWidthOrZero, place$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable6, placeable5), 0.0f, 4, null);
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, iWidthOrZero, place$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable6, placeable7), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    private static final int place$calculateVerticalPosition(boolean z, int i, int i2, Placeable placeable, Placeable placeable2) {
        if (z) {
            i2 = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i);
        }
        return Math.max(i2, TextFieldImplKt.heightOrZero(placeable) / 2);
    }

    @NotNull
    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m9636outlineCutout12SF9DM(@NotNull Modifier modifier, final long j, @NotNull final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1

            /* compiled from: OutlinedTextField.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                float fCoerceAtLeast;
                float fM11168getWidthimpl = Size.m11168getWidthimpl(j);
                if (fM11168getWidthimpl > 0.0f) {
                    float fMo7874toPx0680j_4 = contentDrawScope.mo7874toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
                    float fMo7874toPx0680j_42 = contentDrawScope.mo7874toPx0680j_4(paddingValues.mo8074calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - fMo7874toPx0680j_4;
                    float f = 2;
                    float fM11168getWidthimpl2 = fM11168getWidthimpl + fMo7874toPx0680j_42 + (fMo7874toPx0680j_4 * f);
                    LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    if (iArr[layoutDirection.ordinal()] == 1) {
                        fCoerceAtLeast = Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc()) - fM11168getWidthimpl2;
                    } else {
                        fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(fMo7874toPx0680j_42, 0.0f);
                    }
                    float f2 = fCoerceAtLeast;
                    if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                        fM11168getWidthimpl2 = Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc()) - RangesKt___RangesKt.coerceAtLeast(fMo7874toPx0680j_42, 0.0f);
                    }
                    float f3 = fM11168getWidthimpl2;
                    float fM11165getHeightimpl = Size.m11165getHeightimpl(j);
                    float f4 = (-fM11165getHeightimpl) / f;
                    float f5 = fM11165getHeightimpl / f;
                    int iM11328getDifferencertfAjoo = ClipOp.INSTANCE.m11328getDifferencertfAjoo();
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    drawContext.getTransform().mo11817clipRectN_I0leg(f2, f4, f3, f5, iM11328getDifferencertfAjoo);
                    contentDrawScope.drawContent();
                    drawContext.getCanvas().restore();
                    drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
                    return;
                }
                contentDrawScope.drawContent();
            }
        });
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }
}
