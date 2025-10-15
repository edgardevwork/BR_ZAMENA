package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.p003ui.Alignment;
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
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OutlinedTextField.kt */
@Metadata(m7104d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0087\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+\u001a\u0091\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010-\u001a\u0087\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010.\u001a\u0091\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010/\u001aÁ\u0001\u00100\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0002\b\u00172\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u0010\"\u001a\u00020\u00112\u0006\u00104\u001a\u0002052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\t0\r2\u0011\u00108\u001a\r\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u00172\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\u0010;\u001aZ\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aZ\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010F\u001a&\u0010N\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010O\u001a\u0002072\u0006\u00109\u001a\u00020:H\u0000ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a|\u0010R\u001a\u00020\t*\u00020S2\u0006\u0010T\u001a\u00020$2\u0006\u0010U\u001a\u00020$2\b\u0010V\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010Y\u001a\u00020W2\b\u0010Z\u001a\u0004\u0018\u00010W2\b\u0010[\u001a\u0004\u0018\u00010W2\u0006\u0010\\\u001a\u00020W2\u0006\u00104\u001a\u0002052\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010D\u001a\u0002052\u0006\u0010]\u001a\u00020^2\u0006\u00109\u001a\u00020:H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006_"}, m7105d2 = {"BorderId", "", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "OutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", OutlinedTextFieldKt.BorderId, "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-O3s9Psw", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,984:1\n74#2:985\n74#2:995\n74#2:1003\n74#2:1013\n74#2:1030\n25#3:986\n25#3:996\n25#3:1004\n25#3:1014\n83#3,3:1021\n456#3,8:1042\n464#3,3:1056\n456#3,8:1075\n464#3,3:1089\n467#3,3:1093\n456#3,8:1114\n464#3,3:1128\n467#3,3:1132\n456#3,8:1160\n464#3,3:1174\n467#3,3:1178\n456#3,8:1200\n464#3,3:1214\n467#3,3:1218\n467#3,3:1223\n1116#4,6:987\n1116#4,6:997\n1116#4,6:1005\n1116#4,6:1015\n1116#4,6:1024\n658#5:993\n646#5:994\n658#5:1011\n646#5:1012\n79#6,11:1031\n79#6,11:1064\n92#6:1096\n79#6,11:1103\n92#6:1135\n79#6,11:1149\n92#6:1181\n79#6,11:1189\n92#6:1221\n92#6:1226\n3737#7,6:1050\n3737#7,6:1083\n3737#7,6:1122\n3737#7,6:1168\n3737#7,6:1208\n69#8,5:1059\n74#8:1092\n78#8:1097\n69#8,5:1098\n74#8:1131\n78#8:1136\n68#8,6:1143\n74#8:1177\n78#8:1182\n68#8,6:1183\n74#8:1217\n78#8:1222\n58#9:1137\n58#9:1140\n51#9:1227\n154#10:1138\n211#10:1139\n154#10:1141\n211#10:1142\n154#10:1228\n154#10:1229\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt\n*L\n142#1:985\n233#1:995\n344#1:1003\n435#1:1013\n502#1:1030\n154#1:986\n244#1:996\n356#1:1004\n446#1:1014\n494#1:1021,3\n503#1:1042,8\n503#1:1056,3\n514#1:1075,8\n514#1:1089,3\n514#1:1093,3\n522#1:1114,8\n522#1:1128,3\n522#1:1132,3\n550#1:1160,8\n550#1:1174,3\n550#1:1178,3\n558#1:1200,8\n558#1:1214,3\n558#1:1218,3\n503#1:1223,3\n154#1:987,6\n244#1:997,6\n356#1:1005,6\n446#1:1015,6\n494#1:1024,6\n159#1:993\n159#1:994\n361#1:1011\n361#1:1012\n503#1:1031,11\n514#1:1064,11\n514#1:1096\n522#1:1103,11\n522#1:1135\n550#1:1149,11\n550#1:1181\n558#1:1189,11\n558#1:1221\n503#1:1226\n503#1:1050,6\n514#1:1083,6\n522#1:1122,6\n550#1:1168,6\n558#1:1208,6\n514#1:1059,5\n514#1:1092\n514#1:1097\n522#1:1098,5\n522#1:1131\n522#1:1136\n550#1:1143,6\n550#1:1177\n550#1:1182\n558#1:1183,6\n558#1:1217\n558#1:1222\n534#1:1137\n541#1:1140\n815#1:1227\n535#1:1138\n534#1:1139\n541#1:1141\n541#1:1142\n973#1:1228\n981#1:1229\n*E\n"})
/* loaded from: classes2.dex */
public final class OutlinedTextFieldKt {

    @NotNull
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = C2046Dp.m13666constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = C2046Dp.m13666constructorimpl(8);

    /* compiled from: OutlinedTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$10 */
    /* loaded from: classes3.dex */
    public static final class C114410 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
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
        public final /* synthetic */ TextStyle $textStyle;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114410(Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5) {
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
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            OutlinedTextFieldKt.OutlinedTextField(textFieldValue, function1, modifier, z, z, textStyle, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$12 */
    /* loaded from: classes3.dex */
    public static final class C114512 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
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
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ TextStyle $textStyle;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114512(Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i2, int i3, int i4) {
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
            z = z3;
            visualTransformation = visualTransformation;
            keyboardOptions = keyboardOptions;
            keyboardActions = keyboardActions;
            z = z4;
            i = i;
            mutableInteractionSource = mutableInteractionSource;
            shape = shape;
            textFieldColors = textFieldColors;
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
            OutlinedTextFieldKt.OutlinedTextField(textFieldValue, function1, modifier, z, z, textStyle, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$4 */
    /* loaded from: classes3.dex */
    public static final class C11484 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
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
        public final /* synthetic */ TextStyle $textStyle;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11484(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5) {
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
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            OutlinedTextFieldKt.OutlinedTextField(str, function1, modifier, z, z, textStyle, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$6 */
    /* loaded from: classes3.dex */
    public static final class C11496 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
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
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function1<String, Unit> $onValueChange;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ TextStyle $textStyle;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11496(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i2, int i3, int i4) {
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
            z = z3;
            visualTransformation = visualTransformation;
            keyboardOptions = keyboardOptions;
            keyboardActions = keyboardActions;
            z = z4;
            i = i;
            mutableInteractionSource = mutableInteractionSource;
            shape = shape;
            textFieldColors = textFieldColors;
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
            OutlinedTextFieldKt.OutlinedTextField(str, function1, modifier, z, z, textStyle, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2 */
    /* loaded from: classes3.dex */
    public static final class C11522 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ float $animationProgress;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $border;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
        public final /* synthetic */ Function1<Size, Unit> $onLabelMeasured;
        public final /* synthetic */ PaddingValues $paddingValues;
        public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $textField;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11522(Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z, float f, Function1<? super Size, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function25, PaddingValues paddingValues, int i, int i2) {
            super(2);
            function2 = function2;
            function3 = function3;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            z = z;
            f = f;
            function1 = function1;
            function2 = function25;
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
            OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, function2, function3, function2, function2, function2, z, f, function1, function2, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:350:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:647:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(@NotNull String str, @NotNull Function1<? super String, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable TextStyle textStyle, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, @Nullable VisualTransformation visualTransformation, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, boolean z4, int i, int i2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, @Nullable TextFieldColors textFieldColors, @Nullable Composer composer, int i3, int i4, int i5) {
        int i6;
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
        Modifier modifier2;
        boolean z5;
        boolean z6;
        TextStyle textStyle2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        boolean z7;
        VisualTransformation none;
        KeyboardOptions keyboardOptions2;
        boolean z8;
        int i23;
        int i24;
        int i25;
        Function2<? super Composer, ? super Integer, Unit> function27;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape small;
        int i26;
        TextFieldColors textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs;
        Shape shape2;
        KeyboardActions keyboardActions2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i27;
        int i28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        MutableInteractionSource mutableInteractionSource4;
        boolean z9;
        long jM13195getColor0d7_KjU;
        int i29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        MutableInteractionSource mutableInteractionSource5;
        Function2<? super Composer, ? super Integer, Unit> function211;
        boolean z10;
        Shape shape3;
        TextStyle textStyle3;
        TextFieldColors textFieldColors2;
        Function2<? super Composer, ? super Integer, Unit> function212;
        boolean z11;
        int i30;
        KeyboardActions keyboardActions3;
        KeyboardOptions keyboardOptions3;
        Function2<? super Composer, ? super Integer, Unit> function213;
        boolean z12;
        Modifier modifier3;
        VisualTransformation visualTransformation2;
        boolean z13;
        int i31;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-621914704);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 112) == 0) {
                i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i3 & 896) == 0) {
                    i6 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i3 & 7168) == 0) {
                        i6 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= CpioConstants.C_ISBLK;
                    } else if ((i3 & 57344) == 0) {
                        i6 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    if ((i3 & 458752) == 0) {
                        i6 |= ((i5 & 32) == 0 && composerStartRestartGroup.changed(textStyle)) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 234881024) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i13 = i5 & 512;
                    if (i13 == 0) {
                        i6 |= 805306368;
                    } else if ((i3 & 1879048192) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                    }
                    i14 = i5 & 1024;
                    if (i14 == 0) {
                        i15 = i4 | 6;
                    } else if ((i4 & 14) == 0) {
                        i15 = i4 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                    } else {
                        i15 = i4;
                    }
                    i16 = i5 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                    } else if ((i4 & 112) == 0) {
                        i15 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                    }
                    int i32 = i15;
                    i17 = i5 & 4096;
                    if (i17 == 0) {
                        i32 |= 384;
                    } else {
                        if ((i4 & 896) == 0) {
                            i32 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                        }
                        i18 = i5 & 8192;
                        if (i18 != 0) {
                            i32 |= 3072;
                        } else {
                            if ((i4 & 7168) == 0) {
                                i32 |= composerStartRestartGroup.changed(keyboardActions) ? 2048 : 1024;
                            }
                            i19 = i5 & 16384;
                            if (i19 != 0) {
                                if ((i4 & 57344) == 0) {
                                    i20 = i19;
                                    i32 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                                }
                                if ((i4 & 458752) == 0) {
                                    i32 |= ((i5 & 32768) == 0 && composerStartRestartGroup.changed(i)) ? 131072 : 65536;
                                }
                                i21 = i5 & 65536;
                                if (i21 != 0) {
                                    i32 |= 1572864;
                                } else if ((i4 & 3670016) == 0) {
                                    i32 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                                }
                                i22 = i5 & 131072;
                                if (i22 != 0) {
                                    i32 |= 12582912;
                                } else if ((i4 & 29360128) == 0) {
                                    i32 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                                }
                                if ((i4 & 234881024) == 0) {
                                    i32 |= ((i5 & 262144) == 0 && composerStartRestartGroup.changed(shape)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                                }
                                if ((i4 & 1879048192) == 0) {
                                    i32 |= ((i5 & 524288) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 536870912 : 268435456;
                                }
                                if ((i6 & 1533916891) != 306783378 || (1533916891 & i32) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        modifier2 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                        z5 = i8 == 0 ? true : z;
                                        z6 = i9 == 0 ? false : z2;
                                        if ((i5 & 32) == 0) {
                                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                            i6 &= -458753;
                                        } else {
                                            textStyle2 = textStyle;
                                        }
                                        function25 = i10 == 0 ? null : function2;
                                        function26 = i11 == 0 ? null : function22;
                                        Function2<? super Composer, ? super Integer, Unit> function214 = i12 == 0 ? null : function23;
                                        Function2<? super Composer, ? super Integer, Unit> function215 = i13 == 0 ? null : function24;
                                        z7 = i14 == 0 ? false : z3;
                                        none = i16 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        keyboardOptions2 = i17 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                        KeyboardActions keyboardActions4 = i18 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                        z8 = i20 == 0 ? false : z4;
                                        if ((i5 & 32768) == 0) {
                                            i23 = i32 & (-458753);
                                            i24 = z8 ? 1 : Integer.MAX_VALUE;
                                        } else {
                                            i23 = i32;
                                            i24 = i;
                                        }
                                        i25 = i21 == 0 ? 1 : i2;
                                        Function2<? super Composer, ? super Integer, Unit> function216 = function214;
                                        if (i22 == 0) {
                                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            function27 = function215;
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                        } else {
                                            function27 = function215;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                        if ((262144 & i5) == 0) {
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                            i26 = i23 & (-234881025);
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            small = shape;
                                            i26 = i23;
                                        }
                                        if ((i5 & 524288) == 0) {
                                            i26 &= -1879048193;
                                            shape2 = small;
                                            i = i24;
                                            keyboardActions2 = keyboardActions4;
                                            textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m9068outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                        } else {
                                            textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                            shape2 = small;
                                            i = i24;
                                            keyboardActions2 = keyboardActions4;
                                        }
                                        function28 = function216;
                                        i27 = i26;
                                        i28 = i6;
                                        function29 = function27;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i5 & 32) != 0) {
                                            i31 = -458753;
                                            i6 &= -458753;
                                        } else {
                                            i31 = -458753;
                                        }
                                        if ((32768 & i5) != 0) {
                                            i32 &= i31;
                                        }
                                        if ((262144 & i5) != 0) {
                                            i32 &= -234881025;
                                        }
                                        if ((i5 & 524288) != 0) {
                                            i32 &= -1879048193;
                                        }
                                        modifier2 = modifier;
                                        z5 = z;
                                        z6 = z2;
                                        textStyle2 = textStyle;
                                        function25 = function2;
                                        function26 = function22;
                                        function28 = function23;
                                        function29 = function24;
                                        z7 = z3;
                                        none = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        z8 = z4;
                                        i25 = i2;
                                        shape2 = shape;
                                        textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                        i27 = i32;
                                        keyboardActions2 = keyboardActions;
                                        i28 = i6;
                                        mutableInteractionSource4 = mutableInteractionSource;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        z9 = z6;
                                    } else {
                                        z9 = z6;
                                        ComposerKt.traceEventStart(-621914704, i28, i27, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:156)");
                                    }
                                    composerStartRestartGroup.startReplaceableGroup(1961395303);
                                    jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                                    if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                        jM13195getColor0d7_KjU = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs.textColor(z5, composerStartRestartGroup, ((i28 >> 9) & 14) | ((i27 >> 24) & 112)).getValue().m11350unboximpl();
                                    }
                                    long j = jM13195getColor0d7_KjU;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    TextStyle textStyleMerge = textStyle2.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                    int i33 = (i27 >> 24) & 112;
                                    Function2<? super Composer, ? super Integer, Unit> function217 = function28;
                                    Function2<? super Composer, ? super Integer, Unit> function218 = function29;
                                    Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(BackgroundKt.m7770backgroundbw27NRU(function25 == null ? PaddingKt.m8127paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, C11462.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs.backgroundColor(z5, composerStartRestartGroup, ((i28 >> 9) & 14) | i33).getValue().m11350unboximpl(), shape2), z7, Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9018getDefaultErrorMessageUdPEhr4(), composerStartRestartGroup, 6));
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    Modifier modifier4 = modifier2;
                                    int i34 = i27 << 12;
                                    BasicTextFieldKt.BasicTextField(str, function1, SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, textFieldDefaults.m9065getMinWidthD9Ej5fM(), textFieldDefaults.m9064getMinHeightD9Ej5fM()), z5, z9, textStyleMerge, keyboardOptions4, keyboardActions2, z8, i, i25, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs.cursorColor(z7, composerStartRestartGroup, (i27 & 14) | i33).getValue().m11350unboximpl(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1710364390, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.3
                                        public final /* synthetic */ TextFieldColors $colors;
                                        public final /* synthetic */ boolean $enabled;
                                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                                        public final /* synthetic */ boolean $isError;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                        public final /* synthetic */ Shape $shape;
                                        public final /* synthetic */ boolean $singleLine;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                        public final /* synthetic */ String $value;
                                        public final /* synthetic */ VisualTransformation $visualTransformation;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        public C11473(String str2, boolean z52, boolean z82, VisualTransformation none2, MutableInteractionSource mutableInteractionSource42, boolean z72, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function262, Function2<? super Composer, ? super Integer, Unit> function2172, Function2<? super Composer, ? super Integer, Unit> function2182, TextFieldColors textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2, Shape shape22) {
                                            super(3);
                                            str = str2;
                                            z = z52;
                                            z = z82;
                                            visualTransformation = none2;
                                            mutableInteractionSource = mutableInteractionSource42;
                                            z = z72;
                                            function2 = function252;
                                            function2 = function262;
                                            function2 = function2172;
                                            function2 = function2182;
                                            textFieldColors = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2;
                                            shape = shape22;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer2, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @Composable
                                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function219, @Nullable Composer composer2, int i35) {
                                            int i36;
                                            if ((i35 & 14) == 0) {
                                                i36 = i35 | (composer2.changedInstance(function219) ? 4 : 2);
                                            } else {
                                                i36 = i35;
                                            }
                                            if ((i36 & 91) != 18 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1710364390, i36, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:194)");
                                                }
                                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                                String str2 = str;
                                                boolean z14 = z;
                                                boolean z15 = z;
                                                VisualTransformation visualTransformation3 = visualTransformation;
                                                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource;
                                                boolean z16 = z;
                                                Function2<Composer, Integer, Unit> function220 = function2;
                                                Function2<Composer, Integer, Unit> function221 = function2;
                                                Function2<Composer, Integer, Unit> function222 = function2;
                                                Function2<Composer, Integer, Unit> function223 = function2;
                                                TextFieldColors textFieldColors3 = textFieldColors;
                                                textFieldDefaults2.OutlinedTextFieldDecorationBox(str2, function219, z14, z15, visualTransformation3, mutableInteractionSource6, z16, function220, function221, function222, function223, textFieldColors3, null, ComposableLambdaKt.composableLambda(composer2, -1823843281, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.3.1
                                                    public final /* synthetic */ TextFieldColors $colors;
                                                    public final /* synthetic */ boolean $enabled;
                                                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                                                    public final /* synthetic */ boolean $isError;
                                                    public final /* synthetic */ Shape $shape;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(boolean z142, boolean z162, MutableInteractionSource mutableInteractionSource62, TextFieldColors textFieldColors32, Shape shape4) {
                                                        super(2);
                                                        z = z142;
                                                        z = z162;
                                                        mutableInteractionSource = mutableInteractionSource62;
                                                        textFieldColors = textFieldColors32;
                                                        shape = shape4;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        invoke(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                    @Composable
                                                    public final void invoke(@Nullable Composer composer3, int i37) {
                                                        if ((i37 & 11) != 2 || !composer3.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1823843281, i37, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:208)");
                                                            }
                                                            TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer3, 12582912, 96);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer3.skipToGroupEnd();
                                                    }
                                                }), composer2, (i36 << 3) & 112, 27648, 4096);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }

                                        /* compiled from: OutlinedTextField.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3$1 */
                                        public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;
                                            public final /* synthetic */ Shape $shape;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(boolean z142, boolean z162, MutableInteractionSource mutableInteractionSource62, TextFieldColors textFieldColors32, Shape shape4) {
                                                super(2);
                                                z = z142;
                                                z = z162;
                                                mutableInteractionSource = mutableInteractionSource62;
                                                textFieldColors = textFieldColors32;
                                                shape = shape4;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i37) {
                                                if ((i37 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1823843281, i37, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:208)");
                                                    }
                                                    TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer3, 12582912, 96);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }
                                    }), composerStartRestartGroup, (64638 & i28) | (i34 & 3670016) | (i34 & 29360128) | (234881024 & i34) | (i34 & 1879048192), ((i27 >> 18) & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21 | (i27 & 112) | ((i27 >> 12) & 7168), 4096);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    i29 = i;
                                    function210 = function2182;
                                    mutableInteractionSource5 = mutableInteractionSource42;
                                    function211 = function262;
                                    z10 = z52;
                                    shape3 = shape22;
                                    textStyle3 = textStyle2;
                                    textFieldColors2 = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2;
                                    function212 = function252;
                                    z11 = z82;
                                    i30 = i25;
                                    keyboardActions3 = keyboardActions2;
                                    keyboardOptions3 = keyboardOptions4;
                                    function213 = function2172;
                                    z12 = z72;
                                    modifier3 = modifier4;
                                    visualTransformation2 = none2;
                                    z13 = z9;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    z10 = z;
                                    z13 = z2;
                                    textStyle3 = textStyle;
                                    function212 = function2;
                                    function211 = function22;
                                    function213 = function23;
                                    function210 = function24;
                                    z12 = z3;
                                    visualTransformation2 = visualTransformation;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActions3 = keyboardActions;
                                    z11 = z4;
                                    i29 = i;
                                    i30 = i2;
                                    mutableInteractionSource5 = mutableInteractionSource;
                                    shape3 = shape;
                                    textFieldColors2 = textFieldColors;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.4
                                        public final /* synthetic */ int $$changed;
                                        public final /* synthetic */ int $$changed1;
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
                                        public final /* synthetic */ TextStyle $textStyle;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                        public final /* synthetic */ String $value;
                                        public final /* synthetic */ VisualTransformation $visualTransformation;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        public C11484(String str2, Function1<? super String, Unit> function12, Modifier modifier32, boolean z102, boolean z132, TextStyle textStyle32, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2102, boolean z122, VisualTransformation visualTransformation22, KeyboardOptions keyboardOptions32, KeyboardActions keyboardActions32, boolean z112, int i292, int i302, MutableInteractionSource mutableInteractionSource52, Shape shape32, TextFieldColors textFieldColors22, int i35, int i42, int i52) {
                                            super(2);
                                            str = str2;
                                            function1 = function12;
                                            modifier = modifier32;
                                            z = z102;
                                            z = z132;
                                            textStyle = textStyle32;
                                            function2 = function2122;
                                            function2 = function2112;
                                            function2 = function2132;
                                            function2 = function2102;
                                            z = z122;
                                            visualTransformation = visualTransformation22;
                                            keyboardOptions = keyboardOptions32;
                                            keyboardActions = keyboardActions32;
                                            z = z112;
                                            i = i292;
                                            i = i302;
                                            mutableInteractionSource = mutableInteractionSource52;
                                            shape = shape32;
                                            textFieldColors = textFieldColors22;
                                            i = i35;
                                            i = i42;
                                            i = i52;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@Nullable Composer composer2, int i35) {
                                            OutlinedTextFieldKt.OutlinedTextField(str, function1, modifier, z, z, textStyle, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i32 |= CpioConstants.C_ISBLK;
                            i20 = i19;
                            if ((i42 & 458752) == 0) {
                            }
                            i21 = i52 & 65536;
                            if (i21 != 0) {
                            }
                            i22 = i52 & 131072;
                            if (i22 != 0) {
                            }
                            if ((i42 & 234881024) == 0) {
                            }
                            if ((i42 & 1879048192) == 0) {
                            }
                            if ((i6 & 1533916891) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i35 & 1) != 0) {
                                    if (i7 == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if ((i52 & 32) == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if ((i52 & 32768) == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function2162 = function214;
                                    if (i22 == 0) {
                                    }
                                    if ((262144 & i52) == 0) {
                                    }
                                    if ((i52 & 524288) == 0) {
                                    }
                                    function28 = function2162;
                                    i27 = i26;
                                    i28 = i6;
                                    function29 = function27;
                                    mutableInteractionSource42 = mutableInteractionSource3;
                                    composerStartRestartGroup.endDefaults();
                                    KeyboardOptions keyboardOptions42 = keyboardOptions2;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceableGroup(1961395303);
                                    jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                                    if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                    }
                                    long j2 = jM13195getColor0d7_KjU;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    TextStyle textStyleMerge2 = textStyle2.merge(new TextStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                    int i332 = (i27 >> 24) & 112;
                                    Function2<? super Composer, ? super Integer, Unit> function2172 = function28;
                                    Function2<? super Composer, ? super Integer, Unit> function2182 = function29;
                                    Modifier modifierDefaultErrorSemantics2 = TextFieldImplKt.defaultErrorSemantics(BackgroundKt.m7770backgroundbw27NRU(function252 == null ? PaddingKt.m8127paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, C11462.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2.backgroundColor(z52, composerStartRestartGroup, ((i28 >> 9) & 14) | i332).getValue().m11350unboximpl(), shape22), z72, Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9018getDefaultErrorMessageUdPEhr4(), composerStartRestartGroup, 6));
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                    Modifier modifier42 = modifier2;
                                    int i342 = i27 << 12;
                                    BasicTextFieldKt.BasicTextField(str2, function12, SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics2, textFieldDefaults2.m9065getMinWidthD9Ej5fM(), textFieldDefaults2.m9064getMinHeightD9Ej5fM()), z52, z9, textStyleMerge2, keyboardOptions42, keyboardActions2, z82, i, i25, none2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource42, new SolidColor(textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2.cursorColor(z72, composerStartRestartGroup, (i27 & 14) | i332).getValue().m11350unboximpl(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1710364390, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.3
                                        public final /* synthetic */ TextFieldColors $colors;
                                        public final /* synthetic */ boolean $enabled;
                                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                                        public final /* synthetic */ boolean $isError;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                        public final /* synthetic */ Shape $shape;
                                        public final /* synthetic */ boolean $singleLine;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                        public final /* synthetic */ String $value;
                                        public final /* synthetic */ VisualTransformation $visualTransformation;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        public C11473(String str2, boolean z52, boolean z82, VisualTransformation none2, MutableInteractionSource mutableInteractionSource42, boolean z72, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function262, Function2<? super Composer, ? super Integer, Unit> function21722, Function2<? super Composer, ? super Integer, Unit> function21822, TextFieldColors textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2, Shape shape22) {
                                            super(3);
                                            str = str2;
                                            z = z52;
                                            z = z82;
                                            visualTransformation = none2;
                                            mutableInteractionSource = mutableInteractionSource42;
                                            z = z72;
                                            function2 = function252;
                                            function2 = function262;
                                            function2 = function21722;
                                            function2 = function21822;
                                            textFieldColors = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2;
                                            shape = shape22;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer2, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @Composable
                                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function219, @Nullable Composer composer2, int i35) {
                                            int i36;
                                            if ((i35 & 14) == 0) {
                                                i36 = i35 | (composer2.changedInstance(function219) ? 4 : 2);
                                            } else {
                                                i36 = i35;
                                            }
                                            if ((i36 & 91) != 18 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1710364390, i36, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:194)");
                                                }
                                                TextFieldDefaults textFieldDefaults22 = TextFieldDefaults.INSTANCE;
                                                String str2 = str;
                                                boolean z142 = z;
                                                boolean z15 = z;
                                                VisualTransformation visualTransformation3 = visualTransformation;
                                                MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource;
                                                boolean z162 = z;
                                                Function2<Composer, Integer, Unit> function220 = function2;
                                                Function2<Composer, Integer, Unit> function221 = function2;
                                                Function2<Composer, Integer, Unit> function222 = function2;
                                                Function2<Composer, Integer, Unit> function223 = function2;
                                                TextFieldColors textFieldColors32 = textFieldColors;
                                                textFieldDefaults22.OutlinedTextFieldDecorationBox(str2, function219, z142, z15, visualTransformation3, mutableInteractionSource62, z162, function220, function221, function222, function223, textFieldColors32, null, ComposableLambdaKt.composableLambda(composer2, -1823843281, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.3.1
                                                    public final /* synthetic */ TextFieldColors $colors;
                                                    public final /* synthetic */ boolean $enabled;
                                                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                                                    public final /* synthetic */ boolean $isError;
                                                    public final /* synthetic */ Shape $shape;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(boolean z1422, boolean z1622, MutableInteractionSource mutableInteractionSource622, TextFieldColors textFieldColors322, Shape shape4) {
                                                        super(2);
                                                        z = z1422;
                                                        z = z1622;
                                                        mutableInteractionSource = mutableInteractionSource622;
                                                        textFieldColors = textFieldColors322;
                                                        shape = shape4;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        invoke(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                    @Composable
                                                    public final void invoke(@Nullable Composer composer3, int i37) {
                                                        if ((i37 & 11) != 2 || !composer3.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1823843281, i37, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:208)");
                                                            }
                                                            TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer3, 12582912, 96);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer3.skipToGroupEnd();
                                                    }
                                                }), composer2, (i36 << 3) & 112, 27648, 4096);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }

                                        /* compiled from: OutlinedTextField.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3$1 */
                                        public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;
                                            public final /* synthetic */ Shape $shape;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(boolean z1422, boolean z1622, MutableInteractionSource mutableInteractionSource622, TextFieldColors textFieldColors322, Shape shape4) {
                                                super(2);
                                                z = z1422;
                                                z = z1622;
                                                mutableInteractionSource = mutableInteractionSource622;
                                                textFieldColors = textFieldColors322;
                                                shape = shape4;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i37) {
                                                if ((i37 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1823843281, i37, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:208)");
                                                    }
                                                    TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer3, 12582912, 96);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }
                                    }), composerStartRestartGroup, (64638 & i28) | (i342 & 3670016) | (i342 & 29360128) | (234881024 & i342) | (i342 & 1879048192), ((i27 >> 18) & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21 | (i27 & 112) | ((i27 >> 12) & 7168), 4096);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i292 = i;
                                    function2102 = function21822;
                                    mutableInteractionSource52 = mutableInteractionSource42;
                                    function2112 = function262;
                                    z102 = z52;
                                    shape32 = shape22;
                                    textStyle32 = textStyle2;
                                    textFieldColors22 = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2;
                                    function2122 = function252;
                                    z112 = z82;
                                    i302 = i25;
                                    keyboardActions32 = keyboardActions2;
                                    keyboardOptions32 = keyboardOptions42;
                                    function2132 = function21722;
                                    z122 = z72;
                                    modifier32 = modifier42;
                                    visualTransformation22 = none2;
                                    z132 = z9;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i19 = i52 & 16384;
                        if (i19 != 0) {
                        }
                        i20 = i19;
                        if ((i42 & 458752) == 0) {
                        }
                        i21 = i52 & 65536;
                        if (i21 != 0) {
                        }
                        i22 = i52 & 131072;
                        if (i22 != 0) {
                        }
                        if ((i42 & 234881024) == 0) {
                        }
                        if ((i42 & 1879048192) == 0) {
                        }
                        if ((i6 & 1533916891) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i18 = i52 & 8192;
                    if (i18 != 0) {
                    }
                    i19 = i52 & 16384;
                    if (i19 != 0) {
                    }
                    i20 = i19;
                    if ((i42 & 458752) == 0) {
                    }
                    i21 = i52 & 65536;
                    if (i21 != 0) {
                    }
                    i22 = i52 & 131072;
                    if (i22 != 0) {
                    }
                    if ((i42 & 234881024) == 0) {
                    }
                    if ((i42 & 1879048192) == 0) {
                    }
                    if ((i6 & 1533916891) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i9 = i52 & 16;
                if (i9 == 0) {
                }
                if ((i35 & 458752) == 0) {
                }
                i10 = i52 & 64;
                if (i10 == 0) {
                }
                i11 = i52 & 128;
                if (i11 == 0) {
                }
                i12 = i52 & 256;
                if (i12 == 0) {
                }
                i13 = i52 & 512;
                if (i13 == 0) {
                }
                i14 = i52 & 1024;
                if (i14 == 0) {
                }
                i16 = i52 & 2048;
                if (i16 == 0) {
                }
                int i322 = i15;
                i17 = i52 & 4096;
                if (i17 == 0) {
                }
                i18 = i52 & 8192;
                if (i18 != 0) {
                }
                i19 = i52 & 16384;
                if (i19 != 0) {
                }
                i20 = i19;
                if ((i42 & 458752) == 0) {
                }
                i21 = i52 & 65536;
                if (i21 != 0) {
                }
                i22 = i52 & 131072;
                if (i22 != 0) {
                }
                if ((i42 & 234881024) == 0) {
                }
                if ((i42 & 1879048192) == 0) {
                }
                if ((i6 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i52 & 8;
            if (i8 != 0) {
            }
            i9 = i52 & 16;
            if (i9 == 0) {
            }
            if ((i35 & 458752) == 0) {
            }
            i10 = i52 & 64;
            if (i10 == 0) {
            }
            i11 = i52 & 128;
            if (i11 == 0) {
            }
            i12 = i52 & 256;
            if (i12 == 0) {
            }
            i13 = i52 & 512;
            if (i13 == 0) {
            }
            i14 = i52 & 1024;
            if (i14 == 0) {
            }
            i16 = i52 & 2048;
            if (i16 == 0) {
            }
            int i3222 = i15;
            i17 = i52 & 4096;
            if (i17 == 0) {
            }
            i18 = i52 & 8192;
            if (i18 != 0) {
            }
            i19 = i52 & 16384;
            if (i19 != 0) {
            }
            i20 = i19;
            if ((i42 & 458752) == 0) {
            }
            i21 = i52 & 65536;
            if (i21 != 0) {
            }
            i22 = i52 & 131072;
            if (i22 != 0) {
            }
            if ((i42 & 234881024) == 0) {
            }
            if ((i42 & 1879048192) == 0) {
            }
            if ((i6 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i52 & 4;
        if (i7 == 0) {
        }
        i8 = i52 & 8;
        if (i8 != 0) {
        }
        i9 = i52 & 16;
        if (i9 == 0) {
        }
        if ((i35 & 458752) == 0) {
        }
        i10 = i52 & 64;
        if (i10 == 0) {
        }
        i11 = i52 & 128;
        if (i11 == 0) {
        }
        i12 = i52 & 256;
        if (i12 == 0) {
        }
        i13 = i52 & 512;
        if (i13 == 0) {
        }
        i14 = i52 & 1024;
        if (i14 == 0) {
        }
        i16 = i52 & 2048;
        if (i16 == 0) {
        }
        int i32222 = i15;
        i17 = i52 & 4096;
        if (i17 == 0) {
        }
        i18 = i52 & 8192;
        if (i18 != 0) {
        }
        i19 = i52 & 16384;
        if (i19 != 0) {
        }
        i20 = i19;
        if ((i42 & 458752) == 0) {
        }
        i21 = i52 & 65536;
        if (i21 != 0) {
        }
        i22 = i52 & 131072;
        if (i22 != 0) {
        }
        if ((i42 & 234881024) == 0) {
        }
        if ((i42 & 1879048192) == 0) {
        }
        if ((i6 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2 */
    /* loaded from: classes3.dex */
    public static final class C11462 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C11462 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3 */
    /* loaded from: classes3.dex */
    public static final class C11473 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11473(String str2, boolean z52, boolean z82, VisualTransformation none2, MutableInteractionSource mutableInteractionSource42, boolean z72, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function262, Function2<? super Composer, ? super Integer, Unit> function21722, Function2<? super Composer, ? super Integer, Unit> function21822, TextFieldColors textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2, Shape shape22) {
            super(3);
            str = str2;
            z = z52;
            z = z82;
            visualTransformation = none2;
            mutableInteractionSource = mutableInteractionSource42;
            z = z72;
            function2 = function252;
            function2 = function262;
            function2 = function21722;
            function2 = function21822;
            textFieldColors = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2;
            shape = shape22;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer2, Integer num) {
            invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function219, @Nullable Composer composer2, int i35) {
            int i36;
            if ((i35 & 14) == 0) {
                i36 = i35 | (composer2.changedInstance(function219) ? 4 : 2);
            } else {
                i36 = i35;
            }
            if ((i36 & 91) != 18 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1710364390, i36, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:194)");
                }
                TextFieldDefaults textFieldDefaults22 = TextFieldDefaults.INSTANCE;
                String str2 = str;
                boolean z1422 = z;
                boolean z15 = z;
                VisualTransformation visualTransformation3 = visualTransformation;
                MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource;
                boolean z1622 = z;
                Function2<Composer, Integer, Unit> function220 = function2;
                Function2<Composer, Integer, Unit> function221 = function2;
                Function2<Composer, Integer, Unit> function222 = function2;
                Function2<Composer, Integer, Unit> function223 = function2;
                TextFieldColors textFieldColors322 = textFieldColors;
                textFieldDefaults22.OutlinedTextFieldDecorationBox(str2, function219, z1422, z15, visualTransformation3, mutableInteractionSource622, z1622, function220, function221, function222, function223, textFieldColors322, null, ComposableLambdaKt.composableLambda(composer2, -1823843281, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.3.1
                    public final /* synthetic */ TextFieldColors $colors;
                    public final /* synthetic */ boolean $enabled;
                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                    public final /* synthetic */ boolean $isError;
                    public final /* synthetic */ Shape $shape;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(boolean z14222, boolean z16222, MutableInteractionSource mutableInteractionSource6222, TextFieldColors textFieldColors3222, Shape shape4) {
                        super(2);
                        z = z14222;
                        z = z16222;
                        mutableInteractionSource = mutableInteractionSource6222;
                        textFieldColors = textFieldColors3222;
                        shape = shape4;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i37) {
                        if ((i37 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1823843281, i37, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:208)");
                            }
                            TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer3, 12582912, 96);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, (i36 << 3) & 112, 27648, 4096);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }

        /* compiled from: OutlinedTextField.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3$1 */
        public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ TextFieldColors $colors;
            public final /* synthetic */ boolean $enabled;
            public final /* synthetic */ MutableInteractionSource $interactionSource;
            public final /* synthetic */ boolean $isError;
            public final /* synthetic */ Shape $shape;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(boolean z14222, boolean z16222, MutableInteractionSource mutableInteractionSource6222, TextFieldColors textFieldColors3222, Shape shape4) {
                super(2);
                z = z14222;
                z = z16222;
                mutableInteractionSource = mutableInteractionSource6222;
                textFieldColors = textFieldColors3222;
                shape = shape4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer3, int i37) {
                if ((i37 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1823843281, i37, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:208)");
                    }
                    TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer3, 12582912, 96);
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

    /* JADX WARN: Removed duplicated region for block: B:321:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:589:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void OutlinedTextField(String str, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i2, int i3, int i4) {
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
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Modifier modifier2;
        boolean z5;
        boolean z6;
        TextStyle textStyle2;
        Function2 function25;
        Function2 function26;
        boolean z7;
        VisualTransformation none;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z8;
        int i22;
        Function2 function27;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape small;
        Function2 function28;
        TextFieldColors textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs;
        int i23;
        int i24;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape2;
        Function2 function29;
        Composer composer2;
        Shape shape3;
        Shape shape4;
        MutableInteractionSource mutableInteractionSource5;
        KeyboardOptions keyboardOptions3;
        boolean z9;
        TextStyle textStyle3;
        TextFieldColors textFieldColors2;
        Function2 function210;
        boolean z10;
        int i25;
        boolean z11;
        Modifier modifier3;
        Function2 function211;
        KeyboardActions keyboardActions3;
        Function2 function212;
        Function2 function213;
        VisualTransformation visualTransformation2;
        boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2099955827);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 896) == 0) {
                    i5 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 7168) == 0) {
                        i5 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= CpioConstants.C_ISBLK;
                    } else if ((i2 & 57344) == 0) {
                        i5 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    if ((i2 & 458752) == 0) {
                        i5 |= ((i4 & 32) == 0 && composerStartRestartGroup.changed(textStyle)) ? 131072 : 65536;
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i12 = i4 & 512;
                    if (i12 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 1879048192) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                    }
                    i13 = i4 & 1024;
                    if (i13 == 0) {
                        i14 = i3 | 6;
                    } else if ((i3 & 14) == 0) {
                        i14 = i3 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                    } else {
                        i14 = i3;
                    }
                    i15 = i4 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                    } else if ((i3 & 112) == 0) {
                        i14 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                    }
                    int i26 = i14;
                    i16 = i4 & 4096;
                    if (i16 == 0) {
                        i26 |= 384;
                    } else {
                        if ((i3 & 896) == 0) {
                            i26 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                        }
                        i17 = i4 & 8192;
                        if (i17 != 0) {
                            i26 |= 3072;
                        } else {
                            if ((i3 & 7168) == 0) {
                                i26 |= composerStartRestartGroup.changed(keyboardActions) ? 2048 : 1024;
                            }
                            i18 = i4 & 16384;
                            if (i18 != 0) {
                                if ((i3 & 57344) == 0) {
                                    i19 = i18;
                                    i26 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                                }
                                i20 = i4 & 32768;
                                if (i20 != 0) {
                                    i26 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                                } else if ((i3 & 458752) == 0) {
                                    i26 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
                                }
                                i21 = i4 & 65536;
                                if (i21 != 0) {
                                    i26 |= 1572864;
                                } else if ((i3 & 3670016) == 0) {
                                    i26 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                                }
                                if ((i3 & 29360128) == 0) {
                                    i26 |= ((i4 & 131072) == 0 && composerStartRestartGroup.changed(shape)) ? 8388608 : 4194304;
                                }
                                if ((i3 & 234881024) == 0) {
                                    i26 |= ((i4 & 262144) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                                }
                                if ((i5 & 1533916891) != 306783378 || (191739611 & i26) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        modifier2 = i6 == 0 ? Modifier.INSTANCE : modifier;
                                        z5 = i7 == 0 ? true : z;
                                        z6 = i8 == 0 ? false : z2;
                                        if ((i4 & 32) == 0) {
                                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                            i5 &= -458753;
                                        } else {
                                            textStyle2 = textStyle;
                                        }
                                        function25 = i9 == 0 ? null : function2;
                                        function26 = i10 == 0 ? null : function22;
                                        Function2 function214 = i11 == 0 ? null : function23;
                                        Function2 function215 = i12 == 0 ? null : function24;
                                        z7 = i13 == 0 ? false : z3;
                                        none = i15 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        keyboardOptions2 = i16 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                        keyboardActions2 = i17 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                        z8 = i19 == 0 ? false : z4;
                                        i22 = i20 == 0 ? Integer.MAX_VALUE : i;
                                        Function2 function216 = function214;
                                        if (i21 == 0) {
                                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            function27 = function215;
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                        } else {
                                            function27 = function215;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                        if ((i4 & 131072) == 0) {
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                            i26 &= -29360129;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            small = shape;
                                        }
                                        if ((262144 & i4) == 0) {
                                            textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m9068outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                            i23 = i5;
                                            i24 = i26 & (-234881025);
                                            function28 = function27;
                                        } else {
                                            function28 = function27;
                                            textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                            i23 = i5;
                                            i24 = i26;
                                        }
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        shape2 = small;
                                        function29 = function216;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i4 & 32) != 0) {
                                            i5 &= -458753;
                                        }
                                        if ((i4 & 131072) != 0) {
                                            i26 &= -29360129;
                                        }
                                        if ((262144 & i4) != 0) {
                                            i26 &= -234881025;
                                        }
                                        modifier2 = modifier;
                                        z5 = z;
                                        z6 = z2;
                                        textStyle2 = textStyle;
                                        function25 = function2;
                                        function26 = function22;
                                        function29 = function23;
                                        function28 = function24;
                                        z7 = z3;
                                        none = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z8 = z4;
                                        i22 = i;
                                        textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                        i23 = i5;
                                        i24 = i26;
                                        mutableInteractionSource4 = mutableInteractionSource;
                                        shape2 = shape;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    composer2 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        shape3 = shape2;
                                    } else {
                                        shape3 = shape2;
                                        ComposerKt.traceEventStart(-2099955827, i23, i24, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:246)");
                                    }
                                    int i27 = i24 << 3;
                                    OutlinedTextField(str, (Function1<? super String, Unit>) function1, modifier2, z5, z6, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) function28, z7, none, keyboardOptions2, keyboardActions2, z8, i22, 1, mutableInteractionSource4, shape3, textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs, composer2, i23 & 2147483646, (i24 & 14) | 1572864 | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (29360128 & i27) | (234881024 & i27) | (i27 & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    shape4 = shape3;
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                    keyboardOptions3 = keyboardOptions2;
                                    z9 = z5;
                                    textStyle3 = textStyle2;
                                    textFieldColors2 = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs;
                                    function210 = function25;
                                    z10 = z8;
                                    i25 = i22;
                                    z11 = z7;
                                    modifier3 = modifier2;
                                    function211 = function26;
                                    keyboardActions3 = keyboardActions2;
                                    function212 = function29;
                                    function213 = function28;
                                    boolean z13 = z6;
                                    visualTransformation2 = none;
                                    z12 = z13;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    z9 = z;
                                    z12 = z2;
                                    textStyle3 = textStyle;
                                    function210 = function2;
                                    function211 = function22;
                                    function212 = function23;
                                    function213 = function24;
                                    z11 = z3;
                                    visualTransformation2 = visualTransformation;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActions3 = keyboardActions;
                                    z10 = z4;
                                    i25 = i;
                                    mutableInteractionSource5 = mutableInteractionSource;
                                    shape4 = shape;
                                    textFieldColors2 = textFieldColors;
                                    composer2 = composerStartRestartGroup;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.6
                                        public final /* synthetic */ int $$changed;
                                        public final /* synthetic */ int $$changed1;
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
                                        public final /* synthetic */ Modifier $modifier;
                                        public final /* synthetic */ Function1<String, Unit> $onValueChange;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                        public final /* synthetic */ boolean $readOnly;
                                        public final /* synthetic */ Shape $shape;
                                        public final /* synthetic */ boolean $singleLine;
                                        public final /* synthetic */ TextStyle $textStyle;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                        public final /* synthetic */ String $value;
                                        public final /* synthetic */ VisualTransformation $visualTransformation;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        public C11496(String str2, Function1<? super String, Unit> function12, Modifier modifier32, boolean z92, boolean z122, TextStyle textStyle32, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2132, boolean z112, VisualTransformation visualTransformation22, KeyboardOptions keyboardOptions32, KeyboardActions keyboardActions32, boolean z102, int i252, MutableInteractionSource mutableInteractionSource52, Shape shape42, TextFieldColors textFieldColors22, int i28, int i32, int i42) {
                                            super(2);
                                            str = str2;
                                            function1 = function12;
                                            modifier = modifier32;
                                            z = z92;
                                            z = z122;
                                            textStyle = textStyle32;
                                            function2 = function2102;
                                            function2 = function2112;
                                            function2 = function2122;
                                            function2 = function2132;
                                            z = z112;
                                            visualTransformation = visualTransformation22;
                                            keyboardOptions = keyboardOptions32;
                                            keyboardActions = keyboardActions32;
                                            z = z102;
                                            i = i252;
                                            mutableInteractionSource = mutableInteractionSource52;
                                            shape = shape42;
                                            textFieldColors = textFieldColors22;
                                            i = i28;
                                            i = i32;
                                            i = i42;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@Nullable Composer composer3, int i28) {
                                            OutlinedTextFieldKt.OutlinedTextField(str, function1, modifier, z, z, textStyle, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, mutableInteractionSource, shape, textFieldColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i26 |= CpioConstants.C_ISBLK;
                            i19 = i18;
                            i20 = i42 & 32768;
                            if (i20 != 0) {
                            }
                            i21 = i42 & 65536;
                            if (i21 != 0) {
                            }
                            if ((i32 & 29360128) == 0) {
                            }
                            if ((i32 & 234881024) == 0) {
                            }
                            if ((i5 & 1533916891) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i28 & 1) != 0) {
                                    if (i6 == 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if ((i42 & 32) == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    Function2 function2162 = function214;
                                    if (i21 == 0) {
                                    }
                                    if ((i42 & 131072) == 0) {
                                    }
                                    if ((262144 & i42) == 0) {
                                    }
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    shape2 = small;
                                    function29 = function2162;
                                    composerStartRestartGroup.endDefaults();
                                    composer2 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i272 = i24 << 3;
                                    OutlinedTextField(str2, (Function1<? super String, Unit>) function12, modifier2, z5, z6, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) function28, z7, none, keyboardOptions2, keyboardActions2, z8, i22, 1, mutableInteractionSource4, shape3, textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs, composer2, i23 & 2147483646, (i24 & 14) | 1572864 | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (29360128 & i272) | (234881024 & i272) | (i272 & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    shape42 = shape3;
                                    mutableInteractionSource52 = mutableInteractionSource4;
                                    keyboardOptions32 = keyboardOptions2;
                                    z92 = z5;
                                    textStyle32 = textStyle2;
                                    textFieldColors22 = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs;
                                    function2102 = function25;
                                    z102 = z8;
                                    i252 = i22;
                                    z112 = z7;
                                    modifier32 = modifier2;
                                    function2112 = function26;
                                    keyboardActions32 = keyboardActions2;
                                    function2122 = function29;
                                    function2132 = function28;
                                    boolean z132 = z6;
                                    visualTransformation22 = none;
                                    z122 = z132;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i18 = i42 & 16384;
                        if (i18 != 0) {
                        }
                        i19 = i18;
                        i20 = i42 & 32768;
                        if (i20 != 0) {
                        }
                        i21 = i42 & 65536;
                        if (i21 != 0) {
                        }
                        if ((i32 & 29360128) == 0) {
                        }
                        if ((i32 & 234881024) == 0) {
                        }
                        if ((i5 & 1533916891) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i17 = i42 & 8192;
                    if (i17 != 0) {
                    }
                    i18 = i42 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i18;
                    i20 = i42 & 32768;
                    if (i20 != 0) {
                    }
                    i21 = i42 & 65536;
                    if (i21 != 0) {
                    }
                    if ((i32 & 29360128) == 0) {
                    }
                    if ((i32 & 234881024) == 0) {
                    }
                    if ((i5 & 1533916891) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i42 & 16;
                if (i8 == 0) {
                }
                if ((i28 & 458752) == 0) {
                }
                i9 = i42 & 64;
                if (i9 == 0) {
                }
                i10 = i42 & 128;
                if (i10 == 0) {
                }
                i11 = i42 & 256;
                if (i11 == 0) {
                }
                i12 = i42 & 512;
                if (i12 == 0) {
                }
                i13 = i42 & 1024;
                if (i13 == 0) {
                }
                i15 = i42 & 2048;
                if (i15 == 0) {
                }
                int i262 = i14;
                i16 = i42 & 4096;
                if (i16 == 0) {
                }
                i17 = i42 & 8192;
                if (i17 != 0) {
                }
                i18 = i42 & 16384;
                if (i18 != 0) {
                }
                i19 = i18;
                i20 = i42 & 32768;
                if (i20 != 0) {
                }
                i21 = i42 & 65536;
                if (i21 != 0) {
                }
                if ((i32 & 29360128) == 0) {
                }
                if ((i32 & 234881024) == 0) {
                }
                if ((i5 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i7 = i42 & 8;
            if (i7 != 0) {
            }
            i8 = i42 & 16;
            if (i8 == 0) {
            }
            if ((i28 & 458752) == 0) {
            }
            i9 = i42 & 64;
            if (i9 == 0) {
            }
            i10 = i42 & 128;
            if (i10 == 0) {
            }
            i11 = i42 & 256;
            if (i11 == 0) {
            }
            i12 = i42 & 512;
            if (i12 == 0) {
            }
            i13 = i42 & 1024;
            if (i13 == 0) {
            }
            i15 = i42 & 2048;
            if (i15 == 0) {
            }
            int i2622 = i14;
            i16 = i42 & 4096;
            if (i16 == 0) {
            }
            i17 = i42 & 8192;
            if (i17 != 0) {
            }
            i18 = i42 & 16384;
            if (i18 != 0) {
            }
            i19 = i18;
            i20 = i42 & 32768;
            if (i20 != 0) {
            }
            i21 = i42 & 65536;
            if (i21 != 0) {
            }
            if ((i32 & 29360128) == 0) {
            }
            if ((i32 & 234881024) == 0) {
            }
            if ((i5 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i42 & 4;
        if (i6 == 0) {
        }
        i7 = i42 & 8;
        if (i7 != 0) {
        }
        i8 = i42 & 16;
        if (i8 == 0) {
        }
        if ((i28 & 458752) == 0) {
        }
        i9 = i42 & 64;
        if (i9 == 0) {
        }
        i10 = i42 & 128;
        if (i10 == 0) {
        }
        i11 = i42 & 256;
        if (i11 == 0) {
        }
        i12 = i42 & 512;
        if (i12 == 0) {
        }
        i13 = i42 & 1024;
        if (i13 == 0) {
        }
        i15 = i42 & 2048;
        if (i15 == 0) {
        }
        int i26222 = i14;
        i16 = i42 & 4096;
        if (i16 == 0) {
        }
        i17 = i42 & 8192;
        if (i17 != 0) {
        }
        i18 = i42 & 16384;
        if (i18 != 0) {
        }
        i19 = i18;
        i20 = i42 & 32768;
        if (i20 != 0) {
        }
        i21 = i42 & 65536;
        if (i21 != 0) {
        }
        if ((i32 & 29360128) == 0) {
        }
        if ((i32 & 234881024) == 0) {
        }
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:353:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:653:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(@NotNull TextFieldValue textFieldValue, @NotNull Function1<? super TextFieldValue, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable TextStyle textStyle, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, @Nullable VisualTransformation visualTransformation, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, boolean z4, int i, int i2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, @Nullable TextFieldColors textFieldColors, @Nullable Composer composer, int i3, int i4, int i5) {
        int i6;
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
        Modifier modifier2;
        boolean z5;
        boolean z6;
        TextStyle textStyle2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        boolean z7;
        VisualTransformation none;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z8;
        int i21;
        int i22;
        int i23;
        Function2<? super Composer, ? super Integer, Unit> function27;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape outlinedTextFieldShape;
        int i24;
        KeyboardActions keyboardActions3;
        MutableInteractionSource mutableInteractionSource4;
        TextFieldColors textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs;
        Shape shape2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i25;
        int i26;
        Function2<? super Composer, ? super Integer, Unit> function29;
        boolean z9;
        long jM13195getColor0d7_KjU;
        int i27;
        Function2<? super Composer, ? super Integer, Unit> function210;
        boolean z10;
        Shape shape3;
        TextStyle textStyle3;
        TextFieldColors textFieldColors2;
        MutableInteractionSource mutableInteractionSource5;
        Function2<? super Composer, ? super Integer, Unit> function211;
        int i28;
        KeyboardActions keyboardActions4;
        KeyboardOptions keyboardOptions3;
        Function2<? super Composer, ? super Integer, Unit> function212;
        boolean z11;
        boolean z12;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function213;
        VisualTransformation visualTransformation2;
        boolean z13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(237745923);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 112) == 0) {
                i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i3 & 896) == 0) {
                    i6 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                }
                i8 = i5 & 8;
                int i29 = 1024;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i3 & 7168) == 0) {
                        i6 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= CpioConstants.C_ISBLK;
                    } else if ((i3 & 57344) == 0) {
                        i6 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    if ((i3 & 458752) == 0) {
                        i6 |= ((i5 & 32) == 0 && composerStartRestartGroup.changed(textStyle)) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 234881024) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i13 = i5 & 512;
                    if (i13 == 0) {
                        i6 |= 805306368;
                    } else if ((i3 & 1879048192) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                    }
                    i14 = i5 & 1024;
                    if (i14 == 0) {
                        i15 = i4 | 6;
                    } else if ((i4 & 14) == 0) {
                        i15 = i4 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                    } else {
                        i15 = i4;
                    }
                    i16 = i5 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                    } else if ((i4 & 112) == 0) {
                        i15 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                    }
                    int i30 = i15;
                    i17 = i5 & 4096;
                    if (i17 != 0) {
                        if ((i4 & 896) == 0) {
                            i30 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                        }
                        if ((i4 & 7168) == 0) {
                            if ((i5 & 8192) == 0 && composerStartRestartGroup.changed(keyboardActions)) {
                                i29 = 2048;
                            }
                            i30 |= i29;
                        }
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i30 |= CpioConstants.C_ISBLK;
                        } else if ((i4 & 57344) == 0) {
                            i30 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                        }
                        if ((i4 & 458752) == 0) {
                            i30 |= ((i5 & 32768) == 0 && composerStartRestartGroup.changed(i)) ? 131072 : 65536;
                        }
                        i19 = i5 & 65536;
                        if (i19 != 0) {
                            i30 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i30 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i20 = i5 & 131072;
                        if (i20 != 0) {
                            i30 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i30 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                        }
                        if ((i4 & 234881024) == 0) {
                            i30 |= ((i5 & 262144) == 0 && composerStartRestartGroup.changed(shape)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i4 & 1879048192) == 0) {
                            i30 |= ((i5 & 524288) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 536870912 : 268435456;
                        }
                        if ((i6 & 1533916891) != 306783378 || (1533916891 & i30) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                z5 = i8 == 0 ? true : z;
                                z6 = i9 == 0 ? false : z2;
                                if ((i5 & 32) == 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i6 &= -458753;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                function25 = i10 == 0 ? null : function2;
                                function26 = i11 == 0 ? null : function22;
                                Function2<? super Composer, ? super Integer, Unit> function214 = i12 == 0 ? null : function23;
                                Function2<? super Composer, ? super Integer, Unit> function215 = i13 == 0 ? null : function24;
                                z7 = i14 == 0 ? false : z3;
                                none = i16 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                keyboardOptions2 = i17 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                Function2<? super Composer, ? super Integer, Unit> function216 = function214;
                                if ((i5 & 8192) == 0) {
                                    keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i30 &= -7169;
                                } else {
                                    keyboardActions2 = keyboardActions;
                                }
                                z8 = i18 == 0 ? false : z4;
                                if ((i5 & 32768) == 0) {
                                    i21 = i30 & (-458753);
                                    i22 = z8 ? 1 : Integer.MAX_VALUE;
                                } else {
                                    i21 = i30;
                                    i22 = i;
                                }
                                i23 = i19 == 0 ? 1 : i2;
                                KeyboardActions keyboardActions5 = keyboardActions2;
                                if (i20 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    function27 = function215;
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    function27 = function215;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((262144 & i5) == 0) {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    outlinedTextFieldShape = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(composerStartRestartGroup, 6);
                                    i24 = i21 & (-234881025);
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    outlinedTextFieldShape = shape;
                                    i24 = i21;
                                }
                                if ((i5 & 524288) == 0) {
                                    i24 &= -1879048193;
                                    keyboardActions3 = keyboardActions5;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    shape2 = outlinedTextFieldShape;
                                    i = i22;
                                    textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m9068outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                } else {
                                    keyboardActions3 = keyboardActions5;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                    shape2 = outlinedTextFieldShape;
                                    i = i22;
                                }
                                function28 = function27;
                                i25 = i6;
                                i26 = i24;
                                function29 = function216;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 32) != 0) {
                                    i6 &= -458753;
                                }
                                if ((i5 & 8192) != 0) {
                                    i30 &= -7169;
                                }
                                if ((32768 & i5) != 0) {
                                    i30 &= -458753;
                                }
                                if ((262144 & i5) != 0) {
                                    i30 &= -234881025;
                                }
                                if ((i5 & 524288) != 0) {
                                    i30 &= -1879048193;
                                }
                                modifier2 = modifier;
                                z5 = z;
                                z6 = z2;
                                textStyle2 = textStyle;
                                function25 = function2;
                                function26 = function22;
                                function29 = function23;
                                function28 = function24;
                                z7 = z3;
                                none = visualTransformation;
                                keyboardOptions2 = keyboardOptions;
                                z8 = z4;
                                i23 = i2;
                                mutableInteractionSource4 = mutableInteractionSource;
                                shape2 = shape;
                                textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                keyboardActions3 = keyboardActions;
                                int i31 = i30;
                                i25 = i6;
                                i26 = i31;
                            }
                            composerStartRestartGroup.endDefaults();
                            KeyboardOptions keyboardOptions4 = keyboardOptions2;
                            if (ComposerKt.isTraceInProgress()) {
                                z9 = z6;
                            } else {
                                z9 = z6;
                                ComposerKt.traceEventStart(237745923, i25, i26, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:358)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(1961404947);
                            jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                            if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                jM13195getColor0d7_KjU = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs.textColor(z5, composerStartRestartGroup, ((i25 >> 9) & 14) | ((i26 >> 24) & 112)).getValue().m11350unboximpl();
                            }
                            long j = jM13195getColor0d7_KjU;
                            composerStartRestartGroup.endReplaceableGroup();
                            TextStyle textStyleMerge = textStyle2.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            int i32 = (i26 >> 24) & 112;
                            Function2<? super Composer, ? super Integer, Unit> function217 = function29;
                            Function2<? super Composer, ? super Integer, Unit> function218 = function28;
                            Modifier modifierDefaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(BackgroundKt.m7770backgroundbw27NRU(function25 == null ? PaddingKt.m8127paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, C11508.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs.backgroundColor(z5, composerStartRestartGroup, ((i25 >> 9) & 14) | i32).getValue().m11350unboximpl(), shape2), z7, Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9018getDefaultErrorMessageUdPEhr4(), composerStartRestartGroup, 6));
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                            Modifier modifier4 = modifier2;
                            int i33 = i26 << 12;
                            BasicTextFieldKt.BasicTextField(textFieldValue, function1, SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics, textFieldDefaults.m9065getMinWidthD9Ej5fM(), textFieldDefaults.m9064getMinHeightD9Ej5fM()), z5, z9, textStyleMerge, keyboardOptions4, keyboardActions3, z8, i, i23, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs.cursorColor(z7, composerStartRestartGroup, (i26 & 14) | i32).getValue().m11350unboximpl(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1001528775, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.9
                                public final /* synthetic */ TextFieldColors $colors;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ boolean $isError;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                public final /* synthetic */ Shape $shape;
                                public final /* synthetic */ boolean $singleLine;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C11519(boolean z52, boolean z82, VisualTransformation none2, MutableInteractionSource mutableInteractionSource42, boolean z72, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function262, Function2<? super Composer, ? super Integer, Unit> function2172, Function2<? super Composer, ? super Integer, Unit> function2182, TextFieldColors textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2, Shape shape22) {
                                    super(3);
                                    z = z52;
                                    z = z82;
                                    visualTransformation = none2;
                                    mutableInteractionSource = mutableInteractionSource42;
                                    z = z72;
                                    function2 = function252;
                                    function2 = function262;
                                    function2 = function2172;
                                    function2 = function2182;
                                    textFieldColors = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2;
                                    shape = shape22;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer2, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function219, @Nullable Composer composer2, int i34) {
                                    int i35;
                                    if ((i34 & 14) == 0) {
                                        i35 = i34 | (composer2.changedInstance(function219) ? 4 : 2);
                                    } else {
                                        i35 = i34;
                                    }
                                    if ((i35 & 91) != 18 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1001528775, i35, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:396)");
                                        }
                                        TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                        String text = textFieldValue.getText();
                                        boolean z14 = z;
                                        boolean z15 = z;
                                        VisualTransformation visualTransformation3 = visualTransformation;
                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource;
                                        boolean z16 = z;
                                        Function2<Composer, Integer, Unit> function220 = function2;
                                        Function2<Composer, Integer, Unit> function221 = function2;
                                        Function2<Composer, Integer, Unit> function222 = function2;
                                        Function2<Composer, Integer, Unit> function223 = function2;
                                        TextFieldColors textFieldColors3 = textFieldColors;
                                        textFieldDefaults2.OutlinedTextFieldDecorationBox(text, function219, z14, z15, visualTransformation3, mutableInteractionSource6, z16, function220, function221, function222, function223, textFieldColors3, null, ComposableLambdaKt.composableLambda(composer2, -753611134, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.9.1
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;
                                            public final /* synthetic */ Shape $shape;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(boolean z142, boolean z162, MutableInteractionSource mutableInteractionSource62, TextFieldColors textFieldColors32, Shape shape4) {
                                                super(2);
                                                z = z142;
                                                z = z162;
                                                mutableInteractionSource = mutableInteractionSource62;
                                                textFieldColors = textFieldColors32;
                                                shape = shape4;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i36) {
                                                if ((i36 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-753611134, i36, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:410)");
                                                    }
                                                    TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer3, 12582912, 96);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, (i35 << 3) & 112, 27648, 4096);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* compiled from: OutlinedTextField.kt */
                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$9$1 */
                                public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                                    public final /* synthetic */ TextFieldColors $colors;
                                    public final /* synthetic */ boolean $enabled;
                                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                                    public final /* synthetic */ boolean $isError;
                                    public final /* synthetic */ Shape $shape;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(boolean z142, boolean z162, MutableInteractionSource mutableInteractionSource62, TextFieldColors textFieldColors32, Shape shape4) {
                                        super(2);
                                        z = z142;
                                        z = z162;
                                        mutableInteractionSource = mutableInteractionSource62;
                                        textFieldColors = textFieldColors32;
                                        shape = shape4;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i36) {
                                        if ((i36 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-753611134, i36, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:410)");
                                            }
                                            TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer3, 12582912, 96);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }
                            }), composerStartRestartGroup, (64638 & i25) | (i33 & 3670016) | (i33 & 29360128) | (234881024 & i33) | (i33 & 1879048192), ((i26 >> 18) & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21 | (i26 & 112) | ((i26 >> 12) & 7168), 4096);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i27 = i;
                            function210 = function262;
                            z10 = z52;
                            shape3 = shape22;
                            textStyle3 = textStyle2;
                            textFieldColors2 = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2;
                            mutableInteractionSource5 = mutableInteractionSource42;
                            function211 = function252;
                            i28 = i23;
                            keyboardActions4 = keyboardActions3;
                            keyboardOptions3 = keyboardOptions4;
                            function212 = function2172;
                            z11 = z72;
                            z12 = z82;
                            modifier3 = modifier4;
                            function213 = function2182;
                            visualTransformation2 = none2;
                            z13 = z9;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z10 = z;
                            z13 = z2;
                            textStyle3 = textStyle;
                            function211 = function2;
                            function210 = function22;
                            function212 = function23;
                            function213 = function24;
                            z11 = z3;
                            visualTransformation2 = visualTransformation;
                            keyboardOptions3 = keyboardOptions;
                            keyboardActions4 = keyboardActions;
                            z12 = z4;
                            i27 = i;
                            i28 = i2;
                            mutableInteractionSource5 = mutableInteractionSource;
                            shape3 = shape;
                            textFieldColors2 = textFieldColors;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.10
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
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
                                public final /* synthetic */ TextStyle $textStyle;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C114410(Function1<? super TextFieldValue, Unit> function12, Modifier modifier32, boolean z102, boolean z132, TextStyle textStyle32, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2132, boolean z112, VisualTransformation visualTransformation22, KeyboardOptions keyboardOptions32, KeyboardActions keyboardActions42, boolean z122, int i272, int i282, MutableInteractionSource mutableInteractionSource52, Shape shape32, TextFieldColors textFieldColors22, int i34, int i42, int i52) {
                                    super(2);
                                    function1 = function12;
                                    modifier = modifier32;
                                    z = z102;
                                    z = z132;
                                    textStyle = textStyle32;
                                    function2 = function2112;
                                    function2 = function2102;
                                    function2 = function2122;
                                    function2 = function2132;
                                    z = z112;
                                    visualTransformation = visualTransformation22;
                                    keyboardOptions = keyboardOptions32;
                                    keyboardActions = keyboardActions42;
                                    z = z122;
                                    i = i272;
                                    i = i282;
                                    mutableInteractionSource = mutableInteractionSource52;
                                    shape = shape32;
                                    textFieldColors = textFieldColors22;
                                    i = i34;
                                    i = i42;
                                    i = i52;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i34) {
                                    OutlinedTextFieldKt.OutlinedTextField(textFieldValue, function1, modifier, z, z, textStyle, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i30 |= 384;
                    if ((i42 & 7168) == 0) {
                    }
                    i18 = i52 & 16384;
                    if (i18 != 0) {
                    }
                    if ((i42 & 458752) == 0) {
                    }
                    i19 = i52 & 65536;
                    if (i19 != 0) {
                    }
                    i20 = i52 & 131072;
                    if (i20 != 0) {
                    }
                    if ((i42 & 234881024) == 0) {
                    }
                    if ((i42 & 1879048192) == 0) {
                    }
                    if ((i6 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i34 & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if ((i52 & 32) == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            Function2<? super Composer, ? super Integer, Unit> function2162 = function214;
                            if ((i52 & 8192) == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if ((i52 & 32768) == 0) {
                            }
                            if (i19 == 0) {
                            }
                            KeyboardActions keyboardActions52 = keyboardActions2;
                            if (i20 == 0) {
                            }
                            if ((262144 & i52) == 0) {
                            }
                            if ((i52 & 524288) == 0) {
                            }
                            function28 = function27;
                            i25 = i6;
                            i26 = i24;
                            function29 = function2162;
                            composerStartRestartGroup.endDefaults();
                            KeyboardOptions keyboardOptions42 = keyboardOptions2;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1961404947);
                            jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                            if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                            }
                            long j2 = jM13195getColor0d7_KjU;
                            composerStartRestartGroup.endReplaceableGroup();
                            TextStyle textStyleMerge2 = textStyle2.merge(new TextStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            int i322 = (i26 >> 24) & 112;
                            Function2<? super Composer, ? super Integer, Unit> function2172 = function29;
                            Function2<? super Composer, ? super Integer, Unit> function2182 = function28;
                            Modifier modifierDefaultErrorSemantics2 = TextFieldImplKt.defaultErrorSemantics(BackgroundKt.m7770backgroundbw27NRU(function252 == null ? PaddingKt.m8127paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, C11508.INSTANCE), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null) : modifier2, textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2.backgroundColor(z52, composerStartRestartGroup, ((i25 >> 9) & 14) | i322).getValue().m11350unboximpl(), shape22), z72, Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9018getDefaultErrorMessageUdPEhr4(), composerStartRestartGroup, 6));
                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                            Modifier modifier42 = modifier2;
                            int i332 = i26 << 12;
                            BasicTextFieldKt.BasicTextField(textFieldValue, function12, SizeKt.m8156defaultMinSizeVpY3zN4(modifierDefaultErrorSemantics2, textFieldDefaults2.m9065getMinWidthD9Ej5fM(), textFieldDefaults2.m9064getMinHeightD9Ej5fM()), z52, z9, textStyleMerge2, keyboardOptions42, keyboardActions3, z82, i, i23, none2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource42, new SolidColor(textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2.cursorColor(z72, composerStartRestartGroup, (i26 & 14) | i322).getValue().m11350unboximpl(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1001528775, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.9
                                public final /* synthetic */ TextFieldColors $colors;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ boolean $isError;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                public final /* synthetic */ Shape $shape;
                                public final /* synthetic */ boolean $singleLine;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C11519(boolean z52, boolean z82, VisualTransformation none2, MutableInteractionSource mutableInteractionSource42, boolean z72, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function262, Function2<? super Composer, ? super Integer, Unit> function21722, Function2<? super Composer, ? super Integer, Unit> function21822, TextFieldColors textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2, Shape shape22) {
                                    super(3);
                                    z = z52;
                                    z = z82;
                                    visualTransformation = none2;
                                    mutableInteractionSource = mutableInteractionSource42;
                                    z = z72;
                                    function2 = function252;
                                    function2 = function262;
                                    function2 = function21722;
                                    function2 = function21822;
                                    textFieldColors = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2;
                                    shape = shape22;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer2, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function219, @Nullable Composer composer2, int i34) {
                                    int i35;
                                    if ((i34 & 14) == 0) {
                                        i35 = i34 | (composer2.changedInstance(function219) ? 4 : 2);
                                    } else {
                                        i35 = i34;
                                    }
                                    if ((i35 & 91) != 18 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1001528775, i35, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:396)");
                                        }
                                        TextFieldDefaults textFieldDefaults22 = TextFieldDefaults.INSTANCE;
                                        String text = textFieldValue.getText();
                                        boolean z142 = z;
                                        boolean z15 = z;
                                        VisualTransformation visualTransformation3 = visualTransformation;
                                        MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource;
                                        boolean z162 = z;
                                        Function2<Composer, Integer, Unit> function220 = function2;
                                        Function2<Composer, Integer, Unit> function221 = function2;
                                        Function2<Composer, Integer, Unit> function222 = function2;
                                        Function2<Composer, Integer, Unit> function223 = function2;
                                        TextFieldColors textFieldColors32 = textFieldColors;
                                        textFieldDefaults22.OutlinedTextFieldDecorationBox(text, function219, z142, z15, visualTransformation3, mutableInteractionSource62, z162, function220, function221, function222, function223, textFieldColors32, null, ComposableLambdaKt.composableLambda(composer2, -753611134, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.9.1
                                            public final /* synthetic */ TextFieldColors $colors;
                                            public final /* synthetic */ boolean $enabled;
                                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                                            public final /* synthetic */ boolean $isError;
                                            public final /* synthetic */ Shape $shape;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(boolean z1422, boolean z1622, MutableInteractionSource mutableInteractionSource622, TextFieldColors textFieldColors322, Shape shape4) {
                                                super(2);
                                                z = z1422;
                                                z = z1622;
                                                mutableInteractionSource = mutableInteractionSource622;
                                                textFieldColors = textFieldColors322;
                                                shape = shape4;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i36) {
                                                if ((i36 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-753611134, i36, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:410)");
                                                    }
                                                    TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer3, 12582912, 96);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, (i35 << 3) & 112, 27648, 4096);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* compiled from: OutlinedTextField.kt */
                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$9$1 */
                                public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                                    public final /* synthetic */ TextFieldColors $colors;
                                    public final /* synthetic */ boolean $enabled;
                                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                                    public final /* synthetic */ boolean $isError;
                                    public final /* synthetic */ Shape $shape;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(boolean z1422, boolean z1622, MutableInteractionSource mutableInteractionSource622, TextFieldColors textFieldColors322, Shape shape4) {
                                        super(2);
                                        z = z1422;
                                        z = z1622;
                                        mutableInteractionSource = mutableInteractionSource622;
                                        textFieldColors = textFieldColors322;
                                        shape = shape4;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i36) {
                                        if ((i36 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-753611134, i36, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:410)");
                                            }
                                            TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer3, 12582912, 96);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }
                            }), composerStartRestartGroup, (64638 & i25) | (i332 & 3670016) | (i332 & 29360128) | (234881024 & i332) | (i332 & 1879048192), ((i26 >> 18) & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21 | (i26 & 112) | ((i26 >> 12) & 7168), 4096);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i272 = i;
                            function2102 = function262;
                            z102 = z52;
                            shape32 = shape22;
                            textStyle32 = textStyle2;
                            textFieldColors22 = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2;
                            mutableInteractionSource52 = mutableInteractionSource42;
                            function2112 = function252;
                            i282 = i23;
                            keyboardActions42 = keyboardActions3;
                            keyboardOptions32 = keyboardOptions42;
                            function2122 = function21722;
                            z112 = z72;
                            z122 = z82;
                            modifier32 = modifier42;
                            function2132 = function21822;
                            visualTransformation22 = none2;
                            z132 = z9;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i9 = i52 & 16;
                if (i9 == 0) {
                }
                if ((i34 & 458752) == 0) {
                }
                i10 = i52 & 64;
                if (i10 == 0) {
                }
                i11 = i52 & 128;
                if (i11 == 0) {
                }
                i12 = i52 & 256;
                if (i12 == 0) {
                }
                i13 = i52 & 512;
                if (i13 == 0) {
                }
                i14 = i52 & 1024;
                if (i14 == 0) {
                }
                i16 = i52 & 2048;
                if (i16 == 0) {
                }
                int i302 = i15;
                i17 = i52 & 4096;
                if (i17 != 0) {
                }
                if ((i42 & 7168) == 0) {
                }
                i18 = i52 & 16384;
                if (i18 != 0) {
                }
                if ((i42 & 458752) == 0) {
                }
                i19 = i52 & 65536;
                if (i19 != 0) {
                }
                i20 = i52 & 131072;
                if (i20 != 0) {
                }
                if ((i42 & 234881024) == 0) {
                }
                if ((i42 & 1879048192) == 0) {
                }
                if ((i6 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i52 & 8;
            int i292 = 1024;
            if (i8 != 0) {
            }
            i9 = i52 & 16;
            if (i9 == 0) {
            }
            if ((i34 & 458752) == 0) {
            }
            i10 = i52 & 64;
            if (i10 == 0) {
            }
            i11 = i52 & 128;
            if (i11 == 0) {
            }
            i12 = i52 & 256;
            if (i12 == 0) {
            }
            i13 = i52 & 512;
            if (i13 == 0) {
            }
            i14 = i52 & 1024;
            if (i14 == 0) {
            }
            i16 = i52 & 2048;
            if (i16 == 0) {
            }
            int i3022 = i15;
            i17 = i52 & 4096;
            if (i17 != 0) {
            }
            if ((i42 & 7168) == 0) {
            }
            i18 = i52 & 16384;
            if (i18 != 0) {
            }
            if ((i42 & 458752) == 0) {
            }
            i19 = i52 & 65536;
            if (i19 != 0) {
            }
            i20 = i52 & 131072;
            if (i20 != 0) {
            }
            if ((i42 & 234881024) == 0) {
            }
            if ((i42 & 1879048192) == 0) {
            }
            if ((i6 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i52 & 4;
        if (i7 == 0) {
        }
        i8 = i52 & 8;
        int i2922 = 1024;
        if (i8 != 0) {
        }
        i9 = i52 & 16;
        if (i9 == 0) {
        }
        if ((i34 & 458752) == 0) {
        }
        i10 = i52 & 64;
        if (i10 == 0) {
        }
        i11 = i52 & 128;
        if (i11 == 0) {
        }
        i12 = i52 & 256;
        if (i12 == 0) {
        }
        i13 = i52 & 512;
        if (i13 == 0) {
        }
        i14 = i52 & 1024;
        if (i14 == 0) {
        }
        i16 = i52 & 2048;
        if (i16 == 0) {
        }
        int i30222 = i15;
        i17 = i52 & 4096;
        if (i17 != 0) {
        }
        if ((i42 & 7168) == 0) {
        }
        i18 = i52 & 16384;
        if (i18 != 0) {
        }
        if ((i42 & 458752) == 0) {
        }
        i19 = i52 & 65536;
        if (i19 != 0) {
        }
        i20 = i52 & 131072;
        if (i20 != 0) {
        }
        if ((i42 & 234881024) == 0) {
        }
        if ((i42 & 1879048192) == 0) {
        }
        if ((i6 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$8 */
    /* loaded from: classes3.dex */
    public static final class C11508 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C11508 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: OutlinedTextField.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$9 */
    /* loaded from: classes3.dex */
    public static final class C11519 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11519(boolean z52, boolean z82, VisualTransformation none2, MutableInteractionSource mutableInteractionSource42, boolean z72, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function262, Function2<? super Composer, ? super Integer, Unit> function21722, Function2<? super Composer, ? super Integer, Unit> function21822, TextFieldColors textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2, Shape shape22) {
            super(3);
            z = z52;
            z = z82;
            visualTransformation = none2;
            mutableInteractionSource = mutableInteractionSource42;
            z = z72;
            function2 = function252;
            function2 = function262;
            function2 = function21722;
            function2 = function21822;
            textFieldColors = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs2;
            shape = shape22;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer2, Integer num) {
            invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function219, @Nullable Composer composer2, int i34) {
            int i35;
            if ((i34 & 14) == 0) {
                i35 = i34 | (composer2.changedInstance(function219) ? 4 : 2);
            } else {
                i35 = i34;
            }
            if ((i35 & 91) != 18 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1001528775, i35, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:396)");
                }
                TextFieldDefaults textFieldDefaults22 = TextFieldDefaults.INSTANCE;
                String text = textFieldValue.getText();
                boolean z1422 = z;
                boolean z15 = z;
                VisualTransformation visualTransformation3 = visualTransformation;
                MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource;
                boolean z1622 = z;
                Function2<Composer, Integer, Unit> function220 = function2;
                Function2<Composer, Integer, Unit> function221 = function2;
                Function2<Composer, Integer, Unit> function222 = function2;
                Function2<Composer, Integer, Unit> function223 = function2;
                TextFieldColors textFieldColors322 = textFieldColors;
                textFieldDefaults22.OutlinedTextFieldDecorationBox(text, function219, z1422, z15, visualTransformation3, mutableInteractionSource622, z1622, function220, function221, function222, function223, textFieldColors322, null, ComposableLambdaKt.composableLambda(composer2, -753611134, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.9.1
                    public final /* synthetic */ TextFieldColors $colors;
                    public final /* synthetic */ boolean $enabled;
                    public final /* synthetic */ MutableInteractionSource $interactionSource;
                    public final /* synthetic */ boolean $isError;
                    public final /* synthetic */ Shape $shape;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(boolean z14222, boolean z16222, MutableInteractionSource mutableInteractionSource6222, TextFieldColors textFieldColors3222, Shape shape4) {
                        super(2);
                        z = z14222;
                        z = z16222;
                        mutableInteractionSource = mutableInteractionSource6222;
                        textFieldColors = textFieldColors3222;
                        shape = shape4;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i36) {
                        if ((i36 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-753611134, i36, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:410)");
                            }
                            TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer3, 12582912, 96);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, (i35 << 3) & 112, 27648, 4096);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }

        /* compiled from: OutlinedTextField.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$9$1 */
        public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ TextFieldColors $colors;
            public final /* synthetic */ boolean $enabled;
            public final /* synthetic */ MutableInteractionSource $interactionSource;
            public final /* synthetic */ boolean $isError;
            public final /* synthetic */ Shape $shape;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(boolean z14222, boolean z16222, MutableInteractionSource mutableInteractionSource6222, TextFieldColors textFieldColors3222, Shape shape4) {
                super(2);
                z = z14222;
                z = z16222;
                mutableInteractionSource = mutableInteractionSource6222;
                textFieldColors = textFieldColors3222;
                shape = shape4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer3, int i36) {
                if ((i36 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-753611134, i36, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:410)");
                    }
                    TextFieldDefaults.INSTANCE.m9062BorderBoxnbWgWpA(z, z, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer3, 12582912, 96);
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

    /* JADX WARN: Removed duplicated region for block: B:325:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:597:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void OutlinedTextField(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i2, int i3, int i4) {
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
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Modifier modifier2;
        boolean z5;
        boolean z6;
        TextStyle textStyle2;
        Function2 function25;
        Function2 function26;
        boolean z7;
        VisualTransformation none;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z8;
        int i20;
        Function2 function27;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape outlinedTextFieldShape;
        Function2 function28;
        TextFieldColors textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs;
        Shape shape2;
        int i21;
        int i22;
        Function2 function29;
        KeyboardActions keyboardActions3;
        MutableInteractionSource mutableInteractionSource4;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource6;
        KeyboardOptions keyboardOptions3;
        boolean z9;
        TextStyle textStyle3;
        Shape shape3;
        TextFieldColors textFieldColors2;
        Function2 function210;
        int i23;
        Function2 function211;
        KeyboardActions keyboardActions4;
        boolean z10;
        boolean z11;
        Modifier modifier3;
        Function2 function212;
        Function2 function213;
        VisualTransformation visualTransformation2;
        boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-288998816);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 896) == 0) {
                    i5 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                }
                i7 = i4 & 8;
                int i24 = 1024;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 7168) == 0) {
                        i5 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= CpioConstants.C_ISBLK;
                    } else if ((i2 & 57344) == 0) {
                        i5 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    if ((i2 & 458752) == 0) {
                        i5 |= ((i4 & 32) == 0 && composerStartRestartGroup.changed(textStyle)) ? 131072 : 65536;
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i12 = i4 & 512;
                    if (i12 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 1879048192) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                    }
                    i13 = i4 & 1024;
                    if (i13 == 0) {
                        i14 = i3 | 6;
                    } else if ((i3 & 14) == 0) {
                        i14 = i3 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                    } else {
                        i14 = i3;
                    }
                    i15 = i4 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                    } else if ((i3 & 112) == 0) {
                        i14 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                    }
                    int i25 = i14;
                    i16 = i4 & 4096;
                    if (i16 != 0) {
                        if ((i3 & 896) == 0) {
                            i25 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                        }
                        if ((i3 & 7168) == 0) {
                            if ((i4 & 8192) == 0 && composerStartRestartGroup.changed(keyboardActions)) {
                                i24 = 2048;
                            }
                            i25 |= i24;
                        }
                        i17 = i4 & 16384;
                        if (i17 != 0) {
                            i25 |= CpioConstants.C_ISBLK;
                        } else if ((i3 & 57344) == 0) {
                            i25 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                        }
                        i18 = i4 & 32768;
                        if (i18 != 0) {
                            i25 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else if ((i3 & 458752) == 0) {
                            i25 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
                        }
                        i19 = i4 & 65536;
                        if (i19 != 0) {
                            i25 |= 1572864;
                        } else if ((i3 & 3670016) == 0) {
                            i25 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                        }
                        if ((i3 & 29360128) == 0) {
                            i25 |= ((i4 & 131072) == 0 && composerStartRestartGroup.changed(shape)) ? 8388608 : 4194304;
                        }
                        if ((i3 & 234881024) == 0) {
                            i25 |= ((i4 & 262144) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i5 & 1533916891) != 306783378 || (191739611 & i25) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i6 == 0 ? Modifier.INSTANCE : modifier;
                                z5 = i7 == 0 ? true : z;
                                z6 = i8 == 0 ? false : z2;
                                if ((i4 & 32) == 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i5 &= -458753;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                function25 = i9 == 0 ? null : function2;
                                function26 = i10 == 0 ? null : function22;
                                Function2 function214 = i11 == 0 ? null : function23;
                                Function2 function215 = i12 == 0 ? null : function24;
                                z7 = i13 == 0 ? false : z3;
                                none = i15 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                keyboardOptions2 = i16 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                Function2 function216 = function214;
                                if ((i4 & 8192) == 0) {
                                    keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                    i25 &= -7169;
                                } else {
                                    keyboardActions2 = keyboardActions;
                                }
                                z8 = i17 == 0 ? false : z4;
                                i20 = i18 == 0 ? Integer.MAX_VALUE : i;
                                KeyboardActions keyboardActions5 = keyboardActions2;
                                if (i19 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    function27 = function215;
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    function27 = function215;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i4 & 131072) == 0) {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    outlinedTextFieldShape = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(composerStartRestartGroup, 6);
                                    i25 = (-29360129) & i25;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    outlinedTextFieldShape = shape;
                                }
                                if ((262144 & i4) == 0) {
                                    shape2 = outlinedTextFieldShape;
                                    textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m9068outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                    i21 = i5;
                                    i22 = i25 & (-234881025);
                                    function29 = function216;
                                    keyboardActions3 = keyboardActions5;
                                    function28 = function27;
                                } else {
                                    function28 = function27;
                                    textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                    shape2 = outlinedTextFieldShape;
                                    i21 = i5;
                                    i22 = i25;
                                    function29 = function216;
                                    keyboardActions3 = keyboardActions5;
                                }
                                mutableInteractionSource4 = mutableInteractionSource3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                }
                                if ((i4 & 8192) != 0) {
                                    i25 &= -7169;
                                }
                                if ((i4 & 131072) != 0) {
                                    i25 &= -29360129;
                                }
                                if ((262144 & i4) != 0) {
                                    i25 &= -234881025;
                                }
                                modifier2 = modifier;
                                z5 = z;
                                z6 = z2;
                                textStyle2 = textStyle;
                                function25 = function2;
                                function26 = function22;
                                function29 = function23;
                                function28 = function24;
                                z7 = z3;
                                none = visualTransformation;
                                keyboardOptions2 = keyboardOptions;
                                z8 = z4;
                                i20 = i;
                                shape2 = shape;
                                textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                i21 = i5;
                                i22 = i25;
                                keyboardActions3 = keyboardActions;
                                mutableInteractionSource4 = mutableInteractionSource;
                            }
                            composerStartRestartGroup.endDefaults();
                            composer2 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                                mutableInteractionSource5 = mutableInteractionSource4;
                            } else {
                                mutableInteractionSource5 = mutableInteractionSource4;
                                ComposerKt.traceEventStart(-288998816, i21, i22, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:448)");
                            }
                            int i26 = i22 << 3;
                            OutlinedTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier2, z5, z6, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) function28, z7, none, keyboardOptions2, keyboardActions3, z8, i20, 1, mutableInteractionSource5, shape2, textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs, composer2, i21 & 2147483646, (i22 & 14) | 1572864 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (29360128 & i26) | (234881024 & i26) | (i26 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource6 = mutableInteractionSource5;
                            keyboardOptions3 = keyboardOptions2;
                            z9 = z8;
                            textStyle3 = textStyle2;
                            shape3 = shape2;
                            textFieldColors2 = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs;
                            function210 = function25;
                            i23 = i20;
                            function211 = function28;
                            keyboardActions4 = keyboardActions3;
                            z10 = z5;
                            z11 = z7;
                            modifier3 = modifier2;
                            function212 = function26;
                            function213 = function29;
                            boolean z13 = z6;
                            visualTransformation2 = none;
                            z12 = z13;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z10 = z;
                            z12 = z2;
                            textStyle3 = textStyle;
                            function210 = function2;
                            function212 = function22;
                            function213 = function23;
                            function211 = function24;
                            z11 = z3;
                            visualTransformation2 = visualTransformation;
                            keyboardOptions3 = keyboardOptions;
                            keyboardActions4 = keyboardActions;
                            z9 = z4;
                            i23 = i;
                            mutableInteractionSource6 = mutableInteractionSource;
                            shape3 = shape;
                            textFieldColors2 = textFieldColors;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.12
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
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
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                public final /* synthetic */ boolean $readOnly;
                                public final /* synthetic */ Shape $shape;
                                public final /* synthetic */ boolean $singleLine;
                                public final /* synthetic */ TextStyle $textStyle;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C114512(Function1<? super TextFieldValue, Unit> function12, Modifier modifier32, boolean z102, boolean z122, TextStyle textStyle32, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2112, boolean z112, VisualTransformation visualTransformation22, KeyboardOptions keyboardOptions32, KeyboardActions keyboardActions42, boolean z92, int i232, MutableInteractionSource mutableInteractionSource62, Shape shape32, TextFieldColors textFieldColors22, int i27, int i32, int i42) {
                                    super(2);
                                    function1 = function12;
                                    modifier = modifier32;
                                    z = z102;
                                    z = z122;
                                    textStyle = textStyle32;
                                    function2 = function2102;
                                    function2 = function2122;
                                    function2 = function2132;
                                    function2 = function2112;
                                    z = z112;
                                    visualTransformation = visualTransformation22;
                                    keyboardOptions = keyboardOptions32;
                                    keyboardActions = keyboardActions42;
                                    z = z92;
                                    i = i232;
                                    mutableInteractionSource = mutableInteractionSource62;
                                    shape = shape32;
                                    textFieldColors = textFieldColors22;
                                    i = i27;
                                    i = i32;
                                    i = i42;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i27) {
                                    OutlinedTextFieldKt.OutlinedTextField(textFieldValue, function1, modifier, z, z, textStyle, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, mutableInteractionSource, shape, textFieldColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i25 |= 384;
                    if ((i32 & 7168) == 0) {
                    }
                    i17 = i42 & 16384;
                    if (i17 != 0) {
                    }
                    i18 = i42 & 32768;
                    if (i18 != 0) {
                    }
                    i19 = i42 & 65536;
                    if (i19 != 0) {
                    }
                    if ((i32 & 29360128) == 0) {
                    }
                    if ((i32 & 234881024) == 0) {
                    }
                    if ((i5 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i27 & 1) != 0) {
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i42 & 32) == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            Function2 function2162 = function214;
                            if ((i42 & 8192) == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            KeyboardActions keyboardActions52 = keyboardActions2;
                            if (i19 == 0) {
                            }
                            if ((i42 & 131072) == 0) {
                            }
                            if ((262144 & i42) == 0) {
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            composerStartRestartGroup.endDefaults();
                            composer2 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i262 = i22 << 3;
                            OutlinedTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function12, modifier2, z5, z6, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) function28, z7, none, keyboardOptions2, keyboardActions3, z8, i20, 1, mutableInteractionSource5, shape2, textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs, composer2, i21 & 2147483646, (i22 & 14) | 1572864 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (29360128 & i262) | (234881024 & i262) | (i262 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource62 = mutableInteractionSource5;
                            keyboardOptions32 = keyboardOptions2;
                            z92 = z8;
                            textStyle32 = textStyle2;
                            shape32 = shape2;
                            textFieldColors22 = textFieldColorsM9068outlinedTextFieldColorsdx8h9Zs;
                            function2102 = function25;
                            i232 = i20;
                            function2112 = function28;
                            keyboardActions42 = keyboardActions3;
                            z102 = z5;
                            z112 = z7;
                            modifier32 = modifier2;
                            function2122 = function26;
                            function2132 = function29;
                            boolean z132 = z6;
                            visualTransformation22 = none;
                            z122 = z132;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i42 & 16;
                if (i8 == 0) {
                }
                if ((i27 & 458752) == 0) {
                }
                i9 = i42 & 64;
                if (i9 == 0) {
                }
                i10 = i42 & 128;
                if (i10 == 0) {
                }
                i11 = i42 & 256;
                if (i11 == 0) {
                }
                i12 = i42 & 512;
                if (i12 == 0) {
                }
                i13 = i42 & 1024;
                if (i13 == 0) {
                }
                i15 = i42 & 2048;
                if (i15 == 0) {
                }
                int i252 = i14;
                i16 = i42 & 4096;
                if (i16 != 0) {
                }
                if ((i32 & 7168) == 0) {
                }
                i17 = i42 & 16384;
                if (i17 != 0) {
                }
                i18 = i42 & 32768;
                if (i18 != 0) {
                }
                i19 = i42 & 65536;
                if (i19 != 0) {
                }
                if ((i32 & 29360128) == 0) {
                }
                if ((i32 & 234881024) == 0) {
                }
                if ((i5 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i7 = i42 & 8;
            int i242 = 1024;
            if (i7 != 0) {
            }
            i8 = i42 & 16;
            if (i8 == 0) {
            }
            if ((i27 & 458752) == 0) {
            }
            i9 = i42 & 64;
            if (i9 == 0) {
            }
            i10 = i42 & 128;
            if (i10 == 0) {
            }
            i11 = i42 & 256;
            if (i11 == 0) {
            }
            i12 = i42 & 512;
            if (i12 == 0) {
            }
            i13 = i42 & 1024;
            if (i13 == 0) {
            }
            i15 = i42 & 2048;
            if (i15 == 0) {
            }
            int i2522 = i14;
            i16 = i42 & 4096;
            if (i16 != 0) {
            }
            if ((i32 & 7168) == 0) {
            }
            i17 = i42 & 16384;
            if (i17 != 0) {
            }
            i18 = i42 & 32768;
            if (i18 != 0) {
            }
            i19 = i42 & 65536;
            if (i19 != 0) {
            }
            if ((i32 & 29360128) == 0) {
            }
            if ((i32 & 234881024) == 0) {
            }
            if ((i5 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i42 & 4;
        if (i6 == 0) {
        }
        i7 = i42 & 8;
        int i2422 = 1024;
        if (i7 != 0) {
        }
        i8 = i42 & 16;
        if (i8 == 0) {
        }
        if ((i27 & 458752) == 0) {
        }
        i9 = i42 & 64;
        if (i9 == 0) {
        }
        i10 = i42 & 128;
        if (i10 == 0) {
        }
        i11 = i42 & 256;
        if (i11 == 0) {
        }
        i12 = i42 & 512;
        if (i12 == 0) {
        }
        i13 = i42 & 1024;
        if (i13 == 0) {
        }
        i15 = i42 & 2048;
        if (i15 == 0) {
        }
        int i25222 = i14;
        i16 = i42 & 4096;
        if (i16 != 0) {
        }
        if ((i32 & 7168) == 0) {
        }
        i17 = i42 & 16384;
        if (i17 != 0) {
        }
        i18 = i42 & 32768;
        if (i18 != 0) {
        }
        i19 = i42 & 65536;
        if (i19 != 0) {
        }
        if ((i32 & 29360128) == 0) {
        }
        if ((i32 & 234881024) == 0) {
        }
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(@NotNull Modifier modifier, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, boolean z, float f, @NotNull Function1<? super Size, Unit> function1, @NotNull Function2<? super Composer, ? super Integer, Unit> function25, @NotNull PaddingValues paddingValues, @Nullable Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2049536174);
        int i4 = (i & 14) == 0 ? i | (composerStartRestartGroup.changed(modifier) ? 4 : 2) : i;
        if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((1879048192 & i) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function25) ? 536870912 : 268435456;
        }
        int i5 = i4;
        int i6 = (i2 & 14) == 0 ? i2 | (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) : i2;
        if ((i5 & 1533916891) != 306783378 || (i6 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049536174, i5, i6, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:492)");
            }
            Object[] objArr = {function1, Boolean.valueOf(z), Float.valueOf(f), paddingValues};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            int i7 = 0;
            boolean zChanged = false;
            for (int i8 = 4; i7 < i8; i8 = 4) {
                zChanged |= composerStartRestartGroup.changed(objArr[i7]);
                i7++;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(function1, z, f, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
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
            function25.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 27) & 14));
            composerStartRestartGroup.startReplaceableGroup(1169918334);
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
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1169918619);
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
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 15) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (function23 != null) {
                i3 = 0;
                fCalculateStartPadding = C2046Dp.m13666constructorimpl(RangesKt___RangesKt.coerceAtLeast(C2046Dp.m13666constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), C2046Dp.m13666constructorimpl(0)));
            } else {
                i3 = 0;
            }
            float f2 = fCalculateStartPadding;
            if (function24 != null) {
                fCalculateEndPadding = C2046Dp.m13666constructorimpl(RangesKt___RangesKt.coerceAtLeast(C2046Dp.m13666constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), C2046Dp.m13666constructorimpl(i3)));
            }
            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion2, f2, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(1169919630);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(modifierM8127paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i5 >> 3) & 112));
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, "TextField").then(modifierM8127paddingqDBjuR0$default);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierThen3);
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
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-614207693);
            if (function22 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion2, "Label");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor5 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
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
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 9) & 14));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$changed1;
                public final /* synthetic */ float $animationProgress;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $border;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
                public final /* synthetic */ Function1<Size, Unit> $onLabelMeasured;
                public final /* synthetic */ PaddingValues $paddingValues;
                public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> $placeholder;
                public final /* synthetic */ boolean $singleLine;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $textField;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C11522(Function2<? super Composer, ? super Integer, Unit> function26, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function222, Function2<? super Composer, ? super Integer, Unit> function232, Function2<? super Composer, ? super Integer, Unit> function242, boolean z2, float f3, Function1<? super Size, Unit> function12, Function2<? super Composer, ? super Integer, Unit> function252, PaddingValues paddingValues2, int i9, int i22) {
                    super(2);
                    function2 = function26;
                    function3 = function32;
                    function2 = function222;
                    function2 = function232;
                    function2 = function242;
                    z = z2;
                    f = f3;
                    function1 = function12;
                    function2 = function252;
                    paddingValues = paddingValues2;
                    i = i9;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, function2, function3, function2, function2, function2, z, f, function1, function2, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i));
                }
            });
        }
    }

    /* renamed from: calculateWidth-O3s9Psw */
    public static final int m8966calculateWidthO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        int iMax = i + Math.max(i3, Math.max(MathHelpersKt.lerp(i4, 0, f), i5)) + i2;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return Math.max(iMax, Math.max(MathKt__MathJVMKt.roundToInt((i4 + (C2046Dp.m13666constructorimpl(paddingValues.mo8074calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo8075calculateRightPaddingu2uoSUM(layoutDirection)) * f2)) * f), Constraints.m13624getMinWidthimpl(j)));
    }

    /* renamed from: calculateHeight-O3s9Psw */
    public static final int m8965calculateHeightO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        int iMax = Math.max(i3, Math.max(i5, MathHelpersKt.lerp(i4, 0, f)));
        float top = paddingValues.getTop() * f2;
        return Math.max(Constraints.m13623getMinHeightimpl(j), Math.max(i, Math.max(i2, MathKt__MathJVMKt.roundToInt(MathHelpersKt.lerp(top, Math.max(top, i4 / 2.0f), f) + iMax + (paddingValues.getBottom() * f2)))));
    }

    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(paddingValues.getTop() * f2);
        int iRoundToInt2 = MathKt__MathJVMKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, MathKt__MathJVMKt.roundToInt(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f)) + iRoundToInt2, MathHelpersKt.lerp(z ? Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i) : iRoundToInt, -(placeable4.getHeight() / 2), f), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z ? Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i) : iRoundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                iRoundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), Math.max(iRoundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.m12661place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m13804getZeronOccac(), 0.0f, 2, null);
    }

    @NotNull
    /* renamed from: outlineCutout-12SF9DM */
    public static final Modifier m8967outlineCutout12SF9DM(@NotNull Modifier modifier, final long j, @NotNull final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            /* compiled from: OutlinedTextField.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* loaded from: classes2.dex */
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
