package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusProperties.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0013X\u0096\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0013X\u0096\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001a\u0010*\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000e¨\u00060"}, m7105d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Landroidx/compose/ui/focus/FocusProperties;", "()V", "canFocus", "", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "down", "Landroidx/compose/ui/focus/FocusRequester;", "getDown", "()Landroidx/compose/ui/focus/FocusRequester;", "setDown", "(Landroidx/compose/ui/focus/FocusRequester;)V", "end", "getEnd", "setEnd", "enter", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "getEnter$annotations", "getEnter", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "exit", "getExit$annotations", "getExit", "setExit", TtmlNode.LEFT, "getLeft", "setLeft", LinkHeader.Rel.Next, "getNext", "setNext", "previous", "getPrevious", "setPrevious", TtmlNode.RIGHT, "getRight", "setRight", TtmlNode.START, "getStart", "setStart", "up", "getUp", "setUp", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class FocusPropertiesImpl implements FocusProperties {
    public static final int $stable = 8;
    private boolean canFocus = true;

    @NotNull
    private FocusRequester down;

    @NotNull
    private FocusRequester end;

    @NotNull
    private Function1<? super FocusDirection, FocusRequester> enter;

    @NotNull
    private Function1<? super FocusDirection, FocusRequester> exit;

    @NotNull
    private FocusRequester left;

    @NotNull
    private FocusRequester next;

    @NotNull
    private FocusRequester previous;

    @NotNull
    private FocusRequester right;

    @NotNull
    private FocusRequester start;

    @NotNull
    private FocusRequester up;

    public static /* synthetic */ void getEnter$annotations() {
    }

    public static /* synthetic */ void getExit$annotations() {
    }

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        this.next = companion.getDefault();
        this.previous = companion.getDefault();
        this.up = companion.getDefault();
        this.down = companion.getDefault();
        this.left = companion.getDefault();
        this.right = companion.getDefault();
        this.start = companion.getDefault();
        this.end = companion.getDefault();
        this.enter = new Function1<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$enter$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                return m11041invoke3ESFkO8(focusDirection.getValue());
            }

            @NotNull
            /* renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m11041invoke3ESFkO8(int i) {
                return FocusRequester.INSTANCE.getDefault();
            }
        };
        this.exit = new Function1<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$exit$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                return m11042invoke3ESFkO8(focusDirection.getValue());
            }

            @NotNull
            /* renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m11042invoke3ESFkO8(int i) {
                return FocusRequester.INSTANCE.getDefault();
            }
        };
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setCanFocus(boolean z) {
        this.canFocus = z;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getNext() {
        return this.next;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setNext(@NotNull FocusRequester focusRequester) {
        this.next = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setPrevious(@NotNull FocusRequester focusRequester) {
        this.previous = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getUp() {
        return this.up;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setUp(@NotNull FocusRequester focusRequester) {
        this.up = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setDown(@NotNull FocusRequester focusRequester) {
        this.down = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setLeft(@NotNull FocusRequester focusRequester) {
        this.left = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setRight(@NotNull FocusRequester focusRequester) {
        this.right = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getStart() {
        return this.start;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setStart(@NotNull FocusRequester focusRequester) {
        this.start = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public FocusRequester getEnd() {
        return this.end;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setEnd(@NotNull FocusRequester focusRequester) {
        this.end = focusRequester;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public Function1<FocusDirection, FocusRequester> getEnter() {
        return this.enter;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setEnter(@NotNull Function1<? super FocusDirection, FocusRequester> function1) {
        this.enter = function1;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    @NotNull
    public Function1<FocusDirection, FocusRequester> getExit() {
        return this.exit;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setExit(@NotNull Function1<? super FocusDirection, FocusRequester> function1) {
        this.exit = function1;
    }
}
