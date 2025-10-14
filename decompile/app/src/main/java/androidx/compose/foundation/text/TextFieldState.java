package androidx.compose.foundation.text;

import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.platform.SoftwareKeyboardController;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.input.EditProcessor;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.text.input.TextInputSession;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoreTextField.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJl\u0010l\u001a\u00020A2\u0006\u0010f\u001a\u00020g2\u0006\u0010m\u001a\u00020g2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020\u00142\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020A0?2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020zø\u0001\u0000¢\u0006\u0004\b{\u0010|R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010!\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0013\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R(\u0010*\u001a\u0004\u0018\u00010\n2\b\u0010)\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u00100\u001a\u0004\u0018\u00010/2\b\u0010)\u001a\u0004\u0018\u00010/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/06X\u0082\u0004¢\u0006\u0002\n\u0000R1\u00108\u001a\u0002072\u0006\u0010\u000b\u001a\u0002078F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b=\u0010\u0013\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001d\u0010>\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0?¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u001d\u0010D\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020A0?¢\u0006\b\n\u0000\u001a\u0004\bF\u0010CR\u001a\u0010G\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020A0?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010H\u001a\u00020I¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010N\u001a\u00020O¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR+\u0010R\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010\u0013\u001a\u0004\bS\u0010\u0017\"\u0004\bT\u0010\u0019R+\u0010V\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010\u0013\u001a\u0004\bW\u0010\u0017\"\u0004\bX\u0010\u0019R+\u0010Z\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010\u0013\u001a\u0004\b[\u0010\u0017\"\u0004\b\\\u0010\u0019R+\u0010^\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010\u0013\u001a\u0004\b_\u0010\u0017\"\u0004\b`\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001c\u0010f\u001a\u0004\u0018\u00010gX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006}"}, m7105d2 = {"Landroidx/compose/foundation/text/TextFieldState;", "", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "_layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "<set-?>", "Landroidx/compose/foundation/text/HandleState;", "handleState", "getHandleState", "()Landroidx/compose/foundation/text/HandleState;", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState$delegate", "Landroidx/compose/runtime/MutableState;", "", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "inputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "isInTouchMode", "setInTouchMode", "isInTouchMode$delegate", "isLayoutResultStale", "keyboardActionRunner", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "getKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "value", "layoutCoordinates", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "layoutResult", "getLayoutResult", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setLayoutResult", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "layoutResultState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/Dp;", "minHeightForSingleLineField", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField$delegate", "onImeActionPerformed", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "", "getOnImeActionPerformed", "()Lkotlin/jvm/functions/Function1;", "onValueChange", "Landroidx/compose/ui/text/input/TextFieldValue;", "getOnValueChange", "onValueChangeOriginal", "processor", "Landroidx/compose/ui/text/input/EditProcessor;", "getProcessor", "()Landroidx/compose/ui/text/input/EditProcessor;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "selectionPaint", "Landroidx/compose/ui/graphics/Paint;", "getSelectionPaint", "()Landroidx/compose/ui/graphics/Paint;", "showCursorHandle", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle$delegate", "showFloatingToolbar", "getShowFloatingToolbar", "setShowFloatingToolbar", "showFloatingToolbar$delegate", "showSelectionHandleEnd", "getShowSelectionHandleEnd", "setShowSelectionHandleEnd", "showSelectionHandleEnd$delegate", "showSelectionHandleStart", "getShowSelectionHandleStart", "setShowSelectionHandleStart", "showSelectionHandleStart$delegate", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "untransformedText", "Landroidx/compose/ui/text/AnnotatedString;", "getUntransformedText", "()Landroidx/compose/ui/text/AnnotatedString;", "setUntransformedText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "update", "visualText", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "softWrap", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "selectionBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "update-fnh65Uc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1195:1\n154#2:1196\n81#3:1197\n107#3,2:1198\n81#3:1200\n107#3,2:1201\n81#3:1204\n107#3,2:1205\n81#3:1207\n107#3,2:1208\n81#3:1210\n107#3,2:1211\n81#3:1213\n107#3,2:1214\n81#3:1216\n107#3,2:1217\n81#3:1219\n107#3,2:1220\n1#4:1203\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n*L\n829#1:1196\n824#1:1197\n824#1:1198,2\n829#1:1200\n829#1:1201,2\n889#1:1204\n889#1:1205,2\n899#1:1207\n899#1:1208,2\n905#1:1210\n905#1:1211,2\n911#1:1213\n911#1:1214,2\n917#1:1216\n917#1:1217,2\n929#1:1219\n929#1:1220,2\n*E\n"})
/* loaded from: classes4.dex */
public final class TextFieldState {
    public static final int $stable = 8;

    @Nullable
    private LayoutCoordinates _layoutCoordinates;

