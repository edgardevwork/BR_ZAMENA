package com.sdkit.paylib.paylibnative.p033ui.screens.cards;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8184f;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8198s;
import com.sdkit.paylib.paylibnative.p033ui.domain.AbstractC8217a;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import com.sdkit.paylib.paylibnative.p033ui.screens.cards.C8274a;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8376k;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8365b;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8370g;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8395a;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.b */
/* loaded from: classes5.dex */
public final class C8275b extends Fragment implements InterfaceC8243b {

    /* renamed from: a */
    public final C8103b f2846a;

    /* renamed from: b */
    public final Lazy f2847b;

    /* renamed from: c */
    public final ReadOnlyProperty f2848c;

    /* renamed from: d */
    public final Lazy f2849d;

    /* renamed from: e */
    public final Lazy f2850e;

    /* renamed from: g */
    public static final /* synthetic */ KProperty[] f2845g = {Reflection.property1(new PropertyReference1Impl(C8275b.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentCardsBinding;", 0))};

    /* renamed from: f */
    public static final b f2844f = new b(null);

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.b$a */
    /* loaded from: classes6.dex */
    public static final class a implements C8274a.b {

        /* renamed from: a */
        public final C8277d f2851a;

        /* renamed from: b */
        public final CoroutineScope f2852b;

        public a(C8277d vm, CoroutineScope scope) {
            Intrinsics.checkNotNullParameter(vm, "vm");
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.f2851a = vm;
            this.f2852b = scope;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.b$b */
    /* loaded from: classes8.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.b$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.b$c$a */
        public static final class a extends Lambda implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ C8275b f2854a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8275b c8275b) {
                super(1);
                this.f2854a = c8275b;
            }

            /* renamed from: a */
            public final void m2632a(C8395a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.f2854a.m2630e().m2653a(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m2632a((C8395a) obj);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C8274a invoke() {
            return new C8274a(C8275b.this.m2629d(), new a(C8275b.this));
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.b$d */
    /* loaded from: classes8.dex */
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final d f2855a = new d();

        public d() {
            super(1, C8184f.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentCardsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8184f invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8184f.m2125a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.b$e */
    /* loaded from: classes7.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f2856a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.b$e$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: a */
            public int f2858a;

            /* renamed from: b */
            public final /* synthetic */ C8275b f2859b;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.b$e$a$a */
            /* loaded from: classes6.dex */
            public static final class C11915a implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ C8275b f2860a;

                public C11915a(C8275b c8275b) {
                    this.f2860a = c8275b;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(C8279f c8279f, Continuation continuation) {
                    this.f2860a.m2626a(c8279f);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8275b c8275b, Continuation continuation) {
                super(2, continuation);
                this.f2859b = c8275b;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f2859b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f2858a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowM2003c = this.f2859b.m2630e().m2003c();
                    C11915a c11915a = new C11915a(this.f2859b);
                    this.f2858a = 1;
                    if (stateFlowM2003c.collect(c11915a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8275b.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2856a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8275b c8275b = C8275b.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(c8275b, null);
                this.f2856a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(c8275b, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.b$f */
    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        /* renamed from: a */
        public final void m2637a() {
            C8275b.this.m2630e().m2657f();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2637a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.b$g */
    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RequestManager invoke() {
            RequestManager requestManagerWith = Glide.with(C8275b.this.requireContext());
            Intrinsics.checkNotNullExpressionValue(requestManagerWith, "with(requireContext())");
            return requestManagerWith;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.b$h */
    public static final class h extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f2863a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f2864b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f2863a = abstractC8258f;
            this.f2864b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f2863a.m2480a(this.f2864b, C8277d.class);
            if (viewModelM2480a != null) {
                return (C8277d) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.cards.CardsViewModel");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8275b(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator) {
        super(C11403R.layout.paylib_native_fragment_cards);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        this.f2846a = layoutInflaterThemeValidator;
        this.f2847b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new h(viewModelProvider, this));
        this.f2848c = AbstractC8376k.m3482a(this, d.f2855a);
        this.f2849d = LazyKt__LazyJVMKt.lazy(new g());
        this.f2850e = LazyKt__LazyJVMKt.lazy(new c());
    }

    /* renamed from: b */
    public final C8274a m2627b() {
        return (C8274a) this.f2850e.getValue();
    }

    /* renamed from: c */
    public final C8184f m2628c() {
        return (C8184f) this.f2848c.getValue(this, f2845g[0]);
    }

    /* renamed from: d */
    public final RequestManager m2629d() {
        return (RequestManager) this.f2849d.getValue();
    }

    /* renamed from: e */
    public final C8277d m2630e() {
        return (C8277d) this.f2847b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f2846a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC8128b abstractC8128b;
        Intrinsics.checkNotNullParameter(view, "view");
        m2628c().f2148h.setAdapter(m2627b());
        FrameLayout root = m2628c().f2149i.f2259d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.title.backButton.root");
        root.setVisibility(0);
        m2628c().f2149i.f2259d.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.cards.b$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8275b.m2622a(this.f$0, view2);
            }
        });
        m2628c().f2143c.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.cards.b$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8275b.m2625b(this.f$0, view2);
            }
        });
        AbstractC8365b.m3438a(this, new f());
        Bundle arguments = getArguments();
        if (arguments != null) {
            abstractC8128b = (AbstractC8128b) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("ERROR_ACTION", AbstractC8128b.class) : arguments.getParcelable("ERROR_ACTION"));
        } else {
            abstractC8128b = null;
        }
        if (abstractC8128b != null && Intrinsics.areEqual(abstractC8128b, AbstractC8128b.h.f1940a)) {
            m2630e().m2659h();
        }
        m2627b().m2617a(new a(m2630e(), LifecycleOwnerKt.getLifecycleScope(this)));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b
    /* renamed from: a */
    public void mo2365a() {
        m2630e().m2655d();
    }

    /* renamed from: a */
    public static final void m2622a(C8275b this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m2630e().m2657f();
    }

    /* renamed from: b */
    public static final void m2625b(C8275b this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m2630e().m2658g();
    }

    /* renamed from: a */
    public final void m2626a(C8279f c8279f) {
        View view;
        AbstractC8217a abstractC8217aM2680f = c8279f.m2680f();
        if (Intrinsics.areEqual(abstractC8217aM2680f, AbstractC8217a.a.f2384a)) {
            C8198s c8198s = m2628c().f2145e;
            Intrinsics.checkNotNullExpressionValue(c8198s, "binding.invoiceDetails");
            AbstractC8370g.m3468a(c8198s, m2629d(), c8279f.m2678d(), c8279f.m2679e(), c8279f.m2681g());
            m2627b().m2618a(c8279f.m2677c());
            TextView textView = m2628c().f2149i.f2261f;
            int i = C11403R.string.paylib_native_payment_select_method_title;
            textView.setText(getString(i));
            m2628c().f2149i.f2258c.setText(getString(i));
            TextView textView2 = m2628c().f2149i.f2261f;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.title.titleLabel");
            textView2.setVisibility(c8279f.m2681g() ^ true ? 0 : 8);
            TextView textView3 = m2628c().f2149i.f2258c;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.title.additionalTitleLabel");
            textView3.setVisibility(c8279f.m2681g() ? 0 : 8);
            FrameLayout root = m2628c().f2149i.f2257b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.title.additionalInfo.root");
            root.setVisibility(c8279f.m2681g() ? 0 : 8);
            m2628c().f2143c.m1949a((CharSequence) getString(c8279f.m2676b()), true);
            PaylibButton paylibButton = m2628c().f2143c;
            Intrinsics.checkNotNullExpressionValue(paylibButton, "binding.btnAddCardAndPay");
            paylibButton.setVisibility(c8279f.m2675a() ? 0 : 8);
            FrameLayout root2 = m2628c().f2146f.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "binding.loading.root");
            root2.setVisibility(8);
            ConstraintLayout root3 = m2628c().f2145e.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "binding.invoiceDetails.root");
            root3.setVisibility(8);
            View view2 = m2628c().f2150j;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.viewDivider");
            view2.setVisibility(8);
            view = m2628c().f2144d;
            Intrinsics.checkNotNullExpressionValue(view, "binding.content");
        } else {
            if (!Intrinsics.areEqual(abstractC8217aM2680f, AbstractC8217a.b.f2385a)) {
                return;
            }
            ConstraintLayout constraintLayout = m2628c().f2144d;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.content");
            constraintLayout.setVisibility(8);
            FrameLayout root4 = m2628c().f2146f.getRoot();
            Intrinsics.checkNotNullExpressionValue(root4, "binding.loading.root");
            root4.setVisibility(0);
            ConstraintLayout root5 = m2628c().f2145e.getRoot();
            Intrinsics.checkNotNullExpressionValue(root5, "binding.invoiceDetails.root");
            root5.setVisibility(0);
            view = m2628c().f2150j;
            Intrinsics.checkNotNullExpressionValue(view, "binding.viewDivider");
        }
        view.setVisibility(0);
    }
}
