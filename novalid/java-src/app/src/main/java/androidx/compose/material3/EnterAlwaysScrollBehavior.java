package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppBar.kt */
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m7105d2 = {"Landroidx/compose/material3/EnterAlwaysScrollBehavior;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "state", "Landroidx/compose/material3/TopAppBarState;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "canScroll", "Lkotlin/Function0;", "", "(Landroidx/compose/material3/TopAppBarState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function0;)V", "getCanScroll", "()Lkotlin/jvm/functions/Function0;", "getFlingAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "isPinned", "()Z", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setNestedScrollConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getState", "()Landroidx/compose/material3/TopAppBarState;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class EnterAlwaysScrollBehavior implements TopAppBarScrollBehavior {

    @NotNull
    public final Function0<Boolean> canScroll;

    @Nullable
    public final DecayAnimationSpec<Float> flingAnimationSpec;
    public final boolean isPinned;

    @NotNull
    public NestedScrollConnection nestedScrollConnection;

    @Nullable
    public final AnimationSpec<Float> snapAnimationSpec;

    @NotNull
    public final TopAppBarState state;

    public EnterAlwaysScrollBehavior(@NotNull TopAppBarState topAppBarState, @Nullable AnimationSpec<Float> animationSpec, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @NotNull Function0<Boolean> function0) {
        this.state = topAppBarState;
        this.snapAnimationSpec = animationSpec;
        this.flingAnimationSpec = decayAnimationSpec;
        this.canScroll = function0;
        this.nestedScrollConnection = new EnterAlwaysScrollBehavior$nestedScrollConnection$1(this);
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @NotNull
    public TopAppBarState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @Nullable
    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    /* compiled from: AppBar.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.EnterAlwaysScrollBehavior$1 */
    public static final class C14371 extends Lambda implements Function0<Boolean> {
        public static final C14371 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @Nullable
    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    public /* synthetic */ EnterAlwaysScrollBehavior(TopAppBarState topAppBarState, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(topAppBarState, animationSpec, decayAnimationSpec, (i & 8) != 0 ? C14371.INSTANCE : function0);
    }

    @NotNull
    public final Function0<Boolean> getCanScroll() {
        return this.canScroll;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: isPinned, reason: from getter */
    public boolean getIsPinned() {
        return this.isPinned;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @NotNull
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    public void setNestedScrollConnection(@NotNull NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }
}
