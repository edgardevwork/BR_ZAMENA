package ru.rustore.sdk.review;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.review.C11779C;
import ru.rustore.sdk.review.model.ReviewInfo;

@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m7105d2 = {"Lru/rustore/sdk/review/RuStoreReviewManager;", "", "Landroid/content/Context;", "context", "", "", "internalConfig", SegmentConstantPool.INITSTRING, "(Landroid/content/Context;Ljava/util/Map;)V", "Lru/rustore/sdk/core/tasks/Task;", "Lru/rustore/sdk/review/model/ReviewInfo;", "requestReviewFlow", "()Lru/rustore/sdk/core/tasks/Task;", "reviewInfo", "", "launchReviewFlow", "(Lru/rustore/sdk/review/model/ReviewInfo;)Lru/rustore/sdk/core/tasks/Task;", "sdk-public-review_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* loaded from: classes5.dex */
public final class RuStoreReviewManager {

    /* renamed from: a */
    public final C11805x f11000a;

    /* renamed from: ru.rustore.sdk.review.RuStoreReviewManager$a */
    /* loaded from: classes8.dex */
    public static final class C11781a extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: a */
        public static final C11781a f11001a = new C11781a();

        public C11781a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public RuStoreReviewManager(Context applicationContext, Map<String, ? extends Object> map) {
        C11779C c11779c;
        Intrinsics.checkNotNullParameter(applicationContext, "context");
        this.f11000a = new C11805x(applicationContext);
        new C11779C.a();
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        synchronized (C11779C.a.class) {
            c11779c = C11779C.f10987h;
            if (c11779c == null) {
                c11779c = new C11779C(applicationContext, map);
                C11779C.f10987h = c11779c;
            }
        }
        C11787f c11787f = (C11787f) c11779c.f10990c.getValue();
        C11788g event = new C11788g((Map) c11787f.f11017c.getValue());
        C11793l c11793l = c11787f.f11015a;
        c11793l.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        SingleSubscribeKt.subscribe$default(SingleOnErrorReturnKt.onErrorReturn(SingleSubscribeOnKt.subscribeOn(SingleFlatMapKt.flatMap(Single.INSTANCE.from(new C11790i(c11793l, event)), new C11791j(c11793l)), Dispatchers.INSTANCE.getIo()), C11792k.f11024a), null, C11781a.f11001a, 1, null);
    }

    public final Task<Unit> launchReviewFlow(ReviewInfo reviewInfo) {
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        C11805x c11805x = this.f11000a;
        c11805x.getClass();
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        return C11784c.m7553a(SingleSubscribeOnKt.subscribeOn(SingleFlatMapKt.flatMap(Single.INSTANCE.create(new C11797p(c11805x, reviewInfo)), new C11803v(c11805x, reviewInfo)), Dispatchers.INSTANCE.getIo()));
    }

    public final Task<ReviewInfo> requestReviewFlow() {
        C11805x c11805x = this.f11000a;
        c11805x.getClass();
        return C11784c.m7553a(SingleSubscribeOnKt.subscribeOn(Single.INSTANCE.create(new C11801t(c11805x)), Dispatchers.INSTANCE.getIo()));
    }

    public /* synthetic */ RuStoreReviewManager(Context context, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : map);
    }
}
