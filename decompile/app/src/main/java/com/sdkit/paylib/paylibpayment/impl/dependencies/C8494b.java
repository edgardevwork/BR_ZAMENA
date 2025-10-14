package com.sdkit.paylib.paylibpayment.impl.dependencies;

import com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider;
import com.sdkit.paylib.paylibpayment.impl.dependencies.C8494b;
import com.sdkit.paylib.paylibpayment.impl.p038di.AdditionalPaylibPaymentDependencies;
import com.sdkit.paylib.paylibpayment.impl.p038di.PaylibPaymentDependencies;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.dependencies.b */
/* loaded from: classes6.dex */
public final class C8494b implements InterfaceC8493a {

    /* renamed from: a */
    public final PaylibPaymentDependencies f4761a;

    /* renamed from: b */
    public final Lazy f4762b;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.dependencies.b$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AdditionalPaylibPaymentDependencies invoke() {
            PaylibPaymentDependencies paylibPaymentDependencies = C8494b.this.f4761a;
            AdditionalPaylibPaymentDependencies additionalPaylibPaymentDependencies = paylibPaymentDependencies instanceof AdditionalPaylibPaymentDependencies ? (AdditionalPaylibPaymentDependencies) paylibPaymentDependencies : null;
            return additionalPaylibPaymentDependencies == null ? C8494b.this.m3904b() : additionalPaylibPaymentDependencies;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.dependencies.b$b */
    public static final class b implements AdditionalPaylibPaymentDependencies {

        /* renamed from: a */
        public final InternalConfigProvider f4764a = new InternalConfigProvider() { // from class: com.sdkit.paylib.paylibpayment.impl.dependencies.b$b$$ExternalSyntheticLambda0
            @Override // com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider
            public final String provide() {
                return C8494b.b.m3906a();
            }
        };

        /* renamed from: a */
        public static final String m3906a() {
            return "";
        }

        @Override // com.sdkit.paylib.paylibpayment.impl.p038di.AdditionalPaylibPaymentDependencies
        public InternalConfigProvider getConfigProvider() {
            return this.f4764a;
        }
    }

    public C8494b(PaylibPaymentDependencies paylibPaymentDependencies) {
        Intrinsics.checkNotNullParameter(paylibPaymentDependencies, "paylibPaymentDependencies");
        this.f4761a = paylibPaymentDependencies;
        this.f4762b = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* renamed from: a */
    public final AdditionalPaylibPaymentDependencies m3903a() {
        return (AdditionalPaylibPaymentDependencies) this.f4762b.getValue();
    }

    /* renamed from: b */
    public final AdditionalPaylibPaymentDependencies m3904b() {
        return new b();
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.dependencies.InterfaceC8493a
    public AdditionalPaylibPaymentDependencies provide() {
        return m3903a();
    }
}
