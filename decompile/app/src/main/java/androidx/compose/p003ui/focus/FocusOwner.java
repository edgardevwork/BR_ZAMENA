package androidx.compose.p003ui.focus;

import android.view.KeyEvent;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.input.rotary.RotaryScrollEvent;
import androidx.compose.p003ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FocusOwner.kt */
@Metadata(m7104d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H&J\u001a\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H&ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH&J\n\u0010\u001f\u001a\u0004\u0018\u00010 H&J\b\u0010!\u001a\u00020\u0011H&J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H&J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020%H&J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020&H&J\b\u0010'\u001a\u00020\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/FocusManager;", "focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "clearFocus", "", "force", "", "refreshFocusEvents", "dispatchInterceptedSoftKeyboardEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "dispatchKeyEvent-ZmokQxo", "dispatchRotaryEvent", "event", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "getFocusRect", "Landroidx/compose/ui/geometry/Rect;", "releaseFocus", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusTargetNode;", "takeFocus", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public interface FocusOwner extends FocusManager {
    void clearFocus(boolean force, boolean refreshFocusEvents);

    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    boolean mo11034dispatchInterceptedSoftKeyboardEventZmokQxo(@NotNull KeyEvent keyEvent);

    /* renamed from: dispatchKeyEvent-ZmokQxo */
    boolean mo11035dispatchKeyEventZmokQxo(@NotNull KeyEvent keyEvent);

    boolean dispatchRotaryEvent(@NotNull RotaryScrollEvent event);

    @Nullable
    Rect getFocusRect();

    @NotNull
    FocusTransactionManager getFocusTransactionManager();

    @NotNull
    LayoutDirection getLayoutDirection();

    @NotNull
    Modifier getModifier();

    void releaseFocus();

    void scheduleInvalidation(@NotNull FocusEventModifierNode node);

    void scheduleInvalidation(@NotNull FocusPropertiesModifierNode node);

    void scheduleInvalidation(@NotNull FocusTargetNode node);

    void setLayoutDirection(@NotNull LayoutDirection layoutDirection);

    void takeFocus();
}
