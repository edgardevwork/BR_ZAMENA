package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RectKt;
import androidx.compose.p003ui.hapticfeedback.HapticFeedback;
import androidx.compose.p003ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.platform.ClipboardManager;
import androidx.compose.p003ui.platform.TextToolbar;
import androidx.compose.p003ui.platform.TextToolbarStatus;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.text.style.ResolvedTextDirection;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blackhub.bronline.game.gui.fractions.Const;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldSelectionState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010Z\u001a\u00020[H\u0002J\u0010\u0010\\\u001a\u00020[2\b\b\u0002\u0010]\u001a\u00020\tJ\u0006\u0010^\u001a\u00020[J\u0006\u0010_\u001a\u00020[J\u0006\u0010`\u001a\u00020[J\b\u0010a\u001a\u00020\u001eH\u0002J\u001d\u0010b\u001a\u00020\u00102\u0006\u0010c\u001a\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u00142\u0006\u0010c\u001a\u00020\tH\u0002J<\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020:2\u0006\u0010j\u001a\u00020:2\b\u0010k\u001a\u0004\u0018\u00010h2\u0006\u0010c\u001a\u00020\t2\u0006\u0010l\u001a\u00020mH\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010oJ\b\u0010p\u001a\u00020[H\u0002J\b\u0010q\u001a\u00020[H\u0002J\u000e\u0010r\u001a\u00020[H\u0086@¢\u0006\u0002\u0010sJ\u000e\u0010t\u001a\u00020[H\u0082@¢\u0006\u0002\u0010sJ\u000e\u0010u\u001a\u00020[H\u0082@¢\u0006\u0002\u0010sJ\u0006\u0010v\u001a\u00020[J\u0010\u0010w\u001a\u00020[2\u0006\u0010x\u001a\u00020\u001eH\u0002J6\u0010y\u001a\u00020[2\u0006\u00102\u001a\u0002032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020R2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\"\u0010z\u001a\u00020[2\u0006\u0010{\u001a\u00020#2\u0006\u0010|\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b}\u0010~JN\u0010\u007f\u001a\u00020h2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020:2\u0007\u0010\u0083\u0001\u001a\u00020:2\u0006\u0010c\u001a\u00020\t2\u0006\u0010l\u001a\u00020m2\t\b\u0002\u0010\u0084\u0001\u001a\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u000f\u0010\u0087\u0001\u001a\u00020[2\u0006\u0010T\u001a\u00020SJ\u0015\u0010\u0088\u0001\u001a\u00020[*\u00030\u0089\u0001H\u0086@¢\u0006\u0003\u0010\u008a\u0001J\u0015\u0010\u008b\u0001\u001a\u00020[*\u00030\u0089\u0001H\u0082@¢\u0006\u0003\u0010\u008a\u0001J\u001d\u0010\u008c\u0001\u001a\u00020[*\u00030\u0089\u00012\u0006\u0010c\u001a\u00020\tH\u0082@¢\u0006\u0003\u0010\u008d\u0001J%\u0010\u008e\u0001\u001a\u00020[*\u00030\u0089\u00012\u000e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020[0\u0090\u0001H\u0082@¢\u0006\u0003\u0010\u0091\u0001J5\u0010\u0092\u0001\u001a\u00020[*\u00030\u0089\u00012\u000e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020[0\u0090\u00012\u000e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020[0\u0090\u0001H\u0082@¢\u0006\u0003\u0010\u0094\u0001J\u0015\u0010\u0095\u0001\u001a\u00020[*\u00030\u0089\u0001H\u0082@¢\u0006\u0003\u0010\u008a\u0001J\u001d\u0010\u0096\u0001\u001a\u00020[*\u00030\u0089\u00012\u0006\u0010c\u001a\u00020\tH\u0086@¢\u0006\u0003\u0010\u008d\u0001J5\u0010\u0097\u0001\u001a\u00020[*\u00030\u0089\u00012\u000e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020[0\u0090\u00012\u000e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020[0\u0090\u0001H\u0086@¢\u0006\u0003\u0010\u0094\u0001R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010#8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0018\u001a\u0004\b.\u0010\u0016R\u0017\u00100\u001a\u00020\u00108Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b1\u0010\u0012R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u001b\"\u0004\b4\u00105R+\u00106\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u00105R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R1\u0010=\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00108B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bA\u0010*\u001a\u0004\b>\u0010\u0012\"\u0004\b?\u0010@R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010B\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010*\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u00105R1\u0010F\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00108B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bI\u0010*\u001a\u0004\bG\u0010\u0012\"\u0004\bH\u0010@R\u001b\u0010J\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u0018\u001a\u0004\bK\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010M\u001a\u0004\u0018\u00010N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Q\u001a\u0004\u0018\u00010RX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010T\u001a\u00020S2\u0006\u0010\"\u001a\u00020S8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010*\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0098\u0001"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "density", "Landroidx/compose/ui/unit/Density;", "enabled", "", "readOnly", "isFocused", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZ)V", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "currentContentVisibleOffset", "Landroidx/compose/ui/geometry/Offset;", "getCurrentContentVisibleOffset-F1C5BW0", "()J", "cursorHandle", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;", "getCursorHandle", "()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;", "cursorHandle$delegate", "Landroidx/compose/runtime/State;", "cursorHandleInBounds", "getCursorHandleInBounds", "()Z", "cursorHandleInBounds$delegate", "cursorRect", "Landroidx/compose/ui/geometry/Rect;", "getCursorRect", "()Landroidx/compose/ui/geometry/Rect;", "cursorRect$delegate", "<set-?>", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "Landroidx/compose/runtime/MutableState;", "editable", "getEditable", "endSelectionHandle", "getEndSelectionHandle", "endSelectionHandle$delegate", "handleDragPosition", "getHandleDragPosition-F1C5BW0", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setFocused", "(Z)V", "isInTouchMode", "setInTouchMode", "isInTouchMode$delegate", "previousRawDragOffset", "", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "rawHandleDragPosition", "getRawHandleDragPosition-F1C5BW0", "setRawHandleDragPosition-k-4lQ0M", "(J)V", "rawHandleDragPosition$delegate", "showCursorHandle", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle$delegate", "startContentVisibleOffset", "getStartContentVisibleOffset-F1C5BW0", "setStartContentVisibleOffset-k-4lQ0M", "startContentVisibleOffset$delegate", "startSelectionHandle", "getStartSelectionHandle", "startSelectionHandle$delegate", "textLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getTextLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;", "textToolbarState", "getTextToolbarState", "()Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;", "setTextToolbarState", "(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V", "textToolbarState$delegate", "clearHandleDragging", "", "copy", "cancelSelection", "cut", "deselect", "dispose", "getContentRect", "getHandlePosition", "isStartHandle", "getHandlePosition-tuRUvjQ", "(Z)J", "getSelectionHandleState", "getTextFieldSelection", "Landroidx/compose/ui/text/TextRange;", "rawStartOffset", "rawEndOffset", "previousSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getTextFieldSelection-qeG_v_k", "(IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "hideTextToolbar", "markStartContentVisibleOffset", "observeChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeTextChanges", "observeTextToolbarVisibility", "paste", "showTextToolbar", "contentRect", "update", "updateHandleDragging", "handle", "position", "updateHandleDragging-Uv8p0NA", "(Landroidx/compose/foundation/text/Handle;J)V", "updateSelection", "textFieldCharSequence", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "startOffset", "endOffset", "allowPreviousSelectionCollapsed", "updateSelection-QNhciaU", "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "updateTextToolbarState", "cursorHandleGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectCursorHandleDragGestures", "detectSelectionHandleDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTextFieldLongPressAndAfterDrag", "requestFocus", "Lkotlin/Function0;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTextFieldTapGestures", "showKeyboard", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTouchMode", "selectionHandleGestures", "textFieldGestures", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n81#2:1236\n107#2,2:1237\n81#2:1239\n107#2,2:1240\n81#2:1242\n107#2,2:1243\n81#2:1245\n107#2,2:1246\n81#2:1248\n107#2,2:1249\n81#2:1251\n107#2,2:1252\n81#2:1255\n81#2:1256\n81#2:1257\n81#2:1258\n81#2:1259\n1#3:1254\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState\n*L\n99#1:1236\n99#1:1237,2\n110#1:1239\n110#1:1240,2\n132#1:1242\n132#1:1243,2\n164#1:1245\n164#1:1246,2\n169#1:1248\n169#1:1249,2\n175#1:1251\n175#1:1252,2\n206#1:1255\n239#1:1256\n254#1:1257\n285#1:1258\n289#1:1259\n*E\n"})
/* loaded from: classes3.dex */
public final class TextFieldSelectionState {
    public static final int $stable = 8;

    @Nullable
    private ClipboardManager clipboardManager;

    /* renamed from: cursorHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final State cursorHandle;

    /* renamed from: cursorHandleInBounds$delegate, reason: from kotlin metadata */
    @NotNull
    private final State cursorHandleInBounds;

    /* renamed from: cursorRect$delegate, reason: from kotlin metadata */
    @NotNull
    private final State cursorRect;

    @NotNull
    private Density density;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState draggingHandle;
    private boolean enabled;

    /* renamed from: endSelectionHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final State endSelectionHandle;

    @Nullable
    private HapticFeedback hapticFeedBack;
    private boolean isFocused;

    /* renamed from: isInTouchMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isInTouchMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private int previousRawDragOffset;

    @Nullable
    private SelectionLayout previousSelectionLayout;

    /* renamed from: rawHandleDragPosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState rawHandleDragPosition;
    private boolean readOnly;

    /* renamed from: showCursorHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showCursorHandle;

    /* renamed from: startContentVisibleOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState startContentVisibleOffset;

    /* renamed from: startSelectionHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final State startSelectionHandle;

    @NotNull
    private final TransformedTextFieldState textFieldState;

    @NotNull
    private final TextLayoutState textLayoutState;

    @Nullable
    private TextToolbar textToolbar;

    /* renamed from: textToolbarState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState textToolbarState;

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState", m7120f = "TextFieldSelectionState.kt", m7121i = {0, 0, 0}, m7122l = {498}, m7123m = "detectCursorHandleDragGestures", m7124n = {"this", "cursorDragStart", "cursorDragDelta"}, m7125s = {"L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 */
    /* loaded from: classes4.dex */
    public static final class C09811 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C09811(Continuation<? super C09811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.detectCursorHandleDragGestures(null, this);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState", m7120f = "TextFieldSelectionState.kt", m7121i = {0, 0, 0, 0}, m7122l = {740}, m7123m = "detectSelectionHandleDragGestures", m7124n = {"this", "dragBeginPosition", "dragTotalDistance", "handle"}, m7125s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 */
    public static final class C09861 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C09861(Continuation<? super C09861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.detectSelectionHandleDragGestures(null, false, this);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState", m7120f = "TextFieldSelectionState.kt", m7121i = {0}, m7122l = {393}, m7123m = "observeChanges", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$1 */
    public static final class C09991 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C09991(Continuation<? super C09991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldSelectionState.this.observeChanges(this);
        }
    }

    public TextFieldSelectionState(@NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextLayoutState textLayoutState, @NotNull Density density, boolean z, boolean z2, boolean z3) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.enabled = z;
        this.readOnly = z2;
        this.isFocused = z3;
        Offset.Companion companion = Offset.INSTANCE;
        this.startContentVisibleOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m11088boximpl(companion.m11114getUnspecifiedF1C5BW0()), null, 2, null);
        this.rawHandleDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m11088boximpl(companion.m11114getUnspecifiedF1C5BW0()), null, 2, null);
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.showCursorHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.textToolbarState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextToolbarState.None, null, 2, null);
        this.previousRawDragOffset = -1;
        this.cursorHandle = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TextFieldHandleState invoke() {
                TextFieldCharSequence text = this.this$0.textFieldState.getText();
                if (!this.this$0.getShowCursorHandle() || !TextRange.m13159getCollapsedimpl(text.getSelectionInChars()) || text.length() <= 0 || (this.this$0.getDraggingHandle() != Handle.Cursor && !this.this$0.getCursorHandleInBounds())) {
                    return TextFieldHandleState.INSTANCE.getHidden();
                }
                return new TextFieldHandleState(true, this.this$0.getCursorRect().m11126getBottomCenterF1C5BW0(), ResolvedTextDirection.Ltr, false, null);
            }
        });
        this.cursorHandleInBounds = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleInBounds$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                Rect rectVisibleBounds;
                Snapshot.Companion companion2 = Snapshot.INSTANCE;
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                Snapshot snapshotCreateNonObservableSnapshot = companion2.createNonObservableSnapshot();
                try {
                    Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                    try {
                        long jM11126getBottomCenterF1C5BW0 = textFieldSelectionState.getCursorRect().m11126getBottomCenterF1C5BW0();
                        snapshotCreateNonObservableSnapshot.dispose();
                        LayoutCoordinates textLayoutCoordinates = this.this$0.getTextLayoutCoordinates();
                        return Boolean.valueOf((textLayoutCoordinates == null || (rectVisibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) ? false : SelectionManagerKt.m8601containsInclusiveUv8p0NA(rectVisibleBounds, jM11126getBottomCenterF1C5BW0));
                    } finally {
                        snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    }
                } catch (Throwable th) {
                    snapshotCreateNonObservableSnapshot.dispose();
                    throw th;
                }
            }
        });
        this.cursorRect = SnapshotStateKt.derivedStateOf(new Function0<Rect>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorRect$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Rect invoke() {
                float right;
                TextLayoutResult layoutResult = this.this$0.textLayoutState.getLayoutResult();
                if (layoutResult == null) {
                    return Rect.INSTANCE.getZero();
                }
                TextFieldCharSequence text = this.this$0.textFieldState.getText();
                if (!TextRange.m13159getCollapsedimpl(text.getSelectionInChars())) {
                    return Rect.INSTANCE.getZero();
                }
                Rect cursorRect = layoutResult.getCursorRect(TextRange.m13165getStartimpl(text.getSelectionInChars()));
                float fMo7874toPx0680j_4 = this.this$0.density.mo7874toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                if (layoutResult.getLayoutInput().getLayoutDirection() == LayoutDirection.Ltr) {
                    right = cursorRect.getLeft() + (fMo7874toPx0680j_4 / 2);
                } else {
                    right = cursorRect.getRight() - (fMo7874toPx0680j_4 / 2);
                }
                float f = fMo7874toPx0680j_4 / 2;
                float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(RangesKt___RangesKt.coerceAtMost(right, IntSize.m13836getWidthimpl(layoutResult.getSize()) - f), f);
                return new Rect(fCoerceAtLeast - f, cursorRect.getTop(), fCoerceAtLeast + f, cursorRect.getBottom());
            }
        });
        this.startSelectionHandle = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$startSelectionHandle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TextFieldHandleState invoke() {
                return this.this$0.getSelectionHandleState(true);
            }
        });
        this.endSelectionHandle = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$endSelectionHandle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TextFieldHandleState invoke() {
                return this.this$0.getSelectionHandleState(false);
            }
        });
    }

    /* renamed from: isFocused, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    public final void setFocused(boolean z) {
        this.isFocused = z;
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartContentVisibleOffset-F1C5BW0 */
    private final long m8743getStartContentVisibleOffsetF1C5BW0() {
        return ((Offset) this.startContentVisibleOffset.getValue()).getPackedValue();
    }

    /* renamed from: setStartContentVisibleOffset-k-4lQ0M */
    private final void m8746setStartContentVisibleOffsetk4lQ0M(long j) {
        this.startContentVisibleOffset.setValue(Offset.m11088boximpl(j));
    }

    /* renamed from: getCurrentContentVisibleOffset-F1C5BW0 */
    private final long m8740getCurrentContentVisibleOffsetF1C5BW0() {
        Rect rectVisibleBounds;
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        return (textLayoutCoordinates == null || (rectVisibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) ? Offset.INSTANCE.m11114getUnspecifiedF1C5BW0() : rectVisibleBounds.m11134getTopLeftF1C5BW0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getRawHandleDragPosition-F1C5BW0 */
    private final long m8742getRawHandleDragPositionF1C5BW0() {
        return ((Offset) this.rawHandleDragPosition.getValue()).getPackedValue();
    }

    /* renamed from: setRawHandleDragPosition-k-4lQ0M */
    private final void m8745setRawHandleDragPositionk4lQ0M(long j) {
        this.rawHandleDragPosition.setValue(Offset.m11088boximpl(j));
    }

    /* renamed from: getHandleDragPosition-F1C5BW0 */
    public final long m8750getHandleDragPositionF1C5BW0() {
        if (OffsetKt.m11120isUnspecifiedk4lQ0M(m8742getRawHandleDragPositionF1C5BW0())) {
            return Offset.INSTANCE.m11114getUnspecifiedF1C5BW0();
        }
        if (OffsetKt.m11120isUnspecifiedk4lQ0M(m8743getStartContentVisibleOffsetF1C5BW0())) {
            return TextLayoutStateKt.m8708fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, m8742getRawHandleDragPositionF1C5BW0());
        }
        return Offset.m11103minusMKHz9U(Offset.m11104plusMKHz9U(m8742getRawHandleDragPositionF1C5BW0(), m8740getCurrentContentVisibleOffsetF1C5BW0()), m8743getStartContentVisibleOffsetF1C5BW0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    public final void setDraggingHandle(@Nullable Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextToolbarState getTextToolbarState() {
        return (TextToolbarState) this.textToolbarState.getValue();
    }

    public final void setTextToolbarState(TextToolbarState textToolbarState) {
        this.textToolbarState.setValue(textToolbarState);
    }

    public final LayoutCoordinates getTextLayoutCoordinates() {
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            return null;
        }
        return textLayoutNodeCoordinates;
    }

    public final boolean getEditable() {
        return this.enabled && !this.readOnly;
    }

    @NotNull
    public final TextFieldHandleState getCursorHandle() {
        return (TextFieldHandleState) this.cursorHandle.getValue();
    }

    public final boolean getCursorHandleInBounds() {
        return ((Boolean) this.cursorHandleInBounds.getValue()).booleanValue();
    }

    @NotNull
    public final Rect getCursorRect() {
        return (Rect) this.cursorRect.getValue();
    }

    @NotNull
    public final TextFieldHandleState getStartSelectionHandle() {
        return (TextFieldHandleState) this.startSelectionHandle.getValue();
    }

    @NotNull
    public final TextFieldHandleState getEndSelectionHandle() {
        return (TextFieldHandleState) this.endSelectionHandle.getValue();
    }

    public final void update(@NotNull HapticFeedback hapticFeedBack, @NotNull ClipboardManager clipboardManager, @NotNull TextToolbar textToolbar, @NotNull Density density, boolean enabled, boolean readOnly) {
        if (!enabled) {
            hideTextToolbar();
        }
        this.hapticFeedBack = hapticFeedBack;
        this.clipboardManager = clipboardManager;
        this.textToolbar = textToolbar;
        this.density = density;
        this.enabled = enabled;
        this.readOnly = readOnly;
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2 */
    /* loaded from: classes2.dex */
    public static final class C09802 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        public final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09802(PointerInputScope pointerInputScope, Continuation<? super C09802> continuation) {
            super(2, continuation);
            this.$this_cursorHandleGestures = pointerInputScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C09802 c09802 = TextFieldSelectionState.this.new C09802(this.$this_cursorHandleGestures, continuation);
            c09802.L$0 = obj;
            return c09802;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Job> continuation) {
            return ((C09802) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {TypedValues.AttributesType.TYPE_PIVOT_TARGET}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            public int label;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_cursorHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, continuation);
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
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == coroutine_suspended) {
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
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass1(TextFieldSelectionState.this, this.$this_cursorHandleGestures, null), 1, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass2(TextFieldSelectionState.this, this.$this_cursorHandleGestures, null), 1, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass3(this.$this_cursorHandleGestures, TextFieldSelectionState.this, null), 1, null);
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {321}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2 */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            public int label;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_cursorHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$this_cursorHandleGestures, continuation);
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
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectCursorHandleDragGestures(pointerInputScope, this) == coroutine_suspended) {
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

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {324}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3 */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
            public int label;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$this_cursorHandleGestures = pointerInputScope;
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3$1 */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends Lambda implements Function1<Offset, Unit> {
                public AnonymousClass1() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m8751invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M */
                public final void m8751invokek4lQ0M(long j) {
                    TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                    TextToolbarState textToolbarState = textFieldSelectionState.getTextToolbarState();
                    TextToolbarState textToolbarState2 = TextToolbarState.Cursor;
                    if (textToolbarState == textToolbarState2) {
                        textToolbarState2 = TextToolbarState.None;
                    }
                    textFieldSelectionState.setTextToolbarState(textToolbarState2);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                    AnonymousClass1 anonymousClass1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.cursorHandleGestures.2.3.1
                        public AnonymousClass1() {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                            m8751invokek4lQ0M(offset.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-k-4lQ0M */
                        public final void m8751invokek4lQ0M(long j) {
                            TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                            TextToolbarState textToolbarState = textFieldSelectionState.getTextToolbarState();
                            TextToolbarState textToolbarState2 = TextToolbarState.Cursor;
                            if (textToolbarState == textToolbarState2) {
                                textToolbarState2 = TextToolbarState.None;
                            }
                            textFieldSelectionState.setTextToolbarState(textToolbarState2);
                        }
                    };
                    this.label = 1;
                    if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, anonymousClass1, this, 7, null) == coroutine_suspended) {
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

    @Nullable
    public final Object cursorHandleGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C09802(pointerInputScope, null), continuation);
        return objCoroutineScope == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2 */
    /* loaded from: classes2.dex */
    public static final class C10072 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        public final /* synthetic */ Function0<Unit> $requestFocus;
        public final /* synthetic */ Function0<Unit> $showKeyboard;
        public final /* synthetic */ PointerInputScope $this_textFieldGestures;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10072(PointerInputScope pointerInputScope, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super C10072> continuation) {
            super(2, continuation);
            this.$this_textFieldGestures = pointerInputScope;
            this.$requestFocus = function0;
            this.$showKeyboard = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C10072 c10072 = TextFieldSelectionState.this.new C10072(this.$this_textFieldGestures, this.$requestFocus, this.$showKeyboard, continuation);
            c10072.L$0 = obj;
            return c10072;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Job> continuation) {
            return ((C10072) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$1", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {344}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PointerInputScope $this_textFieldGestures;
            public int label;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_textFieldGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$this_textFieldGestures, continuation);
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
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_textFieldGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == coroutine_suspended) {
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
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass1(TextFieldSelectionState.this, this.$this_textFieldGestures, null), 1, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass2(TextFieldSelectionState.this, this.$this_textFieldGestures, this.$requestFocus, this.$showKeyboard, null), 1, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass3(TextFieldSelectionState.this, this.$this_textFieldGestures, this.$requestFocus, null), 1, null);
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$2", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {347}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$2 */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function0<Unit> $requestFocus;
            public final /* synthetic */ Function0<Unit> $showKeyboard;
            public final /* synthetic */ PointerInputScope $this_textFieldGestures;
            public int label;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_textFieldGestures = pointerInputScope;
                this.$requestFocus = function0;
                this.$showKeyboard = function02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$this_textFieldGestures, this.$requestFocus, this.$showKeyboard, continuation);
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
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_textFieldGestures;
                    Function0<Unit> function0 = this.$requestFocus;
                    Function0<Unit> function02 = this.$showKeyboard;
                    this.label = 1;
                    if (textFieldSelectionState.detectTextFieldTapGestures(pointerInputScope, function0, function02, this) == coroutine_suspended) {
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

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$3", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {350}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$textFieldGestures$2$3 */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function0<Unit> $requestFocus;
            public final /* synthetic */ PointerInputScope $this_textFieldGestures;
            public int label;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Function0<Unit> function0, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_textFieldGestures = pointerInputScope;
                this.$requestFocus = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$this_textFieldGestures, this.$requestFocus, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_textFieldGestures;
                    Function0<Unit> function0 = this.$requestFocus;
                    this.label = 1;
                    if (textFieldSelectionState.detectTextFieldLongPressAndAfterDrag(pointerInputScope, function0, this) == coroutine_suspended) {
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

    @Nullable
    public final Object textFieldGestures(@NotNull PointerInputScope pointerInputScope, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C10072(pointerInputScope, function0, function02, null), continuation);
        return objCoroutineScope == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2 */
    /* loaded from: classes2.dex */
    public static final class C10062 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        public final /* synthetic */ boolean $isStartHandle;
        public final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10062(PointerInputScope pointerInputScope, boolean z, Continuation<? super C10062> continuation) {
            super(2, continuation);
            this.$this_selectionHandleGestures = pointerInputScope;
            this.$isStartHandle = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C10062 c10062 = TextFieldSelectionState.this.new C10062(this.$this_selectionHandleGestures, this.$isStartHandle, continuation);
            c10062.L$0 = obj;
            return c10062;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Job> continuation) {
            return ((C10062) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {361}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            public int label;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_selectionHandleGestures = pointerInputScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, continuation);
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
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    this.label = 1;
                    if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == coroutine_suspended) {
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
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass1(TextFieldSelectionState.this, this.$this_selectionHandleGestures, null), 1, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass2(this.$this_selectionHandleGestures, TextFieldSelectionState.this, this.$isStartHandle, null), 1, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass3(TextFieldSelectionState.this, this.$this_selectionHandleGestures, this.$isStartHandle, null), 1, null);
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {364}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2 */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ boolean $isStartHandle;
            public final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            public int label;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, boolean z, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$this_selectionHandleGestures = pointerInputScope;
                this.this$0 = textFieldSelectionState;
                this.$isStartHandle = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2$2 */
            /* loaded from: classes3.dex */
            public static final class C118512 extends Lambda implements Function0<Unit> {
                public C118512() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    textFieldSelectionState.clearHandleDragging();
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    AnonymousClass1 anonymousClass1 = new TapOnPosition() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.1
                        public final /* synthetic */ boolean $isStartHandle;

                        public AnonymousClass1(boolean z) {
                            z = z;
                        }

                        @Override // androidx.compose.foundation.text2.input.internal.selection.TapOnPosition
                        /* renamed from: onEvent-k-4lQ0M */
                        public final void mo8723onEventk4lQ0M(long j) {
                            Handle handle;
                            textFieldSelectionState.markStartContentVisibleOffset();
                            TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                            boolean z = z;
                            if (z) {
                                handle = Handle.SelectionStart;
                            } else {
                                handle = Handle.SelectionEnd;
                            }
                            textFieldSelectionState.m8747updateHandleDraggingUv8p0NA(handle, SelectionHandlesKt.m8564getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.m8741getHandlePositiontuRUvjQ(z)));
                        }
                    };
                    C118512 c118512 = new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.2
                        public C118512() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            textFieldSelectionState.clearHandleDragging();
                        }
                    };
                    this.label = 1;
                    if (PressDownGestureKt.detectPressDownGesture(pointerInputScope, anonymousClass1, c118512, this) == coroutine_suspended) {
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

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2$1 */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1 implements TapOnPosition {
                public final /* synthetic */ boolean $isStartHandle;

                public AnonymousClass1(boolean z) {
                    z = z;
                }

                @Override // androidx.compose.foundation.text2.input.internal.selection.TapOnPosition
                /* renamed from: onEvent-k-4lQ0M */
                public final void mo8723onEventk4lQ0M(long j) {
                    Handle handle;
                    textFieldSelectionState.markStartContentVisibleOffset();
                    TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                    boolean z = z;
                    if (z) {
                        handle = Handle.SelectionStart;
                    } else {
                        handle = Handle.SelectionEnd;
                    }
                    textFieldSelectionState.m8747updateHandleDraggingUv8p0NA(handle, SelectionHandlesKt.m8564getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.m8741getHandlePositiontuRUvjQ(z)));
                }
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {382}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3 */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ boolean $isStartHandle;
            public final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
            public int label;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
                this.$this_selectionHandleGestures = pointerInputScope;
                this.$isStartHandle = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                    boolean z = this.$isStartHandle;
                    this.label = 1;
                    if (textFieldSelectionState.detectSelectionHandleDragGestures(pointerInputScope, z, this) == coroutine_suspended) {
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

    @Nullable
    public final Object selectionHandleGestures(@NotNull PointerInputScope pointerInputScope, boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C10062(pointerInputScope, z, null), continuation);
        return objCoroutineScope == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006c  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object observeChanges(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C09991 c09991;
        TextFieldSelectionState textFieldSelectionState;
        if (continuation instanceof C09991) {
            c09991 = (C09991) continuation;
            int i = c09991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c09991.label = i - Integer.MIN_VALUE;
            } else {
                c09991 = new C09991(continuation);
            }
        }
        Object obj = c09991.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c09991.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textFieldSelectionState = (TextFieldSelectionState) c09991.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                textFieldSelectionState.setShowCursorHandle(false);
                if (textFieldSelectionState.getTextToolbarState() != TextToolbarState.None) {
                    textFieldSelectionState.hideTextToolbar();
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                textFieldSelectionState.setShowCursorHandle(false);
                if (textFieldSelectionState.getTextToolbarState() != TextToolbarState.None) {
                    textFieldSelectionState.hideTextToolbar();
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            C10002 c10002 = new C10002(null);
            c09991.L$0 = this;
            c09991.label = 1;
            if (CoroutineScopeKt.coroutineScope(c10002, c09991) == coroutine_suspended) {
                return coroutine_suspended;
            }
            textFieldSelectionState = this;
            textFieldSelectionState.setShowCursorHandle(false);
            if (textFieldSelectionState.getTextToolbarState() != TextToolbarState.None) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            textFieldSelectionState = this;
            textFieldSelectionState.setShowCursorHandle(false);
            if (textFieldSelectionState.getTextToolbarState() != TextToolbarState.None) {
            }
            throw th;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2 */
    /* loaded from: classes2.dex */
    public static final class C10002 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C10002(Continuation<? super C10002> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C10002 c10002 = TextFieldSelectionState.this.new C10002(continuation);
            c10002.L$0 = obj;
            return c10002;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Job> continuation) {
            return ((C10002) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2$1", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {394}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    this.label = 1;
                    if (textFieldSelectionState.observeTextChanges(this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(TextFieldSelectionState.this, null), 3, null);
                return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(TextFieldSelectionState.this, null), 3, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2$2", m7120f = "TextFieldSelectionState.kt", m7121i = {}, m7122l = {395}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2$2 */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
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
                    TextFieldSelectionState textFieldSelectionState = this.this$0;
                    this.label = 1;
                    if (textFieldSelectionState.observeTextToolbarVisibility(this) == coroutine_suspended) {
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

    public final void updateTextToolbarState(@NotNull TextToolbarState textToolbarState) {
        setTextToolbarState(textToolbarState);
    }

    public final void dispose() {
        hideTextToolbar();
        this.textToolbar = null;
        this.clipboardManager = null;
        this.hapticFeedBack = null;
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", m7120f = "TextFieldSelectionState.kt", m7121i = {0}, m7122l = {TypedValues.CycleType.TYPE_WAVE_PHASE}, m7123m = "invokeSuspend", m7124n = {"$this$awaitPointerEventScope"}, m7125s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTouchMode$2 */
    /* loaded from: classes2.dex */
    public static final class C09982 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C09982(Continuation<? super C09982> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C09982 c09982 = TextFieldSelectionState.this.new C09982(continuation);
            c09982.L$0 = obj;
            return c09982;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C09982) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0030 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x002e -> B:25:0x0031). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L13
                java.lang.Object r1 = r4.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p003ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r5)
                goto L31
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p003ui.input.pointer.AwaitPointerEventScope) r5
                r1 = r5
            L24:
                androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p003ui.input.pointer.PointerEventPass.Initial
                r4.L$0 = r1
                r4.label = r2
                java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                if (r5 != r0) goto L31
                return r0
            L31:
                androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.p003ui.input.pointer.PointerEvent) r5
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r3 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.this
                boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r5)
                r5 = r5 ^ r2
                androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.access$setInTouchMode(r3, r5)
                goto L24
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.C09982.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object detectTouchMode(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C09982(null), continuation);
        return objAwaitPointerEventScope == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7105d2 = {"<anonymous>", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2 */
    public static final class C09962 implements TapOnPosition {
        public final /* synthetic */ Function0<Unit> $requestFocus;
        public final /* synthetic */ Function0<Unit> $showKeyboard;
        public final /* synthetic */ TextFieldSelectionState this$0;

        public C09962(Function0<Unit> function0, TextFieldSelectionState textFieldSelectionState, Function0<Unit> function02) {
            function0 = function0;
            textFieldSelectionState = textFieldSelectionState;
            function0 = function02;
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<String> {
            public static final AnonymousClass1 INSTANCE = ;

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "onTapTextField";
            }
        }

        @Override // androidx.compose.foundation.text2.input.internal.selection.TapOnPosition
        /* renamed from: onEvent-k-4lQ0M */
        public final void mo8723onEventk4lQ0M(long j) {
            TextFieldSelectionStateKt.logDebug(AnonymousClass1.INSTANCE);
            function0.invoke();
            if (textFieldSelectionState.getEditable() && textFieldSelectionState.getIsFocused()) {
                function0.invoke();
                if (textFieldSelectionState.textFieldState.getText().length() > 0) {
                    textFieldSelectionState.setShowCursorHandle(true);
                }
                textFieldSelectionState.updateTextToolbarState(TextToolbarState.None);
                int iM8701getOffsetForPosition3MmeM6k$default = TextLayoutState.m8701getOffsetForPosition3MmeM6k$default(textFieldSelectionState.textLayoutState, j, false, 2, null);
                if (iM8701getOffsetForPosition3MmeM6k$default >= 0) {
                    textFieldSelectionState.textFieldState.placeCursorBeforeCharAt(iM8701getOffsetForPosition3MmeM6k$default);
                }
            }
        }
    }

    public final Object detectTextFieldTapGestures(PointerInputScope pointerInputScope, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super Unit> continuation) {
        Object objDetectTapAndDoubleTap = TapAndDoubleTapGestureKt.detectTapAndDoubleTap(pointerInputScope, new TapOnPosition() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.2
            public final /* synthetic */ Function0<Unit> $requestFocus;
            public final /* synthetic */ Function0<Unit> $showKeyboard;
            public final /* synthetic */ TextFieldSelectionState this$0;

            public C09962(Function0<Unit> function03, TextFieldSelectionState this, Function0<Unit> function022) {
                function0 = function03;
                textFieldSelectionState = this;
                function0 = function022;
            }

            /*  JADX ERROR: Failed to generate init code
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  A[DECLARE_VAR, DONT_GENERATE, MD:():void (m), REMOVE, WRAPPED] call: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.2.1.<init>():void type: CONSTRUCTOR in method: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.2.1.<clinit>():void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:547)
                	at jadx.core.codegen.ClassGen.addField(ClassGen.java:453)
                	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:285)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
                Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.2.1
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:813)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
                	... 49 more
                */
            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1 */
            public static final class AnonymousClass1 extends Lambda implements Function0<String> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "onTapTextField";
                }
            }

            @Override // androidx.compose.foundation.text2.input.internal.selection.TapOnPosition
            /* renamed from: onEvent-k-4lQ0M */
            public final void mo8723onEventk4lQ0M(long j) {
                TextFieldSelectionStateKt.logDebug(AnonymousClass1.INSTANCE);
                function0.invoke();
                if (textFieldSelectionState.getEditable() && textFieldSelectionState.getIsFocused()) {
                    function0.invoke();
                    if (textFieldSelectionState.textFieldState.getText().length() > 0) {
                        textFieldSelectionState.setShowCursorHandle(true);
                    }
                    textFieldSelectionState.updateTextToolbarState(TextToolbarState.None);
                    int iM8701getOffsetForPosition3MmeM6k$default = TextLayoutState.m8701getOffsetForPosition3MmeM6k$default(textFieldSelectionState.textLayoutState, j, false, 2, null);
                    if (iM8701getOffsetForPosition3MmeM6k$default >= 0) {
                        textFieldSelectionState.textFieldState.placeCursorBeforeCharAt(iM8701getOffsetForPosition3MmeM6k$default);
                    }
                }
            }
        }, new TapOnPosition() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3
            public C09973() {
            }

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3$1 */
            public static final class AnonymousClass1 extends Lambda implements Function0<String> {
                public static final AnonymousClass1 INSTANCE = ;

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "onDoubleTapTextField";
                }
            }

            @Override // androidx.compose.foundation.text2.input.internal.selection.TapOnPosition
            /* renamed from: onEvent-k-4lQ0M */
            public final void mo8723onEventk4lQ0M(long j) {
                TextFieldSelectionStateKt.logDebug(AnonymousClass1.INSTANCE);
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
                int iM8701getOffsetForPosition3MmeM6k$default = TextLayoutState.m8701getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, j, false, 2, null);
                TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
                TextFieldSelectionState.this.textFieldState.m8717selectCharsIn5zctL8(TextFieldSelectionState.m8749updateSelectionQNhciaU$default(textFieldSelectionState, TextFieldCharSequenceKt.m8648TextFieldCharSequence3r_uNRQ$default(textFieldSelectionState.textFieldState.getText(), TextRange.INSTANCE.m13170getZerod9O1mEE(), null, 4, null), iM8701getOffsetForPosition3MmeM6k$default, iM8701getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.INSTANCE.getWord(), false, 32, null));
            }
        }, continuation);
        return objDetectTapAndDoubleTap == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapAndDoubleTap : Unit.INSTANCE;
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7105d2 = {"<anonymous>", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3 */
    public static final class C09973 implements TapOnPosition {
        public C09973() {
        }

        /*  JADX ERROR: Failed to generate init code
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  A[DECLARE_VAR, DONT_GENERATE, MD:():void (m), REMOVE, WRAPPED] call: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3.1.<init>():void type: CONSTRUCTOR in method: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3.1.<clinit>():void, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:547)
            	at jadx.core.codegen.ClassGen.addField(ClassGen.java:453)
            	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:285)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
            Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldTapGestures.3.1
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:813)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
            	... 66 more
            */
        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<String> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "onDoubleTapTextField";
            }
        }

        @Override // androidx.compose.foundation.text2.input.internal.selection.TapOnPosition
        /* renamed from: onEvent-k-4lQ0M */
        public final void mo8723onEventk4lQ0M(long j) {
            TextFieldSelectionStateKt.logDebug(AnonymousClass1.INSTANCE);
            TextFieldSelectionState.this.setShowCursorHandle(false);
            TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            int iM8701getOffsetForPosition3MmeM6k$default = TextLayoutState.m8701getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, j, false, 2, null);
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            TextFieldSelectionState.this.textFieldState.m8717selectCharsIn5zctL8(TextFieldSelectionState.m8749updateSelectionQNhciaU$default(textFieldSelectionState, TextFieldCharSequenceKt.m8648TextFieldCharSequence3r_uNRQ$default(textFieldSelectionState.textFieldState.getText(), TextRange.INSTANCE.m13170getZerod9O1mEE(), null, 4, null), iM8701getOffsetForPosition3MmeM6k$default, iM8701getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.INSTANCE.getWord(), false, 32, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectCursorHandleDragGestures(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) throws Throwable {
        C09811 c09811;
        TextFieldSelectionState textFieldSelectionState;
        Ref.LongRef longRef;
        Throwable th;
        Ref.LongRef longRef2;
        if (continuation instanceof C09811) {
            c09811 = (C09811) continuation;
            int i = c09811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c09811.label = i - Integer.MIN_VALUE;
            } else {
                c09811 = new C09811(continuation);
            }
        }
        C09811 c098112 = c09811;
        Object obj = c098112.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c098112.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef2 = (Ref.LongRef) c098112.L$2;
            longRef = (Ref.LongRef) c098112.L$1;
            textFieldSelectionState = (TextFieldSelectionState) c098112.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                detectCursorHandleDragGestures$onDragStop(longRef, longRef2, textFieldSelectionState);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                detectCursorHandleDragGestures$onDragStop(longRef, longRef2, textFieldSelectionState);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        Ref.LongRef longRef3 = new Ref.LongRef();
        Offset.Companion companion = Offset.INSTANCE;
        longRef3.element = companion.m11114getUnspecifiedF1C5BW0();
        Ref.LongRef longRef4 = new Ref.LongRef();
        longRef4.element = companion.m11114getUnspecifiedF1C5BW0();
        try {
            C09822 c09822 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures.2
                public final /* synthetic */ Ref.LongRef $cursorDragDelta;
                public final /* synthetic */ TextFieldSelectionState this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09822(TextFieldSelectionState this, Ref.LongRef longRef42) {
                    super(1);
                    textFieldSelectionState = this;
                    longRef = longRef42;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m8752invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M */
                public final void m8752invokek4lQ0M(long j) {
                    longRef.element = SelectionHandlesKt.m8564getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.getCursorRect().m11126getBottomCenterF1C5BW0());
                    longRef.element = Offset.INSTANCE.m11115getZeroF1C5BW0();
                    textFieldSelectionState.setInTouchMode(true);
                    textFieldSelectionState.markStartContentVisibleOffset();
                    textFieldSelectionState.m8747updateHandleDraggingUv8p0NA(Handle.Cursor, longRef.element);
                }
            };
            C09833 c09833 = new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures.3
                public final /* synthetic */ Ref.LongRef $cursorDragDelta;
                public final /* synthetic */ TextFieldSelectionState this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09833(Ref.LongRef longRef42, TextFieldSelectionState this) {
                    super(0);
                    longRef = longRef42;
                    textFieldSelectionState = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    TextFieldSelectionState.detectCursorHandleDragGestures$onDragStop(longRef, longRef, textFieldSelectionState);
                }
            };
            C09844 c09844 = new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures.4
                public final /* synthetic */ Ref.LongRef $cursorDragDelta;
                public final /* synthetic */ TextFieldSelectionState this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09844(Ref.LongRef longRef42, TextFieldSelectionState this) {
                    super(0);
                    longRef = longRef42;
                    textFieldSelectionState = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    TextFieldSelectionState.detectCursorHandleDragGestures$onDragStop(longRef, longRef, textFieldSelectionState);
                }
            };
            C09855 c09855 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures.5
                public final /* synthetic */ Ref.LongRef $cursorDragStart;
                public final /* synthetic */ TextFieldSelectionState this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09855(TextFieldSelectionState this, Ref.LongRef longRef32) {
                    super(2);
                    textFieldSelectionState = this;
                    longRef = longRef32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                    m8753invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-Uv8p0NA */
                public final void m8753invokeUv8p0NA(@NotNull PointerInputChange pointerInputChange, long j) {
                    Ref.LongRef longRef5 = longRef;
                    longRef5.element = Offset.m11104plusMKHz9U(longRef5.element, j);
                    textFieldSelectionState.m8747updateHandleDraggingUv8p0NA(Handle.Cursor, Offset.m11104plusMKHz9U(longRef.element, longRef.element));
                    TextLayoutResult layoutResult = textFieldSelectionState.textLayoutState.getLayoutResult();
                    if (layoutResult == null) {
                        return;
                    }
                    long jTextRange = TextRangeKt.TextRange(layoutResult.m13137getOffsetForPositionk4lQ0M(textFieldSelectionState.m8750getHandleDragPositionF1C5BW0()));
                    if (TextRange.m13158equalsimpl0(jTextRange, textFieldSelectionState.textFieldState.getText().getSelectionInChars())) {
                        return;
                    }
                    pointerInputChange.consume();
                    HapticFeedback hapticFeedback = textFieldSelectionState.hapticFeedBack;
                    if (hapticFeedback != null) {
                        hapticFeedback.mo12011performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m12020getTextHandleMove5zf0vsI());
                    }
                    textFieldSelectionState.textFieldState.m8717selectCharsIn5zctL8(jTextRange);
                }
            };
            c098112.L$0 = this;
            c098112.L$1 = longRef32;
            c098112.L$2 = longRef42;
            c098112.label = 1;
            if (DragGestureDetectorKt.detectDragGestures(pointerInputScope, c09822, c09833, c09844, c09855, c098112) == coroutine_suspended) {
                return coroutine_suspended;
            }
            textFieldSelectionState = this;
            longRef = longRef32;
            longRef2 = longRef42;
            detectCursorHandleDragGestures$onDragStop(longRef, longRef2, textFieldSelectionState);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            textFieldSelectionState = this;
            longRef = longRef32;
            th = th3;
            longRef2 = longRef42;
            detectCursorHandleDragGestures$onDragStop(longRef, longRef2, textFieldSelectionState);
            throw th;
        }
    }

    public static final void detectCursorHandleDragGestures$onDragStop(Ref.LongRef longRef, Ref.LongRef longRef2, TextFieldSelectionState textFieldSelectionState) {
        if (OffsetKt.m11118isSpecifiedk4lQ0M(longRef.element)) {
            Offset.Companion companion = Offset.INSTANCE;
            longRef.element = companion.m11114getUnspecifiedF1C5BW0();
            longRef2.element = companion.m11114getUnspecifiedF1C5BW0();
            textFieldSelectionState.clearHandleDragging();
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2 */
    public static final class C09822 extends Lambda implements Function1<Offset, Unit> {
        public final /* synthetic */ Ref.LongRef $cursorDragDelta;
        public final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09822(TextFieldSelectionState this, Ref.LongRef longRef42) {
            super(1);
            textFieldSelectionState = this;
            longRef = longRef42;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m8752invokek4lQ0M(offset.getPackedValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-k-4lQ0M */
        public final void m8752invokek4lQ0M(long j) {
            longRef.element = SelectionHandlesKt.m8564getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.getCursorRect().m11126getBottomCenterF1C5BW0());
            longRef.element = Offset.INSTANCE.m11115getZeroF1C5BW0();
            textFieldSelectionState.setInTouchMode(true);
            textFieldSelectionState.markStartContentVisibleOffset();
            textFieldSelectionState.m8747updateHandleDraggingUv8p0NA(Handle.Cursor, longRef.element);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3 */
    public static final class C09833 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Ref.LongRef $cursorDragDelta;
        public final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09833(Ref.LongRef longRef42, TextFieldSelectionState this) {
            super(0);
            longRef = longRef42;
            textFieldSelectionState = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            TextFieldSelectionState.detectCursorHandleDragGestures$onDragStop(longRef, longRef, textFieldSelectionState);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4 */
    public static final class C09844 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Ref.LongRef $cursorDragDelta;
        public final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09844(Ref.LongRef longRef42, TextFieldSelectionState this) {
            super(0);
            longRef = longRef42;
            textFieldSelectionState = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            TextFieldSelectionState.detectCursorHandleDragGestures$onDragStop(longRef, longRef, textFieldSelectionState);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", Const.FRACTION_CONTROL_CHANGE_RANK_OR_REPRIMAND, "Landroidx/compose/ui/input/pointer/PointerInputChange;", "dragAmount", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5 */
    public static final class C09855 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {
        public final /* synthetic */ Ref.LongRef $cursorDragStart;
        public final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09855(TextFieldSelectionState this, Ref.LongRef longRef32) {
            super(2);
            textFieldSelectionState = this;
            longRef = longRef32;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
            m8753invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-Uv8p0NA */
        public final void m8753invokeUv8p0NA(@NotNull PointerInputChange pointerInputChange, long j) {
            Ref.LongRef longRef5 = longRef;
            longRef5.element = Offset.m11104plusMKHz9U(longRef5.element, j);
            textFieldSelectionState.m8747updateHandleDraggingUv8p0NA(Handle.Cursor, Offset.m11104plusMKHz9U(longRef.element, longRef.element));
            TextLayoutResult layoutResult = textFieldSelectionState.textLayoutState.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            long jTextRange = TextRangeKt.TextRange(layoutResult.m13137getOffsetForPositionk4lQ0M(textFieldSelectionState.m8750getHandleDragPositionF1C5BW0()));
            if (TextRange.m13158equalsimpl0(jTextRange, textFieldSelectionState.textFieldState.getText().getSelectionInChars())) {
                return;
            }
            pointerInputChange.consume();
            HapticFeedback hapticFeedback = textFieldSelectionState.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo12011performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m12020getTextHandleMove5zf0vsI());
            }
            textFieldSelectionState.textFieldState.m8717selectCharsIn5zctL8(jTextRange);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.compose.foundation.text.Handle] */
    public final Object detectTextFieldLongPressAndAfterDrag(PointerInputScope pointerInputScope, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        Ref.LongRef longRef = new Ref.LongRef();
        Offset.Companion companion = Offset.INSTANCE;
        longRef.element = companion.m11114getUnspecifiedF1C5BW0();
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = companion.m11115getZeroF1C5BW0();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Handle.SelectionEnd;
        Object objDetectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag.2
            public final /* synthetic */ Ref.ObjectRef<Handle> $actingHandle;
            public final /* synthetic */ Ref.IntRef $dragBeginOffsetInText;
            public final /* synthetic */ Ref.LongRef $dragBeginPosition;
            public final /* synthetic */ Ref.LongRef $dragTotalDistance;
            public final /* synthetic */ Function0<Unit> $requestFocus;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09922(Function0<Unit> function02, TextFieldSelectionState this, Ref.ObjectRef<Handle> objectRef2, Ref.LongRef longRef3, Ref.LongRef longRef22, Ref.IntRef intRef2) {
                super(1);
                function0 = function02;
                textFieldSelectionState = this;
                objectRef = objectRef2;
                longRef = longRef3;
                longRef = longRef22;
                intRef = intRef2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m8756invokek4lQ0M(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2$1 */
            public static final class AnonymousClass1 extends Lambda implements Function0<String> {
                public final /* synthetic */ long $dragStartOffset;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(long j) {
                    super(0);
                    j = j;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "onDragStart after longPress " + ((Object) Offset.m11107toStringimpl(j));
                }
            }

            /* renamed from: invoke-k-4lQ0M */
            public final void m8756invokek4lQ0M(long j) {
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag.2.1
                    public final /* synthetic */ long $dragStartOffset;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(long j2) {
                        super(0);
                        j = j2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "onDragStart after longPress " + ((Object) Offset.m11107toStringimpl(j));
                    }
                });
                function0.invoke();
                textFieldSelectionState.m8747updateHandleDraggingUv8p0NA(objectRef.element, j2);
                longRef.element = j2;
                longRef.element = Offset.INSTANCE.m11115getZeroF1C5BW0();
                textFieldSelectionState.previousRawDragOffset = -1;
                if (!textFieldSelectionState.textLayoutState.m8704isPositionOnTextk4lQ0M(j2)) {
                    int iM8701getOffsetForPosition3MmeM6k$default = TextLayoutState.m8701getOffsetForPosition3MmeM6k$default(textFieldSelectionState.textLayoutState, j2, false, 2, null);
                    HapticFeedback hapticFeedback = textFieldSelectionState.hapticFeedBack;
                    if (hapticFeedback != null) {
                        hapticFeedback.mo12011performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m12020getTextHandleMove5zf0vsI());
                    }
                    textFieldSelectionState.textFieldState.placeCursorBeforeCharAt(iM8701getOffsetForPosition3MmeM6k$default);
                    textFieldSelectionState.setShowCursorHandle(true);
                    textFieldSelectionState.updateTextToolbarState(TextToolbarState.Cursor);
                    return;
                }
                if (textFieldSelectionState.textFieldState.getText().length() == 0) {
                    return;
                }
                int iM8701getOffsetForPosition3MmeM6k$default2 = TextLayoutState.m8701getOffsetForPosition3MmeM6k$default(textFieldSelectionState.textLayoutState, j2, false, 2, null);
                TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                long jM8749updateSelectionQNhciaU$default = TextFieldSelectionState.m8749updateSelectionQNhciaU$default(textFieldSelectionState, TextFieldCharSequenceKt.m8648TextFieldCharSequence3r_uNRQ$default(textFieldSelectionState.textFieldState.getText(), TextRange.INSTANCE.m13170getZerod9O1mEE(), null, 4, null), iM8701getOffsetForPosition3MmeM6k$default2, iM8701getOffsetForPosition3MmeM6k$default2, false, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), false, 32, null);
                textFieldSelectionState.textFieldState.m8717selectCharsIn5zctL8(jM8749updateSelectionQNhciaU$default);
                textFieldSelectionState.updateTextToolbarState(TextToolbarState.Selection);
                intRef.element = TextRange.m13165getStartimpl(jM8749updateSelectionQNhciaU$default);
            }
        }, new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag.3
            public final /* synthetic */ Ref.IntRef $dragBeginOffsetInText;
            public final /* synthetic */ Ref.LongRef $dragTotalDistance;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09933(TextFieldSelectionState this, Ref.IntRef intRef2, Ref.LongRef longRef22) {
                super(0);
                textFieldSelectionState = this;
                intRef = intRef2;
                longRef = longRef22;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag$onDragStop$1(longRef, textFieldSelectionState, intRef, longRef);
            }
        }, new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag.4
            public final /* synthetic */ Ref.IntRef $dragBeginOffsetInText;
            public final /* synthetic */ Ref.LongRef $dragTotalDistance;
            public final /* synthetic */ TextFieldSelectionState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09944(TextFieldSelectionState this, Ref.IntRef intRef2, Ref.LongRef longRef22) {
                super(0);
                textFieldSelectionState = this;
                intRef = intRef2;
                longRef = longRef22;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag$onDragStop$1(longRef, textFieldSelectionState, intRef, longRef);
            }
        }, new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag.5
            public final /* synthetic */ Ref.ObjectRef<Handle> $actingHandle;
            public final /* synthetic */ Ref.IntRef $dragBeginOffsetInText;
            public final /* synthetic */ Ref.LongRef $dragBeginPosition;
            public final /* synthetic */ Ref.LongRef $dragTotalDistance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09955(Ref.LongRef longRef22, Ref.LongRef longRef3, Ref.IntRef intRef2, Ref.ObjectRef<Handle> objectRef2) {
                super(2);
                longRef = longRef22;
                longRef = longRef3;
                intRef = intRef2;
                objectRef = objectRef2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                m8757invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke-Uv8p0NA */
            public final void m8757invokeUv8p0NA(@NotNull PointerInputChange pointerInputChange, long j) {
                int iIntValue;
                int iM8703getOffsetForPosition3MmeM6k;
                SelectionAdjustment word;
                T t;
                if (TextFieldSelectionState.this.textFieldState.getText().length() == 0) {
                    return;
                }
                Ref.LongRef longRef3 = longRef;
                longRef3.element = Offset.m11104plusMKHz9U(longRef3.element, j);
                long jM11104plusMKHz9U = Offset.m11104plusMKHz9U(longRef.element, longRef.element);
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag.5.1
                    public final /* synthetic */ long $currentDragPosition;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(long jM11104plusMKHz9U2) {
                        super(0);
                        j = jM11104plusMKHz9U2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "onDrag after longPress " + ((Object) Offset.m11107toStringimpl(j));
                    }
                });
                if (intRef.element < 0 && !TextFieldSelectionState.this.textLayoutState.m8704isPositionOnTextk4lQ0M(jM11104plusMKHz9U2)) {
                    iIntValue = TextLayoutState.m8701getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, longRef.element, false, 2, null);
                    iM8703getOffsetForPosition3MmeM6k = TextLayoutState.m8701getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, jM11104plusMKHz9U2, false, 2, null);
                    if (iIntValue == iM8703getOffsetForPosition3MmeM6k) {
                        word = SelectionAdjustment.INSTANCE.getNone();
                    } else {
                        word = SelectionAdjustment.INSTANCE.getWord();
                    }
                } else {
                    Integer numValueOf = Integer.valueOf(intRef.element);
                    if (numValueOf.intValue() < 0) {
                        numValueOf = null;
                    }
                    iIntValue = numValueOf != null ? numValueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m8703getOffsetForPosition3MmeM6k(longRef.element, false);
                    iM8703getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m8703getOffsetForPosition3MmeM6k(jM11104plusMKHz9U2, false);
                    if (intRef.element < 0 && iIntValue == iM8703getOffsetForPosition3MmeM6k) {
                        return;
                    } else {
                        word = SelectionAdjustment.INSTANCE.getWord();
                    }
                }
                int i = iIntValue;
                int i2 = iM8703getOffsetForPosition3MmeM6k;
                SelectionAdjustment selectionAdjustment = word;
                long selectionInChars = TextFieldSelectionState.this.textFieldState.getText().getSelectionInChars();
                TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
                long jM8748updateSelectionQNhciaU = textFieldSelectionState.m8748updateSelectionQNhciaU(textFieldSelectionState.textFieldState.getText(), i, i2, false, selectionAdjustment, false);
                if (TextRange.m13164getReversedimpl(jM8748updateSelectionQNhciaU)) {
                    jM8748updateSelectionQNhciaU = TextFieldSelectionStateKt.m8759reverse5zctL8(jM8748updateSelectionQNhciaU);
                }
                if (intRef.element == -1 && !TextRange.m13159getCollapsedimpl(jM8748updateSelectionQNhciaU)) {
                    intRef.element = TextRange.m13165getStartimpl(jM8748updateSelectionQNhciaU);
                }
                if (!TextRange.m13158equalsimpl0(jM8748updateSelectionQNhciaU, selectionInChars)) {
                    Ref.ObjectRef<Handle> objectRef2 = objectRef;
                    if (TextRange.m13165getStartimpl(jM8748updateSelectionQNhciaU) != TextRange.m13165getStartimpl(selectionInChars) && TextRange.m13160getEndimpl(jM8748updateSelectionQNhciaU) == TextRange.m13160getEndimpl(selectionInChars)) {
                        t = Handle.SelectionStart;
                    } else if ((TextRange.m13165getStartimpl(jM8748updateSelectionQNhciaU) == TextRange.m13165getStartimpl(selectionInChars) && TextRange.m13160getEndimpl(jM8748updateSelectionQNhciaU) != TextRange.m13160getEndimpl(selectionInChars)) || (TextRange.m13165getStartimpl(jM8748updateSelectionQNhciaU) + TextRange.m13160getEndimpl(jM8748updateSelectionQNhciaU)) / 2.0f > (TextRange.m13165getStartimpl(selectionInChars) + TextRange.m13160getEndimpl(selectionInChars)) / 2.0f) {
                        t = Handle.SelectionEnd;
                    } else {
                        t = Handle.SelectionStart;
                    }
                    objectRef2.element = t;
                }
                if (TextRange.m13159getCollapsedimpl(selectionInChars) || !TextRange.m13159getCollapsedimpl(jM8748updateSelectionQNhciaU)) {
                    TextFieldSelectionState.this.textFieldState.m8717selectCharsIn5zctL8(jM8748updateSelectionQNhciaU);
                }
                TextFieldSelectionState.this.m8747updateHandleDraggingUv8p0NA(objectRef.element, jM11104plusMKHz9U2);
            }

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5$1 */
            public static final class AnonymousClass1 extends Lambda implements Function0<String> {
                public final /* synthetic */ long $currentDragPosition;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(long jM11104plusMKHz9U2) {
                    super(0);
                    j = jM11104plusMKHz9U2;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "onDrag after longPress " + ((Object) Offset.m11107toStringimpl(j));
                }
            }
        }, continuation);
        return objDetectDragGesturesAfterLongPress == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGesturesAfterLongPress : Unit.INSTANCE;
    }

    public static final void detectTextFieldLongPressAndAfterDrag$onDragStop$1(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.IntRef intRef, Ref.LongRef longRef2) {
        if (OffsetKt.m11118isSpecifiedk4lQ0M(longRef.element)) {
            textFieldSelectionState.clearHandleDragging();
            intRef.element = -1;
            Offset.Companion companion = Offset.INSTANCE;
            longRef.element = companion.m11114getUnspecifiedF1C5BW0();
            longRef2.element = companion.m11115getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "dragStartOffset", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2 */
    public static final class C09922 extends Lambda implements Function1<Offset, Unit> {
        public final /* synthetic */ Ref.ObjectRef<Handle> $actingHandle;
        public final /* synthetic */ Ref.IntRef $dragBeginOffsetInText;
        public final /* synthetic */ Ref.LongRef $dragBeginPosition;
        public final /* synthetic */ Ref.LongRef $dragTotalDistance;
        public final /* synthetic */ Function0<Unit> $requestFocus;
        public final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09922(Function0<Unit> function02, TextFieldSelectionState this, Ref.ObjectRef<Handle> objectRef2, Ref.LongRef longRef3, Ref.LongRef longRef22, Ref.IntRef intRef2) {
            super(1);
            function0 = function02;
            textFieldSelectionState = this;
            objectRef = objectRef2;
            longRef = longRef3;
            longRef = longRef22;
            intRef = intRef2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m8756invokek4lQ0M(offset.getPackedValue());
            return Unit.INSTANCE;
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<String> {
            public final /* synthetic */ long $dragStartOffset;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(long j2) {
                super(0);
                j = j2;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "onDragStart after longPress " + ((Object) Offset.m11107toStringimpl(j));
            }
        }

        /* renamed from: invoke-k-4lQ0M */
        public final void m8756invokek4lQ0M(long j2) {
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag.2.1
                public final /* synthetic */ long $dragStartOffset;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(long j22) {
                    super(0);
                    j = j22;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "onDragStart after longPress " + ((Object) Offset.m11107toStringimpl(j));
                }
            });
            function0.invoke();
            textFieldSelectionState.m8747updateHandleDraggingUv8p0NA(objectRef.element, j22);
            longRef.element = j22;
            longRef.element = Offset.INSTANCE.m11115getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
            if (!textFieldSelectionState.textLayoutState.m8704isPositionOnTextk4lQ0M(j22)) {
                int iM8701getOffsetForPosition3MmeM6k$default = TextLayoutState.m8701getOffsetForPosition3MmeM6k$default(textFieldSelectionState.textLayoutState, j22, false, 2, null);
                HapticFeedback hapticFeedback = textFieldSelectionState.hapticFeedBack;
                if (hapticFeedback != null) {
                    hapticFeedback.mo12011performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m12020getTextHandleMove5zf0vsI());
                }
                textFieldSelectionState.textFieldState.placeCursorBeforeCharAt(iM8701getOffsetForPosition3MmeM6k$default);
                textFieldSelectionState.setShowCursorHandle(true);
                textFieldSelectionState.updateTextToolbarState(TextToolbarState.Cursor);
                return;
            }
            if (textFieldSelectionState.textFieldState.getText().length() == 0) {
                return;
            }
            int iM8701getOffsetForPosition3MmeM6k$default2 = TextLayoutState.m8701getOffsetForPosition3MmeM6k$default(textFieldSelectionState.textLayoutState, j22, false, 2, null);
            TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
            long jM8749updateSelectionQNhciaU$default = TextFieldSelectionState.m8749updateSelectionQNhciaU$default(textFieldSelectionState, TextFieldCharSequenceKt.m8648TextFieldCharSequence3r_uNRQ$default(textFieldSelectionState.textFieldState.getText(), TextRange.INSTANCE.m13170getZerod9O1mEE(), null, 4, null), iM8701getOffsetForPosition3MmeM6k$default2, iM8701getOffsetForPosition3MmeM6k$default2, false, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), false, 32, null);
            textFieldSelectionState.textFieldState.m8717selectCharsIn5zctL8(jM8749updateSelectionQNhciaU$default);
            textFieldSelectionState.updateTextToolbarState(TextToolbarState.Selection);
            intRef.element = TextRange.m13165getStartimpl(jM8749updateSelectionQNhciaU$default);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$3 */
    public static final class C09933 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Ref.IntRef $dragBeginOffsetInText;
        public final /* synthetic */ Ref.LongRef $dragTotalDistance;
        public final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09933(TextFieldSelectionState this, Ref.IntRef intRef2, Ref.LongRef longRef22) {
            super(0);
            textFieldSelectionState = this;
            intRef = intRef2;
            longRef = longRef22;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag$onDragStop$1(longRef, textFieldSelectionState, intRef, longRef);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$4 */
    public static final class C09944 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Ref.IntRef $dragBeginOffsetInText;
        public final /* synthetic */ Ref.LongRef $dragTotalDistance;
        public final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09944(TextFieldSelectionState this, Ref.IntRef intRef2, Ref.LongRef longRef22) {
            super(0);
            textFieldSelectionState = this;
            intRef = intRef2;
            longRef = longRef22;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag$onDragStop$1(longRef, textFieldSelectionState, intRef, longRef);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "dragAmount", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n1#2:1236\n*E\n"})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5 */
    public static final class C09955 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {
        public final /* synthetic */ Ref.ObjectRef<Handle> $actingHandle;
        public final /* synthetic */ Ref.IntRef $dragBeginOffsetInText;
        public final /* synthetic */ Ref.LongRef $dragBeginPosition;
        public final /* synthetic */ Ref.LongRef $dragTotalDistance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09955(Ref.LongRef longRef22, Ref.LongRef longRef3, Ref.IntRef intRef2, Ref.ObjectRef<Handle> objectRef2) {
            super(2);
            longRef = longRef22;
            longRef = longRef3;
            intRef = intRef2;
            objectRef = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
            m8757invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-Uv8p0NA */
        public final void m8757invokeUv8p0NA(@NotNull PointerInputChange pointerInputChange, long j) {
            int iIntValue;
            int iM8703getOffsetForPosition3MmeM6k;
            SelectionAdjustment word;
            T t;
            if (TextFieldSelectionState.this.textFieldState.getText().length() == 0) {
                return;
            }
            Ref.LongRef longRef3 = longRef;
            longRef3.element = Offset.m11104plusMKHz9U(longRef3.element, j);
            long jM11104plusMKHz9U2 = Offset.m11104plusMKHz9U(longRef.element, longRef.element);
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag.5.1
                public final /* synthetic */ long $currentDragPosition;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(long jM11104plusMKHz9U22) {
                    super(0);
                    j = jM11104plusMKHz9U22;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "onDrag after longPress " + ((Object) Offset.m11107toStringimpl(j));
                }
            });
            if (intRef.element < 0 && !TextFieldSelectionState.this.textLayoutState.m8704isPositionOnTextk4lQ0M(jM11104plusMKHz9U22)) {
                iIntValue = TextLayoutState.m8701getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, longRef.element, false, 2, null);
                iM8703getOffsetForPosition3MmeM6k = TextLayoutState.m8701getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, jM11104plusMKHz9U22, false, 2, null);
                if (iIntValue == iM8703getOffsetForPosition3MmeM6k) {
                    word = SelectionAdjustment.INSTANCE.getNone();
                } else {
                    word = SelectionAdjustment.INSTANCE.getWord();
                }
            } else {
                Integer numValueOf = Integer.valueOf(intRef.element);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m8703getOffsetForPosition3MmeM6k(longRef.element, false);
                iM8703getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m8703getOffsetForPosition3MmeM6k(jM11104plusMKHz9U22, false);
                if (intRef.element < 0 && iIntValue == iM8703getOffsetForPosition3MmeM6k) {
                    return;
                } else {
                    word = SelectionAdjustment.INSTANCE.getWord();
                }
            }
            int i = iIntValue;
            int i2 = iM8703getOffsetForPosition3MmeM6k;
            SelectionAdjustment selectionAdjustment = word;
            long selectionInChars = TextFieldSelectionState.this.textFieldState.getText().getSelectionInChars();
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long jM8748updateSelectionQNhciaU = textFieldSelectionState.m8748updateSelectionQNhciaU(textFieldSelectionState.textFieldState.getText(), i, i2, false, selectionAdjustment, false);
            if (TextRange.m13164getReversedimpl(jM8748updateSelectionQNhciaU)) {
                jM8748updateSelectionQNhciaU = TextFieldSelectionStateKt.m8759reverse5zctL8(jM8748updateSelectionQNhciaU);
            }
            if (intRef.element == -1 && !TextRange.m13159getCollapsedimpl(jM8748updateSelectionQNhciaU)) {
                intRef.element = TextRange.m13165getStartimpl(jM8748updateSelectionQNhciaU);
            }
            if (!TextRange.m13158equalsimpl0(jM8748updateSelectionQNhciaU, selectionInChars)) {
                Ref.ObjectRef<Handle> objectRef2 = objectRef;
                if (TextRange.m13165getStartimpl(jM8748updateSelectionQNhciaU) != TextRange.m13165getStartimpl(selectionInChars) && TextRange.m13160getEndimpl(jM8748updateSelectionQNhciaU) == TextRange.m13160getEndimpl(selectionInChars)) {
                    t = Handle.SelectionStart;
                } else if ((TextRange.m13165getStartimpl(jM8748updateSelectionQNhciaU) == TextRange.m13165getStartimpl(selectionInChars) && TextRange.m13160getEndimpl(jM8748updateSelectionQNhciaU) != TextRange.m13160getEndimpl(selectionInChars)) || (TextRange.m13165getStartimpl(jM8748updateSelectionQNhciaU) + TextRange.m13160getEndimpl(jM8748updateSelectionQNhciaU)) / 2.0f > (TextRange.m13165getStartimpl(selectionInChars) + TextRange.m13160getEndimpl(selectionInChars)) / 2.0f) {
                    t = Handle.SelectionEnd;
                } else {
                    t = Handle.SelectionStart;
                }
                objectRef2.element = t;
            }
            if (TextRange.m13159getCollapsedimpl(selectionInChars) || !TextRange.m13159getCollapsedimpl(jM8748updateSelectionQNhciaU)) {
                TextFieldSelectionState.this.textFieldState.m8717selectCharsIn5zctL8(jM8748updateSelectionQNhciaU);
            }
            TextFieldSelectionState.this.m8747updateHandleDraggingUv8p0NA(objectRef.element, jM11104plusMKHz9U22);
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<String> {
            public final /* synthetic */ long $currentDragPosition;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(long jM11104plusMKHz9U22) {
                super(0);
                j = jM11104plusMKHz9U22;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "onDrag after longPress " + ((Object) Offset.m11107toStringimpl(j));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectSelectionHandleDragGestures(PointerInputScope pointerInputScope, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        C09861 c09861;
        Handle handle;
        Ref.LongRef longRef;
        TextFieldSelectionState textFieldSelectionState;
        Ref.LongRef longRef2;
        C09872 c09872;
        C09883 c09883;
        C09894 c09894;
        C09905 c09905;
        if (continuation instanceof C09861) {
            c09861 = (C09861) continuation;
            int i = c09861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c09861.label = i - Integer.MIN_VALUE;
            } else {
                c09861 = new C09861(continuation);
            }
        }
        C09861 c098612 = c09861;
        Object obj = c098612.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c098612.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            handle = (Handle) c098612.L$3;
            longRef = (Ref.LongRef) c098612.L$2;
            longRef2 = (Ref.LongRef) c098612.L$1;
            textFieldSelectionState = (TextFieldSelectionState) c098612.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures.6
                    public final /* synthetic */ Handle $handle;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C09916(Handle handle2) {
                        super(0);
                        handle = handle2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Selection Handle drag cancelled for draggingHandle: " + TextFieldSelectionState.this.getDraggingHandle() + " definedOn: " + handle;
                    }
                });
                if (textFieldSelectionState.getDraggingHandle() == handle2) {
                    detectSelectionHandleDragGestures$onDragStop$2(longRef2, textFieldSelectionState, longRef);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures.6
                    public final /* synthetic */ Handle $handle;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C09916(Handle handle2) {
                        super(0);
                        handle = handle2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Selection Handle drag cancelled for draggingHandle: " + TextFieldSelectionState.this.getDraggingHandle() + " definedOn: " + handle;
                    }
                });
                if (textFieldSelectionState.getDraggingHandle() == handle2) {
                    detectSelectionHandleDragGestures$onDragStop$2(longRef2, textFieldSelectionState, longRef);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        Ref.LongRef longRef3 = new Ref.LongRef();
        Offset.Companion companion = Offset.INSTANCE;
        longRef3.element = companion.m11114getUnspecifiedF1C5BW0();
        Ref.LongRef longRef4 = new Ref.LongRef();
        longRef4.element = companion.m11115getZeroF1C5BW0();
        Handle handle2 = z ? Handle.SelectionStart : Handle.SelectionEnd;
        try {
            c09872 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures.2
                public final /* synthetic */ Ref.LongRef $dragTotalDistance;
                public final /* synthetic */ Handle $handle;
                public final /* synthetic */ boolean $isStartHandle;
                public final /* synthetic */ TextFieldSelectionState this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09872(TextFieldSelectionState this, boolean z2, Handle handle22, Ref.LongRef longRef42) {
                    super(1);
                    textFieldSelectionState = this;
                    z = z2;
                    handle = handle22;
                    longRef = longRef42;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m8754invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M */
                public final void m8754invokek4lQ0M(long j) {
                    longRef.element = SelectionHandlesKt.m8564getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.m8741getHandlePositiontuRUvjQ(z));
                    textFieldSelectionState.m8747updateHandleDraggingUv8p0NA(handle, longRef.element);
                    longRef.element = Offset.INSTANCE.m11115getZeroF1C5BW0();
                    textFieldSelectionState.previousRawDragOffset = -1;
                }
            };
            c09883 = new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures.3
                public final /* synthetic */ Ref.LongRef $dragTotalDistance;
                public final /* synthetic */ TextFieldSelectionState this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09883(TextFieldSelectionState this, Ref.LongRef longRef42) {
                    super(0);
                    textFieldSelectionState = this;
                    longRef = longRef42;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    TextFieldSelectionState.detectSelectionHandleDragGestures$onDragStop$2(longRef, textFieldSelectionState, longRef);
                }
            };
            c09894 = new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures.4
                public final /* synthetic */ Ref.LongRef $dragTotalDistance;
                public final /* synthetic */ TextFieldSelectionState this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09894(TextFieldSelectionState this, Ref.LongRef longRef42) {
                    super(0);
                    textFieldSelectionState = this;
                    longRef = longRef42;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    TextFieldSelectionState.detectSelectionHandleDragGestures$onDragStop$2(longRef, textFieldSelectionState, longRef);
                }
            };
            c09905 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures.5
                public final /* synthetic */ Ref.LongRef $dragBeginPosition;
                public final /* synthetic */ Handle $handle;
                public final /* synthetic */ boolean $isStartHandle;
                public final /* synthetic */ TextFieldSelectionState this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09905(TextFieldSelectionState this, Handle handle22, Ref.LongRef longRef32, boolean z2) {
                    super(2);
                    textFieldSelectionState = this;
                    handle = handle22;
                    longRef = longRef32;
                    z = z2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                    m8755invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-Uv8p0NA */
                public final void m8755invokeUv8p0NA(@NotNull PointerInputChange pointerInputChange, long j) {
                    int iM13165getStartimpl;
                    int iM13137getOffsetForPositionk4lQ0M;
                    Ref.LongRef longRef5 = longRef;
                    longRef5.element = Offset.m11104plusMKHz9U(longRef5.element, j);
                    TextLayoutResult layoutResult = textFieldSelectionState.textLayoutState.getLayoutResult();
                    if (layoutResult == null) {
                        return;
                    }
                    textFieldSelectionState.m8747updateHandleDraggingUv8p0NA(handle, Offset.m11104plusMKHz9U(longRef.element, longRef.element));
                    if (!z) {
                        iM13165getStartimpl = TextRange.m13165getStartimpl(textFieldSelectionState.textFieldState.getText().getSelectionInChars());
                    } else {
                        iM13165getStartimpl = layoutResult.m13137getOffsetForPositionk4lQ0M(textFieldSelectionState.m8750getHandleDragPositionF1C5BW0());
                    }
                    int i3 = iM13165getStartimpl;
                    if (z) {
                        iM13137getOffsetForPositionk4lQ0M = TextRange.m13160getEndimpl(textFieldSelectionState.textFieldState.getText().getSelectionInChars());
                    } else {
                        iM13137getOffsetForPositionk4lQ0M = layoutResult.m13137getOffsetForPositionk4lQ0M(textFieldSelectionState.m8750getHandleDragPositionF1C5BW0());
                    }
                    int i4 = iM13137getOffsetForPositionk4lQ0M;
                    long selectionInChars = textFieldSelectionState.textFieldState.getText().getSelectionInChars();
                    TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                    long jM8749updateSelectionQNhciaU$default = TextFieldSelectionState.m8749updateSelectionQNhciaU$default(textFieldSelectionState2, textFieldSelectionState2.textFieldState.getText(), i3, i4, z, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), false, 32, null);
                    if (TextRange.m13159getCollapsedimpl(selectionInChars) || !TextRange.m13159getCollapsedimpl(jM8749updateSelectionQNhciaU$default)) {
                        textFieldSelectionState.textFieldState.m8717selectCharsIn5zctL8(jM8749updateSelectionQNhciaU$default);
                    }
                }
            };
            c098612.L$0 = this;
            c098612.L$1 = longRef32;
            c098612.L$2 = longRef42;
            c098612.L$3 = handle22;
            c098612.label = 1;
            handle2 = handle22;
            longRef = longRef42;
        } catch (Throwable th2) {
            th = th2;
            handle2 = handle22;
            longRef = longRef42;
        }
        try {
            if (DragGestureDetectorKt.detectDragGestures(pointerInputScope, c09872, c09883, c09894, c09905, c098612) == coroutine_suspended) {
                return coroutine_suspended;
            }
            textFieldSelectionState = this;
            longRef2 = longRef32;
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures.6
                public final /* synthetic */ Handle $handle;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09916(Handle handle22) {
                    super(0);
                    handle = handle22;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Selection Handle drag cancelled for draggingHandle: " + TextFieldSelectionState.this.getDraggingHandle() + " definedOn: " + handle;
                }
            });
            if (textFieldSelectionState.getDraggingHandle() == handle22) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            textFieldSelectionState = this;
            longRef2 = longRef32;
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures.6
                public final /* synthetic */ Handle $handle;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09916(Handle handle22) {
                    super(0);
                    handle = handle22;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Selection Handle drag cancelled for draggingHandle: " + TextFieldSelectionState.this.getDraggingHandle() + " definedOn: " + handle;
                }
            });
            if (textFieldSelectionState.getDraggingHandle() == handle22) {
            }
            throw th;
        }
    }

    public static final void detectSelectionHandleDragGestures$onDragStop$2(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2) {
        if (OffsetKt.m11118isSpecifiedk4lQ0M(longRef.element)) {
            textFieldSelectionState.clearHandleDragging();
            Offset.Companion companion = Offset.INSTANCE;
            longRef.element = companion.m11114getUnspecifiedF1C5BW0();
            longRef2.element = companion.m11115getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$2 */
    public static final class C09872 extends Lambda implements Function1<Offset, Unit> {
        public final /* synthetic */ Ref.LongRef $dragTotalDistance;
        public final /* synthetic */ Handle $handle;
        public final /* synthetic */ boolean $isStartHandle;
        public final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09872(TextFieldSelectionState this, boolean z2, Handle handle22, Ref.LongRef longRef42) {
            super(1);
            textFieldSelectionState = this;
            z = z2;
            handle = handle22;
            longRef = longRef42;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m8754invokek4lQ0M(offset.getPackedValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-k-4lQ0M */
        public final void m8754invokek4lQ0M(long j) {
            longRef.element = SelectionHandlesKt.m8564getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.m8741getHandlePositiontuRUvjQ(z));
            textFieldSelectionState.m8747updateHandleDraggingUv8p0NA(handle, longRef.element);
            longRef.element = Offset.INSTANCE.m11115getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$3 */
    public static final class C09883 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Ref.LongRef $dragTotalDistance;
        public final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09883(TextFieldSelectionState this, Ref.LongRef longRef42) {
            super(0);
            textFieldSelectionState = this;
            longRef = longRef42;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            TextFieldSelectionState.detectSelectionHandleDragGestures$onDragStop$2(longRef, textFieldSelectionState, longRef);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$4 */
    public static final class C09894 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Ref.LongRef $dragTotalDistance;
        public final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09894(TextFieldSelectionState this, Ref.LongRef longRef42) {
            super(0);
            textFieldSelectionState = this;
            longRef = longRef42;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            TextFieldSelectionState.detectSelectionHandleDragGestures$onDragStop$2(longRef, textFieldSelectionState, longRef);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "delta", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$5 */
    public static final class C09905 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {
        public final /* synthetic */ Ref.LongRef $dragBeginPosition;
        public final /* synthetic */ Handle $handle;
        public final /* synthetic */ boolean $isStartHandle;
        public final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09905(TextFieldSelectionState this, Handle handle22, Ref.LongRef longRef32, boolean z2) {
            super(2);
            textFieldSelectionState = this;
            handle = handle22;
            longRef = longRef32;
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
            m8755invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-Uv8p0NA */
        public final void m8755invokeUv8p0NA(@NotNull PointerInputChange pointerInputChange, long j) {
            int iM13165getStartimpl;
            int iM13137getOffsetForPositionk4lQ0M;
            Ref.LongRef longRef5 = longRef;
            longRef5.element = Offset.m11104plusMKHz9U(longRef5.element, j);
            TextLayoutResult layoutResult = textFieldSelectionState.textLayoutState.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            textFieldSelectionState.m8747updateHandleDraggingUv8p0NA(handle, Offset.m11104plusMKHz9U(longRef.element, longRef.element));
            if (!z) {
                iM13165getStartimpl = TextRange.m13165getStartimpl(textFieldSelectionState.textFieldState.getText().getSelectionInChars());
            } else {
                iM13165getStartimpl = layoutResult.m13137getOffsetForPositionk4lQ0M(textFieldSelectionState.m8750getHandleDragPositionF1C5BW0());
            }
            int i3 = iM13165getStartimpl;
            if (z) {
                iM13137getOffsetForPositionk4lQ0M = TextRange.m13160getEndimpl(textFieldSelectionState.textFieldState.getText().getSelectionInChars());
            } else {
                iM13137getOffsetForPositionk4lQ0M = layoutResult.m13137getOffsetForPositionk4lQ0M(textFieldSelectionState.m8750getHandleDragPositionF1C5BW0());
            }
            int i4 = iM13137getOffsetForPositionk4lQ0M;
            long selectionInChars = textFieldSelectionState.textFieldState.getText().getSelectionInChars();
            TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
            long jM8749updateSelectionQNhciaU$default = TextFieldSelectionState.m8749updateSelectionQNhciaU$default(textFieldSelectionState2, textFieldSelectionState2.textFieldState.getText(), i3, i4, z, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), false, 32, null);
            if (TextRange.m13159getCollapsedimpl(selectionInChars) || !TextRange.m13159getCollapsedimpl(jM8749updateSelectionQNhciaU$default)) {
                textFieldSelectionState.textFieldState.m8717selectCharsIn5zctL8(jM8749updateSelectionQNhciaU$default);
            }
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6 */
    public static final class C09916 extends Lambda implements Function0<String> {
        public final /* synthetic */ Handle $handle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09916(Handle handle22) {
            super(0);
            handle = handle22;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Selection Handle drag cancelled for draggingHandle: " + TextFieldSelectionState.this.getDraggingHandle() + " definedOn: " + handle;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextChanges$2 */
    public static final class C10012 extends Lambda implements Function0<TextFieldCharSequence> {
        public C10012() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final TextFieldCharSequence invoke() {
            return TextFieldSelectionState.this.textFieldState.getText();
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextChanges$3 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10023 extends FunctionReferenceImpl implements Function2<TextFieldCharSequence, CharSequence, Boolean> {
        public static final C10023 INSTANCE = new C10023();

        public C10023() {
            super(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final Boolean invoke(@NotNull TextFieldCharSequence textFieldCharSequence, @NotNull CharSequence charSequence) {
            return Boolean.valueOf(textFieldCharSequence.contentEquals(charSequence));
        }
    }

    public final Object observeTextChanges(Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.drop(FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0<TextFieldCharSequence>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.observeTextChanges.2
            public C10012() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TextFieldCharSequence invoke() {
                return TextFieldSelectionState.this.textFieldState.getText();
            }
        }), C10023.INSTANCE), 1).collect(new FlowCollector() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.observeTextChanges.4
            public C10034() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((TextFieldCharSequence) obj, (Continuation<? super Unit>) continuation2);
            }

            @Nullable
            public final Object emit(@NotNull TextFieldCharSequence textFieldCharSequence, @NotNull Continuation<? super Unit> continuation2) {
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.None);
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "emit", "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextChanges$4 */
    public static final class C10034<T> implements FlowCollector {
        public C10034() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
            return emit((TextFieldCharSequence) obj, (Continuation<? super Unit>) continuation2);
        }

        @Nullable
        public final Object emit(@NotNull TextFieldCharSequence textFieldCharSequence, @NotNull Continuation<? super Unit> continuation2) {
            TextFieldSelectionState.this.setShowCursorHandle(false);
            TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.None);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextToolbarVisibility$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n1#2:1236\n*E\n"})
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$2 */
    public static final class C10042 extends Lambda implements Function0<Rect> {
        public C10042() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Rect invoke() {
            Rect rectIntersect;
            boolean zM13159getCollapsedimpl = TextRange.m13159getCollapsedimpl(TextFieldSelectionState.this.textFieldState.getText().getSelectionInChars());
            if (((zM13159getCollapsedimpl && TextFieldSelectionState.this.getTextToolbarState() == TextToolbarState.Cursor) || (!zM13159getCollapsedimpl && TextFieldSelectionState.this.getTextToolbarState() == TextToolbarState.Selection)) && TextFieldSelectionState.this.getDraggingHandle() == null && TextFieldSelectionState.this.isInTouchMode()) {
                LayoutCoordinates textLayoutCoordinates = TextFieldSelectionState.this.getTextLayoutCoordinates();
                Rect rectVisibleBounds = textLayoutCoordinates != null ? SelectionManagerKt.visibleBounds(textLayoutCoordinates) : null;
                if (rectVisibleBounds != null) {
                    LayoutCoordinates textLayoutCoordinates2 = TextFieldSelectionState.this.getTextLayoutCoordinates();
                    Offset offsetM11088boximpl = textLayoutCoordinates2 != null ? Offset.m11088boximpl(textLayoutCoordinates2.mo12619localToRootMKHz9U(rectVisibleBounds.m11134getTopLeftF1C5BW0())) : null;
                    Intrinsics.checkNotNull(offsetM11088boximpl);
                    Rect rectM11139Recttz77jQw = RectKt.m11139Recttz77jQw(offsetM11088boximpl.getPackedValue(), rectVisibleBounds.m11132getSizeNHjbRc());
                    Rect contentRect = TextFieldSelectionState.this.getContentRect();
                    Rect rect = rectM11139Recttz77jQw.overlaps(contentRect) ? contentRect : null;
                    return (rect == null || (rectIntersect = rect.intersect(rectM11139Recttz77jQw)) == null) ? Rect.INSTANCE.getZero() : rectIntersect;
                }
                return Rect.INSTANCE.getZero();
            }
            return Rect.INSTANCE.getZero();
        }
    }

    public final Object observeTextToolbarVisibility(Continuation<? super Unit> continuation) {
        Object objCollect = SnapshotStateKt.snapshotFlow(new Function0<Rect>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.observeTextToolbarVisibility.2
            public C10042() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Rect invoke() {
                Rect rectIntersect;
                boolean zM13159getCollapsedimpl = TextRange.m13159getCollapsedimpl(TextFieldSelectionState.this.textFieldState.getText().getSelectionInChars());
                if (((zM13159getCollapsedimpl && TextFieldSelectionState.this.getTextToolbarState() == TextToolbarState.Cursor) || (!zM13159getCollapsedimpl && TextFieldSelectionState.this.getTextToolbarState() == TextToolbarState.Selection)) && TextFieldSelectionState.this.getDraggingHandle() == null && TextFieldSelectionState.this.isInTouchMode()) {
                    LayoutCoordinates textLayoutCoordinates = TextFieldSelectionState.this.getTextLayoutCoordinates();
                    Rect rectVisibleBounds = textLayoutCoordinates != null ? SelectionManagerKt.visibleBounds(textLayoutCoordinates) : null;
                    if (rectVisibleBounds != null) {
                        LayoutCoordinates textLayoutCoordinates2 = TextFieldSelectionState.this.getTextLayoutCoordinates();
                        Offset offsetM11088boximpl = textLayoutCoordinates2 != null ? Offset.m11088boximpl(textLayoutCoordinates2.mo12619localToRootMKHz9U(rectVisibleBounds.m11134getTopLeftF1C5BW0())) : null;
                        Intrinsics.checkNotNull(offsetM11088boximpl);
                        Rect rectM11139Recttz77jQw = RectKt.m11139Recttz77jQw(offsetM11088boximpl.getPackedValue(), rectVisibleBounds.m11132getSizeNHjbRc());
                        Rect contentRect = TextFieldSelectionState.this.getContentRect();
                        Rect rect = rectM11139Recttz77jQw.overlaps(contentRect) ? contentRect : null;
                        return (rect == null || (rectIntersect = rect.intersect(rectM11139Recttz77jQw)) == null) ? Rect.INSTANCE.getZero() : rectIntersect;
                    }
                    return Rect.INSTANCE.getZero();
                }
                return Rect.INSTANCE.getZero();
            }
        }).collect(new FlowCollector() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.observeTextToolbarVisibility.3
            public C10053() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((Rect) obj, (Continuation<? super Unit>) continuation2);
            }

            @Nullable
            public final Object emit(@NotNull Rect rect, @NotNull Continuation<? super Unit> continuation2) {
                if (Intrinsics.areEqual(rect, Rect.INSTANCE.getZero())) {
                    TextFieldSelectionState.this.hideTextToolbar();
                } else {
                    TextFieldSelectionState.this.showTextToolbar(rect);
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "emit", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$3 */
    public static final class C10053<T> implements FlowCollector {
        public C10053() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
            return emit((Rect) obj, (Continuation<? super Unit>) continuation2);
        }

        @Nullable
        public final Object emit(@NotNull Rect rect, @NotNull Continuation<? super Unit> continuation2) {
            if (Intrinsics.areEqual(rect, Rect.INSTANCE.getZero())) {
                TextFieldSelectionState.this.hideTextToolbar();
            } else {
                TextFieldSelectionState.this.showTextToolbar(rect);
            }
            return Unit.INSTANCE;
        }
    }

    public final Rect getContentRect() {
        float fM11100getYimpl;
        Rect cursorRect;
        Rect cursorRect2;
        TextFieldCharSequence text = this.textFieldState.getText();
        if (TextRange.m13159getCollapsedimpl(text.getSelectionInChars())) {
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            return RectKt.m11139Recttz77jQw(textLayoutCoordinates != null ? textLayoutCoordinates.mo12619localToRootMKHz9U(getCursorRect().m11134getTopLeftF1C5BW0()) : Offset.INSTANCE.m11115getZeroF1C5BW0(), getCursorRect().m11132getSizeNHjbRc());
        }
        LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
        long jMo12619localToRootMKHz9U = textLayoutCoordinates2 != null ? textLayoutCoordinates2.mo12619localToRootMKHz9U(m8741getHandlePositiontuRUvjQ(true)) : Offset.INSTANCE.m11115getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates3 = getTextLayoutCoordinates();
        long jMo12619localToRootMKHz9U2 = textLayoutCoordinates3 != null ? textLayoutCoordinates3.mo12619localToRootMKHz9U(m8741getHandlePositiontuRUvjQ(false)) : Offset.INSTANCE.m11115getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates4 = getTextLayoutCoordinates();
        float fM11100getYimpl2 = 0.0f;
        if (textLayoutCoordinates4 != null) {
            TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
            fM11100getYimpl = Offset.m11100getYimpl(textLayoutCoordinates4.mo12619localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (cursorRect2 = layoutResult.getCursorRect(TextRange.m13165getStartimpl(text.getSelectionInChars()))) == null) ? 0.0f : cursorRect2.getTop())));
        } else {
            fM11100getYimpl = 0.0f;
        }
        LayoutCoordinates textLayoutCoordinates5 = getTextLayoutCoordinates();
        if (textLayoutCoordinates5 != null) {
            TextLayoutResult layoutResult2 = this.textLayoutState.getLayoutResult();
            fM11100getYimpl2 = Offset.m11100getYimpl(textLayoutCoordinates5.mo12619localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (cursorRect = layoutResult2.getCursorRect(TextRange.m13160getEndimpl(text.getSelectionInChars()))) == null) ? 0.0f : cursorRect.getTop())));
        }
        return new Rect(Math.min(Offset.m11099getXimpl(jMo12619localToRootMKHz9U), Offset.m11099getXimpl(jMo12619localToRootMKHz9U2)), Math.min(fM11100getYimpl, fM11100getYimpl2), Math.max(Offset.m11099getXimpl(jMo12619localToRootMKHz9U), Offset.m11099getXimpl(jMo12619localToRootMKHz9U2)), Math.max(Offset.m11100getYimpl(jMo12619localToRootMKHz9U), Offset.m11100getYimpl(jMo12619localToRootMKHz9U2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TextFieldHandleState getSelectionHandleState(boolean isStartHandle) {
        boolean z;
        Rect rectVisibleBounds;
        Rect rectVisibleBounds2;
        Handle handle = isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextFieldHandleState.INSTANCE.getHidden();
        }
        long selectionInChars = this.textFieldState.getText().getSelectionInChars();
        if (TextRange.m13159getCollapsedimpl(selectionInChars)) {
            return TextFieldHandleState.INSTANCE.getHidden();
        }
        long jM8741getHandlePositiontuRUvjQ = m8741getHandlePositiontuRUvjQ(isStartHandle);
        if (getDraggingHandle() == handle) {
            z = true;
        } else {
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            if (!((textLayoutCoordinates == null || (rectVisibleBounds2 = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) ? false : SelectionManagerKt.m8601containsInclusiveUv8p0NA(rectVisibleBounds2, jM8741getHandlePositiontuRUvjQ))) {
                z = false;
            }
        }
        if (!z) {
            return TextFieldHandleState.INSTANCE.getHidden();
        }
        ResolvedTextDirection bidiRunDirection = layoutResult.getBidiRunDirection(isStartHandle ? TextRange.m13165getStartimpl(selectionInChars) : Math.max(TextRange.m13160getEndimpl(selectionInChars) - 1, 0));
        boolean zM13164getReversedimpl = TextRange.m13164getReversedimpl(selectionInChars);
        LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
        if (textLayoutCoordinates2 != null && (rectVisibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates2)) != null) {
            jM8741getHandlePositiontuRUvjQ = TextLayoutStateKt.m8707coerceIn3MmeM6k(jM8741getHandlePositiontuRUvjQ, rectVisibleBounds);
        }
        return new TextFieldHandleState(true, jM8741getHandlePositiontuRUvjQ, bidiRunDirection, zM13164getReversedimpl, null);
    }

    /* renamed from: getHandlePosition-tuRUvjQ */
    public final long m8741getHandlePositiontuRUvjQ(boolean isStartHandle) {
        int iM13160getEndimpl;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.INSTANCE.m11115getZeroF1C5BW0();
        }
        long selectionInChars = this.textFieldState.getText().getSelectionInChars();
        if (isStartHandle) {
            iM13160getEndimpl = TextRange.m13165getStartimpl(selectionInChars);
        } else {
            iM13160getEndimpl = TextRange.m13160getEndimpl(selectionInChars);
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, iM13160getEndimpl, isStartHandle, TextRange.m13164getReversedimpl(selectionInChars));
    }

    /* renamed from: updateHandleDragging-Uv8p0NA */
    public final void m8747updateHandleDraggingUv8p0NA(Handle handle, long position) {
        setDraggingHandle(handle);
        m8745setRawHandleDragPositionk4lQ0M(position);
    }

    public final void markStartContentVisibleOffset() {
        Rect rectVisibleBounds;
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        m8746setStartContentVisibleOffsetk4lQ0M((textLayoutCoordinates == null || (rectVisibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) ? Offset.INSTANCE.m11114getUnspecifiedF1C5BW0() : rectVisibleBounds.m11134getTopLeftF1C5BW0());
    }

    public final void clearHandleDragging() {
        setDraggingHandle(null);
        Offset.Companion companion = Offset.INSTANCE;
        m8745setRawHandleDragPositionk4lQ0M(companion.m11114getUnspecifiedF1C5BW0());
        m8746setStartContentVisibleOffsetk4lQ0M(companion.m11114getUnspecifiedF1C5BW0());
    }

    public final void cut() {
        TextFieldCharSequence text = this.textFieldState.getText();
        if (TextRange.m13159getCollapsedimpl(text.getSelectionInChars())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(text).toString(), null, null, 6, null));
        }
        this.textFieldState.deleteSelectedText();
    }

    public static /* synthetic */ void copy$default(TextFieldSelectionState textFieldSelectionState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionState.copy(z);
    }

    public final void copy(boolean cancelSelection) {
        TextFieldCharSequence text = this.textFieldState.getText();
        if (TextRange.m13159getCollapsedimpl(text.getSelectionInChars())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(text).toString(), null, null, 6, null));
        }
        if (cancelSelection) {
            this.textFieldState.collapseSelectionToMax();
        }
    }

    public final void paste() {
        AnnotatedString text;
        String text2;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null || (text2 = text.getText()) == null) {
            return;
        }
        TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, text2, false, TextFieldEditUndoBehavior.NeverMerge, 2, null);
    }

    public final void showTextToolbar(Rect contentRect) {
        ClipboardManager clipboardManager;
        long selectionInChars = this.textFieldState.getText().getSelectionInChars();
        Function0<Unit> function0 = (getEditable() && (clipboardManager = this.clipboardManager) != null && clipboardManager.hasText()) ? new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$paste$1
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
                this.this$0.paste();
                this.this$0.updateTextToolbarState(TextToolbarState.None);
            }
        } : null;
        Function0<Unit> function02 = !TextRange.m13159getCollapsedimpl(selectionInChars) ? new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$copy$1
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
                TextFieldSelectionState.copy$default(this.this$0, false, 1, null);
                this.this$0.updateTextToolbarState(TextToolbarState.None);
            }
        } : null;
        Function0<Unit> function03 = (TextRange.m13159getCollapsedimpl(selectionInChars) || !getEditable()) ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$cut$1
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
                this.this$0.cut();
                this.this$0.updateTextToolbarState(TextToolbarState.None);
            }
        };
        Function0<Unit> function04 = TextRange.m13161getLengthimpl(selectionInChars) != this.textFieldState.getText().length() ? new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$selectAll$1
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
                this.this$0.textFieldState.selectAll();
                this.this$0.updateTextToolbarState(TextToolbarState.Selection);
            }
        } : null;
        TextToolbar textToolbar = this.textToolbar;
        if (textToolbar != null) {
            textToolbar.showMenu(contentRect, function02, function0, function03, function04);
        }
    }

    public final void deselect() {
        if (!TextRange.m13159getCollapsedimpl(this.textFieldState.getText().getSelectionInChars())) {
            this.textFieldState.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(TextToolbarState.None);
    }

    public final void hideTextToolbar() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    /* renamed from: updateSelection-QNhciaU$default */
    public static /* synthetic */ long m8749updateSelectionQNhciaU$default(TextFieldSelectionState textFieldSelectionState, TextFieldCharSequence textFieldCharSequence, int i, int i2, boolean z, SelectionAdjustment selectionAdjustment, boolean z2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            z2 = false;
        }
        return textFieldSelectionState.m8748updateSelectionQNhciaU(textFieldCharSequence, i, i2, z, selectionAdjustment, z2);
    }

    /* renamed from: updateSelection-QNhciaU */
    public final long m8748updateSelectionQNhciaU(TextFieldCharSequence textFieldCharSequence, int startOffset, int endOffset, boolean isStartHandle, SelectionAdjustment adjustment, boolean allowPreviousSelectionCollapsed) {
        HapticFeedback hapticFeedback;
        TextRange textRangeM13153boximpl = TextRange.m13153boximpl(textFieldCharSequence.getSelectionInChars());
        long packedValue = textRangeM13153boximpl.getPackedValue();
        if (!allowPreviousSelectionCollapsed && TextRange.m13159getCollapsedimpl(packedValue)) {
            textRangeM13153boximpl = null;
        }
        long jM8744getTextFieldSelectionqeG_v_k = m8744getTextFieldSelectionqeG_v_k(startOffset, endOffset, textRangeM13153boximpl, isStartHandle, adjustment);
        if (TextRange.m13158equalsimpl0(jM8744getTextFieldSelectionqeG_v_k, textFieldCharSequence.getSelectionInChars())) {
            return jM8744getTextFieldSelectionqeG_v_k;
        }
        boolean z = TextRange.m13164getReversedimpl(jM8744getTextFieldSelectionqeG_v_k) != TextRange.m13164getReversedimpl(textFieldCharSequence.getSelectionInChars()) && TextRange.m13158equalsimpl0(TextRangeKt.TextRange(TextRange.m13160getEndimpl(jM8744getTextFieldSelectionqeG_v_k), TextRange.m13165getStartimpl(jM8744getTextFieldSelectionqeG_v_k)), textFieldCharSequence.getSelectionInChars());
        if (isInTouchMode() && !z && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo12011performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m12020getTextHandleMove5zf0vsI());
        }
        return jM8744getTextFieldSelectionqeG_v_k;
    }

    /* renamed from: getTextFieldSelection-qeG_v_k */
    private final long m8744getTextFieldSelectionqeG_v_k(int rawStartOffset, int rawEndOffset, TextRange previousSelection, boolean isStartHandle, SelectionAdjustment adjustment) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextRange.INSTANCE.m13170getZerod9O1mEE();
        }
        if (previousSelection == null && Intrinsics.areEqual(adjustment, SelectionAdjustment.INSTANCE.getCharacter())) {
            return TextRangeKt.TextRange(rawStartOffset, rawEndOffset);
        }
        SelectionLayout selectionLayoutM8567getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m8567getTextFieldSelectionLayoutRcvTLA(layoutResult, rawStartOffset, rawEndOffset, this.previousRawDragOffset, previousSelection != null ? previousSelection.getPackedValue() : TextRange.INSTANCE.m13170getZerod9O1mEE(), previousSelection == null, isStartHandle);
        if (previousSelection != null && !selectionLayoutM8567getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return previousSelection.getPackedValue();
        }
        long jM8555toTextRanged9O1mEE = adjustment.adjust(selectionLayoutM8567getTextFieldSelectionLayoutRcvTLA).m8555toTextRanged9O1mEE();
        this.previousSelectionLayout = selectionLayoutM8567getTextFieldSelectionLayoutRcvTLA;
        if (!isStartHandle) {
            rawStartOffset = rawEndOffset;
        }
        this.previousRawDragOffset = rawStartOffset;
        return jM8555toTextRanged9O1mEE;
    }
}