    /* renamed from: handleState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState handleState;

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState hasFocus;

    @Nullable
    private TextInputSession inputSession;

    /* renamed from: isInTouchMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isInTouchMode;
    private boolean isLayoutResultStale;

    @NotNull
    private final KeyboardActionRunner keyboardActionRunner;

    @Nullable
    private final SoftwareKeyboardController keyboardController;

    @NotNull
    private final MutableState<TextLayoutResultProxy> layoutResultState;

    /* renamed from: minHeightForSingleLineField$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState minHeightForSingleLineField;

    @NotNull
    private final Function1<ImeAction, Unit> onImeActionPerformed;

    @NotNull
    private final Function1<TextFieldValue, Unit> onValueChange;

    @NotNull
    private Function1<? super TextFieldValue, Unit> onValueChangeOriginal;

    @NotNull
    private final EditProcessor processor = new EditProcessor();

    @NotNull
    private final RecomposeScope recomposeScope;

    @NotNull
    private final Paint selectionPaint;

    /* renamed from: showCursorHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showCursorHandle;

    /* renamed from: showFloatingToolbar$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showFloatingToolbar;

    /* renamed from: showSelectionHandleEnd$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showSelectionHandleEnd;

    /* renamed from: showSelectionHandleStart$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showSelectionHandleStart;

    @NotNull
    private TextDelegate textDelegate;

    @Nullable
    private AnnotatedString untransformedText;

    public TextFieldState(@NotNull TextDelegate textDelegate, @NotNull RecomposeScope recomposeScope, @Nullable SoftwareKeyboardController softwareKeyboardController) {
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.keyboardController = softwareKeyboardController;
        Boolean bool = Boolean.FALSE;
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.minHeightForSingleLineField = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C2046Dp.m13664boximpl(C2046Dp.m13666constructorimpl(0)), null, 2, null);
        this.layoutResultState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.handleState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.showFloatingToolbar = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleStart = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleEnd = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showCursorHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.isInTouchMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.keyboardActionRunner = new KeyboardActionRunner(softwareKeyboardController);
        this.onValueChangeOriginal = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChangeOriginal$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return Unit.INSTANCE;
            }
        };
        this.onValueChange = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChange$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull TextFieldValue textFieldValue) {
                String text = textFieldValue.getText();
                AnnotatedString untransformedText = this.this$0.getUntransformedText();
                if (!Intrinsics.areEqual(text, untransformedText != null ? untransformedText.getText() : null)) {
                    this.this$0.setHandleState(HandleState.None);
                }
                this.this$0.onValueChangeOriginal.invoke(textFieldValue);
                this.this$0.getRecomposeScope().invalidate();
            }
        };
        this.onImeActionPerformed = new Function1<ImeAction, Unit>() { // from class: androidx.compose.foundation.text.TextFieldState$onImeActionPerformed$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
                m8494invokeKlQnJC8(imeAction.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m8494invokeKlQnJC8(int i) {
                this.this$0.keyboardActionRunner.m8422runActionKlQnJC8(i);
            }
        };
        this.selectionPaint = AndroidPaint_androidKt.Paint();
    }

    @NotNull
    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final void setTextDelegate(@NotNull TextDelegate textDelegate) {
        this.textDelegate = textDelegate;
    }

    @NotNull
    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    @Nullable
    public final SoftwareKeyboardController getKeyboardController() {
        return this.keyboardController;
    }

    @NotNull
    public final EditProcessor getProcessor() {
        return this.processor;
    }

    @Nullable
    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final void setInputSession(@Nullable TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m8491getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((C2046Dp) this.minHeightForSingleLineField.getValue()).m13680unboximpl();
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m8492setMinHeightForSingleLineField0680j_4(float f) {
        this.minHeightForSingleLineField.setValue(C2046Dp.m13664boximpl(f));
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this._layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final void setLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this._layoutCoordinates = layoutCoordinates;
    }

    @Nullable
    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    public final void setLayoutResult(@Nullable TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    @Nullable
    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final void setUntransformedText(@Nullable AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final HandleState getHandleState() {
        return (HandleState) this.handleState.getValue();
    }

    public final void setHandleState(@NotNull HandleState handleState) {
        this.handleState.setValue(handleState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowFloatingToolbar() {
        return ((Boolean) this.showFloatingToolbar.getValue()).booleanValue();
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.showFloatingToolbar.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.showSelectionHandleStart.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.showSelectionHandleEnd.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle.setValue(Boolean.valueOf(z));
    }

    /* renamed from: isLayoutResultStale, reason: from getter */
    public final boolean getIsLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode.setValue(Boolean.valueOf(z));
    }

    @NotNull
    public final Function1<TextFieldValue, Unit> getOnValueChange() {
        return this.onValueChange;
    }

    @NotNull
    public final Function1<ImeAction, Unit> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    @NotNull
    public final Paint getSelectionPaint() {
        return this.selectionPaint;
    }

    /* renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m8493updatefnh65Uc(@NotNull AnnotatedString untransformedText, @NotNull AnnotatedString visualText, @NotNull TextStyle textStyle, boolean softWrap, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull Function1<? super TextFieldValue, Unit> onValueChange, @NotNull KeyboardActions keyboardActions, @NotNull FocusManager focusManager, long selectionBackgroundColor) {
        this.onValueChangeOriginal = onValueChange;
        this.selectionPaint.mo11219setColor8_81llA(selectionBackgroundColor);
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        this.untransformedText = untransformedText;
        TextDelegate textDelegateM8462updateTextDelegaterm0N8CA = TextDelegateKt.m8462updateTextDelegaterm0N8CA(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, (448 & 32) != 0 ? true : softWrap, (448 & 64) != 0 ? TextOverflow.INSTANCE.m13607getClipgIe3tQ8() : 0, (448 & 128) != 0 ? Integer.MAX_VALUE : 0, (448 & 256) != 0 ? 1 : 0, CollectionsKt__CollectionsKt.emptyList());
        if (this.textDelegate != textDelegateM8462updateTextDelegaterm0N8CA) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = textDelegateM8462updateTextDelegaterm0N8CA;
    }
}
