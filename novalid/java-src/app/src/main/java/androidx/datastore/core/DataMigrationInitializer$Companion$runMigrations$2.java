package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataMigrationInitializer.kt */
@Metadata(m7104d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, m7105d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "startingData"}, m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m7120f = "DataMigrationInitializer.kt", m7121i = {0, 0}, m7122l = {44, 46}, m7123m = "invokeSuspend", m7124n = {"migration", "data"}, m7125s = {"L$2", "L$3"})
/* loaded from: classes2.dex */
public final class DataMigrationInitializer$Companion$runMigrations$2<T> extends SuspendLambda implements Function2<T, Continuation<? super T>, Object> {
    public final /* synthetic */ List<Function1<Continuation<? super Unit>, Object>> $cleanUps;
    public final /* synthetic */ List<DataMigration<T>> $migrations;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends DataMigration<T>> list, List<Function1<Continuation<? super Unit>, Object>> list2, Continuation<? super DataMigrationInitializer$Companion$runMigrations$2> continuation) {
        super(2, continuation);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, continuation);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((DataMigrationInitializer$Companion$runMigrations$2<T>) obj, (Continuation<? super DataMigrationInitializer$Companion$runMigrations$2<T>>) obj2);
    }

    @Nullable
    public final Object invoke(T t, @Nullable Continuation<? super T> continuation) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        List<Function1<Continuation<? super Unit>, Object>> list;
        Iterator<T> it;
        DataMigration dataMigration;
        Iterator<T> it2;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            obj = this.L$0;
            List<DataMigration<T>> list2 = this.$migrations;
            list = this.$cleanUps;
            it = list2.iterator();
        } else if (i == 1) {
            obj2 = this.L$3;
            DataMigration dataMigration2 = (DataMigration) this.L$2;
            it2 = (Iterator) this.L$1;
            List<Function1<Continuation<? super Unit>, Object>> list3 = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            dataMigration = dataMigration2;
            list = list3;
            if (((Boolean) obj).booleanValue()) {
                obj = obj2;
                it = it2;
            } else {
                list.add(new DataMigrationInitializer$Companion$runMigrations$2$1$1(dataMigration, null));
                this.L$0 = list;
                this.L$1 = it2;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                obj = dataMigration.migrate(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                it = it2;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            list = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!it.hasNext()) {
            DataMigration dataMigration3 = (DataMigration) it.next();
            this.L$0 = list;
            this.L$1 = it;
            this.L$2 = dataMigration3;
            this.L$3 = obj;
            this.label = 1;
            Object objShouldMigrate = dataMigration3.shouldMigrate(obj, this);
            if (objShouldMigrate == coroutine_suspended) {
                return coroutine_suspended;
            }
            Iterator<T> it3 = it;
            obj2 = obj;
            obj = objShouldMigrate;
            dataMigration = dataMigration3;
            it2 = it3;
            if (((Boolean) obj).booleanValue()) {
            }
            if (!it.hasNext()) {
                return obj;
            }
        }
    }
}
