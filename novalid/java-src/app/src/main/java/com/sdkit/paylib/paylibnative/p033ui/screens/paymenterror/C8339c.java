package com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.common.view.C8127a;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8193n;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.AbstractC8337a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.AbstractC8338b;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8376k;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8365b;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.FlowKt;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.c */
/* loaded from: classes7.dex */
public final class C8339c extends Fragment implements InterfaceC8243b {

    /* renamed from: a */
    public final C8103b f3464a;

    /* renamed from: b */
    public final Lazy f3465b;

    /* renamed from: c */
    public final ReadOnlyProperty f3466c;

    /* renamed from: e */
    public static final /* synthetic */ KProperty[] f3463e = {Reflection.property1(new PropertyReference1Impl(C8339c.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentPaymentErrorBinding;", 0))};

    /* renamed from: d */
    public static final a f3462d = new a(null);

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.c$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final b f3467a = new b();

        public b() {
            super(1, C8193n.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentPaymentErrorBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8193n invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8193n.m2143a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.c$c */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        /* renamed from: a */
        public final void m3232a() {
            C8339c.this.m3229c().m3251f();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3232a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.c$d */
    public /* synthetic */ class d extends AdaptedFunctionReference implements Function2, SuspendFunction {
        public d(Object obj) {
            super(2, obj, C8339c.class, "renderViewState", "renderViewState(Lcom/sdkit/paylib/paylibnative/ui/screens/paymenterror/PaymentErrorViewState;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(C8344h c8344h, Continuation continuation) {
            return C8339c.m3222b((C8339c) this.receiver, c8344h, continuation);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.c$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f3469a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f3470b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f3469a = abstractC8258f;
            this.f3470b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f3469a.m2480a(this.f3470b, C8342f.class);
            if (viewModelM2480a != null) {
                return (C8342f) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.paymenterror.PaymentErrorViewModel");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8339c(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator) {
        super(C11403R.layout.paylib_native_fragment_payment_error);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        this.f3464a = layoutInflaterThemeValidator;
        this.f3465b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e(viewModelProvider, this));
        this.f3466c = AbstractC8376k.m3482a(this, b.f3467a);
    }

    /* renamed from: b */
    public final C8193n m3227b() {
        return (C8193n) this.f3466c.getValue(this, f3463e[0]);
    }

    /* renamed from: c */
    public final C8342f m3229c() {
        return (C8342f) this.f3465b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f3464a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0025  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        C8340d c8340d;
        String strM3210c;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments == null) {
            c8340d = new C8340d(null, new AbstractC8337a.a(C11403R.string.paylib_native_payment_unknown_error, null, null), new C8261a(EnumC8262b.NONE, AbstractC8128b.a.f1932a), false, EnumC8105d.RESULT_UNKNOWN, null, 41, null);
        } else {
            c8340d = (C8340d) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("PARAMETERS_KEY", C8340d.class) : arguments.getParcelable("PARAMETERS_KEY"));
            if (c8340d == null) {
            }
        }
        AbstractC8365b.m3438a(this, new c());
        TextView textView = m3227b().f2216e;
        AbstractC8337a abstractC8337aM3238c = c8340d.m3238c();
        if (abstractC8337aM3238c instanceof AbstractC8337a.a) {
            strM3210c = getResources().getString(((AbstractC8337a.a) c8340d.m3238c()).m3207c());
        } else {
            if (!(abstractC8337aM3238c instanceof AbstractC8337a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            strM3210c = ((AbstractC8337a.b) c8340d.m3238c()).m3210c();
        }
        textView.setText(strM3210c);
        m3228b(c8340d);
        m3225a(c8340d);
        m3230c(c8340d);
        m3229c().m3248a(c8340d);
        FlowKt.launchIn(FlowKt.onEach(m3229c().m2003c(), new d(this)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* renamed from: b */
    public static final /* synthetic */ Object m3222b(C8339c c8339c, C8344h c8344h, Continuation continuation) {
        c8339c.m3226a(c8344h);
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public static final void m3224c(C8339c this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3229c().m3250e();
    }

    /* renamed from: b */
    public static final void m3223b(C8339c this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3229c().m3251f();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b
    /* renamed from: a */
    public void mo2365a() {
        m3229c().m3251f();
    }

    /* renamed from: c */
    public final void m3230c(C8340d c8340d) {
        String string;
        ConstraintLayout root = m3227b().f2217f.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.title.root");
        root.setVisibility(c8340d.m3240e() != null ? 0 : 8);
        AbstractC8338b abstractC8338bM3240e = c8340d.m3240e();
        if (abstractC8338bM3240e instanceof AbstractC8338b.b) {
            string = ((AbstractC8338b.b) abstractC8338bM3240e).m3216a();
        } else if (abstractC8338bM3240e instanceof AbstractC8338b.a) {
            string = getString(((AbstractC8338b.a) abstractC8338bM3240e).m3213a());
        } else {
            if (abstractC8338bM3240e != null) {
                throw new NoWhenBranchMatchedException();
            }
            string = null;
        }
        m3227b().f2217f.f2261f.setText(string);
        m3227b().f2217f.f2258c.setText(string);
        FrameLayout root2 = m3227b().f2217f.f2259d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.title.backButton.root");
        ConstraintLayout root3 = m3227b().f2217f.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "binding.title.root");
        root2.setVisibility(root3.getVisibility() == 0 ? 0 : 8);
        m3227b().f2217f.f2259d.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.c$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8339c.m3224c(this.f$0, view);
            }
        });
    }

    /* renamed from: a */
    public static final void m3221a(C8339c this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3229c().m3249d();
    }

    /* renamed from: b */
    public final void m3228b(C8340d c8340d) {
        Resources resources;
        int i;
        PaylibButton paylibButton = m3227b().f2215d;
        Intrinsics.checkNotNullExpressionValue(paylibButton, "binding.buttonCancel");
        if (c8340d.m3236a().m2502a().m1976a()) {
            resources = getResources();
            i = C11403R.string.paylib_native_payment_cancel;
        } else {
            resources = getResources();
            i = C11403R.string.paylib_native_payment_close;
        }
        PaylibButton.m1943a(paylibButton, resources.getString(i), false, 2, null);
        m3227b().f2215d.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.c$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8339c.m3223b(this.f$0, view);
            }
        });
        PaylibButton paylibButton2 = m3227b().f2215d;
        Intrinsics.checkNotNullExpressionValue(paylibButton2, "binding.buttonCancel");
        paylibButton2.setVisibility(c8340d.m3237b() ? 0 : 8);
    }

    /* renamed from: a */
    public final void m3225a(C8340d c8340d) {
        PaylibButton paylibButton = m3227b().f2214c;
        Intrinsics.checkNotNullExpressionValue(paylibButton, "binding.buttonAction");
        paylibButton.setVisibility(c8340d.m3236a().m2502a().m1976a() ? 0 : 8);
        m3227b().f2214c.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.c$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8339c.m3221a(this.f$0, view);
            }
        });
        PaylibButton paylibButton2 = m3227b().f2214c;
        Intrinsics.checkNotNullExpressionValue(paylibButton2, "binding.buttonAction");
        AbstractC8128b abstractC8128bM2502a = c8340d.m3236a().m2502a();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        PaylibButton.m1942a(paylibButton2, abstractC8128bM2502a.m1975a(resources), c8340d.m3237b() ? C8127a.f1924d.m1971a() : C8127a.f1924d.m1972b(), false, 4, null);
    }

    /* renamed from: a */
    public final void m3226a(C8344h c8344h) {
        TextView textView = m3227b().f2218g;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.traceIdView");
        int i = 8;
        textView.setVisibility(c8344h.m3260c() ? 0 : 8);
        m3227b().f2218g.setText(c8344h.m3258a());
        TextView textView2 = m3227b().f2217f.f2261f;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.title.titleLabel");
        textView2.setVisibility(c8344h.m3259b() ^ true ? 0 : 8);
        TextView textView3 = m3227b().f2217f.f2258c;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.title.additionalTitleLabel");
        textView3.setVisibility(c8344h.m3259b() ? 0 : 8);
        FrameLayout root = m3227b().f2217f.f2257b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.title.additionalInfo.root");
        root.setVisibility(c8344h.m3259b() ? 0 : 8);
        FrameLayout root2 = m3227b().f2213b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.additionalTitle.root");
        if (c8344h.m3259b()) {
            ConstraintLayout root3 = m3227b().f2217f.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "binding.title.root");
            if (root3.getVisibility() != 0) {
                i = 0;
            }
        }
        root2.setVisibility(i);
    }
}
