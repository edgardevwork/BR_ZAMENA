package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Preferences.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m7105d2 = {"edit", "Landroidx/datastore/preferences/core/Preferences;", "Landroidx/datastore/core/DataStore;", "transform", "Lkotlin/Function2;", "Landroidx/datastore/preferences/core/MutablePreferences;", "Lkotlin/coroutines/Continuation;", "", "", "(Landroidx/datastore/core/DataStore;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-preferences-core"}, m7106k = 2, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes.dex */
public final class PreferencesKt {

    /* compiled from: Preferences.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "it"}, m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m7120f = "Preferences.kt", m7121i = {}, m7122l = {329}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.datastore.preferences.core.PreferencesKt$edit$2 */
    /* loaded from: classes4.dex */
    public static final class C24322 extends SuspendLambda implements Function2<Preferences, Continuation<? super Preferences>, Object> {
        public final /* synthetic */ Function2<MutablePreferences, Continuation<? super Unit>, Object> $transform;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24322(Function2<? super MutablePreferences, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C24322> continuation) {
            super(2, continuation);
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C24322 c24322 = new C24322(this.$transform, continuation);
            c24322.L$0 = obj;
            return c24322;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull Preferences preferences, @Nullable Continuation<? super Preferences> continuation) {
            return ((C24322) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                ResultKt.throwOnFailure(obj);
                return mutablePreferences;
            }
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences2 = ((Preferences) this.L$0).toMutablePreferences();
            Function2<MutablePreferences, Continuation<? super Unit>, Object> function2 = this.$transform;
            this.L$0 = mutablePreferences2;
            this.label = 1;
            return function2.invoke(mutablePreferences2, this) == coroutine_suspended ? coroutine_suspended : mutablePreferences2;
        }
    }

    @Nullable
    public static final Object edit(@NotNull DataStore<Preferences> dataStore, @NotNull Function2<? super MutablePreferences, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Preferences> continuation) {
        return dataStore.updateData(new C24322(function2, null), continuation);
    }
}
