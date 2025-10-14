package com.sdkit.paylib.paylibnative.p033ui.rootcontainer;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStateManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.caverock.androidsvg.SVG;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.api.entity.HostInsets;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibHostRouter;
import com.sdkit.paylib.paylibnative.p033ui.activity.PaylibNativeActivity;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8191l;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8241o;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.bottomsheet.C8246c;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.bottomsheet.C8248e;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.InterfaceC8254b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8376k;
import com.sdkit.paylib.paylibnative.p033ui.utils.C8360b;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8365b;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.billingclient.C11403R;

@Metadata(m7104d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 62\u00020\u0001:\u0002\u0015\u0012B\u0007¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u0012\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J*\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0017H\u0002R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0018\u0010,\u001a\u00060*R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00067"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/rootcontainer/c;", "Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", "context", "", "onAttach", "Landroid/view/View;", SVG.View.NODE_NAME, "Landroid/os/Bundle;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "onViewCreated", "onDestroyView", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "onDetach", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "b", "", "colorResId", "a", "e", "Lkotlin/Function2;", "Lcom/sdkit/paylib/paylibnative/api/entity/HostInsets;", "insetsApplier", "Lcom/sdkit/paylib/paylibnative/ui/rootcontainer/internaldi/b;", "Lkotlin/Lazy;", "d", "()Lcom/sdkit/paylib/paylibnative/ui/rootcontainer/internaldi/b;", "flowFactory", "Lcom/sdkit/paylib/payliblogging/api/logging/PaylibLogger;", "Lcom/sdkit/paylib/payliblogging/api/logging/PaylibLogger;", "logger", "Lcom/sdkit/paylib/paylibnative/ui/databinding/l;", "c", "Lkotlin/properties/ReadOnlyProperty;", "()Lcom/sdkit/paylib/paylibnative/ui/databinding/l;", "binding", "Lcom/sdkit/paylib/paylibnative/ui/rootcontainer/bottomsheet/c;", "Lcom/sdkit/paylib/paylibnative/ui/rootcontainer/bottomsheet/c;", "bottomSheetController", "Lcom/sdkit/paylib/paylibnative/ui/rootcontainer/c$b;", "Lcom/sdkit/paylib/paylibnative/ui/rootcontainer/c$b;", "paylibRootFragmentHandler", "", "f", "Z", "callOnFlowClosed", "g", "Ljava/lang/Integer;", "originalSoftInputMode", SegmentConstantPool.INITSTRING, "()V", "h", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0})
/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c */
/* loaded from: classes6.dex */
public final class C8249c extends Fragment {

    /* renamed from: a, reason: from kotlin metadata */
    public final Lazy flowFactory;

    /* renamed from: b, reason: from kotlin metadata */
    public final PaylibLogger logger;

    /* renamed from: c, reason: from kotlin metadata */
    public final ReadOnlyProperty binding;

    /* renamed from: d, reason: from kotlin metadata */
    public final C8246c bottomSheetController;

    /* renamed from: e, reason: from kotlin metadata */
    public final b paylibRootFragmentHandler;

    /* renamed from: f, reason: from kotlin metadata */
    public boolean callOnFlowClosed;

    /* renamed from: g, reason: from kotlin metadata */
    public Integer originalSoftInputMode;

    /* renamed from: i */
    public static final /* synthetic */ KProperty[] f2560i = {Reflection.property1(new PropertyReference1Impl(C8249c.class, "binding", "getBinding()Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentPaylibNativeBinding;", 0))};

    /* renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$a, reason: from kotlin metadata */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final C8249c m2408a() {
            return new C8249c();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$b */
    /* loaded from: classes5.dex */
    public final class b implements InterfaceC8251e {
        public b() {
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8251e
        /* renamed from: a */
        public void mo2409a() {
            C8241o c8241oMo2439c;
            C8249c.this.callOnFlowClosed = false;
            C8249c.this.bottomSheetController.m2379a();
            InterfaceC8254b interfaceC8254bM2406d = C8249c.this.m2406d();
            if (interfaceC8254bM2406d != null && (c8241oMo2439c = interfaceC8254bM2406d.mo2439c()) != null) {
                c8241oMo2439c.m2360a();
            }
            FragmentActivity activity = C8249c.this.getActivity();
            PaylibNativeActivity paylibNativeActivity = activity instanceof PaylibNativeActivity ? (PaylibNativeActivity) activity : null;
            if (paylibNativeActivity != null) {
                paylibNativeActivity.finish();
            }
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8251e
        /* renamed from: b */
        public FragmentManager mo2410b() {
            C8249c c8249c = C8249c.this;
            if (!c8249c.isAdded()) {
                c8249c = null;
            }
            if (c8249c != null) {
                return c8249c.getChildFragmentManager();
            }
            return null;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$c */
    /* loaded from: classes7.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f2569a;

        /* renamed from: b */
        public final /* synthetic */ Flow f2570b;

        /* renamed from: c */
        public final /* synthetic */ Function2 f2571c;

        /* renamed from: d */
        public final /* synthetic */ View f2572d;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$c$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ Function2 f2573a;

            /* renamed from: b */
            public final /* synthetic */ View f2574b;

            public a(Function2 function2, View view) {
                this.f2573a = function2;
                this.f2574b = view;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(HostInsets hostInsets, Continuation continuation) {
                this.f2573a.invoke(this.f2574b, hostInsets);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Flow flow, Function2 function2, View view, Continuation continuation) {
            super(2, continuation);
            this.f2570b = flow;
            this.f2571c = function2;
            this.f2572d = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f2570b, this.f2571c, this.f2572d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2569a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = this.f2570b;
                a aVar = new a(this.f2571c, this.f2572d);
                this.f2569a = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$d */
    /* loaded from: classes8.dex */
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final d f2575a = new d();

        public d() {
            super(1, C8191l.class, "bind", "bind(Landroid/view/View;)Lcom/sdkit/paylib/paylibnative/ui/databinding/PaylibNativeFragmentPaylibNativeBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8191l invoke(View p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C8191l.m2139a(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$e */
    /* loaded from: classes8.dex */
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function0 {
        public e(Object obj) {
            super(0, obj, C8249c.class, "onSheetHidden", "onSheetHidden()V", 0);
        }

        /* renamed from: a */
        public final void m2414a() {
            ((C8249c) this.receiver).m2407e();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2414a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ IllegalStateException f2576a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(IllegalStateException illegalStateException) {
            super(0);
            this.f2576a = illegalStateException;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "closeFragment: " + this.f2576a.getMessage();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$g */
    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        /* renamed from: a */
        public final void m2416a(View childView) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(childView, "childView");
            childView.setPaddingRelative(childView.getPaddingStart(), C8249c.this.getResources().getDimensionPixelSize(C11403R.dimen.paylib_native_screen_sheet_handle_padding_top), childView.getPaddingEnd(), childView.getPaddingBottom());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
            m2416a((View) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$h */
    public static final class h extends Lambda implements Function0 {

        /* renamed from: a */
        public static final h f2578a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final InterfaceC8254b invoke() {
            return C8242a.f2529a.m2362a();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$i */
    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "onAttach: " + C8360b.m3430a(C8249c.this) + " got " + C8360b.m3430a(C8249c.this.getChildFragmentManager().getFragmentFactory());
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$j */
    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "onDetach: " + C8360b.m3430a(C8249c.this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$k */
    public static final class k extends Lambda implements Function0 {

        /* renamed from: a */
        public static final k f2581a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "onViewCreated";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$l */
    public static final class l extends Lambda implements Function2 {

        /* renamed from: a */
        public static final l f2582a = new l();

        public l() {
            super(2);
        }

        /* renamed from: a */
        public final void m2421a(View targetView, HostInsets insets) {
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            Intrinsics.checkNotNullParameter(insets, "insets");
            targetView.setPadding(insets.getLeft(), insets.getTop(), insets.getRight(), insets.getBottom());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m2421a((View) obj, (HostInsets) obj2);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.c$m */
    public static final class m extends Lambda implements Function0 {
        public m() {
            super(0);
        }

        /* renamed from: a */
        public final void m2422a() {
            C8249c.this.bottomSheetController.m2379a();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2422a();
            return Unit.INSTANCE;
        }
    }

    public C8249c() {
        PaylibLoggerFactory loggerFactory;
        super(C11403R.layout.paylib_native_fragment_paylib_native);
        this.flowFactory = LazyKt__LazyJVMKt.lazy(h.f2578a);
        InterfaceC8254b interfaceC8254bM2406d = m2406d();
        this.logger = (interfaceC8254bM2406d == null || (loggerFactory = interfaceC8254bM2406d.getLoggerFactory()) == null) ? null : loggerFactory.get("PaylibNativeFragment");
        this.binding = AbstractC8376k.m3482a(this, d.f2575a);
        this.bottomSheetController = new C8246c(new e(this));
        this.paylibRootFragmentHandler = new b();
        this.callOnFlowClosed = true;
    }

    /* renamed from: c */
    public final C8191l m2405c() {
        return (C8191l) this.binding.getValue(this, f2560i[0]);
    }

    /* renamed from: d */
    public final InterfaceC8254b m2406d() {
        return (InterfaceC8254b) this.flowFactory.getValue();
    }

    /* renamed from: e */
    public final void m2407e() {
        if (this.callOnFlowClosed) {
            ActivityResultCaller activityResultCallerFindFragmentById = getChildFragmentManager().findFragmentById(C11403R.id.fragment_container);
            if (activityResultCallerFindFragmentById instanceof InterfaceC8243b) {
                ((InterfaceC8243b) activityResultCallerFindFragmentById).mo2365a();
                return;
            }
        }
        m2401a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        FragmentFactory fragmentFactoryMo2442f;
        C8252f c8252fMo2438b;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        InterfaceC8254b interfaceC8254bM2406d = m2406d();
        if (interfaceC8254bM2406d != null && (c8252fMo2438b = interfaceC8254bM2406d.mo2438b()) != null) {
            c8252fMo2438b.m2428b(this.paylibRootFragmentHandler);
        }
        InterfaceC8254b interfaceC8254bM2406d2 = m2406d();
        if (interfaceC8254bM2406d2 != null && (fragmentFactoryMo2442f = interfaceC8254bM2406d2.mo2442f()) != null) {
            getChildFragmentManager().setFragmentFactory(fragmentFactoryMo2442f);
        }
        PaylibLogger paylibLogger = this.logger;
        if (paylibLogger != null) {
            PaylibLogger.DefaultImpls.v$default(paylibLogger, null, new i(), 1, null);
        }
        AbstractC8250d.m2425c(context);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        AbstractC8365b.m3437a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Window window;
        super.onDestroyView();
        Integer num = this.originalSoftInputMode;
        if (num != null) {
            int iIntValue = num.intValue();
            FragmentActivity activity = getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.setSoftInputMode(iIntValue);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        C8252f c8252fMo2438b;
        InterfaceC8254b interfaceC8254bM2406d = m2406d();
        if (interfaceC8254bM2406d != null && (c8252fMo2438b = interfaceC8254bM2406d.mo2438b()) != null) {
            c8252fMo2438b.m2427a(this.paylibRootFragmentHandler);
        }
        PaylibLogger paylibLogger = this.logger;
        if (paylibLogger != null) {
            PaylibLogger.DefaultImpls.d$default(paylibLogger, null, new j(), 1, null);
        }
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterM1866a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        InterfaceC8254b interfaceC8254bM2406d = m2406d();
        C8103b c8103bMo2441e = interfaceC8254bM2406d != null ? interfaceC8254bM2406d.mo2441e() : null;
        return (c8103bMo2441e == null || (layoutInflaterM1866a = c8103bMo2441e.m1866a(layoutInflaterOnGetLayoutInflater)) == null) ? layoutInflaterOnGetLayoutInflater : layoutInflaterM1866a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        InterfaceC8254b interfaceC8254bM2406d;
        InternalPaylibRouter internalPaylibRouterMo2436a;
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        PaylibLogger paylibLogger = this.logger;
        if (paylibLogger != null) {
            PaylibLogger.DefaultImpls.d$default(paylibLogger, null, k.f2581a, 1, null);
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            this.originalSoftInputMode = Integer.valueOf(window.getAttributes().softInputMode);
            window.setSoftInputMode(32);
        }
        FrameLayout frameLayout = m2405c().f2205f;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.rootLayout");
        m2403a(frameLayout, l.f2582a);
        m2402a(C11403R.color.paylib_design_color_solid_black);
        m2404b();
        if (bundle == null && (interfaceC8254bM2406d = m2406d()) != null && (internalPaylibRouterMo2436a = interfaceC8254bM2406d.mo2436a()) != null) {
            internalPaylibRouterMo2436a.mo2500e();
        }
        AbstractC8365b.m3438a(this, new m());
    }

    /* renamed from: a */
    public final void m2401a() {
        InterfaceC8254b interfaceC8254bM2406d = m2406d();
        PaylibHostRouter hostRouter = interfaceC8254bM2406d != null ? interfaceC8254bM2406d.getHostRouter() : null;
        if (hostRouter != null) {
            hostRouter.close();
            return;
        }
        try {
            getParentFragmentManager().popBackStack();
        } catch (IllegalStateException e2) {
            PaylibLogger paylibLogger = this.logger;
            if (paylibLogger != null) {
                PaylibLogger.DefaultImpls.e$default(paylibLogger, null, new f(e2), 1, null);
            }
        }
    }

    /* renamed from: b */
    public final void m2404b() {
        InterfaceC8254b interfaceC8254bM2406d = m2406d();
        InterfaceC8131b interfaceC8131bMo2440d = interfaceC8254bM2406d != null ? interfaceC8254bM2406d.mo2440d() : null;
        boolean z = interfaceC8131bMo2440d != null && interfaceC8131bMo2440d.getUseSheetHandle();
        ImageView imageView = m2405c().f2202c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.bottomSheetHandleImage");
        imageView.setVisibility(z ? 0 : 8);
        ConstraintLayout constraintLayout = m2405c().f2203d;
        C8246c c8246c = this.bottomSheetController;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "this");
        c8246c.m2380a(constraintLayout, Integer.valueOf(C11403R.dimen.paylib_native_payment_view_sheet_preferable_height), interfaceC8131bMo2440d != null && interfaceC8131bMo2440d.mo2010e(), interfaceC8131bMo2440d != null && interfaceC8131bMo2440d.getStartExpanded(), z);
        constraintLayout.setOutlineProvider(new C8248e());
        constraintLayout.setClipToOutline(true);
        if (z) {
            m2405c().f2204e.setOnChildAdded(new g());
        }
    }

    /* renamed from: a */
    public final void m2402a(int colorResId) {
        Window window;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(ContextCompat.getColor(window.getContext(), colorResId));
    }

    /* renamed from: a */
    public final void m2403a(View view, Function2 insetsApplier) {
        PaylibHostRouter hostRouter;
        InterfaceC8254b interfaceC8254bM2406d = m2406d();
        Flow<HostInsets> flowInsetsForFragment = (interfaceC8254bM2406d == null || (hostRouter = interfaceC8254bM2406d.getHostRouter()) == null) ? null : hostRouter.insetsForFragment(this);
        if (flowInsetsForFragment != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new c(flowInsetsForFragment, insetsApplier, view, null), 3, null);
        }
    }
}
