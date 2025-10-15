package com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.common.startparams.InterfaceC8112a;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8189j;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.C8328e;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.viewobjects.C8331a;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8376k;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8365b;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8370g;
import java.util.List;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
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
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a */
/* loaded from: classes7.dex */
public final class C8324a extends Fragment implements InterfaceC8243b {

    /* renamed from: a */
    public final C8103b f3302a;

    /* renamed from: b */
    public final Lazy f3303b;

    /* renamed from: c */
    public final ReadOnlyProperty f3304c;

    /* renamed from: d */
    public Integer f3305d;

    /* renamed from: f */
    public static final /* synthetic */ KProperty[] f3301f = {Reflection.property1(new PropertyReference1Impl(C8324a.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentMobileConfirmationBinding;", 0))};

    /* renamed from: e */
    public static final a f3300e = new a(null);

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final b f3306a = new b();

        public b() {
            super(1, C8189j.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentMobileConfirmationBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8189j invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8189j.m2135a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3307a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$c$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: a */
            public int f3309a;

            /* renamed from: b */
            public final /* synthetic */ C8324a f3310b;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$c$a$a */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C11931a implements FlowCollector, FunctionAdapter {

                /* renamed from: a */
                public final /* synthetic */ C8324a f3311a;

                public C11931a(C8324a c8324a) {
                    this.f3311a = c8324a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(C8328e c8328e, Continuation continuation) {
                    Object objM3058b = a.m3058b(this.f3311a, c8328e, continuation);
                    return objM3058b == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM3058b : Unit.INSTANCE;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.f3311a, C8324a.class, "renderViewState", "renderViewState(Lcom/sdkit/paylib/paylibnative/ui/screens/mobileconfirm/MobileConfirmationViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8324a c8324a, Continuation continuation) {
                super(2, continuation);
                this.f3310b = c8324a;
            }

            /* renamed from: b */
            public static final /* synthetic */ Object m3058b(C8324a c8324a, C8328e c8328e, Continuation continuation) {
                c8324a.m3051a(c8328e);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f3310b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f3309a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowM2003c = this.f3310b.m3053c().m2003c();
                    C11931a c11931a = new C11931a(this.f3310b);
                    this.f3309a = 1;
                    if (stateFlowM2003c.collect(c11931a, this) == coroutine_suspended) {
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

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            return C8324a.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3307a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8324a c8324a = C8324a.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(c8324a, null);
                this.f3307a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(c8324a, state, aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3312a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$d$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: a */
            public int f3314a;

            /* renamed from: b */
            public final /* synthetic */ C8324a f3315b;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$d$a$a */
            /* loaded from: classes6.dex */
            public static final class C11932a implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ C8324a f3316a;

                public C11932a(C8324a c8324a) {
                    this.f3316a = c8324a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(Unit unit, Continuation continuation) {
                    this.f3316a.m3052b().f2180f.setText("");
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8324a c8324a, Continuation continuation) {
                super(2, continuation);
                this.f3315b = c8324a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f3315b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f3314a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow sharedFlowM3090e = this.f3315b.m3053c().m3090e();
                    C11932a c11932a = new C11932a(this.f3315b);
                    this.f3314a = 1;
                    if (sharedFlowM3090e.collect(c11932a, this) == coroutine_suspended) {
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
            return C8324a.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3312a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8324a c8324a = C8324a.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(c8324a, null);
                this.f3312a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(c8324a, state, aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$e */
    /* loaded from: classes5.dex */
    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C8324a.this.m3053c().m3086a(String.valueOf(charSequence));
            C8324a.this.m3054d();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$f */
    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        /* renamed from: a */
        public final void m3064a() {
            C8324a.this.m3053c().m3092g();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3064a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f3319a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f3320b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f3319a = abstractC8258f;
            this.f3320b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f3319a.m2480a(this.f3320b, C8326c.class);
            if (viewModelM2480a != null) {
                return (C8326c) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.MobileConfirmationViewModel");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8324a(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator) {
        super(C11403R.layout.paylib_native_fragment_mobile_confirmation);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        this.f3302a = layoutInflaterThemeValidator;
        this.f3303b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new g(viewModelProvider, this));
        this.f3304c = AbstractC8376k.m3482a(this, b.f3306a);
    }

    /* renamed from: b */
    public final C8189j m3052b() {
        return (C8189j) this.f3304c.getValue(this, f3301f[0]);
    }

    /* renamed from: c */
    public final C8326c m3053c() {
        return (C8326c) this.f3303b.getValue();
    }

    /* renamed from: d */
    public final void m3054d() {
        ImageView imageView = m3052b().f2177c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.clearSms");
        Editable text = m3052b().f2180f.getText();
        Intrinsics.checkNotNullExpressionValue(text, "binding.enterSms.text");
        imageView.setVisibility((text.length() <= 0 || !m3052b().f2180f.isFocused()) ? 8 : 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f3302a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        WindowManager.LayoutParams attributes;
        super.onStart();
        FragmentActivity activity = getActivity();
        this.f3305d = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        Window window;
        EditText editText = m3052b().f2180f;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.enterSms");
        AbstractC8370g.m3470b(editText);
        Integer num = this.f3305d;
        if (num != null) {
            int iIntValue = num.intValue();
            FragmentActivity activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(iIntValue);
            }
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C8326c c8326cM3053c = m3053c();
        Bundle arguments = getArguments();
        if (arguments != null) {
            Intrinsics.checkNotNullExpressionValue(arguments, "arguments");
            InterfaceC8112a interfaceC8112a = (InterfaceC8112a) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("param_mobile_confirmation_start_params", C8331a.class) : arguments.getParcelable("param_mobile_confirmation_start_params"));
            if (interfaceC8112a != null) {
                c8326cM3053c.m3084a((C8331a) interfaceC8112a);
                AbstractC8365b.m3438a(this, new f());
                FrameLayout root = m3052b().f2187m.f2260e.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "binding.title.closeButton.root");
                root.setVisibility(0);
                m3052b().f2187m.f2260e.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C8324a.m3041a(this.f$0, view2);
                    }
                });
                TextView textView = m3052b().f2187m.f2261f;
                int i = C11403R.string.paylib_native_enter_sms_code;
                textView.setText(getText(i));
                m3052b().f2187m.f2258c.setText(getText(i));
                m3052b().f2177c.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C8324a.m3046b(this.f$0, view2);
                    }
                });
                m3052b().f2185k.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C8324a.m3048c(this.f$0, view2);
                    }
                });
                EditText editText = m3052b().f2180f;
                Intrinsics.checkNotNullExpressionValue(editText, "binding.enterSms");
                editText.addTextChangedListener(new e());
                m3052b().f2178d.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C8324a.m3049d(this.f$0, view2);
                    }
                });
                m3052b().f2180f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$$ExternalSyntheticLambda4
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView2, int i2, KeyEvent keyEvent) {
                        return C8324a.m3044a(this.f$0, textView2, i2, keyEvent);
                    }
                });
                m3052b().f2180f.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.a$$ExternalSyntheticLambda5
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z) {
                        C8324a.m3042a(this.f$0, view2, z);
                    }
                });
                EditText editText2 = m3052b().f2180f;
                Intrinsics.checkNotNullExpressionValue(editText2, "binding.enterSms");
                AbstractC8370g.m3471c(editText2);
                m3054d();
                return;
            }
        }
        throw new IllegalStateException("Need to add start params");
    }

    /* renamed from: d */
    public static final void m3049d(C8324a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3053c().m3088b(this$0.m3052b().f2180f.getText().toString());
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b
    /* renamed from: a */
    public void mo2365a() {
        m3053c().m3092g();
    }

    /* renamed from: b */
    public static final void m3046b(C8324a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3053c().m3091f();
    }

    /* renamed from: c */
    public static final void m3048c(C8324a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3053c().m3093h();
    }

    /* renamed from: a */
    public final void m3050a(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.4f);
    }

    /* renamed from: a */
    public static final void m3041a(C8324a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3053c().m3092g();
    }

    /* renamed from: a */
    public static final void m3042a(C8324a this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3054d();
    }

    /* renamed from: a */
    public final void m3051a(C8328e c8328e) {
        FrameLayout root = m3052b().f2182h.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.loading.root");
        root.setVisibility(c8328e.m3119e() ? 0 : 8);
        FrameLayout root2 = m3052b().f2187m.f2260e.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.title.closeButton.root");
        root2.setVisibility(c8328e.m3119e() ? 4 : 0);
        TextView textView = m3052b().f2187m.f2261f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.title.titleLabel");
        textView.setVisibility(c8328e.m3120f() ^ true ? 0 : 8);
        TextView textView2 = m3052b().f2187m.f2258c;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.title.additionalTitleLabel");
        textView2.setVisibility(c8328e.m3120f() ? 0 : 8);
        FrameLayout root3 = m3052b().f2187m.f2257b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "binding.title.additionalInfo.root");
        root3.setVisibility(c8328e.m3120f() ? 0 : 8);
        m3052b().f2180f.setEnabled(!c8328e.m3119e());
        EditText editText = m3052b().f2180f;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.enterSms");
        m3050a(editText, !c8328e.m3119e());
        if (c8328e.m3119e()) {
            m3052b().f2180f.clearFocus();
        }
        m3052b().f2178d.setEnabled(c8328e.m3114a().m3122a() && !c8328e.m3119e());
        InputFilter[] filters = m3052b().f2180f.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "binding.enterSms.filters");
        List mutableList = ArraysKt___ArraysKt.toMutableList(filters);
        mutableList.add(new InputFilter.LengthFilter(c8328e.m3117c()));
        m3052b().f2180f.setFilters((InputFilter[]) mutableList.toArray(new InputFilter[0]));
        TextView textView3 = m3052b().f2183i;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.smsDescription");
        textView3.setVisibility(c8328e.m3116b() instanceof C8328e.b.C11933b ? 0 : 8);
        m3052b().f2183i.setEnabled(!c8328e.m3119e());
        TextView textView4 = m3052b().f2183i;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.smsDescription");
        m3050a(textView4, !c8328e.m3119e());
        TextView textView5 = m3052b().f2183i;
        C8328e.b bVarM3116b = c8328e.m3116b();
        C8328e.b.C11933b c11933b = bVarM3116b instanceof C8328e.b.C11933b ? (C8328e.b.C11933b) bVarM3116b : null;
        textView5.setText(c11933b != null ? c11933b.m3124a() : null);
        TextView textView6 = m3052b().f2184j;
        Intrinsics.checkNotNullExpressionValue(textView6, "binding.smsError");
        textView6.setVisibility(c8328e.m3116b() instanceof C8328e.b.a ? 0 : 8);
        TextView textView7 = m3052b().f2184j;
        C8328e.b bVarM3116b2 = c8328e.m3116b();
        C8328e.b.a aVar = bVarM3116b2 instanceof C8328e.b.a ? (C8328e.b.a) bVarM3116b2 : null;
        textView7.setText(aVar != null ? aVar.m3123a() : null);
        m3052b().f2184j.setEnabled(!c8328e.m3119e());
        TextView textView8 = m3052b().f2184j;
        Intrinsics.checkNotNullExpressionValue(textView8, "binding.smsError");
        m3050a(textView8, !c8328e.m3119e());
        EditText editText2 = m3052b().f2180f;
        Intrinsics.checkNotNullExpressionValue(editText2, "binding.enterSms");
        AbstractC8370g.m3467a(editText2, c8328e.m3116b() instanceof C8328e.b.a ? C11403R.attr.paylib_native_bg_input_field_error : C11403R.attr.paylib_native_bg_input_field);
        TextView textView9 = m3052b().f2185k;
        Intrinsics.checkNotNullExpressionValue(textView9, "binding.smsResend");
        textView9.setVisibility(c8328e.m3118d() instanceof C8328e.c.b ? 0 : 8);
        m3052b().f2185k.setEnabled(!c8328e.m3119e());
        TextView textView10 = m3052b().f2185k;
        Intrinsics.checkNotNullExpressionValue(textView10, "binding.smsResend");
        m3050a(textView10, !c8328e.m3119e());
        m3052b().f2186l.setEnabled(!c8328e.m3119e());
        TextView textView11 = m3052b().f2186l;
        Intrinsics.checkNotNullExpressionValue(textView11, "binding.smsTimer");
        m3050a(textView11, true ^ c8328e.m3119e());
        TextView textView12 = m3052b().f2186l;
        Intrinsics.checkNotNullExpressionValue(textView12, "binding.smsTimer");
        textView12.setVisibility(c8328e.m3118d() instanceof C8328e.c.a ? 0 : 8);
        TextView textView13 = m3052b().f2186l;
        C8328e.c cVarM3118d = c8328e.m3118d();
        C8328e.c.a aVar2 = cVarM3118d instanceof C8328e.c.a ? (C8328e.c.a) cVarM3118d : null;
        textView13.setText(aVar2 != null ? aVar2.m3125a() : null);
    }

    /* renamed from: a */
    public static final boolean m3044a(C8324a this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 6) {
            return true;
        }
        this$0.m3053c().m3088b(textView.getText().toString());
        return true;
    }
}
