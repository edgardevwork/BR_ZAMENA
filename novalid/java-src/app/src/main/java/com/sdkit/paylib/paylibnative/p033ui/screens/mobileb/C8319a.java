package com.sdkit.paylib.paylibnative.p033ui.screens.mobileb;

import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8190k;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8376k;
import com.sdkit.paylib.paylibnative.p033ui.utils.C8361c;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8365b;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8370g;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
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
import kotlinx.coroutines.flow.StateFlow;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a */
/* loaded from: classes7.dex */
public final class C8319a extends Fragment implements InterfaceC8243b {

    /* renamed from: d */
    public static final /* synthetic */ KProperty[] f3263d = {Reflection.property1(new PropertyReference1Impl(C8319a.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentMobilebBinding;", 0))};

    /* renamed from: a */
    public final C8103b f3264a;

    /* renamed from: b */
    public final Lazy f3265b;

    /* renamed from: c */
    public final ReadOnlyProperty f3266c;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final a f3267a = new a();

        public a() {
            super(1, C8190k.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentMobilebBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8190k invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8190k.m2137a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3268a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$b$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: a */
            public int f3270a;

            /* renamed from: b */
            public final /* synthetic */ C8319a f3271b;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$b$a$a */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C11930a implements FlowCollector, FunctionAdapter {

                /* renamed from: a */
                public final /* synthetic */ C8319a f3272a;

                public C11930a(C8319a c8319a) {
                    this.f3272a = c8319a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(C8323e c8323e, Continuation continuation) {
                    Object objM3008b = a.m3008b(this.f3272a, c8323e, continuation);
                    return objM3008b == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM3008b : Unit.INSTANCE;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.f3272a, C8319a.class, "renderViewState", "renderViewState(Lcom/sdkit/paylib/paylibnative/ui/screens/mobileb/MobileBViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8319a c8319a, Continuation continuation) {
                super(2, continuation);
                this.f3271b = c8319a;
            }

            /* renamed from: b */
            public static final /* synthetic */ Object m3008b(C8319a c8319a, C8323e c8323e, Continuation continuation) {
                c8319a.m3000a(c8323e);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f3271b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f3270a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowM2003c = this.f3271b.m3002c().m2003c();
                    C11930a c11930a = new C11930a(this.f3271b);
                    this.f3270a = 1;
                    if (stateFlowM2003c.collect(c11930a, this) == coroutine_suspended) {
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

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8319a.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3268a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8319a c8319a = C8319a.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(c8319a, null);
                this.f3268a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(c8319a, state, aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$c */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        /* renamed from: a */
        public final void m3011a() {
            C8319a.this.m3002c().m3026e();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3011a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$d */
    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        /* renamed from: a */
        public final void m3012a(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            C8319a.this.m3004e();
            C8319a.this.m3002c().m3024c(text);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m3012a((String) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f3275a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f3276b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f3275a = abstractC8258f;
            this.f3276b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f3275a.m2480a(this.f3276b, C8321c.class);
            if (viewModelM2480a != null) {
                return (C8321c) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.mobileb.MobileBViewModel");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8319a(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator) {
        super(C11403R.layout.paylib_native_fragment_mobileb);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        this.f3264a = layoutInflaterThemeValidator;
        this.f3265b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e(viewModelProvider, this));
        this.f3266c = AbstractC8376k.m3482a(this, a.f3267a);
    }

    /* renamed from: b */
    public final C8190k m3001b() {
        return (C8190k) this.f3266c.getValue(this, f3263d[0]);
    }

    /* renamed from: c */
    public final C8321c m3002c() {
        return (C8321c) this.f3265b.getValue();
    }

    /* renamed from: d */
    public final void m3003d() {
        m3002c().m3023b(m3001b().f2197i.getText().toString());
    }

    /* renamed from: e */
    public final void m3004e() {
        ImageView imageView = m3001b().f2191c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.clearButton");
        Editable text = m3001b().f2197i.getText();
        Intrinsics.checkNotNullExpressionValue(text, "binding.phoneInput.text");
        imageView.setVisibility((text.length() <= 0 || !m3001b().f2197i.isFocused()) ? 8 : 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f3264a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m3001b().f2197i.requestFocus();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        EditText editText = m3001b().f2197i;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.phoneInput");
        AbstractC8370g.m3470b(editText);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        AbstractC8365b.m3438a(this, new c());
        FrameLayout root = m3001b().f2198j.f2259d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.title.backButton.root");
        root.setVisibility(0);
        m3001b().f2198j.f2259d.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8319a.m2992a(this.f$0, view2);
            }
        });
        FrameLayout root2 = m3001b().f2198j.f2260e.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.title.closeButton.root");
        root2.setVisibility(0);
        m3001b().f2198j.f2260e.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8319a.m2997b(this.f$0, view2);
            }
        });
        TextView textView = m3001b().f2198j.f2261f;
        int i = C11403R.string.paylib_native_payment_enter_phone_number;
        textView.setText(getText(i));
        m3001b().f2198j.f2258c.setText(getText(i));
        m3001b().f2191c.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8319a.m2998c(this.f$0, view2);
            }
        });
        m3001b().f2192d.setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8319a.m2999d(this.f$0, view2);
            }
        });
        m3001b().f2197i.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$$ExternalSyntheticLambda4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i2, KeyEvent keyEvent) {
                return C8319a.m2995a(this.f$0, textView2, i2, keyEvent);
            }
        });
        m3001b().f2197i.addTextChangedListener(new C8361c("+7 (###) ###-##-##", new d()));
        m3001b().f2197i.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.mobileb.a$$ExternalSyntheticLambda5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                C8319a.m2993a(this.f$0, view2, z);
            }
        });
        EditText editText = m3001b().f2197i;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.phoneInput");
        AbstractC8370g.m3471c(editText);
        m3004e();
    }

    /* renamed from: c */
    public static final void m2998c(C8319a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3001b().f2197i.setText((CharSequence) null);
    }

    /* renamed from: d */
    public static final void m2999d(C8319a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3003d();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b
    /* renamed from: a */
    public void mo2365a() {
        m3002c().m3027f();
    }

    /* renamed from: a */
    public static final void m2992a(C8319a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3002c().m3026e();
    }

    /* renamed from: b */
    public static final void m2997b(C8319a this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3002c().m3027f();
    }

    /* renamed from: a */
    public static final void m2993a(C8319a this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3004e();
    }

    /* renamed from: a */
    public final void m3000a(C8323e c8323e) {
        FrameLayout root = m3001b().f2198j.f2260e.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.title.closeButton.root");
        root.setVisibility(c8323e.m3038d() ? 4 : 0);
        TextView textView = m3001b().f2198j.f2261f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.title.titleLabel");
        textView.setVisibility(c8323e.m3039e() ^ true ? 0 : 8);
        TextView textView2 = m3001b().f2198j.f2258c;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.title.additionalTitleLabel");
        textView2.setVisibility(c8323e.m3039e() ? 0 : 8);
        FrameLayout root2 = m3001b().f2198j.f2257b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.title.additionalInfo.root");
        root2.setVisibility(c8323e.m3039e() ? 0 : 8);
        m3001b().f2195g.setText(c8323e.m3035a());
        TextView textView3 = m3001b().f2195g;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.phoneDisclaimer");
        textView3.setVisibility(c8323e.m3035a() != null ? 0 : 8);
        m3001b().f2196h.setText(c8323e.m3036b());
        TextView textView4 = m3001b().f2196h;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.phoneError");
        textView4.setVisibility(c8323e.m3036b() != null ? 0 : 8);
        EditText editText = m3001b().f2197i;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.phoneInput");
        AbstractC8370g.m3467a(editText, c8323e.m3036b() != null ? C11403R.attr.paylib_native_bg_input_field_error : C11403R.attr.paylib_native_bg_input_field);
        FrameLayout root3 = m3001b().f2194f.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "binding.loading.root");
        root3.setVisibility(c8323e.m3038d() ? 0 : 8);
        m3001b().f2192d.setEnabled(c8323e.m3037c() && !c8323e.m3038d());
        m3001b().f2197i.setEnabled(!c8323e.m3038d());
        if (c8323e.m3038d()) {
            m3001b().f2197i.clearFocus();
        }
        TextView textView5 = m3001b().f2195g;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.phoneDisclaimer");
        EditText editText2 = m3001b().f2197i;
        Intrinsics.checkNotNullExpressionValue(editText2, "binding.phoneInput");
        PaylibButton paylibButton = m3001b().f2192d;
        Intrinsics.checkNotNullExpressionValue(paylibButton, "binding.continueButton");
        TextView textView6 = m3001b().f2196h;
        Intrinsics.checkNotNullExpressionValue(textView6, "binding.phoneError");
        for (View view : CollectionsKt__CollectionsKt.listOf((Object[]) new View[]{textView5, editText2, paylibButton, textView6})) {
            view.setAlpha((c8323e.m3038d() || !view.isEnabled()) ? 0.4f : 1.0f);
        }
    }

    /* renamed from: a */
    public static final boolean m2995a(C8319a this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 6) {
            return true;
        }
        this$0.m3003d();
        return true;
    }
}
