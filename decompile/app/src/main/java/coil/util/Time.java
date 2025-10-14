package coil.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: Time.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m7105d2 = {"Lcoil/util/Time;", "", "()V", "provider", "Lkotlin/Function0;", "", "currentMillis", "reset", "", "setCurrentMillis", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class Time {

    @NotNull
    public static final Time INSTANCE = new Time();

    @NotNull
    public static Function0<Long> provider = Time$provider$1.INSTANCE;

    public final long currentMillis() {
        return provider.invoke().longValue();
    }

    public final void setCurrentMillis(final long currentMillis) {
        provider = new Function0<Long>() { // from class: coil.util.Time.setCurrentMillis.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Long invoke() {
                return Long.valueOf(currentMillis);
            }
        };
    }

    /* compiled from: Time.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: coil.util.Time$reset$1 */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C34221 extends FunctionReferenceImpl implements Function0<Long> {
        public static final C34221 INSTANCE = new C34221();

        public C34221() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public final void reset() {
        provider = C34221.INSTANCE;
    }
}
