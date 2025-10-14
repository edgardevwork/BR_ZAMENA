package com.sdkit.paylib.paylibnative.p033ui.screens.payment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.sdkit.paylib.paylibdomain.api.entity.AsyncState;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8192m;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8198s;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8376k;
import com.sdkit.paylib.paylibnative.p033ui.utils.C8362d;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8370g;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
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

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.a */
/* loaded from: classes7.dex */
public final class C8332a extends Fragment implements InterfaceC8243b {

    /* renamed from: f */
    public static final /* synthetic */ KProperty[] f3387f = {Reflection.property1(new PropertyReference1Impl(C8332a.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentPaymentBinding;", 0))};

    /* renamed from: a */
    public final C8103b f3388a;

    /* renamed from: b */
    public final Lazy f3389b;

    /* renamed from: c */
    public final ReadOnlyProperty f3390c;

    /* renamed from: d */
    public final Lazy f3391d;

    /* renamed from: e */
    public final Lazy f3392e;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.a$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final a f3393a = new a();

        public a() {
            super(1, C8192m.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentPaymentBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8192m invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8192m.m2141a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.a$b */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Transition invoke() {
            return C8332a.this.m3147e();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.a$c */
    public /* synthetic */ class c extends AdaptedFunctionReference implements Function2, SuspendFunction {
        public c(Object obj) {
            super(2, obj, C8332a.class, "renderViewState", "renderViewState(Lcom/sdkit/paylib/paylibnative/ui/screens/payment/PaymentViewState;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(C8336e c8336e, Continuation continuation) {
            return C8332a.m3140b((C8332a) this.receiver, c8336e, continuation);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.a$d */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RequestManager invoke() {
            RequestManager requestManagerWith = Glide.with(C8332a.this.requireContext());
            Intrinsics.checkNotNullExpressionValue(requestManagerWith, "with(requireContext())");
            return requestManagerWith;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.a$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f3396a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f3397b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f3396a = abstractC8258f;
            this.f3397b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f3396a.m2480a(this.f3397b, C8334c.class);
            if (viewModelM2480a != null) {
                return (C8334c) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.payment.PaymentViewModel");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8332a(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator) {
        super(C11403R.layout.paylib_native_fragment_payment);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        this.f3388a = layoutInflaterThemeValidator;
        this.f3389b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e(viewModelProvider, this));
        this.f3390c = AbstractC8376k.m3482a(this, a.f3393a);
        this.f3391d = LazyKt__LazyJVMKt.lazy(new d());
        this.f3392e = LazyKt__LazyJVMKt.lazy(new b());
    }

    /* renamed from: b */
    public final C8192m m3144b() {
        return (C8192m) this.f3390c.getValue(this, f3387f[0]);
    }

    /* renamed from: c */
    public final Transition m3145c() {
        return (Transition) this.f3392e.getValue();
    }

    /* renamed from: d */
    public final RequestManager m3146d() {
        return (RequestManager) this.f3391d.getValue();
    }

    /* renamed from: e */
    public final Transition m3147e() {
        Transition duration = new C8362d().addTarget(m3144b().f2209d.f2235c).addTarget(m3144b().f2209d.f2239g).addTarget(m3144b().f2209d.f2238f).addTarget(m3144b().f2211f).addTarget(m3144b().f2210e.getRoot()).addTarget(m3144b().f2207b).setDuration(300L);
        Intrinsics.checkNotNullExpressionValue(duration, "MoveAndFadeTransition()\n…ation(ANIMATION_DURATION)");
        return duration;
    }

    /* renamed from: f */
    public final C8334c m3148f() {
        return (C8334c) this.f3389b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        m3148f().m3172a(getArguments(), this);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f3388a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        m3144b().f2207b.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.payment.a$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8332a.m3139a(this.f$0, view2);
            }
        });
        FlowKt.launchIn(FlowKt.onEach(m3148f().m2003c(), new c(this)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* renamed from: b */
    public static final /* synthetic */ Object m3140b(C8332a c8332a, C8336e c8336e, Continuation continuation) {
        c8332a.m3141a(c8336e);
        return Unit.INSTANCE;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b
    /* renamed from: a */
    public void mo2365a() {
        m3148f().m3182e();
    }

    /* renamed from: a */
    public static final void m3139a(C8332a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3148f().m3182e();
    }

    /* renamed from: a */
    public final void m3141a(C8336e c8336e) {
        if (c8336e.m3203d() instanceof AsyncState.Content) {
            return;
        }
        boolean zContains = CollectionsKt___CollectionsKt.contains(CollectionsKt__CollectionsKt.listOf((Object[]) new AsyncState[]{AsyncState.Loading.INSTANCE, AsyncState.None.INSTANCE}), c8336e.m3203d());
        m3143a(zContains, zContains);
        m3142a(c8336e.m3201b());
        C8198s c8198s = m3144b().f2209d;
        Intrinsics.checkNotNullExpressionValue(c8198s, "binding.invoiceDetails");
        AbstractC8370g.m3468a(c8198s, m3146d(), c8336e.m3199a(), c8336e.m3202c(), c8336e.m3204e());
    }

    /* renamed from: a */
    public final void m3142a(String str) {
        m3144b().f2210e.f2243c.setText(str);
        TextView textView = m3144b().f2210e.f2243c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.loading.loadingUserMessage");
        textView.setVisibility(str != null ? 0 : 8);
    }

    /* renamed from: a */
    public final void m3143a(boolean z, boolean z2) {
        TransitionManager.beginDelayedTransition(m3144b().f2208c, m3145c());
        ConstraintLayout root = m3144b().f2210e.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.loading.root");
        root.setVisibility(z ? 0 : 8);
        PaylibButton paylibButton = m3144b().f2207b;
        Intrinsics.checkNotNullExpressionValue(paylibButton, "binding.btnCancel");
        paylibButton.setVisibility(z2 ? 8 : 0);
    }
}
