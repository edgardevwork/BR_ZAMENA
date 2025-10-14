package ru.rustore.sdk.billingclient.usecase;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.billingclient.impl.C11418c;
import ru.rustore.sdk.billingclient.model.user.UserAuthorizationStatus;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.core.tasks.TaskHelper;

@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, m7105d2 = {"Lru/rustore/sdk/billingclient/usecase/UserInfoUseCase;", "", "Lru/rustore/sdk/billingclient/impl/c;", "controller", SegmentConstantPool.INITSTRING, "(Lru/rustore/sdk/billingclient/impl/c;)V", "Lru/rustore/sdk/core/tasks/Task;", "Lru/rustore/sdk/billingclient/model/user/UserAuthorizationStatus;", "getAuthorizationStatus", "()Lru/rustore/sdk/core/tasks/Task;", "Lru/rustore/sdk/billingclient/impl/c;", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* loaded from: classes7.dex */
public final class UserInfoUseCase {
    public final C11418c controller;

    @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Lru/rustore/sdk/billingclient/model/user/UserAuthorizationStatus;"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.usecase.UserInfoUseCase$getAuthorizationStatus$1", m7120f = "UserInfoUseCase.kt", m7121i = {}, m7122l = {13}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.usecase.UserInfoUseCase$getAuthorizationStatus$1 */
    /* loaded from: classes8.dex */
    public static final class C115641 extends SuspendLambda implements Function1<Continuation<? super UserAuthorizationStatus>, Object> {
        public int label;

        public C115641(Continuation<? super C115641> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return UserInfoUseCase.this.new C115641(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C11418c c11418c = UserInfoUseCase.this.controller;
                this.label = 1;
                obj = c11418c.m7441a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super UserAuthorizationStatus> continuation) {
            return ((C115641) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public UserInfoUseCase(C11418c controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
    }

    public final Task<UserAuthorizationStatus> getAuthorizationStatus() {
        return TaskHelper.wrap$default(TaskHelper.INSTANCE, null, new C115641(null), 1, null);
    }
}
