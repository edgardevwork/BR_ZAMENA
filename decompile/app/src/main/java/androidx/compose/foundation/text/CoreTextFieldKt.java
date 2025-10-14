package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.focus.FocusState;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.hapticfeedback.HapticFeedback;
import androidx.compose.p003ui.input.key.KeyEvent;
import androidx.compose.p003ui.input.key.KeyInputModifierKt;
import androidx.compose.p003ui.input.pointer.PointerIconKt;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.AlignmentLineKt;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.ClipboardManager;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.SoftwareKeyboardController;
import androidx.compose.p003ui.platform.TextToolbar;
import androidx.compose.p003ui.platform.WindowInfo;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.input.CommitTextCommand;
import androidx.compose.p003ui.text.input.DeleteAllCommand;
import androidx.compose.p003ui.text.input.EditCommand;
import androidx.compose.p003ui.text.input.FinishComposingTextCommand;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.ImeOptions;
import androidx.compose.p003ui.text.input.OffsetMapping;
import androidx.compose.p003ui.text.input.PasswordVisualTransformation;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.text.input.TextInputService;
import androidx.compose.p003ui.text.input.TextInputSession;
import androidx.compose.p003ui.text.input.TransformedText;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.text.style.ResolvedTextDirection;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoreTextField.kt */
@Metadata(m7104d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aî\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u000123\b\u0002\u0010\u001e\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0002\b ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b H\u0001¢\u0006\u0002\u0010$\u001a0\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010&\u001a\u00020'2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0002\b H\u0003¢\u0006\u0002\u0010)\u001a\u001d\u0010*\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\u0006\u0010+\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010,\u001a\u0015\u0010-\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\u0010.\u001a\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u000201H\u0002\u001a\u0010\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u000204H\u0000\u001a \u00105\u001a\u00020\u00032\u0006\u00100\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00106\u001a\u000207H\u0002\u001a0\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020:2\u0006\u00100\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00106\u001a\u000207H\u0002\u001a \u0010;\u001a\u00020\u00032\u0006\u00100\u001a\u0002012\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0001H\u0002\u001a2\u0010?\u001a\u00020\u0003*\u00020@2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u000f2\u0006\u00106\u001a\u000207H\u0080@¢\u0006\u0002\u0010D\u001a\u001c\u0010E\u001a\u00020\t*\u00020\t2\u0006\u00100\u001a\u0002012\u0006\u0010&\u001a\u00020'H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006F²\u0006\n\u0010G\u001a\u00020\u0001X\u008a\u0084\u0002"}, m7105d2 = {"USE_WINDOW_FOCUS_ENABLED", "", "CoreTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "maxLines", "", "minLines", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "CoreTextFieldRootBox", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionToolbarAndHandles", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "endInputSession", "state", "Landroidx/compose/foundation/text/TextFieldState;", "isWindowFocusedBehindFlag", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "notifyFocusedRect", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "startInputSession", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "bringSelectionEndIntoView", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "textLayoutResult", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewKeyEventToDeselectOnBack", "foundation_release", "writeable"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1195:1\n25#2:1196\n50#2:1216\n49#2:1217\n36#2:1224\n25#2:1231\n25#2:1238\n25#2:1252\n25#2:1263\n456#2,8:1287\n464#2,3:1301\n467#2,3:1307\n36#2:1313\n1116#3,6:1197\n1116#3,6:1210\n1116#3,6:1218\n1116#3,6:1225\n1116#3,6:1232\n1116#3,6:1239\n1116#3,3:1253\n1119#3,3:1259\n1116#3,6:1264\n1116#3,6:1314\n1116#3,6:1321\n74#4:1203\n74#4:1204\n74#4:1205\n74#4:1206\n74#4:1207\n74#4:1208\n74#4:1209\n74#4:1245\n74#4:1246\n74#4:1247\n74#4:1320\n487#5,4:1248\n491#5,2:1256\n495#5:1262\n487#6:1258\n68#7,6:1270\n74#7:1304\n78#7:1311\n79#8,11:1276\n92#8:1310\n3737#9,6:1295\n30#10,2:1305\n1#11:1312\n495#12,4:1327\n500#12:1336\n129#13,5:1331\n81#14:1337\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n215#1:1196\n236#1:1216\n236#1:1217\n249#1:1224\n278#1:1231\n281#1:1238\n293#1:1252\n294#1:1263\n748#1:1287,8\n748#1:1301,3\n748#1:1307,3\n1128#1:1313\n215#1:1197,6\n233#1:1210,6\n236#1:1218,6\n249#1:1225,6\n278#1:1232,6\n281#1:1239,6\n293#1:1253,3\n293#1:1259,3\n294#1:1264,6\n1128#1:1314,6\n1145#1:1321,6\n219#1:1203\n220#1:1204\n221#1:1205\n222#1:1206\n223#1:1207\n224#1:1208\n225#1:1209\n287#1:1245\n288#1:1246\n289#1:1247\n1129#1:1320\n293#1:1248,4\n293#1:1256,2\n293#1:1262\n293#1:1258\n748#1:1270,6\n748#1:1304\n748#1:1311\n748#1:1276,11\n748#1:1310\n748#1:1295,6\n749#1:1305,2\n1175#1:1327,4\n1175#1:1336\n1175#1:1331,5\n345#1:1337\n*E\n"})
/* loaded from: classes2.dex */
public final class CoreTextFieldKt {
    public static final boolean USE_WINDOW_FOCUS_ENABLED = false;

    public static final boolean isWindowFocusedBehindFlag(@NotNull WindowInfo windowInfo) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /* JADX WARN: Type inference failed for: r0v32, types: [androidx.compose.ui.Modifier] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoreTextField(@NotNull final TextFieldValue textFieldValue, @NotNull final Function1<? super TextFieldValue, Unit> function1, @Nullable Modifier modifier, @Nullable TextStyle textStyle, @Nullable VisualTransformation visualTransformation, @Nullable Function1<? super TextLayoutResult, Unit> function12, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Brush brush, boolean z, int i, int i2, @Nullable ImeOptions imeOptions, @Nullable KeyboardActions keyboardActions, boolean z2, boolean z3, @Nullable Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i3, final int i4, final int i5) {
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
        Brush solidColor;
        ImeOptions imeOptions2;
        boolean z4;
        Modifier modifier3;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M8414getLambda1$foundation_release;
        boolean z5;
        int i20;
        KeyboardActions keyboardActions2;
        Brush brush2;
        boolean z6;
        VisualTransformation visualTransformation2;
        Function1<? super TextLayoutResult, Unit> function13;
        int i21;
        final ImeOptions imeOptions3;
        TextStyle textStyle2;
        MutableInteractionSource mutableInteractionSource2;
        Object objRememberedValue;
        Composer.Companion companion;
        final Orientation orientation;
        boolean zChanged;
        Object objRememberedValue2;
        TextFieldScrollerPosition textFieldScrollerPosition;
        boolean zChanged2;
        TextRange composition;
        TextFieldScrollerPosition textFieldScrollerPosition2;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        FocusManager focusManager;
        Composer composer2;
        final TextStyle textStyle3;
        final Function1<? super TextLayoutResult, Unit> function14;
        final VisualTransformation visualTransformation3;
        final Brush brush3;
        final boolean z7;
        final int i22;
        final KeyboardActions keyboardActions3;
        final boolean z8;
        final Modifier modifier5;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        final boolean z9;
        final MutableInteractionSource mutableInteractionSource4;
        final ImeOptions imeOptions4;
        final int i23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-958708118);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i24 = i5 & 4;
        if (i24 != 0) {
            i6 |= 384;
        } else {
            if ((i3 & 896) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else {
                if ((i3 & 7168) == 0) {
                    i6 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
                }
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= CpioConstants.C_ISBLK;
                } else if ((i3 & 57344) == 0) {
                    i6 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i3 & 458752) == 0) {
                    i6 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= composerStartRestartGroup.changed(brush) ? 8388608 : 4194304;
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= composerStartRestartGroup.changed(z) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i13 = i5 & 512;
                if (i13 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    i6 |= composerStartRestartGroup.changed(i) ? 536870912 : 268435456;
                }
                i14 = i5 & 1024;
                if (i14 != 0) {
                    i15 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i15 = i4 | (composerStartRestartGroup.changed(i2) ? 4 : 2);
                } else {
                    i15 = i4;
                }
                if ((i4 & 112) == 0) {
                    i15 |= ((i5 & 2048) == 0 && composerStartRestartGroup.changed(imeOptions)) ? 32 : 16;
                }
                int i25 = i15;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i25 |= 384;
                } else {
                    if ((i4 & 896) == 0) {
                        i25 |= composerStartRestartGroup.changed(keyboardActions) ? 256 : 128;
                    }
                    i17 = i5 & 8192;
                    if (i17 != 0) {
                        if ((i4 & 7168) == 0) {
                            i25 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                        }
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i25 |= CpioConstants.C_ISBLK;
                        } else if ((i4 & 57344) == 0) {
                            i25 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                        }
                        i19 = i5 & 32768;
                        if (i19 != 0) {
                            i25 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else if ((i4 & 458752) == 0) {
                            i25 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((i6 & 1533916891) != 306783378 || (374491 & i25) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier6 = i24 == 0 ? Modifier.INSTANCE : modifier;
                                TextStyle textStyle4 = i7 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                VisualTransformation none = i8 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                Function1<? super TextLayoutResult, Unit> function15 = i9 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                MutableInteractionSource mutableInteractionSource5 = i10 == 0 ? null : mutableInteractionSource;
                                if (i11 == 0) {
                                    modifier2 = modifier6;
                                    solidColor = new SolidColor(Color.INSTANCE.m11376getUnspecified0d7_KjU(), null);
                                } else {
                                    modifier2 = modifier6;
                                    solidColor = brush;
                                }
                                boolean z10 = i12 == 0 ? true : z;
                                int i26 = i13 == 0 ? Integer.MAX_VALUE : i;
                                int i27 = i14 == 0 ? 1 : i2;
                                if ((i5 & 2048) == 0) {
                                    imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                    i25 &= -113;
                                } else {
                                    imeOptions2 = imeOptions;
                                }
                                KeyboardActions keyboardActions4 = i16 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                z4 = i17 == 0 ? true : z2;
                                boolean z11 = i18 == 0 ? false : z3;
                                if (i19 == 0) {
                                    modifier3 = modifier2;
                                    z5 = z10;
                                    i20 = i27;
                                    keyboardActions2 = keyboardActions4;
                                    brush2 = solidColor;
                                    z6 = z11;
                                    function3M8414getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m8414getLambda1$foundation_release();
                                } else {
                                    modifier3 = modifier2;
                                    function3M8414getLambda1$foundation_release = function3;
                                    z5 = z10;
                                    i20 = i27;
                                    keyboardActions2 = keyboardActions4;
                                    brush2 = solidColor;
                                    z6 = z11;
                                }
                                visualTransformation2 = none;
                                function13 = function15;
                                i21 = i26;
                                imeOptions3 = imeOptions2;
                                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                textStyle2 = textStyle4;
                                mutableInteractionSource2 = mutableInteractionSource6;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 2048) != 0) {
                                    i25 &= -113;
                                }
                                modifier3 = modifier;
                                textStyle2 = textStyle;
                                visualTransformation2 = visualTransformation;
                                function13 = function12;
                                mutableInteractionSource2 = mutableInteractionSource;
                                brush2 = brush;
                                z5 = z;
                                i21 = i;
                                i20 = i2;
                                imeOptions3 = imeOptions;
                                keyboardActions2 = keyboardActions;
                                z4 = z2;
                                z6 = z3;
                                function3M8414getLambda1$foundation_release = function3;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-958708118, i6, i25, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:213)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new FocusRequester();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
                            final TextInputService textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            FontFamily.Resolver resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                            long selectionBackgroundColor = ((SelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor();
                            FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            final WindowInfo windowInfo = (WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo());
                            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                            Modifier modifier7 = modifier3;
                            orientation = (i21 == 1 || z5 || !imeOptions3.getSingleLine()) ? Orientation.Vertical : Orientation.Horizontal;
                            Object[] objArr = {orientation};
                            Saver<TextFieldScrollerPosition, Object> saver = TextFieldScrollerPosition.INSTANCE.getSaver();
                            final int i28 = i21;
                            composerStartRestartGroup.startReplaceableGroup(-272912543);
                            zChanged = composerStartRestartGroup.changed(orientation);
                            int i29 = i25;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final TextFieldScrollerPosition invoke() {
                                        return new TextFieldScrollerPosition(orientation, 0.0f, 2, null);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.m10957rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged2 = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(visualTransformation2);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                TransformedText transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getText());
                                composition = textFieldValue.getComposition();
                                textFieldScrollerPosition2 = textFieldScrollerPosition;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                if (composition == null) {
                                    TransformedText transformedTextM8470applyCompositionDecoration72CqOWE = TextFieldDelegate.INSTANCE.m8470applyCompositionDecoration72CqOWE(composition.getPackedValue(), transformedTextFilterWithValidation);
                                    objRememberedValue3 = transformedTextM8470applyCompositionDecoration72CqOWE == null ? transformedTextFilterWithValidation : transformedTextM8470applyCompositionDecoration72CqOWE;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                            } else {
                                textFieldScrollerPosition2 = textFieldScrollerPosition;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final TransformedText transformedText = (TransformedText) objRememberedValue3;
                            AnnotatedString text = transformedText.getText();
                            final OffsetMapping offsetMapping = transformedText.getOffsetMapping();
                            RecomposeScope currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            boolean zChanged3 = composerStartRestartGroup.changed(softwareKeyboardController);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z5, 0, density, resolver, null, 300, null), currentRecomposeScope, softwareKeyboardController);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final TextFieldState textFieldState = (TextFieldState) objRememberedValue4;
                            textFieldState.m8493updatefnh65Uc(textFieldValue.getText(), text, textStyle2, z5, density, resolver, function1, keyboardActions2, focusManager2, selectionBackgroundColor);
                            textFieldState.getProcessor().reset(textFieldValue, textFieldState.getInputSession());
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new UndoManager(0, 1, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            UndoManager undoManager = (UndoManager) objRememberedValue5;
                            UndoManager.snapshotIfNeeded$default(undoManager, textFieldValue, 0L, 2, null);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                            textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                            textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                            textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                            textFieldSelectionManager.setState$foundation_release(textFieldState);
                            textFieldSelectionManager.setValue$foundation_release(textFieldValue);
                            textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                            textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                            textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                            textFieldSelectionManager.setFocusRequester(focusRequester);
                            textFieldSelectionManager.setEditable(!z6);
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue7 = compositionScopedCoroutineScopeCanceller;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue8 == companion.getEmpty()) {
                                objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) objRememberedValue8;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            final boolean z12 = z4;
                            final boolean z13 = z6;
                            final ImeOptions imeOptions5 = imeOptions3;
                            MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                            Modifier modifierTextFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z4, focusRequester, mutableInteractionSource7, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    TextLayoutResultProxy layoutResult;
                                    if (textFieldState.getHasFocus() == focusState.isFocused()) {
                                        return;
                                    }
                                    textFieldState.setHasFocus(focusState.isFocused());
                                    if (textInputService != null) {
                                        if (!textFieldState.getHasFocus() || !z12 || z13) {
                                            CoreTextFieldKt.endInputSession(textFieldState);
                                        } else {
                                            CoreTextFieldKt.startInputSession(textInputService, textFieldState, textFieldValue, imeOptions5, offsetMapping);
                                        }
                                        if (focusState.isFocused() && (layoutResult = textFieldState.getLayoutResult()) != null) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester, textFieldValue, textFieldState, layoutResult, offsetMapping, null), 3, null);
                                        }
                                    }
                                    if (focusState.isFocused()) {
                                        return;
                                    }
                                    TextFieldSelectionManager.m8616deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(-55007276);
                            if (textInputService != null) {
                                focusManager = focusManager2;
                                modifier4 = modifierTextFieldFocusModifier;
                                EffectsKt.LaunchedEffect(Unit.INSTANCE, new C08012(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z4 && !z6), composerStartRestartGroup, 0), textInputService, textFieldSelectionManager, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                            } else {
                                modifier4 = modifierTextFieldFocusModifier;
                                focusManager = focusManager2;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final boolean z14 = z6;
                            Modifier modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(SelectionGesturesKt.updateSelectionTouchMode(companion2, new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z15) {
                                    textFieldState.setInTouchMode(z15);
                                }
                            }), mutableInteractionSource7, z4, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                    m8415invokek4lQ0M(offset.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                public final void m8415invokek4lQ0M(long j) {
                                    CoreTextFieldKt.tapToFocus(textFieldState, focusRequester, !z14);
                                    if (textFieldState.getHasFocus()) {
                                        if (textFieldState.getHandleState() != HandleState.Selection) {
                                            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                                            if (layoutResult != null) {
                                                TextFieldState textFieldState2 = textFieldState;
                                                TextFieldDelegate.INSTANCE.m8472setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState2.getProcessor(), offsetMapping, textFieldState2.getOnValueChange());
                                                if (textFieldState2.getTextDelegate().getText().length() > 0) {
                                                    textFieldState2.setHandleState(HandleState.Cursor);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        textFieldSelectionManager.m8620deselect_kEHs6E$foundation_release(Offset.m11088boximpl(j));
                                    }
                                }
                            }), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                            final Modifier modifierDrawBehind = DrawModifierKt.drawBehind(companion2, new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull DrawScope drawScope) {
                                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                                    if (layoutResult != null) {
                                        TextFieldValue textFieldValue2 = textFieldValue;
                                        OffsetMapping offsetMapping2 = offsetMapping;
                                        TextFieldState textFieldState2 = textFieldState;
                                        TextFieldDelegate.INSTANCE.draw$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, offsetMapping2, layoutResult.getValue(), textFieldState2.getSelectionPaint());
                                    }
                                }
                            });
                            final boolean z15 = z4;
                            final Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
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
                                    textFieldState.setLayoutCoordinates(layoutCoordinates);
                                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                                    if (layoutResult != null) {
                                        layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                    }
                                    if (z15) {
                                        if (textFieldState.getHandleState() == HandleState.Selection) {
                                            if (textFieldState.getShowFloatingToolbar() && CoreTextFieldKt.isWindowFocusedBehindFlag(windowInfo)) {
                                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                                            } else {
                                                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                                            }
                                            textFieldState.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                            textFieldState.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                                            textFieldState.setShowCursorHandle(TextRange.m13159getCollapsedimpl(textFieldValue.getSelection()));
                                        } else if (textFieldState.getHandleState() == HandleState.Cursor) {
                                            textFieldState.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                        }
                                        CoreTextFieldKt.notifyFocusedRect(textFieldState, textFieldValue, offsetMapping);
                                        TextLayoutResultProxy layoutResult2 = textFieldState.getLayoutResult();
                                        if (layoutResult2 != null) {
                                            TextFieldState textFieldState2 = textFieldState;
                                            TextFieldValue textFieldValue2 = textFieldValue;
                                            OffsetMapping offsetMapping2 = offsetMapping;
                                            TextInputSession inputSession = textFieldState2.getInputSession();
                                            if (inputSession == null || !textFieldState2.getHasFocus()) {
                                                return;
                                            }
                                            TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping2, layoutResult2);
                                        }
                                    }
                                }
                            });
                            final boolean z16 = visualTransformation2 instanceof PasswordVisualTransformation;
                            final boolean z17 = z4;
                            final ImeOptions imeOptions6 = imeOptions3;
                            final boolean z18 = z6;
                            Modifier modifierSemantics = SemanticsModifierKt.semantics(companion2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
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
                                public final void invoke2(@NotNull final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, transformedText.getText());
                                    SemanticsPropertiesKt.m13010setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                                    if (!z17) {
                                        SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                    }
                                    if (z16) {
                                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                    }
                                    final TextFieldState textFieldState2 = textFieldState;
                                    SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final Boolean invoke(@NotNull List<TextLayoutResult> list) {
                                            boolean z19;
                                            if (textFieldState2.getLayoutResult() != null) {
                                                TextLayoutResultProxy layoutResult = textFieldState2.getLayoutResult();
                                                Intrinsics.checkNotNull(layoutResult);
                                                list.add(layoutResult.getValue());
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            return Boolean.valueOf(z19);
                                        }
                                    }, 1, null);
                                    final boolean z19 = z18;
                                    final boolean z20 = z17;
                                    final TextFieldState textFieldState3 = textFieldState;
                                    SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final Boolean invoke(@NotNull AnnotatedString annotatedString) {
                                            Unit unit;
                                            if (z19 || !z20) {
                                                return Boolean.FALSE;
                                            }
                                            TextInputSession inputSession = textFieldState3.getInputSession();
                                            if (inputSession != null) {
                                                TextFieldState textFieldState4 = textFieldState3;
                                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt__CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), textFieldState4.getProcessor(), textFieldState4.getOnValueChange(), inputSession);
                                                unit = Unit.INSTANCE;
                                            } else {
                                                unit = null;
                                            }
                                            if (unit == null) {
                                                textFieldState3.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    final boolean z21 = z18;
                                    final boolean z22 = z17;
                                    final TextFieldState textFieldState4 = textFieldState;
                                    final TextFieldValue textFieldValue2 = textFieldValue;
                                    SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final Boolean invoke(@NotNull AnnotatedString annotatedString) {
                                            Unit unit;
                                            if (z21 || !z22) {
                                                return Boolean.FALSE;
                                            }
                                            TextInputSession inputSession = textFieldState4.getInputSession();
                                            if (inputSession != null) {
                                                TextFieldState textFieldState5 = textFieldState4;
                                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt__CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), textFieldState5.getProcessor(), textFieldState5.getOnValueChange(), inputSession);
                                                unit = Unit.INSTANCE;
                                            } else {
                                                unit = null;
                                            }
                                            if (unit == null) {
                                                TextFieldValue textFieldValue3 = textFieldValue2;
                                                textFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt__StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m13165getStartimpl(textFieldValue3.getSelection()), TextRange.m13160getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m13165getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    final OffsetMapping offsetMapping2 = offsetMapping;
                                    final boolean z23 = z17;
                                    final TextFieldValue textFieldValue3 = textFieldValue;
                                    final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                    final TextFieldState textFieldState5 = textFieldState;
                                    SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                        }

                                        @NotNull
                                        public final Boolean invoke(int i30, int i31, boolean z24) {
                                            if (!z24) {
                                                i30 = offsetMapping2.transformedToOriginal(i30);
                                            }
                                            if (!z24) {
                                                i31 = offsetMapping2.transformedToOriginal(i31);
                                            }
                                            boolean z25 = false;
                                            if (z23 && (i30 != TextRange.m13165getStartimpl(textFieldValue3.getSelection()) || i31 != TextRange.m13160getEndimpl(textFieldValue3.getSelection()))) {
                                                if (Math.min(i30, i31) >= 0 && Math.max(i30, i31) <= textFieldValue3.getText().length()) {
                                                    if (z24 || i30 == i31) {
                                                        textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                    } else {
                                                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager2, false, 1, null);
                                                    }
                                                    textFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getText(), TextRangeKt.TextRange(i30, i31), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                    z25 = true;
                                                } else {
                                                    textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                }
                                            }
                                            return Boolean.valueOf(z25);
                                        }
                                    }, 1, null);
                                    int imeAction = imeOptions6.getImeAction();
                                    final TextFieldState textFieldState6 = textFieldState;
                                    final ImeOptions imeOptions7 = imeOptions6;
                                    SemanticsPropertiesKt.m13006onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            textFieldState6.getOnImeActionPerformed().invoke(ImeAction.m13326boximpl(imeOptions7.getImeAction()));
                                            return Boolean.TRUE;
                                        }
                                    }, 2, null);
                                    final TextFieldState textFieldState7 = textFieldState;
                                    final FocusRequester focusRequester2 = focusRequester;
                                    final boolean z24 = z18;
                                    SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            CoreTextFieldKt.tapToFocus(textFieldState7, focusRequester2, !z24);
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                    SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager3, false, 1, null);
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    if (!TextRange.m13159getCollapsedimpl(textFieldValue.getSelection()) && !z16) {
                                        final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                TextFieldSelectionManager.copy$foundation_release$default(textFieldSelectionManager4, false, 1, null);
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                        if (z17 && !z18) {
                                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                                            SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.9
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                public final Boolean invoke() {
                                                    textFieldSelectionManager5.cut$foundation_release();
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                    if (!z17 || z18) {
                                        return;
                                    }
                                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                    SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.10
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            textFieldSelectionManager6.paste$foundation_release();
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            });
                            final Modifier modifierCursor = TextFieldCursorKt.cursor(companion2, textFieldState, textFieldValue, offsetMapping, brush2, z4 && !z6 && isWindowFocusedBehindFlag(windowInfo));
                            EffectsKt.DisposableEffect(textFieldSelectionManager, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.3
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                                    final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            textFieldSelectionManager2.hideSelectionToolbar$foundation_release();
                                        }
                                    };
                                }
                            }, composerStartRestartGroup, 8);
                            EffectsKt.DisposableEffect(imeOptions3, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                                    if (textInputService != null && textFieldState.getHasFocus()) {
                                        TextFieldState textFieldState2 = textFieldState;
                                        textFieldState2.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService, textFieldValue, textFieldState2.getProcessor(), imeOptions3, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
                                    }
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                        }
                                    };
                                }
                            }, composerStartRestartGroup, (i29 >> 3) & 14);
                            final TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                            Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier7.then(modifier4), textFieldState, focusManager), textFieldState, textFieldSelectionManager).then(TextFieldKeyInputKt.m8479textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, textFieldValue, textFieldState.getOnValueChange(), !z6, i28 == 1, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition3, mutableInteractionSource7, z4).then(modifierPointerHoverIcon$default).then(modifierSemantics), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
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
                                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                                    if (layoutResult == null) {
                                        return;
                                    }
                                    layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                                }
                            });
                            boolean z19 = z4 && textFieldState.getHasFocus() && textFieldState.isInTouchMode() && isWindowFocusedBehindFlag(windowInfo);
                            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33 = function3M8414getLambda1$foundation_release;
                            final TextStyle textStyle5 = textStyle2;
                            final int i30 = i20;
                            boolean z20 = z4;
                            ImeOptions imeOptions7 = imeOptions3;
                            final VisualTransformation visualTransformation4 = visualTransformation2;
                            final Modifier.Companion companionTextFieldMagnifier = z19 ? TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager) : companion2;
                            VisualTransformation visualTransformation5 = visualTransformation2;
                            final boolean z21 = z19;
                            final boolean z22 = z6;
                            final Function1<? super TextLayoutResult, Unit> function16 = function13;
                            Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5
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
                                public final void invoke(@Nullable Composer composer3, int i31) {
                                    if ((i31 & 11) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-374338080, i31, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
                                        }
                                        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function34 = function33;
                                        final TextFieldState textFieldState2 = textFieldState;
                                        final TextStyle textStyle6 = textStyle5;
                                        final int i32 = i30;
                                        final int i33 = i28;
                                        final TextFieldScrollerPosition textFieldScrollerPosition4 = textFieldScrollerPosition3;
                                        final TextFieldValue textFieldValue2 = textFieldValue;
                                        final VisualTransformation visualTransformation6 = visualTransformation4;
                                        final Modifier modifier8 = modifierCursor;
                                        final Modifier modifier9 = modifierDrawBehind;
                                        final Modifier modifier10 = modifierOnGloballyPositioned;
                                        final Modifier modifier11 = companionTextFieldMagnifier;
                                        final BringIntoViewRequester bringIntoViewRequester2 = bringIntoViewRequester;
                                        final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                        final boolean z23 = z21;
                                        final boolean z24 = z22;
                                        final Function1<TextLayoutResult, Unit> function17 = function16;
                                        final OffsetMapping offsetMapping2 = offsetMapping;
                                        final Density density2 = density;
                                        function34.invoke(ComposableLambdaKt.composableLambda(composer3, 2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1
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
                                            public final void invoke(@Nullable Composer composer4, int i34) {
                                                if ((i34 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2032502107, i34, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
                                                    }
                                                    Modifier modifierHeightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m8160heightInVpY3zN4$default(Modifier.INSTANCE, textFieldState2.m8491getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i32, i33);
                                                    TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                                    VisualTransformation visualTransformation7 = visualTransformation6;
                                                    final TextFieldState textFieldState3 = textFieldState2;
                                                    Modifier modifierBringIntoViewRequester = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(modifierHeightInLines, textFieldScrollerPosition5, textFieldValue3, visualTransformation7, new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        @Nullable
                                                        public final TextLayoutResultProxy invoke() {
                                                            return textFieldState3.getLayoutResult();
                                                        }
                                                    }).then(modifier8).then(modifier9), textStyle6).then(modifier10).then(modifier11), bringIntoViewRequester2);
                                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                                    final TextFieldState textFieldState4 = textFieldState2;
                                                    final boolean z25 = z23;
                                                    final boolean z26 = z24;
                                                    final Function1<TextLayoutResult, Unit> function18 = function17;
                                                    final TextFieldValue textFieldValue4 = textFieldValue2;
                                                    final OffsetMapping offsetMapping3 = offsetMapping2;
                                                    final Density density3 = density2;
                                                    final int i35 = i33;
                                                    SimpleLayoutKt.SimpleLayout(modifierBringIntoViewRequester, ComposableLambdaKt.composableLambda(composer4, -363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer5, int i36) {
                                                            if ((i36 & 11) != 2 || !composer5.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-363167407, i36, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                                                                }
                                                                final TextFieldState textFieldState5 = textFieldState4;
                                                                final Function1<TextLayoutResult, Unit> function19 = function18;
                                                                final TextFieldValue textFieldValue5 = textFieldValue4;
                                                                final OffsetMapping offsetMapping4 = offsetMapping3;
                                                                final Density density4 = density3;
                                                                final int i37 = i35;
                                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                    @Override // androidx.compose.p003ui.layout.MeasurePolicy
                                                                    @NotNull
                                                                    /* renamed from: measure-3p2s80s */
                                                                    public MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                                                        Snapshot.Companion companion3 = Snapshot.INSTANCE;
                                                                        TextFieldState textFieldState6 = textFieldState5;
                                                                        Snapshot snapshotCreateNonObservableSnapshot = companion3.createNonObservableSnapshot();
                                                                        try {
                                                                            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                                                                            try {
                                                                                TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                                TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                                snapshotCreateNonObservableSnapshot.dispose();
                                                                                Triple<Integer, Integer, TextLayoutResult> tripleM8471layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m8471layout_EkL_Y$foundation_release(textFieldState5.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                                int iIntValue = tripleM8471layout_EkL_Y$foundation_release.component1().intValue();
                                                                                int iIntValue2 = tripleM8471layout_EkL_Y$foundation_release.component2().intValue();
                                                                                TextLayoutResult textLayoutResultComponent3 = tripleM8471layout_EkL_Y$foundation_release.component3();
                                                                                if (!Intrinsics.areEqual(value, textLayoutResultComponent3)) {
                                                                                    textFieldState5.setLayoutResult(new TextLayoutResultProxy(textLayoutResultComponent3));
                                                                                    function19.invoke(textLayoutResultComponent3);
                                                                                    CoreTextFieldKt.notifyFocusedRect(textFieldState5, textFieldValue5, offsetMapping4);
                                                                                }
                                                                                textFieldState5.m8492setMinHeightForSingleLineField0680j_4(density4.mo7871toDpu2uoSUM(i37 == 1 ? TextDelegateKt.ceilToIntPx(textLayoutResultComponent3.getLineBottom(0)) : 0));
                                                                                return measureScope.layout(iIntValue, iIntValue2, MapsKt__MapsKt.mapOf(TuplesKt.m7112to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt__MathJVMKt.roundToInt(textLayoutResultComponent3.getFirstBaseline()))), TuplesKt.m7112to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt__MathJVMKt.roundToInt(textLayoutResultComponent3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                                                                    }

                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                        invoke2(placementScope);
                                                                                        return Unit.INSTANCE;
                                                                                    }
                                                                                });
                                                                            } finally {
                                                                                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            snapshotCreateNonObservableSnapshot.dispose();
                                                                            throw th;
                                                                        }
                                                                    }

                                                                    @Override // androidx.compose.p003ui.layout.MeasurePolicy
                                                                    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i38) {
                                                                        textFieldState5.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                        return textFieldState5.getTextDelegate().getMaxIntrinsicWidth();
                                                                    }
                                                                };
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                boolean z27 = false;
                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer5);
                                                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicy, companion4.getSetMeasurePolicy());
                                                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                }
                                                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                composer5.endReplaceableGroup();
                                                                composer5.endNode();
                                                                composer5.endReplaceableGroup();
                                                                TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager3;
                                                                if (textFieldState4.getHandleState() != HandleState.None && textFieldState4.getLayoutCoordinates() != null) {
                                                                    LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                                    Intrinsics.checkNotNull(layoutCoordinates);
                                                                    if (layoutCoordinates.isAttached() && z25) {
                                                                        z27 = true;
                                                                    }
                                                                }
                                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z27, composer5, 8);
                                                                if (textFieldState4.getHandleState() == HandleState.Cursor && !z26 && z25) {
                                                                    CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager3, composer5, 8);
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer5.skipToGroupEnd();
                                                        }
                                                    }), composer4, 48, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            };
                            composer2 = composerStartRestartGroup;
                            CoreTextFieldRootBox(modifierOnGloballyPositioned2, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, function2), composer2, 448);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle2;
                            function14 = function13;
                            visualTransformation3 = visualTransformation5;
                            brush3 = brush2;
                            z7 = z5;
                            i22 = i20;
                            keyboardActions3 = keyboardActions2;
                            z8 = z6;
                            modifier5 = modifier7;
                            function32 = function3M8414getLambda1$foundation_release;
                            z9 = z20;
                            mutableInteractionSource4 = mutableInteractionSource7;
                            imeOptions4 = imeOptions7;
                            i23 = i28;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier5 = modifier;
                            textStyle3 = textStyle;
                            visualTransformation3 = visualTransformation;
                            function14 = function12;
                            mutableInteractionSource4 = mutableInteractionSource;
                            brush3 = brush;
                            z7 = z;
                            i23 = i;
                            imeOptions4 = imeOptions;
                            keyboardActions3 = keyboardActions;
                            z9 = z2;
                            z8 = z3;
                            function32 = function3;
                            composer2 = composerStartRestartGroup;
                            i22 = i2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.6
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

                                public final void invoke(@Nullable Composer composer3, int i31) {
                                    CoreTextFieldKt.CoreTextField(textFieldValue, function1, modifier5, textStyle3, visualTransformation3, function14, mutableInteractionSource4, brush3, z7, i23, i22, imeOptions4, keyboardActions3, z9, z8, function32, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i25 |= 3072;
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i5 & 32768;
                    if (i19 != 0) {
                    }
                    if ((i6 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i24 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
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
                            if (i14 == 0) {
                            }
                            if ((i5 & 2048) == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            visualTransformation2 = none;
                            function13 = function15;
                            i21 = i26;
                            imeOptions3 = imeOptions2;
                            MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource5;
                            textStyle2 = textStyle4;
                            mutableInteractionSource2 = mutableInteractionSource62;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
                            final TextInputService textInputService2 = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                            final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            FontFamily.Resolver resolver2 = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                            long selectionBackgroundColor2 = ((SelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor();
                            FocusManager focusManager22 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            final WindowInfo windowInfo2 = (WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo());
                            SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                            Modifier modifier72 = modifier3;
                            if (i21 == 1) {
                                Object[] objArr2 = {orientation};
                                Saver<TextFieldScrollerPosition, Object> saver2 = TextFieldScrollerPosition.INSTANCE.getSaver();
                                final int i282 = i21;
                                composerStartRestartGroup.startReplaceableGroup(-272912543);
                                zChanged = composerStartRestartGroup.changed(orientation);
                                int i292 = i25;
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged) {
                                    objRememberedValue2 = new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final TextFieldScrollerPosition invoke() {
                                            return new TextFieldScrollerPosition(orientation, 0.0f, 2, null);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.m10957rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                                    composerStartRestartGroup.startReplaceableGroup(511388516);
                                    zChanged2 = composerStartRestartGroup.changed(textFieldValue) | composerStartRestartGroup.changed(visualTransformation2);
                                    Object objRememberedValue32 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged2) {
                                        TransformedText transformedTextFilterWithValidation2 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getText());
                                        composition = textFieldValue.getComposition();
                                        textFieldScrollerPosition2 = textFieldScrollerPosition;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        if (composition == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i17 = i5 & 8192;
                if (i17 != 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                i19 = i5 & 32768;
                if (i19 != 0) {
                }
                if ((i6 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i5 & 512;
            if (i13 != 0) {
            }
            i14 = i5 & 1024;
            if (i14 != 0) {
            }
            if ((i4 & 112) == 0) {
            }
            int i252 = i15;
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            i17 = i5 & 8192;
            if (i17 != 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            i19 = i5 & 32768;
            if (i19 != 0) {
            }
            if ((i6 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i5 & 512;
        if (i13 != 0) {
        }
        i14 = i5 & 1024;
        if (i14 != 0) {
        }
        if ((i4 & 112) == 0) {
        }
        int i2522 = i15;
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        i17 = i5 & 8192;
        if (i17 != 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        i19 = i5 & 32768;
        if (i19 != 0) {
        }
        if ((i6 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2", m7120f = "CoreTextField.kt", m7121i = {}, m7122l = {348}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2 */
    public static final class C08012 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ImeOptions $imeOptions;
        public final /* synthetic */ TextFieldSelectionManager $manager;
        public final /* synthetic */ OffsetMapping $offsetMapping;
        public final /* synthetic */ TextFieldState $state;
        public final /* synthetic */ TextInputService $textInputService;
        public final /* synthetic */ State<Boolean> $writeable$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08012(TextFieldState textFieldState, State<Boolean> state, TextInputService textInputService, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, OffsetMapping offsetMapping, Continuation<? super C08012> continuation) {
            super(2, continuation);
            this.$state = textFieldState;
            this.$writeable$delegate = state;
            this.$textInputService = textInputService;
            this.$manager = textFieldSelectionManager;
            this.$imeOptions = imeOptions;
            this.$offsetMapping = offsetMapping;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C08012(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, this.$offsetMapping, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final State<Boolean> state = this.$writeable$delegate;
                    Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Boolean invoke() {
                            return Boolean.valueOf(CoreTextFieldKt.CoreTextField$lambda$8(state));
                        }
                    });
                    final TextFieldState textFieldState = this.$state;
                    final TextInputService textInputService = this.$textInputService;
                    final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                    final ImeOptions imeOptions = this.$imeOptions;
                    final OffsetMapping offsetMapping = this.$offsetMapping;
                    FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.2.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        @Nullable
                        public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                            if (!z || !textFieldState.getHasFocus()) {
                                CoreTextFieldKt.endInputSession(textFieldState);
                            } else {
                                CoreTextFieldKt.startInputSession(textInputService, textFieldState, textFieldSelectionManager.getValue$foundation_release(), imeOptions, offsetMapping);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowSnapshotFlow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CoreTextFieldKt.endInputSession(this.$state);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                CoreTextFieldKt.endInputSession(this.$state);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-20551815);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20551815, i, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:746)");
        }
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composerStartRestartGroup, 48);
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
        composerStartRestartGroup.startReplaceableGroup(-1985516685);
        function2.invoke(composerStartRestartGroup, Integer.valueOf(((((i >> 3) & 112) | 8) >> 3) & 14));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextFieldRootBox.2
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

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CoreTextFieldKt.CoreTextFieldRootBox(modifier, textFieldSelectionManager, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final TextFieldState textFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.previewKeyEventToDeselectOnBack.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m8417invokeZmokQxo(keyEvent.m12337unboximpl());
            }

            @NotNull
            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m8417invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                boolean z;
                if (textFieldState.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m8419cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = true;
                    TextFieldSelectionManager.m8616deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
        SoftwareKeyboardController keyboardController;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else {
            if (!z || (keyboardController = textFieldState.getKeyboardController()) == null) {
                return;
            }
            keyboardController.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        textFieldState.setInputSession(TextFieldDelegate.INSTANCE.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(textFieldState, textFieldValue, offsetMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(TextFieldState textFieldState) {
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession(null);
    }

    @Nullable
    public static final Object bringSelectionEndIntoView(@NotNull BringIntoViewRequester bringIntoViewRequester, @NotNull TextFieldValue textFieldValue, @NotNull TextDelegate textDelegate, @NotNull TextLayoutResult textLayoutResult, @NotNull OffsetMapping offsetMapping, @NotNull Continuation<? super Unit> continuation) {
        Rect rect;
        int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m13162getMaximpl(textFieldValue.getSelection()));
        if (iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(iOriginalToTransformed);
        } else if (iOriginalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(iOriginalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m13835getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object objBringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        return objBringIntoView == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBringIntoView : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, Composer composer, final int i) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer composerStartRestartGroup = composer.startRestartGroup(626339208);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626339208, i, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1082)");
        }
        if (z) {
            TextFieldState state = textFieldSelectionManager.getState();
            TextLayoutResult textLayoutResult = null;
            if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                if (!(textFieldSelectionManager.getState() != null ? r3.getIsLayoutResultStale() : true)) {
                    textLayoutResult = value;
                }
            }
            if (textLayoutResult != null) {
                if (!TextRange.m13159getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                    int iOriginalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m13165getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    int iOriginalToTransformed2 = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m13160getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(iOriginalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(iOriginalToTransformed2 - 1, 0));
                    composerStartRestartGroup.startReplaceableGroup(-498386764);
                    TextFieldState state2 = textFieldSelectionManager.getState();
                    if (state2 != null && state2.getShowSelectionHandleStart()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, composerStartRestartGroup, 518);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldState state3 = textFieldSelectionManager.getState();
                    if (state3 != null && state3.getShowSelectionHandleEnd()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, composerStartRestartGroup, 518);
                    }
                }
                TextFieldState state4 = textFieldSelectionManager.getState();
                if (state4 != null) {
                    if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                        state4.setShowFloatingToolbar(false);
                    }
                    if (state4.getHasFocus()) {
                        if (state4.getShowFloatingToolbar()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldCursorHandle(@NotNull final TextFieldSelectionManager textFieldSelectionManager, @Nullable Composer composer, final int i) {
        AnnotatedString transformedText$foundation_release;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436003720);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1436003720, i, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1125)");
        }
        TextFieldState state = textFieldSelectionManager.getState();
        if (state != null && state.getShowCursorHandle() && (transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release()) != null && transformedText$foundation_release.length() > 0) {
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(textFieldSelectionManager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = textFieldSelectionManager.cursorDragObserver$foundation_release();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
            final long jM8622getCursorPositiontuRUvjQ$foundation_release = textFieldSelectionManager.m8622getCursorPositiontuRUvjQ$foundation_release((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textDragObserver, new C08181(textDragObserver, textFieldSelectionManager, null));
            composerStartRestartGroup.startReplaceableGroup(-272875148);
            boolean zChanged2 = composerStartRestartGroup.changed(jM8622getCursorPositiontuRUvjQ$foundation_release);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1
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
                        semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, jM8622getCursorPositiontuRUvjQ$foundation_release, SelectionHandleAnchor.Middle, true, null));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m8395CursorHandleULxng0E(jM8622getCursorPositiontuRUvjQ$foundation_release, SemanticsModifierKt.semantics$default(modifierPointerInput, false, (Function1) objRememberedValue2, 1, null), null, composerStartRestartGroup, 384);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", m7120f = "CoreTextField.kt", m7121i = {}, m7122l = {1134}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1 */
    public static final class C08181 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ TextFieldSelectionManager $manager;
        public final /* synthetic */ TextDragObserver $observer;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08181(TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, Continuation<? super C08181> continuation) {
            super(2, continuation);
            this.$observer = textDragObserver;
            this.$manager = textFieldSelectionManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C08181 c08181 = new C08181(this.$observer, this.$manager, continuation);
            c08181.L$0 = obj;
            return c08181;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08181) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CoreTextField.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1", m7120f = "CoreTextField.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PointerInputScope $$this$pointerInput;
            public final /* synthetic */ TextFieldSelectionManager $manager;
            public final /* synthetic */ TextDragObserver $observer;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$pointerInput = pointerInputScope;
                this.$observer = textDragObserver;
                this.$manager = textFieldSelectionManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$observer, this.$manager, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new C118401(this.$$this$pointerInput, this.$observer, null), 1, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass2(this.$$this$pointerInput, this.$manager, null), 1, null);
                return Unit.INSTANCE;
            }

            /* compiled from: CoreTextField.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$1", m7120f = "CoreTextField.kt", m7121i = {}, m7122l = {1138}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C118401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ PointerInputScope $$this$pointerInput;
                public final /* synthetic */ TextDragObserver $observer;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C118401(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation<? super C118401> continuation) {
                    super(2, continuation);
                    this.$$this$pointerInput = pointerInputScope;
                    this.$observer = textDragObserver;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C118401(this.$$this$pointerInput, this.$observer, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C118401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = this.$$this$pointerInput;
                        TextDragObserver textDragObserver = this.$observer;
                        this.label = 1;
                        if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == coroutine_suspended) {
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

            /* compiled from: CoreTextField.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$2", m7120f = "CoreTextField.kt", m7121i = {}, m7122l = {1141}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ PointerInputScope $$this$pointerInput;
                public final /* synthetic */ TextFieldSelectionManager $manager;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionManager textFieldSelectionManager, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$$this$pointerInput = pointerInputScope;
                    this.$manager = textFieldSelectionManager;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass2(this.$$this$pointerInput, this.$manager, continuation);
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
                        PointerInputScope pointerInputScope = this.$$this$pointerInput;
                        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                        Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.1.1.2.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                m8416invokek4lQ0M(offset.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m8416invokek4lQ0M(long j) {
                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, function1, this, 7, null) == coroutine_suspended) {
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$observer, this.$manager, null);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                TextInputSession inputSession = textFieldState.getInputSession();
                if (inputSession == null) {
                    return;
                }
                LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    return;
                }
                TextFieldDelegate.INSTANCE.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, textFieldState.getHasFocus(), offsetMapping);
                Unit unit = Unit.INSTANCE;
            } finally {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } finally {
            snapshotCreateNonObservableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
