package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorProducer;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.Placeholder;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicText.kt */
@Metadata(m7104d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001an\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010 \u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010!\u001a\u001e\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002\u001a¬\u0001\u0010'\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)2\u0014\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,\u0018\u00010+2\u001c\u0010.\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010/0+\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, m7105d2 = {"BasicText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "BasicText-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "textModifier", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "textModifier-RWo7tUw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)Landroidx/compose/ui/Modifier;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,447:1\n74#2:448\n74#2:449\n74#2:460\n74#2:461\n74#2:490\n74#2:491\n74#2:502\n74#2:538\n67#3,3:450\n66#3:453\n286#3,8:467\n294#3,2:487\n67#3,3:492\n66#3:495\n286#3,8:508\n294#3,2:528\n25#3:531\n456#3,8:562\n464#3,6:576\n1116#4,6:454\n1116#4,6:496\n1116#4,6:532\n1116#4,6:539\n1116#4,6:545\n124#5,5:462\n130#5,5:475\n135#5:486\n137#5:489\n124#5,5:503\n130#5,5:516\n135#5:527\n137#5:530\n79#5,11:551\n92#5:582\n3737#6,6:480\n3737#6,6:521\n3737#6,6:570\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n96#1:448\n98#1:449\n125#1:460\n137#1:461\n190#1:490\n192#1:491\n221#1:502\n250#1:538\n103#1:450,3\n103#1:453\n145#1:467,8\n145#1:487,2\n197#1:492,3\n197#1:495\n209#1:508,8\n209#1:528,2\n234#1:531\n237#1:562,8\n237#1:576,6\n103#1:454,6\n197#1:496,6\n234#1:532,6\n252#1:539,6\n256#1:545,6\n145#1:462,5\n145#1:475,5\n145#1:486\n145#1:489\n209#1:503,5\n209#1:516,5\n209#1:527\n209#1:530\n237#1:551,11\n237#1:582\n145#1:480,6\n209#1:521,6\n237#1:570,6\n*E\n"})
/* loaded from: classes2.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:188:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BasicText-VhcvRP8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8402BasicTextVhcvRP8(@NotNull final String str, @Nullable Modifier modifier, @Nullable TextStyle textStyle, @Nullable Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, @Nullable ColorProducer colorProducer, @Nullable Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1<? super TextLayoutResult, Unit> function12;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Modifier modifier2;
        TextStyle textStyle3;
        SelectionController selectionController;
        Function1<? super TextLayoutResult, Unit> function13;
        int iM13607getClipgIe3tQ8;
        boolean z2;
        int i15;
        int i16;
        ColorProducer colorProducer2;
        final SelectionRegistrar selectionRegistrar;
        int i17;
        Modifier modifierM8403textModifierRWo7tUw;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        final TextStyle textStyle4;
        final Function1<? super TextLayoutResult, Unit> function14;
        final int i18;
        final int i19;
        final boolean z3;
        final int i20;
        final ColorProducer colorProducer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1186827822);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i21 = i5 & 2;
        if (i21 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 112) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 896) == 0) {
                    textStyle2 = textStyle;
                    i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 7168) == 0) {
                        function12 = function1;
                        i6 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 != 0) {
                        if ((57344 & i4) == 0) {
                            i10 = i;
                            i6 |= composerStartRestartGroup.changed(i10) ? 16384 : 8192;
                        }
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else if ((i4 & 458752) == 0) {
                            i6 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if (i14 != 256 || (191739611 & i6) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            modifier2 = i21 == 0 ? Modifier.INSTANCE : modifier;
                            textStyle3 = i7 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                            selectionController = null;
                            function13 = i8 == 0 ? null : function12;
                            iM13607getClipgIe3tQ8 = i9 == 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : i10;
                            z2 = i11 == 0 ? true : z;
                            i15 = i12 == 0 ? Integer.MAX_VALUE : i2;
                            i16 = i13 == 0 ? i3 : 1;
                            colorProducer2 = i14 == 0 ? null : colorProducer;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1186827822, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:90)");
                            }
                            HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
                            selectionRegistrar = (SelectionRegistrar) composerStartRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                            composerStartRestartGroup.startReplaceableGroup(959238528);
                            if (selectionRegistrar != null) {
                                long selectionBackgroundColor = ((SelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor();
                                long jLongValue = ((Number) RememberSaveableKt.m10957rememberSaveable(new Object[]{selectionRegistrar}, (Saver) selectionIdSaver(selectionRegistrar), (String) null, (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Long invoke() {
                                        return Long.valueOf(selectionRegistrar.nextSelectableId());
                                    }
                                }, composerStartRestartGroup, 72, 4)).longValue();
                                Long lValueOf = Long.valueOf(jLongValue);
                                Color colorM11330boximpl = Color.m11330boximpl(selectionBackgroundColor);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                boolean zChanged = composerStartRestartGroup.changed(lValueOf) | composerStartRestartGroup.changed(selectionRegistrar) | composerStartRestartGroup.changed(colorM11330boximpl);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new SelectionController(jLongValue, selectionRegistrar, selectionBackgroundColor, null, 8, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                selectionController = (SelectionController) objRememberedValue;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (selectionController == null || function13 != null) {
                                i17 = i15;
                                composerStartRestartGroup.startReplaceableGroup(959239198);
                                modifierM8403textModifierRWo7tUw = m8403textModifierRWo7tUw(GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(modifier2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null), new AnnotatedString(str, null, null, 6, null), textStyle3, function13, iM13607getClipgIe3tQ8, z2, i17, i16, (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, selectionController, colorProducer2);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(959239868);
                                i17 = i15;
                                modifierM8403textModifierRWo7tUw = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(modifier2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null).then(new TextStringSimpleElement(str, textStyle3, (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver()), iM13607getClipgIe3tQ8, z2, i17, i16, colorProducer2, null));
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                            EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(544976794);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM8403textModifierRWo7tUw);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            final Function0<ComposeUiNode> constructor = companion.getConstructor();
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-VhcvRP8$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final ComposeUiNode invoke() {
                                        return constructor.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl, emptyMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Updater.m10877setimpl(composerM10870constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            textStyle4 = textStyle3;
                            function14 = function13;
                            i18 = iM13607getClipgIe3tQ8;
                            i19 = i16;
                            z3 = z2;
                            i20 = i17;
                            colorProducer3 = colorProducer2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z;
                            i20 = i2;
                            colorProducer3 = colorProducer;
                            textStyle4 = textStyle2;
                            function14 = function12;
                            i18 = i10;
                            i19 = i3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
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

                                public final void invoke(@Nullable Composer composer2, int i22) {
                                    BasicTextKt.m8402BasicTextVhcvRP8(str, modifier3, textStyle4, function14, i18, z3, i20, i19, colorProducer3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i6 |= CpioConstants.C_ISBLK;
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    if (i14 != 256) {
                        if (i21 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        selectionController = null;
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
                        selectionRegistrar = (SelectionRegistrar) composerStartRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                        composerStartRestartGroup.startReplaceableGroup(959238528);
                        if (selectionRegistrar != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (selectionController == null) {
                            i17 = i15;
                            composerStartRestartGroup.startReplaceableGroup(959239198);
                            modifierM8403textModifierRWo7tUw = m8403textModifierRWo7tUw(GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(modifier2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null), new AnnotatedString(str, null, null, 6, null), textStyle3, function13, iM13607getClipgIe3tQ8, z2, i17, i16, (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, selectionController, colorProducer2);
                            composerStartRestartGroup.endReplaceableGroup();
                            EmptyMeasurePolicy emptyMeasurePolicy2 = EmptyMeasurePolicy.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(544976794);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM8403textModifierRWo7tUw);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            final Function0 constructor2 = companion2.getConstructor();
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl, emptyMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Updater.m10877setimpl(composerM10870constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl.getInserting()) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier2;
                                textStyle4 = textStyle3;
                                function14 = function13;
                                i18 = iM13607getClipgIe3tQ8;
                                i19 = i16;
                                z3 = z2;
                                i20 = i17;
                                colorProducer3 = colorProducer2;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 != 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                if (i14 != 256) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            if (i14 != 256) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        if (i14 != 256) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:381:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BasicText-RWo7tUw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8400BasicTextRWo7tUw(@NotNull final AnnotatedString annotatedString, @Nullable Modifier modifier, @Nullable TextStyle textStyle, @Nullable Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, @Nullable Map<String, InlineTextContent> map, @Nullable ColorProducer colorProducer, @Nullable Composer composer, final int i4, final int i5) {
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
        final SelectionRegistrar selectionRegistrar;
        SelectionController selectionController;
        int i16;
        int i17;
        Composer composer2;
        Map<String, InlineTextContent> map2;
        final ColorProducer colorProducer2;
        final Map<String, InlineTextContent> map3;
        final Modifier modifier2;
        final TextStyle textStyle2;
        final Function1<? super TextLayoutResult, Unit> function12;
        final int i18;
        final boolean z2;
        final int i19;
        final int i20;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1064305212);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i21 = i5 & 2;
        if (i21 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 112) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 896) == 0) {
                    i6 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 7168) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 != 0) {
                        if ((57344 & i4) == 0) {
                            i10 = i;
                            i6 |= composerStartRestartGroup.changed(i10) ? 16384 : 8192;
                        }
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else if ((i4 & 458752) == 0) {
                            i6 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        i15 = i5 & 512;
                        if (i15 != 0) {
                            i6 |= 268435456;
                        }
                        if ((i5 & 768) != 768 || (1533916891 & i6) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i21 == 0 ? Modifier.INSTANCE : modifier;
                            TextStyle textStyle3 = i7 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                            Function1<? super TextLayoutResult, Unit> function13 = i8 == 0 ? null : function1;
                            int iM13607getClipgIe3tQ8 = i9 == 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : i10;
                            boolean z3 = i11 == 0 ? true : z;
                            int i22 = i12 == 0 ? Integer.MAX_VALUE : i2;
                            int i23 = i13 == 0 ? 1 : i3;
                            Map<String, InlineTextContent> mapEmptyMap = i14 == 0 ? MapsKt__MapsKt.emptyMap() : map;
                            ColorProducer colorProducer3 = i15 == 0 ? null : colorProducer;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1064305212, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:184)");
                            }
                            HeightInLinesModifierKt.validateMinMaxLines(i23, i22);
                            selectionRegistrar = (SelectionRegistrar) composerStartRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                            composerStartRestartGroup.startReplaceableGroup(959242739);
                            if (selectionRegistrar == null) {
                                long selectionBackgroundColor = ((SelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor();
                                long jLongValue = ((Number) RememberSaveableKt.m10957rememberSaveable(new Object[]{selectionRegistrar}, (Saver) selectionIdSaver(selectionRegistrar), (String) null, (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$2
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Long invoke() {
                                        return Long.valueOf(selectionRegistrar.nextSelectableId());
                                    }
                                }, composerStartRestartGroup, 72, 4)).longValue();
                                Long lValueOf = Long.valueOf(jLongValue);
                                Color colorM11330boximpl = Color.m11330boximpl(selectionBackgroundColor);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                boolean zChanged = composerStartRestartGroup.changed(lValueOf) | composerStartRestartGroup.changed(selectionRegistrar) | composerStartRestartGroup.changed(colorM11330boximpl);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new SelectionController(jLongValue, selectionRegistrar, selectionBackgroundColor, null, 8, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                selectionController = (SelectionController) objRememberedValue;
                            } else {
                                selectionController = null;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString)) {
                                composerStartRestartGroup.startReplaceableGroup(959243362);
                                Map<String, InlineTextContent> map4 = mapEmptyMap;
                                i16 = i23;
                                i17 = i22;
                                composer2 = composerStartRestartGroup;
                                Modifier modifierM8403textModifierRWo7tUw = m8403textModifierRWo7tUw(GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null), annotatedString, textStyle3, function13, iM13607getClipgIe3tQ8, z3, i22, i23, (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, selectionController, colorProducer3);
                                EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                                composer2.startReplaceableGroup(544976794);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM8403textModifierRWo7tUw);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                final Function0<ComposeUiNode> constructor = companion.getConstructor();
                                composer2.startReplaceableGroup(1405779621);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(new Function0<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-RWo7tUw$$inlined$Layout$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final ComposeUiNode invoke() {
                                            return constructor.invoke();
                                        }
                                    });
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl, emptyMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Updater.m10877setimpl(composerM10870constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                map2 = map4;
                            } else {
                                Map<String, InlineTextContent> map5 = mapEmptyMap;
                                i16 = i23;
                                i17 = i22;
                                composer2 = composerStartRestartGroup;
                                composer2.startReplaceableGroup(959244221);
                                Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> pairResolveInlineContent = AnnotatedStringResolveInlineContentKt.resolveInlineContent(annotatedString, map5);
                                List<AnnotatedString.Range<Placeholder>> listComponent1 = pairResolveInlineContent.component1();
                                List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> listComponent2 = pairResolveInlineContent.component2();
                                composer2.startReplaceableGroup(-492369756);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                Composer.Companion companion2 = Composer.INSTANCE;
                                if (objRememberedValue2 == companion2.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                final MutableState mutableState = (MutableState) objRememberedValue2;
                                Modifier modifierM11501graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                FontFamily.Resolver resolver = (FontFamily.Resolver) composer2.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                composer2.startReplaceableGroup(-1870483601);
                                boolean zChanged2 = composer2.changed(mutableState);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == companion2.getEmpty()) {
                                    objRememberedValue3 = new Function1<List<? extends Rect>, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Rect> list) {
                                            invoke2((List<Rect>) list);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull List<Rect> list) {
                                            mutableState.setValue(list);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                int i24 = i6;
                                map2 = map5;
                                Modifier modifierM8403textModifierRWo7tUw2 = m8403textModifierRWo7tUw(modifierM11501graphicsLayerAp8cVGQ$default, annotatedString, textStyle3, function13, iM13607getClipgIe3tQ8, z3, i17, i16, resolver, listComponent1, (Function1) objRememberedValue3, selectionController, colorProducer3);
                                composer2.startReplaceableGroup(-1870483406);
                                boolean zChanged3 = composer2.changed(mutableState);
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == companion2.getEmpty()) {
                                    objRememberedValue4 = new Function0<List<? extends Rect>>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @Nullable
                                        public final List<? extends Rect> invoke() {
                                            return mutableState.getValue();
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                TextMeasurePolicy textMeasurePolicy = new TextMeasurePolicy((Function0) objRememberedValue4);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8403textModifierRWo7tUw2);
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
                                Updater.m10877setimpl(composerM10870constructorimpl2, textMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                AnnotatedStringResolveInlineContentKt.InlineChildren(annotatedString, listComponent2, composer2, (i24 & 14) | 64);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            colorProducer2 = colorProducer3;
                            map3 = map2;
                            modifier2 = modifier3;
                            textStyle2 = textStyle3;
                            function12 = function13;
                            i18 = iM13607getClipgIe3tQ8;
                            z2 = z3;
                            i19 = i16;
                            i20 = i17;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            textStyle2 = textStyle;
                            function12 = function1;
                            z2 = z;
                            i20 = i2;
                            i19 = i3;
                            map3 = map;
                            i18 = i10;
                            composer2 = composerStartRestartGroup;
                            colorProducer2 = colorProducer;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

                                public final void invoke(@Nullable Composer composer3, int i25) {
                                    BasicTextKt.m8400BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function12, i18, z2, i20, i19, map3, colorProducer2, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i6 |= CpioConstants.C_ISBLK;
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    i15 = i5 & 512;
                    if (i15 != 0) {
                    }
                    if ((i5 & 768) != 768) {
                        if (i21 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
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
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        HeightInLinesModifierKt.validateMinMaxLines(i23, i22);
                        selectionRegistrar = (SelectionRegistrar) composerStartRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                        composerStartRestartGroup.startReplaceableGroup(959242739);
                        if (selectionRegistrar == null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString)) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        colorProducer2 = colorProducer3;
                        map3 = map2;
                        modifier2 = modifier3;
                        textStyle2 = textStyle3;
                        function12 = function13;
                        i18 = iM13607getClipgIe3tQ8;
                        z2 = z3;
                        i19 = i16;
                        i20 = i17;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                i15 = i5 & 512;
                if (i15 != 0) {
                }
                if ((i5 & 768) != 768) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            i15 = i5 & 512;
            if (i15 != 0) {
            }
            if ((i5 & 768) != 768) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        i15 = i5 & 512;
        if (i15 != 0) {
        }
        if ((i5 & 768) != 768) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: BasicText-BpD7jsM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m8399BasicTextBpD7jsM(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        Function1 function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        final TextStyle textStyle3;
        final int i13;
        final boolean z3;
        final int i14;
        final Function1 function13;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1022429478);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 112) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i3 & 896) == 0) {
                    textStyle2 = textStyle;
                    i5 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i3 & 7168) == 0) {
                        function12 = function1;
                        i5 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 != 0) {
                        if ((i3 & 57344) == 0) {
                            i9 = i;
                            i5 |= composerStartRestartGroup.changed(i9) ? 16384 : 8192;
                        }
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i3 & 458752) == 0) {
                                i5 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                            i12 = i2;
                        } else {
                            i12 = i2;
                            if ((i3 & 3670016) == 0) {
                                i5 |= composerStartRestartGroup.changed(i12) ? 1048576 : 524288;
                            }
                        }
                        if ((i5 & 2995931) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i15 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            }
                            Function1 function14 = i7 == 0 ? null : function12;
                            int iM13607getClipgIe3tQ8 = i8 == 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : i9;
                            boolean z4 = i10 == 0 ? true : z2;
                            int i16 = i11 == 0 ? Integer.MAX_VALUE : i12;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1022429478, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:270)");
                            }
                            m8402BasicTextVhcvRP8(str, modifier4, textStyle2, (Function1<? super TextLayoutResult, Unit>) function14, iM13607getClipgIe3tQ8, z4, i16, 1, (ColorProducer) null, composerStartRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle2;
                            i13 = i16;
                            z3 = z4;
                            i14 = iM13607getClipgIe3tQ8;
                            function13 = function14;
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            textStyle3 = textStyle2;
                            function13 = function12;
                            i13 = i12;
                            i14 = i9;
                            z3 = z2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
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

                                public final void invoke(@Nullable Composer composer2, int i17) {
                                    BasicTextKt.m8399BasicTextBpD7jsM(str, modifier3, textStyle3, function13, i14, z3, i13, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= CpioConstants.C_ISBLK;
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i5 & 2995931) != 599186) {
                        if (i15 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        m8402BasicTextVhcvRP8(str, modifier4, textStyle2, (Function1<? super TextLayoutResult, Unit>) function14, iM13607getClipgIe3tQ8, z4, i16, 1, (ColorProducer) null, composerStartRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        textStyle3 = textStyle2;
                        i13 = i16;
                        z3 = z4;
                        i14 = iM13607getClipgIe3tQ8;
                        function13 = function14;
                        modifier3 = modifier4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 != 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i5 & 2995931) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i5 & 2995931) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i5 & 2995931) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: BasicText-4YKlhWE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m8397BasicText4YKlhWE(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Map map, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        Function1 function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        final TextStyle textStyle3;
        final Map map2;
        final int i13;
        final boolean z3;
        final Function1 function13;
        final int i14;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-648605928);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 112) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i3 & 896) == 0) {
                    textStyle2 = textStyle;
                    i5 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i3 & 7168) == 0) {
                        function12 = function1;
                        i5 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 != 0) {
                        if ((i3 & 57344) == 0) {
                            i9 = i;
                            i5 |= composerStartRestartGroup.changed(i9) ? 16384 : 8192;
                        }
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i3 & 458752) == 0) {
                                i5 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 3670016) == 0) {
                            i5 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i12 = i4 & 128;
                        if (i12 != 0) {
                            i5 |= 4194304;
                        }
                        if (i12 != 128 || (23967451 & i5) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            }
                            Function1 function14 = i7 == 0 ? null : function12;
                            int iM13607getClipgIe3tQ8 = i8 == 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : i9;
                            boolean z4 = i10 == 0 ? true : z2;
                            int i16 = i11 == 0 ? Integer.MAX_VALUE : i2;
                            Map mapEmptyMap = i12 == 0 ? MapsKt__MapsKt.emptyMap() : map;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-648605928, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:294)");
                            }
                            m8400BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function14, iM13607getClipgIe3tQ8, z4, i16, 1, mapEmptyMap, null, composerStartRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle2;
                            map2 = mapEmptyMap;
                            i13 = i16;
                            z3 = z4;
                            function13 = function14;
                            Modifier modifier4 = modifier2;
                            i14 = iM13607getClipgIe3tQ8;
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i13 = i2;
                            modifier3 = modifier2;
                            textStyle3 = textStyle2;
                            function13 = function12;
                            z3 = z2;
                            i14 = i9;
                            map2 = map;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
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

                                public final void invoke(@Nullable Composer composer2, int i17) {
                                    BasicTextKt.m8397BasicText4YKlhWE(annotatedString, modifier3, textStyle3, function13, i14, z3, i13, map2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= CpioConstants.C_ISBLK;
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 128;
                    if (i12 != 0) {
                    }
                    if (i12 != 128) {
                        if (i15 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        m8400BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function14, iM13607getClipgIe3tQ8, z4, i16, 1, mapEmptyMap, null, composerStartRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        textStyle3 = textStyle2;
                        map2 = mapEmptyMap;
                        i13 = i16;
                        z3 = z4;
                        function13 = function14;
                        Modifier modifier42 = modifier2;
                        i14 = iM13607getClipgIe3tQ8;
                        modifier3 = modifier42;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 != 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                }
                if (i12 != 128) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            i12 = i4 & 128;
            if (i12 != 0) {
            }
            if (i12 != 128) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        i12 = i4 & 128;
        if (i12 != 0) {
        }
        if (i12 != 128) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    @Composable
    /* renamed from: BasicText-4YKlhWE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m8398BasicText4YKlhWE(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1 function12;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        final Modifier modifier2;
        final Function1 function13;
        final int iM13607getClipgIe3tQ8;
        final TextStyle textStyle3;
        final int i14;
        final int i15;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1542716361);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i16 = i5 & 2;
        if (i16 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 112) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 896) == 0) {
                    textStyle2 = textStyle;
                    i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 7168) == 0) {
                        function12 = function1;
                        i6 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((57344 & i4) == 0) {
                            i10 = i;
                            i6 |= composerStartRestartGroup.changed(i10) ? 16384 : 8192;
                        }
                        i11 = i5 & 32;
                        if (i11 == 0) {
                            if ((458752 & i4) == 0) {
                                z2 = z;
                                i6 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                            i12 = i5 & 64;
                            if (i12 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 3670016) == 0) {
                                i6 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i13 = i5 & 128;
                            if (i13 == 0) {
                                i6 |= 12582912;
                            } else if ((i4 & 29360128) == 0) {
                                i6 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                            }
                            if ((i6 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                modifier2 = i16 == 0 ? Modifier.INSTANCE : modifier;
                                if (i7 != 0) {
                                    textStyle2 = TextStyle.INSTANCE.getDefault();
                                }
                                function13 = i8 == 0 ? null : function12;
                                iM13607getClipgIe3tQ8 = i9 == 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : i10;
                                boolean z4 = i11 == 0 ? true : z2;
                                int i17 = i12 == 0 ? Integer.MAX_VALUE : i2;
                                int i18 = i13 == 0 ? i3 : 1;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1542716361, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:319)");
                                }
                                m8402BasicTextVhcvRP8(str, modifier2, textStyle2, (Function1<? super TextLayoutResult, Unit>) function13, iM13607getClipgIe3tQ8, z4, i17, i18, (ColorProducer) null, composerStartRestartGroup, i6 & 33554430, 256);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                textStyle3 = textStyle2;
                                i14 = i17;
                                boolean z5 = z4;
                                i15 = i18;
                                z3 = z5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                i15 = i3;
                                textStyle3 = textStyle2;
                                function13 = function12;
                                iM13607getClipgIe3tQ8 = i10;
                                z3 = z2;
                                i14 = i2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
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

                                    public final void invoke(@Nullable Composer composer2, int i19) {
                                        BasicTextKt.m8398BasicText4YKlhWE(str, modifier2, textStyle3, function13, iM13607getClipgIe3tQ8, z3, i14, i15, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        z2 = z;
                        i12 = i5 & 64;
                        if (i12 == 0) {
                        }
                        i13 = i5 & 128;
                        if (i13 == 0) {
                        }
                        if ((i6 & 23967451) == 4793490) {
                            if (i16 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            m8402BasicTextVhcvRP8(str, modifier2, textStyle2, (Function1<? super TextLayoutResult, Unit>) function13, iM13607getClipgIe3tQ8, z4, i17, i18, (ColorProducer) null, composerStartRestartGroup, i6 & 33554430, 256);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            textStyle3 = textStyle2;
                            i14 = i17;
                            boolean z52 = z4;
                            i15 = i18;
                            z3 = z52;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 == 0) {
                    }
                    z2 = z;
                    i12 = i5 & 64;
                    if (i12 == 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 == 0) {
                    }
                    if ((i6 & 23967451) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 == 0) {
                }
                z2 = z;
                i12 = i5 & 64;
                if (i12 == 0) {
                }
                i13 = i5 & 128;
                if (i13 == 0) {
                }
                if ((i6 & 23967451) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 == 0) {
            }
            z2 = z;
            i12 = i5 & 64;
            if (i12 == 0) {
            }
            i13 = i5 & 128;
            if (i13 == 0) {
            }
            if ((i6 & 23967451) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 == 0) {
        }
        z2 = z;
        i12 = i5 & 64;
        if (i12 == 0) {
        }
        i13 = i5 & 128;
        if (i13 == 0) {
        }
        if ((i6 & 23967451) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    @Composable
    /* renamed from: BasicText-VhcvRP8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m8401BasicTextVhcvRP8(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Map map, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1 function12;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        final Modifier modifier2;
        final int i15;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i16;
        final boolean z3;
        final int i17;
        final Map map2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(851408699);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i18 = i5 & 2;
        if (i18 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 112) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 896) == 0) {
                    textStyle2 = textStyle;
                    i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 7168) == 0) {
                        function12 = function1;
                        i6 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 != 0) {
                        if ((i4 & 57344) == 0) {
                            i10 = i;
                            i6 |= composerStartRestartGroup.changed(i10) ? 16384 : 8192;
                        }
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i4 & 458752) == 0) {
                                i6 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if (i14 != 256 || (191739611 & i6) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            modifier2 = i18 == 0 ? Modifier.INSTANCE : modifier;
                            TextStyle textStyle4 = i7 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                            Function1 function14 = i8 == 0 ? null : function12;
                            int iM13607getClipgIe3tQ8 = i9 == 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : i10;
                            boolean z4 = i11 == 0 ? true : z2;
                            int i19 = i12 == 0 ? Integer.MAX_VALUE : i2;
                            i15 = i13 == 0 ? i3 : 1;
                            Map mapEmptyMap = i14 == 0 ? MapsKt__MapsKt.emptyMap() : map;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(851408699, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:333)");
                            }
                            m8400BasicTextRWo7tUw(annotatedString, modifier2, textStyle4, function14, iM13607getClipgIe3tQ8, z4, i19, i15, mapEmptyMap, null, composerStartRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle4;
                            function13 = function14;
                            i16 = iM13607getClipgIe3tQ8;
                            z3 = z4;
                            i17 = i19;
                            map2 = mapEmptyMap;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            i17 = i2;
                            map2 = map;
                            textStyle3 = textStyle2;
                            function13 = function12;
                            z3 = z2;
                            i16 = i10;
                            i15 = i3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
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

                                public final void invoke(@Nullable Composer composer2, int i20) {
                                    BasicTextKt.m8401BasicTextVhcvRP8(annotatedString, modifier2, textStyle3, function13, i16, z3, i17, i15, map2, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i6 |= CpioConstants.C_ISBLK;
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    if (i14 != 256) {
                        if (i18 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        m8400BasicTextRWo7tUw(annotatedString, modifier2, textStyle4, function14, iM13607getClipgIe3tQ8, z4, i19, i15, mapEmptyMap, null, composerStartRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        textStyle3 = textStyle4;
                        function13 = function14;
                        i16 = iM13607getClipgIe3tQ8;
                        z3 = z4;
                        i17 = i19;
                        map2 = mapEmptyMap;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 != 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                if (i14 != 256) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            if (i14 != 256) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        if (i14 != 256) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;J)Ljava/lang/Long;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1 */
    /* loaded from: classes.dex */
    public static final class C07951 extends Lambda implements Function2<SaverScope, Long, Long> {
        public C07951() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l) {
            return invoke(saverScope, l.longValue());
        }

        @Nullable
        public final Long invoke(@NotNull SaverScope saverScope, long j) {
            if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                return Long.valueOf(j);
            }
            return null;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "", "it", "invoke", "(J)Ljava/lang/Long;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2 */
    /* loaded from: classes.dex */
    public static final class C07962 extends Lambda implements Function1<Long, Long> {
        public static final C07962 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Long invoke(Long l) {
            return invoke(l.longValue());
        }

        @Nullable
        public final Long invoke(long j) {
            return Long.valueOf(j);
        }
    }

    private static final Saver<Long, Long> selectionIdSaver(SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new Function2<SaverScope, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.1
            public C07951() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l) {
                return invoke(saverScope, l.longValue());
            }

            @Nullable
            public final Long invoke(@NotNull SaverScope saverScope, long j) {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    return Long.valueOf(j);
                }
                return null;
            }
        }, C07962.INSTANCE);
    }

    /* renamed from: textModifier-RWo7tUw */
    private static final Modifier m8403textModifierRWo7tUw(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer) {
        if (selectionController == null) {
            return modifier.then(Modifier.INSTANCE).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, null, colorProducer, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer, null));
    }
}
