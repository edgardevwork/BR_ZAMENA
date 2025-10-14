package com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8186g;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8198s;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8376k;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8365b;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8370g;
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

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.a */
/* loaded from: classes5.dex */
public final class C8287a extends Fragment implements InterfaceC8243b {

    /* renamed from: a */
    public final C8103b f2971a;

    /* renamed from: b */
    public final PaylibLogger f2972b;

    /* renamed from: c */
    public final Lazy f2973c;

    /* renamed from: d */
    public final ReadOnlyProperty f2974d;

    /* renamed from: e */
    public final Lazy f2975e;

    /* renamed from: g */
    public static final /* synthetic */ KProperty[] f2970g = {Reflection.property1(new PropertyReference1Impl(C8287a.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentDeeplinkResultBinding;", 0))};

    /* renamed from: f */
    public static final a f2969f = new a(null);

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.a$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final b f2976a = new b();

        public b() {
            super(1, C8186g.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentDeeplinkResultBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8186g invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8186g.m2129a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.a$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public static final c f2977a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "onPause";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.a$d */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        /* renamed from: a */
        public final void m2728a() {
            C8287a.this.m2725d().m2760e();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2728a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.a$e */
    /* loaded from: classes7.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f2979a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.a$e$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: a */
            public int f2981a;

            /* renamed from: b */
            public final /* synthetic */ C8287a f2982b;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.a$e$a$a */
            /* loaded from: classes6.dex */
            public static final class C11923a implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ C8287a f2983a;

                public C11923a(C8287a c8287a) {
                    this.f2983a = c8287a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(C8293g c8293g, Continuation continuation) {
                    this.f2983a.m2722a(c8293g);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8287a c8287a, Continuation continuation) {
                super(2, continuation);
                this.f2982b = c8287a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f2982b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f2981a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowM2003c = this.f2982b.m2725d().m2003c();
                    C11923a c11923a = new C11923a(this.f2982b);
                    this.f2981a = 1;
                    if (stateFlowM2003c.collect(c11923a, this) == coroutine_suspended) {
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
            return C8287a.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2979a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8287a c8287a = C8287a.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(c8287a, null);
                this.f2979a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(c8287a, state, aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.a$f */
    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RequestManager invoke() {
            RequestManager requestManagerWith = Glide.with(C8287a.this.requireContext());
            Intrinsics.checkNotNullExpressionValue(requestManagerWith, "with(requireContext())");
            return requestManagerWith;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.a$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f2985a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f2986b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f2985a = abstractC8258f;
            this.f2986b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f2985a.m2480a(this.f2986b, C8290d.class);
            if (viewModelM2480a != null) {
                return (C8290d) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.DeeplinkResultViewModel");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8287a(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator, PaylibLoggerFactory loggerFactory) {
        super(C11403R.layout.paylib_native_fragment_deeplink_result);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2971a = layoutInflaterThemeValidator;
        this.f2972b = loggerFactory.get("DeeplinkResultFragment");
        this.f2973c = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new g(viewModelProvider, this));
        this.f2974d = AbstractC8376k.m3482a(this, b.f2976a);
        this.f2975e = LazyKt__LazyJVMKt.lazy(new f());
    }

    /* renamed from: b */
    public final C8186g m2723b() {
        return (C8186g) this.f2974d.getValue(this, f2970g[0]);
    }

    /* renamed from: c */
    public final RequestManager m2724c() {
        return (RequestManager) this.f2975e.getValue();
    }

    /* renamed from: d */
    public final C8290d m2725d() {
        return (C8290d) this.f2973c.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        m2725d().m2749a(getArguments());
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f2971a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        PaylibLogger.DefaultImpls.d$default(this.f2972b, null, c.f2977a, 1, null);
        m2725d().m2764i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        AbstractC8365b.m3438a(this, new d());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
        m2723b().f2156b.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.a$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8287a.m2720a(this.f$0, view2);
            }
        });
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b
    /* renamed from: a */
    public void mo2365a() {
        m2725d().m2760e();
    }

    /* renamed from: a */
    public static final void m2720a(C8287a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m2725d().m2760e();
    }

    /* renamed from: a */
    public final void m2722a(C8293g c8293g) {
        C8302e c8302eM2785a = c8293g.m2785a();
        if (c8302eM2785a != null) {
            C8198s c8198s = m2723b().f2157c;
            Intrinsics.checkNotNullExpressionValue(c8198s, "binding.invoiceDetails");
            AbstractC8370g.m3468a(c8198s, m2724c(), c8302eM2785a, c8293g.m2786b(), c8293g.m2788d());
            m2723b().f2158d.f2243c.setText(c8293g.m2787c());
            TextView textView = m2723b().f2158d.f2243c;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.loading.loadingUserMessage");
            textView.setVisibility(c8293g.m2787c() != null ? 0 : 8);
        }
    }
}
