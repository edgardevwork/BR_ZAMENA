package com.sdkit.paylib.paylibnative.p033ui.screens.cardsaving;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8182e;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8265e;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8376k;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8365b;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.FlowKt;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.a */
/* loaded from: classes5.dex */
public final class C8282a extends Fragment implements InterfaceC8243b {

    /* renamed from: e */
    public static final /* synthetic */ KProperty[] f2947e = {Reflection.property1(new PropertyReference1Impl(C8282a.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentCardSavingBinding;", 0))};

    /* renamed from: a */
    public final C8103b f2948a;

    /* renamed from: b */
    public final Lazy f2949b;

    /* renamed from: c */
    public final ReadOnlyProperty f2950c;

    /* renamed from: d */
    public EnumC8265e f2951d;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.a$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final a f2952a = new a();

        public a() {
            super(1, C8182e.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentCardSavingBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8182e invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8182e.m2121a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.a$b */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        /* renamed from: a */
        public final void m2697a() {
            C8282a.this.m2695c().m2705a(C8282a.this.f2951d);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2697a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.a$c */
    public /* synthetic */ class c extends AdaptedFunctionReference implements Function2, SuspendFunction {
        public c(Object obj) {
            super(2, obj, C8282a.class, "updateViewState", "updateViewState(Lcom/sdkit/paylib/paylibnative/ui/screens/cardsaving/CardSavingViewState;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(C8286e c8286e, Continuation continuation) {
            return C8282a.m2691b((C8282a) this.receiver, c8286e, continuation);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.a$d */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f2954a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f2955b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f2954a = abstractC8258f;
            this.f2955b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f2954a.m2480a(this.f2955b, C8284c.class);
            if (viewModelM2480a != null) {
                return (C8284c) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.cardsaving.CardSavingViewModel");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8282a(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator) {
        super(C11403R.layout.paylib_native_fragment_card_saving);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        this.f2948a = layoutInflaterThemeValidator;
        this.f2949b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new d(viewModelProvider, this));
        this.f2950c = AbstractC8376k.m3482a(this, a.f2952a);
    }

    /* renamed from: b */
    public final C8182e m2694b() {
        return (C8182e) this.f2950c.getValue(this, f2947e[0]);
    }

    /* renamed from: c */
    public final C8284c m2695c() {
        return (C8284c) this.f2949b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f2948a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        EnumC8265e enumC8265e;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            enumC8265e = (EnumC8265e) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("previous_screen", EnumC8265e.class) : arguments.getParcelable("previous_screen"));
        } else {
            enumC8265e = null;
        }
        this.f2951d = enumC8265e;
        m2694b().f2130c.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.a$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8282a.m2689a(this.f$0, view2);
            }
        });
        m2694b().f2131d.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.a$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8282a.m2692b(this.f$0, view2);
            }
        });
        AbstractC8365b.m3438a(this, new b());
        FlowKt.launchIn(FlowKt.onEach(m2695c().m2003c(), new c(this)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* renamed from: b */
    public static final /* synthetic */ Object m2691b(C8282a c8282a, C8286e c8286e, Continuation continuation) {
        c8282a.m2693a(c8286e);
        return Unit.INSTANCE;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b
    /* renamed from: a */
    public void mo2365a() {
        m2695c().m2705a((EnumC8265e) null);
    }

    /* renamed from: a */
    public static final void m2689a(C8282a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m2695c().m2708f();
    }

    /* renamed from: b */
    public static final void m2692b(C8282a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m2695c().m2707e();
    }

    /* renamed from: a */
    public final void m2693a(C8286e c8286e) {
        ConstraintLayout constraintLayout = m2694b().f2132e;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.content");
        constraintLayout.setVisibility(c8286e.m2717a() ^ true ? 0 : 8);
        ConstraintLayout root = m2694b().f2133f.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.loading.root");
        root.setVisibility(c8286e.m2717a() ? 0 : 8);
        FrameLayout root2 = m2694b().f2129b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.additionalTitle.root");
        root2.setVisibility(c8286e.m2718b() ? 0 : 8);
    }
}
