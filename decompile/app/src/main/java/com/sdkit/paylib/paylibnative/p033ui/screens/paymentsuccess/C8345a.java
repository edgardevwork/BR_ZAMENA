package com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
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
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8194o;
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
import kotlin.Pair;
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

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.a */
/* loaded from: classes7.dex */
public final class C8345a extends Fragment implements InterfaceC8243b {

    /* renamed from: a */
    public final C8103b f3501a;

    /* renamed from: b */
    public final Lazy f3502b;

    /* renamed from: c */
    public final ReadOnlyProperty f3503c;

    /* renamed from: d */
    public final Lazy f3504d;

    /* renamed from: f */
    public static final /* synthetic */ KProperty[] f3500f = {Reflection.property1(new PropertyReference1Impl(C8345a.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentPaymentSuccessBinding;", 0))};

    /* renamed from: e */
    public static final a f3499e = new a(null);

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.a$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final b f3505a = new b();

        public b() {
            super(1, C8194o.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentPaymentSuccessBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8194o invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8194o.m2145a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.a$c */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        /* renamed from: a */
        public final void m3269a() {
            C8345a.this.m3267d().m3295d();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3269a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.a$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3507a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.a$d$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: a */
            public int f3509a;

            /* renamed from: b */
            public final /* synthetic */ C8345a f3510b;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.a$d$a$a */
            /* loaded from: classes6.dex */
            public static final class C11940a implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ C8345a f3511a;

                public C11940a(C8345a c8345a) {
                    this.f3511a = c8345a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(C8350f c8350f, Continuation continuation) {
                    this.f3511a.m3264a(c8350f);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8345a c8345a, Continuation continuation) {
                super(2, continuation);
                this.f3510b = c8345a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f3510b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f3509a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowM2003c = this.f3510b.m3267d().m2003c();
                    C11940a c11940a = new C11940a(this.f3510b);
                    this.f3509a = 1;
                    if (stateFlowM2003c.collect(c11940a, this) == coroutine_suspended) {
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

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8345a.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3507a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8345a c8345a = C8345a.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(c8345a, null);
                this.f3507a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(c8345a, state, aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.a$e */
    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RequestManager invoke() {
            RequestManager requestManagerWith = Glide.with(C8345a.this.requireContext());
            Intrinsics.checkNotNullExpressionValue(requestManagerWith, "with(requireContext())");
            return requestManagerWith;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.a$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f3513a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f3514b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f3513a = abstractC8258f;
            this.f3514b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f3513a.m2480a(this.f3514b, C8348d.class);
            if (viewModelM2480a != null) {
                return (C8348d) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.PaymentSuccessViewModel");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8345a(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator) {
        super(C11403R.layout.paylib_native_fragment_payment_success);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        this.f3501a = layoutInflaterThemeValidator;
        this.f3502b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new f(viewModelProvider, this));
        this.f3503c = AbstractC8376k.m3482a(this, b.f3505a);
        this.f3504d = LazyKt__LazyJVMKt.lazy(new e());
    }

    /* renamed from: b */
    public final C8194o m3265b() {
        return (C8194o) this.f3503c.getValue(this, f3500f[0]);
    }

    /* renamed from: c */
    public final RequestManager m3266c() {
        return (RequestManager) this.f3504d.getValue();
    }

    /* renamed from: d */
    public final C8348d m3267d() {
        return (C8348d) this.f3502b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f3501a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(View view, Bundle bundle) {
        C8346b c8346b;
        Intrinsics.checkNotNullParameter(view, "view");
        m3265b().f2221c.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.a$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8345a.m3262a(this.f$0, view2);
            }
        });
        AbstractC8365b.m3438a(this, new c());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(null), 3, null);
        Bundle arguments = getArguments();
        if (arguments == null) {
            c8346b = new C8346b(false, null, null, false, null, 22, null);
        } else {
            c8346b = (C8346b) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("PARAMETERS_KEY", C8346b.class) : arguments.getParcelable("PARAMETERS_KEY"));
            if (c8346b == null) {
            }
        }
        m3267d().m3294a(c8346b.m3278d(), c8346b.m3276b(), c8346b.m3277c(), c8346b.m3279e(), c8346b.m3275a());
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b
    /* renamed from: a */
    public void mo2365a() {
        m3267d().m3295d();
    }

    /* renamed from: a */
    public static final void m3262a(C8345a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3267d().m3295d();
    }

    /* renamed from: a */
    public final void m3264a(C8350f c8350f) {
        Integer num;
        C8302e c8302eM3310b = c8350f.m3310b();
        if (c8302eM3310b != null) {
            C8198s c8198s = m3265b().f2222d;
            Intrinsics.checkNotNullExpressionValue(c8198s, "binding.invoiceDetails");
            AbstractC8370g.m3468a(c8198s, m3266c(), c8302eM3310b, c8350f.m3312d(), c8350f.m3313e());
            m3265b().f2223e.setText(getString(c8350f.m3311c()));
            Pair pairM3309a = c8350f.m3309a();
            if (pairM3309a != null && (num = (Integer) pairM3309a.getFirst()) != null) {
                int iIntValue = num.intValue();
                CharSequence charSequence = (CharSequence) c8350f.m3309a().getSecond();
                boolean z = !(charSequence == null || charSequence.length() == 0);
                TextView textView = m3265b().f2220b;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.additionalMessage");
                textView.setVisibility(z ? 0 : 8);
                m3265b().f2220b.setText(z ? getString(iIntValue, c8350f.m3309a().getSecond()) : getString(iIntValue));
            }
            TextView textView2 = m3265b().f2223e;
            Pair pairM3309a2 = c8350f.m3309a();
            textView2.setTypeface(textView2.getTypeface(), (pairM3309a2 != null ? (Integer) pairM3309a2.getFirst() : null) == null ? 0 : 1);
        }
    }
}
