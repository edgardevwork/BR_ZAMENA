package ru.rustore.sdk.billingclient.impl.presentation.auth;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.ScanBuild;
import ru.rustore.sdk.billingclient.C11403R;
import ru.rustore.sdk.billingclient.impl.analytics.C11413i;
import ru.rustore.sdk.billingclient.impl.domain.model.C11508e;
import ru.rustore.sdk.billingclient.impl.domain.model.UnauthorizedProductType;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11514a;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;
import ru.rustore.sdk.billingclient.impl.presentation.auth.C11534a;
import ru.rustore.sdk.billingclient.impl.presentation.auth.InterfaceC11544k;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.ObservableObserveOnKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"Lru/rustore/sdk/billingclient/impl/presentation/auth/d;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", SegmentConstantPool.INITSTRING, "()V", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.d */
/* loaded from: classes8.dex */
public final class C11537d extends BottomSheetDialogFragment {

    /* renamed from: e */
    public static final /* synthetic */ int f10557e = 0;

    /* renamed from: a */
    public WebView f10558a;

    /* renamed from: b */
    public View f10559b;

    /* renamed from: c */
    public Disposable f10560c;

    /* renamed from: d */
    public final Lazy f10561d = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C11542i.class), new c(new b(this)), null);

    /* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.d$a */
    public static final class a extends BottomSheetDialog {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // androidx.activity.ComponentDialog, android.app.Dialog
        public final void onBackPressed() {
            C11537d c11537d = C11537d.this;
            int i = C11537d.f10557e;
            c11537d.m7475a();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.d$b */
    /* loaded from: classes5.dex */
    public static final class b extends Lambda implements Function0<Fragment> {

        /* renamed from: a */
        public final /* synthetic */ Fragment f10563a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f10563a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return this.f10563a;
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.d$c */
    /* loaded from: classes5.dex */
    public static final class c extends Lambda implements Function0<ViewModelStore> {

        /* renamed from: a */
        public final /* synthetic */ Function0 f10564a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f10564a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.f10564a.invoke()).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: a */
    public final void m7475a() {
        UnauthorizedProductType unauthorizedProductType;
        InterfaceC11544k value = ((C11542i) this.f10561d.getValue()).f10570b.getValue();
        InterfaceC11544k.a aVar = value instanceof InterfaceC11544k.a ? (InterfaceC11544k.a) value : null;
        if (aVar == null || (unauthorizedProductType = aVar.f10575b) == null) {
            unauthorizedProductType = UnauthorizedProductType.UNKNOWN;
        }
        Lazy<C11497a> lazy = C11497a.f10328u0;
        C11534a c11534a = (C11534a) C11497a.C11965b.m7463a().f10353Y.getValue();
        C11508e c11508eM7459a = c11534a.f10551b.m7459a();
        Pair pairM7112to = TuplesKt.m7112to("without_rustore", String.valueOf(!(c11534a.f10550a.m7456a() == 1)));
        int i = unauthorizedProductType == null ? -1 : C11534a.a.f10554a[unauthorizedProductType.ordinal()];
        SingleSubscribeKt.subscribe$default(c11534a.f10552c.m7454a(new C11413i("payAuthBack.signIn", MapsKt__MapsKt.mutableMapOf(pairM7112to, TuplesKt.m7112to("rustore_payment", i != 1 ? i != 2 ? i != 3 ? ScanBuild.XRAY_FATAL_FAIL_STATUS : "4" : "3" : "0"), TuplesKt.m7112to("package_name", c11534a.f10553d.getPackageName()), TuplesKt.m7112to("sdkType", c11508eM7459a.f10491b), TuplesKt.m7112to(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "8.0.0"))), true), null, C11535b.f10555a, 1, null);
        ((C11514a) C11497a.C11965b.m7463a().f10370h0.getValue()).m7468a();
        requireActivity().finish();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        return new a(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C11403R.layout.bottom_sheet_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f10560c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Bundle bundle = new Bundle();
        WebView webView = this.f10558a;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authWebView");
            webView = null;
        }
        webView.saveState(bundle);
        outState.putBundle("WEB_VIEW_STATE_KEY", bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ru.rustore.sdk.billingclient.impl.presentation.auth.d$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C11537d.m7474a(this.f$0, dialogInterface);
                }
            });
        }
        View viewFindViewById = view.findViewById(C11403R.id.progress_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.progress_bar)");
        this.f10559b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(C11403R.id.auth_web_view);
        WebView onViewCreated$lambda$1 = (WebView) viewFindViewById2;
        Intrinsics.checkNotNullExpressionValue(onViewCreated$lambda$1, "onViewCreated$lambda$1");
        onViewCreated$lambda$1.addJavascriptInterface(new C11545l(new C11538e(this), new C11539f(this), new C11540g(this, bundle)), "Android");
        onViewCreated$lambda$1.getSettings().setJavaScriptEnabled(true);
        onViewCreated$lambda$1.setWebViewClient(new C11541h());
        if (bundle != null && (bundle2 = bundle.getBundle("WEB_VIEW_STATE_KEY")) != null) {
            onViewCreated$lambda$1.restoreState(bundle2);
        }
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById<WebVie…dInstanceState)\n        }");
        this.f10558a = onViewCreated$lambda$1;
        this.f10560c = ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(Subject.DefaultImpls.observe$default(((C11542i) this.f10561d.getValue()).f10571c, null, 1, null), Dispatchers.INSTANCE.getMain(), null, 2, null), null, null, new C11536c(this), 3, null);
        Dialog dialog2 = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog2 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog2 : null;
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog != null ? bottomSheetDialog.getBehavior() : null;
        if (behavior == null) {
            return;
        }
        behavior.setState(3);
    }

    /* renamed from: a */
    public static final void m7474a(C11537d this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m7475a();
    }
}
