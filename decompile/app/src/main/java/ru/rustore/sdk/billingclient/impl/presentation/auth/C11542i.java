package ru.rustore.sdk.billingclient.impl.presentation.auth;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.billingclient.impl.domain.model.UnauthorizedProductType;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11515b;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11520g;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11521h;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11522i;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11523j;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;
import ru.rustore.sdk.billingclient.impl.presentation.auth.InterfaceC11544k;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleObserveOnKt;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.StateSubject;
import ru.rustore.sdk.reactive.subject.SubjectExtensionsKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.i */
/* loaded from: classes7.dex */
public final class C11542i extends ViewModel {

    /* renamed from: a */
    public final ArrayList f10569a;

    /* renamed from: b */
    public final MutableStateSubject<InterfaceC11544k> f10570b;

    /* renamed from: c */
    public final StateSubject f10571c;

    /* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.i$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<UnauthorizedProductType, Unit> {
        public a(Object obj) {
            super(1, obj, C11542i.class, "setContentState", "setContentState(Lru/rustore/sdk/billingclient/impl/domain/model/UnauthorizedProductType;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(UnauthorizedProductType unauthorizedProductType) throws NoSuchAlgorithmException {
            UnauthorizedProductType p0 = unauthorizedProductType;
            Intrinsics.checkNotNullParameter(p0, "p0");
            C11542i.m7478a((C11542i) this.receiver, p0);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.i$b */
    /* loaded from: classes5.dex */
    public static final class b extends Lambda implements Function1<Throwable, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) throws NoSuchAlgorithmException {
            Throwable error = th;
            Intrinsics.checkNotNullParameter(error, "error");
            Log.e("AuthBottomSheetViewModel", error.getLocalizedMessage());
            C11542i.m7478a(C11542i.this, UnauthorizedProductType.UNKNOWN);
            return Unit.INSTANCE;
        }
    }

    public C11542i() {
        ArrayList arrayList = new ArrayList();
        this.f10569a = arrayList;
        MutableStateSubject<InterfaceC11544k> mutableStateSubject = new MutableStateSubject<>(InterfaceC11544k.b.f10576a);
        this.f10570b = mutableStateSubject;
        this.f10571c = SubjectExtensionsKt.asStateSubject(mutableStateSubject);
        Lazy<C11497a> lazy = C11497a.f10328u0;
        C11523j c11523j = (C11523j) C11497a.C11965b.m7463a().f10366f0.getValue();
        c11523j.getClass();
        arrayList.add(SingleSubscribeKt.subscribe(SingleObserveOnKt.observeOn(SingleOnErrorReturnKt.onErrorReturn(SingleFlatMapKt.flatMap(Single.INSTANCE.from(new C11520g(c11523j)), new C11521h(c11523j)), C11522i.f10519a), Dispatchers.INSTANCE.getMain()), new b(), new a(this)));
    }

    /* renamed from: a */
    public static final void m7478a(C11542i c11542i, UnauthorizedProductType type) throws NoSuchAlgorithmException {
        MutableStateSubject<InterfaceC11544k> mutableStateSubject = c11542i.f10570b;
        Lazy<C11497a> lazy = C11497a.f10328u0;
        C11515b c11515b = (C11515b) C11497a.C11965b.m7463a().f10390r0.getValue();
        c11515b.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        c11515b.f10509b.m7459a();
        StringBuilder sb = new StringBuilder("signature=");
        ArrayList arrayListM7464a = c11515b.f10510c.m7464a();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayListM7464a, 10));
        Iterator it = arrayListM7464a.iterator();
        while (it.hasNext()) {
            arrayList.add("\"" + ((String) it.next()) + '\"');
        }
        sb.append(arrayList);
        String value = "https://rustore.ru/external/rustore-auth/?" + sb.toString() + '&' + ("packageName=" + c11515b.f10511d) + '&' + ("deviceId=" + c11515b.f10508a.f10292a.m7444a()) + '&' + ("productType=" + type.getValue()) + "&sdkName=ru.rustore.sdk:billingclient&sdkVersion=8.0.0";
        Intrinsics.checkNotNullParameter(value, "value");
        mutableStateSubject.setValue(new InterfaceC11544k.a(value, type));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        Iterator it = this.f10569a.iterator();
        while (it.hasNext()) {
            ((Disposable) it.next()).dispose();
        }
        super.onCleared();
    }
}
