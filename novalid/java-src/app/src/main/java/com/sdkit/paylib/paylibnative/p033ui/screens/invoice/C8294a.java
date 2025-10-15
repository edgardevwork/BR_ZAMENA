package com.sdkit.paylib.paylibnative.p033ui.screens.invoice;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.common.AbstractC8102a;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8187h;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8198s;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8301d;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8376k;
import com.sdkit.paylib.paylibnative.p033ui.utils.C8362d;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8365b;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8370g;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8418d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.PaymentWaysView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a */
/* loaded from: classes5.dex */
public final class C8294a extends Fragment implements InterfaceC8243b {

    /* renamed from: h */
    public static final /* synthetic */ KProperty[] f3043h = {Reflection.property1(new PropertyReference1Impl(C8294a.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentInvoiceDetailsBinding;", 0))};

    /* renamed from: a */
    public final C8103b f3044a;

    /* renamed from: b */
    public final PaylibLogger f3045b;

    /* renamed from: c */
    public final Lazy f3046c;

    /* renamed from: d */
    public final ReadOnlyProperty f3047d;

    /* renamed from: e */
    public final Lazy f3048e;

    /* renamed from: f */
    public final Lazy f3049f;

    /* renamed from: g */
    public Animator f3050g;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final a f3051a = new a();

        public a() {
            super(1, C8187h.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentInvoiceDetailsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8187h invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8187h.m2131a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public static final b f3052a = new b();

        public b() {
            super(0);
        }

        /* renamed from: a */
        public final void m2817a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2817a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$c$a */
        public static final class a extends Lambda implements Function0 {

            /* renamed from: a */
            public final /* synthetic */ C8294a f3054a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8294a c8294a) {
                super(0);
                this.f3054a = c8294a;
            }

            /* renamed from: a */
            public final void m2819a() {
                TextView textView = this.f3054a.m2808b().f2164e;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.offerInfoLabel");
                textView.setVisibility(8);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2819a();
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(0);
        }

        /* renamed from: a */
        public final void m2818a() {
            C8294a c8294a = C8294a.this;
            c8294a.m2805a(new a(c8294a));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2818a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$d */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Transition invoke() {
            return C8294a.this.m2813e();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$e */
    /* loaded from: classes7.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3056a;

        /* renamed from: b */
        public /* synthetic */ Object f3057b;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(String str, Continuation continuation) {
            return ((e) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = C8294a.this.new e(continuation);
            eVar.f3057b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3056a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C8294a.this.m2804a((String) this.f3057b);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$f */
    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        /* renamed from: a */
        public final void m2822a() {
            C8294a.this.m2814f().m2860j();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2822a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$g */
    public /* synthetic */ class g extends AdaptedFunctionReference implements Function2, SuspendFunction {
        public g(Object obj) {
            super(2, obj, C8294a.class, "renderViewState", "renderViewState(Lcom/sdkit/paylib/paylibnative/ui/screens/invoice/viewobjects/InvoiceDetailsViewState;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(C8301d c8301d, Continuation continuation) {
            return C8294a.m2795b((C8294a) this.receiver, c8301d, continuation);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$h */
    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RequestManager invoke() {
            RequestManager requestManagerWith = Glide.with(C8294a.this.requireContext());
            Intrinsics.checkNotNullExpressionValue(requestManagerWith, "with(requireContext())");
            return requestManagerWith;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$i */
    public static final class i extends Lambda implements Function0 {

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$i$a */
        public static final class a extends Lambda implements Function0 {

            /* renamed from: a */
            public final /* synthetic */ C8294a f3062a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8294a c8294a) {
                super(0);
                this.f3062a = c8294a;
            }

            /* renamed from: a */
            public final void m2827a() {
                TextView textView = this.f3062a.m2808b().f2164e;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.offerInfoLabel");
                textView.setVisibility(0);
                this.f3062a.m2808b().f2167h.setPadding(0, 0, 0, this.f3062a.getResources().getDimensionPixelSize(C11403R.dimen.paylib_offer_info_label_height));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2827a();
                return Unit.INSTANCE;
            }
        }

        public i() {
            super(0);
        }

        /* renamed from: a */
        public final void m2826a() {
            C8294a c8294a = C8294a.this;
            c8294a.m2805a(new a(c8294a));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2826a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$j */
    public static final class j extends Lambda implements Function0 {

        /* renamed from: a */
        public static final j f3063a = new j();

        public j() {
            super(0);
        }

        /* renamed from: a */
        public final void m2828a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2828a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$k */
    public static final class k extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f3064a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f3065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f3064a = abstractC8258f;
            this.f3065b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f3064a.m2480a(this.f3065b, C8296c.class);
            if (viewModelM2480a != null) {
                return (C8296c) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.invoice.InvoiceDetailsViewModel");
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$l */
    public static final class l extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function0 f3066a;

        /* renamed from: b */
        public final /* synthetic */ Function0 f3067b;

        public l(Function0 function0, Function0 function02) {
            this.f3066a = function0;
            this.f3067b = function02;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationEnd(animation);
            this.f3067b.invoke();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f3066a.invoke();
            super.onAnimationStart(animation);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$m */
    public static final class m extends Lambda implements Function1 {

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$m$a */
        public static final class a extends Lambda implements Function0 {

            /* renamed from: a */
            public final /* synthetic */ C8294a f3069a;

            /* renamed from: b */
            public final /* synthetic */ int f3070b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8294a c8294a, int i) {
                super(0);
                this.f3069a = c8294a;
                this.f3070b = i;
            }

            /* renamed from: a */
            public final void m2831a() {
                this.f3069a.m2808b().f2166g.setBackgroundColor(this.f3070b);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2831a();
                return Unit.INSTANCE;
            }
        }

        public m() {
            super(1);
        }

        /* renamed from: a */
        public final void m2830a(int i) {
            C8294a c8294a = C8294a.this;
            c8294a.m2805a(new a(c8294a, i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2830a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$n */
    public static final class n extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f3071a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.f3071a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot open uri == " + this.f3071a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8294a(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator, PaylibLoggerFactory loggerFactory) {
        super(C11403R.layout.paylib_native_fragment_invoice_details);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f3044a = layoutInflaterThemeValidator;
        this.f3045b = loggerFactory.get("InvoiceDetailsFragment");
        this.f3046c = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new k(viewModelProvider, this));
        this.f3047d = AbstractC8376k.m3482a(this, a.f3051a);
        this.f3048e = LazyKt__LazyJVMKt.lazy(new h());
        this.f3049f = LazyKt__LazyJVMKt.lazy(new d());
    }

    /* renamed from: a */
    public final int m2799a(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return ContextCompat.getColor(context, typedValue.resourceId);
    }

    /* renamed from: c */
    public final Transition m2811c() {
        return (Transition) this.f3049f.getValue();
    }

    /* renamed from: d */
    public final RequestManager m2812d() {
        return (RequestManager) this.f3048e.getValue();
    }

    /* renamed from: e */
    public final Transition m2813e() {
        Transition duration = new C8362d().addTarget(m2808b().f2161b.getRoot()).addTarget(m2808b().f2162c.getRoot()).addTarget(m2808b().f2169j).addTarget(m2808b().f2163d.getRoot()).addTarget(m2808b().f2167h).addTarget(m2808b().f2165f).setDuration(300L);
        Intrinsics.checkNotNullExpressionValue(duration, "MoveAndFadeTransition()\n…ation(ANIMATION_DURATION)");
        return duration;
    }

    /* renamed from: f */
    public final C8296c m2814f() {
        return (C8296c) this.f3046c.getValue();
    }

    /* renamed from: g */
    public final void m2815g() {
        CharSequence text = m2808b().f2164e.getText();
        Intrinsics.checkNotNullExpressionValue(text, "binding.offerInfoLabel.text");
        SpannableString spannableStringValueOf = SpannableString.valueOf(text);
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "valueOf(this)");
        Context context = m2808b().f2164e.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.offerInfoLabel.context");
        spannableStringValueOf.setSpan(new ForegroundColorSpan(m2799a(context, C11403R.attr.paylib_native_card_widget_card_change_card_color)), StringsKt__StringsKt.lastIndexOf$default((CharSequence) spannableStringValueOf, " ", 0, false, 6, (Object) null), spannableStringValueOf.length(), 33);
        m2808b().f2164e.setText(spannableStringValueOf, TextView.BufferType.SPANNABLE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        AbstractC8128b abstractC8128b;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            abstractC8128b = (AbstractC8128b) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("ERROR_ACTION", AbstractC8128b.class) : arguments.getParcelable("ERROR_ACTION"));
        } else {
            abstractC8128b = null;
        }
        if (abstractC8128b != null) {
            m2814f().m2851a(abstractC8128b);
        }
        FlowKt.launchIn(FlowKt.onEach(m2814f().m2858h(), new e(null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f3044a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        m2808b().f2161b.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8294a.m2791a(this.f$0, view2);
            }
        });
        AbstractC8365b.m3438a(this, new f());
        m2808b().f2165f.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8294a.m2796b(this.f$0, view2);
            }
        });
        FlowKt.launchIn(FlowKt.onEach(m2814f().m2003c(), new g(this)), LifecycleOwnerKt.getLifecycleScope(this));
        PaymentWaysView paymentWaysView = m2808b().f2167h;
        InterfaceC8418d interfaceC8418dM2856f = m2814f().m2856f();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        paymentWaysView.m3630a(interfaceC8418dM2856f, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        getLifecycle().addObserver(m2808b().f2167h);
        m2815g();
        m2808b().f2164e.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.invoice.a$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8294a.m2798c(this.f$0, view2);
            }
        });
    }

    /* renamed from: b */
    public final C8187h m2808b() {
        return (C8187h) this.f3047d.getValue(this, f3043h[0]);
    }

    /* renamed from: b */
    public static final /* synthetic */ Object m2795b(C8294a c8294a, C8301d c8301d, Continuation continuation) {
        c8294a.m2810b(c8301d);
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public static final void m2798c(C8294a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m2814f().m2866p();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b
    /* renamed from: a */
    public void mo2365a() {
        m2814f().m2860j();
    }

    /* renamed from: b */
    public final void m2809b(int i2, int i3) {
        m2806a(new IntRange(0, 1), new IntRange(100, 0), new i(), j.f3063a, i2, i3);
    }

    /* renamed from: b */
    public static final void m2796b(C8294a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m2814f().m2864n();
        this$0.m2808b().f2165f.setEnabled(false);
    }

    /* renamed from: a */
    public final void m2800a(int i2, int i3) {
        TextView textView = m2808b().f2164e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.offerInfoLabel");
        if (textView.getVisibility() == 0) {
            m2806a(new IntRange(1, 0), new IntRange(0, 100), b.f3052a, new c(), i2, i3);
        }
    }

    /* renamed from: a */
    public static final void m2791a(C8294a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m2814f().m2860j();
    }

    /* renamed from: b */
    public final void m2810b(C8301d c8301d) {
        m2802a(c8301d);
        m2803a(c8301d.m2894a(), c8301d.m2897d(), c8301d.m2901h());
        m2807a(c8301d.m2898e());
    }

    /* renamed from: a */
    public final void m2801a(C8301d.a aVar) {
        PaylibButton paylibButton = m2808b().f2165f;
        AbstractC8128b abstractC8128bM2902a = aVar.m2902a();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        paylibButton.m1948a(abstractC8128bM2902a.m1975a(resources), aVar.m2903b(), true);
    }

    /* renamed from: a */
    public final void m2802a(C8301d c8301d) {
        TransitionManager.beginDelayedTransition(m2808b().f2168i, m2811c());
        ConstraintLayout root = m2808b().f2162c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.invoiceDetails.root");
        root.setVisibility(c8301d.m2895b() ? 0 : 8);
        View view = m2808b().f2169j;
        Intrinsics.checkNotNullExpressionValue(view, "binding.viewDivider");
        view.setVisibility(c8301d.m2895b() ? 0 : 8);
        FrameLayout root2 = m2808b().f2163d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.loading.root");
        root2.setVisibility(c8301d.m2896c() ? 0 : 8);
        FrameLayout root3 = m2808b().f2161b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "binding.iconClose.root");
        root3.setVisibility(c8301d.m2896c() ^ true ? 0 : 8);
        PaymentWaysView paymentWaysView = m2808b().f2167h;
        Intrinsics.checkNotNullExpressionValue(paymentWaysView, "binding.paymentWays");
        paymentWaysView.setVisibility(c8301d.m2900g() ? 0 : 8);
        PaylibButton paylibButton = m2808b().f2165f;
        Intrinsics.checkNotNullExpressionValue(paylibButton, "binding.paymentButton");
        paylibButton.setVisibility(c8301d.m2899f() != null ? 0 : 8);
        C8301d.a aVarM2899f = c8301d.m2899f();
        if (aVarM2899f != null) {
            m2801a(aVarM2899f);
        }
    }

    /* renamed from: a */
    public final void m2803a(C8302e c8302e, boolean z, boolean z2) {
        C8198s c8198s = m2808b().f2162c;
        Intrinsics.checkNotNullExpressionValue(c8198s, "binding.invoiceDetails");
        AbstractC8370g.m3468a(c8198s, m2812d(), c8302e, z, z2);
    }

    /* renamed from: a */
    public final void m2804a(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            PaylibLogger.DefaultImpls.e$default(this.f3045b, null, new n(str), 1, null);
        }
    }

    /* renamed from: a */
    public final void m2805a(Function0 function0) {
        if (getView() != null) {
            function0.invoke();
        }
    }

    /* renamed from: a */
    public final void m2806a(IntRange intRange, IntRange intRange2, Function0 function0, Function0 function02, int i2, int i3) {
        Animator animator = this.f3050g;
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(m2808b().f2164e, (Property<TextView, Float>) View.ALPHA, intRange.getFirst(), intRange.getLast());
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(m2808b().f2164e, (Property<TextView, Float>) View.TRANSLATION_Y, intRange2.getFirst(), intRange2.getLast());
        objectAnimatorOfFloat2.setDuration(300L);
        Animator animatorM1859a = AbstractC8102a.m1859a(i2, i3, 300L, new m());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.play(objectAnimatorOfFloat2);
        animatorSet.play(animatorM1859a);
        animatorSet.addListener(new l(function0, function02));
        animatorSet.start();
        this.f3050g = animatorSet;
    }

    /* renamed from: a */
    public final void m2807a(boolean z) {
        TextView textView = m2808b().f2164e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.offerInfoLabel");
        if ((textView.getVisibility() == 0) == z) {
            return;
        }
        Context context = m2808b().getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
        int iM2799a = m2799a(context, C11403R.attr.paylib_native_default_background_color);
        Context context2 = m2808b().getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "binding.root.context");
        int iM2799a2 = m2799a(context2, C11403R.attr.paylib_native_offer_item_background_color);
        if (z) {
            m2809b(iM2799a, iM2799a2);
        } else {
            m2800a(iM2799a2, iM2799a);
        }
    }
}
