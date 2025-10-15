package androidx.lifecycle;

import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transformations.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001aB\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001c\u0010\u0005\u001a\u0018\u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u0007\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\u00070\u0006H\u0007\u001a8\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\tH\u0007\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012$\u0010\u0005\u001a \u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u0007\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u0001¢\u0006\u0002\b\u00070\u0006H\u0007\u001a>\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00010\tH\u0007¨\u0006\f"}, m7105d2 = {"distinctUntilChanged", "Landroidx/lifecycle/LiveData;", "X", "map", "Y", "transform", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "mapFunction", "Landroidx/arch/core/util/Function;", "switchMap", "switchMapFunction", "lifecycle-livedata_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@JvmName(name = "Transformations")
/* loaded from: classes2.dex */
public final class Transformations {
    @JvmName(name = "map")
    @NotNull
    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> map(@NotNull LiveData<X> liveData, @NotNull Function1<X, Y> transform) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(transform.invoke(liveData.getValue()));
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<X, Unit>() { // from class: androidx.lifecycle.Transformations.map.1
            public final /* synthetic */ MediatorLiveData<Y> $result;
            public final /* synthetic */ Function1<X, Y> $transform;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26481(MediatorLiveData<Y> mediatorLiveData2, Function1<X, Y> transform2) {
                super(1);
                mediatorLiveData = mediatorLiveData2;
                function1 = transform2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((C26481<X>) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(X x) {
                mediatorLiveData.setValue(function1.invoke(x));
            }
        }));
        return mediatorLiveData2;
    }

    /* compiled from: Transformations.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", "X", "Y", "x", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.lifecycle.Transformations$map$1 */
    /* loaded from: classes.dex */
    public static final class C26481<X> extends Lambda implements Function1<X, Unit> {
        public final /* synthetic */ MediatorLiveData<Y> $result;
        public final /* synthetic */ Function1<X, Y> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26481(MediatorLiveData<Y> mediatorLiveData2, Function1<X, Y> transform2) {
            super(1);
            mediatorLiveData = mediatorLiveData2;
            function1 = transform2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C26481<X>) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(X x) {
            mediatorLiveData.setValue(function1.invoke(x));
        }
    }

    /* compiled from: Transformations.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", "X", "Y", "x", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.lifecycle.Transformations$map$2 */
    /* loaded from: classes.dex */
    public static final class C26492 extends Lambda implements Function1<Object, Unit> {
        public final /* synthetic */ Function<Object, Object> $mapFunction;
        public final /* synthetic */ MediatorLiveData<Object> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26492(MediatorLiveData<Object> mediatorLiveData, Function<Object, Object> function) {
            super(1);
            mediatorLiveData = mediatorLiveData;
            function = function;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(Object obj) {
            mediatorLiveData.setValue(function.apply(obj));
        }
    }

    @JvmName(name = "map")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData map(LiveData liveData, Function mapFunction) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<Object, Unit>() { // from class: androidx.lifecycle.Transformations.map.2
            public final /* synthetic */ Function<Object, Object> $mapFunction;
            public final /* synthetic */ MediatorLiveData<Object> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26492(MediatorLiveData<Object> mediatorLiveData2, Function<Object, Object> mapFunction2) {
                super(1);
                mediatorLiveData = mediatorLiveData2;
                function = mapFunction2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(Object obj) {
                mediatorLiveData.setValue(function.apply(obj));
            }
        }));
        return mediatorLiveData2;
    }

    @JvmName(name = "switchMap")
    @NotNull
    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> switchMap(@NotNull LiveData<X> liveData, @NotNull Function1<X, LiveData<Y>> transform) {
        LiveData<Y> liveDataInvoke;
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (liveData.isInitialized() && (liveDataInvoke = transform.invoke(liveData.getValue())) != null && liveDataInvoke.isInitialized()) {
            mediatorLiveData.setValue(liveDataInvoke.getValue());
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<X, Unit>() { // from class: androidx.lifecycle.Transformations.switchMap.1
            public final /* synthetic */ Ref.ObjectRef<LiveData<Y>> $liveData;
            public final /* synthetic */ MediatorLiveData<Y> $result;
            public final /* synthetic */ Function1<X, LiveData<Y>> $transform;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26501(Function1<X, LiveData<Y>> transform2, Ref.ObjectRef<LiveData<Y>> objectRef2, MediatorLiveData<Y> mediatorLiveData2) {
                super(1);
                function1 = transform2;
                objectRef = objectRef2;
                mediatorLiveData = mediatorLiveData2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((C26501<X>) obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v2, types: [T, androidx.lifecycle.LiveData, java.lang.Object] */
            /* renamed from: invoke */
            public final void invoke2(X x) {
                ?? r4 = (LiveData) function1.invoke(x);
                T t = objectRef.element;
                if (t != r4) {
                    if (t != 0) {
                        MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                        Intrinsics.checkNotNull(t);
                        mediatorLiveData2.removeSource((LiveData) t);
                    }
                    objectRef.element = r4;
                    if (r4 != 0) {
                        MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                        Intrinsics.checkNotNull(r4);
                        mediatorLiveData3.addSource(r4, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<Y, Unit>() { // from class: androidx.lifecycle.Transformations.switchMap.1.1
                            public final /* synthetic */ MediatorLiveData<Y> $result;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(MediatorLiveData<Y> mediatorLiveData4) {
                                super(1);
                                mediatorLiveData = mediatorLiveData4;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                                invoke2((AnonymousClass1<Y>) obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke */
                            public final void invoke2(Y y) {
                                mediatorLiveData.setValue(y);
                            }
                        }));
                    }
                }
            }

            /* compiled from: Transformations.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0003H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", "X", "Y", "y", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* renamed from: androidx.lifecycle.Transformations$switchMap$1$1 */
            public static final class AnonymousClass1<Y> extends Lambda implements Function1<Y, Unit> {
                public final /* synthetic */ MediatorLiveData<Y> $result;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(MediatorLiveData<Y> mediatorLiveData4) {
                    super(1);
                    mediatorLiveData = mediatorLiveData4;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2((AnonymousClass1<Y>) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(Y y) {
                    mediatorLiveData.setValue(y);
                }
            }
        }));
        return mediatorLiveData2;
    }

    /* compiled from: Transformations.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "X", "Y", "value", "invoke", "(Ljava/lang/Object;)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.lifecycle.Transformations$switchMap$1 */
    /* loaded from: classes.dex */
    public static final class C26501<X> extends Lambda implements Function1<X, Unit> {
        public final /* synthetic */ Ref.ObjectRef<LiveData<Y>> $liveData;
        public final /* synthetic */ MediatorLiveData<Y> $result;
        public final /* synthetic */ Function1<X, LiveData<Y>> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26501(Function1<X, LiveData<Y>> transform2, Ref.ObjectRef<LiveData<Y>> objectRef2, MediatorLiveData<Y> mediatorLiveData2) {
            super(1);
            function1 = transform2;
            objectRef = objectRef2;
            mediatorLiveData = mediatorLiveData2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C26501<X>) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [T, androidx.lifecycle.LiveData, java.lang.Object] */
        /* renamed from: invoke */
        public final void invoke2(X x) {
            ?? r4 = (LiveData) function1.invoke(x);
            T t = objectRef.element;
            if (t != r4) {
                if (t != 0) {
                    MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                    Intrinsics.checkNotNull(t);
                    mediatorLiveData2.removeSource((LiveData) t);
                }
                objectRef.element = r4;
                if (r4 != 0) {
                    MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                    Intrinsics.checkNotNull(r4);
                    mediatorLiveData3.addSource(r4, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<Y, Unit>() { // from class: androidx.lifecycle.Transformations.switchMap.1.1
                        public final /* synthetic */ MediatorLiveData<Y> $result;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(MediatorLiveData<Y> mediatorLiveData4) {
                            super(1);
                            mediatorLiveData = mediatorLiveData4;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                            invoke2((AnonymousClass1<Y>) obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2(Y y) {
                            mediatorLiveData.setValue(y);
                        }
                    }));
                }
            }
        }

        /* compiled from: Transformations.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0003H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", "X", "Y", "y", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.lifecycle.Transformations$switchMap$1$1 */
        public static final class AnonymousClass1<Y> extends Lambda implements Function1<Y, Unit> {
            public final /* synthetic */ MediatorLiveData<Y> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MediatorLiveData<Y> mediatorLiveData4) {
                super(1);
                mediatorLiveData = mediatorLiveData4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((AnonymousClass1<Y>) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(Y y) {
                mediatorLiveData.setValue(y);
            }
        }
    }

    /* compiled from: Transformations.kt */
    @Metadata(m7104d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m7105d2 = {"androidx/lifecycle/Transformations$switchMap$2", "Landroidx/lifecycle/Observer;", "liveData", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "setLiveData", "(Landroidx/lifecycle/LiveData;)V", "onChanged", "", "value", "(Ljava/lang/Object;)V", "lifecycle-livedata_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.lifecycle.Transformations$switchMap$2 */
    /* loaded from: classes.dex */
    public static final class C26512 implements Observer<Object> {
        public final /* synthetic */ MediatorLiveData<Object> $result;
        public final /* synthetic */ Function<Object, LiveData<Object>> $switchMapFunction;

        @Nullable
        public LiveData<Object> liveData;

        public C26512(Function<Object, LiveData<Object>> function, MediatorLiveData<Object> mediatorLiveData) {
            function = function;
            mediatorLiveData = mediatorLiveData;
        }

        @Nullable
        public final LiveData<Object> getLiveData() {
            return this.liveData;
        }

        public final void setLiveData(@Nullable LiveData<Object> liveData) {
            this.liveData = liveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object value) {
            LiveData<Object> liveDataApply = function.apply(value);
            LiveData<Object> liveData = this.liveData;
            if (liveData == liveDataApply) {
                return;
            }
            if (liveData != null) {
                MediatorLiveData<Object> mediatorLiveData = mediatorLiveData;
                Intrinsics.checkNotNull(liveData);
                mediatorLiveData.removeSource(liveData);
            }
            this.liveData = liveDataApply;
            if (liveDataApply != null) {
                MediatorLiveData<Object> mediatorLiveData2 = mediatorLiveData;
                Intrinsics.checkNotNull(liveDataApply);
                final MediatorLiveData<Object> mediatorLiveData3 = mediatorLiveData;
                mediatorLiveData2.addSource(liveDataApply, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<Object, Unit>() { // from class: androidx.lifecycle.Transformations$switchMap$2$onChanged$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                        invoke2(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object obj) {
                        mediatorLiveData3.setValue(obj);
                    }
                }));
            }
        }
    }

    @JvmName(name = "switchMap")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, Function switchMapFunction) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(switchMapFunction, "switchMapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<Object>() { // from class: androidx.lifecycle.Transformations.switchMap.2
            public final /* synthetic */ MediatorLiveData<Object> $result;
            public final /* synthetic */ Function<Object, LiveData<Object>> $switchMapFunction;

            @Nullable
            public LiveData<Object> liveData;

            public C26512(Function<Object, LiveData<Object>> switchMapFunction2, MediatorLiveData<Object> mediatorLiveData2) {
                function = switchMapFunction2;
                mediatorLiveData = mediatorLiveData2;
            }

            @Nullable
            public final LiveData<Object> getLiveData() {
                return this.liveData;
            }

            public final void setLiveData(@Nullable LiveData<Object> liveData2) {
                this.liveData = liveData2;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Object value) {
                LiveData<Object> liveDataApply = function.apply(value);
                LiveData<Object> liveData2 = this.liveData;
                if (liveData2 == liveDataApply) {
                    return;
                }
                if (liveData2 != null) {
                    MediatorLiveData<Object> mediatorLiveData2 = mediatorLiveData;
                    Intrinsics.checkNotNull(liveData2);
                    mediatorLiveData2.removeSource(liveData2);
                }
                this.liveData = liveDataApply;
                if (liveDataApply != null) {
                    MediatorLiveData<Object> mediatorLiveData22 = mediatorLiveData;
                    Intrinsics.checkNotNull(liveDataApply);
                    final MediatorLiveData<Object> mediatorLiveData3 = mediatorLiveData;
                    mediatorLiveData22.addSource(liveDataApply, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<Object, Unit>() { // from class: androidx.lifecycle.Transformations$switchMap$2$onChanged$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                            invoke2(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Object obj) {
                            mediatorLiveData3.setValue(obj);
                        }
                    }));
                }
            }
        });
        return mediatorLiveData2;
    }

    @JvmName(name = "distinctUntilChanged")
    @NotNull
    @CheckResult
    @MainThread
    public static final <X> LiveData<X> distinctUntilChanged(@NotNull LiveData<X> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(liveData.getValue());
            booleanRef.element = false;
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1<X, Unit>() { // from class: androidx.lifecycle.Transformations.distinctUntilChanged.1
            public final /* synthetic */ Ref.BooleanRef $firstTime;
            public final /* synthetic */ MediatorLiveData<X> $outputLiveData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26471(MediatorLiveData<X> mediatorLiveData2, Ref.BooleanRef booleanRef2) {
                super(1);
                mediatorLiveData = mediatorLiveData2;
                booleanRef = booleanRef2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((C26471<X>) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(X x) {
                X value = mediatorLiveData.getValue();
                if (booleanRef.element || ((value == null && x != null) || !(value == null || Intrinsics.areEqual(value, x)))) {
                    booleanRef.element = false;
                    mediatorLiveData.setValue(x);
                }
            }
        }));
        return mediatorLiveData2;
    }

    /* compiled from: Transformations.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "X", "value", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.lifecycle.Transformations$distinctUntilChanged$1 */
    /* loaded from: classes.dex */
    public static final class C26471<X> extends Lambda implements Function1<X, Unit> {
        public final /* synthetic */ Ref.BooleanRef $firstTime;
        public final /* synthetic */ MediatorLiveData<X> $outputLiveData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26471(MediatorLiveData<X> mediatorLiveData2, Ref.BooleanRef booleanRef2) {
            super(1);
            mediatorLiveData = mediatorLiveData2;
            booleanRef = booleanRef2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C26471<X>) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(X x) {
            X value = mediatorLiveData.getValue();
            if (booleanRef.element || ((value == null && x != null) || !(value == null || Intrinsics.areEqual(value, x)))) {
                booleanRef.element = false;
                mediatorLiveData.setValue(x);
            }
        }
    }
}
