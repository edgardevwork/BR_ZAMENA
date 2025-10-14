package ru.rustore.sdk.billingclient.impl.data.repository;

import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import ru.p068vk.store.sdk.lib.storeversion.aidl.model.StoreVersionInfo;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11439q;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11440r;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11441s;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11451f;
import ru.rustore.sdk.billingclient.impl.domain.model.C11509f;
import ru.rustore.sdk.billingclient.impl.utils.C11556h;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.r */
/* loaded from: classes5.dex */
public final class C11490r {

    /* renamed from: a */
    public final C11441s f10315a;

    /* renamed from: b */
    public final C11451f f10316b;

    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.data.repository.StoreVersionRepository", m7120f = "StoreVersionRepository.kt", m7121i = {0}, m7122l = {13}, m7123m = "get", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.r$a */
    /* loaded from: classes8.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public C11490r f10317a;

        /* renamed from: b */
        public /* synthetic */ Object f10318b;

        /* renamed from: d */
        public int f10320d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10318b = obj;
            this.f10320d |= Integer.MIN_VALUE;
            return C11490r.this.m7460a(this);
        }
    }

    public C11490r(C11441s dataSource, C11451f mapper) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f10315a = dataSource;
        this.f10316b = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7460a(Continuation<? super C11509f> continuation) throws Throwable {
        a aVar;
        C11490r c11490r;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f10320d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f10320d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objM7480a = aVar.f10318b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f10320d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM7480a);
            C11441s c11441s = this.f10315a;
            aVar.f10317a = this;
            aVar.f10320d = 1;
            objM7480a = C11556h.m7480a(SingleOnErrorReturnKt.onErrorReturn(SingleMapKt.map(c11441s.f10232a.getStoreVersionInfo(), C11439q.f10230a), C11440r.f10231a), aVar);
            if (objM7480a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c11490r = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11490r = aVar.f10317a;
            ResultKt.throwOnFailure(objM7480a);
        }
        StoreVersionInfo dto = (StoreVersionInfo) objM7480a;
        if (dto == null) {
            return null;
        }
        c11490r.f10316b.getClass();
        Intrinsics.checkNotNullParameter(dto, "dto");
        try {
            String versionName = dto.getVersionName();
            Intrinsics.checkNotNullExpressionValue(versionName, "dto.versionName");
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) versionName, new String[]{"."}, false, 0, 6, (Object) null);
            return new C11509f(Long.parseLong((String) listSplit$default.get(0)), Long.parseLong((String) listSplit$default.get(1)));
        } catch (NumberFormatException e) {
            throw new IllegalStateException("Incorrect store version format", e);
        }
    }
}
