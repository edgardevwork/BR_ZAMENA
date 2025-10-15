package com.sdkit.paylib.paylibnative.p033ui.screens.manualupdate;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8188i;
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

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.a */
/* loaded from: classes7.dex */
public final class C8314a extends Fragment implements InterfaceC8243b {

    /* renamed from: e */
    public static final /* synthetic */ KProperty[] f3217e = {Reflection.property1(new PropertyReference1Impl(C8314a.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentManualUpdateBinding;", 0))};

    /* renamed from: a */
    public final C8103b f3218a;

    /* renamed from: b */
    public final Lazy f3219b;

    /* renamed from: c */
    public final ReadOnlyProperty f3220c;

    /* renamed from: d */
    public final Lazy f3221d;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.a$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final a f3222a = new a();

        public a() {
            super(1, C8188i.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentManualUpdateBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8188i invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8188i.m2133a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.a$b */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        /* renamed from: a */
        public final void m2962a() {
            C8314a.this.m2960d().m2974e();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2962a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.a$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3224a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.a$c$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: a */
            public int f3226a;

            /* renamed from: b */
            public final /* synthetic */ C8314a f3227b;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.a$c$a$a */
            /* loaded from: classes6.dex */
            public static final class C11928a implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ C8314a f3228a;

                public C11928a(C8314a c8314a) {
                    this.f3228a = c8314a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(C8318e c8318e, Continuation continuation) {
                    this.f3228a.m2957a(c8318e);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8314a c8314a, Continuation continuation) {
                super(2, continuation);
                this.f3227b = c8314a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f3227b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f3226a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowM2003c = this.f3227b.m2960d().m2003c();
                    C11928a c11928a = new C11928a(this.f3227b);
                    this.f3226a = 1;
                    if (stateFlowM2003c.collect(c11928a, this) == coroutine_suspended) {
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

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8314a.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3224a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8314a c8314a = C8314a.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(c8314a, null);
                this.f3224a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(c8314a, state, aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.a$d */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RequestManager invoke() {
            RequestManager requestManagerWith = Glide.with(C8314a.this.requireContext());
            Intrinsics.checkNotNullExpressionValue(requestManagerWith, "with(requireContext())");
            return requestManagerWith;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.a$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f3230a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f3231b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f3230a = abstractC8258f;
            this.f3231b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f3230a.m2480a(this.f3231b, C8316c.class);
            if (viewModelM2480a != null) {
                return (C8316c) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.manualupdate.ManualUpdateViewModel");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8314a(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator) {
        super(C11403R.layout.paylib_native_fragment_manual_update);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        this.f3218a = layoutInflaterThemeValidator;
        this.f3219b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e(viewModelProvider, this));
        this.f3220c = AbstractC8376k.m3482a(this, a.f3222a);
        this.f3221d = LazyKt__LazyJVMKt.lazy(new d());
    }

    /* renamed from: b */
    public final C8188i m2958b() {
        return (C8188i) this.f3220c.getValue(this, f3217e[0]);
    }

    /* renamed from: c */
    public final RequestManager m2959c() {
        return (RequestManager) this.f3221d.getValue();
    }

    /* renamed from: d */
    public final C8316c m2960d() {
        return (C8316c) this.f3219b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f3218a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m2960d().m2973d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        AbstractC8365b.m3438a(this, new b());
        m2958b().f2171b.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.a$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8314a.m2954a(this.f$0, view2);
            }
        });
        m2958b().f2172c.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.a$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8314a.m2956b(this.f$0, view2);
            }
        });
        PaylibButton paylibButton = m2958b().f2172c;
        Intrinsics.checkNotNullExpressionValue(paylibButton, "binding.buttonUpdate");
        Context context = getContext();
        PaylibButton.m1943a(paylibButton, context != null ? context.getString(C11403R.string.paylib_native_update) : null, false, 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(null), 3, null);
    }

    /* renamed from: b */
    public static final void m2956b(C8314a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m2960d().m2977h();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b
    /* renamed from: a */
    public void mo2365a() {
        m2960d().m2974e();
    }

    /* renamed from: a */
    public static final void m2954a(C8314a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m2960d().m2974e();
    }

    /* renamed from: a */
    public final void m2957a(C8318e c8318e) {
        C8302e c8302eM2987a = c8318e.m2987a();
        if (c8302eM2987a != null) {
            C8198s c8198s = m2958b().f2173d;
            Intrinsics.checkNotNullExpressionValue(c8198s, "binding.invoiceDetails");
            AbstractC8370g.m3468a(c8198s, m2959c(), c8302eM2987a, c8318e.m2989b(), c8318e.m2990c());
        }
    }
}
