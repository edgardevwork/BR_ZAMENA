package com.sdkit.paylib.paylibnative.p033ui.routing;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibHostRouter;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.startparams.InterfaceC8112a;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.C8252f;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.InterfaceC8251e;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.banks.C8267b;
import com.sdkit.paylib.paylibnative.p033ui.screens.cards.C8275b;
import com.sdkit.paylib.paylibnative.p033ui.screens.cardsaving.C8282a;
import com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult.C8287a;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.C8294a;
import com.sdkit.paylib.paylibnative.p033ui.screens.loading.C8310a;
import com.sdkit.paylib.paylibnative.p033ui.screens.manualupdate.C8314a;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileb.C8319a;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.C8324a;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.viewobjects.C8331a;
import com.sdkit.paylib.paylibnative.p033ui.screens.payment.C8332a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.AbstractC8337a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8339c;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess.C8345a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess.C8346b;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.C8351a;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.viewobjects.C8357a;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8375j;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c */
/* loaded from: classes6.dex */
public final class C8263c implements InternalPaylibRouter {

    /* renamed from: a */
    public final C8252f f2729a;

    /* renamed from: b */
    public final PaylibHostRouter f2730b;

    /* renamed from: c */
    public final InterfaceC8238l f2731c;

    /* renamed from: d */
    public final Provider f2732d;

    /* renamed from: e */
    public final PaylibLogger f2733e;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2734a;

