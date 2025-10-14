package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
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
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextField.kt */
@Metadata(m7104d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001a\u0091\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010-\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00100\u001a\u0091\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010-\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00101\u001a\u009a\u0001\u00102\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0019\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e¢\u0006\u0002\b\u00182\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u00105\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010#\u001a\u00020\u00122\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\u0010:\u001aZ\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002072\u0006\u00108\u001a\u000209H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aB\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020%2\u0006\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020%2\u0006\u0010K\u001a\u00020%2\u0006\u0010L\u001a\u00020%2\u0006\u0010B\u001a\u00020CH\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a\u0014\u0010O\u001a\u00020\u0010*\u00020\u00102\u0006\u0010P\u001a\u00020QH\u0000\u001at\u0010R\u001a\u00020\n*\u00020S2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%2\u0006\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010W2\b\u0010Y\u001a\u0004\u0018\u00010W2\b\u0010Z\u001a\u0004\u0018\u00010W2\b\u0010[\u001a\u0004\u0018\u00010W2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020%2\u0006\u0010]\u001a\u00020%2\u0006\u00106\u001a\u0002072\u0006\u0010D\u001a\u000207H\u0002\u001aZ\u0010^\u001a\u00020\n*\u00020S2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%2\u0006\u0010_\u001a\u00020W2\b\u0010Y\u001a\u0004\u0018\u00010W2\b\u0010Z\u001a\u0004\u0018\u00010W2\b\u0010[\u001a\u0004\u0018\u00010W2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010D\u001a\u0002072\u0006\u00108\u001a\u000209H\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006`"}, m7105d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "getFirstBaselineOffset", "()F", "F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", "TextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,940:1\n74#2:941\n74#2:951\n74#2:959\n74#2:969\n74#2:987\n25#3:942\n25#3:952\n25#3:960\n25#3:970\n67#3,3:977\n66#3:980\n456#3,8:999\n464#3,3:1013\n456#3,8:1032\n464#3,3:1046\n467#3,3:1050\n456#3,8:1071\n464#3,3:1085\n467#3,3:1089\n456#3,8:1117\n464#3,3:1131\n467#3,3:1135\n456#3,8:1157\n464#3,3:1171\n467#3,3:1175\n467#3,3:1180\n1116#4,6:943\n1116#4,6:953\n1116#4,6:961\n1116#4,6:971\n1116#4,6:981\n658#5:949\n646#5:950\n658#5:967\n646#5:968\n79#6,11:988\n79#6,11:1021\n92#6:1053\n79#6,11:1060\n92#6:1092\n79#6,11:1106\n92#6:1138\n79#6,11:1146\n92#6:1178\n92#6:1183\n3737#7,6:1007\n3737#7,6:1040\n3737#7,6:1079\n3737#7,6:1125\n3737#7,6:1165\n69#8,5:1016\n74#8:1049\n78#8:1054\n69#8,5:1055\n74#8:1088\n78#8:1093\n68#8,6:1100\n74#8:1134\n78#8:1139\n68#8,6:1140\n74#8:1174\n78#8:1179\n58#9:1094\n58#9:1097\n154#10:1095\n211#10:1096\n154#10:1098\n211#10:1099\n154#10:1184\n154#10:1185\n154#10:1186\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n*L\n167#1:941\n244#1:951\n357#1:959\n433#1:969\n491#1:987\n179#1:942\n255#1:952\n369#1:960\n444#1:970\n488#1:977,3\n488#1:980\n492#1:999,8\n492#1:1013,3\n496#1:1032,8\n496#1:1046,3\n496#1:1050,3\n504#1:1071,8\n504#1:1085,3\n504#1:1089,3\n532#1:1117,8\n532#1:1131,3\n532#1:1135,3\n534#1:1157,8\n534#1:1171,3\n534#1:1175,3\n492#1:1180,3\n179#1:943,6\n255#1:953,6\n369#1:961,6\n444#1:971,6\n488#1:981,6\n185#1:949\n185#1:950\n374#1:967\n374#1:968\n492#1:988,11\n496#1:1021,11\n496#1:1053\n504#1:1060,11\n504#1:1092\n532#1:1106,11\n532#1:1138\n534#1:1146,11\n534#1:1178\n492#1:1183\n492#1:1007,6\n496#1:1040,6\n504#1:1079,6\n532#1:1125,6\n534#1:1165,6\n496#1:1016,5\n496#1:1049\n496#1:1054\n504#1:1055,5\n504#1:1088\n504#1:1093\n532#1:1100,6\n532#1:1134\n532#1:1139\n534#1:1140,6\n534#1:1174\n534#1:1179\n516#1:1094\n523#1:1097\n517#1:1095\n516#1:1096\n523#1:1098\n523#1:1099\n932#1:1184\n935#1:1185\n939#1:1186\n*E\n"})
/* loaded from: classes2.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = C2046Dp.m13666constructorimpl(20);
    private static final float TextFieldBottomPadding = C2046Dp.m13666constructorimpl(10);
    private static final float TextFieldTopPadding = C2046Dp.m13666constructorimpl(2);

    /* JADX WARN: Removed duplicated region for block: B:108:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(@NotNull final String str, @NotNull final Function1<? super String, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable TextStyle textStyle, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, @Nullable VisualTransformation visualTransformation, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, boolean z4, int i, int i2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, @Nullable TextFieldColors textFieldColors, @Nullable Composer composer, final int i3, final int i4, final int i5) {
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
        Shape shapeCopy$default;
        int i24;
        KeyboardActions keyboardActions3;
        MutableInteractionSource mutableInteractionSource4;
        TextFieldColors textFieldColorsM9070textFieldColorsdx8h9Zs;
        Shape shape2;
        int i25;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i26;
        int i27;
        Function2<? super Composer, ? super Integer, Unit> function29;
        boolean z9;
        long jM13195getColor0d7_KjU;
        final int i28;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final boolean z10;
        final Shape shape3;
        final TextStyle textStyle3;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource5;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final int i29;
        final KeyboardActions keyboardActions4;
        final KeyboardOptions keyboardOptions3;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final boolean z11;
        final boolean z12;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final VisualTransformation visualTransformation2;
        final boolean z13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1504264404);
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
                int i30 = 1024;
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
                    int i31 = i15;
                    i17 = i5 & 4096;
                    if (i17 != 0) {
                        if ((i4 & 896) == 0) {
                            i31 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                        }
                        if ((i4 & 7168) == 0) {
                            if ((i5 & 8192) == 0 && composerStartRestartGroup.changed(keyboardActions)) {
                                i30 = 2048;
                            }
                            i31 |= i30;
                        }
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i31 |= CpioConstants.C_ISBLK;
                        } else if ((i4 & 57344) == 0) {
                            i31 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                        }
                        if ((i4 & 458752) == 0) {
                            i31 |= ((i5 & 32768) == 0 && composerStartRestartGroup.changed(i)) ? 131072 : 65536;
                        }
                        i19 = i5 & 65536;
                        if (i19 != 0) {
                            i31 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i31 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i20 = i5 & 131072;
                        if (i20 != 0) {
                            i31 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i31 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                        }
                        if ((i4 & 234881024) == 0) {
                            i31 |= ((i5 & 262144) == 0 && composerStartRestartGroup.changed(shape)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i4 & 1879048192) == 0) {
                            i31 |= ((i5 & 524288) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 536870912 : 268435456;
                        }
                        if ((i6 & 1533916891) != 306783378 || (1533916891 & i31) != 306783378 || !composerStartRestartGroup.getSkipping()) {
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
                                    i31 &= -7169;
                                } else {
                                    keyboardActions2 = keyboardActions;
                                }
                                z8 = i18 == 0 ? false : z4;
                                if ((i5 & 32768) == 0) {
                                    i21 = i31 & (-458753);
                                    i22 = z8 ? 1 : Integer.MAX_VALUE;
                                } else {
                                    i21 = i31;
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
                                    shapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
                                    i24 = i21 & (-234881025);
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shapeCopy$default = shape;
                                    i24 = i21;
                                }
                                if ((i5 & 524288) == 0) {
                                    i24 &= -1879048193;
                                    keyboardActions3 = keyboardActions5;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    shape2 = shapeCopy$default;
                                    i25 = i22;
                                    textFieldColorsM9070textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m9070textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                } else {
                                    keyboardActions3 = keyboardActions5;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    textFieldColorsM9070textFieldColorsdx8h9Zs = textFieldColors;
                                    shape2 = shapeCopy$default;
                                    i25 = i22;
                                }
                                function28 = function216;
                                i26 = i6;
                                i27 = i24;
                                function29 = function27;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 32) != 0) {
                                    i6 &= -458753;
                                }
                                if ((i5 & 8192) != 0) {
                                    i31 &= -7169;
                                }
                                if ((32768 & i5) != 0) {
                                    i31 &= -458753;
                                }
                                if ((262144 & i5) != 0) {
                                    i31 &= -234881025;
                                }
                                if ((i5 & 524288) != 0) {
                                    i31 &= -1879048193;
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
                                i25 = i;
                                i23 = i2;
                                mutableInteractionSource4 = mutableInteractionSource;
                                shape2 = shape;
                                textFieldColorsM9070textFieldColorsdx8h9Zs = textFieldColors;
                                keyboardActions3 = keyboardActions;
                                int i32 = i31;
                                i26 = i6;
                                i27 = i32;
                            }
                            composerStartRestartGroup.endDefaults();
                            KeyboardOptions keyboardOptions4 = keyboardOptions2;
                            if (ComposerKt.isTraceInProgress()) {
                                z9 = z6;
                            } else {
                                z9 = z6;
                                ComposerKt.traceEventStart(-1504264404, i26, i27, "androidx.compose.material.TextField (TextField.kt:182)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-833027163);
                            jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                            if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                jM13195getColor0d7_KjU = textFieldColorsM9070textFieldColorsdx8h9Zs.textColor(z5, composerStartRestartGroup, ((i26 >> 9) & 14) | ((i27 >> 24) & 112)).getValue().m11350unboximpl();
                            }
                            long j = jM13195getColor0d7_KjU;
                            composerStartRestartGroup.endReplaceableGroup();
                            TextStyle textStyleMerge = textStyle2.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                            int i33 = (i27 >> 24) & 112;
                            final Function2<? super Composer, ? super Integer, Unit> function217 = function28;
                            final Function2<? super Composer, ? super Integer, Unit> function218 = function29;
                            final boolean z14 = z5;
                            Modifier modifier4 = modifier2;
                            final boolean z15 = z8;
                            final VisualTransformation visualTransformation3 = none;
                            final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                            final boolean z16 = z7;
                            final Function2<? super Composer, ? super Integer, Unit> function219 = function25;
                            final Function2<? super Composer, ? super Integer, Unit> function220 = function26;
                            final TextFieldColors textFieldColors3 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                            int i34 = i27 << 12;
                            BasicTextFieldKt.BasicTextField(str, function1, SizeKt.m8156defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(textFieldDefaults.m9067indicatorLinegv0btCI(BackgroundKt.m7770backgroundbw27NRU(modifier2, textFieldColorsM9070textFieldColorsdx8h9Zs.backgroundColor(z5, composerStartRestartGroup, ((i26 >> 9) & 14) | i33).getValue().m11350unboximpl(), shape2), z14, z7, mutableInteractionSource4, textFieldColorsM9070textFieldColorsdx8h9Zs, (48 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (48 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f), z7, Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9018getDefaultErrorMessageUdPEhr4(), composerStartRestartGroup, 6)), textFieldDefaults.m9065getMinWidthD9Ej5fM(), textFieldDefaults.m9064getMinHeightD9Ej5fM()), z5, z9, textStyleMerge, keyboardOptions4, keyboardActions3, z8, i25, i23, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColorsM9070textFieldColorsdx8h9Zs.cursorColor(z7, composerStartRestartGroup, (i27 & 14) | i33).getValue().m11350unboximpl(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 989834338, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function221, Composer composer2, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function221, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function221, @Nullable Composer composer2, int i35) {
                                    int i36;
                                    if ((i35 & 14) == 0) {
                                        i36 = i35 | (composer2.changedInstance(function221) ? 4 : 2);
                                    } else {
                                        i36 = i35;
                                    }
                                    if ((i36 & 91) != 18 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(989834338, i36, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:214)");
                                        }
                                        TextFieldDefaults.INSTANCE.TextFieldDecorationBox(str, function221, z14, z15, visualTransformation3, mutableInteractionSource6, z16, function219, function220, function217, function218, textFieldColors3, null, composer2, (i36 << 3) & 112, 3072, 4096);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, (64638 & i26) | (i34 & 3670016) | (i34 & 29360128) | (234881024 & i34) | (i34 & 1879048192), ((i27 >> 18) & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21 | (i27 & 112) | ((i27 >> 12) & 7168), 4096);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i28 = i25;
                            function210 = function26;
                            z10 = z5;
                            shape3 = shape2;
                            textStyle3 = textStyle2;
                            textFieldColors2 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            function211 = function25;
                            i29 = i23;
                            keyboardActions4 = keyboardActions3;
                            keyboardOptions3 = keyboardOptions4;
                            function212 = function217;
                            z11 = z7;
                            z12 = z8;
                            modifier3 = modifier4;
                            function213 = function218;
                            visualTransformation2 = none;
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
                            i28 = i;
                            i29 = i2;
                            mutableInteractionSource5 = mutableInteractionSource;
                            shape3 = shape;
                            textFieldColors2 = textFieldColors;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.3
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

                                public final void invoke(@Nullable Composer composer2, int i35) {
                                    TextFieldKt.TextField(str, function1, modifier3, z10, z13, textStyle3, function211, function210, function212, function213, z11, visualTransformation2, keyboardOptions3, keyboardActions4, z12, i28, i29, mutableInteractionSource5, shape3, textFieldColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i31 |= 384;
                    if ((i4 & 7168) == 0) {
                    }
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    if ((i4 & 458752) == 0) {
                    }
                    i19 = i5 & 65536;
                    if (i19 != 0) {
                    }
                    i20 = i5 & 131072;
                    if (i20 != 0) {
                    }
                    if ((i4 & 234881024) == 0) {
                    }
                    if ((i4 & 1879048192) == 0) {
                    }
                    if ((i6 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if ((i5 & 32) == 0) {
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
                            if ((i5 & 8192) == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if ((i5 & 32768) == 0) {
                            }
                            if (i19 == 0) {
                            }
                            KeyboardActions keyboardActions52 = keyboardActions2;
                            if (i20 == 0) {
                            }
                            if ((262144 & i5) == 0) {
                            }
                            if ((i5 & 524288) == 0) {
                            }
                            function28 = function2162;
                            i26 = i6;
                            i27 = i24;
                            function29 = function27;
                            composerStartRestartGroup.endDefaults();
                            KeyboardOptions keyboardOptions42 = keyboardOptions2;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(-833027163);
                            jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                            if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                            }
                            long j2 = jM13195getColor0d7_KjU;
                            composerStartRestartGroup.endReplaceableGroup();
                            TextStyle textStyleMerge2 = textStyle2.merge(new TextStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                            int i332 = (i27 >> 24) & 112;
                            final Function2<? super Composer, ? super Integer, Unit> function2172 = function28;
                            final Function2<? super Composer, ? super Integer, Unit> function2182 = function29;
                            final boolean z142 = z5;
                            Modifier modifier42 = modifier2;
                            final boolean z152 = z8;
                            final VisualTransformation visualTransformation32 = none;
                            final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                            final boolean z162 = z7;
                            final Function2<? super Composer, ? super Integer, Unit> function2192 = function25;
                            final Function2<? super Composer, ? super Integer, Unit> function2202 = function26;
                            final TextFieldColors textFieldColors32 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                            int i342 = i27 << 12;
                            BasicTextFieldKt.BasicTextField(str, function1, SizeKt.m8156defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(textFieldDefaults2.m9067indicatorLinegv0btCI(BackgroundKt.m7770backgroundbw27NRU(modifier2, textFieldColorsM9070textFieldColorsdx8h9Zs.backgroundColor(z5, composerStartRestartGroup, ((i26 >> 9) & 14) | i332).getValue().m11350unboximpl(), shape2), z142, z7, mutableInteractionSource4, textFieldColorsM9070textFieldColorsdx8h9Zs, (48 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (48 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f), z7, Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9018getDefaultErrorMessageUdPEhr4(), composerStartRestartGroup, 6)), textFieldDefaults2.m9065getMinWidthD9Ej5fM(), textFieldDefaults2.m9064getMinHeightD9Ej5fM()), z5, z9, textStyleMerge2, keyboardOptions42, keyboardActions3, z8, i25, i23, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColorsM9070textFieldColorsdx8h9Zs.cursorColor(z7, composerStartRestartGroup, (i27 & 14) | i332).getValue().m11350unboximpl(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 989834338, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function221, Composer composer2, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function221, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function221, @Nullable Composer composer2, int i35) {
                                    int i36;
                                    if ((i35 & 14) == 0) {
                                        i36 = i35 | (composer2.changedInstance(function221) ? 4 : 2);
                                    } else {
                                        i36 = i35;
                                    }
                                    if ((i36 & 91) != 18 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(989834338, i36, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:214)");
                                        }
                                        TextFieldDefaults.INSTANCE.TextFieldDecorationBox(str, function221, z142, z152, visualTransformation32, mutableInteractionSource62, z162, function2192, function2202, function2172, function2182, textFieldColors32, null, composer2, (i36 << 3) & 112, 3072, 4096);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, (64638 & i26) | (i342 & 3670016) | (i342 & 29360128) | (234881024 & i342) | (i342 & 1879048192), ((i27 >> 18) & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21 | (i27 & 112) | ((i27 >> 12) & 7168), 4096);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i28 = i25;
                            function210 = function26;
                            z10 = z5;
                            shape3 = shape2;
                            textStyle3 = textStyle2;
                            textFieldColors2 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            function211 = function25;
                            i29 = i23;
                            keyboardActions4 = keyboardActions3;
                            keyboardOptions3 = keyboardOptions42;
                            function212 = function2172;
                            z11 = z7;
                            z12 = z8;
                            modifier3 = modifier42;
                            function213 = function2182;
                            visualTransformation2 = none;
                            z13 = z9;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                if ((i3 & 458752) == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                i13 = i5 & 512;
                if (i13 == 0) {
                }
                i14 = i5 & 1024;
                if (i14 == 0) {
                }
                i16 = i5 & 2048;
                if (i16 == 0) {
                }
                int i312 = i15;
                i17 = i5 & 4096;
                if (i17 != 0) {
                }
                if ((i4 & 7168) == 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                if ((i4 & 458752) == 0) {
                }
                i19 = i5 & 65536;
                if (i19 != 0) {
                }
                i20 = i5 & 131072;
                if (i20 != 0) {
                }
                if ((i4 & 234881024) == 0) {
                }
                if ((i4 & 1879048192) == 0) {
                }
                if ((i6 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i5 & 8;
            int i302 = 1024;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            i13 = i5 & 512;
            if (i13 == 0) {
            }
            i14 = i5 & 1024;
            if (i14 == 0) {
            }
            i16 = i5 & 2048;
            if (i16 == 0) {
            }
            int i3122 = i15;
            i17 = i5 & 4096;
            if (i17 != 0) {
            }
            if ((i4 & 7168) == 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            if ((i4 & 458752) == 0) {
            }
            i19 = i5 & 65536;
            if (i19 != 0) {
            }
            i20 = i5 & 131072;
            if (i20 != 0) {
            }
            if ((i4 & 234881024) == 0) {
            }
            if ((i4 & 1879048192) == 0) {
            }
            if ((i6 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        int i3022 = 1024;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        i13 = i5 & 512;
        if (i13 == 0) {
        }
        i14 = i5 & 1024;
        if (i14 == 0) {
        }
        i16 = i5 & 2048;
        if (i16 == 0) {
        }
        int i31222 = i15;
        i17 = i5 & 4096;
        if (i17 != 0) {
        }
        if ((i4 & 7168) == 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        if ((i4 & 458752) == 0) {
        }
        i19 = i5 & 65536;
        if (i19 != 0) {
        }
        i20 = i5 & 131072;
        if (i20 != 0) {
        }
        if ((i4 & 234881024) == 0) {
        }
        if ((i4 & 1879048192) == 0) {
        }
        if ((i6 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TextField(final String str, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
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
        Shape shapeCopy$default;
        Function2 function28;
        TextFieldColors textFieldColorsM9070textFieldColorsdx8h9Zs;
        Shape shape2;
        int i21;
        int i22;
        Function2 function29;
        KeyboardActions keyboardActions3;
        MutableInteractionSource mutableInteractionSource4;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource5;
        final MutableInteractionSource mutableInteractionSource6;
        final KeyboardOptions keyboardOptions3;
        final boolean z9;
        final TextStyle textStyle3;
        final Shape shape3;
        final TextFieldColors textFieldColors2;
        final Function2 function210;
        final int i23;
        final Function2 function211;
        final KeyboardActions keyboardActions4;
        final boolean z10;
        final boolean z11;
        final Modifier modifier3;
        final Function2 function212;
        final Function2 function213;
        final VisualTransformation visualTransformation2;
        final boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1690895095);
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
                                    shapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
                                    i25 = (-29360129) & i25;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shapeCopy$default = shape;
                                }
                                if ((262144 & i4) == 0) {
                                    shape2 = shapeCopy$default;
                                    textFieldColorsM9070textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m9070textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                    i21 = i5;
                                    i22 = i25 & (-234881025);
                                    function29 = function216;
                                    keyboardActions3 = keyboardActions5;
                                    function28 = function27;
                                } else {
                                    function28 = function27;
                                    textFieldColorsM9070textFieldColorsdx8h9Zs = textFieldColors;
                                    shape2 = shapeCopy$default;
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
                                textFieldColorsM9070textFieldColorsdx8h9Zs = textFieldColors;
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
                                ComposerKt.traceEventStart(-1690895095, i21, i22, "androidx.compose.material.TextField (TextField.kt:258)");
                            }
                            int i26 = i22 << 3;
                            TextField(str, (Function1<? super String, Unit>) function1, modifier2, z5, z6, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) function28, z7, none, keyboardOptions2, keyboardActions3, z8, i20, 1, mutableInteractionSource5, shape2, textFieldColorsM9070textFieldColorsdx8h9Zs, composer2, i21 & 2147483646, (i22 & 14) | 1572864 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (29360128 & i26) | (234881024 & i26) | (i26 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource6 = mutableInteractionSource5;
                            keyboardOptions3 = keyboardOptions2;
                            z9 = z8;
                            textStyle3 = textStyle2;
                            shape3 = shape2;
                            textFieldColors2 = textFieldColorsM9070textFieldColorsdx8h9Zs;
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
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.5
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

                                public final void invoke(@Nullable Composer composer3, int i27) {
                                    TextFieldKt.TextField(str, function1, modifier3, z10, z12, textStyle3, function210, function212, function213, function211, z11, visualTransformation2, keyboardOptions3, keyboardActions4, z9, i23, mutableInteractionSource6, shape3, textFieldColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i25 |= 384;
                    if ((i3 & 7168) == 0) {
                    }
                    i17 = i4 & 16384;
                    if (i17 != 0) {
                    }
                    i18 = i4 & 32768;
                    if (i18 != 0) {
                    }
                    i19 = i4 & 65536;
                    if (i19 != 0) {
                    }
                    if ((i3 & 29360128) == 0) {
                    }
                    if ((i3 & 234881024) == 0) {
                    }
                    if ((i5 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i4 & 32) == 0) {
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
                            if ((i4 & 8192) == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            KeyboardActions keyboardActions52 = keyboardActions2;
                            if (i19 == 0) {
                            }
                            if ((i4 & 131072) == 0) {
                            }
                            if ((262144 & i4) == 0) {
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            composerStartRestartGroup.endDefaults();
                            composer2 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i262 = i22 << 3;
                            TextField(str, (Function1<? super String, Unit>) function1, modifier2, z5, z6, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) function28, z7, none, keyboardOptions2, keyboardActions3, z8, i20, 1, mutableInteractionSource5, shape2, textFieldColorsM9070textFieldColorsdx8h9Zs, composer2, i21 & 2147483646, (i22 & 14) | 1572864 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (29360128 & i262) | (234881024 & i262) | (i262 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource6 = mutableInteractionSource5;
                            keyboardOptions3 = keyboardOptions2;
                            z9 = z8;
                            textStyle3 = textStyle2;
                            shape3 = shape2;
                            textFieldColors2 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                            function210 = function25;
                            i23 = i20;
                            function211 = function28;
                            keyboardActions4 = keyboardActions3;
                            z10 = z5;
                            z11 = z7;
                            modifier3 = modifier2;
                            function212 = function26;
                            function213 = function29;
                            boolean z132 = z6;
                            visualTransformation2 = none;
                            z12 = z132;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                if ((i2 & 458752) == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i4 & 512;
                if (i12 == 0) {
                }
                i13 = i4 & 1024;
                if (i13 == 0) {
                }
                i15 = i4 & 2048;
                if (i15 == 0) {
                }
                int i252 = i14;
                i16 = i4 & 4096;
                if (i16 != 0) {
                }
                if ((i3 & 7168) == 0) {
                }
                i17 = i4 & 16384;
                if (i17 != 0) {
                }
                i18 = i4 & 32768;
                if (i18 != 0) {
                }
                i19 = i4 & 65536;
                if (i19 != 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                if ((i5 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i7 = i4 & 8;
            int i242 = 1024;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i4 & 512;
            if (i12 == 0) {
            }
            i13 = i4 & 1024;
            if (i13 == 0) {
            }
            i15 = i4 & 2048;
            if (i15 == 0) {
            }
            int i2522 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            i17 = i4 & 16384;
            if (i17 != 0) {
            }
            i18 = i4 & 32768;
            if (i18 != 0) {
            }
            i19 = i4 & 65536;
            if (i19 != 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i5 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        int i2422 = 1024;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i4 & 512;
        if (i12 == 0) {
        }
        i13 = i4 & 1024;
        if (i13 == 0) {
        }
        i15 = i4 & 2048;
        if (i15 == 0) {
        }
        int i25222 = i14;
        i16 = i4 & 4096;
        if (i16 != 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        i17 = i4 & 16384;
        if (i17 != 0) {
        }
        i18 = i4 & 32768;
        if (i18 != 0) {
        }
        i19 = i4 & 65536;
        if (i19 != 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(@NotNull final TextFieldValue textFieldValue, @NotNull final Function1<? super TextFieldValue, Unit> function1, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable TextStyle textStyle, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, @Nullable VisualTransformation visualTransformation, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, boolean z4, int i, int i2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, @Nullable TextFieldColors textFieldColors, @Nullable Composer composer, final int i3, final int i4, final int i5) {
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
        Shape textFieldShape;
        int i24;
        KeyboardActions keyboardActions3;
        MutableInteractionSource mutableInteractionSource4;
        TextFieldColors textFieldColorsM9070textFieldColorsdx8h9Zs;
        Shape shape2;
        int i25;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i26;
        int i27;
        Function2<? super Composer, ? super Integer, Unit> function29;
        boolean z9;
        long jM13195getColor0d7_KjU;
        final int i28;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final boolean z10;
        final Shape shape3;
        final TextStyle textStyle3;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource5;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final int i29;
        final KeyboardActions keyboardActions4;
        final KeyboardOptions keyboardOptions3;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final boolean z11;
        final boolean z12;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final VisualTransformation visualTransformation2;
        final boolean z13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-359119489);
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
                int i30 = 1024;
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
                    int i31 = i15;
                    i17 = i5 & 4096;
                    if (i17 != 0) {
                        if ((i4 & 896) == 0) {
                            i31 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                        }
                        if ((i4 & 7168) == 0) {
                            if ((i5 & 8192) == 0 && composerStartRestartGroup.changed(keyboardActions)) {
                                i30 = 2048;
                            }
                            i31 |= i30;
                        }
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i31 |= CpioConstants.C_ISBLK;
                        } else if ((i4 & 57344) == 0) {
                            i31 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                        }
                        if ((i4 & 458752) == 0) {
                            i31 |= ((i5 & 32768) == 0 && composerStartRestartGroup.changed(i)) ? 131072 : 65536;
                        }
                        i19 = i5 & 65536;
                        if (i19 != 0) {
                            i31 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i31 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i20 = i5 & 131072;
                        if (i20 != 0) {
                            i31 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i31 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                        }
                        if ((i4 & 234881024) == 0) {
                            i31 |= ((i5 & 262144) == 0 && composerStartRestartGroup.changed(shape)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i4 & 1879048192) == 0) {
                            i31 |= ((i5 & 524288) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 536870912 : 268435456;
                        }
                        if ((i6 & 1533916891) != 306783378 || (1533916891 & i31) != 306783378 || !composerStartRestartGroup.getSkipping()) {
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
                                    i31 &= -7169;
                                } else {
                                    keyboardActions2 = keyboardActions;
                                }
                                z8 = i18 == 0 ? false : z4;
                                if ((i5 & 32768) == 0) {
                                    i21 = i31 & (-458753);
                                    i22 = z8 ? 1 : Integer.MAX_VALUE;
                                } else {
                                    i21 = i31;
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
                                    textFieldShape = TextFieldDefaults.INSTANCE.getTextFieldShape(composerStartRestartGroup, 6);
                                    i24 = i21 & (-234881025);
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    textFieldShape = shape;
                                    i24 = i21;
                                }
                                if ((i5 & 524288) == 0) {
                                    i24 &= -1879048193;
                                    keyboardActions3 = keyboardActions5;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    shape2 = textFieldShape;
                                    i25 = i22;
                                    textFieldColorsM9070textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m9070textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                } else {
                                    keyboardActions3 = keyboardActions5;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    textFieldColorsM9070textFieldColorsdx8h9Zs = textFieldColors;
                                    shape2 = textFieldShape;
                                    i25 = i22;
                                }
                                function28 = function27;
                                i26 = i6;
                                i27 = i24;
                                function29 = function216;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 32) != 0) {
                                    i6 &= -458753;
                                }
                                if ((i5 & 8192) != 0) {
                                    i31 &= -7169;
                                }
                                if ((32768 & i5) != 0) {
                                    i31 &= -458753;
                                }
                                if ((262144 & i5) != 0) {
                                    i31 &= -234881025;
                                }
                                if ((i5 & 524288) != 0) {
                                    i31 &= -1879048193;
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
                                i25 = i;
                                i23 = i2;
                                mutableInteractionSource4 = mutableInteractionSource;
                                shape2 = shape;
                                textFieldColorsM9070textFieldColorsdx8h9Zs = textFieldColors;
                                keyboardActions3 = keyboardActions;
                                int i32 = i31;
                                i26 = i6;
                                i27 = i32;
                            }
                            composerStartRestartGroup.endDefaults();
                            KeyboardOptions keyboardOptions4 = keyboardOptions2;
                            if (ComposerKt.isTraceInProgress()) {
                                z9 = z6;
                            } else {
                                z9 = z6;
                                ComposerKt.traceEventStart(-359119489, i26, i27, "androidx.compose.material.TextField (TextField.kt:371)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-833018012);
                            jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                            if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                                jM13195getColor0d7_KjU = textFieldColorsM9070textFieldColorsdx8h9Zs.textColor(z5, composerStartRestartGroup, ((i26 >> 9) & 14) | ((i27 >> 24) & 112)).getValue().m11350unboximpl();
                            }
                            long j = jM13195getColor0d7_KjU;
                            composerStartRestartGroup.endReplaceableGroup();
                            TextStyle textStyleMerge = textStyle2.merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                            int i33 = (i27 >> 24) & 112;
                            final Function2<? super Composer, ? super Integer, Unit> function217 = function29;
                            final Function2<? super Composer, ? super Integer, Unit> function218 = function28;
                            final boolean z14 = z5;
                            Modifier modifier4 = modifier2;
                            final boolean z15 = z8;
                            final VisualTransformation visualTransformation3 = none;
                            final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                            final boolean z16 = z7;
                            final Function2<? super Composer, ? super Integer, Unit> function219 = function25;
                            final Function2<? super Composer, ? super Integer, Unit> function220 = function26;
                            final TextFieldColors textFieldColors3 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                            int i34 = i27 << 12;
                            BasicTextFieldKt.BasicTextField(textFieldValue, function1, SizeKt.m8156defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(textFieldDefaults.m9067indicatorLinegv0btCI(BackgroundKt.m7770backgroundbw27NRU(modifier2, textFieldColorsM9070textFieldColorsdx8h9Zs.backgroundColor(z5, composerStartRestartGroup, ((i26 >> 9) & 14) | i33).getValue().m11350unboximpl(), shape2), z14, z7, mutableInteractionSource4, textFieldColorsM9070textFieldColorsdx8h9Zs, (48 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (48 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f), z7, Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9018getDefaultErrorMessageUdPEhr4(), composerStartRestartGroup, 6)), textFieldDefaults.m9065getMinWidthD9Ej5fM(), textFieldDefaults.m9064getMinHeightD9Ej5fM()), z5, z9, textStyleMerge, keyboardOptions4, keyboardActions3, z8, i25, i23, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColorsM9070textFieldColorsdx8h9Zs.cursorColor(z7, composerStartRestartGroup, (i27 & 14) | i33).getValue().m11350unboximpl(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -126640971, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function221, Composer composer2, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function221, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function221, @Nullable Composer composer2, int i35) {
                                    int i36;
                                    if ((i35 & 14) == 0) {
                                        i36 = i35 | (composer2.changedInstance(function221) ? 4 : 2);
                                    } else {
                                        i36 = i35;
                                    }
                                    if ((i36 & 91) != 18 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-126640971, i36, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:403)");
                                        }
                                        TextFieldDefaults.INSTANCE.TextFieldDecorationBox(textFieldValue.getText(), function221, z14, z15, visualTransformation3, mutableInteractionSource6, z16, function219, function220, function217, function218, textFieldColors3, null, composer2, (i36 << 3) & 112, 3072, 4096);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, (64638 & i26) | (i34 & 3670016) | (i34 & 29360128) | (234881024 & i34) | (i34 & 1879048192), ((i27 >> 18) & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21 | (i27 & 112) | ((i27 >> 12) & 7168), 4096);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i28 = i25;
                            function210 = function26;
                            z10 = z5;
                            shape3 = shape2;
                            textStyle3 = textStyle2;
                            textFieldColors2 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            function211 = function25;
                            i29 = i23;
                            keyboardActions4 = keyboardActions3;
                            keyboardOptions3 = keyboardOptions4;
                            function212 = function217;
                            z11 = z7;
                            z12 = z8;
                            modifier3 = modifier4;
                            function213 = function218;
                            visualTransformation2 = none;
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
                            i28 = i;
                            i29 = i2;
                            mutableInteractionSource5 = mutableInteractionSource;
                            shape3 = shape;
                            textFieldColors2 = textFieldColors;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.8
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

                                public final void invoke(@Nullable Composer composer2, int i35) {
                                    TextFieldKt.TextField(textFieldValue, function1, modifier3, z10, z13, textStyle3, function211, function210, function212, function213, z11, visualTransformation2, keyboardOptions3, keyboardActions4, z12, i28, i29, mutableInteractionSource5, shape3, textFieldColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i31 |= 384;
                    if ((i4 & 7168) == 0) {
                    }
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    if ((i4 & 458752) == 0) {
                    }
                    i19 = i5 & 65536;
                    if (i19 != 0) {
                    }
                    i20 = i5 & 131072;
                    if (i20 != 0) {
                    }
                    if ((i4 & 234881024) == 0) {
                    }
                    if ((i4 & 1879048192) == 0) {
                    }
                    if ((i6 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if ((i5 & 32) == 0) {
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
                            if ((i5 & 8192) == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if ((i5 & 32768) == 0) {
                            }
                            if (i19 == 0) {
                            }
                            KeyboardActions keyboardActions52 = keyboardActions2;
                            if (i20 == 0) {
                            }
                            if ((262144 & i5) == 0) {
                            }
                            if ((i5 & 524288) == 0) {
                            }
                            function28 = function27;
                            i26 = i6;
                            i27 = i24;
                            function29 = function2162;
                            composerStartRestartGroup.endDefaults();
                            KeyboardOptions keyboardOptions42 = keyboardOptions2;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(-833018012);
                            jM13195getColor0d7_KjU = textStyle2.m13195getColor0d7_KjU();
                            if (jM13195getColor0d7_KjU == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                            }
                            long j2 = jM13195getColor0d7_KjU;
                            composerStartRestartGroup.endReplaceableGroup();
                            TextStyle textStyleMerge2 = textStyle2.merge(new TextStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                            int i332 = (i27 >> 24) & 112;
                            final Function2<? super Composer, ? super Integer, Unit> function2172 = function29;
                            final Function2<? super Composer, ? super Integer, Unit> function2182 = function28;
                            final boolean z142 = z5;
                            Modifier modifier42 = modifier2;
                            final boolean z152 = z8;
                            final VisualTransformation visualTransformation32 = none;
                            final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                            final boolean z162 = z7;
                            final Function2<? super Composer, ? super Integer, Unit> function2192 = function25;
                            final Function2<? super Composer, ? super Integer, Unit> function2202 = function26;
                            final TextFieldColors textFieldColors32 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                            int i342 = i27 << 12;
                            BasicTextFieldKt.BasicTextField(textFieldValue, function1, SizeKt.m8156defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(textFieldDefaults2.m9067indicatorLinegv0btCI(BackgroundKt.m7770backgroundbw27NRU(modifier2, textFieldColorsM9070textFieldColorsdx8h9Zs.backgroundColor(z5, composerStartRestartGroup, ((i26 >> 9) & 14) | i332).getValue().m11350unboximpl(), shape2), z142, z7, mutableInteractionSource4, textFieldColorsM9070textFieldColorsdx8h9Zs, (48 & 16) != 0 ? TextFieldDefaults.FocusedBorderThickness : 0.0f, (48 & 32) != 0 ? TextFieldDefaults.UnfocusedBorderThickness : 0.0f), z7, Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9018getDefaultErrorMessageUdPEhr4(), composerStartRestartGroup, 6)), textFieldDefaults2.m9065getMinWidthD9Ej5fM(), textFieldDefaults2.m9064getMinHeightD9Ej5fM()), z5, z9, textStyleMerge2, keyboardOptions42, keyboardActions3, z8, i25, i23, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColorsM9070textFieldColorsdx8h9Zs.cursorColor(z7, composerStartRestartGroup, (i27 & 14) | i332).getValue().m11350unboximpl(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -126640971, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function221, Composer composer2, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function221, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> function221, @Nullable Composer composer2, int i35) {
                                    int i36;
                                    if ((i35 & 14) == 0) {
                                        i36 = i35 | (composer2.changedInstance(function221) ? 4 : 2);
                                    } else {
                                        i36 = i35;
                                    }
                                    if ((i36 & 91) != 18 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-126640971, i36, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:403)");
                                        }
                                        TextFieldDefaults.INSTANCE.TextFieldDecorationBox(textFieldValue.getText(), function221, z142, z152, visualTransformation32, mutableInteractionSource62, z162, function2192, function2202, function2172, function2182, textFieldColors32, null, composer2, (i36 << 3) & 112, 3072, 4096);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, (64638 & i26) | (i342 & 3670016) | (i342 & 29360128) | (234881024 & i342) | (i342 & 1879048192), ((i27 >> 18) & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21 | (i27 & 112) | ((i27 >> 12) & 7168), 4096);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i28 = i25;
                            function210 = function26;
                            z10 = z5;
                            shape3 = shape2;
                            textStyle3 = textStyle2;
                            textFieldColors2 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            function211 = function25;
                            i29 = i23;
                            keyboardActions4 = keyboardActions3;
                            keyboardOptions3 = keyboardOptions42;
                            function212 = function2172;
                            z11 = z7;
                            z12 = z8;
                            modifier3 = modifier42;
                            function213 = function2182;
                            visualTransformation2 = none;
                            z13 = z9;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                if ((i3 & 458752) == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                i13 = i5 & 512;
                if (i13 == 0) {
                }
                i14 = i5 & 1024;
                if (i14 == 0) {
                }
                i16 = i5 & 2048;
                if (i16 == 0) {
                }
                int i312 = i15;
                i17 = i5 & 4096;
                if (i17 != 0) {
                }
                if ((i4 & 7168) == 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                if ((i4 & 458752) == 0) {
                }
                i19 = i5 & 65536;
                if (i19 != 0) {
                }
                i20 = i5 & 131072;
                if (i20 != 0) {
                }
                if ((i4 & 234881024) == 0) {
                }
                if ((i4 & 1879048192) == 0) {
                }
                if ((i6 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i5 & 8;
            int i302 = 1024;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            i13 = i5 & 512;
            if (i13 == 0) {
            }
            i14 = i5 & 1024;
            if (i14 == 0) {
            }
            i16 = i5 & 2048;
            if (i16 == 0) {
            }
            int i3122 = i15;
            i17 = i5 & 4096;
            if (i17 != 0) {
            }
            if ((i4 & 7168) == 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            if ((i4 & 458752) == 0) {
            }
            i19 = i5 & 65536;
            if (i19 != 0) {
            }
            i20 = i5 & 131072;
            if (i20 != 0) {
            }
            if ((i4 & 234881024) == 0) {
            }
            if ((i4 & 1879048192) == 0) {
            }
            if ((i6 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        int i3022 = 1024;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        i13 = i5 & 512;
        if (i13 == 0) {
        }
        i14 = i5 & 1024;
        if (i14 == 0) {
        }
        i16 = i5 & 2048;
        if (i16 == 0) {
        }
        int i31222 = i15;
        i17 = i5 & 4096;
        if (i17 != 0) {
        }
        if ((i4 & 7168) == 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        if ((i4 & 458752) == 0) {
        }
        i19 = i5 & 65536;
        if (i19 != 0) {
        }
        i20 = i5 & 131072;
        if (i20 != 0) {
        }
        if ((i4 & 234881024) == 0) {
        }
        if ((i4 & 1879048192) == 0) {
        }
        if ((i6 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TextField(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
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
        Shape textFieldShape;
        Function2 function28;
        TextFieldColors textFieldColorsM9070textFieldColorsdx8h9Zs;
        Shape shape2;
        int i21;
        int i22;
        Function2 function29;
        KeyboardActions keyboardActions3;
        MutableInteractionSource mutableInteractionSource4;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource5;
        final MutableInteractionSource mutableInteractionSource6;
        final KeyboardOptions keyboardOptions3;
        final boolean z9;
        final TextStyle textStyle3;
        final Shape shape3;
        final TextFieldColors textFieldColors2;
        final Function2 function210;
        final int i23;
        final Function2 function211;
        final KeyboardActions keyboardActions4;
        final boolean z10;
        final boolean z11;
        final Modifier modifier3;
        final Function2 function212;
        final Function2 function213;
        final VisualTransformation visualTransformation2;
        final boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1576622884);
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
                                    textFieldShape = TextFieldDefaults.INSTANCE.getTextFieldShape(composerStartRestartGroup, 6);
                                    i25 = (-29360129) & i25;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    textFieldShape = shape;
                                }
                                if ((262144 & i4) == 0) {
                                    shape2 = textFieldShape;
                                    textFieldColorsM9070textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m9070textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                    i21 = i5;
                                    i22 = i25 & (-234881025);
                                    function29 = function216;
                                    keyboardActions3 = keyboardActions5;
                                    function28 = function27;
                                } else {
                                    function28 = function27;
                                    textFieldColorsM9070textFieldColorsdx8h9Zs = textFieldColors;
                                    shape2 = textFieldShape;
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
                                textFieldColorsM9070textFieldColorsdx8h9Zs = textFieldColors;
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
                                ComposerKt.traceEventStart(-1576622884, i21, i22, "androidx.compose.material.TextField (TextField.kt:446)");
                            }
                            int i26 = i22 << 3;
                            TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier2, z5, z6, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) function28, z7, none, keyboardOptions2, keyboardActions3, z8, i20, 1, mutableInteractionSource5, shape2, textFieldColorsM9070textFieldColorsdx8h9Zs, composer2, i21 & 2147483646, (i22 & 14) | 1572864 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (29360128 & i26) | (234881024 & i26) | (i26 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource6 = mutableInteractionSource5;
                            keyboardOptions3 = keyboardOptions2;
                            z9 = z8;
                            textStyle3 = textStyle2;
                            shape3 = shape2;
                            textFieldColors2 = textFieldColorsM9070textFieldColorsdx8h9Zs;
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
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.10
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

                                public final void invoke(@Nullable Composer composer3, int i27) {
                                    TextFieldKt.TextField(textFieldValue, function1, modifier3, z10, z12, textStyle3, function210, function212, function213, function211, z11, visualTransformation2, keyboardOptions3, keyboardActions4, z9, i23, mutableInteractionSource6, shape3, textFieldColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i25 |= 384;
                    if ((i3 & 7168) == 0) {
                    }
                    i17 = i4 & 16384;
                    if (i17 != 0) {
                    }
                    i18 = i4 & 32768;
                    if (i18 != 0) {
                    }
                    i19 = i4 & 65536;
                    if (i19 != 0) {
                    }
                    if ((i3 & 29360128) == 0) {
                    }
                    if ((i3 & 234881024) == 0) {
                    }
                    if ((i5 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i4 & 32) == 0) {
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
                            if ((i4 & 8192) == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            KeyboardActions keyboardActions52 = keyboardActions2;
                            if (i19 == 0) {
                            }
                            if ((i4 & 131072) == 0) {
                            }
                            if ((262144 & i4) == 0) {
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            composerStartRestartGroup.endDefaults();
                            composer2 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i262 = i22 << 3;
                            TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier2, z5, z6, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function29, (Function2<? super Composer, ? super Integer, Unit>) function28, z7, none, keyboardOptions2, keyboardActions3, z8, i20, 1, mutableInteractionSource5, shape2, textFieldColorsM9070textFieldColorsdx8h9Zs, composer2, i21 & 2147483646, (i22 & 14) | 1572864 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (29360128 & i262) | (234881024 & i262) | (i262 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource6 = mutableInteractionSource5;
                            keyboardOptions3 = keyboardOptions2;
                            z9 = z8;
                            textStyle3 = textStyle2;
                            shape3 = shape2;
                            textFieldColors2 = textFieldColorsM9070textFieldColorsdx8h9Zs;
                            function210 = function25;
                            i23 = i20;
                            function211 = function28;
                            keyboardActions4 = keyboardActions3;
                            z10 = z5;
                            z11 = z7;
                            modifier3 = modifier2;
                            function212 = function26;
                            function213 = function29;
                            boolean z132 = z6;
                            visualTransformation2 = none;
                            z12 = z132;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                if ((i2 & 458752) == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i4 & 512;
                if (i12 == 0) {
                }
                i13 = i4 & 1024;
                if (i13 == 0) {
                }
                i15 = i4 & 2048;
                if (i15 == 0) {
                }
                int i252 = i14;
                i16 = i4 & 4096;
                if (i16 != 0) {
                }
                if ((i3 & 7168) == 0) {
                }
                i17 = i4 & 16384;
                if (i17 != 0) {
                }
                i18 = i4 & 32768;
                if (i18 != 0) {
                }
                i19 = i4 & 65536;
                if (i19 != 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                if ((i5 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i7 = i4 & 8;
            int i242 = 1024;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i4 & 512;
            if (i12 == 0) {
            }
            i13 = i4 & 1024;
            if (i13 == 0) {
            }
            i15 = i4 & 2048;
            if (i15 == 0) {
            }
            int i2522 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            i17 = i4 & 16384;
            if (i17 != 0) {
            }
            i18 = i4 & 32768;
            if (i18 != 0) {
            }
            i19 = i4 & 65536;
            if (i19 != 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i5 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        int i2422 = 1024;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i4 & 512;
        if (i12 == 0) {
        }
        i13 = i4 & 1024;
        if (i13 == 0) {
        }
        i15 = i4 & 2048;
        if (i15 == 0) {
        }
        int i25222 = i14;
        i16 = i4 & 4096;
        if (i16 != 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        i17 = i4 & 16384;
        if (i17 != 0) {
        }
        i18 = i4 & 32768;
        if (i18 != 0) {
        }
        i19 = i4 & 65536;
        if (i19 != 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(@NotNull final Modifier modifier, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, @Nullable final Function2<? super Composer, ? super Integer, Unit> function23, @Nullable final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final float f, @NotNull final PaddingValues paddingValues, @Nullable Composer composer, final int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2112507061);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((191739611 & i2) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112507061, i2, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:486)");
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            Float fValueOf = Float.valueOf(f);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(paddingValues);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objRememberedValue;
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
            composerStartRestartGroup.startReplaceableGroup(254819939);
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
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 12) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(254820224);
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
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 15) & 14));
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
            composerStartRestartGroup.startReplaceableGroup(254821235);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(modifierM8127paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i2 >> 6) & 112));
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(254821364);
            if (function22 != null) {
                Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, "Label").then(modifierM8127paddingqDBjuR0$default);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
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
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 6) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen4 = LayoutIdKt.layoutId(companion2, "TextField").then(modifierM8127paddingqDBjuR0$default);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierThen4);
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
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextFieldLayout.2
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

                public final void invoke(@Nullable Composer composer2, int i4) {
                    TextFieldKt.TextFieldLayout(modifier, function2, function22, function3, function23, function24, z, f, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m9082calculateWidthVsPV1Ek(int i, int i2, int i3, int i4, int i5, long j) {
        return Math.max(i + Math.max(i3, Math.max(i4, i5)) + i2, Constraints.m13624getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m9081calculateHeightO3s9Psw(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, PaddingValues paddingValues) {
        float f2 = TextFieldTopPadding * f;
        float top = paddingValues.getTop() * f;
        float bottom = paddingValues.getBottom() * f;
        int iMax = Math.max(i, i5);
        return Math.max(MathKt__MathJVMKt.roundToInt(z ? i2 + f2 + iMax + bottom : top + iMax + bottom), Math.max(Math.max(i3, i4), Constraints.m13623getMinHeightimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z, int i3, int i4, float f, float f2) {
        int iRoundToInt;
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                iRoundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i2);
            } else {
                iRoundToInt = MathKt__MathJVMKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), iRoundToInt - MathKt__MathJVMKt.roundToInt((iRoundToInt - i3) * f), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z, float f, PaddingValues paddingValues) {
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(paddingValues.getTop() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i2) : iRoundToInt, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z) {
                iRoundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), iRoundToInt, 0.0f, 4, null);
        }
    }

    @NotNull
    public static final Modifier drawIndicatorLine(@NotNull Modifier modifier, @NotNull final BorderStroke borderStroke) {
        final float width = borderStroke.getWidth();
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.TextFieldKt.drawIndicatorLine.1
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
                contentDrawScope.drawContent();
                if (C2046Dp.m13671equalsimpl0(width, C2046Dp.INSTANCE.m13684getHairlineD9Ej5fM())) {
                    return;
                }
                float density = width * contentDrawScope.getDensity();
                float fM11165getHeightimpl = Size.m11165getHeightimpl(contentDrawScope.mo11889getSizeNHjbRc()) - (density / 2);
                DrawScope.m11875drawLine1RTmtNc$default(contentDrawScope, borderStroke.getBrush(), OffsetKt.Offset(0.0f, fM11165getHeightimpl), OffsetKt.Offset(Size.m11168getWidthimpl(contentDrawScope.mo11889getSizeNHjbRc()), fM11165getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }
}
