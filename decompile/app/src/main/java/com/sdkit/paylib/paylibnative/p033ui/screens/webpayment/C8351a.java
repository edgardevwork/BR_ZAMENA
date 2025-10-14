package com.sdkit.paylib.paylibnative.p033ui.screens.webpayment;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.google.android.material.C6765R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.sdkit.paylib.paylibdesign.dialogs.AbstractC8029a;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.common.startparams.InterfaceC8112a;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8195p;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.bottomsheet.C8246c;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.AbstractC8353c;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.viewobjects.C8357a;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8376k;
import com.sdkit.paylib.paylibnative.p033ui.utils.C8362d;
import com.sdkit.paylib.paylibnetwork.api.domain.WebViewCertificateVerifier;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a */
/* loaded from: classes8.dex */
public final class C8351a extends AbstractC8029a {

    /* renamed from: b */
    public final C8103b f3563b;

    /* renamed from: c */
    public final WebViewCertificateVerifier f3564c;

    /* renamed from: d */
    public final PaylibLogger f3565d;

    /* renamed from: e */
    public final Lazy f3566e;

    /* renamed from: f */
    public final ReadOnlyProperty f3567f;

    /* renamed from: g */
    public final Lazy f3568g;

    /* renamed from: h */
    public final C8246c f3569h;

    /* renamed from: i */
    public final k f3570i;