        static {
            int[] iArr = new int[EnumC8262b.values().length];
            try {
                iArr[EnumC8262b.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8262b.INVOICE_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8262b.MANUAL_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8262b.DEEPLINK_RESULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC8262b.PAYMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC8262b.BANKS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC8262b.CARDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC8262b.WEB.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC8262b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f2734a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$a0 */
    /* loaded from: classes5.dex */
    public static final class a0 extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ C8346b f2735a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(C8346b c8346b) {
            super(0);
            this.f2735a = c8346b;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "pushPaymentSuccessScreen " + this.f2735a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$b */
    /* loaded from: classes5.dex */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "addCard (via " + C8263c.this.f2730b + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$b0 */
    /* loaded from: classes5.dex */
    public static final class b0 extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ C8346b f2738b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(C8346b c8346b) {
            super(1);
            this.f2738b = c8346b;
        }

        /* renamed from: a */
        public final void m2518a(FragmentTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            C8263c.this.m2509a(transaction);
            Bundle bundle = new Bundle();
            bundle.putParcelable("PARAMETERS_KEY", this.f2738b);
            transaction.replace(C11403R.id.fragment_container, C8345a.class, bundle);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2518a((FragmentTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$c */
    /* loaded from: classes5.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public static final c f2739a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "closePaylib";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$c0 */
    /* loaded from: classes5.dex */
    public static final class c0 extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ boolean f2740a;

        /* renamed from: b */
        public final /* synthetic */ boolean f2741b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(boolean z, boolean z2) {
            super(0);
            this.f2740a = z;
            this.f2741b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("pushWebPaymentScreen isCardShouldBeSaved(");
            sb.append(this.f2740a);
            sb.append(") isBackEnabled(");
            return C8030a.m1428a(sb, this.f2741b, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$d */
    /* loaded from: classes5.dex */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public static final d f2742a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "navigateBack";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$d0 */
    /* loaded from: classes5.dex */
    public static final class d0 extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ C8261a f2743a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8112a f2744b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(C8261a c8261a, InterfaceC8112a interfaceC8112a) {
            super(0);
            this.f2743a = c8261a;
            this.f2744b = interfaceC8112a;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "startErrorActionScenario " + this.f2743a + ", screenStartParams " + this.f2744b;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$e */
    /* loaded from: classes5.dex */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public static final e f2745a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "pushBanksScreen";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$f */
    /* loaded from: classes5.dex */
    public static final class f extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ Bundle f2747b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Bundle bundle) {
            super(1);
            this.f2747b = bundle;
        }

        /* renamed from: a */
        public final void m2524a(FragmentTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            C8263c.this.m2509a(transaction);
            int i = C11403R.id.fragment_container;
            Bundle bundleBundleOf = this.f2747b;
            if (bundleBundleOf == null) {
                bundleBundleOf = BundleKt.bundleOf(new Pair[0]);
            }
            transaction.replace(i, C8267b.class, bundleBundleOf);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2524a((FragmentTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$g */
    /* loaded from: classes5.dex */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: a */
        public static final g f2748a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "pushCardSavingScreen";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$h */
    /* loaded from: classes5.dex */
    public static final class h extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ Bundle f2750b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Bundle bundle) {
            super(1);
            this.f2750b = bundle;
        }

        /* renamed from: a */
        public final void m2526a(FragmentTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            C8263c.this.m2509a(transaction);
            transaction.replace(C11403R.id.fragment_container, C8282a.class, this.f2750b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2526a((FragmentTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$i */
    /* loaded from: classes5.dex */
    public static final class i extends Lambda implements Function0 {

        /* renamed from: a */
        public static final i f2751a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "pushCardsScreen";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$j */
    /* loaded from: classes5.dex */
    public static final class j extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ Bundle f2753b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Bundle bundle) {
            super(1);
            this.f2753b = bundle;
        }

        /* renamed from: a */
        public final void m2528a(FragmentTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            C8263c.this.m2509a(transaction);
            int i = C11403R.id.fragment_container;
            Bundle bundleBundleOf = this.f2753b;
            if (bundleBundleOf == null) {
                bundleBundleOf = BundleKt.bundleOf(new Pair[0]);
            }
            transaction.replace(i, C8275b.class, bundleBundleOf);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2528a((FragmentTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$k */
    /* loaded from: classes5.dex */
    public static final class k extends Lambda implements Function0 {

        /* renamed from: a */
        public static final k f2754a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "pushDeeplinkResultScreen";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$l */
    /* loaded from: classes5.dex */
    public static final class l extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ Bundle f2756b;

        /* renamed from: c */
        public final /* synthetic */ boolean f2757c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Bundle bundle, boolean z) {
            super(1);
            this.f2756b = bundle;
            this.f2757c = z;
        }

        /* renamed from: a */
        public final void m2530a(FragmentTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            C8263c.this.m2509a(transaction);
            Bundle bundle = this.f2756b;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("manual_update", this.f2757c);
            transaction.replace(C11403R.id.fragment_container, C8287a.class, bundle);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2530a((FragmentTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$m */
    /* loaded from: classes5.dex */
    public static final class m extends Lambda implements Function0 {

        /* renamed from: a */
        public static final m f2758a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "pushFirstScreen";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$n */
    /* loaded from: classes5.dex */
    public static final class n extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8128b f2759a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(AbstractC8128b abstractC8128b) {
            super(0);
            this.f2759a = abstractC8128b;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "pushInvoiceDetailsScreen actionButtonStyle(" + this.f2759a + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$o */
    /* loaded from: classes5.dex */
    public static final class o extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ AbstractC8128b f2761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(AbstractC8128b abstractC8128b) {
            super(1);
            this.f2761b = abstractC8128b;
        }

        /* renamed from: a */
        public final void m2533a(FragmentTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            C8263c.this.m2509a(transaction);
            Bundle bundle = new Bundle();
            AbstractC8128b abstractC8128b = this.f2761b;
            if (abstractC8128b != null) {
                bundle.putParcelable("ERROR_ACTION", abstractC8128b);
            }
            transaction.replace(C11403R.id.fragment_container, C8294a.class, bundle);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2533a((FragmentTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$p */
    /* loaded from: classes5.dex */
    public static final class p extends Lambda implements Function1 {

        /* renamed from: a */
        public static final p f2762a = new p();

        public p() {
            super(1);
        }

        /* renamed from: a */
        public final void m2534a(FragmentTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            int i = C11403R.anim.paylib_native_fade_in_move_up;
            int i2 = C11403R.anim.paylib_native_fade_out;
            transaction.setCustomAnimations(i, i2, i2, i2);
            transaction.replace(C11403R.id.fragment_container, C8310a.class, BundleKt.bundleOf(new Pair[0]));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2534a((FragmentTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$q */
    /* loaded from: classes5.dex */
    public static final class q extends Lambda implements Function0 {

        /* renamed from: a */
        public static final q f2763a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "pushManualUpdateScreen";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$r */
    /* loaded from: classes5.dex */
    public static final class r extends Lambda implements Function1 {
        public r() {
            super(1);
        }

        /* renamed from: a */
        public final void m2536a(FragmentTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            C8263c.this.m2509a(transaction);
            transaction.replace(C11403R.id.fragment_container, C8314a.class, BundleKt.bundleOf(new Pair[0]));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2536a((FragmentTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$s */
    /* loaded from: classes5.dex */
    public static final class s extends Lambda implements Function0 {

        /* renamed from: a */
        public static final s f2765a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "pushMobileConfirmationScreen";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$t */
    /* loaded from: classes5.dex */
    public static final class t extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ C8331a f2767b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(C8331a c8331a) {
            super(1);
            this.f2767b = c8331a;
        }

        /* renamed from: a */
        public final void m2538a(FragmentTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            C8263c.this.m2509a(transaction);
            Bundle bundle = new Bundle();
            bundle.putParcelable("param_mobile_confirmation_start_params", this.f2767b);
            transaction.replace(C11403R.id.fragment_container, C8324a.class, bundle);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2538a((FragmentTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$u */
    /* loaded from: classes5.dex */
    public static final class u extends Lambda implements Function0 {

        /* renamed from: a */
        public static final u f2768a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "pushMobileInputScreen";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$v */
    /* loaded from: classes5.dex */
    public static final class v extends Lambda implements Function1 {
        public v() {
            super(1);
        }

        /* renamed from: a */
        public final void m2540a(FragmentTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            C8263c.this.m2509a(transaction);
            transaction.replace(C11403R.id.fragment_container, C8319a.class, (Bundle) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2540a((FragmentTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$w */
    /* loaded from: classes5.dex */
    public static final class w extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ C8340d f2770a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(C8340d c8340d) {
            super(0);
            this.f2770a = c8340d;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "pushPaymentErrorScreen " + this.f2770a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$x */
    /* loaded from: classes5.dex */
    public static final class x extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ C8340d f2772b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(C8340d c8340d) {
            super(1);
            this.f2772b = c8340d;
        }

        /* renamed from: a */
        public final void m2542a(FragmentTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            C8263c.this.m2509a(transaction);
            Bundle bundle = new Bundle();
            bundle.putParcelable("PARAMETERS_KEY", this.f2772b);
            transaction.replace(C11403R.id.fragment_container, C8339c.class, bundle);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2542a((FragmentTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$y */
    /* loaded from: classes5.dex */
    public static final class y extends Lambda implements Function0 {

        /* renamed from: a */
        public static final y f2773a = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "pushPaymentScreen";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.routing.c$z */
    /* loaded from: classes5.dex */
    public static final class z extends Lambda implements Function1 {

        /* renamed from: b */
        public final /* synthetic */ Bundle f2775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Bundle bundle) {
            super(1);
            this.f2775b = bundle;
        }

        /* renamed from: a */
        public final void m2544a(FragmentTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            C8263c.this.m2509a(transaction);
            int i = C11403R.id.fragment_container;
            Bundle bundleBundleOf = this.f2775b;
            if (bundleBundleOf == null) {
                bundleBundleOf = BundleKt.bundleOf(new Pair[0]);
            }
            transaction.replace(i, C8332a.class, bundleBundleOf);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m2544a((FragmentTransaction) obj);
            return Unit.INSTANCE;
        }
    }

    public C8263c(C8252f fragmentHandlerProvider, PaylibHostRouter paylibHostRouter, InterfaceC8238l paylibStateManager, Provider webPaymentFragmentProvider, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(fragmentHandlerProvider, "fragmentHandlerProvider");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(webPaymentFragmentProvider, "webPaymentFragmentProvider");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2729a = fragmentHandlerProvider;
        this.f2730b = paylibHostRouter;
        this.f2731c = paylibStateManager;
        this.f2732d = webPaymentFragmentProvider;
        this.f2733e = loggerFactory.get("InternalPaylibRouterImpl");
    }

    /* renamed from: a */
    public final FragmentTransaction m2509a(FragmentTransaction fragmentTransaction) {
        int i2 = C11403R.anim.paylib_native_fade_in;
        int i3 = C11403R.anim.paylib_native_fade_out;
        FragmentTransaction customAnimations = fragmentTransaction.setCustomAnimations(i2, i3, i3, i3);
        Intrinsics.checkNotNullExpressionValue(customAnimations, "setCustomAnimations(\n   …ative_fade_out,\n        )");
        return customAnimations;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: b */
    public void mo2495b() {
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, new b(), 1, null);
        PaylibHostRouter paylibHostRouter = this.f2730b;
        if (paylibHostRouter != null) {
            paylibHostRouter.openCards();
        }
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: c */
    public void mo2497c() {
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, u.f2768a, 1, null);
        m2510a(new v());
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: d */
    public void mo2499d() {
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, q.f2763a, 1, null);
        m2510a(new r());
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: e */
    public void mo2500e() {
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, m.f2758a, 1, null);
        AbstractC8237k abstractC8237kMo2351c = this.f2731c.mo2351c();
        if (abstractC8237kMo2351c instanceof AbstractC8237k.f.b ? true : abstractC8237kMo2351c instanceof AbstractC8237k.a.c ? true : abstractC8237kMo2351c instanceof AbstractC8237k.g.b ? true : abstractC8237kMo2351c instanceof AbstractC8237k.e.b) {
            m2513i();
        } else {
            if (abstractC8237kMo2351c instanceof AbstractC8237k.e ? true : abstractC8237kMo2351c instanceof AbstractC8237k.a ? true : abstractC8237kMo2351c instanceof AbstractC8237k.f ? true : abstractC8237kMo2351c instanceof AbstractC8237k.g) {
                m2515k();
            } else if (abstractC8237kMo2351c instanceof AbstractC8237k.d) {
                mo2485a();
            } else {
                if (!(abstractC8237kMo2351c instanceof AbstractC8237k.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                mo2491a(m2511g());
            }
        }
        AbstractC8375j.m3481a(Unit.INSTANCE);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: f */
    public void mo2501f() {
        FragmentManager fragmentManagerMo2410b;
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, d.f2742a, 1, null);
        InterfaceC8251e interfaceC8251eM2512h = m2512h();
        if (interfaceC8251eM2512h == null || (fragmentManagerMo2410b = interfaceC8251eM2512h.mo2410b()) == null) {
            return;
        }
        fragmentManagerMo2410b.popBackStack();
    }

    /* renamed from: g */
    public final C8340d m2511g() {
        return new C8340d(null, new AbstractC8337a.a(C11403R.string.paylib_native_payment_unknown_error, null, null), new C8261a(EnumC8262b.NONE, AbstractC8128b.a.f1932a), false, EnumC8105d.UNHANDLED_FORM_ERROR, null, 41, null);
    }

    /* renamed from: h */
    public final InterfaceC8251e m2512h() {
        return this.f2729a.m2426a();
    }

    /* renamed from: i */
    public final void m2513i() {
        InternalPaylibRouter.DefaultImpls.pushDeeplinkResultScreen$default(this, false, null, 2, null);
    }

    /* renamed from: j */
    public final void m2514j() {
        m2510a(p.f2762a);
    }

    /* renamed from: k */
    public final void m2515k() {
        m2514j();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: b */
    public void mo2496b(Bundle bundle) {
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, i.f2751a, 1, null);
        m2510a(new j(bundle));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: c */
    public void mo2498c(Bundle bundle) {
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, e.f2745a, 1, null);
        m2510a(new f(bundle));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: a */
    public void mo2485a() {
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, c.f2739a, 1, null);
        InterfaceC8251e interfaceC8251eM2512h = m2512h();
        if (interfaceC8251eM2512h != null) {
            interfaceC8251eM2512h.mo2409a();
        }
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: a */
    public void mo2486a(Bundle bundle) {
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, y.f2773a, 1, null);
        m2510a(new z(bundle));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: a */
    public void mo2487a(AbstractC8128b abstractC8128b) {
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, new n(abstractC8128b), 1, null);
        m2510a(new o(abstractC8128b));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: a */
    public void mo2488a(C8261a errorAction, InterfaceC8112a interfaceC8112a) {
        Intrinsics.checkNotNullParameter(errorAction, "errorAction");
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, new d0(errorAction, interfaceC8112a), 1, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable("ERROR_ACTION", errorAction.m2502a());
        switch (a.f2734a[errorAction.m2503b().ordinal()]) {
            case 1:
                m2514j();
                break;
            case 2:
                mo2487a(errorAction.m2502a());
                break;
            case 3:
                mo2499d();
                break;
            case 4:
                mo2494a(true, bundle);
                break;
            case 5:
                mo2486a(bundle);
                break;
            case 6:
                mo2498c(bundle);
                break;
            case 7:
                mo2496b(bundle);
                break;
            case 8:
                C8357a c8357a = interfaceC8112a instanceof C8357a ? (C8357a) interfaceC8112a : null;
                mo2493a(c8357a != null ? C8357a.m3418a(c8357a, false, false, null, errorAction.m2502a() instanceof AbstractC8128b.i, 7, null) : null);
                break;
            case 9:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        AbstractC8375j.m3481a(Unit.INSTANCE);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: a */
    public void mo2489a(EnumC8265e enumC8265e) {
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, g.f2748a, 1, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable("previous_screen", enumC8265e);
        m2510a(new h(bundle));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: a */
    public void mo2490a(C8331a mobileConfirmationStartParams) {
        Intrinsics.checkNotNullParameter(mobileConfirmationStartParams, "mobileConfirmationStartParams");
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, s.f2765a, 1, null);
        m2510a(new t(mobileConfirmationStartParams));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: a */
    public void mo2491a(C8340d parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, new w(parameters), 1, null);
        m2510a(new x(parameters));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: a */
    public void mo2492a(C8346b parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, new a0(parameters), 1, null);
        m2510a(new b0(parameters));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: a */
    public void mo2493a(C8357a c8357a) {
        FragmentManager fragmentManagerMo2410b;
        FragmentTransaction fragmentTransactionBeginTransaction;
        boolean zM3422c = c8357a != null ? c8357a.m3422c() : false;
        boolean zM3421b = c8357a != null ? c8357a.m3421b() : false;
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, new c0(zM3422c, zM3421b), 1, null);
        InterfaceC8251e interfaceC8251eM2512h = m2512h();
        if (interfaceC8251eM2512h == null || (fragmentManagerMo2410b = interfaceC8251eM2512h.mo2410b()) == null || (fragmentTransactionBeginTransaction = fragmentManagerMo2410b.beginTransaction()) == null) {
            return;
        }
        String name = C8351a.class.getName();
        if (zM3421b) {
            fragmentTransactionBeginTransaction.addToBackStack(name);
        }
        C8351a c8351a = (C8351a) this.f2732d.get();
        c8351a.setArguments(BundleKt.bundleOf(TuplesKt.m7112to("web_payment_screen_start_params", c8357a)));
        c8351a.show(fragmentTransactionBeginTransaction, name);
    }

    /* renamed from: a */
    public final void m2510a(Function1 function1) {
        FragmentManager fragmentManagerMo2410b;
        FragmentTransaction fragmentTransactionBeginTransaction;
        InterfaceC8251e interfaceC8251eM2512h = m2512h();
        if (interfaceC8251eM2512h == null || (fragmentManagerMo2410b = interfaceC8251eM2512h.mo2410b()) == null || (fragmentTransactionBeginTransaction = fragmentManagerMo2410b.beginTransaction()) == null) {
            return;
        }
        function1.invoke(fragmentTransactionBeginTransaction);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter
    /* renamed from: a */
    public void mo2494a(boolean z2, Bundle bundle) {
        PaylibLogger.DefaultImpls.v$default(this.f2733e, null, k.f2754a, 1, null);
        m2510a(new l(bundle, z2));
    }
}
