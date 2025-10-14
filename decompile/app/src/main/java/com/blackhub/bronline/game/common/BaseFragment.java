package com.blackhub.bronline.game.common;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStateManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewbinding.ViewBinding;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\r\u0010\u0010\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\u001a\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J$\u0010!\u001a\u00020\u0012*\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120%H\u0004J$\u0010&\u001a\u00020\u0012*\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120%H\u0004R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006'"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/BaseFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Landroidx/viewbinding/ViewBinding;", "anim", "Landroid/view/animation/Animation;", "getAnim", "()Landroid/view/animation/Animation;", "anim$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "getViewBinding", "initViews", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/os/Bundle;", "onDestroyView", "onPause", "onResume", "onStop", "onViewCreated", SVG.View.NODE_NAME, "setOnClickListenerWithAnimAndDelay", "debounceMillis", "", "action", "Lkotlin/Function0;", "startAnimAndDelay", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseFragment<VB extends ViewBinding> extends Fragment {
    public static final int $stable = 8;

    @Nullable
    public VB _binding;

    /* renamed from: anim$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy anim = LazyKt__LazyJVMKt.lazy(new Function0<Animation>(this) { // from class: com.blackhub.bronline.game.common.BaseFragment$anim$2
        public final /* synthetic */ BaseFragment<VB> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Animation invoke() {
            return AnimationUtils.loadAnimation(this.this$0.getContext(), R.anim.button_click);
        }
    });

    @NotNull
    public abstract VB getViewBinding();

    public void initViews() {
    }

    @NotNull
    public final VB getBinding() {
        VB vb = this._binding;
        if (vb != null) {
            return vb;
        }
        throw new NullPointerException("Binding is null in " + Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + ". Accessing binding before onCreateView or after onDestroyView?");
    }

    @NotNull
    public final Animation getAnim() {
        Object value = this.anim.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Animation) value;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        VB vb = (VB) getViewBinding();
        this._binding = vb;
        UtilsKt.crashlyticsLog((vb != null ? vb.getClass() : null) + " onCreateView()");
        VB vb2 = this._binding;
        if (vb2 != null) {
            return vb2.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        VB vb = this._binding;
        UtilsKt.crashlyticsLog((vb != null ? vb.getClass() : null) + " onViewCreated()");
        initViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        VB vb = this._binding;
        UtilsKt.crashlyticsLog((vb != null ? vb.getClass() : null) + " onPause()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        VB vb = this._binding;
        UtilsKt.crashlyticsLog((vb != null ? vb.getClass() : null) + " onStop()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        VB vb = this._binding;
        UtilsKt.crashlyticsLog((vb != null ? vb.getClass() : null) + " onResume()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        VB vb = this._binding;
        UtilsKt.crashlyticsLog((vb != null ? vb.getClass() : null) + " onDestroyView()");
        this._binding = null;
    }

    public static /* synthetic */ void setOnClickListenerWithAnimAndDelay$default(BaseFragment baseFragment, View view, long j, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnClickListenerWithAnimAndDelay");
        }
        if ((i & 1) != 0) {
            j = 300;
        }
        baseFragment.setOnClickListenerWithAnimAndDelay(view, j, function0);
    }

    public final void setOnClickListenerWithAnimAndDelay(@NotNull final View view, final long j, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.common.BaseFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseFragment.setOnClickListenerWithAnimAndDelay$lambda$0(this.f$0, view, j, action, view2);
            }
        });
    }

    public static final void setOnClickListenerWithAnimAndDelay$lambda$0(BaseFragment this$0, View this_setOnClickListenerWithAnimAndDelay, long j, Function0 action, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_setOnClickListenerWithAnimAndDelay, "$this_setOnClickListenerWithAnimAndDelay");
        Intrinsics.checkNotNullParameter(action, "$action");
        this$0.startAnimAndDelay(this_setOnClickListenerWithAnimAndDelay, j, action);
    }

    public static /* synthetic */ void startAnimAndDelay$default(BaseFragment baseFragment, View view, long j, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAnimAndDelay");
        }
        if ((i & 1) != 0) {
            j = 300;
        }
        baseFragment.startAnimAndDelay(view, j, function0);
    }

    public final void startAnimAndDelay(@NotNull View view, long j, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Other other = Other.INSTANCE;
        if (jUptimeMillis - other.getTimer() > j) {
            other.setTimer(jUptimeMillis);
            AnyExtensionKt.setActionOnAnimationEnd(getAnim(), action);
            view.startAnimation(getAnim());
        }
    }
}
