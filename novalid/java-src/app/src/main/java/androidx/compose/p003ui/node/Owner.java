package androidx.compose.p003ui.node;

import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.autofill.Autofill;
import androidx.compose.p003ui.autofill.AutofillTree;
import androidx.compose.p003ui.draganddrop.DragAndDropManager;
import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.focus.FocusOwner;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.hapticfeedback.HapticFeedback;
import androidx.compose.p003ui.input.InputModeManager;
import androidx.compose.p003ui.input.pointer.PointerIconService;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.PlaceableKt;
import androidx.compose.p003ui.modifier.ModifierLocalManager;
import androidx.compose.p003ui.platform.AccessibilityManager;
import androidx.compose.p003ui.platform.ClipboardManager;
import androidx.compose.p003ui.platform.PlatformTextInputSessionHandler;
import androidx.compose.p003ui.platform.SoftwareKeyboardController;
import androidx.compose.p003ui.platform.TextToolbar;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.platform.WindowInfo;
import androidx.compose.p003ui.text.font.Font;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.input.TextInputService;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Owner.kt */
@Metadata(m7104d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 ¤\u00012\u00020\u0001:\u0004¤\u0001¥\u0001J\u001a\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020vH&ø\u0001\u0000¢\u0006\u0004\bx\u0010yJ\u001a\u0010z\u001a\u00020v2\u0006\u0010{\u001a\u00020vH&ø\u0001\u0000¢\u0006\u0004\b|\u0010yJ0\u0010}\u001a\u00020~2\u0015\u0010\u007f\u001a\u0011\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0005\u0012\u00030\u0082\u00010\u0080\u00012\u000f\u0010\u0083\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0084\u0001H&J\u001e\u0010\u0085\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0086\u0001\u001a\u00020K2\t\b\u0002\u0010\u0087\u0001\u001a\u00020WH&J\"\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u00012\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H&ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J)\u0010\u008e\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0086\u0001\u001a\u00020K2\b\u0010\u008f\u0001\u001a\u00030\u0090\u0001H&ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0015\u0010\u008e\u0001\u001a\u00030\u0082\u00012\t\b\u0002\u0010\u0093\u0001\u001a\u00020WH&J\u0013\u0010\u0094\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0095\u0001\u001a\u00020KH&J\u0013\u0010\u0096\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0095\u0001\u001a\u00020KH&J\n\u0010\u0097\u0001\u001a\u00030\u0082\u0001H&J\u0013\u0010\u0098\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0086\u0001\u001a\u00020KH&J4\u0010\u0099\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0086\u0001\u001a\u00020K2\t\b\u0002\u0010\u0087\u0001\u001a\u00020W2\t\b\u0002\u0010\u009a\u0001\u001a\u00020W2\t\b\u0002\u0010\u009b\u0001\u001a\u00020WH&J)\u0010\u009c\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0086\u0001\u001a\u00020K2\t\b\u0002\u0010\u0087\u0001\u001a\u00020W2\t\b\u0002\u0010\u009a\u0001\u001a\u00020WH&J\n\u0010\u009d\u0001\u001a\u00030\u0082\u0001H&J\u001b\u0010\u009e\u0001\u001a\u00030\u0082\u00012\u000f\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0084\u0001H&J\u0014\u0010 \u0001\u001a\u00030\u0082\u00012\b\u0010\u009f\u0001\u001a\u00030¡\u0001H&J\t\u0010¢\u0001\u001a\u00020WH&J\u0013\u0010£\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0086\u0001\u001a\u00020KH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00078gX§\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\r8gX§\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0012\u0010%\u001a\u00020&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020*8&X§\u0004¢\u0006\f\u0012\u0004\b+\u0010\t\u001a\u0004\b,\u0010-R\u0012\u0010.\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0012\u00102\u001a\u000203X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0012\u00106\u001a\u000207X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0012\u0010:\u001a\u00020;X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0012\u0010>\u001a\u00020?X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0012\u0010F\u001a\u00020GX¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0012\u0010J\u001a\u00020KX¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0012\u0010N\u001a\u00020OX¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0012\u0010R\u001a\u00020SX¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\"\u0010X\u001a\u00020W2\u0006\u0010V\u001a\u00020W@gX¦\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0012\u0010]\u001a\u00020^X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0012\u0010a\u001a\u00020bX¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0012\u0010e\u001a\u00020fX¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0012\u0010i\u001a\u00020jX¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0012\u0010m\u001a\u00020nX¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0012\u0010q\u001a\u00020rX¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006¦\u0001À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/PlatformTextInputSessionHandler;", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AccessibilityManager;", "autofill", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill$annotations", "()V", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree$annotations", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "dragAndDropManager", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "focusOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "measureIteration", "", "getMeasureIteration", "()J", "modifierLocalManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "<set-?>", "", "showLayoutBounds", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "softwareKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "calculateLocalPosition", "Landroidx/compose/ui/geometry/Offset;", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "(J)J", "calculatePositionInWindow", "localPosition", "calculatePositionInWindow-MK-Hz9U", "createLayer", "Landroidx/compose/ui/node/OwnedLayer;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "invalidateParentLayer", "Lkotlin/Function0;", "forceMeasureTheSubtree", "layoutNode", "affectsLookahead", "getFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "measureAndLayout", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "sendPointerUpdate", "onAttach", "node", "onDetach", "onEndApplyChanges", "onLayoutChange", "onRequestMeasure", "forceRequest", "scheduleMeasureAndLayout", "onRequestRelayout", "onSemanticsChange", "registerOnEndApplyChangesListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnLayoutCompletedListener", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "requestFocus", "requestOnPositionedCallback", "Companion", "OnLayoutCompletedListener", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface Owner extends PlatformTextInputSessionHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: Owner.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "onLayoutComplete", "", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getAutofill$annotations() {
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getAutofillTree$annotations() {
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    static /* synthetic */ void getFontLoader$annotations() {
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U */
    long mo12869calculateLocalPositionMKHz9U(long positionInWindow);

    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    long mo12870calculatePositionInWindowMKHz9U(long localPosition);

    @NotNull
    OwnedLayer createLayer(@NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer);

    void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode, boolean affectsLookahead);

    @NotNull
    AccessibilityManager getAccessibilityManager();

    @ExperimentalComposeUiApi
    @Nullable
    Autofill getAutofill();

    @ExperimentalComposeUiApi
    @NotNull
    AutofillTree getAutofillTree();

    @NotNull
    ClipboardManager getClipboardManager();

    @NotNull
    CoroutineContext getCoroutineContext();

    @NotNull
    Density getDensity();

    @NotNull
    DragAndDropManager getDragAndDropManager();

    @Nullable
    /* renamed from: getFocusDirection-P8AzH3I */
    FocusDirection mo12871getFocusDirectionP8AzH3I(@NotNull KeyEvent keyEvent);

    @NotNull
    FocusOwner getFocusOwner();

    @NotNull
    FontFamily.Resolver getFontFamilyResolver();

    @NotNull
    Font.ResourceLoader getFontLoader();

    @NotNull
    HapticFeedback getHapticFeedBack();

    @NotNull
    InputModeManager getInputModeManager();

    @NotNull
    LayoutDirection getLayoutDirection();

    long getMeasureIteration();

    @NotNull
    ModifierLocalManager getModifierLocalManager();

    @NotNull
    PointerIconService getPointerIconService();

    @NotNull
    LayoutNode getRoot();

    @NotNull
    RootForTest getRootForTest();

    @NotNull
    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    @NotNull
    OwnerSnapshotObserver getSnapshotObserver();

    @NotNull
    SoftwareKeyboardController getSoftwareKeyboardController();

    @NotNull
    TextInputService getTextInputService();

    @NotNull
    TextToolbar getTextToolbar();

    @NotNull
    ViewConfiguration getViewConfiguration();

    @NotNull
    WindowInfo getWindowInfo();

    void measureAndLayout(boolean sendPointerUpdate);

    /* renamed from: measureAndLayout-0kLqBqw */
    void mo12872measureAndLayout0kLqBqw(@NotNull LayoutNode layoutNode, long constraints);

    void onAttach(@NotNull LayoutNode node);

    void onDetach(@NotNull LayoutNode node);

    void onEndApplyChanges();

    void onLayoutChange(@NotNull LayoutNode layoutNode);

    void onRequestMeasure(@NotNull LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout);

    void onRequestRelayout(@NotNull LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(@NotNull Function0<Unit> function0);

    void registerOnLayoutCompletedListener(@NotNull OnLayoutCompletedListener onLayoutCompletedListener);

    boolean requestFocus();

    void requestOnPositionedCallback(@NotNull LayoutNode layoutNode);

    @InternalCoreApi
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void setShowLayoutBounds(boolean z);

    static /* synthetic */ void onRequestMeasure$default(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        owner.onRequestMeasure(layoutNode, z, z2, z3);
    }

    static /* synthetic */ void onRequestRelayout$default(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        owner.onRequestRelayout(layoutNode, z, z2);
    }

    static /* synthetic */ void measureAndLayout$default(Owner owner, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        owner.measureAndLayout(z);
    }

    static /* synthetic */ void forceMeasureTheSubtree$default(Owner owner, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        owner.forceMeasureTheSubtree(layoutNode, z);
    }

    @NotNull
    default Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    /* compiled from: Owner.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m7105d2 = {"Landroidx/compose/ui/node/Owner$Companion;", "", "()V", "enableExtraAssertions", "", "getEnableExtraAssertions", "()Z", "setEnableExtraAssertions", "(Z)V", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean z) {
            enableExtraAssertions = z;
        }
    }
}
