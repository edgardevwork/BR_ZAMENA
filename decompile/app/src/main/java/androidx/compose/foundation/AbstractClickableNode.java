package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.key.Key;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.input.key.KeyInputModifierNode;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.PointerInputModifierNode;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Clickable.kt */
@Metadata(m7104d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B9\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\b\u0010\u001c\u001a\u00020\u000eH\u0004J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J*\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010#JD\u0010/\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0004ø\u0001\u0000¢\u0006\u0002\b0R\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000\u0082\u0001\u000223\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, m7105d2 = {"Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V", "clickablePointerInputNode", "Landroidx/compose/foundation/AbstractClickablePointerInputNode;", "getClickablePointerInputNode", "()Landroidx/compose/foundation/AbstractClickablePointerInputNode;", "clickableSemanticsNode", "Landroidx/compose/foundation/ClickableSemanticsNode;", "getClickableSemanticsNode", "()Landroidx/compose/foundation/ClickableSemanticsNode;", "interactionData", "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "getInteractionData", "()Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "disposeInteractionSource", "onCancelPointerInput", "onDetach", "onKeyEvent", "event", "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "updateCommon", "updateCommon-XHw0xAI", "InteractionData", "Landroidx/compose/foundation/ClickableNode;", "Landroidx/compose/foundation/CombinedClickableNodeImpl;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1070:1\n1855#2,2:1071\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n*L\n783#1:1071,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode {
    public boolean enabled;

    @NotNull
    public final InteractionData interactionData;

    @NotNull
    public MutableInteractionSource interactionSource;

    @NotNull
    public Function0<Unit> onClick;

    @Nullable
    public String onClickLabel;

    @Nullable
    public Role role;

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, z, str, role, function0);
    }

    @NotNull
    public abstract AbstractClickablePointerInputNode getClickablePointerInputNode();

    @NotNull
    public abstract ClickableSemanticsNode getClickableSemanticsNode();

    @Override // androidx.compose.p003ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo7741onPreKeyEventZmokQxo(@NotNull KeyEvent event) {
        return false;
    }

    public AbstractClickableNode(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, Function0<Unit> function0) {
        this.interactionSource = mutableInteractionSource;
        this.enabled = z;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = function0;
        this.interactionData = new InteractionData();
    }

    /* compiled from: Clickable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "", "()V", "centreOffset", "Landroidx/compose/ui/geometry/Offset;", "getCentreOffset-F1C5BW0", "()J", "setCentreOffset-k-4lQ0M", "(J)V", "J", "currentKeyPressInteractions", "", "Landroidx/compose/ui/input/key/Key;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "getCurrentKeyPressInteractions", "()Ljava/util/Map;", "pressInteraction", "getPressInteraction", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;", "setPressInteraction", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes.dex */
    public static final class InteractionData {
        public static final int $stable = 8;

        @Nullable
        private PressInteraction.Press pressInteraction;

        @NotNull
        private final Map<Key, PressInteraction.Press> currentKeyPressInteractions = new LinkedHashMap();
        private long centreOffset = Offset.INSTANCE.m11115getZeroF1C5BW0();

        @NotNull
        public final Map<Key, PressInteraction.Press> getCurrentKeyPressInteractions() {
            return this.currentKeyPressInteractions;
        }

        @Nullable
        public final PressInteraction.Press getPressInteraction() {
            return this.pressInteraction;
        }

        public final void setPressInteraction(@Nullable PressInteraction.Press press) {
            this.pressInteraction = press;
        }

        /* renamed from: getCentreOffset-F1C5BW0, reason: from getter */
        public final long getCentreOffset() {
            return this.centreOffset;
        }

        /* renamed from: setCentreOffset-k-4lQ0M */
        public final void m7744setCentreOffsetk4lQ0M(long j) {
            this.centreOffset = j;
        }
    }

    @NotNull
    public final InteractionData getInteractionData() {
        return this.interactionData;
    }

    /* renamed from: updateCommon-XHw0xAI$default */
    public static /* synthetic */ void m7738updateCommonXHw0xAI$default(AbstractClickableNode abstractClickableNode, MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCommon-XHw0xAI");
        }
        if ((i & 8) != 0) {
            role = null;
        }
        abstractClickableNode.m7742updateCommonXHw0xAI(mutableInteractionSource, z, str, role, function0);
    }

    /* renamed from: updateCommon-XHw0xAI */
    public final void m7742updateCommonXHw0xAI(@NotNull MutableInteractionSource interactionSource, boolean enabled, @Nullable String onClickLabel, @Nullable Role role, @NotNull Function0<Unit> onClick) {
        if (!Intrinsics.areEqual(this.interactionSource, interactionSource)) {
            disposeInteractionSource();
            this.interactionSource = interactionSource;
        }
        if (this.enabled != enabled) {
            if (!enabled) {
                disposeInteractionSource();
            }
            this.enabled = enabled;
        }
        this.onClickLabel = onClickLabel;
        this.role = role;
        this.onClick = onClick;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInteractionSource();
    }

    public final void disposeInteractionSource() {
        PressInteraction.Press pressInteraction = this.interactionData.getPressInteraction();
        if (pressInteraction != null) {
            this.interactionSource.tryEmit(new PressInteraction.Cancel(pressInteraction));
        }
        Iterator<T> it = this.interactionData.getCurrentKeyPressInteractions().values().iterator();
        while (it.hasNext()) {
            this.interactionSource.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) it.next()));
        }
        this.interactionData.setPressInteraction(null);
        this.interactionData.getCurrentKeyPressInteractions().clear();
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo7740onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        getClickablePointerInputNode().mo7740onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        getClickablePointerInputNode().onCancelPointerInput();
    }

    @Override // androidx.compose.p003ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo7739onKeyEventZmokQxo(@NotNull KeyEvent event) {
        if (this.enabled && Clickable_androidKt.m7820isPressZmokQxo(event)) {
            if (this.interactionData.getCurrentKeyPressInteractions().containsKey(Key.m12037boximpl(KeyEvent_androidKt.m12348getKeyZmokQxo(event)))) {
                return false;
            }
            PressInteraction.Press press = new PressInteraction.Press(this.interactionData.getCentreOffset(), null);
            this.interactionData.getCurrentKeyPressInteractions().put(Key.m12037boximpl(KeyEvent_androidKt.m12348getKeyZmokQxo(event)), press);
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
        } else {
            if (!this.enabled || !Clickable_androidKt.m7818isClickZmokQxo(event)) {
                return false;
            }
            PressInteraction.Press pressRemove = this.interactionData.getCurrentKeyPressInteractions().remove(Key.m12037boximpl(KeyEvent_androidKt.m12348getKeyZmokQxo(event)));
            if (pressRemove != null) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2$1(this, pressRemove, null), 3, null);
            }
            this.onClick.invoke();
        }
        return true;
    }
}
