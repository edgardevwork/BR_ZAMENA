package com.sdkit.paylib.paylibnative.p033ui.screens.banks;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8176b;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8180d;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import com.sdkit.paylib.paylibnative.p033ui.screens.banks.C8266a;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8376k;
import com.sdkit.paylib.paylibnative.p033ui.utils.C8373h;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8365b;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.functions.Function3;
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

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.b */
/* loaded from: classes5.dex */
public final class C8267b extends Fragment implements InterfaceC8243b {

    /* renamed from: g */
    public static final /* synthetic */ KProperty[] f2792g = {Reflection.property1(new PropertyReference1Impl(C8267b.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentBanksBinding;", 0))};

    /* renamed from: a */
    public final C8103b f2793a;

    /* renamed from: b */
    public final Lazy f2794b;

    /* renamed from: c */
    public final ReadOnlyProperty f2795c;

    /* renamed from: d */
    public final Lazy f2796d;

    /* renamed from: e */
    public RequestOptions f2797e;

    /* renamed from: f */
    public final C8373h f2798f;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.b$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {
        public a(Object obj) {
            super(2, obj, C8267b.class, "bindBankAppAdapterItem", "bindBankAppAdapterItem(Lcom/sdkit/paylib/paylibnative/ui/screens/banks/AppsList$App;Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeBankItemViewBinding;)V", 0);
        }

        /* renamed from: a */
        public final void m2572a(C8266a.a p0, C8176b p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((C8267b) this.receiver).m2565a(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m2572a((C8266a.a) obj, (C8176b) obj2);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.b$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function3 {

        /* renamed from: a */
        public static final b f2799a = new b();

        public b() {
            super(3, C8176b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeBankItemViewBinding;", 0);
        }

        /* renamed from: a */
        public final C8176b m2573a(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8176b.m2108a(p0, viewGroup, z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m2573a((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.b$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final c f2800a = new c();

        public c() {
            super(1, C8180d.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentBanksBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8180d invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8180d.m2117a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.b$d */
    /* loaded from: classes7.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f2801a;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.b$d$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: a */
            public int f2803a;

            /* renamed from: b */
            public final /* synthetic */ C8267b f2804b;

            /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.b$d$a$a */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C11914a implements FlowCollector, FunctionAdapter {

                /* renamed from: a */
                public final /* synthetic */ C8267b f2805a;

                public C11914a(C8267b c8267b) {
                    this.f2805a = c8267b;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(InterfaceC8271f interfaceC8271f, Continuation continuation) {
                    Object objM2577b = a.m2577b(this.f2805a, interfaceC8271f, continuation);
                    return objM2577b == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM2577b : Unit.INSTANCE;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.f2805a, C8267b.class, "renderViewState", "renderViewState(Lcom/sdkit/paylib/paylibnative/ui/screens/banks/BanksViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C8267b c8267b, Continuation continuation) {
                super(2, continuation);
                this.f2804b = c8267b;
            }

            /* renamed from: b */
            public static final /* synthetic */ Object m2577b(C8267b c8267b, InterfaceC8271f interfaceC8271f, Continuation continuation) {
                c8267b.m2566a(interfaceC8271f);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f2804b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f2803a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowM2003c = this.f2804b.m2569d().m2003c();
                    C11914a c11914a = new C11914a(this.f2804b);
                    this.f2803a = 1;
                    if (stateFlowM2003c.collect(c11914a, this) == coroutine_suspended) {
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
            return C8267b.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2801a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8267b c8267b = C8267b.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(c8267b, null);
                this.f2801a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(c8267b, state, aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.b$e */
    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        /* renamed from: a */
        public final void m2580a() {
            C8267b.this.m2569d().m2606f();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2580a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.b$f */
    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RequestManager invoke() {
            RequestManager requestManagerWith = Glide.with(C8267b.this.requireContext());
            Intrinsics.checkNotNullExpressionValue(requestManagerWith, "with(requireContext())");
            return requestManagerWith;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.b$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f2808a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f2809b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f2808a = abstractC8258f;
            this.f2809b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f2808a.m2480a(this.f2809b, C8269d.class);
            if (viewModelM2480a != null) {
                return (C8269d) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.banks.BanksViewModel");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8267b(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator) {
        super(C11403R.layout.paylib_native_fragment_banks);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        this.f2793a = layoutInflaterThemeValidator;
        this.f2794b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new g(viewModelProvider, this));
        this.f2795c = AbstractC8376k.m3482a(this, c.f2800a);
        this.f2796d = LazyKt__LazyJVMKt.lazy(new f());
        this.f2798f = new C8373h(new a(this), b.f2799a, null, null, null, 28, null);
    }

    /* renamed from: b */
    public final C8180d m2567b() {
        return (C8180d) this.f2795c.getValue(this, f2792g[0]);
    }

    /* renamed from: c */
    public final RequestManager m2568c() {
        return (RequestManager) this.f2796d.getValue();
    }

    /* renamed from: d */
    public final C8269d m2569d() {
        return (C8269d) this.f2794b.getValue();
    }

    /* renamed from: e */
    public final boolean m2570e() {
        AbstractC8128b abstractC8128b;
        Bundle arguments = getArguments();
        if (arguments != null) {
            abstractC8128b = (AbstractC8128b) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("ERROR_ACTION", AbstractC8128b.class) : arguments.getParcelable("ERROR_ACTION"));
        } else {
            abstractC8128b = null;
        }
        return abstractC8128b != null && Intrinsics.areEqual(abstractC8128b, AbstractC8128b.h.f1940a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(null), 3, null);
        if (m2570e()) {
            m2569d().m2608h();
        } else {
            m2569d().m2605e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f2793a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        boolean z = !m2570e();
        ConstraintLayout root = m2567b().f2122i.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.title.root");
        root.setVisibility(z ? 0 : 8);
        TextView textView = m2567b().f2122i.f2261f;
        int i = C11403R.string.paylib_native_select_bank_for_payment;
        textView.setText(getText(i));
        m2567b().f2122i.f2258c.setText(getText(i));
        AbstractC8365b.m3438a(this, new e());
        FrameLayout root2 = m2567b().f2122i.f2259d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.title.backButton.root");
        root2.setVisibility(z ? 0 : 8);
        m2567b().f2122i.f2259d.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.banks.b$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8267b.m2561a(this.f$0, view2);
            }
        });
        m2567b().f2115b.setAdapter(this.f2798f);
        RequestOptions requestOptionsBitmapTransform = RequestOptions.bitmapTransform(new RoundedCorners(getResources().getDimensionPixelSize(C11403R.dimen.paylib_native_bistro_bank_image_corner_radius)));
        Intrinsics.checkNotNullExpressionValue(requestOptionsBitmapTransform, "bitmapTransform(\n       …\n            ),\n        )");
        this.f2797e = requestOptionsBitmapTransform;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b
    /* renamed from: a */
    public void mo2365a() {
        m2569d().m2607g();
    }

    /* renamed from: a */
    public final void m2565a(final C8266a.a aVar, C8176b c8176b) {
        c8176b.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.banks.b$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8267b.m2562a(this.f$0, aVar, view);
            }
        });
        ImageView iconView = c8176b.f2096c;
        Intrinsics.checkNotNullExpressionValue(iconView, "iconView");
        TextView titleView = c8176b.f2097d;
        Intrinsics.checkNotNullExpressionValue(titleView, "titleView");
        Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new View[]{iconView, titleView}).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(aVar.m2559f() ? 1.0f : 0.5f);
        }
        c8176b.f2097d.setText(aVar.m2558e());
        RequestBuilder<Drawable> requestBuilderLoad = m2568c().load(aVar.m2554a());
        RequestOptions requestOptions = this.f2797e;
        if (requestOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roundedCornersRequestOptions");
            requestOptions = null;
        }
        requestBuilderLoad.apply((BaseRequestOptions<?>) requestOptions).into(c8176b.f2096c);
        View divider = c8176b.f2095b;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        divider.setVisibility(aVar.m2557d() ? 0 : 8);
    }

    /* renamed from: a */
    public static final void m2561a(C8267b this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m2569d().m2606f();
    }

    /* renamed from: a */
    public static final void m2562a(C8267b this$0, C8266a.a item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.m2569d().m2596a(item);
    }

    /* renamed from: a */
    public final void m2566a(InterfaceC8271f interfaceC8271f) {
        FrameLayout root = m2567b().f2117d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.loading.root");
        root.setVisibility(interfaceC8271f instanceof C8272g ? 0 : 8);
        TextView textView = m2567b().f2122i.f2261f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.title.titleLabel");
        textView.setVisibility(interfaceC8271f.isSandbox() ^ true ? 0 : 8);
        TextView textView2 = m2567b().f2122i.f2258c;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.title.additionalTitleLabel");
        textView2.setVisibility(interfaceC8271f.isSandbox() ? 0 : 8);
        FrameLayout root2 = m2567b().f2122i.f2257b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.title.additionalInfo.root");
        root2.setVisibility(interfaceC8271f.isSandbox() ? 0 : 8);
        Group group = m2567b().f2121h;
        Intrinsics.checkNotNullExpressionValue(group, "binding.noAppsView");
        group.setVisibility(interfaceC8271f instanceof C8273h ? 0 : 8);
        RecyclerView recyclerView = m2567b().f2115b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.banksRecyclerView");
        boolean z = interfaceC8271f instanceof C8266a;
        recyclerView.setVisibility(z ? 0 : 8);
        C8266a c8266a = z ? (C8266a) interfaceC8271f : null;
        List listM2551a = c8266a != null ? c8266a.m2551a() : null;
        if (listM2551a == null) {
            listM2551a = CollectionsKt__CollectionsKt.emptyList();
        }
        this.f2798f.submitList(listM2551a);
    }
}
