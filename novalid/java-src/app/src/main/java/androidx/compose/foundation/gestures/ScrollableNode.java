package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.p003ui.focus.FocusProperties;
import androidx.compose.p003ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p003ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.key.Key;
import androidx.compose.p003ui.input.key.KeyEventType;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.input.key.KeyInputModifierNode;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.ObserverModifierNode;
import androidx.compose.p003ui.node.ObserverModifierNodeKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scrollable.kt */
@Metadata(m7104d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BK\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000203H\u0016J\u001a\u00107\u001a\u00020\r2\u0006\u00108\u001a\u000209H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\b\u0010<\u001a\u000203H\u0016J\u001a\u0010=\u001a\u00020\r2\u0006\u00108\u001a\u000209H\u0016ø\u0001\u0000¢\u0006\u0004\b>\u0010;JL\u0010?\u001a\u0002032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010@\u001a\u000203H\u0002R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, m7105d2 = {"Landroidx/compose/foundation/gestures/ScrollableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "state", "Landroidx/compose/foundation/gestures/ScrollableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "enabled", "", "reverseDirection", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "contentInViewNode", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "getContentInViewNode", "()Landroidx/compose/foundation/gestures/ContentInViewNode;", "defaultFlingBehavior", "Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "getDefaultFlingBehavior", "()Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "nestedScrollConnection", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "nestedScrollDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getNestedScrollDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "scrollableContainer", "Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;", "getScrollableContainer", "()Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;", "scrollableGesturesNode", "Landroidx/compose/foundation/gestures/ScrollableGesturesNode;", "getScrollableGesturesNode", "()Landroidx/compose/foundation/gestures/ScrollableGesturesNode;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "getScrollingLogic", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "applyFocusProperties", "", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "onAttach", "onKeyEvent", "event", "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onObservedReadsChanged", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "update", "updateDefaultFlingBehavior", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class ScrollableNode extends DelegatingNode implements ObserverModifierNode, CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, KeyInputModifierNode {

    @NotNull
    public final ContentInViewNode contentInViewNode;

    @NotNull
    public final DefaultFlingBehavior defaultFlingBehavior;
    public boolean enabled;

    @Nullable
    public FlingBehavior flingBehavior;

    @Nullable
    public MutableInteractionSource interactionSource;

    @NotNull
    public final ScrollableNestedScrollConnection nestedScrollConnection;

    @NotNull
    public final NestedScrollDispatcher nestedScrollDispatcher;

    @NotNull
    public Orientation orientation;

    @Nullable
    public OverscrollEffect overscrollEffect;
    public boolean reverseDirection;

    @NotNull
    public final ModifierLocalScrollableContainerProvider scrollableContainer;

    @NotNull
    public final ScrollableGesturesNode scrollableGesturesNode;

    @NotNull
    public final ScrollingLogic scrollingLogic;

    @NotNull
    public ScrollableState state;

    @Override // androidx.compose.p003ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo7741onPreKeyEventZmokQxo(@NotNull KeyEvent event) {
        return false;
    }

    public ScrollableNode(@NotNull ScrollableState scrollableState, @NotNull Orientation orientation, @Nullable OverscrollEffect overscrollEffect, boolean z, boolean z2, @Nullable FlingBehavior flingBehavior, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull BringIntoViewSpec bringIntoViewSpec) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = z;
        this.reverseDirection = z2;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        DefaultFlingBehavior defaultFlingBehavior = new DefaultFlingBehavior(SplineBasedDecayKt.splineBasedDecay(ScrollableKt.UnityDensity), null, 2, 0 == true ? 1 : 0);
        this.defaultFlingBehavior = defaultFlingBehavior;
        ScrollableState scrollableState2 = this.state;
        Orientation orientation2 = this.orientation;
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        boolean z3 = this.reverseDirection;
        FlingBehavior flingBehavior2 = this.flingBehavior;
        ScrollingLogic scrollingLogic = new ScrollingLogic(scrollableState2, orientation2, overscrollEffect2, z3, flingBehavior2 == null ? defaultFlingBehavior : flingBehavior2, nestedScrollDispatcher);
        this.scrollingLogic = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, this.enabled);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        ContentInViewNode contentInViewNode = (ContentInViewNode) delegate(new ContentInViewNode(this.orientation, this.state, this.reverseDirection, bringIntoViewSpec));
        this.contentInViewNode = contentInViewNode;
        this.scrollableContainer = (ModifierLocalScrollableContainerProvider) delegate(new ModifierLocalScrollableContainerProvider(this.enabled));
        delegate(NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        delegate(FocusTargetModifierNodeKt.FocusTargetModifierNode());
        delegate(new BringIntoViewResponderNode(contentInViewNode));
        delegate(new FocusedBoundsObserverNode(new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableNode.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable LayoutCoordinates layoutCoordinates) {
                ScrollableNode.this.getContentInViewNode().onFocusBoundsChanged(layoutCoordinates);
            }
        }));
        this.scrollableGesturesNode = (ScrollableGesturesNode) delegate(new ScrollableGesturesNode(scrollingLogic, this.orientation, this.enabled, nestedScrollDispatcher, this.interactionSource));
    }

    @NotNull
    public final NestedScrollDispatcher getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    @NotNull
    public final DefaultFlingBehavior getDefaultFlingBehavior() {
        return this.defaultFlingBehavior;
    }

    @NotNull
    public final ScrollingLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    @NotNull
    public final ScrollableNestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @NotNull
    public final ContentInViewNode getContentInViewNode() {
        return this.contentInViewNode;
    }

    @NotNull
    public final ModifierLocalScrollableContainerProvider getScrollableContainer() {
        return this.scrollableContainer;
    }

    @NotNull
    public final ScrollableGesturesNode getScrollableGesturesNode() {
        return this.scrollableGesturesNode;
    }

    public final void update(@NotNull ScrollableState state, @NotNull Orientation orientation, @Nullable OverscrollEffect overscrollEffect, boolean enabled, boolean reverseDirection, @Nullable FlingBehavior flingBehavior, @Nullable MutableInteractionSource interactionSource, @NotNull BringIntoViewSpec bringIntoViewSpec) {
        if (this.enabled != enabled) {
            this.nestedScrollConnection.setEnabled(enabled);
            this.scrollableContainer.setEnabled(enabled);
        }
        this.scrollingLogic.update(state, orientation, overscrollEffect, reverseDirection, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.scrollableGesturesNode.update(orientation, enabled, interactionSource);
        this.contentInViewNode.update(orientation, state, reverseDirection, bringIntoViewSpec);
        this.state = state;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = enabled;
        this.reverseDirection = reverseDirection;
        this.flingBehavior = flingBehavior;
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDefaultFlingBehavior();
        ObserverModifierNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableNode.onAttach.1
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
                CompositionLocalConsumerModifierNodeKt.currentValueOf(ScrollableNode.this, CompositionLocalsKt.getLocalDensity());
            }
        });
    }

    @Override // androidx.compose.p003ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateDefaultFlingBehavior();
    }

    public final void updateDefaultFlingBehavior() {
        this.defaultFlingBehavior.setFlingDecay(SplineBasedDecayKt.splineBasedDecay((Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalDensity())));
    }

    @Override // androidx.compose.p003ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@NotNull FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
    }

    @Override // androidx.compose.p003ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo7739onKeyEventZmokQxo(@NotNull KeyEvent event) {
        long jOffset;
        if (this.enabled) {
            long jM12348getKeyZmokQxo = KeyEvent_androidKt.m12348getKeyZmokQxo(event);
            Key.Companion companion = Key.INSTANCE;
            if ((Key.m12040equalsimpl0(jM12348getKeyZmokQxo, companion.m12228getPageDownEK5gGoQ()) || Key.m12040equalsimpl0(KeyEvent_androidKt.m12348getKeyZmokQxo(event), companion.m12229getPageUpEK5gGoQ())) && KeyEventType.m12341equalsimpl0(KeyEvent_androidKt.m12349getTypeZmokQxo(event), KeyEventType.INSTANCE.m12345getKeyDownCS__XNY()) && !KeyEvent_androidKt.m12352isCtrlPressedZmokQxo(event)) {
                ScrollingLogic scrollingLogic = this.scrollingLogic;
                if (this.orientation == Orientation.Vertical) {
                    int iM13835getHeightimpl = IntSize.m13835getHeightimpl(this.contentInViewNode.getViewportSize());
                    jOffset = OffsetKt.Offset(0.0f, Key.m12040equalsimpl0(KeyEvent_androidKt.m12348getKeyZmokQxo(event), companion.m12229getPageUpEK5gGoQ()) ? iM13835getHeightimpl : -iM13835getHeightimpl);
                } else {
                    int iM13836getWidthimpl = IntSize.m13836getWidthimpl(this.contentInViewNode.getViewportSize());
                    jOffset = OffsetKt.Offset(Key.m12040equalsimpl0(KeyEvent_androidKt.m12348getKeyZmokQxo(event), companion.m12229getPageUpEK5gGoQ()) ? iM13836getWidthimpl : -iM13836getWidthimpl, 0.0f);
                }
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1$1(scrollingLogic, jOffset, null), 3, null);
                return true;
            }
        }
        return false;
    }
}
