package com.sdkit.paylib.paylibnative.p033ui.screens.loading;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8365b;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.loading.a */
/* loaded from: classes7.dex */
public final class C8310a extends Fragment implements InterfaceC8243b {

    /* renamed from: a */
    public final C8103b f3200a;

    /* renamed from: b */
    public final Lazy f3201b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.loading.a$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        /* renamed from: a */
        public final void m2945a() {
            C8310a.this.m2944b().m2933d();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2945a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.loading.a$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8258f f3203a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f3204b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC8258f abstractC8258f, Fragment fragment) {
            super(0);
            this.f3203a = abstractC8258f;
            this.f3204b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewModel invoke() {
            ViewModel viewModelM2480a = this.f3203a.m2480a(this.f3204b, LoadingViewModel.class);
            if (viewModelM2480a != null) {
                return (LoadingViewModel) viewModelM2480a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.screens.loading.LoadingViewModel");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8310a(AbstractC8258f viewModelProvider, C8103b layoutInflaterThemeValidator) {
        super(C11403R.layout.paylib_native_fragment_loading);
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(layoutInflaterThemeValidator, "layoutInflaterThemeValidator");
        this.f3200a = layoutInflaterThemeValidator;
        this.f3201b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new b(viewModelProvider, this));
    }

    /* renamed from: b */
    public final LoadingViewModel m2944b() {
        return (LoadingViewModel) this.f3201b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        m2944b().m2936g();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        C8103b c8103b = this.f3200a;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "super.onGetLayoutInflater(savedInstanceState)");
        return c8103b.m1866a(layoutInflaterOnGetLayoutInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        AbstractC8365b.m3438a(this, new a());
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8243b
    /* renamed from: a */
    public void mo2365a() {
        m2944b().m2933d();
    }
}
