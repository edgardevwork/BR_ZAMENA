package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BufferedChannel.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class BufferedChannel$onReceiveOrNull$1 extends FunctionReferenceImpl implements Function3<BufferedChannel<?>, SelectInstance<?>, Object, Unit> {
    public static final BufferedChannel$onReceiveOrNull$1 INSTANCE = new BufferedChannel$onReceiveOrNull$1();

    public BufferedChannel$onReceiveOrNull$1() {
        super(3, BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BufferedChannel<?> bufferedChannel, SelectInstance<?> selectInstance, Object obj) {
        invoke2(bufferedChannel, selectInstance, obj);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull BufferedChannel<?> bufferedChannel, @NotNull SelectInstance<?> selectInstance, @Nullable Object obj) {
        bufferedChannel.registerSelectForReceive(selectInstance, obj);
    }
}
