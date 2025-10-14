package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.text.input.VisualTransformation;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextField.kt */
@Metadata(m7104d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aÖ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001a¨\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010-\u001aÖ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020.2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010/\u001a¨\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020.2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00100\u001aì\u0001\u00101\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0019\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0002\b\u00142\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u0010\"\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u00108\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\u0010;\u001ar\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020$2\u0006\u0010D\u001a\u00020$2\u0006\u00105\u001a\u0002062\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u0002062\u0006\u00109\u001a\u00020:H\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001aR\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020$2\u0006\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020$2\u0006\u0010P\u001a\u00020$2\u0006\u0010Q\u001a\u00020$2\u0006\u0010E\u001a\u00020FH\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a\u0014\u0010T\u001a\u00020\f*\u00020\f2\u0006\u0010U\u001a\u00020VH\u0000\u001a\u009a\u0001\u0010W\u001a\u00020\u0006*\u00020X2\u0006\u0010Y\u001a\u00020$2\u0006\u0010Z\u001a\u00020$2\u0006\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010^\u001a\u0004\u0018\u00010\\2\b\u0010_\u001a\u0004\u0018\u00010\\2\b\u0010`\u001a\u0004\u0018\u00010\\2\b\u0010a\u001a\u0004\u0018\u00010\\2\b\u0010b\u001a\u0004\u0018\u00010\\2\u0006\u0010c\u001a\u00020\\2\b\u0010d\u001a\u0004\u0018\u00010\\2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020$2\u0006\u0010f\u001a\u00020$2\u0006\u00105\u001a\u0002062\u0006\u0010G\u001a\u000206H\u0002\u001a\u0080\u0001\u0010g\u001a\u00020\u0006*\u00020X2\u0006\u0010Y\u001a\u00020$2\u0006\u0010Z\u001a\u00020$2\u0006\u0010h\u001a\u00020\\2\b\u0010^\u001a\u0004\u0018\u00010\\2\b\u0010_\u001a\u0004\u0018\u00010\\2\b\u0010`\u001a\u0004\u0018\u00010\\2\b\u0010a\u001a\u0004\u0018\u00010\\2\b\u0010b\u001a\u0004\u0018\u00010\\2\u0006\u0010c\u001a\u00020\\2\b\u0010d\u001a\u0004\u0018\u00010\\2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010G\u001a\u0002062\u0006\u00109\u001a\u00020:H\u0002\u001a\u0014\u0010i\u001a\u00020$*\u00020$2\u0006\u0010j\u001a\u00020$H\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006k"}, m7105d2 = {"TextFieldWithLabelVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "getTextFieldWithLabelVerticalPadding", "()F", "F", "TextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", TtmlNode.RUBY_CONTAINER, "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-yeHjK3Y", "(IIIIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "totalHeight", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "substractConstraintSafely", "from", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1164:1\n74#2:1165\n74#2:1174\n74#2:1183\n74#2:1190\n74#2:1203\n1116#3,6:1166\n1116#3,6:1175\n1116#3,6:1184\n1116#3,6:1191\n1116#3,6:1197\n658#4:1172\n646#4:1173\n658#4:1181\n646#4:1182\n78#5,11:1204\n78#5,11:1237\n91#5:1269\n78#5,11:1276\n91#5:1308\n78#5,11:1322\n91#5:1354\n78#5,11:1362\n91#5:1394\n78#5,11:1402\n91#5:1434\n78#5,11:1444\n91#5:1476\n78#5,11:1484\n91#5:1516\n91#5:1521\n456#6,8:1215\n464#6,3:1229\n456#6,8:1248\n464#6,3:1262\n467#6,3:1266\n456#6,8:1287\n464#6,3:1301\n467#6,3:1305\n456#6,8:1333\n464#6,3:1347\n467#6,3:1351\n456#6,8:1373\n464#6,3:1387\n467#6,3:1391\n456#6,8:1413\n464#6,3:1427\n467#6,3:1431\n456#6,8:1455\n464#6,3:1469\n467#6,3:1473\n456#6,8:1495\n464#6,3:1509\n467#6,3:1513\n467#6,3:1518\n3737#7,6:1223\n3737#7,6:1256\n3737#7,6:1295\n3737#7,6:1341\n3737#7,6:1381\n3737#7,6:1421\n3737#7,6:1463\n3737#7,6:1503\n69#8,5:1232\n74#8:1265\n78#8:1270\n69#8,5:1271\n74#8:1304\n78#8:1309\n68#8,6:1316\n74#8:1350\n78#8:1355\n68#8,6:1356\n74#8:1390\n78#8:1395\n68#8,6:1396\n74#8:1430\n78#8:1435\n68#8,6:1438\n74#8:1472\n78#8:1477\n68#8,6:1478\n74#8:1512\n78#8:1517\n58#9:1310\n58#9:1313\n51#9:1522\n92#9:1523\n154#10:1311\n211#10:1312\n154#10:1314\n211#10:1315\n154#10:1436\n154#10:1437\n154#10:1524\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n*L\n175#1:1165\n321#1:1174\n401#1:1183\n454#1:1190\n521#1:1203\n190#1:1166,6\n336#1:1175,6\n414#1:1184,6\n467#1:1191,6\n518#1:1197,6\n195#1:1172\n195#1:1173\n341#1:1181\n341#1:1182\n522#1:1204,11\n531#1:1237,11\n531#1:1269\n541#1:1276,11\n541#1:1308\n566#1:1322,11\n566#1:1354\n577#1:1362,11\n577#1:1394\n589#1:1402,11\n589#1:1434\n611#1:1444,11\n611#1:1476\n622#1:1484,11\n622#1:1516\n522#1:1521\n522#1:1215,8\n522#1:1229,3\n531#1:1248,8\n531#1:1262,3\n531#1:1266,3\n541#1:1287,8\n541#1:1301,3\n541#1:1305,3\n566#1:1333,8\n566#1:1347,3\n566#1:1351,3\n577#1:1373,8\n577#1:1387,3\n577#1:1391,3\n589#1:1413,8\n589#1:1427,3\n589#1:1431,3\n611#1:1455,8\n611#1:1469,3\n611#1:1473,3\n622#1:1495,8\n622#1:1509,3\n622#1:1513,3\n522#1:1518,3\n522#1:1223,6\n531#1:1256,6\n541#1:1295,6\n566#1:1341,6\n577#1:1381,6\n589#1:1421,6\n611#1:1463,6\n622#1:1503,6\n531#1:1232,5\n531#1:1265\n531#1:1270\n541#1:1271,5\n541#1:1304\n541#1:1309\n566#1:1316,6\n566#1:1350\n566#1:1355\n577#1:1356,6\n577#1:1390\n577#1:1395\n589#1:1396,6\n589#1:1430\n589#1:1435\n611#1:1438,6\n611#1:1472\n611#1:1477\n622#1:1478,6\n622#1:1512\n622#1:1517\n555#1:1310\n560#1:1313\n978#1:1522\n982#1:1523\n555#1:1311\n555#1:1312\n560#1:1314\n560#1:1315\n602#1:1436\n603#1:1437\n1163#1:1524\n*E\n"})
/* loaded from: classes2.dex */
public final class TextFieldKt {
    private static final float TextFieldWithLabelVerticalPadding = C2046Dp.m13666constructorimpl(8);

    /* compiled from: TextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldKt$TextField$10 */
    public static final class C166610 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ KeyboardActions $keyboardActions;
        public final /* synthetic */ KeyboardOptions $keyboardOptions;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ int $minLines;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        public final /* synthetic */ TextStyle $textStyle;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C166610(Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6) {
            super(2);
            function1 = function1;
            modifier = modifier;
            z = z;
            z = z2;
            textStyle = textStyle;
            function2 = function2;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            z = z3;
            visualTransformation = visualTransformation;
            keyboardOptions = keyboardOptions;
            keyboardActions = keyboardActions;
            z = z4;
            i = i;
            i = i2;
            mutableInteractionSource = mutableInteractionSource;
            shape = shape;
            textFieldColors = textFieldColors;
            i = i3;
            i = i4;
            i = i5;
            i = i6;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TextFieldKt.TextField(textFieldValue, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldKt$TextField$3 */
    public static final class C16683 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ KeyboardActions $keyboardActions;
        public final /* synthetic */ KeyboardOptions $keyboardOptions;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ int $minLines;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<String, Unit> $onValueChange;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        public final /* synthetic */ TextStyle $textStyle;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16683(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6) {
            super(2);
            str = str;
            function1 = function1;
            modifier = modifier;
            z = z;
            z = z2;
            textStyle = textStyle;
            function2 = function2;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            function2 = function27;
            z = z3;
            visualTransformation = visualTransformation;
            keyboardOptions = keyboardOptions;
            keyboardActions = keyboardActions;
            z = z4;
            i = i;
            i = i2;
            mutableInteractionSource = mutableInteractionSource;
            shape = shape;
            textFieldColors = textFieldColors;
            i = i3;
            i = i4;
            i = i5;
            i = i6;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TextFieldKt.TextField(str, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldKt$TextField$6 */
    public static final class C16706 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ KeyboardActions $keyboardActions;
        public final /* synthetic */ KeyboardOptions $keyboardOptions;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ int $minLines;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        public final /* synthetic */ TextStyle $textStyle;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16706(Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6) {
            super(2);
            function1 = function1;
            modifier = modifier;
            z = z;
            z = z2;
            textStyle = textStyle;
            function2 = function2;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            function2 = function27;
            z = z3;
            visualTransformation = visualTransformation;
            keyboardOptions = keyboardOptions;
            keyboardActions = keyboardActions;
            z = z4;
            i = i;
            i = i2;
            mutableInteractionSource = mutableInteractionSource;
            shape = shape;
            textFieldColors = textFieldColors;
            i = i3;
            i = i4;
            i = i5;
            i = i6;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TextFieldKt.TextField(textFieldValue, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldKt$TextField$8 */
    public static final class C16718 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ KeyboardActions $keyboardActions;
        public final /* synthetic */ KeyboardOptions $keyboardOptions;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ int $minLines;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<String, Unit> $onValueChange;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        public final /* synthetic */ TextStyle $textStyle;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16718(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6) {
            super(2);
            str = str;
            function1 = function1;
            modifier = modifier;
            z = z;
            z = z2;
            textStyle = textStyle;
            function2 = function2;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            z = z3;
            visualTransformation = visualTransformation;
            keyboardOptions = keyboardOptions;
            keyboardActions = keyboardActions;
            z = z4;
            i = i;
            i = i2;
            mutableInteractionSource = mutableInteractionSource;
            shape = shape;
            textFieldColors = textFieldColors;
            i = i3;
            i = i4;
            i = i5;
            i = i6;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TextFieldKt.TextField(str, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldKt$TextFieldLayout$2 */
    public static final class C16722 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ float $animationProgress;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
        public final /* synthetic */ PaddingValues $paddingValues;
        public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supporting;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $textField;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16722(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, boolean z, float f, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, PaddingValues paddingValues, int i, int i2) {
            super(2);
            function2 = function2;
            function2 = function22;
            function3 = function3;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            z = z;
            f = f;
            function2 = function27;
            function2 = function28;
            paddingValues = paddingValues;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TextFieldKt.TextFieldLayout(modifier, function2, function2, function3, function2, function2, function2, function2, z, f, function2, function2, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i));
        }
    }

    public static final int substractConstraintSafely(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : i - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:390:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:727:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(@NotNull String str, @NotNull Function1<? super String, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable TextStyle textStyle, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, @Nullable Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, @Nullable VisualTransformation visualTransformation, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, boolean z4, int i, int i2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, @Nullable TextFieldColors textFieldColors, @Nullable Composer composer, int i3, int i4, int i5, int i6) {
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
        Function2<? super Composer, ? super Integer, Unit> function218;
        VisualTransformation visualTransformation3;
        TextFieldColors textFieldColors2;
        TextStyle textStyle3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        boolean z9;
        int i36;
        int i37;
        MutableInteractionSource mutableInteractionSource5;
        Shape shape4;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        boolean z10;
        boolean z11;
        Function2<? super Composer, ? super Integer, Unit> function221;
        boolean z12;
        Function2<? super Composer, ? super Integer, Unit> function222;
        Function2<? super Composer, ? super Integer, Unit> function223;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function224;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-676242365);
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
                                                composerStartRestartGroup.startReplaceableGroup(-1263331754);
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
                                                shape2 = TextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
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
                                                textFieldColorsColors = TextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, i30);
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
                                            ComposerKt.traceEventStart(-676242365, i31, i32, "androidx.compose.material3.TextField (TextField.kt:192)");
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(-1263331489);
                                        jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                                        if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                            jM13195getColor0d7_KjU = textFieldColorsColors.textColor$material3_release(z5, z8, mutableInteractionSource4, composerStartRestartGroup, ((i31 >> 9) & 14) | ((i32 >> 6) & 112) | ((i35 << 6) & 896) | ((i35 << 3) & 7168)).getValue().m11350unboximpl();
                                        }
                                        long j = jM13195getColor0d7_KjU;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        TextFieldColors textFieldColors3 = textFieldColorsColors;
                                        boolean z16 = z6;
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getSelectionColors(composerStartRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.2
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;
                                            public final /* synthetic */ KeyboardActions $keyboardActions;
                                            public final /* synthetic */ KeyboardOptions $keyboardOptions;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                            public final /* synthetic */ int $maxLines;
                                            public final /* synthetic */ TextStyle $mergedTextStyle;
                                            public final /* synthetic */ int $minLines;
                                            public final /* synthetic */ Function1<String, Unit> $onValueChange;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                            public final /* synthetic */ boolean $readOnly;
                                            public final /* synthetic */ Shape $shape;
                                            public final /* synthetic */ boolean $singleLine;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                            public final /* synthetic */ String $value;
                                            public final /* synthetic */ VisualTransformation $visualTransformation;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            public C16672(boolean z82, TextFieldColors textFieldColors32, String str2, Function1<? super String, Unit> function12, boolean z52, boolean z62, TextStyle textStyle4, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z72, int i332, int i342, VisualTransformation visualTransformation22, MutableInteractionSource mutableInteractionSource42, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function282, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2162, Function2<? super Composer, ? super Integer, Unit> function2172, Shape shape32) {
                                                super(2);
                                                z = z82;
                                                textFieldColors = textFieldColors32;
                                                str = str2;
                                                function1 = function12;
                                                z = z52;
                                                z = z62;
                                                textStyle = textStyle4;
                                                keyboardOptions = keyboardOptions22;
                                                keyboardActions = keyboardActions22;
                                                z = z72;
                                                i = i332;
                                                i = i342;
                                                visualTransformation = visualTransformation22;
                                                mutableInteractionSource = mutableInteractionSource42;
                                                function2 = function2102;
                                                function2 = function282;
                                                function2 = function2142;
                                                function2 = function2112;
                                                function2 = function2132;
                                                function2 = function2162;
                                                function2 = function2172;
                                                shape = shape32;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer2, int i40) {
                                                if ((i40 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1859145987, i40, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:200)");
                                                    }
                                                    Modifier modifier4 = modifier;
                                                    boolean z17 = z;
                                                    Strings.Companion companion = Strings.INSTANCE;
                                                    Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifier4, z17, Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.default_error_message), composer2, 0));
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, textFieldDefaults.m10000getMinWidthD9Ej5fM(), textFieldDefaults.m9999getMinHeightD9Ej5fM());
                                                    SolidColor solidColor = new SolidColor(textFieldColors.cursorColor$material3_release(z, composer2, 0).getValue().m11350unboximpl(), null);
                                                    String str2 = str;
                                                    Function1<String, Unit> function12 = function1;
                                                    boolean z18 = z;
                                                    boolean z19 = z;
                                                    TextStyle textStyle4 = textStyle;
                                                    KeyboardOptions keyboardOptions5 = keyboardOptions;
                                                    KeyboardActions keyboardActions5 = keyboardActions;
                                                    boolean z20 = z;
                                                    int i41 = i;
                                                    int i42 = i;
                                                    VisualTransformation visualTransformation4 = visualTransformation;
                                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource;
                                                    BasicTextFieldKt.BasicTextField(str2, function12, modifierM8156defaultMinSizeVpY3zN4, z18, z19, textStyle4, keyboardOptions5, keyboardActions5, z20, i41, i42, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor, ComposableLambdaKt.composableLambda(composer2, -288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.2.1
                                                        public final /* synthetic */ TextFieldColors $colors;
                                                        public final /* synthetic */ boolean $enabled;
                                                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                                                        public final /* synthetic */ boolean $isError;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                                        public final /* synthetic */ Shape $shape;
                                                        public final /* synthetic */ boolean $singleLine;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                                        public final /* synthetic */ String $value;
                                                        public final /* synthetic */ VisualTransformation $visualTransformation;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        public AnonymousClass1(String str22, boolean z182, boolean z202, VisualTransformation visualTransformation42, MutableInteractionSource mutableInteractionSource62, boolean z21, Function2<? super Composer, ? super Integer, Unit> function232, Function2<? super Composer, ? super Integer, Unit> function233, Function2<? super Composer, ? super Integer, Unit> function234, Function2<? super Composer, ? super Integer, Unit> function235, Function2<? super Composer, ? super Integer, Unit> function236, Function2<? super Composer, ? super Integer, Unit> function237, Function2<? super Composer, ? super Integer, Unit> function238, Shape shape6, TextFieldColors textFieldColors4) {
                                                            super(3);
                                                            str = str22;
                                                            z = z182;
                                                            z = z202;
                                                            visualTransformation = visualTransformation42;
                                                            mutableInteractionSource = mutableInteractionSource62;
                                                            z = z21;
                                                            function2 = function232;
                                                            function2 = function233;
                                                            function2 = function234;
                                                            function2 = function235;
                                                            function2 = function236;
                                                            function2 = function237;
                                                            function2 = function238;
                                                            shape = shape6;
                                                            textFieldColors = textFieldColors4;
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function232, Composer composer3, Integer num) {
                                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function232, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @Composable
                                                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function232, @Nullable Composer composer3, int i43) {
                                                            int i44;
                                                            if ((i43 & 6) == 0) {
                                                                i44 = i43 | (composer3.changedInstance(function232) ? 4 : 2);
                                                            } else {
                                                                i44 = i43;
                                                            }
                                                            if ((i44 & 19) != 18 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-288211827, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                                                                }
                                                                TextFieldDefaults.INSTANCE.DecorationBox(str, function232, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i44 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.f342xf2722a21);
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

                                            /* compiled from: TextField.kt */
                                            @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                            /* renamed from: androidx.compose.material3.TextFieldKt$TextField$2$1 */
                                            public static final class AnonymousClass1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
                                                public final /* synthetic */ TextFieldColors $colors;
                                                public final /* synthetic */ boolean $enabled;
                                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                                public final /* synthetic */ boolean $isError;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                                public final /* synthetic */ Shape $shape;
                                                public final /* synthetic */ boolean $singleLine;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                                public final /* synthetic */ String $value;
                                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                public AnonymousClass1(String str22, boolean z182, boolean z202, VisualTransformation visualTransformation42, MutableInteractionSource mutableInteractionSource62, boolean z21, Function2<? super Composer, ? super Integer, Unit> function232, Function2<? super Composer, ? super Integer, Unit> function233, Function2<? super Composer, ? super Integer, Unit> function234, Function2<? super Composer, ? super Integer, Unit> function235, Function2<? super Composer, ? super Integer, Unit> function236, Function2<? super Composer, ? super Integer, Unit> function237, Function2<? super Composer, ? super Integer, Unit> function238, Shape shape6, TextFieldColors textFieldColors4) {
                                                    super(3);
                                                    str = str22;
                                                    z = z182;
                                                    z = z202;
                                                    visualTransformation = visualTransformation42;
                                                    mutableInteractionSource = mutableInteractionSource62;
                                                    z = z21;
                                                    function2 = function232;
                                                    function2 = function233;
                                                    function2 = function234;
                                                    function2 = function235;
                                                    function2 = function236;
                                                    function2 = function237;
                                                    function2 = function238;
                                                    shape = shape6;
                                                    textFieldColors = textFieldColors4;
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function232, Composer composer3, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function232, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @Composable
                                                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function232, @Nullable Composer composer3, int i43) {
                                                    int i44;
                                                    if ((i43 & 6) == 0) {
                                                        i44 = i43 | (composer3.changedInstance(function232) ? 4 : 2);
                                                    } else {
                                                        i44 = i43;
                                                    }
                                                    if ((i44 & 19) != 18 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-288211827, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.DecorationBox(str, function232, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i44 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.f342xf2722a21);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }
                                        }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function218 = function2102;
                                        visualTransformation3 = visualTransformation22;
                                        textFieldColors2 = textFieldColors32;
                                        textStyle3 = textStyle2;
                                        keyboardOptions3 = keyboardOptions22;
                                        keyboardActions3 = keyboardActions22;
                                        z9 = z72;
                                        i36 = i332;
                                        i37 = i342;
                                        mutableInteractionSource5 = mutableInteractionSource42;
                                        shape4 = shape32;
                                        function219 = function2162;
                                        function220 = function2132;
                                        z10 = z82;
                                        z11 = z16;
                                        function221 = function2112;
                                        z12 = z52;
                                        function222 = function2172;
                                        Function2<? super Composer, ? super Integer, Unit> function232 = function282;
                                        function223 = function2142;
                                        modifier3 = modifier2;
                                        function224 = function232;
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
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.3
                                            public final /* synthetic */ int $$changed;
                                            public final /* synthetic */ int $$changed1;
                                            public final /* synthetic */ int $$changed2;
                                            public final /* synthetic */ int $$default;
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;
                                            public final /* synthetic */ KeyboardActions $keyboardActions;
                                            public final /* synthetic */ KeyboardOptions $keyboardOptions;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                            public final /* synthetic */ int $maxLines;
                                            public final /* synthetic */ int $minLines;
                                            public final /* synthetic */ Modifier $modifier;
                                            public final /* synthetic */ Function1<String, Unit> $onValueChange;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                            public final /* synthetic */ boolean $readOnly;
                                            public final /* synthetic */ Shape $shape;
                                            public final /* synthetic */ boolean $singleLine;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                            public final /* synthetic */ TextStyle $textStyle;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                            public final /* synthetic */ String $value;
                                            public final /* synthetic */ VisualTransformation $visualTransformation;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            public C16683(String str2, Function1<? super String, Unit> function12, Modifier modifier32, boolean z122, boolean z112, TextStyle textStyle32, Function2<? super Composer, ? super Integer, Unit> function2182, Function2<? super Composer, ? super Integer, Unit> function2242, Function2<? super Composer, ? super Integer, Unit> function2232, Function2<? super Composer, ? super Integer, Unit> function2212, Function2<? super Composer, ? super Integer, Unit> function2202, Function2<? super Composer, ? super Integer, Unit> function2192, Function2<? super Composer, ? super Integer, Unit> function2222, boolean z102, VisualTransformation visualTransformation32, KeyboardOptions keyboardOptions32, KeyboardActions keyboardActions32, boolean z92, int i362, int i372, MutableInteractionSource mutableInteractionSource52, Shape shape42, TextFieldColors textFieldColors22, int i310, int i42, int i52, int i62) {
                                                super(2);
                                                str = str2;
                                                function1 = function12;
                                                modifier = modifier32;
                                                z = z122;
                                                z = z112;
                                                textStyle = textStyle32;
                                                function2 = function2182;
                                                function2 = function2242;
                                                function2 = function2232;
                                                function2 = function2212;
                                                function2 = function2202;
                                                function2 = function2192;
                                                function2 = function2222;
                                                z = z102;
                                                visualTransformation = visualTransformation32;
                                                keyboardOptions = keyboardOptions32;
                                                keyboardActions = keyboardActions32;
                                                z = z92;
                                                i = i362;
                                                i = i372;
                                                mutableInteractionSource = mutableInteractionSource52;
                                                shape = shape42;
                                                textFieldColors = textFieldColors22;
                                                i = i310;
                                                i = i42;
                                                i = i52;
                                                i = i62;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@Nullable Composer composer2, int i40) {
                                                TextFieldKt.TextField(str, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i38 |= CpioConstants.C_ISBLK;
                                i21 = i20;
                                i22 = i62 & 32768;
                                if (i22 == 0) {
                                }
                                i23 = i62 & 65536;
                                if (i23 == 0) {
                                }
                                i24 = i62 & 131072;
                                if (i24 == 0) {
                                }
                                if ((i42 & 100663296) == 0) {
                                }
                                i25 = i62 & 524288;
                                if (i25 == 0) {
                                }
                                i26 = i62 & 1048576;
                                if (i26 == 0) {
                                }
                                if ((i52 & 48) == 0) {
                                }
                                if ((i52 & 384) == 0) {
                                }
                                i28 = i27;
                                if ((i7 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i310 & 1) != 0) {
                                        if (i8 == 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if ((i62 & 32) == 0) {
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
                                        if ((i62 & 262144) == 0) {
                                        }
                                        if (i25 == 0) {
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function2312 = function226;
                                        if (i26 == 0) {
                                        }
                                        if ((2097152 & i62) == 0) {
                                        }
                                        Shape shape52 = shape2;
                                        if ((i62 & 4194304) == 0) {
                                        }
                                        i31 = i7;
                                        i32 = i38;
                                        z62 = z13;
                                        keyboardOptions22 = keyboardOptions4;
                                        keyboardActions22 = keyboardActions4;
                                        z72 = z15;
                                        i332 = i29;
                                        function2102 = function225;
                                        i342 = i39;
                                        function2112 = function29;
                                        function212 = function229;
                                        i35 = i28;
                                        function2132 = function228;
                                        visualTransformation22 = none;
                                        function2142 = function2312;
                                        z82 = z14;
                                        function215 = function230;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(-1263331489);
                                        jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                                        if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                        }
                                        long j2 = jM13195getColor0d7_KjU;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        TextFieldColors textFieldColors32 = textFieldColorsColors;
                                        boolean z162 = z62;
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors32.getSelectionColors(composerStartRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.2
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;
                                            public final /* synthetic */ KeyboardActions $keyboardActions;
                                            public final /* synthetic */ KeyboardOptions $keyboardOptions;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                            public final /* synthetic */ int $maxLines;
                                            public final /* synthetic */ TextStyle $mergedTextStyle;
                                            public final /* synthetic */ int $minLines;
                                            public final /* synthetic */ Function1<String, Unit> $onValueChange;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                            public final /* synthetic */ boolean $readOnly;
                                            public final /* synthetic */ Shape $shape;
                                            public final /* synthetic */ boolean $singleLine;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                            public final /* synthetic */ String $value;
                                            public final /* synthetic */ VisualTransformation $visualTransformation;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            public C16672(boolean z82, TextFieldColors textFieldColors322, String str2, Function1<? super String, Unit> function12, boolean z52, boolean z62, TextStyle textStyle4, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z72, int i332, int i342, VisualTransformation visualTransformation22, MutableInteractionSource mutableInteractionSource42, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function282, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2162, Function2<? super Composer, ? super Integer, Unit> function2172, Shape shape32) {
                                                super(2);
                                                z = z82;
                                                textFieldColors = textFieldColors322;
                                                str = str2;
                                                function1 = function12;
                                                z = z52;
                                                z = z62;
                                                textStyle = textStyle4;
                                                keyboardOptions = keyboardOptions22;
                                                keyboardActions = keyboardActions22;
                                                z = z72;
                                                i = i332;
                                                i = i342;
                                                visualTransformation = visualTransformation22;
                                                mutableInteractionSource = mutableInteractionSource42;
                                                function2 = function2102;
                                                function2 = function282;
                                                function2 = function2142;
                                                function2 = function2112;
                                                function2 = function2132;
                                                function2 = function2162;
                                                function2 = function2172;
                                                shape = shape32;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer2, int i40) {
                                                if ((i40 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1859145987, i40, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:200)");
                                                    }
                                                    Modifier modifier4 = modifier;
                                                    boolean z17 = z;
                                                    Strings.Companion companion = Strings.INSTANCE;
                                                    Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifier4, z17, Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.default_error_message), composer2, 0));
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, textFieldDefaults.m10000getMinWidthD9Ej5fM(), textFieldDefaults.m9999getMinHeightD9Ej5fM());
                                                    SolidColor solidColor = new SolidColor(textFieldColors.cursorColor$material3_release(z, composer2, 0).getValue().m11350unboximpl(), null);
                                                    String str22 = str;
                                                    Function1<String, Unit> function12 = function1;
                                                    boolean z182 = z;
                                                    boolean z19 = z;
                                                    TextStyle textStyle4 = textStyle;
                                                    KeyboardOptions keyboardOptions5 = keyboardOptions;
                                                    KeyboardActions keyboardActions5 = keyboardActions;
                                                    boolean z202 = z;
                                                    int i41 = i;
                                                    int i42 = i;
                                                    VisualTransformation visualTransformation42 = visualTransformation;
                                                    MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource;
                                                    BasicTextFieldKt.BasicTextField(str22, function12, modifierM8156defaultMinSizeVpY3zN4, z182, z19, textStyle4, keyboardOptions5, keyboardActions5, z202, i41, i42, visualTransformation42, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource62, solidColor, ComposableLambdaKt.composableLambda(composer2, -288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.2.1
                                                        public final /* synthetic */ TextFieldColors $colors;
                                                        public final /* synthetic */ boolean $enabled;
                                                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                                                        public final /* synthetic */ boolean $isError;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                                        public final /* synthetic */ Shape $shape;
                                                        public final /* synthetic */ boolean $singleLine;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                                        public final /* synthetic */ String $value;
                                                        public final /* synthetic */ VisualTransformation $visualTransformation;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        public AnonymousClass1(String str222, boolean z1822, boolean z2022, VisualTransformation visualTransformation422, MutableInteractionSource mutableInteractionSource622, boolean z21, Function2<? super Composer, ? super Integer, Unit> function2322, Function2<? super Composer, ? super Integer, Unit> function233, Function2<? super Composer, ? super Integer, Unit> function234, Function2<? super Composer, ? super Integer, Unit> function235, Function2<? super Composer, ? super Integer, Unit> function236, Function2<? super Composer, ? super Integer, Unit> function237, Function2<? super Composer, ? super Integer, Unit> function238, Shape shape6, TextFieldColors textFieldColors4) {
                                                            super(3);
                                                            str = str222;
                                                            z = z1822;
                                                            z = z2022;
                                                            visualTransformation = visualTransformation422;
                                                            mutableInteractionSource = mutableInteractionSource622;
                                                            z = z21;
                                                            function2 = function2322;
                                                            function2 = function233;
                                                            function2 = function234;
                                                            function2 = function235;
                                                            function2 = function236;
                                                            function2 = function237;
                                                            function2 = function238;
                                                            shape = shape6;
                                                            textFieldColors = textFieldColors4;
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2322, Composer composer3, Integer num) {
                                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2322, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @Composable
                                                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2322, @Nullable Composer composer3, int i43) {
                                                            int i44;
                                                            if ((i43 & 6) == 0) {
                                                                i44 = i43 | (composer3.changedInstance(function2322) ? 4 : 2);
                                                            } else {
                                                                i44 = i43;
                                                            }
                                                            if ((i44 & 19) != 18 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-288211827, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                                                                }
                                                                TextFieldDefaults.INSTANCE.DecorationBox(str, function2322, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i44 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.f342xf2722a21);
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

                                            /* compiled from: TextField.kt */
                                            @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                            /* renamed from: androidx.compose.material3.TextFieldKt$TextField$2$1 */
                                            public static final class AnonymousClass1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
                                                public final /* synthetic */ TextFieldColors $colors;
                                                public final /* synthetic */ boolean $enabled;
                                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                                public final /* synthetic */ boolean $isError;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                                public final /* synthetic */ Shape $shape;
                                                public final /* synthetic */ boolean $singleLine;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                                public final /* synthetic */ String $value;
                                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                public AnonymousClass1(String str222, boolean z1822, boolean z2022, VisualTransformation visualTransformation422, MutableInteractionSource mutableInteractionSource622, boolean z21, Function2<? super Composer, ? super Integer, Unit> function2322, Function2<? super Composer, ? super Integer, Unit> function233, Function2<? super Composer, ? super Integer, Unit> function234, Function2<? super Composer, ? super Integer, Unit> function235, Function2<? super Composer, ? super Integer, Unit> function236, Function2<? super Composer, ? super Integer, Unit> function237, Function2<? super Composer, ? super Integer, Unit> function238, Shape shape6, TextFieldColors textFieldColors4) {
                                                    super(3);
                                                    str = str222;
                                                    z = z1822;
                                                    z = z2022;
                                                    visualTransformation = visualTransformation422;
                                                    mutableInteractionSource = mutableInteractionSource622;
                                                    z = z21;
                                                    function2 = function2322;
                                                    function2 = function233;
                                                    function2 = function234;
                                                    function2 = function235;
                                                    function2 = function236;
                                                    function2 = function237;
                                                    function2 = function238;
                                                    shape = shape6;
                                                    textFieldColors = textFieldColors4;
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2322, Composer composer3, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function2322, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @Composable
                                                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2322, @Nullable Composer composer3, int i43) {
                                                    int i44;
                                                    if ((i43 & 6) == 0) {
                                                        i44 = i43 | (composer3.changedInstance(function2322) ? 4 : 2);
                                                    } else {
                                                        i44 = i43;
                                                    }
                                                    if ((i44 & 19) != 18 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-288211827, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.DecorationBox(str, function2322, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i44 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.f342xf2722a21);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }
                                        }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        function2182 = function2102;
                                        visualTransformation32 = visualTransformation22;
                                        textFieldColors22 = textFieldColors322;
                                        textStyle32 = textStyle2;
                                        keyboardOptions32 = keyboardOptions22;
                                        keyboardActions32 = keyboardActions22;
                                        z92 = z72;
                                        i362 = i332;
                                        i372 = i342;
                                        mutableInteractionSource52 = mutableInteractionSource42;
                                        shape42 = shape32;
                                        function2192 = function2162;
                                        function2202 = function2132;
                                        z102 = z82;
                                        z112 = z162;
                                        function2212 = function2112;
                                        z122 = z52;
                                        function2222 = function2172;
                                        Function2<? super Composer, ? super Integer, Unit> function2322 = function282;
                                        function2232 = function2142;
                                        modifier32 = modifier2;
                                        function2242 = function2322;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i20 = i62 & 16384;
                            if (i20 == 0) {
                            }
                            i22 = i62 & 32768;
                            if (i22 == 0) {
                            }
                            i23 = i62 & 65536;
                            if (i23 == 0) {
                            }
                            i24 = i62 & 131072;
                            if (i24 == 0) {
                            }
                            if ((i42 & 100663296) == 0) {
                            }
                            i25 = i62 & 524288;
                            if (i25 == 0) {
                            }
                            i26 = i62 & 1048576;
                            if (i26 == 0) {
                            }
                            if ((i52 & 48) == 0) {
                            }
                            if ((i52 & 384) == 0) {
                            }
                            i28 = i27;
                            if ((i7 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i19 = i62 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i62 & 16384;
                        if (i20 == 0) {
                        }
                        i22 = i62 & 32768;
                        if (i22 == 0) {
                        }
                        i23 = i62 & 65536;
                        if (i23 == 0) {
                        }
                        i24 = i62 & 131072;
                        if (i24 == 0) {
                        }
                        if ((i42 & 100663296) == 0) {
                        }
                        i25 = i62 & 524288;
                        if (i25 == 0) {
                        }
                        i26 = i62 & 1048576;
                        if (i26 == 0) {
                        }
                        if ((i52 & 48) == 0) {
                        }
                        if ((i52 & 384) == 0) {
                        }
                        i28 = i27;
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i310 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    i11 = i62 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i62 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i62 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i62 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i62 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i62 & 2048;
                    if (i17 != 0) {
                    }
                    int i382 = i16;
                    i18 = i62 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i62 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i62 & 16384;
                    if (i20 == 0) {
                    }
                    i22 = i62 & 32768;
                    if (i22 == 0) {
                    }
                    i23 = i62 & 65536;
                    if (i23 == 0) {
                    }
                    i24 = i62 & 131072;
                    if (i24 == 0) {
                    }
                    if ((i42 & 100663296) == 0) {
                    }
                    i25 = i62 & 524288;
                    if (i25 == 0) {
                    }
                    i26 = i62 & 1048576;
                    if (i26 == 0) {
                    }
                    if ((i52 & 48) == 0) {
                    }
                    if ((i52 & 384) == 0) {
                    }
                    i28 = i27;
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i10 = i62 & 16;
                if (i10 == 0) {
                }
                if ((i310 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                i11 = i62 & 64;
                if (i11 != 0) {
                }
                i12 = i62 & 128;
                if (i12 != 0) {
                }
                i13 = i62 & 256;
                if (i13 != 0) {
                }
                i14 = i62 & 512;
                if (i14 != 0) {
                }
                i15 = i62 & 1024;
                if (i15 != 0) {
                }
                i17 = i62 & 2048;
                if (i17 != 0) {
                }
                int i3822 = i16;
                i18 = i62 & 4096;
                if (i18 != 0) {
                }
                i19 = i62 & 8192;
                if (i19 == 0) {
                }
                i20 = i62 & 16384;
                if (i20 == 0) {
                }
                i22 = i62 & 32768;
                if (i22 == 0) {
                }
                i23 = i62 & 65536;
                if (i23 == 0) {
                }
                i24 = i62 & 131072;
                if (i24 == 0) {
                }
                if ((i42 & 100663296) == 0) {
                }
                i25 = i62 & 524288;
                if (i25 == 0) {
                }
                i26 = i62 & 1048576;
                if (i26 == 0) {
                }
                if ((i52 & 48) == 0) {
                }
                if ((i52 & 384) == 0) {
                }
                i28 = i27;
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i9 = i62 & 8;
            if (i9 != 0) {
            }
            i10 = i62 & 16;
            if (i10 == 0) {
            }
            if ((i310 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            i11 = i62 & 64;
            if (i11 != 0) {
            }
            i12 = i62 & 128;
            if (i12 != 0) {
            }
            i13 = i62 & 256;
            if (i13 != 0) {
            }
            i14 = i62 & 512;
            if (i14 != 0) {
            }
            i15 = i62 & 1024;
            if (i15 != 0) {
            }
            i17 = i62 & 2048;
            if (i17 != 0) {
            }
            int i38222 = i16;
            i18 = i62 & 4096;
            if (i18 != 0) {
            }
            i19 = i62 & 8192;
            if (i19 == 0) {
            }
            i20 = i62 & 16384;
            if (i20 == 0) {
            }
            i22 = i62 & 32768;
            if (i22 == 0) {
            }
            i23 = i62 & 65536;
            if (i23 == 0) {
            }
            i24 = i62 & 131072;
            if (i24 == 0) {
            }
            if ((i42 & 100663296) == 0) {
            }
            i25 = i62 & 524288;
            if (i25 == 0) {
            }
            i26 = i62 & 1048576;
            if (i26 == 0) {
            }
            if ((i52 & 48) == 0) {
            }
            if ((i52 & 384) == 0) {
            }
            i28 = i27;
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i62 & 4;
        if (i8 == 0) {
        }
        i9 = i62 & 8;
        if (i9 != 0) {
        }
        i10 = i62 & 16;
        if (i10 == 0) {
        }
        if ((i310 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        i11 = i62 & 64;
        if (i11 != 0) {
        }
        i12 = i62 & 128;
        if (i12 != 0) {
        }
        i13 = i62 & 256;
        if (i13 != 0) {
        }
        i14 = i62 & 512;
        if (i14 != 0) {
        }
        i15 = i62 & 1024;
        if (i15 != 0) {
        }
        i17 = i62 & 2048;
        if (i17 != 0) {
        }
        int i382222 = i16;
        i18 = i62 & 4096;
        if (i18 != 0) {
        }
        i19 = i62 & 8192;
        if (i19 == 0) {
        }
        i20 = i62 & 16384;
        if (i20 == 0) {
        }
        i22 = i62 & 32768;
        if (i22 == 0) {
        }
        i23 = i62 & 65536;
        if (i23 == 0) {
        }
        i24 = i62 & 131072;
        if (i24 == 0) {
        }
        if ((i42 & 100663296) == 0) {
        }
        i25 = i62 & 524288;
        if (i25 == 0) {
        }
        i26 = i62 & 1048576;
        if (i26 == 0) {
        }
        if ((i52 & 48) == 0) {
        }
        if ((i52 & 384) == 0) {
        }
        i28 = i27;
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt$TextField$2\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,1164:1\n50#2:1165\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt$TextField$2\n*L\n204#1:1165\n*E\n"})
    /* renamed from: androidx.compose.material3.TextFieldKt$TextField$2 */
    public static final class C16672 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ KeyboardActions $keyboardActions;
        public final /* synthetic */ KeyboardOptions $keyboardOptions;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ TextStyle $mergedTextStyle;
        public final /* synthetic */ int $minLines;
        public final /* synthetic */ Function1<String, Unit> $onValueChange;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16672(boolean z82, TextFieldColors textFieldColors322, String str2, Function1<? super String, Unit> function12, boolean z52, boolean z62, TextStyle textStyle4, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z72, int i332, int i342, VisualTransformation visualTransformation22, MutableInteractionSource mutableInteractionSource42, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function282, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2162, Function2<? super Composer, ? super Integer, Unit> function2172, Shape shape32) {
            super(2);
            z = z82;
            textFieldColors = textFieldColors322;
            str = str2;
            function1 = function12;
            z = z52;
            z = z62;
            textStyle = textStyle4;
            keyboardOptions = keyboardOptions22;
            keyboardActions = keyboardActions22;
            z = z72;
            i = i332;
            i = i342;
            visualTransformation = visualTransformation22;
            mutableInteractionSource = mutableInteractionSource42;
            function2 = function2102;
            function2 = function282;
            function2 = function2142;
            function2 = function2112;
            function2 = function2132;
            function2 = function2162;
            function2 = function2172;
            shape = shape32;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i40) {
            if ((i40 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1859145987, i40, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:200)");
                }
                Modifier modifier4 = modifier;
                boolean z17 = z;
                Strings.Companion companion = Strings.INSTANCE;
                Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifier4, z17, Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.default_error_message), composer2, 0));
                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, textFieldDefaults.m10000getMinWidthD9Ej5fM(), textFieldDefaults.m9999getMinHeightD9Ej5fM());
                SolidColor solidColor = new SolidColor(textFieldColors.cursorColor$material3_release(z, composer2, 0).getValue().m11350unboximpl(), null);
                String str222 = str;
                Function1<String, Unit> function12 = function1;
                boolean z1822 = z;
                boolean z19 = z;
                TextStyle textStyle4 = textStyle;
                KeyboardOptions keyboardOptions5 = keyboardOptions;
                KeyboardActions keyboardActions5 = keyboardActions;
                boolean z2022 = z;
                int i41 = i;
                int i42 = i;
                VisualTransformation visualTransformation422 = visualTransformation;
                MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource;
                BasicTextFieldKt.BasicTextField(str222, function12, modifierM8156defaultMinSizeVpY3zN4, z1822, z19, textStyle4, keyboardOptions5, keyboardActions5, z2022, i41, i42, visualTransformation422, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource622, solidColor, ComposableLambdaKt.composableLambda(composer2, -288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.2.1
                    public final /* synthetic */ TextFieldColors $colors;
                    public final /* synthetic */ boolean $enabled;
                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                    public final /* synthetic */ boolean $isError;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                    public final /* synthetic */ Shape $shape;
                    public final /* synthetic */ boolean $singleLine;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                    public final /* synthetic */ String $value;
                    public final /* synthetic */ VisualTransformation $visualTransformation;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(String str2222, boolean z18222, boolean z20222, VisualTransformation visualTransformation4222, MutableInteractionSource mutableInteractionSource6222, boolean z21, Function2<? super Composer, ? super Integer, Unit> function2322, Function2<? super Composer, ? super Integer, Unit> function233, Function2<? super Composer, ? super Integer, Unit> function234, Function2<? super Composer, ? super Integer, Unit> function235, Function2<? super Composer, ? super Integer, Unit> function236, Function2<? super Composer, ? super Integer, Unit> function237, Function2<? super Composer, ? super Integer, Unit> function238, Shape shape6, TextFieldColors textFieldColors4) {
                        super(3);
                        str = str2222;
                        z = z18222;
                        z = z20222;
                        visualTransformation = visualTransformation4222;
                        mutableInteractionSource = mutableInteractionSource6222;
                        z = z21;
                        function2 = function2322;
                        function2 = function233;
                        function2 = function234;
                        function2 = function235;
                        function2 = function236;
                        function2 = function237;
                        function2 = function238;
                        shape = shape6;
                        textFieldColors = textFieldColors4;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2322, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function2322, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                    public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2322, @Nullable Composer composer3, int i43) {
                        int i44;
                        if ((i43 & 6) == 0) {
                            i44 = i43 | (composer3.changedInstance(function2322) ? 4 : 2);
                        } else {
                            i44 = i43;
                        }
                        if ((i44 & 19) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-288211827, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                            }
                            TextFieldDefaults.INSTANCE.DecorationBox(str, function2322, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i44 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.f342xf2722a21);
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

        /* compiled from: TextField.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.material3.TextFieldKt$TextField$2$1 */
        public static final class AnonymousClass1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
            public final /* synthetic */ TextFieldColors $colors;
            public final /* synthetic */ boolean $enabled;
            public final /* synthetic */ MutableInteractionSource $interactionSource;
            public final /* synthetic */ boolean $isError;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
            public final /* synthetic */ Shape $shape;
            public final /* synthetic */ boolean $singleLine;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
            public final /* synthetic */ String $value;
            public final /* synthetic */ VisualTransformation $visualTransformation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(String str2222, boolean z18222, boolean z20222, VisualTransformation visualTransformation4222, MutableInteractionSource mutableInteractionSource6222, boolean z21, Function2<? super Composer, ? super Integer, Unit> function2322, Function2<? super Composer, ? super Integer, Unit> function233, Function2<? super Composer, ? super Integer, Unit> function234, Function2<? super Composer, ? super Integer, Unit> function235, Function2<? super Composer, ? super Integer, Unit> function236, Function2<? super Composer, ? super Integer, Unit> function237, Function2<? super Composer, ? super Integer, Unit> function238, Shape shape6, TextFieldColors textFieldColors4) {
                super(3);
                str = str2222;
                z = z18222;
                z = z20222;
                visualTransformation = visualTransformation4222;
                mutableInteractionSource = mutableInteractionSource6222;
                z = z21;
                function2 = function2322;
                function2 = function233;
                function2 = function234;
                function2 = function235;
                function2 = function236;
                function2 = function237;
                function2 = function238;
                shape = shape6;
                textFieldColors = textFieldColors4;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2322, Composer composer3, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function2322, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
            public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2322, @Nullable Composer composer3, int i43) {
                int i44;
                if ((i43 & 6) == 0) {
                    i44 = i43 | (composer3.changedInstance(function2322) ? 4 : 2);
                } else {
                    i44 = i43;
                }
                if ((i44 & 19) != 18 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-288211827, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                    }
                    TextFieldDefaults.INSTANCE.DecorationBox(str, function2322, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i44 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.f342xf2722a21);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:390:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:727:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(@NotNull TextFieldValue textFieldValue, @NotNull Function1<? super TextFieldValue, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable TextStyle textStyle, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, @Nullable Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, @Nullable VisualTransformation visualTransformation, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, boolean z4, int i, int i2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, @Nullable TextFieldColors textFieldColors, @Nullable Composer composer, int i3, int i4, int i5, int i6) {
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
        Function2<? super Composer, ? super Integer, Unit> function218;
        VisualTransformation visualTransformation3;
        TextFieldColors textFieldColors2;
        TextStyle textStyle3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        boolean z9;
        int i36;
        int i37;
        MutableInteractionSource mutableInteractionSource5;
        Shape shape4;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        boolean z10;
        boolean z11;
        Function2<? super Composer, ? super Integer, Unit> function221;
        boolean z12;
        Function2<? super Composer, ? super Integer, Unit> function222;
        Function2<? super Composer, ? super Integer, Unit> function223;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function224;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1268528240);
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
                                                composerStartRestartGroup.startReplaceableGroup(-1263323576);
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
                                                shape2 = TextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
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
                                                textFieldColorsColors = TextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, i30);
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
                                            ComposerKt.traceEventStart(-1268528240, i31, i32, "androidx.compose.material3.TextField (TextField.kt:338)");
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(-1263323311);
                                        jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                                        if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                            jM13195getColor0d7_KjU = textFieldColorsColors.textColor$material3_release(z5, z8, mutableInteractionSource4, composerStartRestartGroup, ((i31 >> 9) & 14) | ((i32 >> 6) & 112) | ((i35 << 6) & 896) | ((i35 << 3) & 7168)).getValue().m11350unboximpl();
                                        }
                                        long j = jM13195getColor0d7_KjU;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        TextFieldColors textFieldColors3 = textFieldColorsColors;
                                        boolean z16 = z6;
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getSelectionColors(composerStartRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.5
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;
                                            public final /* synthetic */ KeyboardActions $keyboardActions;
                                            public final /* synthetic */ KeyboardOptions $keyboardOptions;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                            public final /* synthetic */ int $maxLines;
                                            public final /* synthetic */ TextStyle $mergedTextStyle;
                                            public final /* synthetic */ int $minLines;
                                            public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                            public final /* synthetic */ boolean $readOnly;
                                            public final /* synthetic */ Shape $shape;
                                            public final /* synthetic */ boolean $singleLine;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                            public final /* synthetic */ TextFieldValue $value;
                                            public final /* synthetic */ VisualTransformation $visualTransformation;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            public C16695(boolean z82, TextFieldColors textFieldColors32, TextFieldValue textFieldValue2, Function1<? super TextFieldValue, Unit> function12, boolean z52, boolean z62, TextStyle textStyle4, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z72, int i332, int i342, VisualTransformation visualTransformation22, MutableInteractionSource mutableInteractionSource42, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function282, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2162, Function2<? super Composer, ? super Integer, Unit> function2172, Shape shape32) {
                                                super(2);
                                                z = z82;
                                                textFieldColors = textFieldColors32;
                                                textFieldValue = textFieldValue2;
                                                function1 = function12;
                                                z = z52;
                                                z = z62;
                                                textStyle = textStyle4;
                                                keyboardOptions = keyboardOptions22;
                                                keyboardActions = keyboardActions22;
                                                z = z72;
                                                i = i332;
                                                i = i342;
                                                visualTransformation = visualTransformation22;
                                                mutableInteractionSource = mutableInteractionSource42;
                                                function2 = function2102;
                                                function2 = function282;
                                                function2 = function2142;
                                                function2 = function2112;
                                                function2 = function2132;
                                                function2 = function2162;
                                                function2 = function2172;
                                                shape = shape32;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer2, int i40) {
                                                if ((i40 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1163788208, i40, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
                                                    }
                                                    Modifier modifier4 = modifier;
                                                    boolean z17 = z;
                                                    Strings.Companion companion = Strings.INSTANCE;
                                                    Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifier4, z17, Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.default_error_message), composer2, 0));
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, textFieldDefaults.m10000getMinWidthD9Ej5fM(), textFieldDefaults.m9999getMinHeightD9Ej5fM());
                                                    SolidColor solidColor = new SolidColor(textFieldColors.cursorColor$material3_release(z, composer2, 0).getValue().m11350unboximpl(), null);
                                                    TextFieldValue textFieldValue2 = textFieldValue;
                                                    Function1<TextFieldValue, Unit> function12 = function1;
                                                    boolean z18 = z;
                                                    boolean z19 = z;
                                                    TextStyle textStyle4 = textStyle;
                                                    KeyboardOptions keyboardOptions5 = keyboardOptions;
                                                    KeyboardActions keyboardActions5 = keyboardActions;
                                                    boolean z20 = z;
                                                    int i41 = i;
                                                    int i42 = i;
                                                    VisualTransformation visualTransformation4 = visualTransformation;
                                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource;
                                                    BasicTextFieldKt.BasicTextField(textFieldValue2, function12, modifierM8156defaultMinSizeVpY3zN4, z18, z19, textStyle4, keyboardOptions5, keyboardActions5, z20, i41, i42, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor, ComposableLambdaKt.composableLambda(composer2, 1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.5.1
                                                        public final /* synthetic */ TextFieldColors $colors;
                                                        public final /* synthetic */ boolean $enabled;
                                                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                                                        public final /* synthetic */ boolean $isError;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                                        public final /* synthetic */ Shape $shape;
                                                        public final /* synthetic */ boolean $singleLine;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                                        public final /* synthetic */ VisualTransformation $visualTransformation;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        public AnonymousClass1(boolean z182, boolean z202, VisualTransformation visualTransformation42, MutableInteractionSource mutableInteractionSource62, boolean z21, Function2<? super Composer, ? super Integer, Unit> function232, Function2<? super Composer, ? super Integer, Unit> function233, Function2<? super Composer, ? super Integer, Unit> function234, Function2<? super Composer, ? super Integer, Unit> function235, Function2<? super Composer, ? super Integer, Unit> function236, Function2<? super Composer, ? super Integer, Unit> function237, Function2<? super Composer, ? super Integer, Unit> function238, Shape shape6, TextFieldColors textFieldColors4) {
                                                            super(3);
                                                            z = z182;
                                                            z = z202;
                                                            visualTransformation = visualTransformation42;
                                                            mutableInteractionSource = mutableInteractionSource62;
                                                            z = z21;
                                                            function2 = function232;
                                                            function2 = function233;
                                                            function2 = function234;
                                                            function2 = function235;
                                                            function2 = function236;
                                                            function2 = function237;
                                                            function2 = function238;
                                                            shape = shape6;
                                                            textFieldColors = textFieldColors4;
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function232, Composer composer3, Integer num) {
                                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function232, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @Composable
                                                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function232, @Nullable Composer composer3, int i43) {
                                                            int i44;
                                                            if ((i43 & 6) == 0) {
                                                                i44 = i43 | (composer3.changedInstance(function232) ? 4 : 2);
                                                            } else {
                                                                i44 = i43;
                                                            }
                                                            if ((i44 & 19) != 18 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1751957978, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                                                                }
                                                                TextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function232, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i44 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.f342xf2722a21);
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

                                            /* compiled from: TextField.kt */
                                            @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                            /* renamed from: androidx.compose.material3.TextFieldKt$TextField$5$1 */
                                            public static final class AnonymousClass1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
                                                public final /* synthetic */ TextFieldColors $colors;
                                                public final /* synthetic */ boolean $enabled;
                                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                                public final /* synthetic */ boolean $isError;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                                public final /* synthetic */ Shape $shape;
                                                public final /* synthetic */ boolean $singleLine;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                public AnonymousClass1(boolean z182, boolean z202, VisualTransformation visualTransformation42, MutableInteractionSource mutableInteractionSource62, boolean z21, Function2<? super Composer, ? super Integer, Unit> function232, Function2<? super Composer, ? super Integer, Unit> function233, Function2<? super Composer, ? super Integer, Unit> function234, Function2<? super Composer, ? super Integer, Unit> function235, Function2<? super Composer, ? super Integer, Unit> function236, Function2<? super Composer, ? super Integer, Unit> function237, Function2<? super Composer, ? super Integer, Unit> function238, Shape shape6, TextFieldColors textFieldColors4) {
                                                    super(3);
                                                    z = z182;
                                                    z = z202;
                                                    visualTransformation = visualTransformation42;
                                                    mutableInteractionSource = mutableInteractionSource62;
                                                    z = z21;
                                                    function2 = function232;
                                                    function2 = function233;
                                                    function2 = function234;
                                                    function2 = function235;
                                                    function2 = function236;
                                                    function2 = function237;
                                                    function2 = function238;
                                                    shape = shape6;
                                                    textFieldColors = textFieldColors4;
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function232, Composer composer3, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function232, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @Composable
                                                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function232, @Nullable Composer composer3, int i43) {
                                                    int i44;
                                                    if ((i43 & 6) == 0) {
                                                        i44 = i43 | (composer3.changedInstance(function232) ? 4 : 2);
                                                    } else {
                                                        i44 = i43;
                                                    }
                                                    if ((i44 & 19) != 18 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1751957978, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function232, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i44 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.f342xf2722a21);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }
                                        }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function218 = function2102;
                                        visualTransformation3 = visualTransformation22;
                                        textFieldColors2 = textFieldColors32;
                                        textStyle3 = textStyle2;
                                        keyboardOptions3 = keyboardOptions22;
                                        keyboardActions3 = keyboardActions22;
                                        z9 = z72;
                                        i36 = i332;
                                        i37 = i342;
                                        mutableInteractionSource5 = mutableInteractionSource42;
                                        shape4 = shape32;
                                        function219 = function2162;
                                        function220 = function2132;
                                        z10 = z82;
                                        z11 = z16;
                                        function221 = function2112;
                                        z12 = z52;
                                        function222 = function2172;
                                        Function2<? super Composer, ? super Integer, Unit> function232 = function282;
                                        function223 = function2142;
                                        modifier3 = modifier2;
                                        function224 = function232;
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
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.6
                                            public final /* synthetic */ int $$changed;
                                            public final /* synthetic */ int $$changed1;
                                            public final /* synthetic */ int $$changed2;
                                            public final /* synthetic */ int $$default;
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;
                                            public final /* synthetic */ KeyboardActions $keyboardActions;
                                            public final /* synthetic */ KeyboardOptions $keyboardOptions;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                            public final /* synthetic */ int $maxLines;
                                            public final /* synthetic */ int $minLines;
                                            public final /* synthetic */ Modifier $modifier;
                                            public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                            public final /* synthetic */ boolean $readOnly;
                                            public final /* synthetic */ Shape $shape;
                                            public final /* synthetic */ boolean $singleLine;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                            public final /* synthetic */ TextStyle $textStyle;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                            public final /* synthetic */ VisualTransformation $visualTransformation;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            public C16706(Function1<? super TextFieldValue, Unit> function12, Modifier modifier32, boolean z122, boolean z112, TextStyle textStyle32, Function2<? super Composer, ? super Integer, Unit> function2182, Function2<? super Composer, ? super Integer, Unit> function2242, Function2<? super Composer, ? super Integer, Unit> function2232, Function2<? super Composer, ? super Integer, Unit> function2212, Function2<? super Composer, ? super Integer, Unit> function2202, Function2<? super Composer, ? super Integer, Unit> function2192, Function2<? super Composer, ? super Integer, Unit> function2222, boolean z102, VisualTransformation visualTransformation32, KeyboardOptions keyboardOptions32, KeyboardActions keyboardActions32, boolean z92, int i362, int i372, MutableInteractionSource mutableInteractionSource52, Shape shape42, TextFieldColors textFieldColors22, int i310, int i42, int i52, int i62) {
                                                super(2);
                                                function1 = function12;
                                                modifier = modifier32;
                                                z = z122;
                                                z = z112;
                                                textStyle = textStyle32;
                                                function2 = function2182;
                                                function2 = function2242;
                                                function2 = function2232;
                                                function2 = function2212;
                                                function2 = function2202;
                                                function2 = function2192;
                                                function2 = function2222;
                                                z = z102;
                                                visualTransformation = visualTransformation32;
                                                keyboardOptions = keyboardOptions32;
                                                keyboardActions = keyboardActions32;
                                                z = z92;
                                                i = i362;
                                                i = i372;
                                                mutableInteractionSource = mutableInteractionSource52;
                                                shape = shape42;
                                                textFieldColors = textFieldColors22;
                                                i = i310;
                                                i = i42;
                                                i = i52;
                                                i = i62;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@Nullable Composer composer2, int i40) {
                                                TextFieldKt.TextField(textFieldValue, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i38 |= CpioConstants.C_ISBLK;
                                i21 = i20;
                                i22 = i62 & 32768;
                                if (i22 == 0) {
                                }
                                i23 = i62 & 65536;
                                if (i23 == 0) {
                                }
                                i24 = i62 & 131072;
                                if (i24 == 0) {
                                }
                                if ((i42 & 100663296) == 0) {
                                }
                                i25 = i62 & 524288;
                                if (i25 == 0) {
                                }
                                i26 = i62 & 1048576;
                                if (i26 == 0) {
                                }
                                if ((i52 & 48) == 0) {
                                }
                                if ((i52 & 384) == 0) {
                                }
                                i28 = i27;
                                if ((i7 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i310 & 1) != 0) {
                                        if (i8 == 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if ((i62 & 32) == 0) {
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
                                        if ((i62 & 262144) == 0) {
                                        }
                                        if (i25 == 0) {
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function2312 = function226;
                                        if (i26 == 0) {
                                        }
                                        if ((2097152 & i62) == 0) {
                                        }
                                        Shape shape52 = shape2;
                                        if ((i62 & 4194304) == 0) {
                                        }
                                        i31 = i7;
                                        i32 = i38;
                                        z62 = z13;
                                        keyboardOptions22 = keyboardOptions4;
                                        keyboardActions22 = keyboardActions4;
                                        z72 = z15;
                                        i332 = i29;
                                        function2102 = function225;
                                        i342 = i39;
                                        function2112 = function29;
                                        function212 = function229;
                                        i35 = i28;
                                        function2132 = function228;
                                        visualTransformation22 = none;
                                        function2142 = function2312;
                                        z82 = z14;
                                        function215 = function230;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(-1263323311);
                                        jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                                        if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                        }
                                        long j2 = jM13195getColor0d7_KjU;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        TextFieldColors textFieldColors32 = textFieldColorsColors;
                                        boolean z162 = z62;
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors32.getSelectionColors(composerStartRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.5
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;
                                            public final /* synthetic */ KeyboardActions $keyboardActions;
                                            public final /* synthetic */ KeyboardOptions $keyboardOptions;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                            public final /* synthetic */ int $maxLines;
                                            public final /* synthetic */ TextStyle $mergedTextStyle;
                                            public final /* synthetic */ int $minLines;
                                            public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                            public final /* synthetic */ boolean $readOnly;
                                            public final /* synthetic */ Shape $shape;
                                            public final /* synthetic */ boolean $singleLine;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                            public final /* synthetic */ TextFieldValue $value;
                                            public final /* synthetic */ VisualTransformation $visualTransformation;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            public C16695(boolean z82, TextFieldColors textFieldColors322, TextFieldValue textFieldValue2, Function1<? super TextFieldValue, Unit> function12, boolean z52, boolean z62, TextStyle textStyle4, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z72, int i332, int i342, VisualTransformation visualTransformation22, MutableInteractionSource mutableInteractionSource42, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function282, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2162, Function2<? super Composer, ? super Integer, Unit> function2172, Shape shape32) {
                                                super(2);
                                                z = z82;
                                                textFieldColors = textFieldColors322;
                                                textFieldValue = textFieldValue2;
                                                function1 = function12;
                                                z = z52;
                                                z = z62;
                                                textStyle = textStyle4;
                                                keyboardOptions = keyboardOptions22;
                                                keyboardActions = keyboardActions22;
                                                z = z72;
                                                i = i332;
                                                i = i342;
                                                visualTransformation = visualTransformation22;
                                                mutableInteractionSource = mutableInteractionSource42;
                                                function2 = function2102;
                                                function2 = function282;
                                                function2 = function2142;
                                                function2 = function2112;
                                                function2 = function2132;
                                                function2 = function2162;
                                                function2 = function2172;
                                                shape = shape32;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer2, int i40) {
                                                if ((i40 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1163788208, i40, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
                                                    }
                                                    Modifier modifier4 = modifier;
                                                    boolean z17 = z;
                                                    Strings.Companion companion = Strings.INSTANCE;
                                                    Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifier4, z17, Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.default_error_message), composer2, 0));
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, textFieldDefaults.m10000getMinWidthD9Ej5fM(), textFieldDefaults.m9999getMinHeightD9Ej5fM());
                                                    SolidColor solidColor = new SolidColor(textFieldColors.cursorColor$material3_release(z, composer2, 0).getValue().m11350unboximpl(), null);
                                                    TextFieldValue textFieldValue2 = textFieldValue;
                                                    Function1<TextFieldValue, Unit> function12 = function1;
                                                    boolean z182 = z;
                                                    boolean z19 = z;
                                                    TextStyle textStyle4 = textStyle;
                                                    KeyboardOptions keyboardOptions5 = keyboardOptions;
                                                    KeyboardActions keyboardActions5 = keyboardActions;
                                                    boolean z202 = z;
                                                    int i41 = i;
                                                    int i42 = i;
                                                    VisualTransformation visualTransformation42 = visualTransformation;
                                                    MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource;
                                                    BasicTextFieldKt.BasicTextField(textFieldValue2, function12, modifierM8156defaultMinSizeVpY3zN4, z182, z19, textStyle4, keyboardOptions5, keyboardActions5, z202, i41, i42, visualTransformation42, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource62, solidColor, ComposableLambdaKt.composableLambda(composer2, 1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.5.1
                                                        public final /* synthetic */ TextFieldColors $colors;
                                                        public final /* synthetic */ boolean $enabled;
                                                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                                                        public final /* synthetic */ boolean $isError;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                                        public final /* synthetic */ Shape $shape;
                                                        public final /* synthetic */ boolean $singleLine;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                                        public final /* synthetic */ VisualTransformation $visualTransformation;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        public AnonymousClass1(boolean z1822, boolean z2022, VisualTransformation visualTransformation422, MutableInteractionSource mutableInteractionSource622, boolean z21, Function2<? super Composer, ? super Integer, Unit> function2322, Function2<? super Composer, ? super Integer, Unit> function233, Function2<? super Composer, ? super Integer, Unit> function234, Function2<? super Composer, ? super Integer, Unit> function235, Function2<? super Composer, ? super Integer, Unit> function236, Function2<? super Composer, ? super Integer, Unit> function237, Function2<? super Composer, ? super Integer, Unit> function238, Shape shape6, TextFieldColors textFieldColors4) {
                                                            super(3);
                                                            z = z1822;
                                                            z = z2022;
                                                            visualTransformation = visualTransformation422;
                                                            mutableInteractionSource = mutableInteractionSource622;
                                                            z = z21;
                                                            function2 = function2322;
                                                            function2 = function233;
                                                            function2 = function234;
                                                            function2 = function235;
                                                            function2 = function236;
                                                            function2 = function237;
                                                            function2 = function238;
                                                            shape = shape6;
                                                            textFieldColors = textFieldColors4;
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2322, Composer composer3, Integer num) {
                                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2322, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @Composable
                                                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2322, @Nullable Composer composer3, int i43) {
                                                            int i44;
                                                            if ((i43 & 6) == 0) {
                                                                i44 = i43 | (composer3.changedInstance(function2322) ? 4 : 2);
                                                            } else {
                                                                i44 = i43;
                                                            }
                                                            if ((i44 & 19) != 18 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1751957978, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                                                                }
                                                                TextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function2322, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i44 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.f342xf2722a21);
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

                                            /* compiled from: TextField.kt */
                                            @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                            /* renamed from: androidx.compose.material3.TextFieldKt$TextField$5$1 */
                                            public static final class AnonymousClass1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
                                                public final /* synthetic */ TextFieldColors $colors;
                                                public final /* synthetic */ boolean $enabled;
                                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                                public final /* synthetic */ boolean $isError;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                                public final /* synthetic */ Shape $shape;
                                                public final /* synthetic */ boolean $singleLine;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                public AnonymousClass1(boolean z1822, boolean z2022, VisualTransformation visualTransformation422, MutableInteractionSource mutableInteractionSource622, boolean z21, Function2<? super Composer, ? super Integer, Unit> function2322, Function2<? super Composer, ? super Integer, Unit> function233, Function2<? super Composer, ? super Integer, Unit> function234, Function2<? super Composer, ? super Integer, Unit> function235, Function2<? super Composer, ? super Integer, Unit> function236, Function2<? super Composer, ? super Integer, Unit> function237, Function2<? super Composer, ? super Integer, Unit> function238, Shape shape6, TextFieldColors textFieldColors4) {
                                                    super(3);
                                                    z = z1822;
                                                    z = z2022;
                                                    visualTransformation = visualTransformation422;
                                                    mutableInteractionSource = mutableInteractionSource622;
                                                    z = z21;
                                                    function2 = function2322;
                                                    function2 = function233;
                                                    function2 = function234;
                                                    function2 = function235;
                                                    function2 = function236;
                                                    function2 = function237;
                                                    function2 = function238;
                                                    shape = shape6;
                                                    textFieldColors = textFieldColors4;
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2322, Composer composer3, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function2322, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @Composable
                                                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                                public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2322, @Nullable Composer composer3, int i43) {
                                                    int i44;
                                                    if ((i43 & 6) == 0) {
                                                        i44 = i43 | (composer3.changedInstance(function2322) ? 4 : 2);
                                                    } else {
                                                        i44 = i43;
                                                    }
                                                    if ((i44 & 19) != 18 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1751957978, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function2322, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i44 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.f342xf2722a21);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }
                                        }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        function2182 = function2102;
                                        visualTransformation32 = visualTransformation22;
                                        textFieldColors22 = textFieldColors322;
                                        textStyle32 = textStyle2;
                                        keyboardOptions32 = keyboardOptions22;
                                        keyboardActions32 = keyboardActions22;
                                        z92 = z72;
                                        i362 = i332;
                                        i372 = i342;
                                        mutableInteractionSource52 = mutableInteractionSource42;
                                        shape42 = shape32;
                                        function2192 = function2162;
                                        function2202 = function2132;
                                        z102 = z82;
                                        z112 = z162;
                                        function2212 = function2112;
                                        z122 = z52;
                                        function2222 = function2172;
                                        Function2<? super Composer, ? super Integer, Unit> function2322 = function282;
                                        function2232 = function2142;
                                        modifier32 = modifier2;
                                        function2242 = function2322;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i20 = i62 & 16384;
                            if (i20 == 0) {
                            }
                            i22 = i62 & 32768;
                            if (i22 == 0) {
                            }
                            i23 = i62 & 65536;
                            if (i23 == 0) {
                            }
                            i24 = i62 & 131072;
                            if (i24 == 0) {
                            }
                            if ((i42 & 100663296) == 0) {
                            }
                            i25 = i62 & 524288;
                            if (i25 == 0) {
                            }
                            i26 = i62 & 1048576;
                            if (i26 == 0) {
                            }
                            if ((i52 & 48) == 0) {
                            }
                            if ((i52 & 384) == 0) {
                            }
                            i28 = i27;
                            if ((i7 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i19 = i62 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i62 & 16384;
                        if (i20 == 0) {
                        }
                        i22 = i62 & 32768;
                        if (i22 == 0) {
                        }
                        i23 = i62 & 65536;
                        if (i23 == 0) {
                        }
                        i24 = i62 & 131072;
                        if (i24 == 0) {
                        }
                        if ((i42 & 100663296) == 0) {
                        }
                        i25 = i62 & 524288;
                        if (i25 == 0) {
                        }
                        i26 = i62 & 1048576;
                        if (i26 == 0) {
                        }
                        if ((i52 & 48) == 0) {
                        }
                        if ((i52 & 384) == 0) {
                        }
                        i28 = i27;
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i310 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    i11 = i62 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i62 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i62 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i62 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i62 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i62 & 2048;
                    if (i17 != 0) {
                    }
                    int i382 = i16;
                    i18 = i62 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i62 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i62 & 16384;
                    if (i20 == 0) {
                    }
                    i22 = i62 & 32768;
                    if (i22 == 0) {
                    }
                    i23 = i62 & 65536;
                    if (i23 == 0) {
                    }
                    i24 = i62 & 131072;
                    if (i24 == 0) {
                    }
                    if ((i42 & 100663296) == 0) {
                    }
                    i25 = i62 & 524288;
                    if (i25 == 0) {
                    }
                    i26 = i62 & 1048576;
                    if (i26 == 0) {
                    }
                    if ((i52 & 48) == 0) {
                    }
                    if ((i52 & 384) == 0) {
                    }
                    i28 = i27;
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i10 = i62 & 16;
                if (i10 == 0) {
                }
                if ((i310 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                i11 = i62 & 64;
                if (i11 != 0) {
                }
                i12 = i62 & 128;
                if (i12 != 0) {
                }
                i13 = i62 & 256;
                if (i13 != 0) {
                }
                i14 = i62 & 512;
                if (i14 != 0) {
                }
                i15 = i62 & 1024;
                if (i15 != 0) {
                }
                i17 = i62 & 2048;
                if (i17 != 0) {
                }
                int i3822 = i16;
                i18 = i62 & 4096;
                if (i18 != 0) {
                }
                i19 = i62 & 8192;
                if (i19 == 0) {
                }
                i20 = i62 & 16384;
                if (i20 == 0) {
                }
                i22 = i62 & 32768;
                if (i22 == 0) {
                }
                i23 = i62 & 65536;
                if (i23 == 0) {
                }
                i24 = i62 & 131072;
                if (i24 == 0) {
                }
                if ((i42 & 100663296) == 0) {
                }
                i25 = i62 & 524288;
                if (i25 == 0) {
                }
                i26 = i62 & 1048576;
                if (i26 == 0) {
                }
                if ((i52 & 48) == 0) {
                }
                if ((i52 & 384) == 0) {
                }
                i28 = i27;
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i9 = i62 & 8;
            if (i9 != 0) {
            }
            i10 = i62 & 16;
            if (i10 == 0) {
            }
            if ((i310 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            i11 = i62 & 64;
            if (i11 != 0) {
            }
            i12 = i62 & 128;
            if (i12 != 0) {
            }
            i13 = i62 & 256;
            if (i13 != 0) {
            }
            i14 = i62 & 512;
            if (i14 != 0) {
            }
            i15 = i62 & 1024;
            if (i15 != 0) {
            }
            i17 = i62 & 2048;
            if (i17 != 0) {
            }
            int i38222 = i16;
            i18 = i62 & 4096;
            if (i18 != 0) {
            }
            i19 = i62 & 8192;
            if (i19 == 0) {
            }
            i20 = i62 & 16384;
            if (i20 == 0) {
            }
            i22 = i62 & 32768;
            if (i22 == 0) {
            }
            i23 = i62 & 65536;
            if (i23 == 0) {
            }
            i24 = i62 & 131072;
            if (i24 == 0) {
            }
            if ((i42 & 100663296) == 0) {
            }
            i25 = i62 & 524288;
            if (i25 == 0) {
            }
            i26 = i62 & 1048576;
            if (i26 == 0) {
            }
            if ((i52 & 48) == 0) {
            }
            if ((i52 & 384) == 0) {
            }
            i28 = i27;
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i62 & 4;
        if (i8 == 0) {
        }
        i9 = i62 & 8;
        if (i9 != 0) {
        }
        i10 = i62 & 16;
        if (i10 == 0) {
        }
        if ((i310 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        i11 = i62 & 64;
        if (i11 != 0) {
        }
        i12 = i62 & 128;
        if (i12 != 0) {
        }
        i13 = i62 & 256;
        if (i13 != 0) {
        }
        i14 = i62 & 512;
        if (i14 != 0) {
        }
        i15 = i62 & 1024;
        if (i15 != 0) {
        }
        i17 = i62 & 2048;
        if (i17 != 0) {
        }
        int i382222 = i16;
        i18 = i62 & 4096;
        if (i18 != 0) {
        }
        i19 = i62 & 8192;
        if (i19 == 0) {
        }
        i20 = i62 & 16384;
        if (i20 == 0) {
        }
        i22 = i62 & 32768;
        if (i22 == 0) {
        }
        i23 = i62 & 65536;
        if (i23 == 0) {
        }
        i24 = i62 & 131072;
        if (i24 == 0) {
        }
        if ((i42 & 100663296) == 0) {
        }
        i25 = i62 & 524288;
        if (i25 == 0) {
        }
        i26 = i62 & 1048576;
        if (i26 == 0) {
        }
        if ((i52 & 48) == 0) {
        }
        if ((i52 & 384) == 0) {
        }
        i28 = i27;
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: TextField.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt$TextField$5\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,1164:1\n50#2:1165\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt$TextField$5\n*L\n350#1:1165\n*E\n"})
    /* renamed from: androidx.compose.material3.TextFieldKt$TextField$5 */
    public static final class C16695 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ KeyboardActions $keyboardActions;
        public final /* synthetic */ KeyboardOptions $keyboardOptions;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ TextStyle $mergedTextStyle;
        public final /* synthetic */ int $minLines;
        public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ TextFieldValue $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16695(boolean z82, TextFieldColors textFieldColors322, TextFieldValue textFieldValue2, Function1<? super TextFieldValue, Unit> function12, boolean z52, boolean z62, TextStyle textStyle4, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z72, int i332, int i342, VisualTransformation visualTransformation22, MutableInteractionSource mutableInteractionSource42, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function282, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2162, Function2<? super Composer, ? super Integer, Unit> function2172, Shape shape32) {
            super(2);
            z = z82;
            textFieldColors = textFieldColors322;
            textFieldValue = textFieldValue2;
            function1 = function12;
            z = z52;
            z = z62;
            textStyle = textStyle4;
            keyboardOptions = keyboardOptions22;
            keyboardActions = keyboardActions22;
            z = z72;
            i = i332;
            i = i342;
            visualTransformation = visualTransformation22;
            mutableInteractionSource = mutableInteractionSource42;
            function2 = function2102;
            function2 = function282;
            function2 = function2142;
            function2 = function2112;
            function2 = function2132;
            function2 = function2162;
            function2 = function2172;
            shape = shape32;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i40) {
            if ((i40 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1163788208, i40, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
                }
                Modifier modifier4 = modifier;
                boolean z17 = z;
                Strings.Companion companion = Strings.INSTANCE;
                Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifier4, z17, Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.default_error_message), composer2, 0));
                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, textFieldDefaults.m10000getMinWidthD9Ej5fM(), textFieldDefaults.m9999getMinHeightD9Ej5fM());
                SolidColor solidColor = new SolidColor(textFieldColors.cursorColor$material3_release(z, composer2, 0).getValue().m11350unboximpl(), null);
                TextFieldValue textFieldValue2 = textFieldValue;
                Function1<TextFieldValue, Unit> function12 = function1;
                boolean z1822 = z;
                boolean z19 = z;
                TextStyle textStyle4 = textStyle;
                KeyboardOptions keyboardOptions5 = keyboardOptions;
                KeyboardActions keyboardActions5 = keyboardActions;
                boolean z2022 = z;
                int i41 = i;
                int i42 = i;
                VisualTransformation visualTransformation422 = visualTransformation;
                MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource;
                BasicTextFieldKt.BasicTextField(textFieldValue2, function12, modifierM8156defaultMinSizeVpY3zN4, z1822, z19, textStyle4, keyboardOptions5, keyboardActions5, z2022, i41, i42, visualTransformation422, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource622, solidColor, ComposableLambdaKt.composableLambda(composer2, 1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.5.1
                    public final /* synthetic */ TextFieldColors $colors;
                    public final /* synthetic */ boolean $enabled;
                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                    public final /* synthetic */ boolean $isError;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                    public final /* synthetic */ Shape $shape;
                    public final /* synthetic */ boolean $singleLine;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                    public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                    public final /* synthetic */ VisualTransformation $visualTransformation;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(boolean z18222, boolean z20222, VisualTransformation visualTransformation4222, MutableInteractionSource mutableInteractionSource6222, boolean z21, Function2<? super Composer, ? super Integer, Unit> function2322, Function2<? super Composer, ? super Integer, Unit> function233, Function2<? super Composer, ? super Integer, Unit> function234, Function2<? super Composer, ? super Integer, Unit> function235, Function2<? super Composer, ? super Integer, Unit> function236, Function2<? super Composer, ? super Integer, Unit> function237, Function2<? super Composer, ? super Integer, Unit> function238, Shape shape6, TextFieldColors textFieldColors4) {
                        super(3);
                        z = z18222;
                        z = z20222;
                        visualTransformation = visualTransformation4222;
                        mutableInteractionSource = mutableInteractionSource6222;
                        z = z21;
                        function2 = function2322;
                        function2 = function233;
                        function2 = function234;
                        function2 = function235;
                        function2 = function236;
                        function2 = function237;
                        function2 = function238;
                        shape = shape6;
                        textFieldColors = textFieldColors4;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2322, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function2322, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                    public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2322, @Nullable Composer composer3, int i43) {
                        int i44;
                        if ((i43 & 6) == 0) {
                            i44 = i43 | (composer3.changedInstance(function2322) ? 4 : 2);
                        } else {
                            i44 = i43;
                        }
                        if ((i44 & 19) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1751957978, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                            }
                            TextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function2322, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i44 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.f342xf2722a21);
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

        /* compiled from: TextField.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.material3.TextFieldKt$TextField$5$1 */
        public static final class AnonymousClass1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
            public final /* synthetic */ TextFieldColors $colors;
            public final /* synthetic */ boolean $enabled;
            public final /* synthetic */ MutableInteractionSource $interactionSource;
            public final /* synthetic */ boolean $isError;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
            public final /* synthetic */ Shape $shape;
            public final /* synthetic */ boolean $singleLine;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
            public final /* synthetic */ VisualTransformation $visualTransformation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(boolean z18222, boolean z20222, VisualTransformation visualTransformation4222, MutableInteractionSource mutableInteractionSource6222, boolean z21, Function2<? super Composer, ? super Integer, Unit> function2322, Function2<? super Composer, ? super Integer, Unit> function233, Function2<? super Composer, ? super Integer, Unit> function234, Function2<? super Composer, ? super Integer, Unit> function235, Function2<? super Composer, ? super Integer, Unit> function236, Function2<? super Composer, ? super Integer, Unit> function237, Function2<? super Composer, ? super Integer, Unit> function238, Shape shape6, TextFieldColors textFieldColors4) {
                super(3);
                z = z18222;
                z = z20222;
                visualTransformation = visualTransformation4222;
                mutableInteractionSource = mutableInteractionSource6222;
                z = z21;
                function2 = function2322;
                function2 = function233;
                function2 = function234;
                function2 = function235;
                function2 = function236;
                function2 = function237;
                function2 = function238;
                shape = shape6;
                textFieldColors = textFieldColors4;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2322, Composer composer3, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function2322, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
            public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function2322, @Nullable Composer composer3, int i43) {
                int i44;
                if ((i43 & 6) == 0) {
                    i44 = i43 | (composer3.changedInstance(function2322) ? 4 : 2);
                } else {
                    i44 = i43;
                }
                if ((i44 & 19) != 18 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1751957978, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                    }
                    TextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function2322, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i44 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.f342xf2722a21);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:356:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:659:? A[RETURN, SYNTHETIC] */
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TextField(String str, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i3, int i4, int i5, int i6) {
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
        KeyboardActions keyboardActions4;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        boolean z9;
        int i32;
        int i33;
        MutableInteractionSource mutableInteractionSource5;
        Shape shape4;
        TextFieldColors textFieldColors2;
        Function2 function212;
        Function2 function213;
        Modifier modifier3;
        Function2 function214;
        Function2 function215;
        boolean z10;
        boolean z11;
        TextStyle textStyle3;
        Function2 function216;
        boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1500728277);
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
                                                composerStartRestartGroup.startReplaceableGroup(-1263320224);
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
                                                shape2 = TextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
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
                                                textFieldColorsColors = TextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, i27);
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
                                            ComposerKt.traceEventStart(-1500728277, i28, i29, "androidx.compose.material3.TextField (TextField.kt:416)");
                                        }
                                        int i36 = i29 << 6;
                                        TextField(str, (Function1<? super String, Unit>) function1, modifier2, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function211, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColorsColors, composer2, i28 & 2147483646, (i36 & 896) | 54 | (i36 & 7168) | (57344 & i36) | (458752 & i36) | (3670016 & i36) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192), ((i29 >> 24) & 126) | ((i25 << 6) & 896), 0);
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
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.8
                                            public final /* synthetic */ int $$changed;
                                            public final /* synthetic */ int $$changed1;
                                            public final /* synthetic */ int $$changed2;
                                            public final /* synthetic */ int $$default;
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;
                                            public final /* synthetic */ KeyboardActions $keyboardActions;
                                            public final /* synthetic */ KeyboardOptions $keyboardOptions;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                            public final /* synthetic */ int $maxLines;
                                            public final /* synthetic */ int $minLines;
                                            public final /* synthetic */ Modifier $modifier;
                                            public final /* synthetic */ Function1<String, Unit> $onValueChange;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                            public final /* synthetic */ boolean $readOnly;
                                            public final /* synthetic */ Shape $shape;
                                            public final /* synthetic */ boolean $singleLine;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                            public final /* synthetic */ TextStyle $textStyle;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                            public final /* synthetic */ String $value;
                                            public final /* synthetic */ VisualTransformation $visualTransformation;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            public C16718(String str2, Function1<? super String, Unit> function12, Modifier modifier32, boolean z102, boolean z122, TextStyle textStyle32, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2152, Function2<? super Composer, ? super Integer, Unit> function2162, boolean z112, VisualTransformation visualTransformation32, KeyboardOptions keyboardOptions32, KeyboardActions keyboardActions42, boolean z92, int i322, int i332, MutableInteractionSource mutableInteractionSource52, Shape shape42, TextFieldColors textFieldColors22, int i37, int i42, int i52, int i62) {
                                                super(2);
                                                str = str2;
                                                function1 = function12;
                                                modifier = modifier32;
                                                z = z102;
                                                z = z122;
                                                textStyle = textStyle32;
                                                function2 = function2122;
                                                function2 = function2142;
                                                function2 = function2132;
                                                function2 = function2152;
                                                function2 = function2162;
                                                z = z112;
                                                visualTransformation = visualTransformation32;
                                                keyboardOptions = keyboardOptions32;
                                                keyboardActions = keyboardActions42;
                                                z = z92;
                                                i = i322;
                                                i = i332;
                                                mutableInteractionSource = mutableInteractionSource52;
                                                shape = shape42;
                                                textFieldColors = textFieldColors22;
                                                i = i37;
                                                i = i42;
                                                i = i52;
                                                i = i62;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@Nullable Composer composer3, int i37) {
                                                TextFieldKt.TextField(str, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i34 |= CpioConstants.C_ISBLK;
                                i21 = i20;
                                i22 = i62 & 32768;
                                if (i22 == 0) {
                                }
                                if ((i42 & 1572864) == 0) {
                                }
                                i23 = i62 & 131072;
                                if (i23 == 0) {
                                }
                                i24 = i62 & 262144;
                                if (i24 == 0) {
                                }
                                if ((i42 & 805306368) == 0) {
                                }
                                if ((i52 & 6) != 0) {
                                }
                                if ((i7 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i37 & 1) != 0) {
                                        if (i8 == 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if ((i62 & 32) == 0) {
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
                                        if ((i62 & 65536) == 0) {
                                        }
                                        if (i23 == 0) {
                                        }
                                        if (i24 == 0) {
                                        }
                                        if ((i62 & 524288) == 0) {
                                        }
                                        Function2 function2212 = function219;
                                        if ((i62 & 1048576) == 0) {
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
                                        TextField(str2, (Function1<? super String, Unit>) function12, modifier2, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function211, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColorsColors, composer2, i28 & 2147483646, (i362 & 896) | 54 | (i362 & 7168) | (57344 & i362) | (458752 & i362) | (3670016 & i362) | (29360128 & i362) | (234881024 & i362) | (i362 & 1879048192), ((i29 >> 24) & 126) | ((i25 << 6) & 896), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        keyboardActions42 = keyboardActions3;
                                        visualTransformation32 = visualTransformation2;
                                        keyboardOptions32 = keyboardOptions2;
                                        z92 = z6;
                                        i322 = i30;
                                        i332 = i31;
                                        mutableInteractionSource52 = mutableInteractionSource4;
                                        shape42 = shape3;
                                        textFieldColors22 = textFieldColorsColors;
                                        function2122 = function28;
                                        function2132 = function210;
                                        modifier32 = modifier2;
                                        function2142 = function26;
                                        function2152 = function29;
                                        z102 = z5;
                                        z112 = z8;
                                        textStyle32 = textStyle2;
                                        function2162 = function211;
                                        z122 = z7;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i20 = i62 & 16384;
                            if (i20 == 0) {
                            }
                            i22 = i62 & 32768;
                            if (i22 == 0) {
                            }
                            if ((i42 & 1572864) == 0) {
                            }
                            i23 = i62 & 131072;
                            if (i23 == 0) {
                            }
                            i24 = i62 & 262144;
                            if (i24 == 0) {
                            }
                            if ((i42 & 805306368) == 0) {
                            }
                            if ((i52 & 6) != 0) {
                            }
                            if ((i7 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i19 = i62 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i62 & 16384;
                        if (i20 == 0) {
                        }
                        i22 = i62 & 32768;
                        if (i22 == 0) {
                        }
                        if ((i42 & 1572864) == 0) {
                        }
                        i23 = i62 & 131072;
                        if (i23 == 0) {
                        }
                        i24 = i62 & 262144;
                        if (i24 == 0) {
                        }
                        if ((i42 & 805306368) == 0) {
                        }
                        if ((i52 & 6) != 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i37 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    i11 = i62 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i62 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i62 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i62 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i62 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i62 & 2048;
                    if (i17 != 0) {
                    }
                    int i342 = i16;
                    i18 = i62 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i62 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i62 & 16384;
                    if (i20 == 0) {
                    }
                    i22 = i62 & 32768;
                    if (i22 == 0) {
                    }
                    if ((i42 & 1572864) == 0) {
                    }
                    i23 = i62 & 131072;
                    if (i23 == 0) {
                    }
                    i24 = i62 & 262144;
                    if (i24 == 0) {
                    }
                    if ((i42 & 805306368) == 0) {
                    }
                    if ((i52 & 6) != 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i10 = i62 & 16;
                if (i10 == 0) {
                }
                if ((i37 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                i11 = i62 & 64;
                if (i11 != 0) {
                }
                i12 = i62 & 128;
                if (i12 != 0) {
                }
                i13 = i62 & 256;
                if (i13 != 0) {
                }
                i14 = i62 & 512;
                if (i14 != 0) {
                }
                i15 = i62 & 1024;
                if (i15 != 0) {
                }
                i17 = i62 & 2048;
                if (i17 != 0) {
                }
                int i3422 = i16;
                i18 = i62 & 4096;
                if (i18 != 0) {
                }
                i19 = i62 & 8192;
                if (i19 == 0) {
                }
                i20 = i62 & 16384;
                if (i20 == 0) {
                }
                i22 = i62 & 32768;
                if (i22 == 0) {
                }
                if ((i42 & 1572864) == 0) {
                }
                i23 = i62 & 131072;
                if (i23 == 0) {
                }
                i24 = i62 & 262144;
                if (i24 == 0) {
                }
                if ((i42 & 805306368) == 0) {
                }
                if ((i52 & 6) != 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i9 = i62 & 8;
            if (i9 != 0) {
            }
            i10 = i62 & 16;
            if (i10 == 0) {
            }
            if ((i37 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            i11 = i62 & 64;
            if (i11 != 0) {
            }
            i12 = i62 & 128;
            if (i12 != 0) {
            }
            i13 = i62 & 256;
            if (i13 != 0) {
            }
            i14 = i62 & 512;
            if (i14 != 0) {
            }
            i15 = i62 & 1024;
            if (i15 != 0) {
            }
            i17 = i62 & 2048;
            if (i17 != 0) {
            }
            int i34222 = i16;
            i18 = i62 & 4096;
            if (i18 != 0) {
            }
            i19 = i62 & 8192;
            if (i19 == 0) {
            }
            i20 = i62 & 16384;
            if (i20 == 0) {
            }
            i22 = i62 & 32768;
            if (i22 == 0) {
            }
            if ((i42 & 1572864) == 0) {
            }
            i23 = i62 & 131072;
            if (i23 == 0) {
            }
            i24 = i62 & 262144;
            if (i24 == 0) {
            }
            if ((i42 & 805306368) == 0) {
            }
            if ((i52 & 6) != 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i62 & 4;
        if (i8 == 0) {
        }
        i9 = i62 & 8;
        if (i9 != 0) {
        }
        i10 = i62 & 16;
        if (i10 == 0) {
        }
        if ((i37 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        i11 = i62 & 64;
        if (i11 != 0) {
        }
        i12 = i62 & 128;
        if (i12 != 0) {
        }
        i13 = i62 & 256;
        if (i13 != 0) {
        }
        i14 = i62 & 512;
        if (i14 != 0) {
        }
        i15 = i62 & 1024;
        if (i15 != 0) {
        }
        i17 = i62 & 2048;
        if (i17 != 0) {
        }
        int i342222 = i16;
        i18 = i62 & 4096;
        if (i18 != 0) {
        }
        i19 = i62 & 8192;
        if (i19 == 0) {
        }
        i20 = i62 & 16384;
        if (i20 == 0) {
        }
        i22 = i62 & 32768;
        if (i22 == 0) {
        }
        if ((i42 & 1572864) == 0) {
        }
        i23 = i62 & 131072;
        if (i23 == 0) {
        }
        i24 = i62 & 262144;
        if (i24 == 0) {
        }
        if ((i42 & 805306368) == 0) {
        }
        if ((i52 & 6) != 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:356:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:659:? A[RETURN, SYNTHETIC] */
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TextField(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i3, int i4, int i5, int i6) {
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
        KeyboardActions keyboardActions4;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        boolean z9;
        int i32;
        int i33;
        MutableInteractionSource mutableInteractionSource5;
        Shape shape4;
        TextFieldColors textFieldColors2;
        Function2 function212;
        Function2 function213;
        Modifier modifier3;
        Function2 function214;
        Function2 function215;
        boolean z10;
        boolean z11;
        TextStyle textStyle3;
        Function2 function216;
        boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1523846136);
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
                                                composerStartRestartGroup.startReplaceableGroup(-1263318290);
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
                                                shape2 = TextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
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
                                                textFieldColorsColors = TextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, i27);
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
                                            ComposerKt.traceEventStart(1523846136, i28, i29, "androidx.compose.material3.TextField (TextField.kt:469)");
                                        }
                                        int i36 = i29 << 6;
                                        TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier2, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function211, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColorsColors, composer2, i28 & 2147483646, (i36 & 896) | 54 | (i36 & 7168) | (57344 & i36) | (458752 & i36) | (3670016 & i36) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192), ((i29 >> 24) & 126) | ((i25 << 6) & 896), 0);
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
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.10
                                            public final /* synthetic */ int $$changed;
                                            public final /* synthetic */ int $$changed1;
                                            public final /* synthetic */ int $$changed2;
                                            public final /* synthetic */ int $$default;
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;
                                            public final /* synthetic */ KeyboardActions $keyboardActions;
                                            public final /* synthetic */ KeyboardOptions $keyboardOptions;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                            public final /* synthetic */ int $maxLines;
                                            public final /* synthetic */ int $minLines;
                                            public final /* synthetic */ Modifier $modifier;
                                            public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                            public final /* synthetic */ boolean $readOnly;
                                            public final /* synthetic */ Shape $shape;
                                            public final /* synthetic */ boolean $singleLine;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                            public final /* synthetic */ TextStyle $textStyle;
                                            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                            public final /* synthetic */ VisualTransformation $visualTransformation;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            public C166610(Function1<? super TextFieldValue, Unit> function12, Modifier modifier32, boolean z102, boolean z122, TextStyle textStyle32, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2152, Function2<? super Composer, ? super Integer, Unit> function2162, boolean z112, VisualTransformation visualTransformation32, KeyboardOptions keyboardOptions32, KeyboardActions keyboardActions42, boolean z92, int i322, int i332, MutableInteractionSource mutableInteractionSource52, Shape shape42, TextFieldColors textFieldColors22, int i37, int i42, int i52, int i62) {
                                                super(2);
                                                function1 = function12;
                                                modifier = modifier32;
                                                z = z102;
                                                z = z122;
                                                textStyle = textStyle32;
                                                function2 = function2122;
                                                function2 = function2142;
                                                function2 = function2132;
                                                function2 = function2152;
                                                function2 = function2162;
                                                z = z112;
                                                visualTransformation = visualTransformation32;
                                                keyboardOptions = keyboardOptions32;
                                                keyboardActions = keyboardActions42;
                                                z = z92;
                                                i = i322;
                                                i = i332;
                                                mutableInteractionSource = mutableInteractionSource52;
                                                shape = shape42;
                                                textFieldColors = textFieldColors22;
                                                i = i37;
                                                i = i42;
                                                i = i52;
                                                i = i62;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@Nullable Composer composer3, int i37) {
                                                TextFieldKt.TextField(textFieldValue, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i34 |= CpioConstants.C_ISBLK;
                                i21 = i20;
                                i22 = i62 & 32768;
                                if (i22 == 0) {
                                }
                                if ((i42 & 1572864) == 0) {
                                }
                                i23 = i62 & 131072;
                                if (i23 == 0) {
                                }
                                i24 = i62 & 262144;
                                if (i24 == 0) {
                                }
                                if ((i42 & 805306368) == 0) {
                                }
                                if ((i52 & 6) != 0) {
                                }
                                if ((i7 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i37 & 1) != 0) {
                                        if (i8 == 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if ((i62 & 32) == 0) {
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
                                        if ((i62 & 65536) == 0) {
                                        }
                                        if (i23 == 0) {
                                        }
                                        if (i24 == 0) {
                                        }
                                        if ((i62 & 524288) == 0) {
                                        }
                                        Function2 function2212 = function219;
                                        if ((i62 & 1048576) == 0) {
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
                                        TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function12, modifier2, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function211, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColorsColors, composer2, i28 & 2147483646, (i362 & 896) | 54 | (i362 & 7168) | (57344 & i362) | (458752 & i362) | (3670016 & i362) | (29360128 & i362) | (234881024 & i362) | (i362 & 1879048192), ((i29 >> 24) & 126) | ((i25 << 6) & 896), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        keyboardActions42 = keyboardActions3;
                                        visualTransformation32 = visualTransformation2;
                                        keyboardOptions32 = keyboardOptions2;
                                        z92 = z6;
                                        i322 = i30;
                                        i332 = i31;
                                        mutableInteractionSource52 = mutableInteractionSource4;
                                        shape42 = shape3;
                                        textFieldColors22 = textFieldColorsColors;
                                        function2122 = function28;
                                        function2132 = function210;
                                        modifier32 = modifier2;
                                        function2142 = function26;
                                        function2152 = function29;
                                        z102 = z5;
                                        z112 = z8;
                                        textStyle32 = textStyle2;
                                        function2162 = function211;
                                        z122 = z7;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i20 = i62 & 16384;
                            if (i20 == 0) {
                            }
                            i22 = i62 & 32768;
                            if (i22 == 0) {
                            }
                            if ((i42 & 1572864) == 0) {
                            }
                            i23 = i62 & 131072;
                            if (i23 == 0) {
                            }
                            i24 = i62 & 262144;
                            if (i24 == 0) {
                            }
                            if ((i42 & 805306368) == 0) {
                            }
                            if ((i52 & 6) != 0) {
                            }
                            if ((i7 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i19 = i62 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i62 & 16384;
                        if (i20 == 0) {
                        }
                        i22 = i62 & 32768;
                        if (i22 == 0) {
                        }
                        if ((i42 & 1572864) == 0) {
                        }
                        i23 = i62 & 131072;
                        if (i23 == 0) {
                        }
                        i24 = i62 & 262144;
                        if (i24 == 0) {
                        }
                        if ((i42 & 805306368) == 0) {
                        }
                        if ((i52 & 6) != 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i37 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    i11 = i62 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i62 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i62 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i62 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i62 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i62 & 2048;
                    if (i17 != 0) {
                    }
                    int i342 = i16;
                    i18 = i62 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i62 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i62 & 16384;
                    if (i20 == 0) {
                    }
                    i22 = i62 & 32768;
                    if (i22 == 0) {
                    }
                    if ((i42 & 1572864) == 0) {
                    }
                    i23 = i62 & 131072;
                    if (i23 == 0) {
                    }
                    i24 = i62 & 262144;
                    if (i24 == 0) {
                    }
                    if ((i42 & 805306368) == 0) {
                    }
                    if ((i52 & 6) != 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i10 = i62 & 16;
                if (i10 == 0) {
                }
                if ((i37 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                i11 = i62 & 64;
                if (i11 != 0) {
                }
                i12 = i62 & 128;
                if (i12 != 0) {
                }
                i13 = i62 & 256;
                if (i13 != 0) {
                }
                i14 = i62 & 512;
                if (i14 != 0) {
                }
                i15 = i62 & 1024;
                if (i15 != 0) {
                }
                i17 = i62 & 2048;
                if (i17 != 0) {
                }
                int i3422 = i16;
                i18 = i62 & 4096;
                if (i18 != 0) {
                }
                i19 = i62 & 8192;
                if (i19 == 0) {
                }
                i20 = i62 & 16384;
                if (i20 == 0) {
                }
                i22 = i62 & 32768;
                if (i22 == 0) {
                }
                if ((i42 & 1572864) == 0) {
                }
                i23 = i62 & 131072;
                if (i23 == 0) {
                }
                i24 = i62 & 262144;
                if (i24 == 0) {
                }
                if ((i42 & 805306368) == 0) {
                }
                if ((i52 & 6) != 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i9 = i62 & 8;
            if (i9 != 0) {
            }
            i10 = i62 & 16;
            if (i10 == 0) {
            }
            if ((i37 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            i11 = i62 & 64;
            if (i11 != 0) {
            }
            i12 = i62 & 128;
            if (i12 != 0) {
            }
            i13 = i62 & 256;
            if (i13 != 0) {
            }
            i14 = i62 & 512;
            if (i14 != 0) {
            }
            i15 = i62 & 1024;
            if (i15 != 0) {
            }
            i17 = i62 & 2048;
            if (i17 != 0) {
            }
            int i34222 = i16;
            i18 = i62 & 4096;
            if (i18 != 0) {
            }
            i19 = i62 & 8192;
            if (i19 == 0) {
            }
            i20 = i62 & 16384;
            if (i20 == 0) {
            }
            i22 = i62 & 32768;
            if (i22 == 0) {
            }
            if ((i42 & 1572864) == 0) {
            }
            i23 = i62 & 131072;
            if (i23 == 0) {
            }
            i24 = i62 & 262144;
            if (i24 == 0) {
            }
            if ((i42 & 805306368) == 0) {
            }
            if ((i52 & 6) != 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i62 & 4;
        if (i8 == 0) {
        }
        i9 = i62 & 8;
        if (i9 != 0) {
        }
        i10 = i62 & 16;
        if (i10 == 0) {
        }
        if ((i37 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        i11 = i62 & 64;
        if (i11 != 0) {
        }
        i12 = i62 & 128;
        if (i12 != 0) {
        }
        i13 = i62 & 256;
        if (i13 != 0) {
        }
        i14 = i62 & 512;
        if (i14 != 0) {
        }
        i15 = i62 & 1024;
        if (i15 != 0) {
        }
        i17 = i62 & 2048;
        if (i17 != 0) {
        }
        int i342222 = i16;
        i18 = i62 & 4096;
        if (i18 != 0) {
        }
        i19 = i62 & 8192;
        if (i19 == 0) {
        }
        i20 = i62 & 16384;
        if (i20 == 0) {
        }
        i22 = i62 & 32768;
        if (i22 == 0) {
        }
        if ((i42 & 1572864) == 0) {
        }
        i23 = i62 & 131072;
        if (i23 == 0) {
        }
        i24 = i62 & 262144;
        if (i24 == 0) {
        }
        if ((i42 & 805306368) == 0) {
        }
        if ((i52 & 6) != 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(@NotNull Modifier modifier, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, boolean z, float f, @NotNull Function2<? super Composer, ? super Integer, Unit> function27, @Nullable Function2<? super Composer, ? super Integer, Unit> function28, @NotNull PaddingValues paddingValues, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        float f2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1830307184);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
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
            i4 = i2 | (composerStartRestartGroup.changedInstance(function27) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function28) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        int i7 = i4;
        if ((i6 & 306783379) != 306783378 || (i7 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830307184, i6, i7, "androidx.compose.material3.TextFieldLayout (TextField.kt:516)");
            }
            composerStartRestartGroup.startReplaceableGroup(243139239);
            boolean z2 = ((1879048192 & i6) == 536870912) | ((234881024 & i6) == 67108864) | ((i7 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objRememberedValue;
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
            Updater.m10877setimpl(composerM10870constructorimpl, textFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function27.invoke(composerStartRestartGroup, Integer.valueOf(i7 & 14));
            composerStartRestartGroup.startReplaceableGroup(-95271705);
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
            composerStartRestartGroup.startReplaceableGroup(-95271370);
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
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            if (function23 != null) {
                i5 = 0;
                fCalculateStartPadding = C2046Dp.m13666constructorimpl(RangesKt___RangesKt.coerceAtLeast(C2046Dp.m13666constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), C2046Dp.m13666constructorimpl(0)));
            } else {
                i5 = 0;
            }
            if (function24 != null) {
                fCalculateEndPadding = C2046Dp.m13666constructorimpl(RangesKt___RangesKt.coerceAtLeast(C2046Dp.m13666constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), C2046Dp.m13666constructorimpl(i5)));
            }
            composerStartRestartGroup.startReplaceableGroup(-95270430);
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
            composerStartRestartGroup.startReplaceableGroup(-95270031);
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
            composerStartRestartGroup.startReplaceableGroup(-95269633);
            if (function22 != null) {
                Modifier modifierM8127paddingqDBjuR0$default3 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m8160heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "Label"), DpKt.m13709lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f), 0.0f, 2, null), null, false, 3, null), fCalculateStartPadding, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor6 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default3);
                f2 = fCalculateStartPadding;
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
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 6) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                f2 = fCalculateStartPadding;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m8160heightInVpY3zN4$default(companion2, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            float fM13666constructorimpl = function25 == null ? f2 : C2046Dp.m13666constructorimpl(0);
            if (function26 != null) {
                fCalculateEndPadding = C2046Dp.m13666constructorimpl(0);
            }
            Modifier modifierM8127paddingqDBjuR0$default4 = PaddingKt.m8127paddingqDBjuR0$default(modifierWrapContentHeight$default, fM13666constructorimpl, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(-95268909);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(modifierM8127paddingqDBjuR0$default4), composerStartRestartGroup, Integer.valueOf((i6 >> 6) & 112));
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, "TextField").then(modifierM8127paddingqDBjuR0$default4);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor7 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierThen3);
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
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(243142996);
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
                function28.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 14));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextFieldLayout.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$changed1;
                public final /* synthetic */ float $animationProgress;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
                public final /* synthetic */ PaddingValues $paddingValues;
                public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> $placeholder;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                public final /* synthetic */ boolean $singleLine;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $supporting;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $textField;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16722(Function2<? super Composer, ? super Integer, Unit> function29, Function2<? super Composer, ? super Integer, Unit> function222, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function232, Function2<? super Composer, ? super Integer, Unit> function242, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function262, boolean z3, float f3, Function2<? super Composer, ? super Integer, Unit> function272, Function2<? super Composer, ? super Integer, Unit> function282, PaddingValues paddingValues2, int i8, int i22) {
                    super(2);
                    function2 = function29;
                    function2 = function222;
                    function3 = function32;
                    function2 = function232;
                    function2 = function242;
                    function2 = function252;
                    function2 = function262;
                    z = z3;
                    f = f3;
                    function2 = function272;
                    function2 = function282;
                    paddingValues = paddingValues2;
                    i = i8;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i8) {
                    TextFieldKt.TextFieldLayout(modifier, function2, function2, function3, function2, function2, function2, function2, z, f, function2, function2, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i));
                }
            });
        }
    }

    /* renamed from: calculateWidth-yeHjK3Y */
    public static final int m10021calculateWidthyeHjK3Y(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return Math.max(i + Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i2, Constraints.m13624getMinWidthimpl(j));
    }

    /* renamed from: calculateHeight-mKXJcVc */
    public static final int m10020calculateHeightmKXJcVc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, PaddingValues paddingValues) {
        boolean z = i2 > 0;
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(paddingValues.getTop() + paddingValues.getBottom()) * f2;
        if (z) {
            fM13666constructorimpl = MathHelpersKt.lerp(C2046Dp.m13666constructorimpl(TextFieldImplKt.getTextFieldPadding() * 2) * f2, fM13666constructorimpl, f);
        }
        return Math.max(Constraints.m13623getMinHeightimpl(j), Math.max(i3, Math.max(i4, MathKt__MathJVMKt.roundToInt(fM13666constructorimpl + MathHelpersKt.lerp(0, i2, f) + ComparisonsKt___ComparisonsJvmKt.maxOf(i, i7, i5, i6, MathHelpersKt.lerp(i2, 0, f))))) + i8);
    }

    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z, int i3, int i4, float f, float f2) {
        int iRoundToInt;
        Placeable.PlacementScope.m12661place70tqf50$default(placementScope, placeable8, IntOffset.INSTANCE.m13804getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                iRoundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero);
            } else {
                iRoundToInt = MathKt__MathJVMKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), iRoundToInt - MathKt__MathJVMKt.roundToInt((iRoundToInt - i3) * f), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - TextFieldImplKt.widthOrZero(placeable5)) - placeable7.getWidth(), i4, 0.0f, 4, null);
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable4) + TextFieldImplKt.widthOrZero(placeable6);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iWidthOrZero, i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iWidthOrZero, i4, 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z, float f, PaddingValues paddingValues) {
        Placeable.PlacementScope.m12661place70tqf50$default(placementScope, placeable7, IntOffset.INSTANCE.m13804getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable8);
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(paddingValues.getTop() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable5), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i - TextFieldImplKt.widthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable6), 0.0f, 4, null);
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable3) + TextFieldImplKt.widthOrZero(placeable5);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iWidthOrZero, placeWithoutLabel$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, iWidthOrZero, placeWithoutLabel$calculateVerticalPosition(z, iHeightOrZero, iRoundToInt, placeable2), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(boolean z, int i, int i2, Placeable placeable) {
        return z ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i) : i2;
    }

    /* compiled from: TextField.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldKt$drawIndicatorLine$1 */
    public static final class C16731 extends Lambda implements Function1<ContentDrawScope, Unit> {
        public final /* synthetic */ BorderStroke $indicatorBorder;
        public final /* synthetic */ float $strokeWidthDp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16731(float f, BorderStroke borderStroke) {
            super(1);
            f = f;
            borderStroke = borderStroke;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
            contentDrawScope.drawContent();
            if (C2046Dp.m13671equalsimpl0(f, C2046Dp.INSTANCE.m13684getHairlineD9Ej5fM())) {
                return;
            }
            float density = f * contentDrawScope.getDensity();
            float fM11165getHeightimpl = Size.m11165getHeightimpl(contentDrawScope.mo11889getSizeNHjbRc()) - (density / 2);
            DrawScope.m11875drawLine1RTmtNc$default(contentDrawScope, borderStroke.getBrush(), OffsetKt.Offset(0.0f, fM11165getHeightimpl), OffsetKt.Offset(Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc()), fM11165getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
        }
    }

    @NotNull
    public static final Modifier drawIndicatorLine(@NotNull Modifier modifier, @NotNull BorderStroke borderStroke) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TextFieldKt.drawIndicatorLine.1
            public final /* synthetic */ BorderStroke $indicatorBorder;
            public final /* synthetic */ float $strokeWidthDp;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16731(float f, BorderStroke borderStroke2) {
                super(1);
                f = f;
                borderStroke = borderStroke2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                if (C2046Dp.m13671equalsimpl0(f, C2046Dp.INSTANCE.m13684getHairlineD9Ej5fM())) {
                    return;
                }
                float density = f * contentDrawScope.getDensity();
                float fM11165getHeightimpl = Size.m11165getHeightimpl(contentDrawScope.mo11889getSizeNHjbRc()) - (density / 2);
                DrawScope.m11875drawLine1RTmtNc$default(contentDrawScope, borderStroke.getBrush(), OffsetKt.Offset(0.0f, fM11165getHeightimpl), OffsetKt.Offset(Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc()), fM11165getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getTextFieldWithLabelVerticalPadding() {
        return TextFieldWithLabelVerticalPadding;
    }
}