    /* renamed from: k */
    public static final /* synthetic */ KProperty[] f3562k = {Reflection.property1(new PropertyReference1Impl(C8351a.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentWebPaymentBinding;", 0))};

    /* renamed from: j */
    public static final a f3561j = new a(null);

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$b */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final b f3571a = new b();

        public b() {
            super(1, C8195p.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentWebPaymentBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8195p invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8195p.m2147a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$c */
    /* loaded from: classes7.dex */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        /* renamed from: a */
        public final void m3334a() {
            C8351a.this.m3331e().m3389k();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3334a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$d */
    /* loaded from: classes7.dex */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Transition invoke() {
            return C8351a.this.m3330d();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$e */
    /* loaded from: classes7.dex */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public static final e f3574a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "onCreate()";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$f */
    /* loaded from: classes7.dex */
    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3575a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$f$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: a */
            public int f3577a;

            /* renamed from: b */
            public final /* synthetic */ C8351a f3578b;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$f$a$a */
            public /* synthetic */ class C11942a extends AdaptedFunctionReference implements Function2, SuspendFunction {
                public C11942a(Object obj) {
                    super(2, obj, C8351a.class, "renderViewState", "renderViewState(Lcom/sdkit/paylib/paylibnative/ui/screens/webpayment/WebPaymentViewState;)V", 4);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final Object invoke(C8356f c8356f, Continuation continuation) {
                    return a.m3339b((C8351a) this.receiver, c8356f, continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8351a c8351a, Continuation continuation) {
                super(2, continuation);
                this.f3578b = c8351a;
            }

            /* renamed from: b */
            public static final /* synthetic */ Object m3339b(C8351a c8351a, C8356f c8356f, Continuation continuation) {
                c8351a.m3324a(c8356f);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f3578b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f3577a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FlowKt.launchIn(FlowKt.onEach(this.f3578b.m3331e().m2003c(), new C11942a(this.f3578b)), LifecycleOwnerKt.getLifecycleScope(this.f3578b));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8351a.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3575a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8351a c8351a = C8351a.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(c8351a, null);
                this.f3575a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(c8351a, state, aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$g */
    public static final class g extends BottomSheetDialog {
        public g(Context context, int i) {
            super(context, i);
        }

        @Override // androidx.activity.ComponentDialog, android.app.Dialog
        public void onBackPressed() {
            if (C8351a.this.m3327b().f2228d.f2267f.canGoBack()) {
                C8351a.this.m3327b().f2228d.f2267f.goBack();
            } else {
                super.onBackPressed();
                C8351a.this.m3331e().m3388j();
            }
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$h */
    /* loaded from: classes7.dex */
    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3580a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$h$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ C8351a f3582a;

            public a(C8351a c8351a) {
                this.f3582a = c8351a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(Unit unit, Continuation continuation) {
                this.f3582a.dismiss();
                return Unit.INSTANCE;
            }
        }

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8351a.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3580a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowM3386h = C8351a.this.m3331e().m3386h();
                a aVar = new a(C8351a.this);
                this.f3580a = 1;
                if (flowM3386h.collect(aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$i */
    /* loaded from: classes7.dex */
    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3583a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$i$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ C8351a f3585a;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$i$a$a */
            /* loaded from: classes7.dex */
            public static final class C11943a extends Lambda implements Function0 {

                /* renamed from: a */
                public final /* synthetic */ String f3586a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11943a(String str) {
                    super(0);
                    this.f3586a = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a */
                public final String invoke() {
                    return C8032c.m1430a(new StringBuilder("webPayment.webPaymentWebView.loadUrl("), this.f3586a, ')');
                }
            }

            public a(C8351a c8351a) {
                this.f3585a = c8351a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(String str, Continuation continuation) {
                PaylibLogger.DefaultImpls.d$default(this.f3585a.f3565d, null, new C11943a(str), 1, null);
                this.f3585a.m3327b().f2228d.f2267f.loadUrl(str);
                return Unit.INSTANCE;
            }
        }

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8351a.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3583a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowM3387i = C8351a.this.m3331e().m3387i();
                a aVar = new a(C8351a.this);
                this.f3583a = 1;
                if (flowM3387i.collect(aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$j */
    /* loaded from: classes7.dex */
    public static final class j extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f3587a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f3588b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f3587a = abstractC8258f;
            this.f3588b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f3587a.m2480a(this.f3588b, C8354d.class);
            if (viewModelM2480a != null) {
                return (C8354d) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.webpayment.WebPaymentViewModel");
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$k */
    /* loaded from: classes5.dex */
    public static final class k extends WebViewClient {
        public k() {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            C8351a.this.m3331e().m3390l();
            if (!C8351a.this.f3564c.verifyCert(sslError != null ? sslError.getCertificate() : null)) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else if (sslErrorHandler != null) {
                sslErrorHandler.proceed();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest webResourceRequest) {
            Intrinsics.checkNotNullParameter(view, "view");
            return C8351a.this.m3331e().m3376a(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return C8351a.this.m3331e().m3376a(Uri.parse(str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8351a(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator, WebViewCertificateVerifier certVerifier, PaylibLoggerFactory loggerFactory) {
        super(C11403R.style.paylib_native_bottom_sheet_theme);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        Intrinsics.checkNotNullParameter(certVerifier, "certVerifier");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f3563b = layoutInflaterThemeValidator;
        this.f3564c = certVerifier;
        this.f3565d = loggerFactory.get("WebPaymentFragment");
        this.f3566e = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new j(viewModelProvider, this));
        this.f3567f = AbstractC8376k.m3482a(this, b.f3571a);
        this.f3568g = LazyKt__LazyJVMKt.lazy(new d());
        this.f3569h = new C8246c(new c());
        this.f3570i = new k();
    }

    /* renamed from: b */
    public final C8195p m3327b() {
        return (C8195p) this.f3567f.getValue(this, f3562k[0]);
    }

    /* renamed from: c */
    public final Transition m3329c() {
        return (Transition) this.f3568g.getValue();
    }

    /* renamed from: d */
    public final Transition m3330d() {
        Transition duration = new C8362d().addTarget(m3327b().f2226b.getRoot()).addTarget(m3327b().f2228d.getRoot()).setDuration(300L);
        Intrinsics.checkNotNullExpressionValue(duration, "MoveAndFadeTransition()\n…ation(ANIMATION_DURATION)");
        return duration;
    }

    /* renamed from: e */
    public final C8354d m3331e() {
        return (C8354d) this.f3566e.getValue();
    }

    /* renamed from: f */
    public final void m3332f() {
        WebView webView = m3327b().f2228d.f2267f;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(this.f3570i);
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C8351a.m3317a(this.f$0, view, motionEvent);
            }
        });
    }

    @Override // com.sdkit.paylib.paylibdesign.dialogs.AbstractC8029a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaylibLogger.DefaultImpls.v$default(this.f3565d, null, e.f3574a, 1, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new f(null), 3, null);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new g(requireContext(), C11403R.style.paylib_native_bottom_sheet_theme);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C11403R.layout.paylib_native_fragment_web_payment, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f3563b;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        m3323a();
        m3332f();
        m3327b().f2228d.f2265d.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8351a.m3315a(this.f$0, view2);
            }
        });
        m3327b().f2228d.f2264c.setOnTouchListener(new View.OnTouchListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.webpayment.a$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return C8351a.m3319b(this.f$0, view2, motionEvent);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new i(null), 3, null);
        C8354d c8354dM3331e = m3331e();
        Bundle arguments = getArguments();
        if (arguments != null) {
            Intrinsics.checkNotNullExpressionValue(arguments, "arguments");
            InterfaceC8112a interfaceC8112a = (InterfaceC8112a) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("web_payment_screen_start_params", C8357a.class) : arguments.getParcelable("web_payment_screen_start_params"));
            if (interfaceC8112a != null) {
                c8354dM3331e.m3373a((C8357a) interfaceC8112a);
                return;
            }
        }
        throw new IllegalStateException("Need to add start params");
    }

    /* renamed from: a */
    public final void m3323a() {
        View viewFindViewById;
        Dialog dialog = getDialog();
        if (dialog == null || (viewFindViewById = dialog.findViewById(C6765R.id.design_bottom_sheet)) == null) {
            return;
        }
        C8246c.m2376a(this.f3569h, viewFindViewById, null, false, false, false, 30, null);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -1;
        viewFindViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static final void m3315a(C8351a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3331e().m3388j();
    }

    /* renamed from: b */
    public final void m3328b(String str) {
        m3327b().f2226b.f2243c.setText(str);
        TextView textView = m3327b().f2226b.f2243c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.loading.loadingUserMessage");
        textView.setVisibility(str != null ? 0 : 8);
    }

    /* renamed from: b */
    public static final boolean m3319b(C8351a this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this$0.f3569h.m2382a(true);
        return false;
    }

    /* renamed from: a */
    public final void m3324a(C8356f c8356f) {
        m3326a(c8356f.m3416b() instanceof AbstractC8353c.b, (c8356f.m3416b() instanceof AbstractC8353c.d) || Intrinsics.areEqual(c8356f.m3416b(), AbstractC8353c.a.f3594a), c8356f.m3417c());
        AbstractC8353c abstractC8353cM3416b = c8356f.m3416b();
        AbstractC8353c.b bVar = abstractC8353cM3416b instanceof AbstractC8353c.b ? (AbstractC8353c.b) abstractC8353cM3416b : null;
        m3328b(bVar != null ? bVar.m3352a() : null);
        if (Intrinsics.areEqual(c8356f.m3416b(), AbstractC8353c.c.f3596a)) {
            m3325a(c8356f.m3415a());
        }
    }

    /* renamed from: a */
    public final void m3325a(String str) {
        C8354d.m3358a(m3331e(), (AbstractC8353c) null, 1, (Object) null);
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: a */
    public final void m3326a(boolean z, boolean z2, boolean z3) {
        TransitionManager.beginDelayedTransition(m3327b().f2227c, m3329c());
        ConstraintLayout root = m3327b().f2226b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.loading.root");
        root.setVisibility(z ? 0 : 8);
        ConstraintLayout root2 = m3327b().f2228d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.webPayment.root");
        root2.setVisibility(z2 ? 0 : 8);
        FrameLayout root3 = m3327b().f2228d.f2263b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "binding.webPayment.webPaymentAdditionalTitle.root");
        root3.setVisibility(z3 ? 0 : 8);
    }

    /* renamed from: a */
    public static final boolean m3317a(C8351a this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() == 0) {
            this$0.f3569h.m2382a(false);
        }
        return false;
    }
}
